import hudson.model.*

jobsToDelete = "${jobs_to_delete_list}"

deleteJobs(Hudson.instance.items)

def deleteJobs(items) {
  items.each { item ->
    if (item.class.canonicalName != 'com.cloudbees.hudson.plugins.folder.Folder') {
      if (jobsToDelete.contains(item.fullName)) {
        println(item.fullName)
        item.delete()
      }
    } else {
    deleteJobs(((com.cloudbees.hudson.plugins.folder.Folder) item).getItems())
    }
  }
} 
println "Deleted the ${jobs_to_delete_list} job/jobs"

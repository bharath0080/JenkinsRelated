* Command to update version in `pacakge.json` for `nodejs` projects:
  
    `sed -ie 's|\(.*"version"\): "\(.*\)",.*|\1: '"\"0.0.$BUILD_NUMBER-sprint-12\",|" package.json`

  The above example replaces current version in `package.json` to `0.0.1-sprint-12` if the `BUILD_NUMBER` is 1.

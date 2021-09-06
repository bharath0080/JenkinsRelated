$a = cat "GlobalAssemblyInfo.cs" | select-string AssemblyVersion 
$NewVersion = '[assembly: AssemblyVersion("1.4.10.331")]'
(Get-Content "GlobalAssemblyInfo.cs") -replace $a,$NewVersion | Set-Content "GlobalAssemblyInfo.cs"

(Get-Content "GlobalAssemblyInfo.cs").replace("$a", "$NewVersion") | Set-Content "GlobalAssemblyInfo.cs"

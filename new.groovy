env.release='15.7.0'
env.ci_build_type='ora'
env.clarity_version='15.7.0'
env.cibuildnumber="${clarity_version}.${env.BUILD_NUMBER}"

env.base_files_path_root='C:\\ca\\clarity\\trunk-smoke\\tools\\master-ant-imports\\devops\\ci\\'
env.build_dir='C:\\ca\\clarity\\trunk-smoke'

env.GIT_BRANCH1='CI_Jenkinsfile_Stable'
env.GIT_URL='https://github.gwd.broadcom.net/ESD/PPM.git'
env.GIT_CREDENTIALS='c7c7f569-8b3d-46dc-9789-cfcf9121847e'
env.GIT_excludedRegions='tools/master-ant-imports/devops/.*'
env.GIT_RELATIVE_TARGET_DIR='C:\\ca\\clarity\\trunk-smoke'

env.stuffToCheck="BUILD FAILED,At least one module failed at least one test,ERROR: Upgrade failed for tenant,Please review the upgrade logs for details"
env.stuffToCheck_success='BUILD SUCCESSFUL'

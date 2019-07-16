env.release=15.7.0
env.ci_build_type=ora
env.clarity_version=15.7.0

env.build_dir=/tmp/jenkins_ca
env.base_files_path_root=${LINUX_BUILD_DIR}/tools/master-ant-imports/devops/ci

env.cibuildnumber="${clarity_version}.${env.BUILD_NUMBER}"
env.GIT_BRANCH=CI_Jenkinsfile_Stable
env.GIT_URL=https://github.gwd.broadcom.net/ESD/PPM.git
env.GIT_CREDENTIALS=c7c7f569-8b3d-46dc-9789-cfcf9121847e
env.GIT_excludedRegions=tools/master-ant-imports/devops/.*
env.GIT_RELATIVE_TARGET_DIR=/tmp/jenkins_ca

StuffToCheck_failed="BUILD FAILED,At least one module failed at least one test,ERROR: Upgrade failed for tenant,Please review the upgrade logs for details"
StuffToCheck_successfull=BUILD SUCCESSFUL

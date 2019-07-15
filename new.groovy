def set_environment_variables(){
//read from properties file
//def rootDir = pwd()
def props = readProperties interpolate: true, file:"variables.properties"

env.clarity_version="${props["WINDOWS_CLARITY_VERSION"]}"
echo "${env.clarity_version}"
}

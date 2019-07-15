def set_environment_variables(OS){
//read from properties file
//def rootDir = pwd()
def props = readProperties interpolate: true, file:"variables.properties"

env.clarity_version="${props["${OS}_CLARITY_VERSION"]}"
echo "${env.clarity_version}"
}

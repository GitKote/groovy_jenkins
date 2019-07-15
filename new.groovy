def set_environment_variables(OS){
//read from properties file

def props = readProperties interpolate: true, file:"variables.properties"

env.clarity_version="${props["${OS}_CLARITY_VERSION"]}"

}

def OS='WINDOWS'
set_environment_variables(OS)
echo "${env.clarity_version}"

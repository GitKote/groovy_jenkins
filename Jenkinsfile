node {
def OS='WINDOWS'
def rootDir = pwd()
//def example = load "${rootDir}@script/new.groovy"
def value=set_environment_variables(OS)
  echo "${value}"
}

def set_environment_variables(OS){
//read from properties file
def rootDir = pwd(OS)
def props = readProperties interpolate: true, file:"${rootDir}@script/variables.properties"
env.clarity_version="${props["${OS}_CLARITY_VERSION"]}"
return "${env.clarity_version}"
}

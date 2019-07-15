node {
def OS='WINDOWS'
def rootDir = pwd()
//def example = load "${rootDir}@script/new.groovy"
def value=set_environment_variables()
  echo "{value}"
}

def set_environment_variables(){
//read from properties file
//def rootDir = pwd()
def props = readProperties interpolate: true, file:"variables.properties"

env.clarity_version="${props['WINDOWS_CLARITY_VERSION']}"
return "${env.clarity_version}"
}

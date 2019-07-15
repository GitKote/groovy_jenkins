node {
def OS='WINDOWS'
def rootDir = pwd()
//def example = load "${rootDir}@script/new.groovy"
set_environment_variables()
echo "${env.clarity_version}"
}

def set_environment_variables(){
//read from properties file
//def rootDir = pwd()
def props = readProperties interpolate: true, file:"variables.properties"

env.clarity_version="${props['WINDOWS_CLARITY_VERSION']}"

}

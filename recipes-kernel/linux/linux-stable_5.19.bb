require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.19.y"

SRCREV_machine ?= "3d7cb6b04c3f3115719235cc6866b10326de34cd"
SRCREV_meta ?= "529063d2c4b5a9ff86f1b6a9bb28b6c3886c6074"

# FIXME: so far no kmeta-5.19
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19.0"

require linux-stable.inc

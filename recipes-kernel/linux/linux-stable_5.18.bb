require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.18.y"

SRCREV_machine ?= "22a992953741ad79c07890d3f4104585e52ef26b"
SRCREV_meta ?= "3d907a68691a9988cc810a4674ce764229596678"

# FIXME: so far no kmeta-5.18
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.18.19"

require linux-stable.inc

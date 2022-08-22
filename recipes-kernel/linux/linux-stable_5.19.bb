require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.19.y"

SRCREV_machine ?= "bf44eed7f2fc9af74eb72f4bc415bdd3d11c4bed"
SRCREV_meta ?= "3d907a68691a9988cc810a4674ce764229596678"

# FIXME: so far no kmeta-5.19
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19.3"

require linux-stable.inc

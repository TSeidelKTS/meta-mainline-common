require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.19.y"

SRCREV_machine ?= "d654f7e29909ce602942a1cd927d56d5aa397ed8"
SRCREV_meta ?= "423df1333e1e2a0c2bff9b29d40d16d74b775a79"

# FIXME: so far no kmeta-5.19
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19.1"

require linux-stable.inc

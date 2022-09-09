require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH ?= "linux-5.19.y"

SRCREV_machine ?= "70cb6afe0e2ff1b7854d840978b1849bffb3ed21"
SRCREV_meta ?= "7da33b6ea9d11403e9046e471d63f7ac2ce2bc8f"

# FIXME: so far no kmeta-5.19
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.19.8"

require linux-stable.inc

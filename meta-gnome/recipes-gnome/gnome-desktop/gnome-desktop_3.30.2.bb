SUMMARY = "GNOME library which provides API shared by several components and applications"
SECTION = "x11/gnome"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2"

inherit gnome pkgconfig upstream-version-is-even gobject-introspection gettext

SRC_URI[archive.md5sum] = "afcee5e8506bcdc1daaac9e6c3682685"
SRC_URI[archive.sha256sum] = "5475e693cb7ada801a36e8d16bc0dbb58930b793f455419b205cd9241d63d14c"

DEPENDS += "intltool-native gsettings-desktop-schemas gconf virtual/libx11 gtk+3 glib-2.0 startup-notification xkeyboard-config iso-codes udev libseccomp gnome-common-native autoconf-archive-native"

inherit gtk-doc

ACLOCALDIR = "${STAGING_DATADIR_NATIVE}/aclocal"

EXTRA_OECONF = "--disable-desktop-docs --with-gnome-distributor=Subgraph --enable-introspection=yes"

PACKAGES =+ "libgnome-desktop"
FILES_libgnome-desktop = "${libdir}/lib*${SOLIBS} ${datadir}/libgnome-desktop*/pnp.ids ${datadir}/gnome/*xml"

RRECOMMENDS_libgnome-desktop += "gsettings-desktop-schemas"



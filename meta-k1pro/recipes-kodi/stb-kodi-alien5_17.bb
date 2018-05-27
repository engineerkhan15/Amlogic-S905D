require recipes-mediacenter/kodi/stb-kodi_${PV}.bb

PROVIDES += "virtual/kodi"
RPROVIDES_${PN} += "virtual/kodi"
PROVIDES += "kodi"
RPROVIDES_${PN} += "kodi"
DEPENDS_append = " linkdroid-libamadec-${MACHINE} linkdroid-libamcodec-${MACHINE} linkdroid-libamavutils-${MACHINE}"

EXTRA_OECONF += " \
    --with-platform=aml-aarch64 \
    --with-ffmpeg=stb\
"
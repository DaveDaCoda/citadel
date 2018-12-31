include citadel-tools.inc

SRC_URI += " \
crate://crates.io/ansi_term/0.11.0 \
crate://crates.io/atty/0.2.8 \
crate://crates.io/backtrace-sys/0.1.16 \
crate://crates.io/backtrace/0.3.5 \
crate://crates.io/bitflags/1.0.1 \
crate://crates.io/cc/1.0.6 \
crate://crates.io/cfg-if/0.1.2 \
crate://crates.io/clap/2.31.1 \
crate://crates.io/failure/0.1.1 \
crate://crates.io/failure_derive/0.1.1 \
crate://crates.io/libc/0.2.39 \
crate://crates.io/proc-macro2/0.2.3 \
crate://crates.io/quote/0.3.15 \
crate://crates.io/quote/0.4.2 \
crate://crates.io/redox_syscall/0.1.37 \
crate://crates.io/redox_termios/0.1.1 \
crate://crates.io/rustc-demangle/0.1.7 \
crate://crates.io/same-file/1.0.2 \
crate://crates.io/serde/1.0.30 \
crate://crates.io/serde_derive/1.0.30 \
crate://crates.io/serde_derive_internals/0.20.0 \
crate://crates.io/strsim/0.7.0 \
crate://crates.io/syn/0.11.11 \
crate://crates.io/syn/0.12.14 \
crate://crates.io/synom/0.11.3 \
crate://crates.io/synstructure/0.6.1 \
crate://crates.io/termcolor/0.3.5 \
crate://crates.io/termion/1.5.1 \
crate://crates.io/textwrap/0.9.0 \
crate://crates.io/toml/0.4.5 \
crate://crates.io/unicode-width/0.1.4 \
crate://crates.io/unicode-xid/0.0.4 \
crate://crates.io/unicode-xid/0.1.0 \
crate://crates.io/vec_map/0.8.0 \
crate://crates.io/walkdir/2.1.4 \
crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi/0.3.4 \
crate://crates.io/wincolor/0.1.6 \
"

inherit cargo

do_install() {
    install -d ${D}${bindir}
    install -m 755 -T ${B}/target/${CARGO_TARGET_SUBDIR}/citadel-realms ${D}${bindir}/realms
}


package p000;

import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: cihx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cihx implements ciib {

    /* renamed from: a */
    public static final Logger f190384a = Logger.getLogger(cihu.class.getName());

    /* renamed from: b */
    public static final cipx f190385b = cipx.m150785a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: a */
    public static int m150357a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw m150360b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static IOException m150360b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: a */
    public static int m150358a(cipw cipw) {
        return (cipw.mo86305e() & 255) | ((cipw.mo86305e() & 255) << 16) | ((cipw.mo86305e() & 255) << 8);
    }

    /* renamed from: b */
    public final cihn mo86129b(cipw cipw) {
        return new cihv(cipw);
    }

    /* renamed from: a */
    public static IllegalArgumentException m150359a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}

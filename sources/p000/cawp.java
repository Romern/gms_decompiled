package p000;

import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: cawp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cawp implements caxb {

    /* renamed from: a */
    public static final Logger f176276a = Logger.getLogger(cawm.class.getName());

    /* renamed from: b */
    public static final cipx f176277b = cipx.m150785a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: a */
    public static int m127424a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw m127427b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static IOException m127427b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: a */
    public static int m127425a(cipw cipw) {
        return (cipw.mo86305e() & 255) | ((cipw.mo86305e() & 255) << 16) | ((cipw.mo86305e() & 255) << 8);
    }

    /* renamed from: a */
    public static IllegalArgumentException m127426a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: a */
    public final cavn mo75027a(cipw cipw, boolean z) {
        return new cawn(cipw, z);
    }

    /* renamed from: a */
    public final cavo mo75028a(cipv cipv, boolean z) {
        return new cawo(cipv, z);
    }
}

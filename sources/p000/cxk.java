package p000;

/* renamed from: cxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxk {

    /* renamed from: a */
    public static final cwe f12375a = new cxi();

    /* renamed from: b */
    public static final cwe f12376b = new cxj();

    /* renamed from: a */
    public static void m7831a(cyq cyq, cuz cuz) {
        cyq.f12405h.mo8356a(cuz, cyq.f12399b.f12408a, 1, 255);
    }

    /* renamed from: a */
    public static void m7832a(cyq cyq, cuz cuz, int i, cwm cwm, Long l, Long l2) {
        cwf cwf = cyq.f12405h;
        cyx cyx = cyq.f12399b.f12408a;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        if (!cwm.mo8361a(i, (byte) 0, (byte) -64)) {
            if (cwm.mo8361a(i, (byte) 64, (byte) -64)) {
                longValue = longValue2;
            } else if (cwm.mo8361a(i, Byte.MIN_VALUE, (byte) -64)) {
                longValue += longValue2;
            } else {
                throw new cvl("unknown C&A update management pattern", cuu.UNKNOWN_ERROR_RESPONSE);
            }
        }
        cwf.mo8356a(cuz, cyx, longValue, 999999999999L);
    }

    /* renamed from: a */
    public static boolean m7833a(cwm cwm, byte b) {
        return cwm.mo8361a(3, b, (byte) -32);
    }
}

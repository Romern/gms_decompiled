package p000;

/* renamed from: bgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgi extends bga {
    /* renamed from: a */
    public final bfr mo3097a(bfz bfz) {
        String str;
        bfr bfr = new bfr();
        try {
            if (bgd.m2926c() == 4) {
                throw new bfq((short) 27014);
            } else if (bgd.m2926c() == 5) {
                throw new bfq((short) 27013);
            } else if (((Short) bes.m2844a("TR_APP_STATE")).shortValue() == 13141 || ((Short) bes.m2844a("TR_APP_STATE")).shortValue() == -23174) {
                throw new bfq((short) 27013);
            } else if (((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue() != 66) {
                throw new bfq((short) 27013);
            } else if (bfz.f3147c != -97 || bfz.f3148d != 54) {
                throw new bfq((short) 27270);
            } else if (bfz.f3151g == 2) {
                bhw bhw = (bhw) bes.m2844a("TR_NFC_LUPC_OBJ");
                if (bhw == null) {
                    str = beu.m2848a("RUNNING_ATC");
                } else {
                    str = bhw.f3253b;
                }
                String valueOf = String.valueOf(str);
                bfr.f3126a = bgx.m3011a(valueOf.length() == 0 ? new String("9F3602") : "9F3602".concat(valueOf));
                return bfr;
            } else {
                throw new bfq((short) 26368);
            }
        } catch (bfq e) {
            short s = e.f3125b;
            if (s == 0) {
                bfr.f3127b = 28416;
            } else {
                bfr.f3127b = s;
            }
        }
    }
}

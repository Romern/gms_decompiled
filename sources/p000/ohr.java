package p000;

/* renamed from: ohr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohr {
    /* renamed from: a */
    public static obe m28776a(oer oer) {
        oer oer2 = oer.UNKNOWN;
        int ordinal = oer.ordinal();
        if (ordinal == 1) {
            if (obc.f37119a == null) {
                obc.f37119a = new obc();
            }
            return obc.f37119a;
        } else if (ordinal == 2) {
            if (obi.f37125a == null) {
                obi.f37125a = new obi();
            }
            return obi.f37125a;
        } else if (ordinal == 3) {
            return obb.m28335a(oer.AUDIO_SINK_GUIDANCE);
        } else {
            if (ordinal == 5) {
                return obb.m28335a(oer.AUDIO_SINK_MEDIA);
            }
            if (ordinal == 7) {
                if (obh.f37124a == null) {
                    obh.f37124a = new obh();
                }
                return obh.f37124a;
            } else if (ordinal != 8) {
                if (obd.f37120a == null) {
                    obd.f37120a = new obd(oer);
                }
                return obd.f37120a;
            } else {
                if (obf.f37122a == null) {
                    obf.f37122a = new obf();
                }
                return obf.f37122a;
            }
        }
    }
}

package p000;

/* renamed from: baqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqz {
    /* renamed from: a */
    public static bpxz m87422a(bygz bygz) {
        byhn byhn;
        bygy bygy = bygy.TRIVIAL_BIGTABLE;
        int ordinal = bygy.m124802a(bygz.f166412a).ordinal();
        if (ordinal == 0) {
            return bpxz.f139810c;
        }
        if (ordinal == 1) {
            if (bygz.f166412a == 2) {
                byhn = (byhn) bygz.f166413b;
            } else {
                byhn = byhn.f166478e;
            }
            bxvd da = bpxz.f139810c.mo74144da();
            bxvd da2 = bpyb.f139818e.mo74144da();
            int i = byhn.f166482c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpyb bpyb = (bpyb) da2.f164949b;
            int i2 = 2 | bpyb.f139820a;
            bpyb.f139820a = i2;
            bpyb.f139822c = i;
            int i3 = byhn.f166481b;
            bpyb.f139820a = i2 | 1;
            bpyb.f139821b = i3;
            byhm a = byhm.m124816a(byhn.f166483d);
            if (a == null) {
                a = byhm.UNKNOWN;
            }
            int i4 = a.f166477e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpyb bpyb2 = (bpyb) da2.f164949b;
            bpyb2.f139820a |= 4;
            bpyb2.f139823d = i4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxz bpxz = (bpxz) da.f164949b;
            bpyb bpyb3 = (bpyb) da2.mo74062i();
            bpyb3.getClass();
            bpxz.f139813b = bpyb3;
            bpxz.f139812a = 1;
            return (bpxz) da.mo74062i();
        } else if (ordinal == 2) {
            bxvd da3 = bpxz.f139810c.mo74144da();
            bpyf bpyf = bpyf.f139835a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpxz bpxz2 = (bpxz) da3.f164949b;
            bpyf.getClass();
            bpxz2.f139813b = bpyf;
            bpxz2.f139812a = 2;
            return (bpxz) da3.mo74062i();
        } else if (ordinal != 3) {
            return bpxz.f139810c;
        } else {
            return bpxz.f139810c;
        }
    }
}

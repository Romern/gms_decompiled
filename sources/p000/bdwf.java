package p000;

import java.util.Map;

/* renamed from: bdwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdwf {

    /* renamed from: a */
    private final bxps f106521a;

    private bdwf(int i) {
        bxps bxps = (bxps) bxpv.f164314i.mo74144da();
        this.f106521a = bxps;
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv = (bxpv) bxps.f164949b;
        bxpv.f164317b = i - 1;
        bxpv.f164316a |= 1;
    }

    /* renamed from: a */
    public static bdwf m91508a(int i) {
        return new bdwf(i);
    }

    /* renamed from: a */
    public static bdwf m91509a(chuw chuw) {
        bdwf bdwf = new bdwf(4);
        bxps bxps = bdwf.f106521a;
        int i = chuw.f189236a.f189233s.f189211r;
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv = (bxpv) bxps.f164949b;
        bxpv bxpv2 = bxpv.f164314i;
        bxpv.f164316a |= 32;
        bxpv.f164323h = i;
        return bdwf;
    }

    /* renamed from: a */
    public static bdwf m91510a(chux chux) {
        bdwf bdwf = new bdwf(4);
        bxps bxps = bdwf.f106521a;
        int i = chux.f189238a.f189233s.f189211r;
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv = (bxpv) bxps.f164949b;
        bxpv bxpv2 = bxpv.f164314i;
        bxpv.f164316a |= 32;
        bxpv.f164323h = i;
        return bdwf;
    }

    /* renamed from: a */
    public final bxpv mo58401a() {
        return (bxpv) this.f106521a.mo74062i();
    }

    /* renamed from: a */
    public final void mo58402a(bbnq bbnq, bmxj bmxj) {
        bxps bxps = this.f106521a;
        long b = bbnq.mo56213b();
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv = (bxpv) bxps.f164949b;
        bxpv bxpv2 = bxpv.f164314i;
        bxpv.f164316a |= 2;
        bxpv.f164319d = b;
        long c = bbnq.mo56214c();
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv3 = (bxpv) bxps.f164949b;
        bxpv3.f164316a |= 4;
        bxpv3.f164320e = c;
        long d = bbnq.mo56215d();
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv4 = (bxpv) bxps.f164949b;
        bxpv4.f164316a |= 8;
        bxpv4.f164321f = d;
        bnrd a = bbnq.mo56212a().entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            bxps bxps2 = this.f106521a;
            bxvd da = bxpu.f164309d.mo74144da();
            bxqc bxqc = (bxqc) bmxj.apply((Enum) entry.getKey());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpu bxpu = (bxpu) da.f164949b;
            bxpu.f164312b = bxqc.f164366l;
            bxpu.f164311a |= 1;
            long longValue = ((Long) entry.getValue()).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpu bxpu2 = (bxpu) da.f164949b;
            bxpu2.f164311a |= 2;
            bxpu2.f164313c = longValue;
            bxps2.mo73600a(da);
        }
    }

    /* renamed from: a */
    public final void mo58403a(boolean z) {
        bxps bxps = this.f106521a;
        if (bxps.f164950c) {
            bxps.mo74035c();
            bxps.f164950c = false;
        }
        bxpv bxpv = (bxpv) bxps.f164949b;
        bxpv bxpv2 = bxpv.f164314i;
        bxpv.f164316a |= 16;
        bxpv.f164322g = z;
    }
}

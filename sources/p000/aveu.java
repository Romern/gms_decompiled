package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aveu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aveu {

    /* renamed from: a */
    public static final String f93037a = cagl.FPOP_CLIENT.name();

    /* renamed from: b */
    public final bmzi f93038b;

    /* renamed from: c */
    public final bmzi f93039c;

    /* renamed from: d */
    public final bbis f93040d;

    public aveu(bmzi bmzi, bbis bbis, bmzi bmzi2) {
        this.f93038b = bmzn.m108681a(bmzi);
        this.f93040d = bbis;
        this.f93039c = bmzi2;
    }

    /* renamed from: a */
    public final void mo51186a(bxpr bxpr) {
        long longValue = ((Long) this.f93039c.mo6606a()).longValue();
        if (this.f93040d.mo35048a(longValue)) {
            qws qws = (qws) this.f93038b.mo6606a();
            bxvd da = bxpw.f164324h.mo74144da();
            int i = (int) longValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw = (bxpw) da.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i;
            bxot bxot = bxot.f164207c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da.f164949b;
            bxot.getClass();
            bxpw2.f164328c = bxot;
            bxpw2.f164327b = 3;
            bxvd da2 = bxpp.f164297d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpp bxpp = (bxpp) da2.f164949b;
            "com.google.android.gms#udc-facs".getClass();
            bxpp.f164299a |= 1;
            bxpp.f164300b = "com.google.android.gms#udc-facs";
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da.f164949b;
            bxpp bxpp2 = (bxpp) da2.mo74062i();
            bxpp2.getClass();
            bxpw3.f164330e = bxpp2;
            bxpw3.f164326a |= 128;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw4 = (bxpw) da.f164949b;
            bxpr.getClass();
            bxpw4.f164331f = bxpr;
            bxpw4.f164326a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qwo a = qws.mo24333a(da.mo74062i());
            a.mo24328b(1000);
            a.mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo51187a(bxpv bxpv, boolean z, boolean z2, boolean z3) {
        long longValue = ((Long) this.f93039c.mo6606a()).longValue();
        bxvd bxvd = (bxvd) bxpv.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bxpv);
        bxps bxps = (bxps) bxvd;
        if (z) {
            bxvd da = bxpu.f164309d.mo74144da();
            bxqc bxqc = bxqc.FORCED_SYNC;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpu bxpu = (bxpu) da.f164949b;
            bxpu.f164312b = bxqc.f164366l;
            bxpu.f164311a |= 1;
            bxps.mo73600a(da);
        }
        if (z2) {
            bxvd da2 = bxpu.f164309d.mo74144da();
            bxqc bxqc2 = bxqc.PERIODIC_SYNC;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpu bxpu2 = (bxpu) da2.f164949b;
            bxpu2.f164312b = bxqc2.f164366l;
            bxpu2.f164311a |= 1;
            bxps.mo73600a(da2);
        }
        if (z3) {
            bxvd da3 = bxpu.f164309d.mo74144da();
            bxqc bxqc3 = bxqc.EMPTY_CACHE;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxpu bxpu3 = (bxpu) da3.f164949b;
            bxpu3.f164312b = bxqc3.f164366l;
            bxpu3.f164311a |= 1;
            bxps.mo73600a(da3);
        }
        if (this.f93040d.mo35048a(longValue)) {
            qws qws = (qws) this.f93038b.mo6606a();
            bxvd da4 = bxpw.f164324h.mo74144da();
            int i = (int) longValue;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw = (bxpw) da4.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i;
            bxot bxot = bxot.f164207c;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da4.f164949b;
            bxot.getClass();
            bxpw2.f164328c = bxot;
            bxpw2.f164327b = 3;
            bxvd da5 = bxpp.f164297d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxpp bxpp = (bxpp) da5.f164949b;
            "com.google.android.gms#udc-facs".getClass();
            bxpp.f164299a |= 1;
            bxpp.f164300b = "com.google.android.gms#udc-facs";
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da4.f164949b;
            bxpp bxpp2 = (bxpp) da5.mo74062i();
            bxpp2.getClass();
            bxpw3.f164330e = bxpp2;
            bxpw3.f164326a |= 128;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw4 = (bxpw) da4.f164949b;
            bxpv bxpv2 = (bxpv) bxps.mo74062i();
            bxpv2.getClass();
            bxpw4.f164332g = bxpv2;
            bxpw4.f164326a |= 512;
            qwo a = qws.mo24333a(da4.mo74062i());
            a.mo24328b(1001);
            a.mo24327b();
        }
    }
}

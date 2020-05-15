package p000;

/* renamed from: amwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwl {

    /* renamed from: a */
    public final amwm f76191a;

    public amwl(amwm amwm) {
        this.f76191a = amwm;
    }

    /* renamed from: a */
    public final long mo41486a() {
        return this.f76191a.mo41492a().f76011f;
    }

    /* renamed from: a */
    public final void mo41488a(amvh amvh) {
        if (amvh != null) {
            amwm amwm = this.f76191a;
            amwm.mo41494a(amwm.mo41493a(amvh));
        }
    }

    /* renamed from: b */
    public final void mo41490b() {
        mo41491b(null);
    }

    /* renamed from: a */
    public final void mo41487a(long j) {
        amdk.m62658a("FSA2_PeopleSyncState", "@setLastFullSynctime = %d", Long.valueOf(j));
        amvh a = this.f76191a.mo41492a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amvh amvh = (amvh) bxvd.f164949b;
        amvh amvh2 = amvh.f76004g;
        amvh.f76006a |= 32;
        amvh.f76011f = j;
        mo41488a((amvh) bxvd.mo74062i());
    }

    /* renamed from: b */
    public final void mo41491b(String str) {
        amvh a = this.f76191a.mo41492a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (str == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amvh amvh = (amvh) bxvd.f164949b;
            amvh amvh2 = amvh.f76004g;
            amvh.f76006a &= -5;
            amvh.f76009d = amvh.f76004g.f76009d;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amvh amvh3 = (amvh) bxvd.f164949b;
            amvh amvh4 = amvh.f76004g;
            str.getClass();
            amvh3.f76006a |= 4;
            amvh3.f76009d = str;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amvh amvh5 = (amvh) bxvd.f164949b;
        amvh5.f76006a &= -9;
        amvh5.f76010e = amvh.f76004g.f76010e;
        mo41488a((amvh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo41489a(String str) {
        amvh a = this.f76191a.mo41492a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (str == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amvh amvh = (amvh) bxvd.f164949b;
            amvh amvh2 = amvh.f76004g;
            amvh.f76006a &= -2;
            amvh.f76007b = amvh.f76004g.f76007b;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amvh amvh3 = (amvh) bxvd.f164949b;
            amvh amvh4 = amvh.f76004g;
            str.getClass();
            amvh3.f76006a |= 1;
            amvh3.f76007b = str;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amvh amvh5 = (amvh) bxvd.f164949b;
        amvh5.f76006a &= -3;
        amvh5.f76008c = amvh.f76004g.f76008c;
        mo41488a((amvh) bxvd.mo74062i());
    }
}

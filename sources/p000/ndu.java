package p000;

/* renamed from: ndu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndu extends ndr {

    /* renamed from: b */
    public final long f35364b;

    /* renamed from: c */
    public final /* synthetic */ ndv f35365c;

    /* renamed from: d */
    public final bxvd f35366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ndu(ndv ndv, String str, int i, boolean z) {
        super(i);
        this.f35365c = ndv;
        bxvd a = lyu.m24685a();
        this.f35366d = a;
        String str2 = ndv.f35368c;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        str2.getClass();
        mqk.f34284a |= 1;
        mqk.f34286c = str2;
        bxvd bxvd = this.f35366d;
        bxvd da = mrn.f34444k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mrn mrn = (mrn) da.f164949b;
        str.getClass();
        int i2 = mrn.f34446a | 1;
        mrn.f34446a = i2;
        mrn.f34447b = str;
        long j = ndv.f35367b;
        int i3 = i2 | 2;
        mrn.f34446a = i3;
        mrn.f34448c = j;
        mrn.f34454i = 0;
        int i4 = i3 | 64;
        mrn.f34446a = i4;
        int i5 = i4 | 32;
        mrn.f34446a = i5;
        mrn.f34453h = 0;
        mrn.f34446a = i5 | 128;
        mrn.f34455j = z;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mqk mqk3 = (mqk) bxvd.f164949b;
        mrn mrn2 = (mrn) da.mo74062i();
        mrn2.getClass();
        mqk3.f34291h = mrn2;
        mqk3.f34284a |= 32;
        ndv.f35369d.add(this.f35366d);
        this.f35364b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo20500a(long j) {
        mrn mrn = ((mqk) this.f35366d.f164949b).f34291h;
        if (mrn == null) {
            mrn = mrn.f34444k;
        }
        if ((mrn.f34446a & 8) != 0) {
            mrn mrn2 = ((mqk) this.f35366d.f164949b).f34291h;
            if (mrn2 == null) {
                mrn2 = mrn.f34444k;
            }
            j += mrn2.f34450e;
        }
        bxvd bxvd = this.f35366d;
        mrn mrn3 = ((mqk) bxvd.f164949b).f34291h;
        if (mrn3 == null) {
            mrn3 = mrn.f34444k;
        }
        bxvd bxvd2 = (bxvd) mrn3.mo74142c(5);
        bxvd2.mo73625a((bxvk) mrn3);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mrn mrn4 = (mrn) bxvd2.f164949b;
        mrn4.f34446a |= 8;
        mrn4.f34450e = j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mqk mqk = (mqk) bxvd.f164949b;
        mrn mrn5 = (mrn) bxvd2.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mrn5.getClass();
        mqk.f34291h = mrn5;
        mqk.f34284a |= 32;
    }

    /* renamed from: a */
    public final void mo20501a(mrl mrl) {
        bxvd bxvd = this.f35366d;
        mrn mrn = ((mqk) bxvd.f164949b).f34291h;
        if (mrn == null) {
            mrn = mrn.f34444k;
        }
        bxvd bxvd2 = (bxvd) mrn.mo74142c(5);
        bxvd2.mo73625a((bxvk) mrn);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mrn mrn2 = (mrn) bxvd2.f164949b;
        mrl.getClass();
        if (!mrn2.f34451f.mo73666a()) {
            mrn2.f34451f = bxvk.m124019a(mrn2.f34451f);
        }
        mrn2.f34451f.mo74153d(mrl.f34442e);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mqk mqk = (mqk) bxvd.f164949b;
        mrn mrn3 = (mrn) bxvd2.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mrn3.getClass();
        mqk.f34291h = mrn3;
        mqk.f34284a |= 32;
    }
}

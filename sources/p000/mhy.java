package p000;

import java.util.List;

/* renamed from: mhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mhy extends mit {

    /* renamed from: a */
    final /* synthetic */ mib f33752a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mhy(mib mib, mhu mhu) {
        super(mhu);
        this.f33752a = mib;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mib.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mib.a(int, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20026b() {
        mib.f33754e.mo25416d("SummaryRequest stream expectation failed.", new Object[0]);
        this.f33752a.mo20031a(2, "SummaryRequest stream expectation failed.", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo20039a(byte[] bArr) {
        return (mpa) bxvk.m124016a(mpa.f34096b, bArr, bxus.m123744c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20040a(bxxc bxxc) {
        mpa mpa = (mpa) bxxc;
        mib mib = this.f33752a;
        bxvd da = mpc.f34104e.mo74144da();
        long a = spn.m35843a(mib.f33743b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpc mpc = (mpc) da.f164949b;
        int i = mpc.f34106a | 1;
        mpc.f34106a = i;
        mpc.f34108c = a;
        mpc.f34106a = i | 2;
        mpc.f34109d = true;
        bxwc bxwc = mpa.f34098a;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            moz moz = (moz) bxwc.get(i2);
            mmh a2 = mib.f33755f.mo20168a(moz.f34095b);
            bxvd da2 = mpb.f34099d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mpb mpb = (mpb) da2.f164949b;
            moz.getClass();
            mpb.f34102b = moz;
            mpb.f34101a |= 1;
            List a3 = a2.mo20163a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mpb mpb2 = (mpb) da2.f164949b;
            if (!mpb2.f34103c.mo73666a()) {
                mpb2.f34103c = bxvk.m124021a(mpb2.f34103c);
            }
            bxsy.m123078a(a3, mpb2.f34103c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpc mpc2 = (mpc) da.f164949b;
            mpb mpb3 = (mpb) da2.mo74062i();
            mpb3.getClass();
            if (!mpc2.f34107b.mo73666a()) {
                mpc2.f34107b = bxvk.m124021a(mpc2.f34107b);
            }
            mpc2.f34107b.add(mpb3);
            mib.f33754e.mo25409a("Adding flavor summary %s with %d items", moz.f34095b, Integer.valueOf(((mpb) da2.f164949b).f34103c.size()));
        }
        mib.f33754e.mo25409a("Sending flavor summary list", new Object[0]);
        mib.mo20032a(da.mo74062i());
    }
}

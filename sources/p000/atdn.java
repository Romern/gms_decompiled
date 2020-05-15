package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;

/* renamed from: atdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atdn implements atcq {

    /* renamed from: a */
    private final askf f90124a;

    /* renamed from: b */
    private final atcl f90125b;

    /* renamed from: c */
    private final CryptoParameters f90126c;

    /* renamed from: d */
    private final btiy f90127d;

    /* renamed from: e */
    private final String f90128e;

    /* renamed from: f */
    private final int f90129f;

    /* renamed from: g */
    private final int f90130g;

    /* renamed from: h */
    private final int f90131h;

    /* renamed from: i */
    private final atcp f90132i;

    public atdn(askf askf, atcl atcl, CryptoParameters cryptoParameters, btiy btiy, String str, int i, int i2, int i3, atcp atcp) {
        this.f90124a = askf;
        this.f90125b = atcl;
        this.f90126c = cryptoParameters;
        this.f90127d = btiy;
        this.f90128e = str;
        this.f90129f = i;
        this.f90130g = i2;
        this.f90131h = i3;
        this.f90132i = atcp;
    }

    /* renamed from: a */
    public final atct mo49826a() {
        String str;
        byte[] bArr;
        btkh btkh;
        if (!this.f90132i.f90091i) {
            bxvd da = btlh.f149366e.mo74144da();
            bxvd da2 = btlg.f149363b.mo74144da();
            int i = this.f90131h;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((btlg) da2.f164949b).f149365a = i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btlh btlh = (btlh) da.f164949b;
            btlg btlg = (btlg) da2.mo74062i();
            btlg.getClass();
            btlh.f149369b = btlg;
            btlh.f149368a = 1;
            byte[] bArr2 = this.f90132i.f90090h;
            if (bArr2 != null) {
                ByteString a = ByteString.m123261a(bArr2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btlh) da.f164949b).f149371d = a;
            }
            bxvd da3 = btlf.f149359c.mo74144da();
            long j = this.f90132i.f90085c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btlf btlf = (btlf) da3.f164949b;
            btlf.f149361a = j;
            btlf.f149362b = this.f90132i.f90084b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btlf btlf2 = (btlf) da3.mo74062i();
            btlf2.getClass();
            ((btlh) da.f164949b).f149370c = btlf2;
            bxvd da4 = btkl.f149269d.mo74144da();
            btiy btiy = this.f90127d;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            btkl btkl = (btkl) da4.f164949b;
            btiy.getClass();
            btkl.f149271a = btiy;
            btli btli = this.f90126c.f108621a;
            btli.getClass();
            btkl.f149272b = btli;
            btlh btlh2 = (btlh) da.mo74062i();
            btlh2.getClass();
            btkl.f149273c = btlh2;
            btkm a2 = this.f90125b.mo49825a(this.f90124a, (btkl) da4.mo74062i());
            btkg btkg = a2.f149276a;
            if (btkg == null) {
                btkg = btkg.f149250c;
            }
            byte[] k = btkg.f149252a.getKey();
            btkg btkg2 = a2.f149276a;
            if (btkg2 == null) {
                btkg2 = btkg.f149250c;
            }
            btki btki = btkg2.f149253b;
            if (btki == null) {
                btki = btki.f149257c;
            }
            if (btki.f149259a == 1) {
                btkh = (btkh) btki.f149260b;
            } else {
                btkh = btkh.f149254b;
            }
            str = btkh.f149256a;
            bArr = k;
        } else {
            str = "";
            bArr = new byte[0];
        }
        return new atct(bArr, this.f90128e, this.f90129f, this.f90130g, str, Integer.toString(this.f90131h));
    }
}

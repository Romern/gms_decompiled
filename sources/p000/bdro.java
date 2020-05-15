package p000;

import android.accounts.Account;

/* renamed from: bdro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdro {

    /* renamed from: a */
    private final bdqu f106306a;

    /* renamed from: b */
    private final bmzi f106307b;

    /* renamed from: c */
    private final batv f106308c;

    /* renamed from: d */
    private final int f106309d;

    /* renamed from: e */
    private final boolean f106310e;

    /* renamed from: f */
    private final int f106311f;

    public bdro(bdqu bdqu, int i, bmzi bmzi, batv batv, boolean z) {
        this.f106306a = bdqu;
        this.f106311f = i;
        this.f106307b = bmzi;
        this.f106308c = batv;
        this.f106309d = !z ? 1 : 2;
        this.f106310e = z;
    }

    /* renamed from: a */
    public static bdro m91337a(bdqu bdqu, int i, bdrl bdrl, Account account, batv batv, boolean z) {
        return new bdro(bdqu, i, new bdrn(bdrl, account), batv, z);
    }

    /* renamed from: a */
    public final void mo58314a() {
        String str;
        String str2;
        batv batv = this.f106308c;
        bdqu bdqu = this.f106306a;
        int i = this.f106311f;
        if (!this.f106310e) {
            String d = bdqu.mo58306d();
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 12);
            sb.append(d);
            sb.append(":");
            sb.append(i - 1);
            str = sb.toString();
        } else {
            String e = bdqu.mo58307e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 12);
            sb2.append(e);
            sb2.append(":");
            sb2.append(i - 1);
            str = sb2.toString();
        }
        bpwx a = batv.mo55958a(str);
        if (a != null) {
            bdrk bdrk = (bdrk) this.f106307b.mo6606a();
            int i2 = this.f106311f;
            bxvd da = bxpw.f164324h.mo74144da();
            int i3 = (int) a.f139588d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw = (bxpw) da.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i3;
            bxvd da2 = bxpp.f164297d.mo74144da();
            if (!this.f106310e) {
                str2 = this.f106306a.mo58306d();
            } else {
                str2 = this.f106306a.mo58307e();
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpp bxpp = (bxpp) da2.f164949b;
            str2.getClass();
            int i4 = bxpp.f164299a | 1;
            bxpp.f164299a = i4;
            bxpp.f164300b = str2;
            int i5 = this.f106309d;
            bxpp.f164299a = i4 | 2;
            bxpp.f164301c = i5;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da.f164949b;
            bxpp bxpp2 = (bxpp) da2.mo74062i();
            bxpp2.getClass();
            bxpw2.f164330e = bxpp2;
            bxpw2.f164326a |= 128;
            bxvd da3 = bxof.f164145c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxof bxof = (bxof) da3.f164949b;
            a.getClass();
            bxof.f164148b = a;
            bxof.f164147a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da.f164949b;
            bxof bxof2 = (bxof) da3.mo74062i();
            bxof2.getClass();
            bxpw3.f164328c = bxof2;
            bxpw3.f164327b = 10;
            bdrk.mo58311a(i2, (bxpw) da.mo74062i());
        }
    }
}

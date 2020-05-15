package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: bgzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzc implements aubg {

    /* renamed from: a */
    final /* synthetic */ Context f118147a;

    /* renamed from: b */
    final /* synthetic */ bsqv f118148b;

    /* renamed from: c */
    final /* synthetic */ byte[] f118149c;

    /* renamed from: d */
    final /* synthetic */ Account f118150d;

    public bgzc(Context context, bsqv bsqv, byte[] bArr, Account account) {
        this.f118147a = context;
        this.f118148b = bsqv;
        this.f118149c = bArr;
        this.f118150d = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        Context context = this.f118147a;
        bsqv bsqv = this.f118148b;
        String str = (String) aucb.mo50386d();
        String hexString = Long.toHexString(spn.getAndroidId(context));
        bxvd da = bsra.f146725c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsra bsra = (bsra) da.f164949b;
        hexString.getClass();
        bsra.f146727a |= 1;
        bsra.f146728b = hexString;
        bsra bsra2 = (bsra) da.mo74062i();
        bxvd da2 = bsrc.f146733d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsrc bsrc = (bsrc) da2.f164949b;
        bsra2.getClass();
        bsrc.f146737c = bsra2;
        bsrc.f146735a |= 2;
        if (str != null) {
            bxvd da3 = bsrb.f146729c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrb bsrb = (bsrb) da3.f164949b;
            str.getClass();
            bsrb.f146731a |= 1;
            bsrb.f146732b = str;
            bsrb bsrb2 = (bsrb) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrc bsrc2 = (bsrc) da2.f164949b;
            bsrb2.getClass();
            bsrc2.f146736b = bsrb2;
            bsrc2.f146735a |= 1;
        }
        bxvd da4 = bsre.f146739d.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsre bsre = (bsre) da4.f164949b;
        bsre.f146742b = 1;
        bsre.f146741a |= 1;
        bsrc bsrc3 = (bsrc) da2.mo74062i();
        bsrc3.getClass();
        bsre.f146743c = bsrc3;
        bsre.f146741a |= 2;
        bsqv.mo70707a(da4);
        bxvd da5 = bsre.f146739d.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsre bsre2 = (bsre) da5.f164949b;
        bsre2.f146742b = 2;
        bsre2.f146741a |= 1;
        bsrc bsrc4 = (bsrc) da2.mo74062i();
        bsrc4.getClass();
        bsre2.f146743c = bsrc4;
        bsre2.f146741a |= 2;
        bsqv.mo70707a(da5);
        ggp ggp = new ggp();
        ggp.f18143b = 20;
        ggp.f18142a = 2;
        ggp.mo11800a(((bsqw) this.f118148b.mo74062i()).serializeToBytes());
        byte[] bArr = this.f118149c;
        if (bArr != null) {
            ggp.f18145d = bArr;
        }
        ggp.f18144c = this.f118150d.name;
        return ggh.m13102a(this.f118147a).mo11796a(ggp.mo11799a());
    }
}

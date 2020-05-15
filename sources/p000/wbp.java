package p000;

import android.accounts.Account;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wbp {

    /* renamed from: a */
    private final bqgy f50448a;

    /* renamed from: b */
    private final bqgy f50449b;

    /* renamed from: c */
    private final Account[] f50450c;

    /* renamed from: d */
    private final adyd f50451d;

    /* renamed from: e */
    private final Activity f50452e;

    /* renamed from: f */
    private final wbb f50453f;

    /* renamed from: g */
    private final bycs f50454g;

    /* renamed from: h */
    private final AtomicReference f50455h;

    /* renamed from: i */
    private final cijl f50456i;

    /* renamed from: j */
    private final bmyl f50457j;

    public wbp(bqgy bqgy, bqgy bqgy2, Account[] accountArr, adyd adyd, Activity activity, wbb wbb, bycs bycs, AtomicReference atomicReference, cijl cijl, bmyl bmyl) {
        this.f50448a = bqgy;
        this.f50449b = bqgy2;
        this.f50450c = accountArr;
        this.f50451d = adyd;
        this.f50452e = activity;
        this.f50453f = wbb;
        this.f50454g = bycs;
        this.f50455h = atomicReference;
        this.f50456i = cijl;
        this.f50457j = bmyl;
    }

    @JavascriptInterface
    public void addAccount() {
        this.f50451d.mo33913a("com.google", null, null, null, this.f50452e.getContainerActivity(), this.f50453f);
    }

    @JavascriptInterface
    public void cancel() {
        bqgy bqgy = this.f50449b;
        wdb d = wdc.m41786d();
        d.mo29044a(3);
        d.mo29045a(this.f50454g.f165687f);
        bqgy.mo69138b(d.mo29043a());
    }

    @JavascriptInterface
    public void getAccounts(String str) {
        this.f50448a.mo69138b(str);
    }

    @JavascriptInterface
    public void goToUrl(String str, int i) {
        bqgy bqgy = this.f50449b;
        wdb d = wdc.m41786d();
        d.mo29044a(i);
        d.mo29045a(str);
        bqgy.mo69138b(d.mo29043a());
    }

    @JavascriptInterface
    public void setDimensions(int i, int i2, int i3, int i4, int i5, int i6) {
        AtomicReference atomicReference = this.f50455h;
        bxvd da = bycl.f165662d.mo74144da();
        bxvd da2 = bycm.f165667e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bycm bycm = (bycm) da2.f164949b;
        int i7 = bycm.f165669a | 1;
        bycm.f165669a = i7;
        bycm.f165670b = i;
        int i8 = i7 | 2;
        bycm.f165669a = i8;
        bycm.f165671c = i2;
        bycm.f165669a = i8 | 4;
        bycm.f165672d = i2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bycl bycl = (bycl) da.f164949b;
        bycm bycm2 = (bycm) da2.mo74062i();
        bycm2.getClass();
        bycl.f165665b = bycm2;
        bycl.f165664a |= 1;
        bxvd da3 = bycm.f165667e.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bycm bycm3 = (bycm) da3.f164949b;
        int i9 = bycm3.f165669a | 1;
        bycm3.f165669a = i9;
        bycm3.f165670b = i4;
        int i10 = i9 | 2;
        bycm3.f165669a = i10;
        bycm3.f165671c = i5;
        bycm3.f165669a = i10 | 4;
        bycm3.f165672d = i5;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bycl bycl2 = (bycl) da.f164949b;
        bycm bycm4 = (bycm) da3.mo74062i();
        bycm4.getClass();
        bycl2.f165666c = bycm4;
        bycl2.f165664a |= 2;
        atomicReference.set((bycl) da.mo74062i());
        bmyl bmyl = this.f50457j;
        cijl cijl = this.f50456i;
        cijl.getClass();
        bmyl.mo12292a(new wbo(cijl));
    }

    @JavascriptInterface
    public void signIn(int i) {
        try {
            bmxy.m108584a(i, this.f50450c.length);
            bqgy bqgy = this.f50449b;
            wdb d = wdc.m41786d();
            d.mo29044a(1);
            d.f50529a = this.f50450c[i];
            bqgy.mo69138b(d.mo29043a());
        } catch (Exception e) {
            this.f50449b.mo69136a((Throwable) e);
        }
    }
}

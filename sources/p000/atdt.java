package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdt {

    /* renamed from: a */
    public final btjk f90155a;

    /* renamed from: b */
    public final String f90156b;

    /* renamed from: c */
    public final boolean f90157c;

    /* renamed from: d */
    public final long f90158d;

    /* renamed from: e */
    private final boolean f90159e;

    public atdt(btjk btjk, boolean z, String str, boolean z2, long j) {
        this.f90155a = btjk;
        this.f90159e = z;
        this.f90157c = z2;
        this.f90156b = str;
        this.f90158d = j;
    }

    /* renamed from: a */
    public final boolean mo49863a() {
        if (!this.f90157c) {
            return false;
        }
        btpr btpr = this.f90155a.f149134l;
        if (btpr == null) {
            btpr = btpr.f149879b;
        }
        int b = btpq.m117019b(btpr.f149881a);
        if (b == 0 || b != 5 || !this.f90159e) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo49864b() {
        if (!this.f90157c) {
            return 1;
        }
        btpr btpr = this.f90155a.f149134l;
        if (btpr == null) {
            btpr = btpr.f149879b;
        }
        return atyj.m76560a(btpr);
    }

    /* renamed from: c */
    public final CardInfo mo49865c() {
        asmg a = atyj.m76561a(this.f90155a, mo49863a(), mo49864b());
        a.f89246x = this.f90158d;
        return a.mo49237a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo49866d() {
        btpr btpr = this.f90155a.f149134l;
        if (btpr == null) {
            btpr = btpr.f149879b;
        }
        int b = btpq.m117019b(btpr.f149881a);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}

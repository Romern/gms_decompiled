package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgu {

    /* renamed from: a */
    public btjk f90324a;

    /* renamed from: b */
    public final int f90325b;

    /* renamed from: c */
    public final atgt f90326c;

    /* renamed from: d */
    public final String f90327d;

    /* renamed from: e */
    public final String f90328e;

    /* renamed from: f */
    public final String f90329f;

    /* renamed from: g */
    public final byte[] f90330g;

    /* renamed from: h */
    public final boolean f90331h;

    public atgu(btjk btjk, int i, atgt atgt, String str, String str2, String str3, byte[] bArr, boolean z) {
        this.f90324a = btjk;
        this.f90325b = i;
        this.f90326c = atgt;
        this.f90327d = str;
        this.f90328e = str2;
        this.f90329f = str3;
        this.f90330g = bArr;
        this.f90331h = z;
    }

    /* renamed from: a */
    public final CardInfo mo49971a() {
        btpr btpr = this.f90324a.f149134l;
        if (btpr == null) {
            btpr = btpr.f149879b;
        }
        int b = btpq.m117019b(btpr.f149881a);
        int i = 5;
        if (b != 0 && b == 5 && this.f90325b == 1) {
            i = 6;
        } else if (this.f90325b != 3) {
            btpr btpr2 = this.f90324a.f149134l;
            if (btpr2 == null) {
                btpr2 = btpr.f149879b;
            }
            i = atyj.m76560a(btpr2);
        }
        return atyj.m76561a(this.f90324a, this.f90331h, i).mo49237a();
    }
}

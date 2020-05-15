package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bfcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfcr {

    /* renamed from: a */
    final int f113417a;

    /* renamed from: b */
    final int f113418b;

    /* renamed from: c */
    final boolean f113419c;

    /* renamed from: d */
    final boolean f113420d;

    /* renamed from: e */
    final boolean f113421e;

    /* renamed from: f */
    final boolean f113422f;

    /* renamed from: g */
    final int f113423g;

    /* renamed from: h */
    final int f113424h;

    /* renamed from: i */
    final int f113425i;

    /* renamed from: j */
    final int f113426j;

    /* renamed from: k */
    final int f113427k;

    /* renamed from: l */
    final long f113428l;

    public bfcr(bsax bsax) {
        this.f113417a = bsax.mo70114b(1);
        this.f113418b = bsax.mo70114b(11);
        this.f113419c = m96362a(bsax, 5);
        this.f113420d = m96362a(bsax, 6);
        this.f113421e = m96362a(bsax, 7);
        this.f113422f = m96362a(bsax, 8);
        this.f113423g = bsax.mo70114b(17);
        this.f113424h = bsax.mo70114b(18);
        this.f113425i = bsax.mo70114b((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
        if (bsax.mo70137i(50)) {
            this.f113426j = bsax.mo70129e(50).mo70114b(1);
        } else {
            this.f113426j = 0;
        }
        this.f113427k = bsax.mo70114b(16);
        this.f113428l = bsax.mo70124c(3);
    }

    /* renamed from: a */
    private static boolean m96362a(bsax bsax, int i) {
        return bsax.mo70137i(i) && bsax.mo70113a(i);
    }
}

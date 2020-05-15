package p000;

import android.accounts.Account;

/* renamed from: hox */
final /* synthetic */ class hox implements bmxj {

    /* renamed from: a */
    private final hph f20142a;

    /* renamed from: b */
    private final int f20143b;

    public hox(hph hph, int i) {
        this.f20142a = hph;
        this.f20143b = i;
    }

    public final Object apply(Object obj) {
        hph hph = this.f20142a;
        return hph.f20161b.mo25819b(new hpa(hph, (Account) obj, this.f20143b));
    }
}

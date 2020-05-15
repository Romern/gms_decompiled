package p000;

import android.database.Cursor;

/* renamed from: adtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adtd extends adss {

    /* renamed from: d */
    final /* synthetic */ adtg f62697d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adtd(adtg adtg, long j, int i) {
        super(j, i);
        this.f62697d = adtg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo33787b() {
        new Object[1][0] = Long.valueOf(((adss) this).f62660a);
        String valueOf = String.valueOf(((adss) this).f62660a);
        return this.f62697d.f62713h.mo33689a(adta.f62679a, adtg.f62704c, adtg.f62707f, new String[]{valueOf, valueOf, String.valueOf(((adss) this).f62661b), String.valueOf(System.currentTimeMillis() + adtg.f62702a)}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo33788c() {
        adsr a = this.f62697d.mo33806a(this.f62662c);
        if (a != null) {
            ((adss) this).f62661b = a.mo33760a();
            ((adss) this).f62660a = a.mo33766f();
        }
        return a;
    }
}

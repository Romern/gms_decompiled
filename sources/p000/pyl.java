package p000;

import android.content.Context;

/* renamed from: pyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyl extends pyw {

    /* renamed from: a */
    final /* synthetic */ double f40651a;

    /* renamed from: b */
    final /* synthetic */ double f40652b;

    /* renamed from: c */
    final /* synthetic */ boolean f40653c;

    /* renamed from: d */
    final /* synthetic */ pyx f40654d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyl(pyx pyx, String str, double d, double d2, boolean z) {
        super(str);
        this.f40654d = pyx;
        this.f40651a = d;
        this.f40652b = d2;
        this.f40653c = z;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40654d;
        pyx.f40684d.mo23673b("setVolume: %s %f %f %b", pyx.f40683c, Double.valueOf(this.f40651a), Double.valueOf(this.f40652b), Boolean.valueOf(this.f40653c));
        if (!this.f40654d.f40686f.mo23208a(this.f40651a, this.f40652b, this.f40653c)) {
            pyx pyx2 = this.f40654d;
            pyx2.mo23813d(pyx2.f40686f.f39230a.f29716d);
        }
    }
}

package p000;

import android.graphics.Typeface;

/* renamed from: bhla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhla extends C1161li {

    /* renamed from: a */
    final /* synthetic */ bhld f118928a;

    /* renamed from: b */
    final /* synthetic */ bhlc f118929b;

    public bhla(bhlc bhlc, bhld bhld) {
        this.f118929b = bhlc;
        this.f118928a = bhld;
    }

    /* renamed from: a */
    public final void mo15153a(int i) {
        this.f118929b.f118944l = true;
        this.f118928a.mo63692a(i);
    }

    /* renamed from: a */
    public final void mo15154a(Typeface typeface) {
        bhlc bhlc = this.f118929b;
        bhlc.f118942j = Typeface.create(typeface, bhlc.f118935c);
        this.f118929b.f118944l = true;
        this.f118928a.mo63693a(this.f118929b.f118942j, false);
    }
}

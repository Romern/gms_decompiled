package p000;

import android.graphics.Path;

/* renamed from: bby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bby implements bbo {

    /* renamed from: a */
    public final Path.FillType f2902a;

    /* renamed from: b */
    public final String f2903b;

    /* renamed from: c */
    public final baz f2904c;

    /* renamed from: d */
    public final bbc f2905d;

    /* renamed from: e */
    public final boolean f2906e;

    /* renamed from: f */
    private final boolean f2907f;

    public bby(String str, boolean z, Path.FillType fillType, baz baz, bbc bbc, boolean z2) {
        this.f2903b = str;
        this.f2907f = z;
        this.f2902a = fillType;
        this.f2904c = baz;
        this.f2905d = bbc;
        this.f2906e = z2;
    }

    /* renamed from: a */
    public final azg mo2977a(ayo ayo, bcg bcg) {
        return new azk(ayo, bcg, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f2907f + '}';
    }
}

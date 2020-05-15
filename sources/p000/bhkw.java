package p000;

import android.graphics.Typeface;

/* renamed from: bhkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkw extends bhld {

    /* renamed from: a */
    private final Typeface f118924a;

    /* renamed from: b */
    private final bhkv f118925b;

    /* renamed from: c */
    private boolean f118926c;

    public bhkw(bhkv bhkv, Typeface typeface) {
        this.f118924a = typeface;
        this.f118925b = bhkv;
    }

    /* renamed from: a */
    private final void m101068a(Typeface typeface) {
        if (!this.f118926c) {
            this.f118925b.mo63844a(typeface);
        }
    }

    /* renamed from: a */
    public final void mo63908a() {
        this.f118926c = true;
    }

    /* renamed from: a */
    public final void mo63692a(int i) {
        m101068a(this.f118924a);
    }

    /* renamed from: a */
    public final void mo63693a(Typeface typeface, boolean z) {
        m101068a(typeface);
    }
}

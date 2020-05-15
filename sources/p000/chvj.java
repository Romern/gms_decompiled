package p000;

import android.content.Context;

/* renamed from: chvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chvj extends chrr {

    /* renamed from: a */
    public Context f189267a;

    /* renamed from: b */
    private final chta f189268b;

    static {
        try {
            Class.forName("cifv");
        } catch (ClassNotFoundException e) {
        }
    }

    public chvj(chta chta) {
        bmxy.m108582a(chta, "delegateBuilder");
        this.f189268b = chta;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final chta mo85580a() {
        return this.f189268b;
    }

    /* renamed from: b */
    public final chsz mo85581b() {
        return new chvi(this.f189268b.mo85581b(), this.f189267a);
    }
}

package p000;

import java.util.concurrent.Executor;

/* renamed from: bjsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsk {

    /* renamed from: a */
    public static bjsk f123233a;

    /* renamed from: b */
    public int f123234b;

    /* renamed from: c */
    public Executor f123235c;

    /* renamed from: d */
    public boolean f123236d;

    /* renamed from: e */
    public int f123237e = 0;

    /* renamed from: f */
    public int f123238f = 0;

    private bjsk() {
    }

    /* renamed from: a */
    public static bjsk m104497a() {
        if (f123233a == null) {
            f123233a = new bjsk();
        }
        return f123233a;
    }

    /* renamed from: b */
    public final void mo65497b() {
        this.f123238f = 2;
    }

    /* renamed from: c */
    public final void mo65498c() {
        this.f123238f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo65499d() {
        int i = this.f123238f;
        if (i == 2) {
            return;
        }
        if (i != 1) {
            this.f123234b = 0;
            this.f123235c = null;
            this.f123237e = 0;
            this.f123236d = false;
            f123233a = null;
            return;
        }
        mo65498c();
    }
}

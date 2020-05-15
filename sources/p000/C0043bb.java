package p000;

import android.os.Handler;

/* renamed from: bb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0043bb implements C0013ak {

    /* renamed from: h */
    public static final C0043bb f2820h = new C0043bb();

    /* renamed from: a */
    public int f2821a = 0;

    /* renamed from: b */
    public int f2822b = 0;

    /* renamed from: c */
    public boolean f2823c = true;

    /* renamed from: d */
    public boolean f2824d = true;

    /* renamed from: e */
    public Handler f2825e;

    /* renamed from: f */
    public final C0015am f2826f = new C0015am(this);

    /* renamed from: g */
    public final Runnable f2827g = new C0039ay(this);

    private C0043bb() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2973a() {
        if (this.f2821a == 0 && this.f2823c) {
            this.f2826f.mo1023a(C0005ad.ON_STOP);
            this.f2824d = true;
        }
    }

    public final C0008af getLifecycle() {
        return this.f2826f;
    }
}

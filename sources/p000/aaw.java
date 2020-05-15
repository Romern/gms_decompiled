package p000;

import android.graphics.Rect;
import android.view.View;

/* renamed from: aaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aaw {

    /* renamed from: a */
    protected final abu f87a;

    /* renamed from: b */
    public int f88b = Integer.MIN_VALUE;

    /* renamed from: c */
    final Rect f89c = new Rect();

    public aaw(abu abu) {
        this.f87a = abu;
    }

    /* renamed from: a */
    public static aaw m167a(abu abu) {
        return new aau(abu);
    }

    /* renamed from: b */
    public static aaw m168b(abu abu) {
        return new aav(abu);
    }

    /* renamed from: a */
    public abstract int mo117a();

    /* renamed from: a */
    public abstract int mo118a(View view);

    /* renamed from: a */
    public abstract void mo119a(int i);

    /* renamed from: b */
    public abstract int mo120b();

    /* renamed from: b */
    public abstract int mo121b(View view);

    /* renamed from: c */
    public abstract int mo122c();

    /* renamed from: c */
    public abstract int mo123c(View view);

    /* renamed from: d */
    public abstract int mo124d();

    /* renamed from: d */
    public abstract int mo125d(View view);

    /* renamed from: e */
    public abstract int mo126e();

    /* renamed from: e */
    public abstract int mo127e(View view);

    /* renamed from: f */
    public abstract int mo128f();

    /* renamed from: f */
    public abstract int mo129f(View view);

    /* renamed from: g */
    public abstract int mo130g();

    /* renamed from: h */
    public final int mo131h() {
        if (this.f88b != Integer.MIN_VALUE) {
            return mo124d() - this.f88b;
        }
        return 0;
    }
}

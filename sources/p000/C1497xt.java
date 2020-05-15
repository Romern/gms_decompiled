package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: xt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1497xt {

    /* renamed from: a */
    public static final PorterDuff.Mode f27616a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C1497xt f27617b;

    /* renamed from: c */
    private acp f27618c;

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m20821a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C1497xt.class) {
            a = acp.m473a(i, mode);
        }
        return a;
    }

    /* renamed from: b */
    public static synchronized C1497xt m20824b() {
        C1497xt xtVar;
        synchronized (C1497xt.class) {
            if (f27617b == null) {
                m20822a();
            }
            xtVar = f27617b;
        }
        return xtVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acp.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable
     arg types: [android.content.Context, int, int]
     candidates:
      acp.a(android.content.Context, long, android.graphics.drawable.Drawable):void
      acp.a(android.graphics.drawable.Drawable, adp, int[]):void
      acp.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized Drawable mo16513c(Context context, int i) {
        return this.f27618c.mo354a(context, i, true);
    }

    /* renamed from: a */
    public static synchronized void m20822a() {
        synchronized (C1497xt.class) {
            if (f27617b == null) {
                C1497xt xtVar = new C1497xt();
                f27617b = xtVar;
                xtVar.f27618c = acp.m472a();
                f27617b.f27618c.mo356a(new C1496xs());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized ColorStateList mo16512b(Context context, int i) {
        return this.f27618c.mo357b(context, i);
    }

    /* renamed from: a */
    static void m20823a(Drawable drawable, adp adp, int[] iArr) {
        acp.m476a(drawable, adp, iArr);
    }

    /* renamed from: a */
    public final synchronized Drawable mo16510a(Context context, int i) {
        return this.f27618c.mo353a(context, i);
    }

    /* renamed from: a */
    public final synchronized void mo16511a(Context context) {
        this.f27618c.mo355a(context);
    }
}

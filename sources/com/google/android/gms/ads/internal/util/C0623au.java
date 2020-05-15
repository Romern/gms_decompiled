package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.weaklisteners.C0673a;
import com.google.android.gms.ads.internal.util.weaklisteners.C0674b;

/* renamed from: com.google.android.gms.ads.internal.util.au */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0623au {

    /* renamed from: a */
    private final View f8940a;

    /* renamed from: b */
    private final Activity f8941b;

    /* renamed from: c */
    private boolean f8942c;

    /* renamed from: d */
    private boolean f8943d;

    /* renamed from: e */
    private boolean f8944e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f8945f;

    public C0623au(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f8941b = activity;
        this.f8940a = view;
        this.f8945f = onGlobalLayoutListener;
    }

    /* renamed from: a */
    private static ViewTreeObserver m5625a(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: e */
    private final void m5626e() {
        ViewTreeObserver a;
        if (!this.f8942c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f8945f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f8941b;
                if (!(activity == null || (a = m5625a(activity)) == null)) {
                    a.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                C0673a aVar = C0387d.f8300a.f8305f;
                C0674b bVar = new C0674b(this.f8940a, this.f8945f);
                ViewTreeObserver a2 = bVar.mo6874a();
                if (a2 != null) {
                    a2.addOnGlobalLayoutListener(bVar);
                }
            }
            this.f8942c = true;
        }
    }

    /* renamed from: f */
    private final void m5627f() {
        ViewTreeObserver a;
        Activity activity = this.f8941b;
        if (activity != null && this.f8942c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f8945f;
            if (!(onGlobalLayoutListener == null || (a = m5625a(activity)) == null)) {
                C0387d.m5364b();
                a.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f8942c = false;
        }
    }

    /* renamed from: b */
    public final void mo6798b() {
        this.f8944e = false;
        m5627f();
    }

    /* renamed from: c */
    public final void mo6799c() {
        this.f8943d = true;
        if (this.f8944e) {
            m5626e();
        }
    }

    /* renamed from: d */
    public final void mo6800d() {
        this.f8943d = false;
        m5627f();
    }

    /* renamed from: a */
    public final void mo6797a() {
        this.f8944e = true;
        if (this.f8943d) {
            m5626e();
        }
    }
}

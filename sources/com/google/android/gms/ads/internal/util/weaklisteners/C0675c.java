package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.util.weaklisteners.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0675c {

    /* renamed from: a */
    private final WeakReference f9026a;

    public C0675c(View view) {
        this.f9026a = new WeakReference(view);
    }

    /* renamed from: a */
    public final ViewTreeObserver mo6874a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f9026a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}

package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C0387d;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.util.weaklisteners.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0674b extends C0675c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference f9025a;

    public C0674b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f9025a = new WeakReference(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f9025a.get();
        if (onGlobalLayoutListener == null) {
            ViewTreeObserver a = mo6874a();
            if (a != null) {
                C0387d.m5364b();
                a.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        onGlobalLayoutListener.onGlobalLayout();
    }
}

package com.google.android.gms.credential.manager.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LottieView extends LottieAnimationView {

    /* renamed from: e */
    private static tuu f30714e = null;

    public LottieView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static synchronized tuu m22919a(Context context) {
        tuu tuu;
        synchronized (LottieView.class) {
            if (f30714e == null) {
                f30714e = new tvk(context);
            }
            tuu = f30714e;
        }
        return tuu;
    }

    /* renamed from: e */
    public static synchronized void m22921e() {
        synchronized (LottieView.class) {
            if (f30714e != null) {
                f30714e.mo26817a();
                f30714e = null;
            }
        }
    }

    public LottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22920a(attributeSet);
    }

    /* renamed from: a */
    private final void m22920a(AttributeSet attributeSet) {
        if (cdpu.f181537a.mo6606a().mo78163b()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eoi.f15397i);
            String string = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getString(0) : obtainStyledAttributes.getString(1);
            if (!DarkThemeManager.m22913a(DarkThemeManager.m22912a(), DarkThemeManager.m22914b())) {
                string = obtainStyledAttributes.getString(1);
            }
            if (string != null) {
                m22919a(getContext()).mo26819a(string, new tuy(this));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public LottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22920a(attributeSet);
    }
}

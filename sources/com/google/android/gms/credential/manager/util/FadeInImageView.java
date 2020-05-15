package com.google.android.gms.credential.manager.util;

import android.content.Context;
import android.support.p002v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FadeInImageView extends AppCompatImageView {

    /* renamed from: a */
    private static tuu f30713a = null;

    public FadeInImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static synchronized tuu m22916a(Context context) {
        tuu tuu;
        synchronized (FadeInImageView.class) {
            if (f30713a == null) {
                f30713a = new tvk(context);
            }
            tuu = f30713a;
        }
        return tuu;
    }

    /* renamed from: a */
    public static synchronized void m22917a() {
        synchronized (FadeInImageView.class) {
            if (f30713a != null) {
                f30713a.mo26817a();
                f30713a = null;
            }
        }
    }

    public FadeInImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo18105a(String str, Context context) {
        m22916a(context).mo26818a(str, new tus(this));
    }

    public FadeInImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

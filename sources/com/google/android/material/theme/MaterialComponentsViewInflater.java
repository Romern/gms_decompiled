package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.support.p002v7.app.AppCompatViewInflater;
import android.support.p002v7.widget.AppCompatButton;
import android.support.p002v7.widget.AppCompatCheckBox;
import android.support.p002v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* renamed from: a */
    public final AppCompatTextView mo1201a(Context context, AttributeSet attributeSet) {
        return new bhpo(context, attributeSet);
    }

    /* renamed from: c */
    public final AppCompatCheckBox mo1205c(Context context, AttributeSet attributeSet) {
        return new bhfz(context, attributeSet);
    }

    /* renamed from: d */
    public final C1503xz mo1206d(Context context, AttributeSet attributeSet) {
        return new bhkt(context, attributeSet);
    }

    /* renamed from: e */
    public final C1492xo mo1207e(Context context, AttributeSet attributeSet) {
        return new bhoz(context, attributeSet);
    }

    /* renamed from: b */
    public final AppCompatButton mo1204b(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        return new MaterialButton(context, attributeSet);
    }
}

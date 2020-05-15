package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        m4747a();
    }

    /* renamed from: a */
    private final void m4747a() {
        int i = Build.VERSION.SDK_INT;
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i2 = 0; i2 < compoundDrawablesRelative.length; i2++) {
            Drawable drawable = compoundDrawablesRelative[i2];
            if (drawable != null) {
                compoundDrawablesRelative[i2] = bnh.m3389a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* renamed from: b */
    private final void m4748b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            int i = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i2 = 0; i2 < 6; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable instanceof bnh) {
                    bnh bnh = (bnh) drawable;
                    bnh.f5189a = textColors;
                    if (bnh.mo3295a()) {
                        bnh.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = bnh.m3389a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = bnh.m3389a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = bnh.m3389a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = bnh.m3389a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m4748b();
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = bnh.m3389a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = bnh.m3389a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = bnh.m3389a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = bnh.m3389a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m4748b();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m4748b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4747a();
    }
}

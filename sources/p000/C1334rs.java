package p000;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;

/* renamed from: rs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1334rs {
    /* renamed from: a */
    public static int m20102a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getMaxLines();
    }

    /* renamed from: b */
    public static void m20106b(TextView textView, int i) {
        int i2 = Build.VERSION.SDK_INT;
        textView.setAutoSizeTextTypeWithDefaults(i);
    }

    /* renamed from: c */
    public static void m20109c(TextView textView, int i) {
        C1244oj.m19765a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static void m20103a() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public static void m20107b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static void m20104a(TextView textView, int i) {
        int i2 = Build.VERSION.SDK_INT;
        textView.setTextAppearance(i);
    }

    /* renamed from: b */
    public static Drawable[] m20108b(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: a */
    public static void m20105a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}

package com.google.android.gms.identity.common.p050ui.util;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: com.google.android.gms.identity.common.ui.util.UiTextUtil$1 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UiTextUtil$1 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ Resources.Theme f79110a;

    /* renamed from: b */
    final /* synthetic */ int f79111b;

    /* renamed from: c */
    final /* synthetic */ int f79112c;

    /* renamed from: d */
    final /* synthetic */ View.OnClickListener f79113d;

    /* renamed from: e */
    final /* synthetic */ Context f79114e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiTextUtil$1(String str, Resources.Theme theme, int i, int i2, View.OnClickListener onClickListener, Context context) {
        super(str);
        this.f79110a = theme;
        this.f79111b = i;
        this.f79112c = i2;
        this.f79113d = onClickListener;
        this.f79114e = context;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f79113d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        adcm.m50166a(this.f79114e, getURL());
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources.Theme theme = this.f79110a;
        int i = this.f79111b;
        int i2 = this.f79112c;
        int i3 = adcm.f61374a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, new int[]{i2});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}

package com.google.android.libraries.view.text;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandableTextView extends TextView {

    /* renamed from: a */
    public bmxv f150655a;

    /* renamed from: b */
    public ObjectAnimator f150656b;

    /* renamed from: c */
    public boolean f150657c = false;

    /* renamed from: d */
    public boolean f150658d = false;

    /* renamed from: e */
    public int f150659e = 3;

    /* renamed from: f */
    public long f150660f = 400;

    /* renamed from: g */
    private int f150661g = 0;

    public ExpandableTextView(Context context) {
        super(context);
        m117175a(context, null, 0, 0);
    }

    /* renamed from: a */
    private final void m117175a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        this.f150655a = bmvz.f131120a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "maxLines", 0);
        this.f150656b = ofInt;
        ofInt.setDuration(this.f150660f);
        this.f150656b.setInterpolator(new AccelerateInterpolator());
        this.f150657c = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, beqg.f112038a, i, i2);
            this.f150658d = obtainStyledAttributes.getBoolean(1, this.f150658d);
            invalidate();
            this.f150659e = obtainStyledAttributes.getInt(2, this.f150659e);
            long j = (long) obtainStyledAttributes.getInt(0, (int) this.f150660f);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "duration must be non-negative");
            this.f150660f = j;
            this.f150656b.setDuration(j);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16843087}, i, i2);
            if (obtainStyledAttributes2.hasValue(0)) {
                mo70844a(obtainStyledAttributes2.getText(0));
            }
            obtainStyledAttributes2.recycle();
        }
    }

    /* renamed from: a */
    public final boolean mo70845a() {
        return this.f150661g > this.f150659e;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f150657c = true;
        if (this.f150658d) {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f150657c && getVisibility() != 8) {
            int i5 = 0;
            this.f150657c = false;
            CharSequence text = getText();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (measuredWidth <= 0 || text == "") {
                this.f150661g = 0;
            } else {
                TextPaint paint = getPaint();
                int length = text.length();
                this.f150661g = 0;
                int i6 = 0;
                while (i6 < length) {
                    i6 += paint.breakText(text, i6, length, true, (float) measuredWidth, null);
                    this.f150661g++;
                }
            }
            if (this.f150655a.mo66813a()) {
                View view = (View) this.f150655a.mo66814b();
                if (!mo70845a()) {
                    i5 = 4;
                }
                view.setVisibility(i5);
            }
        }
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117175a(context, attributeSet, 0, 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117175a(context, attributeSet, i, 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m117175a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo70844a(CharSequence charSequence) {
        int i;
        int i2;
        if (charSequence == null) {
            charSequence = "";
        }
        setText(charSequence);
        if (charSequence.length() != 0) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        this.f150657c = true;
        if (!this.f150658d) {
            i2 = this.f150659e;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        setMaxLines(i2);
    }
}

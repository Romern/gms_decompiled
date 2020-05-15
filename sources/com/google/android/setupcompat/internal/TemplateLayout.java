package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TemplateLayout extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f151462a;

    /* renamed from: b */
    private final Map f151463b = new HashMap();

    /* renamed from: e */
    public float f151464e;

    /* renamed from: f */
    public ViewTreeObserver.OnPreDrawListener f151465f;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        m117798a(i, i2, null, C0126R.attr.sucLayoutTheme);
    }

    /* renamed from: a */
    private final void m117798a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bixm.f122209f, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        mo64839a(attributeSet, i3);
        super.addView(mo64837a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup a = mo64838a(i2);
        this.f151462a = a;
        if (a != null) {
            mo71346d();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64839a(AttributeSet attributeSet, int i) {
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f151462a.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public View mo71345b(int i) {
        return findViewById(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo71346d() {
    }

    public float getXFraction() {
        return this.f151464e;
    }

    public void setXFraction(float f) {
        this.f151464e = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(((float) width) * f);
        } else if (this.f151465f == null) {
            this.f151465f = new biyd(this);
            getViewTreeObserver().addOnPreDrawListener(this.f151465f);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117798a(0, 0, attributeSet, C0126R.attr.sucLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117798a(0, 0, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo64837a(LayoutInflater layoutInflater, int i) {
        return mo71341a(layoutInflater, 0, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.setupcompat.internal.TemplateLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo71341a(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new bixp(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, (ViewGroup) this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo64838a(int i) {
        return (ViewGroup) findViewById(i);
    }

    /* renamed from: a */
    public final biyr mo71342a(Class cls) {
        return (biyr) this.f151463b.get(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71343a(Class cls, biyr biyr) {
        this.f151463b.put(cls, biyr);
    }
}

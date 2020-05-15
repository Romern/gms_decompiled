package com.android.setupwizardlib;

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

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TemplateLayout extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f7202a;

    /* renamed from: b */
    public float f7203b;

    /* renamed from: c */
    public ViewTreeObserver.OnPreDrawListener f7204c;

    /* renamed from: d */
    private final Map f7205d = new HashMap();

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        m4687a(i, i2, null, C0126R.attr.suwLayoutTheme);
    }

    /* renamed from: a */
    private final void m4687a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, blz.f5152s, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        super.addView(mo4077a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup a = mo4078a(i2);
        this.f7202a = a;
        if (a != null) {
            mo4080a();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4080a() {
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f7202a.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public View mo4081c(int i) {
        return findViewById(i);
    }

    public float getXFraction() {
        return this.f7203b;
    }

    public void setXFraction(float f) {
        this.f7203b = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(((float) width) * f);
        } else if (this.f7204c == null) {
            this.f7204c = new bma(this);
            getViewTreeObserver().addOnPreDrawListener(this.f7204c);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4687a(0, 0, attributeSet, C0126R.attr.suwLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4687a(0, 0, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo4077a(LayoutInflater layoutInflater, int i) {
        return mo4083a(layoutInflater, 0, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.android.setupwizardlib.TemplateLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo4083a(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new bmy(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, (ViewGroup) this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo4078a(int i) {
        if (i == 0) {
            i = 0;
        }
        return (ViewGroup) findViewById(i);
    }

    /* renamed from: a */
    public final bmt mo4084a(Class cls) {
        return (bmt) this.f7205d.get(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4085a(Class cls, bmt bmt) {
        this.f7205d.put(cls, bmt);
    }
}

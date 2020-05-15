package com.android.setupwizardlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.setupwizardlib.view.StatusBarBackgroundLayout;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlifLayout extends TemplateLayout {

    /* renamed from: a */
    private ColorStateList f7197a;

    /* renamed from: d */
    private boolean f7198d;

    /* renamed from: e */
    private ColorStateList f7199e;

    /* renamed from: f */
    private boolean f7200f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: a */
    private void m4677a(AttributeSet attributeSet, int i) {
        ScrollView scrollView;
        mo4085a(bmr.class, new bmr(this, attributeSet, i));
        mo4085a(bms.class, new bms(this, attributeSet, i));
        mo4085a(bmu.class, new bmu(this));
        mo4085a(bmq.class, new bmq(this));
        mo4085a(bmw.class, new bmw());
        View c = mo4081c(C0126R.C0129id.suw_scroll_view);
        if (c instanceof ScrollView) {
            scrollView = (ScrollView) c;
        } else {
            scrollView = null;
        }
        if (scrollView != null) {
            new bmx(scrollView);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, blz.f5140g, i, 0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.f7197a = colorStateList;
            m4678b();
            int i2 = Build.VERSION.SDK_INT;
            ProgressBar progressBar = (ProgressBar) ((bmu) mo4084a(bmu.class)).f5169a.mo4081c(C0126R.C0129id.suw_layout_progress);
            if (progressBar != null) {
                progressBar.setIndeterminateTintList(colorStateList);
                int i3 = Build.VERSION.SDK_INT;
                progressBar.setProgressBackgroundTintList(colorStateList);
            }
        }
        this.f7199e = obtainStyledAttributes.getColorStateList(0);
        m4678b();
        this.f7198d = obtainStyledAttributes.getBoolean(1, true);
        m4678b();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) mo4081c(C0126R.C0129id.suw_layout_footer);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId2 != 0) {
            ViewStub viewStub2 = (ViewStub) mo4081c(C0126R.C0129id.suw_layout_sticky_header);
            viewStub2.setLayoutResource(resourceId2);
            viewStub2.inflate();
        }
        this.f7200f = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        int i4 = Build.VERSION.SDK_INT;
        if (this.f7200f) {
            setSystemUiVisibility(1024);
        }
    }

    /* renamed from: b */
    private final void m4678b() {
        int i;
        Drawable drawable;
        View c = mo4081c(C0126R.C0129id.suw_pattern_bg);
        if (c != null) {
            ColorStateList colorStateList = this.f7199e;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.f7197a;
                i = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.f7198d) {
                drawable = new bly(i);
            } else {
                drawable = new ColorDrawable(i);
            }
            if (c instanceof StatusBarBackgroundLayout) {
                ((StatusBarBackgroundLayout) c).mo4124a(drawable);
            } else {
                c.setBackgroundDrawable(drawable);
            }
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.f7198d = true;
        this.f7200f = true;
        m4677a((AttributeSet) null, (int) C0126R.attr.suwLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7198d = true;
        this.f7200f = true;
        m4677a(attributeSet, (int) C0126R.attr.suwLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7198d = true;
        this.f7200f = true;
        m4677a(attributeSet, i);
    }

    /* renamed from: b */
    public final void mo4079b(int i) {
        TextView a = ((bmr) mo4084a(bmr.class)).mo3286a();
        if (a != null) {
            a.setText(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo4077a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.suw_glif_template;
        }
        return mo4083a(layoutInflater, 2132018318, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo4078a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.suw_layout_content;
        }
        return super.mo4078a(i);
    }
}

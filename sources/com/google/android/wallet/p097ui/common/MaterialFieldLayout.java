package com.google.android.wallet.p097ui.common;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.shared.common.ClickSpan;

/* renamed from: com.google.android.wallet.ui.common.MaterialFieldLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialFieldLayout extends LinearLayout implements View.OnFocusChangeListener, AdapterView.OnItemSelectedListener, View.OnLayoutChangeListener, bkdd, bkda, bkcp, bjxu, bkcm {

    /* renamed from: A */
    private int f152139A;

    /* renamed from: B */
    private int f152140B;

    /* renamed from: C */
    private ColorStateList f152141C;

    /* renamed from: D */
    private CharSequence f152142D;

    /* renamed from: E */
    private CharSequence f152143E;

    /* renamed from: F */
    private Interpolator f152144F;

    /* renamed from: G */
    private boolean f152145G;

    /* renamed from: a */
    public int f152146a;

    /* renamed from: b */
    public View f152147b;

    /* renamed from: c */
    public TextView f152148c;

    /* renamed from: d */
    boolean f152149d;

    /* renamed from: e */
    public TextView f152150e;

    /* renamed from: f */
    protected TextView f152151f;

    /* renamed from: g */
    public CharSequence f152152g;

    /* renamed from: h */
    public int f152153h;

    /* renamed from: i */
    public boolean f152154i;

    /* renamed from: j */
    protected int f152155j;

    /* renamed from: k */
    private final int f152156k;

    /* renamed from: l */
    private final int f152157l;

    /* renamed from: m */
    private final int f152158m;

    /* renamed from: n */
    private final int f152159n;

    /* renamed from: o */
    private final int f152160o;

    /* renamed from: p */
    private final int f152161p;

    /* renamed from: q */
    private final int f152162q;

    /* renamed from: r */
    private final Rect f152163r;

    /* renamed from: s */
    private View f152164s;

    /* renamed from: t */
    private int f152165t;

    /* renamed from: u */
    private int f152166u;

    /* renamed from: v */
    private int f152167v;

    /* renamed from: w */
    private int f152168w;

    /* renamed from: x */
    private bkcj f152169x;

    /* renamed from: y */
    private Drawable f152170y;

    /* renamed from: z */
    private int f152171z;

    public MaterialFieldLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m118668a(float f) {
        C1280ps.m19884a(this.f152148c, (float) mo72055d());
        C1280ps.m19905b(this.f152148c, f);
        C1280ps.m19909c(this.f152148c, f);
    }

    /* renamed from: c */
    private final void m118674c(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = this.f152158m;
        layoutParams.bottomMargin = this.f152159n;
    }

    /* renamed from: d */
    private final void m118675d(View view) {
        if (view instanceof FormEditText) {
            ((FormEditText) view).f151992L = this;
        } else if (view instanceof FormSpinner) {
            ((FormSpinner) view).f152059m = this;
        } else if (view instanceof SelectFieldView) {
            ((SelectFieldView) view).f152200l = this;
        } else if (view instanceof bkew) {
            ((bkew) view).f124123h = this;
        } else if (view instanceof CheckboxView) {
            ((CheckboxView) view).f151923j = this;
        } else if (view instanceof bkdd) {
            m118675d(((bkdd) view).mo65860b());
        } else if (view instanceof NonEditableTextView) {
            ((NonEditableTextView) view).f152177b = this;
        }
    }

    /* renamed from: e */
    private final boolean m118677e(View view) {
        boolean z;
        boolean z2;
        boolean isFocused = view.isFocused();
        if (view instanceof InfoMessageView) {
            z = !TextUtils.isEmpty(((InfoMessageView) view).mo72007c());
            z2 = false;
        } else if (view instanceof FormSpinner) {
            z = !TextUtils.isEmpty(((FormSpinner) view).mo71973c()) || !TextUtils.isEmpty(mo52932m());
            z2 = false;
        } else if (view instanceof FormEditText) {
            if (!((Boolean) bjwe.f123479N.mo54082a()).booleanValue() || !((FormEditText) view).f151984D) {
                z2 = false;
            } else {
                z2 = true;
            }
            z = !TextUtils.isEmpty(((TextView) view).getText()) || !TextUtils.isEmpty(mo52932m());
        } else {
            z = !TextUtils.isEmpty(((TextView) view).getText()) || !TextUtils.isEmpty(mo52932m());
            z2 = false;
        }
        return !TextUtils.isEmpty(this.f152152g) && (z || isFocused) && !z2;
    }

    /* renamed from: f */
    private final void m118678f() {
        int i;
        TextView textView = this.f152148c;
        if (!m118680g()) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
        if (m118680g() || !m118677e(this.f152147b)) {
            if (this.f152169x != null) {
                m118676d(false);
            }
        } else if (this.f152169x != null) {
            m118676d(true);
        }
        m118685l();
    }

    /* renamed from: g */
    private final boolean m118680g() {
        Spinner spinner = (Spinner) this.f152147b;
        if (!(spinner instanceof FormSpinner) || !(spinner.getAdapter() instanceof bkak) || spinner.getSelectedItemPosition() != 0 || !this.f152152g.toString().equals(spinner.getItemAtPosition(0).toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final void m118681h() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (this.f152169x != null) {
            View view = this.f152147b;
            if (view == null || !view.isFocused()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                View view2 = this.f152147b;
                if (view2 instanceof ViewGroup) {
                    View focusedChild = ((ViewGroup) view2).getFocusedChild();
                    if (focusedChild == null || !focusedChild.isFocused()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
            if (TextUtils.isEmpty(this.f152142D) || this.f152150e == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i3 = (!z && !z2) ? this.f152139A : this.f152140B;
            if (z2) {
                this.f152169x.setStroke(i3, this.f152150e.getCurrentTextColor());
                View view3 = this.f152147b;
                if (view3 instanceof FormSpinner) {
                    ((FormSpinner) view3).mo71974c(this.f152150e.getCurrentTextColor());
                    return;
                }
                return;
            }
            View view4 = this.f152147b;
            if (view4 instanceof FormSpinner) {
                FormSpinner formSpinner = (FormSpinner) view4;
                ColorStateList colorStateList = this.f152141C;
                if (formSpinner.f152066t != null) {
                    int a = bkfr.m105542a(formSpinner.getContext(), (int) C0126R.attr.internalUicFormSpinnerDropDownArrowDefaultColor);
                    if (z || !formSpinner.isEnabled()) {
                        if (!z) {
                            i = -16842908;
                        } else {
                            i = 16842908;
                        }
                        if (!formSpinner.isEnabled()) {
                            i2 = -16842910;
                        } else {
                            i2 = 16842910;
                        }
                        a = colorStateList.getColorForState(new int[]{i, i2}, a);
                    }
                    formSpinner.mo71974c(a);
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            this.f152169x.setStroke(i3, this.f152141C);
        }
    }

    /* renamed from: i */
    private final void m118682i() {
        this.f152150e.setTextAppearance(getContext(), this.f152166u);
        int i = this.f152165t;
        if (i > 0) {
            this.f152150e.setWidth(i);
        }
        m118679f(this.f152150e);
        m118672a(this.f152150e, this.f152142D);
        if (this.f152154i) {
            this.f152150e.setGravity(1);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, float):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, int):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, float):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.c(android.view.View, float):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.c(android.view.View, int):void
      ps.c(android.view.View, float):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.a(android.view.View, float):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.a(android.view.View, qh):qh
      ps.a(int, android.view.View):void
      ps.a(android.view.View, android.content.res.ColorStateList):void
      ps.a(android.view.View, android.graphics.PorterDuff$Mode):void
      ps.a(android.view.View, android.graphics.Rect):void
      ps.a(android.view.View, android.graphics.drawable.Drawable):void
      ps.a(android.view.View, java.lang.Runnable):void
      ps.a(android.view.View, java.lang.String):void
      ps.a(android.view.View, oq):void
      ps.a(android.view.View, pi):void
      ps.a(android.view.View, pk):void
      ps.a(android.view.View, qm):void
      ps.a(android.view.View, boolean):void
      ps.a(android.view.View, int):boolean
      ps.a(android.view.View, float):void */
    /* renamed from: j */
    private final void m118683j() {
        C1280ps.m19905b((View) this.f152148c, 1.0f);
        C1280ps.m19909c((View) this.f152148c, 1.0f);
        C1280ps.m19884a((View) this.f152148c, 0.0f);
    }

    /* renamed from: k */
    private final void m118684k() {
        super.setVisibility(!this.f152145G ? this.f152155j : 8);
    }

    /* renamed from: l */
    private final void m118685l() {
        TextView textView;
        TextView textView2;
        if (this.f152168w != 1) {
            int i = Build.VERSION.SDK_INT;
            Drawable background = this.f152147b.getBackground();
            if (background != null) {
                if (C1540zi.m20971b(background)) {
                    background.mutate();
                }
                if (!TextUtils.isEmpty(this.f152142D) && (textView2 = this.f152150e) != null) {
                    background.setColorFilter(C1497xt.m20821a(textView2.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                } else {
                    background.clearColorFilter();
                    this.f152147b.refreshDrawableState();
                }
            }
        } else {
            m118681h();
        }
        if (!TextUtils.isEmpty(this.f152142D) && (textView = this.f152150e) != null) {
            this.f152148c.setTextColor(textView.getCurrentTextColor());
        } else {
            this.f152148c.setTextColor(bkfr.m105588b(getContext()));
        }
    }

    /* renamed from: a */
    public final CharSequence mo65850a() {
        return this.f152143E;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m118670a(view, i, layoutParams, false);
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f152147b;
    }

    /* renamed from: m */
    public final CharSequence mo52932m() {
        if (this.f152149d) {
            return this.f152142D;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f152168w == 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            C1260oz.m19821a(marginLayoutParams, C1260oz.m19820a(marginLayoutParams) + this.f152160o);
            C1260oz.m19823b(marginLayoutParams, C1260oz.m19822b(marginLayoutParams) + this.f152160o);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.widget.TextView, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.widget.TextView, boolean):void */
    public final void onFocusChange(View view, boolean z) {
        mo72051b(true);
        m118681h();
        if (z) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                bkfr.m105575a(textView, true);
                textView.setHint((CharSequence) null);
            }
            int i = Build.VERSION.SDK_INT;
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mo72051b(true);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(i5 == this.f152163r.right && i6 == this.f152163r.bottom)) {
            this.f152163r.right = i5;
            this.f152163r.bottom = i6;
            View view = this.f152147b;
            if (view != null) {
                setTouchDelegate(new TouchDelegate(this.f152163r, view));
            }
        }
        if (this.f152169x != null && !TextUtils.isEmpty(this.f152152g)) {
            int i7 = -((this.f152148c.getHeight() - this.f152148c.getBaseline()) + ((this.f152148c.getBaseline() - this.f152148c.getPaddingTop()) / 2));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f152148c.getLayoutParams();
            if (marginLayoutParams.bottomMargin != i7) {
                marginLayoutParams.bottomMargin = i7;
                this.f152148c.postInvalidate();
                this.f152148c.requestLayout();
            }
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m118676d(m118677e(this.f152148c));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        View view = this.f152147b;
        if (view instanceof TextView) {
            charSequence = ((TextView) view).getHint();
            ((TextView) this.f152147b).setHint(this.f152152g);
        } else {
            charSequence = null;
        }
        super.onMeasure(i, i2);
        View view2 = this.f152147b;
        if (view2 instanceof TextView) {
            ((TextView) view2).setHint(charSequence);
        }
        int measuredWidth = getMeasuredWidth();
        this.f152165t = measuredWidth;
        TextView textView = this.f152150e;
        if (textView != null) {
            textView.setWidth(measuredWidth);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        mo72051b(true);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public final void setVisibility(int i) {
        if (chgu.m148707b()) {
            mo65846c(i);
        } else {
            super.setVisibility(i);
        }
    }

    public MaterialFieldLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m118669a(View view, int i) {
        bkel bkel = new bkel(this, i);
        C1285px m = C1280ps.m19931m(view);
        m.mo15711a((C1286py) null);
        m.mo15707a();
        if (i == 0) {
            C1280ps.m19876K(view);
            int i2 = 0;
            view.setVisibility(0);
            view.measure(-1, -2);
            if (this.f152146a > view.getMeasuredHeight()) {
                i2 = this.f152146a - view.getMeasuredHeight();
            }
            C1280ps.m19885a(this, C1280ps.m19925i(this), getPaddingTop(), C1280ps.m19927j(this), i2);
        }
        C1285px m2 = C1280ps.m19931m(view);
        m2.mo15708a(i != 0 ? 0.0f : 1.0f);
        m2.mo15709a(200L);
        m2.mo15711a(bkel);
        m2.mo15713b();
    }

    /* renamed from: d */
    private final void m118676d(boolean z) {
        if (z) {
            float i = (float) (C1280ps.m19925i(this.f152148c) - this.f152171z);
            float width = (float) ((this.f152148c.getWidth() - C1280ps.m19927j(this.f152148c)) + this.f152171z);
            if (C1280ps.m19923h(this.f152148c) == 1) {
                float width2 = (float) this.f152147b.getWidth();
                float f = width2 - width;
                width = width2 - i;
                i = f;
            }
            this.f152169x.mo65840a(i, width, (float) (-((ViewGroup.MarginLayoutParams) this.f152148c.getLayoutParams()).bottomMargin));
            this.f152148c.addOnLayoutChangeListener(this);
            return;
        }
        this.f152169x.mo65840a(0.0f, 0.0f, 0.0f);
        this.f152148c.removeOnLayoutChangeListener(this);
    }

    /* renamed from: b */
    public final void mo72050b(View view) {
        View view2 = this.f152164s;
        if (view2 == null) {
            TextView textView = this.f152150e;
            if (textView != null) {
                removeView(textView);
            }
        } else {
            removeView(view2);
        }
        this.f152164s = view;
        this.f152150e = (TextView) view.findViewById(C0126R.C0129id.error_text);
        m118682i();
        m118670a(this.f152164s, -1, new ViewGroup.LayoutParams(getLayoutParams()), true);
    }

    /* renamed from: c */
    public final void mo72052c() {
        if (bkfr.m105619g(this.f152147b)) {
            mo72053c(((TextView) this.f152147b).getHint());
        }
    }

    public MaterialFieldLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        this.f152163r = new Rect();
        this.f152165t = 0;
        this.f152168w = 0;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124471i);
        this.f152156k = obtainStyledAttributes.getDimensionPixelSize(6, (int) bkfr.m105541a(4.0f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, (int) bkfr.m105541a(4.0f));
        this.f152157l = obtainStyledAttributes.getDimensionPixelSize(5, (int) bkfr.m105541a(4.0f));
        int i2 = 4;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, (int) bkfr.m105541a(4.0f));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.f152152g = obtainStyledAttributes.getText(2);
        this.f152168w = obtainStyledAttributes.getInt(14, 0);
        TextView textView = new TextView(context);
        this.f152148c = textView;
        textView.setVisibility(8);
        C1280ps.m19885a(this.f152148c, this.f152156k, dimensionPixelSize, this.f152157l, dimensionPixelSize2);
        this.f152148c.setText(this.f152152g);
        if (dimensionPixelSize3 != -1) {
            this.f152148c.setMinHeight(dimensionPixelSize3);
        }
        TextView textView2 = this.f152148c;
        if (C1280ps.m19923h(textView2) != 0) {
            f = (float) (this.f152148c.getWidth() - this.f152156k);
        } else {
            f = (float) this.f152156k;
        }
        C1280ps.m19911d(textView2, f);
        C1280ps.m19916e(this.f152148c, (float) dimensionPixelSize);
        this.f152158m = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f152159n = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f152160o = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f152161p = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.f152162q = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f152148c.setTextAppearance(context, obtainStyledAttributes.getResourceId(8, 16973894));
        this.f152148c.setTextColor(bkfr.m105588b(context));
        this.f152166u = obtainStyledAttributes.getResourceId(1, 16973894);
        this.f152167v = obtainStyledAttributes.getResourceId(0, 16973894);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicMaterialFieldHiddenLabelViewVisibility});
        this.f152153h = obtainStyledAttributes2.getInt(0, 4) == 8 ? 8 : i2;
        obtainStyledAttributes2.recycle();
        this.f152146a = getPaddingBottom();
        mo72054c(false);
        m118670a(this.f152148c, -1, new ViewGroup.LayoutParams(-2, -2), true);
        int i3 = Build.VERSION.SDK_INT;
        this.f152144F = AnimationUtils.loadInterpolator(context, 17563661);
        this.f152155j = getVisibility();
    }

    /* renamed from: c */
    public final void mo65846c(int i) {
        this.f152155j = i;
        m118684k();
    }

    /* renamed from: c */
    public final void mo72053c(CharSequence charSequence) {
        this.f152152g = charSequence;
        View view = this.f152147b;
        if (!(view instanceof FormEditText) || !((FormEditText) view).f151984D) {
            this.f152148c.setText(charSequence);
        }
        if (bkfr.m105619g(this.f152147b)) {
            this.f152147b.setContentDescription(charSequence);
        }
        mo72051b(false);
    }

    /* renamed from: f */
    private final void m118679f(View view) {
        view.setVisibility(8);
        C1280ps.m19906b(view, 2);
        C1280ps.m19885a(view, this.f152156k, 0, this.f152157l, 0);
    }

    /* renamed from: b */
    public final void mo65851b(CharSequence charSequence) {
        this.f152143E = charSequence;
        if (!TextUtils.isEmpty(charSequence) && this.f152151f == null) {
            TextView textView = new TextView(getContext());
            this.f152151f = textView;
            textView.setTextAppearance(getContext(), this.f152167v);
            m118679f(this.f152151f);
            m118670a(this.f152151f, -1, new ViewGroup.LayoutParams(getLayoutParams()), true);
        }
        if (this.f152151f != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.f152151f.setText(charSequence);
            }
            mo72056e();
        }
    }

    /* renamed from: c */
    public final void mo72054c(boolean z) {
        if (this.f152149d != z) {
            this.f152149d = z;
            TextView textView = this.f152150e;
            if (textView != null) {
                C1280ps.m19931m(textView).mo15707a();
            } else if (z) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams());
                layoutParams.width = -1;
                layoutParams.weight = 0.0f;
                this.f152150e = new TextView(getContext());
                m118682i();
                m118670a(this.f152150e, -1, layoutParams, true);
            }
            mo72056e();
            m118685l();
        }
    }

    /* renamed from: e */
    public final void mo72056e() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!this.f152149d || TextUtils.isEmpty(this.f152142D)) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = !TextUtils.isEmpty(this.f152143E);
        TextView textView = this.f152150e;
        if (textView == null || textView.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        TextView textView2 = this.f152151f;
        if (textView2 == null || textView2.getVisibility() != 0) {
            z3 = false;
        }
        if (!z && z2) {
            m118669a(this.f152150e, 8);
        } else if ((z || !z4) && z3) {
            m118669a(this.f152151f, 8);
        } else if (z && !z2) {
            m118669a(this.f152150e, 0);
        } else if (!z && z4 && !z3) {
            m118669a(this.f152151f, 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.MaterialFieldLayout.a(boolean, android.view.View):void
     arg types: [int, android.view.View]
     candidates:
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.view.View, int):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.widget.TextView, java.lang.CharSequence):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.view.View, java.lang.String):void
      bjxu.a(android.view.View, java.lang.String):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(boolean, android.view.View):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int):void}
     arg types: [bkcj, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int):void} */
    /* renamed from: a */
    private final void m118670a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        super.addView(view, i, layoutParams);
        if (z) {
            return;
        }
        if (this.f152147b == null) {
            View b = view instanceof bkdd ? bkft.m105641b(view) : view;
            if (bkfr.m105619g(b)) {
                m118671a((TextView) b);
                m118674c(view);
            } else if (b instanceof Spinner) {
                Spinner spinner = (Spinner) b;
                this.f152147b = spinner;
                this.f152148c.setVisibility(0);
                if (TextUtils.isEmpty(this.f152152g)) {
                    mo72053c(spinner.getPrompt());
                }
                if (spinner instanceof FormSpinner) {
                    FormSpinner formSpinner = (FormSpinner) spinner;
                    mo52929a(formSpinner.getError());
                    formSpinner.f152058l = this;
                    formSpinner.setOnFocusChangeListener(this);
                    formSpinner.setOnItemSelectedListener(this);
                    CharSequence charSequence = this.f152152g;
                    if (charSequence != null) {
                        formSpinner.f152061o = charSequence.toString();
                    }
                }
                m118678f();
                m118674c(view);
            } else if (b instanceof CheckboxView) {
                this.f152147b = (CheckboxView) b;
                this.f152148c.setVisibility(8);
            } else if (b instanceof bkew) {
                m118671a((TextView) ((bkew) b).f124118c);
                m118674c(view);
                this.f152147b = b;
            } else {
                if (bkfr.m105616f(b)) {
                    this.f152147b = b;
                    this.f152148c.setVisibility(0);
                    mo72048a(false, this.f152147b);
                }
                b.setFocusable(true);
            }
            if (this.f152168w == 1 && (bkfr.m105619g(b) || (b instanceof bkew) || (b instanceof FormSpinner))) {
                Resources resources = getResources();
                bkcj bkcj = new bkcj();
                this.f152169x = bkcj;
                bkcj.setColor(C1163lk.m19270b(resources, 17170445, getContext().getTheme()));
                this.f152169x.setCornerRadius(resources.getDimension(C0126R.dimen.mtrl_textinput_box_corner_radius_medium));
                this.f152171z = resources.getDimensionPixelSize(C0126R.dimen.mtrl_textinput_box_label_cutout_padding);
                this.f152139A = resources.getDimensionPixelSize(C0126R.dimen.mtrl_textinput_box_stroke_width_default);
                this.f152140B = resources.getDimensionPixelSize(C0126R.dimen.mtrl_textinput_box_stroke_width_focused);
                this.f152141C = C1391tv.m20458a(getContext(), C0126R.color.wallet_uic_material_field_layout_outline);
                this.f152170y = new InsetDrawable((Drawable) this.f152169x, this.f152140B / 2);
                int i2 = C1280ps.m19925i(this.f152147b);
                int j = C1280ps.m19927j(this.f152147b);
                View view2 = this.f152147b;
                if (view2 instanceof FormSpinner) {
                    Drawable a = C1163lk.m19268a(getResources(), (int) C0126R.C0127drawable.wallet_uic_drop_down_arrow, getContext().getTheme());
                    this.f152170y = new LayerDrawable(new Drawable[]{this.f152170y, a});
                    view2 = this.f152147b;
                    ((FormSpinner) view2).f152066t = a;
                    j = this.f152157l;
                }
                C1280ps.m19890a(view2, this.f152170y);
                m118681h();
                if (bkfr.m105623i(getContext())) {
                    mo72051b(false);
                }
                if (C1280ps.m19923h(this.f152147b) == 0) {
                    this.f152147b.setPadding(Math.max(i2, this.f152156k), this.f152161p, Math.max(j, this.f152157l), this.f152162q);
                } else {
                    C1280ps.m19885a(this.f152147b, Math.max(i2, this.f152156k), this.f152161p, Math.max(j, this.f152157l), this.f152162q);
                }
            }
            m118675d(view);
            return;
        }
        throw new IllegalArgumentException("Field view already exists, can only have one");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo72055d() {
        return (bkfr.m105545a(this.f152147b, this) + this.f152147b.getPaddingTop()) - (this.f152148c.getTop() + this.f152148c.getPaddingTop());
    }

    /* renamed from: b */
    public final void mo72051b(boolean z) {
        if (bkfr.m105619g(this.f152147b) || bkfr.m105616f(this.f152147b)) {
            mo72048a(z, this.f152147b);
            return;
        }
        View view = this.f152147b;
        if (view instanceof Spinner) {
            m118678f();
        } else if (view instanceof bkew) {
            mo72048a(z, ((bkew) view).f124118c);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.MaterialFieldLayout.a(boolean, android.view.View):void
     arg types: [int, android.widget.TextView]
     candidates:
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.view.View, int):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.widget.TextView, java.lang.CharSequence):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(android.view.View, java.lang.String):void
      bjxu.a(android.view.View, java.lang.String):void
      com.google.android.wallet.ui.common.MaterialFieldLayout.a(boolean, android.view.View):void */
    /* renamed from: a */
    private final void m118671a(TextView textView) {
        this.f152147b = textView;
        this.f152148c.setVisibility(0);
        if (TextUtils.isEmpty(this.f152152g)) {
            mo72053c(textView.getHint());
        }
        textView.setContentDescription(this.f152152g);
        if (textView instanceof FormEditText) {
            FormEditText formEditText = (FormEditText) textView;
            mo52929a(formEditText.getError());
            mo65851b(formEditText.mo71936l());
            formEditText.f151990J = this;
            formEditText.f151991K = this;
            formEditText.setOnFocusChangeListener(this);
            formEditText.f152002V = true;
        }
        mo72048a(false, (View) textView);
        textView.addTextChangedListener(new bkej(this, textView));
    }

    /* renamed from: a */
    private final void m118672a(TextView textView, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) bjwe.f123473H.mo54082a()).booleanValue()) {
            textView.setImportantForAccessibility(2);
            if (charSequence == null) {
                textView.setText((CharSequence) null);
                return;
            }
            C1280ps.m19894a(textView, new bkgg(textView));
            ClickSpan.m118372a(textView, charSequence.toString(), this, ((Boolean) bjwe.f123474I.mo54082a()).booleanValue());
            return;
        }
        textView.setText(charSequence);
    }

    /* renamed from: a */
    public static boolean m118673a(View view) {
        if (bkfr.m105619g(view) || ((bkfr.m105616f(view) && !(view instanceof CountDownTextView)) || (view instanceof Spinner) || (view instanceof CheckboxView) || (view instanceof bkew) || (view instanceof MaterialFieldInputLayout) || (((view instanceof bkfl) && m118673a(((bkfl) view).f124144b)) || (((view instanceof SelectFieldView) && m118673a(((SelectFieldView) view).f152194f)) || ((view instanceof bkec) && m118673a(((bkec) view).f124075a)))))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        Context context = getContext();
        Intent a = bkfr.m105546a(context, str);
        try {
            context.startActivity(a);
        } catch (ActivityNotFoundException e) {
            Log.e("MaterialFieldLayout", String.format("Activity was not found for intent %s", a));
        }
    }

    /* renamed from: a */
    public final void mo52929a(CharSequence charSequence) {
        this.f152142D = charSequence;
        if (this.f152149d) {
            if (!TextUtils.isEmpty(charSequence)) {
                m118672a(this.f152150e, charSequence);
            }
            mo72056e();
        } else if (!TextUtils.isEmpty(charSequence)) {
            mo72054c(true);
        } else {
            return;
        }
        mo72051b(true);
        sendAccessibilityEvent(2048);
    }

    /* renamed from: a */
    public final void mo65845a(boolean z) {
        this.f152145G = z;
        m118684k();
    }

    /* renamed from: a */
    public final void mo72048a(boolean z, View view) {
        CharSequence charSequence;
        float f;
        TextView textView;
        this.f152148c.setActivated(view.isFocused());
        InfoMessageView infoMessageView = null;
        if (m118677e(view)) {
            if (view instanceof InfoMessageView) {
                f = ((InfoMessageView) view).mo72009g();
                charSequence = null;
            } else {
                TextView textView2 = (TextView) view;
                float textSize = textView2.getTextSize();
                charSequence = textView2.getHint();
                f = textSize;
            }
            if (this.f152148c.getVisibility() != 0) {
                this.f152148c.setVisibility(0);
                if (!z || !bkfr.m105612e(getContext())) {
                    m118683j();
                } else {
                    m118668a(f / this.f152148c.getTextSize());
                    C1285px m = C1280ps.m19931m(this.f152148c);
                    m.mo15716d(0.0f);
                    m.mo15715c(1.0f);
                    m.mo15714b(1.0f);
                    m.mo15709a(150L);
                    m.mo15711a((C1286py) null);
                    m.mo15710a(this.f152144F);
                    m.mo15713b();
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                view.setMinimumWidth(view.getWidth());
                ((TextView) view).setHint((CharSequence) null);
            }
            if (this.f152169x != null) {
                m118676d(true);
            }
        } else if (this.f152148c.getVisibility() == 0) {
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            if (view instanceof InfoMessageView) {
                infoMessageView = (InfoMessageView) view;
            }
            float g = (textView == null ? infoMessageView.mo72009g() : textView.getTextSize()) / this.f152148c.getTextSize();
            if (!z || !bkfr.m105612e(getContext()) || this.f152148c.getVisibility() == this.f152153h) {
                m118668a(g);
                this.f152148c.setVisibility(this.f152153h);
                if (textView != null) {
                    textView.setHint(this.f152152g);
                    textView.setMinimumWidth(0);
                }
            } else {
                m118683j();
                C1285px m2 = C1280ps.m19931m(this.f152148c);
                m2.mo15716d((float) mo72055d());
                m2.mo15709a(150L);
                m2.mo15714b(g);
                m2.mo15715c(g);
                m2.mo15711a(new bkek(this, textView));
                m2.mo15710a(this.f152144F);
                m2.mo15713b();
            }
            if (this.f152169x != null) {
                m118676d(false);
            }
        }
        m118685l();
    }
}

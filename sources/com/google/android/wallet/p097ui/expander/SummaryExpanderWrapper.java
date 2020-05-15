package com.google.android.wallet.p097ui.expander;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.common.SummaryTitleLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.expander.SummaryExpanderWrapper */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SummaryExpanderWrapper extends RelativeLayout implements ViewTreeObserver.OnGlobalFocusChangeListener, View.OnClickListener, bkih, bkiq, bkii, bkfg, bkin, bkdw, bkcn {

    /* renamed from: a */
    public final bkip f152305a = new bkip();

    /* renamed from: b */
    SummaryTitleLayout f152306b;

    /* renamed from: c */
    SummaryTextLayout f152307c;

    /* renamed from: d */
    ImageView f152308d;

    /* renamed from: e */
    public ViewGroup f152309e;

    /* renamed from: f */
    View f152310f;

    /* renamed from: g */
    public bkfk f152311g;

    /* renamed from: h */
    int f152312h = 1;

    /* renamed from: i */
    int f152313i = -1;

    /* renamed from: j */
    int f152314j = -1;

    /* renamed from: k */
    int f152315k = -1;

    /* renamed from: l */
    public bkdw f152316l;

    /* renamed from: m */
    boolean f152317m;

    /* renamed from: n */
    int f152318n = 1;

    /* renamed from: o */
    private bmoq f152319o;

    /* renamed from: p */
    private String f152320p;

    /* renamed from: q */
    private bmnv f152321q;

    /* renamed from: r */
    private int f152322r = 3;

    public SummaryExpanderWrapper(Context context) {
        super(context);
        m118830a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m118830a(Context context, AttributeSet attributeSet) {
        setFocusable(true);
        setOnClickListener(this);
        bkip bkip = this.f152305a;
        bkip.f124305n = this;
        bkip.mo66028a((bkih) this);
        this.f152305a.f124311t = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124472j);
        this.f152313i = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f152314j = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        this.f152315k = obtainStyledAttributes.getDimensionPixelOffset(2, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private final void m118831k() {
        if (!this.f152305a.f124307p.isEmpty()) {
            List list = this.f152305a.f124307p;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = ((bkde) list.get(i)).f124039e;
                if (!(obj instanceof bkco) || !((bkco) obj).mo65849k()) {
                    break;
                }
                i++;
            }
        }
        if (!this.f152317m) {
            super.setVisibility(0);
            return;
        }
        super.setVisibility(8);
    }

    /* renamed from: l */
    private final void m118832l() {
        int i;
        if (this.f152308d != null) {
            if (!hasFocus()) {
                i = -16842908;
            } else {
                i = 16842908;
            }
            this.f152308d.setImageState(new int[]{i}, true);
            this.f152308d.invalidate();
        }
    }

    /* renamed from: m */
    private final void m118833m() {
        int i;
        int i2;
        String str;
        int i3;
        SummaryTextLayout summaryTextLayout = this.f152307c;
        if (summaryTextLayout != null) {
            if (!summaryTextLayout.f152222f) {
                str = getResources().getString(C0126R.string.wallet_uic_string_list_append_to_end);
            } else {
                str = "%1$s\n%2$s";
            }
            summaryTextLayout.f152217a.setText(bkfr.m105554a(mo52823a(str)));
            summaryTextLayout.mo72110c();
            SummaryTextLayout summaryTextLayout2 = this.f152307c;
            if (!this.f152305a.f124294c) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            summaryTextLayout2.setVisibility(i3);
            SummaryTextLayout summaryTextLayout3 = this.f152307c;
            summaryTextLayout3.f152219c = this.f152312h;
            summaryTextLayout3.mo72110c();
        }
        SummaryTitleLayout summaryTitleLayout = this.f152306b;
        if (summaryTitleLayout != null) {
            int i4 = this.f152312h;
            summaryTitleLayout.f152232d = i4;
            bkfr.m105571a(summaryTitleLayout.f152230b, i4, summaryTitleLayout.getContext(), summaryTitleLayout.f152229a.getText());
            summaryTitleLayout.mo72114a();
            if (TextUtils.isEmpty(this.f152306b.f152229a.getText()) || ((TextUtils.isEmpty(this.f152307c.mo72105a()) && !this.f152305a.f124294c) || !m118834n())) {
                this.f152306b.setVisibility(8);
                i2 = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_spacing_summary_view_above);
                i = 0;
            } else {
                this.f152306b.setVisibility(0);
                i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_spacing_form_field_material_above);
                i2 = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f152307c.getLayoutParams();
            marginLayoutParams.topMargin = i2;
            this.f152307c.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f152308d.getLayoutParams();
            marginLayoutParams2.topMargin = i;
            this.f152308d.setLayoutParams(marginLayoutParams2);
        }
        SummaryTitleLayout summaryTitleLayout2 = this.f152306b;
        if (summaryTitleLayout2 != null && summaryTitleLayout2.getVisibility() == 0) {
            SummaryTitleLayout summaryTitleLayout3 = this.f152306b;
            summaryTitleLayout3.f152233e = this.f152305a.f124294c;
            summaryTitleLayout3.mo72114a();
            this.f152307c.mo72109b(true);
            return;
        }
        SummaryTextLayout summaryTextLayout4 = this.f152307c;
        if (summaryTextLayout4 != null) {
            summaryTextLayout4.mo72109b(false);
        }
    }

    /* renamed from: n */
    private final boolean m118834n() {
        return this.f152318n == 3;
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f152316l;
    }

    /* renamed from: b */
    public final void mo59887b() {
        int i;
        if (this.f152307c != null) {
            if (!this.f152305a.f124294c && hasFocus()) {
                bkfr.m105607d(getRootView());
                if (bkfr.m105579a(getContext())) {
                    bkfr.m105559a(getContext(), this);
                }
            }
            m118833m();
            bkip bkip = this.f152305a;
            List list = bkip.f124307p;
            if (!bkip.f124294c) {
                i = 8;
            } else {
                i = 0;
            }
            bkde.m105345a(list, i);
            bkip bkip2 = this.f152305a;
            if (bkip2.f124294c && this.f152322r == 4) {
                bkip2.mo66034a(true);
            }
        }
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f152305a;
    }

    /* renamed from: c */
    public final void mo59888c() {
        if (getParent() != null && C1280ps.m19868C(this)) {
            if (this.f152305a.f124294c) {
                ViewParent parent = getParent();
                View view = this.f152310f;
                if (view == null) {
                    view = this;
                }
                parent.requestChildFocus(this, view);
                return;
            }
            getParent().requestChildFocus(this, this.f152307c);
        }
    }

    /* renamed from: d */
    public final void mo65847d() {
        if (((Boolean) bjwe.f123478M.mo54082a()).booleanValue()) {
            m118831k();
            m118833m();
        }
    }

    /* renamed from: e */
    public final void mo65952e() {
        bkde.m105353f(this.f152305a.f124307p);
        m118833m();
        mo72171j();
    }

    /* renamed from: f */
    public final void mo65953f() {
        mo72171j();
    }

    /* renamed from: g */
    public final void mo65954g() {
        bmoq bmoq;
        bkfk bkfk = this.f152311g;
        if (bkfk != null && (bmoq = this.f152319o) != null) {
            bkfk.mo65959a(bmoq);
        }
    }

    /* renamed from: h */
    public final void mo66023h() {
        View i = bkde.m105356i(this.f152305a.f124307p);
        if (this.f152310f != i) {
            this.f152310f = i;
            invalidate();
        }
    }

    /* renamed from: i */
    public final void mo72169i() {
        this.f152305a.mo66038c();
    }

    public final boolean isImportantForAccessibility() {
        return super.isImportantForAccessibility() && !this.f152305a.f124294c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo72171j() {
        if (!this.f152305a.f124294c && this.f152322r != 2) {
            mo72159a(1);
            this.f152305a.mo66039c(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        m118832l();
    }

    public void onClick(View view) {
        mo72171j();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        m118832l();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            bkip bkip = this.f152305a;
            if (!bkip.f124304m && bkip.f124294c && !hasFocus()) {
                bkip bkip2 = this.f152305a;
                if (bkip2.f124304m) {
                    bkip2.mo66025a(5);
                } else {
                    bkip2.mo66031a(null, true, 5);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f152310f != null && this.f152308d != null) {
            SummaryTitleLayout summaryTitleLayout = this.f152306b;
            if (summaryTitleLayout == null || summaryTitleLayout.getVisibility() != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f152308d.getLayoutParams();
                if (this.f152305a.f124294c) {
                    View view = this.f152310f;
                    int top = view.getTop();
                    if (view.getParent() instanceof View) {
                        for (View view2 = (View) view.getParent(); view2 != this; view2 = (View) view2.getParent()) {
                            top += view2.getTop();
                            if (!(view2.getParent() instanceof View)) {
                                break;
                            }
                        }
                    }
                    if (this.f152315k == -1 || !bkfr.m105616f(this.f152310f)) {
                        int i8 = this.f152314j;
                        if (i8 == -1) {
                            i8 = marginLayoutParams.topMargin;
                        }
                        i5 = top + i8;
                    } else {
                        i5 = top + this.f152315k;
                    }
                    i6 = this.f152308d.getHeight() + i5;
                } else {
                    int i9 = this.f152313i;
                    if (i9 != -1) {
                        i7 = i9;
                    } else {
                        i7 = marginLayoutParams.topMargin;
                    }
                    i6 = this.f152308d.getHeight() + i5;
                }
                ImageView imageView = this.f152308d;
                imageView.layout(imageView.getLeft(), i5, this.f152308d.getRight(), i6);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.f152305a.mo66026a(bundle.getParcelable("expandableInstanceState"));
        mo72159a(bundle.getInt("editMode", 1));
        m118832l();
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandableInstanceState", this.f152305a.mo66024a());
        bundle.putInt("editMode", this.f152312h);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        SummaryTextLayout summaryTextLayout = this.f152307c;
        if (summaryTextLayout != null) {
            summaryTextLayout.setEnabled(z);
        }
        ImageView imageView = this.f152308d;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        SummaryTitleLayout summaryTitleLayout = this.f152306b;
        if (summaryTitleLayout != null) {
            summaryTitleLayout.setEnabled(z);
        }
    }

    public final void setVisibility(int i) {
        boolean z;
        if (((Boolean) bjwe.f123478M.mo54082a()).booleanValue()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f152317m = z;
            m118831k();
            return;
        }
        super.setVisibility(i);
    }

    /* renamed from: w */
    public final void mo52076w() {
        View view;
        bkde.m105354g(this.f152305a.f124307p);
        ArrayList e = bkde.m105352e(this.f152305a.f124307p);
        if (!e.isEmpty()) {
            int size = e.size();
            for (int i = 0; i < size; i++) {
                Object obj = e.get(i);
                while (true) {
                    view = (View) obj;
                    if (!(view.getParent() instanceof bkdd)) {
                        break;
                    }
                    obj = view.getParent();
                }
                view.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
            }
        }
    }

    /* renamed from: x */
    public final void mo52077x() {
        bkde.m105355h(this.f152305a.f124307p);
    }

    /* renamed from: y */
    public final void mo52078y() {
        m118832l();
    }

    /* renamed from: e */
    public final void mo72168e(int i) {
        this.f152322r = i;
        if (i == 1) {
            this.f152322r = 3;
            i = 3;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            mo72159a(3);
        } else if (i2 != 4) {
            mo72159a(1);
        } else {
            mo72159a(2);
        }
        SummaryTextLayout summaryTextLayout = this.f152307c;
        if (summaryTextLayout != null) {
            int i3 = this.f152322r;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 1 || i4 == 3 || i4 == 5) {
                summaryTextLayout.mo72107a(true);
            } else {
                summaryTextLayout.mo72107a(false);
            }
        }
        m118833m();
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118830a(context, attributeSet);
    }

    /* renamed from: c */
    public final void mo72166c(int i) {
        if (i != -1) {
            SummaryTitleLayout summaryTitleLayout = (SummaryTitleLayout) findViewById(i);
            this.f152306b = summaryTitleLayout;
            if (summaryTitleLayout != null) {
                summaryTitleLayout.f152234f = this;
            }
        }
    }

    /* renamed from: b */
    public final void mo72165b(int i) {
        SummaryTextLayout summaryTextLayout = (SummaryTextLayout) findViewById(i);
        this.f152307c = summaryTextLayout;
        summaryTextLayout.f152221e = this;
        summaryTextLayout.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
    }

    /* renamed from: d */
    public final void mo72167d(int i) {
        ImageView imageView = (ImageView) findViewById(i);
        this.f152308d = imageView;
        if (imageView != null) {
            Drawable mutate = imageView.getDrawable().mutate();
            int i2 = Build.VERSION.SDK_INT;
            C1173lt.m19601a(mutate, bkfr.m105588b(getContext()));
            this.f152308d.setImageDrawable(mutate);
            m118832l();
        }
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118830a(context, attributeSet);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjvh.a(bkdw, bkeo, boolean):void
     arg types: [bkdw, bkeo, int]
     candidates:
      bjvh.a(bmfs, int, com.google.android.wallet.clientlog.LogContext):bkdx
      bjvh.a(bkdw, bkeo, boolean):void */
    /* renamed from: a */
    public final String mo52823a(String str) {
        bmnv bmnv = this.f152321q;
        if (bmnv == null) {
            return TextUtils.isEmpty(this.f152320p) ? bkde.m105344a(this.f152305a.f124307p, str) : this.f152320p;
        }
        bmnw bmnw = ((bmnx) bmnv.f130181a.get(0)).f130190a;
        if (bmnw == null) {
            bmnw = bmnw.f130182d;
        }
        bkeo bkeo = new bkeo(bmnw);
        bjvh.m104701a(this.f152316l, bkeo, true);
        return !bkeo.mo65911a() ? "" : bkeo.mo65913b();
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118830a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo72159a(int i) {
        this.f152312h = i;
        m118833m();
    }

    /* renamed from: a */
    public final void mo72160a(bkde bkde) {
        this.f152305a.mo66027a(bkde);
        Object obj = bkde.f124039e;
        if (obj instanceof bkco) {
            ((bkco) obj).mo65848a(this);
        }
    }

    /* renamed from: a */
    public final void mo72161a(bkdx bkdx, int i, int i2) {
        mo72162a(bkdx, i, i2, -1);
    }

    /* renamed from: a */
    public final void mo72162a(bkdx bkdx, int i, int i2, int i3) {
        mo72167d(i);
        mo72165b(i2);
        mo72166c(i3);
        this.f152311g = bkdx;
        this.f152305a.mo66035b();
        mo72160a(new bkde(bkdx));
        mo72169i();
        bkdx.mo52776bU().mo66032a((bkiq) this);
    }

    /* renamed from: a */
    public final void mo72163a(bmlh bmlh, String str) {
        this.f152320p = null;
        this.f152321q = null;
        if (bmlh != null) {
            int i = bmlh.f129937a;
            if ((i & 1) != 0) {
                bmnv bmnv = bmlh.f129938b;
                if (bmnv == null) {
                    bmnv = bmnv.f130179b;
                }
                this.f152321q = bmnv;
            } else if ((i & 2) != 0 && bmlh.f129939c) {
                this.f152320p = str;
            }
        }
        SummaryTitleLayout summaryTitleLayout = this.f152306b;
        if (summaryTitleLayout != null) {
            summaryTitleLayout.f152229a.setText(str);
            bkfr.m105571a(summaryTitleLayout.f152230b, summaryTitleLayout.f152232d, summaryTitleLayout.getContext(), summaryTitleLayout.f152229a.getText());
        }
        m118833m();
    }

    /* renamed from: a */
    public final void mo72164a(bmlv bmlv) {
        bmno bmno;
        int i = 1;
        if (bmlv.f129966b == 17) {
            int a = bmlj.m108146a(((bmlk) bmlv.f129967c).f129943a);
            if (a == 0) {
                a = 1;
            }
            this.f152318n = a;
            SummaryTextLayout summaryTextLayout = this.f152307c;
            summaryTextLayout.f152223g = m118834n();
            summaryTextLayout.mo72108b();
        }
        if ((bmlv.f129965a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            bmoq bmoq = bmlv.f129972h;
            if (bmoq == null) {
                bmoq = bmoq.f130246g;
            }
            this.f152319o = bmoq;
            SummaryTitleLayout summaryTitleLayout = this.f152306b;
            if (summaryTitleLayout != null) {
                ImageLoader b = bjvn.m104721b(getContext());
                if (bmoq == null) {
                    summaryTitleLayout.f152231c.setVisibility(8);
                } else {
                    summaryTitleLayout.f152231c.setVisibility(0);
                    ImageWithCaptionView imageWithCaptionView = summaryTitleLayout.f152231c;
                    if ((bmoq.f130248a & 1) != 0) {
                        bmno = bmoq.f130249b;
                        if (bmno == null) {
                            bmno = bmno.f130138m;
                        }
                    } else {
                        bmno = null;
                    }
                    imageWithCaptionView.mo71992a(bmno, b, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                }
            }
        }
        int a2 = bmqo.m108290a(bmlv.f129976l);
        if (a2 != 0) {
            i = a2;
        }
        mo72168e(i);
        bmlh bmlh = bmlv.f129977m;
        if (bmlh == null) {
            bmlh = bmlh.f129935d;
        }
        mo72163a(bmlh, bmlv.f129970f);
    }
}

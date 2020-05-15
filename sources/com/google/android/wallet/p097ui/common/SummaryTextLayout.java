package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: com.google.android.wallet.ui.common.SummaryTextLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SummaryTextLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public FormEditText f152217a;

    /* renamed from: b */
    ImageView f152218b;

    /* renamed from: c */
    public int f152219c;

    /* renamed from: d */
    boolean f152220d;

    /* renamed from: e */
    public bkfg f152221e;

    /* renamed from: f */
    public boolean f152222f;

    /* renamed from: g */
    public boolean f152223g;

    /* renamed from: h */
    int f152224h = -1;

    /* renamed from: i */
    int f152225i = -1;

    /* renamed from: j */
    private MaterialFieldLayout f152226j;

    /* renamed from: k */
    private int f152227k = -1;

    /* renamed from: l */
    private int f152228l = -1;

    public SummaryTextLayout(Context context) {
        super(context);
        m118759a(context, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.wallet.ui.common.SummaryTextLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m118759a(Context context, AttributeSet attributeSet) {
        String str;
        int i = C0126R.C0128layout.view_summary_text_layout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124473k);
            str = obtainStyledAttributes.getString(3);
            this.f152224h = obtainStyledAttributes.getResourceId(0, -1);
            this.f152225i = obtainStyledAttributes.getResourceId(2, -1);
            i = obtainStyledAttributes.getResourceId(4, C0126R.C0128layout.view_summary_text_layout);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
        this.f152217a = (FormEditText) inflate.findViewById(C0126R.C0129id.summary_text_view_text);
        this.f152226j = (MaterialFieldLayout) inflate.findViewById(C0126R.C0129id.summary_text_view_material_field_layout);
        C1280ps.m19894a(this.f152217a, new bkfi());
        this.f152218b = (ImageView) inflate.findViewById(C0126R.C0129id.summary_text_view_edit);
        if (this.f152217a.getPaddingBottom() < this.f152217a.getPaddingTop()) {
            ImageView imageView = this.f152218b;
            C1280ps.m19885a(imageView, C1280ps.m19925i(imageView), (this.f152218b.getPaddingTop() + this.f152217a.getPaddingTop()) - this.f152217a.getPaddingBottom(), C1280ps.m19927j(this.f152218b), this.f152218b.getPaddingBottom());
        } else {
            ImageView imageView2 = this.f152218b;
            C1280ps.m19885a(imageView2, C1280ps.m19925i(imageView2), this.f152218b.getPaddingTop(), C1280ps.m19927j(this.f152218b), (this.f152218b.getPaddingBottom() + this.f152217a.getPaddingBottom()) - this.f152217a.getPaddingTop());
        }
        this.f152217a.setInputType(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        this.f152217a.setKeyListener(null);
        this.f152217a.setEllipsize(TextUtils.TruncateAt.END);
        mo72108b();
        if (!TextUtils.isEmpty(str)) {
            this.f152217a.setHint(str);
        }
        this.f152217a.addTextChangedListener(new bkfh(this));
        mo72110c();
        this.f152217a.setOnClickListener(this);
        this.f152218b.setOnClickListener(this);
    }

    /* renamed from: d */
    private final void m118760d() {
        ImageView imageView = this.f152218b;
        int i = 8;
        if (!this.f152220d && !TextUtils.isEmpty(mo72105a()) && this.f152219c != 3) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo72108b() {
        int i;
        FormEditText formEditText = this.f152217a;
        if (formEditText != null) {
            formEditText.setSingleLine(!this.f152222f);
            if (!this.f152223g || (i = this.f152225i) == -1) {
                int i2 = this.f152224h;
                if (i2 != -1) {
                    C1334rs.m20104a(this.f152217a, i2);
                    return;
                }
                return;
            }
            C1334rs.m20104a(this.f152217a, i);
        }
    }

    /* renamed from: c */
    public final void mo72110c() {
        if (TextUtils.isEmpty(this.f152217a.getText())) {
            if (this.f152217a.getBackground() != null) {
                this.f152217a.getBackground().setAlpha(255);
            }
            setFocusableInTouchMode(true);
        } else {
            bkfr.m105571a(this.f152218b, this.f152219c, getContext(), this.f152217a.getHint());
            if (this.f152217a.getBackground() != null) {
                this.f152217a.getBackground().setAlpha(0);
            }
            setFocusable(false);
            MaterialFieldLayout materialFieldLayout = this.f152226j;
            if (materialFieldLayout != null) {
                materialFieldLayout.setPadding(materialFieldLayout.getPaddingLeft(), 0, this.f152226j.getPaddingRight(), 0);
                this.f152226j.f152148c.setVisibility(8);
                int paddingTop = this.f152217a.getPaddingTop();
                int paddingBottom = this.f152217a.getPaddingBottom();
                if (!bkfr.m105623i(getContext())) {
                    paddingTop = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_summary_text_material_style_top_bottom_padding);
                    paddingBottom = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_summary_text_material_style_top_bottom_padding);
                }
                C1280ps.m19885a(this.f152217a, getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_summary_text_material_style_start_padding), paddingTop, C1280ps.m19927j(this.f152217a), paddingBottom);
            }
        }
        m118760d();
    }

    public void onClick(View view) {
        bkfg bkfg = this.f152221e;
        if (bkfg == null) {
            return;
        }
        if (view == this.f152218b && this.f152219c == 2) {
            bkfg.mo65952e();
        } else {
            bkfg.mo65953f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f152227k || i6 != this.f152228l) {
            this.f152227k = i5;
            this.f152228l = i6;
            Rect rect = new Rect();
            rect.top = 0;
            rect.bottom = getHeight();
            if (this.f152217a.getLeft() < this.f152218b.getLeft()) {
                rect.left = this.f152217a.getRight();
                rect.right = getWidth();
            } else {
                rect.left = 0;
                rect.right = this.f152217a.getLeft();
            }
            setTouchDelegate(new TouchDelegate(rect, this.f152218b));
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        FormEditText formEditText = this.f152217a;
        if (formEditText != null) {
            formEditText.setEnabled(z);
        }
        ImageView imageView = this.f152218b;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
    }

    public SummaryTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118759a(context, attributeSet);
    }

    public SummaryTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118759a(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo72109b(boolean z) {
        this.f152220d = z;
        m118760d();
    }

    /* renamed from: a */
    public final CharSequence mo72105a() {
        return this.f152217a.getText();
    }

    /* renamed from: a */
    public final void mo72106a(CharSequence charSequence) {
        this.f152217a.setHint(charSequence);
    }

    /* renamed from: a */
    public final void mo72107a(boolean z) {
        this.f152222f = z;
        mo72108b();
    }
}

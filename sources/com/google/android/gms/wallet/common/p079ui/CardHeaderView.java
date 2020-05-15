package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: com.google.android.gms.wallet.common.ui.CardHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardHeaderView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    TextView f110062a;

    /* renamed from: b */
    TextView f110063b;

    /* renamed from: c */
    public LinearLayout f110064c;

    /* renamed from: d */
    public LinearLayout f110065d;

    /* renamed from: e */
    public ImageView f110066e;

    /* renamed from: f */
    public TransitionDrawable f110067f;

    /* renamed from: g */
    public ImageWithCaptionView f110068g;

    /* renamed from: h */
    boolean f110069h = true;

    /* renamed from: i */
    public boolean f110070i;

    /* renamed from: j */
    public bmep f110071j;

    /* renamed from: k */
    public bkfk f110072k;

    /* renamed from: l */
    public String f110073l;

    /* renamed from: m */
    public String f110074m;

    public CardHeaderView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final CharSequence mo59852a() {
        return !this.f110069h ? this.f110074m : this.f110073l;
    }

    /* renamed from: b */
    public final void mo59855b(boolean z) {
        if (this.f110070i) {
            int i = 0;
            this.f110066e.setVisibility(0);
            this.f110066e.setContentDescription(mo59852a());
            if (z) {
                i = 400;
            }
            if (this.f110069h) {
                this.f110067f.reverseTransition(i);
            } else {
                this.f110067f.startTransition(i);
            }
        } else {
            this.f110066e.setVisibility(8);
        }
    }

    public void onClick(View view) {
        bkfk bkfk;
        if (view == this.f110068g && (bkfk = this.f110072k) != null) {
            bmoq bmoq = this.f110071j.f128988i;
            if (bmoq == null) {
                bmoq = bmoq.f130246g;
            }
            bkfk.mo65959a(bmoq);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(C0126R.C0129id.title);
        this.f110062a = textView;
        C1280ps.m19893a(textView, "excludeViewFromChangeBounds");
        this.f110062a.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.subtitle);
        this.f110063b = textView2;
        textView2.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
        LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.collapsed_image_container);
        this.f110064c = linearLayout;
        linearLayout.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0126R.C0129id.expanded_image_container);
        this.f110065d = linearLayout2;
        linearLayout2.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
        this.f110066e = (ImageView) findViewById(C0126R.C0129id.expand_collapse_icon);
        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) findViewById(C0126R.C0129id.tooltip_view);
        this.f110068g = imageWithCaptionView;
        imageWithCaptionView.setDefaultImageResId(bkfr.m105543a(getContext(), (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, -1));
        this.f110068g.setOnClickListener(this);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public CardHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo59853a(String str) {
        bkfr.m105573a(this.f110062a, str);
    }

    public CardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo59854a(boolean z) {
        int i;
        String str;
        LinearLayout linearLayout = this.f110065d;
        int i2 = 8;
        if (!this.f110069h) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        LinearLayout linearLayout2 = this.f110064c;
        if (!this.f110069h) {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        mo59855b(z);
        bmep bmep = this.f110071j;
        if (bmep != null) {
            if (this.f110069h) {
                str = bmep.f128981b == 2 ? (String) bmep.f128982c : "";
            } else {
                str = bmep.f128986g;
            }
            mo59853a(str);
            bkfr.m105573a(this.f110063b, this.f110069h ? this.f110071j.f128984e : this.f110071j.f128987h);
        }
    }
}

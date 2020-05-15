package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: com.google.android.gms.wallet.common.ui.CollapsibleCardContentsView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CollapsibleCardContentsView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public Activity f110075a;

    /* renamed from: b */
    atj f110076b;

    /* renamed from: c */
    asw f110077c;

    /* renamed from: d */
    public boolean f110078d;

    /* renamed from: e */
    public FrameLayout f110079e;

    /* renamed from: f */
    public LinearLayout f110080f;

    /* renamed from: g */
    public CardHeaderView f110081g;

    /* renamed from: h */
    public int f110082h = 1;

    public CollapsibleCardContentsView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final atj m93893a() {
        View findViewById;
        if (this.f110076b == null && (findViewById = this.f110075a.findViewById(16908290)) != null) {
            this.f110076b = new atj();
            asw asw = new asw((ViewGroup) findViewById);
            this.f110077c = asw;
            asw.f2143b = new awgo(this);
            this.f110076b.mo2489a(this.f110077c, bkfr.m105551a());
        }
        return this.f110076b;
    }

    public void onClick(View view) {
        this.f110078d = !this.f110078d;
        CardHeaderView cardHeaderView = this.f110081g;
        if (cardHeaderView != null) {
            cardHeaderView.requestFocus();
        }
        if (!bkfr.m105612e(this.f110075a) || m93893a() == null) {
            mo59859a(false);
        } else {
            m93893a().mo2488a(this.f110077c);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110079e = (FrameLayout) findViewById(C0126R.C0129id.collapsed_card_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.expanded_card_container);
        this.f110080f = linearLayout;
        linearLayout.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        int i = this.f110082h;
        if (i == 2 || i == 4) {
            this.f110078d = bundle.getBoolean("expandedState");
            mo59859a(false);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("expandedState", this.f110078d);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f110079e.setEnabled(z);
    }

    public CollapsibleCardContentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CollapsibleCardContentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.gms.wallet.common.ui.CardHeaderView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: a */
    public final void mo59859a(boolean z) {
        int i;
        CardHeaderView cardHeaderView = this.f110081g;
        if (cardHeaderView != null) {
            cardHeaderView.f110069h = this.f110078d;
            cardHeaderView.mo59854a(z);
            this.f110079e.setContentDescription(this.f110081g.mo59852a());
            C1280ps.m19906b((View) this.f110081g, 2);
        }
        LinearLayout linearLayout = this.f110080f;
        if (!this.f110078d) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }
}

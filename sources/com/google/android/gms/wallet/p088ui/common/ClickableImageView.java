package com.google.android.gms.wallet.p088ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.google.android.gms.wallet.ui.common.ClickableImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClickableImageView extends ImageView implements View.OnClickListener, bjwg {

    /* renamed from: a */
    bjwf f110434a = new bjwf();

    public ClickableImageView(Context context) {
        super(context);
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f110434a;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return null;
    }

    public void onClick(View view) {
        this.f110434a.mo65585a();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
    }

    public ClickableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

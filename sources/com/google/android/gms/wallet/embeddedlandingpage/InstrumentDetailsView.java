package com.google.android.gms.wallet.embeddedlandingpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentDetailsView extends RelativeLayout {

    /* renamed from: a */
    public ImageWithCaptionView f110151a;

    /* renamed from: b */
    public TextView f110152b;

    public InstrumentDetailsView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo59903a(View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(3, i);
        bkfr.m105592b();
        layoutParams.addRule(17, this.f110151a.getId());
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110151a = (ImageWithCaptionView) findViewById(C0126R.C0129id.image);
        this.f110152b = (TextView) findViewById(C0126R.C0129id.label);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public InstrumentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstrumentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

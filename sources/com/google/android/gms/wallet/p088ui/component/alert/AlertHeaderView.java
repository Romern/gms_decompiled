package com.google.android.gms.wallet.p088ui.component.alert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: com.google.android.gms.wallet.ui.component.alert.AlertHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertHeaderView extends LinearLayout {

    /* renamed from: a */
    ImageWithCaptionView f110481a;

    /* renamed from: b */
    InfoMessageView f110482b;

    /* renamed from: c */
    ImageView f110483c;

    /* renamed from: d */
    ImageView f110484d;

    public AlertHeaderView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110481a = (ImageWithCaptionView) findViewById(C0126R.C0129id.icon);
        this.f110482b = (InfoMessageView) findViewById(C0126R.C0129id.description);
        this.f110483c = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f110484d = (ImageView) findViewById(C0126R.C0129id.collapse_icon);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public AlertHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

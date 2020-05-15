package com.google.android.gms.smartdevice.d2d.p065ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceListItemView extends CardView {

    /* renamed from: g */
    public ImageView f108010g;

    /* renamed from: h */
    public TextView f108011h;

    /* renamed from: i */
    public final boolean f108012i = cgpj.m146467b();

    /* renamed from: j */
    private int f108013j;

    public DeviceListItemView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo59122a(String str) {
        this.f108011h.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.f108012i) {
            this.f108011h = (TextView) findViewById(16908309);
            findViewById(C0126R.C0129id.center_aligned_layout).setVisibility(8);
        } else {
            findViewById(16908309).setVisibility(8);
            View findViewById = findViewById(C0126R.C0129id.center_aligned_layout);
            findViewById.setVisibility(0);
            this.f108010g = (ImageView) findViewById.findViewById(16908294);
            this.f108011h = (TextView) findViewById.findViewById(16908308);
        }
        if (this.f108011h != null) {
            this.f108013j = getResources().getDimensionPixelSize(C0126R.dimen.smartdevice_device_item_padding);
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = this.f108011h.getMeasuredWidth();
        if (this.f108012i) {
            Layout layout = this.f108011h.getLayout();
            layout.getLineCount();
            float dimension = getResources().getDimension(C0126R.dimen.smartdevice_device_item_icon_padding);
            do {
                if (layout.getLineCount() > 1 || ((float) measuredWidth2) >= ((float) measuredWidth) - (dimension + dimension)) {
                    this.f108011h.setTextSize(0, this.f108011h.getTextSize() * 0.9f);
                    measureChild(this.f108011h, i, i2);
                    layout = this.f108011h.getLayout();
                    measuredWidth2 = this.f108011h.getMeasuredWidth();
                } else {
                    return;
                }
            } while (measuredWidth2 != 0);
            return;
        }
        ImageView imageView = this.f108010g;
        if (imageView != null) {
            int measuredWidth3 = imageView.getMeasuredWidth() + this.f108013j;
            int i3 = measuredWidth - (measuredWidth3 + measuredWidth3);
            while (measuredWidth2 >= i3) {
                this.f108011h.setTextSize(0, this.f108011h.getTextSize() * 0.9f);
                measureChild(this.f108011h, i, i2);
                measuredWidth2 = this.f108011h.getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    return;
                }
            }
        }
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

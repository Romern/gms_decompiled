package com.google.android.gms.locationsharing.settings;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.LocationShare;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationShareView extends LinearLayout {

    /* renamed from: a */
    public LocationShare f79700a;

    /* renamed from: b */
    public TextView f79701b;

    /* renamed from: c */
    public TextView f79702c;

    /* renamed from: d */
    public ImageView f79703d;

    /* renamed from: e */
    public ImageView f79704e;

    /* renamed from: f */
    public aeux f79705f;

    /* renamed from: g */
    public aeuw f79706g;

    public LocationShareView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo43803a() {
        TextView textView = this.f79702c;
        if (textView != null) {
            textView.setText(aeya.m52674a(getContext(), this.f79700a.f79628b));
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.f79701b == null) {
            this.f79701b = (TextView) findViewById(C0126R.C0129id.name);
            this.f79702c = (TextView) findViewById(C0126R.C0129id.time);
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.avatar);
            this.f79703d = imageView;
            imageView.setImageBitmap(aeti.m52533a(getContext()));
            ImageView imageView2 = (ImageView) findViewById(C0126R.C0129id.cancel_icon);
            this.f79704e = imageView2;
            imageView2.setColorFilter(getResources().getColor(C0126R.color.material_grey_500), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public LocationShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo43804a(int i) {
        this.f79703d.setPadding(i, i, i, i);
    }
}

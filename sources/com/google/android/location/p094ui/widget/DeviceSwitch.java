package com.google.android.location.p094ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.location.reporting.server.RemoteDevice;

/* renamed from: com.google.android.location.ui.widget.DeviceSwitch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSwitch extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public RemoteDevice f150949a;

    /* renamed from: b */
    public CompoundButton f150950b;

    /* renamed from: c */
    public ProgressBar f150951c;

    /* renamed from: d */
    public TextView f150952d;

    /* renamed from: e */
    public TextView f150953e;

    /* renamed from: f */
    public bhbc f150954f;

    public DeviceSwitch(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m117386a(boolean z) {
        setOnClickListener(null);
        this.f150950b.setOnCheckedChangeListener(null);
        postDelayed(new bhbb(this), 300);
        bhbc bhbc = this.f150954f;
        if (bhbc != null) {
            bhbc.mo63514a(this.f150949a, z);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m117386a(this.f150950b.isChecked());
    }

    public void onClick(View view) {
        m117386a(!this.f150950b.isChecked());
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DeviceSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

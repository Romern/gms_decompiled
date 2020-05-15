package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ToggleButtonPreference extends TwoTargetPreference {

    /* renamed from: a */
    public Button f31238a;

    /* renamed from: b */
    public Button f31239b;

    /* renamed from: c */
    public vuc f31240c;

    /* renamed from: d */
    private final View.OnClickListener f31241d = new vut(this);

    public ToggleButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        LinearLayout linearLayout = (LinearLayout) aoq.mo2241c(16908312);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setPadding(0, 0, 0, 0);
        this.f31238a = (Button) aoq.mo2241c(C0126R.C0129id.on_button);
        this.f31239b = (Button) aoq.mo2241c(C0126R.C0129id.off_button);
        this.f31238a.setOnClickListener(this.f31241d);
        this.f31239b.setOnClickListener(this.f31241d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo18369g() {
        return C0126R.C0128layout.car_preference_widget_toggle_button;
    }

    /* renamed from: i */
    public final void mo18374i(boolean z) {
        if (z) {
            this.f31238a.setVisibility(0);
            this.f31239b.setVisibility(8);
            return;
        }
        this.f31238a.setVisibility(8);
        this.f31239b.setVisibility(0);
    }
}

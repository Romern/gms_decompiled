package com.google.android.gms.drivingmode;

import android.content.Context;
import android.support.p002v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MasterSwitchPreference extends TwoTargetPreference {

    /* renamed from: a */
    public SwitchCompat f31234a;

    /* renamed from: b */
    public boolean f31235b;

    /* renamed from: c */
    public CompoundButton.OnCheckedChangeListener f31236c;

    /* renamed from: d */
    private boolean f31237d = true;

    public MasterSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        View c = aoq.mo2241c(16908312);
        if (c != null) {
            c.setOnClickListener(new vur(this));
        }
        SwitchCompat switchCompat = (SwitchCompat) aoq.mo2241c(C0126R.C0129id.switch_widget);
        this.f31234a = switchCompat;
        switchCompat.setContentDescription(this.f1602r);
        this.f31234a.setChecked(this.f31235b);
        this.f31234a.setEnabled(this.f31237d);
        this.f31234a.setOnCheckedChangeListener(this.f31236c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo18369g() {
        return C0126R.C0128layout.car_preference_widget_master_switch;
    }

    /* renamed from: i */
    public final void mo18373i(boolean z) {
        this.f31235b = z;
        SwitchCompat switchCompat = this.f31234a;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }
}

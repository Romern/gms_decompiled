package com.google.android.gms.drivingmode;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GearPreference extends TwoTargetPreference implements View.OnClickListener {

    /* renamed from: a */
    public vub f31232a;

    /* renamed from: b */
    private boolean f31233b = true;

    public GearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        View c = aoq.mo2241c(C0126R.C0129id.settings_button);
        if (this.f31232a != null) {
            c.setOnClickListener(this);
        } else {
            c.setOnClickListener(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo18369g() {
        return C0126R.C0128layout.car_preference_widget_gear;
    }

    /* renamed from: i */
    public final void mo18370i(boolean z) {
        this.f31233b = z;
        mo1958b();
    }

    public void onClick(View view) {
        vub vub;
        if (view.getId() == C0126R.C0129id.settings_button && (vub = this.f31232a) != null) {
            vuf vuf = vub.f49978a;
            Intent intent = vub.f49979b;
            vuf.f49984d.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_PREFERENCE_GEAR_CLICKED);
            vuf.startActivityForResult(intent, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo18372v() {
        return !this.f31233b;
    }

    /* renamed from: a */
    public final void mo18368a(vub vub) {
        this.f31232a = vub;
        mo1958b();
    }
}

package com.google.android.gms.trustagent.trustlet.device.p073ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesFragment$DisabledViewPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TrustedDevicesFragment$DisabledViewPreference extends Preference {

    /* renamed from: a */
    public boolean f109211a = true;

    public TrustedDevicesFragment$DisabledViewPreference(Context context) {
        super(context);
        this.f1571A = C0126R.C0128layout.preference_material;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59572a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                mo59572a(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        boolean z = false;
        if (mo2005i() && this.f109211a) {
            z = true;
        }
        mo59572a(aoq.f201a, z);
    }
}

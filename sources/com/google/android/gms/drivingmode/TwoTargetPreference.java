package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TwoTargetPreference extends Preference {
    public TwoTargetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1572B = mo18369g();
    }

    /* renamed from: a */
    public void mo1956a(aoq aoq) {
        int i;
        super.mo1956a(aoq);
        View c = aoq.mo2241c(16908312);
        boolean v = mo18372v();
        if (c != null) {
            if (!v) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo18369g() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo18372v() {
        return mo18369g() == 0;
    }
}

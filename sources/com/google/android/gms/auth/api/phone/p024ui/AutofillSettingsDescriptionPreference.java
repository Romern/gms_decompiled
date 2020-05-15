package com.google.android.gms.auth.api.phone.p024ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;

/* renamed from: com.google.android.gms.auth.api.phone.ui.AutofillSettingsDescriptionPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillSettingsDescriptionPreference extends Preference {
    public AutofillSettingsDescriptionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        TextView textView = (TextView) aoq.mo2241c(16908304);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}

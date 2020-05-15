package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;

/* renamed from: com.google.android.gms.backup.settings.ui.EnhancedSummaryPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnhancedSummaryPreference extends Preference {
    public EnhancedSummaryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        TextView textView = (TextView) aoq.mo2241c(16908304);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setTextDirection(5);
        super.mo1956a(aoq);
    }
}

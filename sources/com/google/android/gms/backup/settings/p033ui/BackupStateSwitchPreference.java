package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: com.google.android.gms.backup.settings.ui.BackupStateSwitchPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupStateSwitchPreference extends SwitchPreferenceCompat {

    /* renamed from: c */
    public TextView f29113c;

    /* renamed from: d */
    public TextView f29114d;

    /* renamed from: e */
    public int f29115e;

    /* renamed from: f */
    public int f29116f;

    public BackupStateSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        TextView textView = (TextView) aoq.mo2241c(16908310);
        this.f29113c = textView;
        this.f29115e = textView.getCurrentTextColor();
        TextView textView2 = (TextView) aoq.mo2241c(16908304);
        this.f29114d = textView2;
        this.f29116f = textView2.getCurrentTextColor();
    }
}

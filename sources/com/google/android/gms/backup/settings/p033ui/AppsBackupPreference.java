package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: com.google.android.gms.backup.settings.ui.AppsBackupPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppsBackupPreference extends BackupPreference {
    public AppsBackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!ccoa.m130956b()) {
            TypedArray obtainStyledAttributes = this.f1595k.obtainStyledAttributes(attributeSet, eoi.f15389a);
            try {
                this.f1605u = obtainStyledAttributes.getString(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}

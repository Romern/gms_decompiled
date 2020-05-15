package com.google.android.gms.backup.settings.p033ui;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.backup.settings.ui.BackupPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BackupPreference extends Preference {
    public BackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo17255a(mvp.f34817d);
    }

    /* renamed from: a */
    public List mo17254a(Account account) {
        return Collections.emptyList();
    }

    /* renamed from: g */
    public boolean mo17256g() {
        return true;
    }

    /* renamed from: a */
    public final void mo17255a(mvp mvp) {
        mo1966a((CharSequence) mvp.mo20275a(this.f1595k));
    }
}

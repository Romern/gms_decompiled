package com.google.android.gms.backup.settings.p033ui;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.backup.settings.ui.ContactsBackupPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactsBackupPreference extends BackupPreference {

    /* renamed from: a */
    public static final lvn f29117a = new lvn("ContactsBackupPreference");

    /* renamed from: b */
    public final aoxr f29118b;

    /* renamed from: c */
    public Account f29119c;

    public ContactsBackupPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aoxb.m69771a(context));
    }

    /* renamed from: a */
    public final List mo17254a(Account account) {
        this.f29119c = account;
        return Arrays.asList(new mvy(this, account));
    }

    public ContactsBackupPreference(Context context, AttributeSet attributeSet, aoxr aoxr) {
        super(context, attributeSet);
        this.f29118b = aoxr;
    }

    /* renamed from: g */
    public final boolean mo17256g() {
        int i = Build.VERSION.SDK_INT;
        return !ccmh.m130652b();
    }
}

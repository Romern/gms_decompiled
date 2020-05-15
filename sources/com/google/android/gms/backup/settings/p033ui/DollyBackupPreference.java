package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* renamed from: com.google.android.gms.backup.settings.ui.DollyBackupPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DollyBackupPreference extends BackupPreference {

    /* renamed from: c */
    private static final lvn f29131c = new lvn("DollyBackupPreference");

    /* renamed from: d */
    private static final lvr f29132d = lvr.f33060a;

    /* renamed from: a */
    public final int f29133a;

    /* renamed from: b */
    public final int f29134b;

    /* JADX INFO: finally extract failed */
    public DollyBackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = this.f1595k.obtainStyledAttributes(attributeSet, eoi.f15393e);
        try {
            this.f29133a = obtainStyledAttributes.getResourceId(0, -1);
            this.f29134b = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (!ccoa.m130956b() && this.f29133a != -1) {
                this.f1600p = new mwf(this);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: g */
    public final boolean mo17256g() {
        char c;
        if (ccoa.f179599a.mo6606a().mo76517h() && !mcl.m24877a()) {
            return false;
        }
        String str = this.f1603s;
        switch (str.hashCode()) {
            case -1151163274:
                if (str.equals("callhistory")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 114009:
                if (str.equals("sms")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1055728761:
                if (str.equals("devicesettings")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1681150880:
                if (str.equals("gmscontacts")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return f29132d.mo19655b(this.f1595k);
        }
        if (c == 1) {
            return true;
        }
        if (c == 2) {
            return f29132d.mo19661f(this.f1595k);
        }
        if (c != 3) {
            f29131c.mo25416d("Preference not known: %s. Not displaying.", this.f1603s);
            return false;
        } else if (!ccmh.m130652b()) {
            return false;
        } else {
            int i = Build.VERSION.SDK_INT;
            return true;
        }
    }
}

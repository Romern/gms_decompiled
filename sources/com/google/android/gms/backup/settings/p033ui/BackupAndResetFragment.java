package com.google.android.gms.backup.settings.p033ui;

import android.os.UserHandle;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.backup.settings.ui.BackupAndResetFragment */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAndResetFragment extends mvu {

    /* renamed from: c */
    public PreferenceScreen f29105c;

    /* renamed from: d */
    private lvp f29106d;

    /* renamed from: e */
    private PreferenceScreen f29107e;

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.backup_and_reset);
        PreferenceScreen a = mo9317a();
        this.f29106d = new lvp(getActivity());
        this.f29105c = (PreferenceScreen) a.mo2021c((CharSequence) "drive_backup");
        this.f29107e = (PreferenceScreen) a.mo2021c((CharSequence) "factory_reset");
    }

    /* renamed from: e */
    public final String mo17249e() {
        return "pixel_backup_reset";
    }

    /* renamed from: f */
    public final String mo17250f() {
        return "https://support.google.com/mobile/?p=pixel_backup";
    }

    /* renamed from: g */
    public final int mo17251g() {
        return 7;
    }

    public final void onResume() {
        super.onResume();
        if (this.f29106d.mo19644b()) {
            mo20276a(new mvl(this));
        } else {
            this.f29105c.mo1994d((int) C0126R.string.common_off);
        }
        boolean a = mvi.m25661a(getActivity(), "no_factory_reset", UserHandle.myUserId());
        this.f29107e.mo1981a(!a);
        if (a) {
            this.f29107e.mo1994d((int) C0126R.string.disabled_by_admin_summary_text);
        } else {
            this.f29107e.mo1966a((CharSequence) null);
        }
    }
}

package com.google.android.gms.backup.settings.p033ui;

import android.graphics.PorterDuff;
import android.os.Build;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.backup.settings.ui.DeviceBackupDetailFragment */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceBackupDetailFragment extends mvu {

    /* renamed from: c */
    public static final lvn f29120c = new lvn("DeviceBackupDetail");

    /* renamed from: d */
    public boolean f29121d;

    /* renamed from: e */
    public DollyBackupPreference f29122e;

    /* renamed from: f */
    public DollyBackupPreference f29123f;

    /* renamed from: g */
    public DollyBackupPreference f29124g;

    /* renamed from: j */
    public DollyBackupPreference f29125j;

    /* renamed from: k */
    public AppsBackupPreference f29126k;

    /* renamed from: l */
    private lwb f29127l;

    /* renamed from: m */
    private bqgj f29128m;

    /* renamed from: n */
    private lwd f29129n;

    /* renamed from: o */
    private final bqfp f29130o = new mwd(this);

    /* renamed from: d */
    private final void m21956d() {
        this.f29128m = snp.m35704b(9);
        this.f29129n = lwe.m24540a(getContext());
    }

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.device_backup_detail);
        lwb a = lwb.m24518a(getContext());
        this.f29127l = a;
        if (a.mo19689a() && !ccog.m130998b()) {
            m21956d();
        }
        PreferenceScreen a2 = mo9317a();
        a2.mo1986b((CharSequence) getString(C0126R.string.device_picker_item, Build.MODEL));
        this.f29126k = (AppsBackupPreference) a2.mo2021c((CharSequence) "apps");
        this.f29122e = (DollyBackupPreference) a2.mo2021c((CharSequence) "callhistory");
        this.f29123f = (DollyBackupPreference) a2.mo2021c((CharSequence) "devicesettings");
        this.f29124g = (DollyBackupPreference) a2.mo2021c((CharSequence) "sms");
        this.f29125j = (DollyBackupPreference) a2.mo2021c((CharSequence) "gmscontacts");
        int i = Build.VERSION.SDK_INT;
        if (!ccmh.m130652b()) {
            a2.mo2020b((Preference) this.f29125j);
        }
        if (ccoa.m130957c()) {
            int b = C1133kh.m17843b(getContext(), C0126R.color.settings_preference_icon_color);
            for (int i2 = 0; i2 < a2.mo2023g(); i2++) {
                a2.mo2024g(i2).mo2003h().setColorFilter(b, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    /* renamed from: g */
    public final int mo17251g() {
        return 8;
    }

    public final void onResume() {
        super.onResume();
        if (this.f29127l.mo19689a()) {
            if (ccog.m130998b() && (this.f29129n == null || this.f29128m == null)) {
                m21956d();
            }
            bqgj bqgj = this.f29128m;
            lwd lwd = this.f29129n;
            lwd.getClass();
            bqga.m112781a(bqgj.mo25819b(new mwb(lwd)), this.f29130o, this.f29128m);
        }
        f29120c.mo25409a("Refreshing UI", new Object[0]);
        ((mvu) this).f34824i.mo20307a(new mwe(this));
    }
}

package com.google.android.gms.backup.settings.p033ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.backup.settings.ui.DriveBackupSettingsFragment */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveBackupSettingsFragment extends mvu implements aoa, mvw, myd {

    /* renamed from: D */
    private static final int f29135D = C0126R.C0127drawable.quantum_ic_cloud_done_grey600_24;

    /* renamed from: E */
    private static final int f29136E = C0126R.C0127drawable.quantum_ic_cloud_off_grey600_24;

    /* renamed from: f */
    public static final lvn f29137f = new lvn("DriveBackupSettings");

    /* renamed from: A */
    public final bqgj f29138A;

    /* renamed from: C */
    private boolean f29139C;

    /* renamed from: F */
    private final mvs f29140F = new mwo(this);

    /* renamed from: G */
    private lwb f29141G;

    /* renamed from: H */
    private bqgj f29142H;

    /* renamed from: I */
    private lvp f29143I;

    /* renamed from: J */
    private lwd f29144J;

    /* renamed from: K */
    private boolean f29145K;

    /* renamed from: L */
    private PreferenceScreen f29146L;

    /* renamed from: M */
    private BackupStateSwitchPreference f29147M;

    /* renamed from: N */
    private EnhancedSummaryPreference f29148N;

    /* renamed from: O */
    private ContactsBackupPreference f29149O;

    /* renamed from: P */
    private PreferenceCategory f29150P;

    /* renamed from: Q */
    private bngx f29151Q;

    /* renamed from: R */
    private bngx f29152R;

    /* renamed from: S */
    private bngx f29153S;

    /* renamed from: T */
    private bngx f29154T;

    /* renamed from: U */
    private BackupPreference[] f29155U;

    /* renamed from: V */
    private lud f29156V;

    /* renamed from: W */
    private String f29157W;

    /* renamed from: X */
    private bsqq f29158X;

    /* renamed from: Y */
    private bsqi f29159Y;

    /* renamed from: Z */
    private final bqfp f29160Z;

    /* renamed from: aa */
    private final bqfp f29161aa;

    /* renamed from: ab */
    private bxvd f29162ab;

    /* renamed from: c */
    public final boolean f29163c = ccoa.m130956b();

    /* renamed from: d */
    public final boolean f29164d = cclf.m130397b();

    /* renamed from: e */
    public boolean f29165e;

    /* renamed from: g */
    public ProgressBar f29166g;

    /* renamed from: j */
    public ProgressBar f29167j;

    /* renamed from: k */
    public mvc f29168k;

    /* renamed from: l */
    public mye f29169l;

    /* renamed from: m */
    public PreferenceCategory f29170m;

    /* renamed from: n */
    public Preference f29171n;

    /* renamed from: o */
    public BackupPreference f29172o;

    /* renamed from: p */
    public BackupNowPreference f29173p;

    /* renamed from: q */
    public DollyBackupPreference f29174q;

    /* renamed from: r */
    public DollyBackupPreference f29175r;

    /* renamed from: s */
    public DollyBackupPreference f29176s;

    /* renamed from: t */
    public DollyBackupPreference f29177t;

    /* renamed from: u */
    public AppsBackupPreference f29178u;

    /* renamed from: v */
    public PhotosBackupPreference f29179v;

    /* renamed from: w */
    public SwitchPreferenceCompat f29180w;

    /* renamed from: x */
    public Account f29181x;

    /* renamed from: y */
    public boolean f29182y;

    /* renamed from: z */
    public bsqh f29183z;

    public DriveBackupSettingsFragment() {
        lvr lvr = lvr.f33060a;
        this.f29138A = new soc(1, 9);
        this.f29160Z = new mwv(this);
        this.f29161aa = new mwz(this);
    }

    /* renamed from: a */
    private final void m21960a(PreferenceGroup preferenceGroup) {
        int b = C1133kh.m17843b(getContext(), C0126R.color.settings_preference_icon_color);
        for (int i = 0; i < preferenceGroup.mo2023g(); i++) {
            Drawable h = preferenceGroup.mo2024g(i).mo2003h();
            if (h != null) {
                h.setColorFilter(b, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    /* renamed from: b */
    private final void m21961b(CharSequence charSequence) {
        bhnh a = bhnh.m101202a(getActivity().findViewById(16908290), charSequence, 0);
        TextView textView = (TextView) a.f119110e.findViewById(C0126R.C0129id.snackbar_text);
        if (textView != null) {
            textView.setMaxLines(3);
        }
        a.mo64020c();
    }

    /* renamed from: n */
    private final void m21962n() {
        if (this.f29142H == null) {
            this.f29142H = snp.m35704b(9);
        }
        if (myh.m25748a() && (this.f29168k == null || this.f29169l == null)) {
            Context context = getContext();
            lwc a = lwc.m24524a(context);
            lwr a2 = lwr.m24571a(context);
            lwj a3 = mca.m24847a(context, a);
            mbx mbx = new mbx(context);
            lwb a4 = lwb.m24518a(context);
            srb srb = srb.f45012a;
            this.f29168k = new mvc(context, a, a2, mbx, srb, new lxd(context, a, a2, a3, mbx), new lxg(context, a4, a, a2, srb));
            this.f29169l = new mye(getContext(), this.f29142H, this);
        } else if (this.f29144J == null) {
            this.f29144J = lwe.m24540a(getContext());
        }
    }

    /* renamed from: c */
    public final void mo9322c() {
        int i;
        String str;
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("backup_services_available", true);
        this.f29145K = booleanExtra;
        this.f29138A.execute(new mwh(this, booleanExtra));
        lwb a = lwb.m24518a(getContext());
        this.f29141G = a;
        if (a.mo19689a() && !ccog.m130998b()) {
            m21962n();
        }
        if (!this.f29163c) {
            i = C0126R.xml.drive_backup_settings;
        } else {
            i = C0126R.xml.drive_backup_settings_v2;
        }
        mo9318a(i);
        PreferenceScreen a2 = mo9317a();
        this.f29146L = a2;
        this.f29147M = (BackupStateSwitchPreference) a2.mo2021c((CharSequence) "drive_backup_state");
        this.f29148N = (EnhancedSummaryPreference) this.f29146L.mo2021c((CharSequence) "drive_backup_disabled_info");
        BackupNowPreference backupNowPreference = (BackupNowPreference) this.f29146L.mo2021c((CharSequence) "backup_now_preference");
        this.f29173p = backupNowPreference;
        backupNowPreference.mo17253j(this.f29165e);
        Preference c = this.f29146L.mo2021c((CharSequence) "drive_backup_account");
        this.f29171n = c;
        c.f1604t = mo17268k();
        PreferenceScreen preferenceScreen = this.f29146L;
        if (!this.f29163c) {
            str = "drive_backup_content_group";
        } else {
            str = "drive_backup_other_data_content_group";
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceScreen.mo2021c((CharSequence) str);
        this.f29170m = preferenceCategory;
        this.f29149O = (ContactsBackupPreference) preferenceCategory.mo2021c((CharSequence) "contacts");
        if (this.f29163c) {
            BackupPreference backupPreference = (BackupPreference) this.f29146L.mo2021c((CharSequence) "device_backup");
            this.f29172o = backupPreference;
            backupPreference.mo1986b((CharSequence) getString(C0126R.string.device_picker_item, Build.MODEL));
            if (!this.f29149O.mo17256g()) {
                this.f29170m.mo1984b((int) C0126R.string.drive_backup_content_photos_title);
                this.f29170m.mo2020b((Preference) this.f29149O);
            }
        } else {
            this.f29178u = (AppsBackupPreference) this.f29170m.mo2021c((CharSequence) "apps");
            this.f29175r = (DollyBackupPreference) this.f29170m.mo2021c((CharSequence) "callhistory");
            this.f29176s = (DollyBackupPreference) this.f29170m.mo2021c((CharSequence) "devicesettings");
            this.f29177t = (DollyBackupPreference) this.f29170m.mo2021c((CharSequence) "sms");
            DollyBackupPreference dollyBackupPreference = (DollyBackupPreference) this.f29170m.mo2021c((CharSequence) "gmscontacts");
            this.f29174q = dollyBackupPreference;
            if (!dollyBackupPreference.mo17256g()) {
                this.f29170m.mo2020b((Preference) this.f29174q);
            } else {
                this.f29170m.mo2020b((Preference) this.f29149O);
            }
            BackupPreference[] backupPreferenceArr = new BackupPreference[this.f29170m.mo2023g()];
            for (int i2 = 0; i2 < this.f29170m.mo2023g(); i2++) {
                backupPreferenceArr[i2] = (BackupPreference) this.f29170m.mo2024g(i2);
            }
            this.f29155U = backupPreferenceArr;
        }
        this.f29179v = (PhotosBackupPreference) this.f29170m.mo2021c((CharSequence) "photos");
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) this.f29146L.mo2021c((CharSequence) "when_to_back_up_group");
        this.f29150P = preferenceCategory2;
        this.f29180w = (SwitchPreferenceCompat) preferenceCategory2.mo2021c((CharSequence) "use_wifi_only");
        this.f29143I = new lvp(getActivity());
        bngs j = bngx.m109377j();
        int i3 = Build.VERSION.SDK_INT;
        j.mo67668c(this.f29173p);
        j.mo67668c(this.f29171n);
        if (this.f29163c) {
            j.mo67668c(this.f29172o);
        }
        j.mo67668c(this.f29170m);
        int i4 = Build.VERSION.SDK_INT;
        if (ccli.m130406f()) {
            j.mo67668c(this.f29150P);
        }
        this.f29151Q = j.mo67664a();
        this.f29152R = bngx.m109356a(this.f29171n);
        this.f29153S = bngx.m109356a(this.f29148N);
        this.f29154T = bngx.m109376e();
        this.f29158X = bsqq.f146675b;
        this.f29162ab = bsqh.f146634g.mo74144da();
        this.f29183z = bsqh.f146634g;
        this.f29159Y = myg.m25737a();
        if (this.f29145K) {
            mo17248d();
            mo17265h();
            this.f29173p.f1600p = this;
            this.f29157W = UUID.randomUUID().toString();
            this.f29156V = new luc(this);
            this.f29180w.f1599o = new mwg(this);
            return;
        }
        this.f29147M.mo1981a(false);
        BackupStateSwitchPreference backupStateSwitchPreference = this.f29147M;
        backupStateSwitchPreference.f1572B = C0126R.C0128layout.restricted_icon;
        backupStateSwitchPreference.mo1994d((int) C0126R.string.drive_backup_disabled_by_device_owner);
    }

    /* renamed from: d */
    public final void mo17248d() {
        if (this.f29164d) {
            this.f29147M.mo1984b((int) C0126R.string.backup_data_title_google_branding);
        }
        this.f29147M.f1599o = new mwr(this);
    }

    /* renamed from: e */
    public final String mo17249e() {
        return "pixel_backup";
    }

    /* renamed from: f */
    public final String mo17250f() {
        return "https://support.google.com/mobile/?p=pixel_backup";
    }

    /* renamed from: g */
    public final int mo17251g() {
        return 5;
    }

    /* renamed from: h */
    public final void mo17265h() {
        this.f29158X = myg.m25738a(getContext());
        myg.m25742a(getContext(), this.f29162ab);
        this.f29148N.mo1966a(myg.m25740a(getContext(), this.f29158X, this.f29162ab));
    }

    /* renamed from: i */
    public final boolean mo17266i() {
        return this.f29143I.mo19644b();
    }

    /* renamed from: j */
    public final void mo17267j() {
        TextView textView;
        if (this.f29182y) {
            ProgressBar progressBar = this.f29166g;
            if (!(progressBar == null || this.f29167j == null)) {
                progressBar.setVisibility(0);
                this.f29167j.setVisibility(4);
            }
            BackupStateSwitchPreference backupStateSwitchPreference = this.f29147M;
            backupStateSwitchPreference.mo1981a(false);
            if (!(ccoa.m130956b() || (textView = backupStateSwitchPreference.f29113c) == null || backupStateSwitchPreference.f29114d == null)) {
                textView.setTextColor(backupStateSwitchPreference.f29115e);
                backupStateSwitchPreference.f29114d.setTextColor(backupStateSwitchPreference.f29116f);
            }
            this.f29173p.mo17252i(true);
        } else {
            ProgressBar progressBar2 = this.f29166g;
            if (!(progressBar2 == null || this.f29167j == null)) {
                progressBar2.setVisibility(4);
                this.f29167j.setVisibility(4);
            }
            this.f29147M.mo1981a(true);
            this.f29173p.mo17252i(false);
            mud.m25628a(getContext());
        }
        if (this.f29163c) {
            this.f29171n.mo1981a(!this.f29182y);
        } else {
            this.f29171n.mo1987b(!this.f29182y);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: k */
    public final Intent mo17268k() {
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        if (this.f29181x == null) {
            intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
            intent.putExtra("turnOff", false);
        } else {
            intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.SetBackupAccountActivity");
        }
        return intent;
    }

    /* renamed from: l */
    public final void mo17269l() {
        stq.m36309a(new mwm(this));
    }

    /* renamed from: m */
    public final void mo17270m() {
        f29137f.mo25418e("Error with unlocking device.", new Object[0]);
    }

    public final void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bxvd bxvd = this.f29162ab;
            boolean z = bundle.getBoolean("dbsf-learn-more-shown");
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh = (bsqh) bxvd.f164949b;
            bsqh bsqh2 = bsqh.f146634g;
            bsqh.f146636a |= 1;
            bsqh.f146637b = z;
        }
        super.onActivityCreated(bundle);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f29166g = null;
        this.f29167j = null;
    }

    public final void onPause() {
        f29137f.mo25409a("onPause", new Object[0]);
        super.onPause();
        if (this.f29157W != null) {
            lsi a = lsh.m24339a(getActivity());
            String str = this.f29157W;
            roz b = rpa.m34196b();
            b.f43472a = new luq(str);
            ((rjx) a).mo24732b(b.mo24977a());
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f29141G.mo19689a()) {
            if (ccog.m130998b()) {
                m21962n();
            }
            if (!myh.m25748a()) {
                bqgj bqgj = this.f29142H;
                lwd lwd = this.f29144J;
                lwd.getClass();
                bqga.m112781a(bqgj.mo25819b(new mwj(lwd)), this.f29160Z, this.f29142H);
            }
        }
        String str = this.f29157W;
        if (!(str == null || this.f29156V == null)) {
            f29137f.mo25409a("Registering callbacks, id=%s", str);
            lsi a = lsh.m24339a(getActivity());
            String str2 = this.f29157W;
            lud lud = this.f29156V;
            roz b = rpa.m34196b();
            b.f43472a = new lun(str2, lud);
            ((rjx) a).mo24732b(b.mo24977a());
        }
        mo17262b((mvs) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dbsf-learn-more-shown", ((bsqh) this.f29162ab.f164949b).f146637b);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = Build.VERSION.SDK_INT;
        View inflate = View.inflate(getContext(), C0126R.C0128layout.backup_settings_progress_bar, null);
        ((ViewGroup) view).addView(inflate, 0, new ViewGroup.LayoutParams(-1, (int) getResources().getDimension(C0126R.dimen.settings_backup_progress_bar_height)));
        this.f29166g = (ProgressBar) inflate.findViewById(C0126R.C0129id.indeterminate_progress_bar);
        this.f29167j = (ProgressBar) inflate.findViewById(C0126R.C0129id.determinate_progress_bar);
    }

    /* renamed from: a */
    public final bngx mo17257a(boolean z, boolean z2) {
        if (!this.f29145K) {
            return this.f29154T;
        }
        if (!z) {
            return this.f29153S;
        }
        if (!z2) {
            return this.f29152R;
        }
        if (!this.f29163c) {
            this.f29170m.mo2025v();
            BackupPreference[] backupPreferenceArr = this.f29155U;
            for (BackupPreference backupPreference : backupPreferenceArr) {
                if (backupPreference.mo17256g()) {
                    this.f29170m.mo2019a((Preference) backupPreference);
                }
            }
        }
        return this.f29151Q;
    }

    /* renamed from: a */
    public final void mo17258a(Account account) {
        int g = this.f29170m.mo2023g();
        for (int i = 0; i < g; i++) {
            BackupPreference backupPreference = (BackupPreference) this.f29170m.mo2024g(i);
            if (backupPreference.mo17256g()) {
                ((mvu) this).f34824i.mo20306a(backupPreference.mo17254a(account));
            }
        }
        ((mvu) this).f34824i.mo20307a(new mwx(this, getActivity()));
    }

    /* renamed from: b */
    public final void mo17261b(int i) {
        CharSequence charSequence;
        if (i == 29000) {
            charSequence = getActivity().getText(C0126R.string.backup_now_success_text);
        } else if (i != 29002) {
            charSequence = getActivity().getString(C0126R.string.backup_now_snackbar_error_text_format, new Object[]{getActivity().getString(C0126R.string.backup_now_error_title), getActivity().getString(C0126R.string.backup_now_error_text)});
        } else {
            charSequence = getActivity().getString(C0126R.string.backup_now_snackbar_error_text_format, new Object[]{getActivity().getString(C0126R.string.backup_now_error_title), getActivity().getString(C0126R.string.backup_now_network_error_text)});
        }
        m21961b(charSequence);
    }

    /* renamed from: a */
    public final void mo17259a(List list) {
        for (int g = this.f29146L.mo2023g() - 1; g > 0; g--) {
            PreferenceScreen preferenceScreen = this.f29146L;
            preferenceScreen.mo2020b(preferenceScreen.mo2024g(g));
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f29146L.mo2019a((Preference) list.get(i));
        }
    }

    /* renamed from: a */
    public final void mo17260a(boolean z) {
        this.f29139C = z;
        if (this.f29168k != null) {
            bqga.m112781a(this.f29142H.mo25819b(new mwl(this)), this.f29161aa, this.f29142H);
        } else {
            mo17264c(false);
        }
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        boolean z;
        if (preference == this.f29173p) {
            f29137f.mo25409a("BackUpNow button was clicked.", new Object[0]);
            mvd mvd = this.f34882B;
            bxvd da = mqy.f34367f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqy mqy = (mqy) da.f164949b;
            mqy.f34372d = 7;
            mqy.f34369a |= 4;
            mvd.mo20268a((mqy) da.mo74062i());
            ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService("connectivity");
            if (!ccli.m130406f() || ((TwoStatePreference) this.f29180w).f1642a) {
                z = false;
            } else {
                z = true;
            }
            this.f29139C = z;
            f29137f.mo25409a("Should use mobile data for back up now: %b", Boolean.valueOf(z));
            if (connectivityManager.getActiveNetworkInfo() == null) {
                f29137f.mo25409a("No network, not running BackUpNow.", new Object[0]);
                mo17261b(29002);
            } else if (connectivityManager.isActiveNetworkMetered() && !this.f29139C) {
                f29137f.mo25409a("We're on metered network, showing the confirmation dialog for backing up now.", new Object[0]);
                mvx mvx = new mvx();
                mvx.f34826a = this;
                mvx.show(getFragmentManager(), "ConfirmMeteredNetworkDialog");
            } else {
                mo17260a(this.f29139C);
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.backup.settings.ui.DriveBackupSettingsFragment.a(boolean, boolean):bngx
     arg types: [boolean, int]
     candidates:
      mvu.a(androidx.preference.Preference, java.lang.String):void
      com.google.android.gms.backup.settings.ui.DriveBackupSettingsFragment.a(boolean, boolean):bngx */
    /* renamed from: b */
    public final void mo17262b(mvs mvs) {
        int i;
        f29137f.mo25409a("Refreshing UI", new Object[0]);
        boolean i2 = mo17266i();
        this.f29147M.mo2035i(i2);
        if (!this.f29163c) {
            BackupStateSwitchPreference backupStateSwitchPreference = this.f29147M;
            if (!i2) {
                i = f29136E;
            } else {
                i = f29135D;
            }
            backupStateSwitchPreference.mo1989c(i);
        }
        if (ccoa.m130957c() && !ccoa.m130956b()) {
            m21960a((PreferenceGroup) this.f29146L);
            m21960a((PreferenceGroup) this.f29170m);
        }
        mo17259a(mo17257a(i2, false));
        if (!myg.m25746c(getContext())) {
            ((mvu) this).f34824i.mo20307a(new mwt(this));
        }
        if (i2 && this.f29145K) {
            mo20276a(new mwk(this, mvs));
        }
    }

    /* renamed from: b */
    public final void mo17263b(boolean z) {
        bxvd bxvd;
        if (ccmz.f179479a.mo6606a().mo76401a()) {
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.ANDROID_BACKUP_SETTING_CHANGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf = (bsrf) da.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da2 = bsrg.f146749m.mo74144da();
            if (!z) {
                bxvd = bsqi.f146642h.mo74144da();
            } else {
                bsqi bsqi = this.f29159Y;
                bxvd bxvd2 = (bxvd) bsqi.mo74142c(5);
                bxvd2.mo73625a((bxvk) bsqi);
                bxvd = bxvd2;
            }
            if (z) {
                boolean v = this.f29179v.mo17274v();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bsqi bsqi2 = (bsqi) bxvd.f164949b;
                bsqi bsqi3 = bsqi.f146642h;
                bsqi2.f146644a |= 16;
                bsqi2.f146649f = v;
            }
            bssg bssg = (bssg) bssh.f146859b.mo74144da();
            bssg.mo70710a(z ? btuh.ANDROID_BACKUP_SETTING_TURNED_ON : btuh.ANDROID_BACKUP_SETTING_TURNED_OFF);
            bssh bssh = (bssh) bssg.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg = (bsrg) da2.f164949b;
            bssh.getClass();
            bsrg.f146762l = bssh;
            bsrg.f146752b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bxvd da3 = bssl.f146873c.mo74144da();
            int i = !z ? 3 : 2;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssl bssl = (bssl) da3.f164949b;
            bssl.f146876b = i - 1;
            bssl.f146875a |= 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqi bsqi4 = (bsqi) bxvd.f164949b;
            bssl bssl2 = (bssl) da3.mo74062i();
            bsqi bsqi5 = bsqi.f146642h;
            bssl2.getClass();
            bsqi4.f146645b = bssl2;
            bsqi4.f146644a |= 1;
            bsqi bsqi6 = (bsqi) bxvd.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg2 = (bsrg) da2.f164949b;
            bsqi6.getClass();
            bsrg2.f146753c = bsqi6;
            bsrg2.f146751a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da.f164949b;
            bsrg bsrg3 = (bsrg) da2.mo74062i();
            bsrg3.getClass();
            bsrf2.f146748c = bsrg3;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da.mo74062i();
            bsrf3.getClass();
            bsqw.f146701e = bsrf3;
            bsqw.f146697a |= 4;
            if (z) {
                this.f29159Y = bsqi6;
            }
            bxvd da4 = bssm.f146877d.mo74144da();
            bsmx bsmx = bsmx.ANDROID_BACKUP_DRIVE_BACKUP_SETTINGS;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bssm bssm = (bssm) da4.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bxvd da5 = bssi.f146862i.mo74144da();
            bxvd da6 = bsqj.f146651e.mo74144da();
            bsqq bsqq = this.f29158X;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsqj bsqj = (bsqj) da6.f164949b;
            bsqq.getClass();
            bsqj.f146654b = bsqq;
            bsqj.f146653a |= 1;
            bsqh bsqh = (bsqh) this.f29162ab.mo74062i();
            bsqh.getClass();
            bsqj.f146656d = bsqh;
            bsqj.f146653a |= 4;
            bsqh bsqh2 = this.f29183z;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsqj bsqj2 = (bsqj) da6.f164949b;
            bsqh2.getClass();
            bsqj2.f146655c = bsqh2;
            bsqj2.f146653a |= 2;
            bsqj bsqj3 = (bsqj) da6.mo74062i();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bssi bssi = (bssi) da5.f164949b;
            bsqj3.getClass();
            bssi.f146866c = bsqj3;
            bssi.f146864a |= 4;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bssm bssm2 = (bssm) da4.f164949b;
            bssi bssi2 = (bssi) da5.mo74062i();
            bssi2.getClass();
            bssm2.f146881c = bssi2;
            bssm2.f146879a |= 8;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw2 = (bsqw) bsqv.f164949b;
            bssm bssm3 = (bssm) da4.mo74062i();
            bssm3.getClass();
            bsqw2.f146702f = bssm3;
            bsqw2.f146697a |= 8;
            max.m24779a(getActivity(), bsqv, this.f29181x).mo50371a(mwi.f34846a);
        }
        this.f29143I.mo19642a(z);
        if (z) {
            myg.m25741a(getContext(), this.f29159Y);
            if (this.f29179v.mo17274v()) {
                Settings.Secure.putInt(getActivity().getContentResolver(), "backup_settings_opt_in", 1);
            } else {
                Settings.Secure.putInt(getActivity().getContentResolver(), "backup_settings_opt_in_no_photos", 1);
            }
        } else {
            if (!this.f29163c) {
                this.f29175r.mo17255a(mvp.f34814a);
                this.f29176s.mo17255a(mvp.f34814a);
                this.f29177t.mo17255a(mvp.f34814a);
                this.f29178u.mo17255a(mvp.f34814a);
            } else {
                this.f29172o.mo17255a(mvp.f34814a);
            }
            ((mvu) this).f34824i.mo20307a(new mws(this));
        }
        if (!this.f29179v.mo17274v()) {
            mo17262b((mvs) null);
        } else if (!z) {
            ((mvu) this).f34824i.mo20307a(new mxx(this.f29179v));
            mo17262b((mvs) null);
        } else {
            mo17262b(this.f29140F);
        }
    }

    /* renamed from: c */
    public final void mo17264c(boolean z) {
        this.f29182y = true;
        mo17267j();
        lsj lsj = new lsj();
        lsj.f32838a = true ^ this.f29139C;
        lsj.f32843f = z;
        lsh.m24339a(getActivity()).mo19586a(lsj.mo19587a());
        m21961b((CharSequence) getActivity().getString(C0126R.string.backup_now_notification_title));
    }
}

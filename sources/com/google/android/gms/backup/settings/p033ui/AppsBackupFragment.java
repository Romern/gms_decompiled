package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.backup.settings.ui.AppsBackupFragment */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppsBackupFragment extends mvu {

    /* renamed from: c */
    public static final lvn f29097c = new lvn("AppsBackupFragment");

    /* renamed from: d */
    public SwitchPreferenceCompat f29098d;

    /* renamed from: e */
    public lvp f29099e;

    /* renamed from: f */
    public mvq f29100f;

    /* renamed from: g */
    public boolean f29101g = false;

    /* renamed from: j */
    private PreferenceCategory f29102j;

    /* renamed from: k */
    private final lvr f29103k = lvr.f33060a;

    /* renamed from: l */
    private final anz f29104l = new mvk(this);

    /* renamed from: a */
    public final void mo17247a(List list) {
        this.f29102j.mo2025v();
        Context context = this.f13641a.f1882a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mtw mtw = (mtw) it.next();
            AppPreference appPreference = new AppPreference(context);
            appPreference.mo1986b((CharSequence) mtw.f34724a);
            long j = mtw.f34725b;
            appPreference.mo1966a((CharSequence) (j != 0 ? mvp.m25668a(new Date(j)) : mvp.f34814a).mo20275a(getActivity()));
            appPreference.mo1976a(mtw.f34726c);
            this.f29102j.mo2019a((Preference) appPreference);
        }
    }

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.apps_backup);
        PreferenceScreen a = mo9317a();
        this.f29098d = (SwitchPreferenceCompat) a.mo2021c((CharSequence) "auto_restore");
        this.f29102j = (PreferenceCategory) a.mo2021c((CharSequence) "apps");
        this.f29099e = new lvp(getActivity());
        FragmentManager fragmentManager = getFragmentManager();
        mvq mvq = (mvq) fragmentManager.findFragmentByTag("BackupRetainedFragment");
        if (mvq == null) {
            mvq = new mvq();
            fragmentManager.beginTransaction().add(mvq, "BackupRetainedFragment").commit();
        }
        this.f29100f = mvq;
    }

    /* renamed from: d */
    public final void mo17248d() {
        this.f29098d.mo2035i(this.f29103k.mo19652a(getActivity()));
    }

    /* renamed from: e */
    public final String mo17249e() {
        return "pixel_backup_apps";
    }

    /* renamed from: f */
    public final String mo17250f() {
        return "https://support.google.com/mobile/?p=pixel_backup";
    }

    /* renamed from: g */
    public final int mo17251g() {
        return 4;
    }

    public final void onPause() {
        this.f29098d.f1599o = null;
        this.f29102j.mo2025v();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        boolean b = this.f29099e.mo19644b();
        this.f29098d.mo1981a(b);
        if (b) {
            this.f29098d.f1599o = this.f29104l;
        }
        mo17248d();
        if (!this.f29101g) {
            this.f29101g = true;
            Activity activity = getActivity();
            List list = this.f29100f.f34820a;
            if (list != null) {
                mo17247a(list);
            }
            ((mvu) this).f34824i.mo20307a(new mvj(this, activity, list));
        }
    }
}

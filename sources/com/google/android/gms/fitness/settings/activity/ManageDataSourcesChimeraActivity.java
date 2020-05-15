package com.google.android.gms.fitness.settings.activity;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageDataSourcesChimeraActivity extends zpn implements zqf {

    /* renamed from: c */
    public zpu f32445c = new zpz(this);

    /* renamed from: d */
    public zqb f32446d;

    /* renamed from: e */
    public Fragment f32447e;

    /* renamed from: f */
    private Fragment f32448f;

    public ManageDataSourcesChimeraActivity() {
        super(C0126R.string.fitness_manage_data_sources_activity_title);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19186a(String str) {
        if (!str.equals(this.f32446d.f55683a)) {
            mo19189b(str);
        }
    }

    /* renamed from: b */
    public final void mo19189b(String str) {
        zqb zqb = this.f32446d;
        zqb.f55683a = null;
        zqb.f55684b = null;
        mo19192i();
        zpu zpu = this.f32445c;
        zps zps = new zps(this, str);
        zpz zpz = (zpz) zpu;
        rjx a = ydj.m43846a(zpz.f55682e.getApplicationContext(), zpz.m45956a(str));
        if (zpz.f55678a != null) {
            zpz.f55679b.mo50353a();
            zpz.f55678a = null;
        }
        zpz.f55679b = new aubf();
        rkb rkb = a.f43165D;
        zcr zcr = new zcr(rkb);
        rkb.mo24787a((rle) zcr);
        zpz.f55678a = zpz.m45955a(sdl.m34956a(zcr, ydm.f53661a), zpz.f55679b.f91349a);
        zpz.f55678a.mo50371a(new zpx(zpz, zps));
    }

    /* renamed from: g */
    public final bnic mo19190g() {
        bnic bnic;
        zqb zqb = this.f32446d;
        return (zqb == null || (bnic = zqb.f55684b) == null) ? bnon.f131923a : bnic;
    }

    /* renamed from: h */
    public final void mo19191h() {
        this.f32445c.mo31319a(C0126R.string.fitness_settings_confirm_delete_dialog, C0126R.string.fitness_settings_confirm_delete_message, new zpp(this));
    }

    /* renamed from: i */
    public final void mo19192i() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.popBackStack("data_types", 1);
        supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fitness_manage_data_sources_fragment, this.f32448f, "loading").commit();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.fitness_manage_data_sources);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("loading");
        if (findFragmentByTag == null) {
            findFragmentByTag = new zqa();
        }
        this.f32448f = findFragmentByTag;
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag("types");
        if (findFragmentByTag2 == null) {
            findFragmentByTag2 = new zqg();
        }
        this.f32447e = findFragmentByTag2;
        Fragment findFragmentByTag3 = supportFragmentManager.findFragmentByTag("state");
        if (findFragmentByTag3 != null) {
            this.f32446d = (zqb) findFragmentByTag3;
            return;
        }
        this.f32446d = new zqb();
        supportFragmentManager.beginTransaction().add(this.f32446d, "state").commit();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        zpz zpz = (zpz) this.f32445c;
        if (zpz.f55678a != null) {
            zpz.f55679b.mo50353a();
            zpz.f55678a = null;
        }
        if (zpz.f55680c != null) {
            zpz.f55681d.mo50353a();
            zpz.f55680c = null;
        }
    }

    /* renamed from: a */
    public final void mo19188a(zqj zqj) {
        this.f32445c.mo31319a(C0126R.string.fitness_manage_data_delete_dialog, C0126R.string.fitness_manage_data_sources_delete_source, new zpo(this, zqj));
    }
}

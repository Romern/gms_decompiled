package com.google.android.gms.people.sync.coreui;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsSyncCoreChimeraActivity extends adcc implements amse {

    /* renamed from: b */
    public amud f82047b;

    /* renamed from: c */
    public boolean f82048c;

    /* renamed from: d */
    private bdej f82049d;

    /* renamed from: e */
    private allq f82050e;

    /* renamed from: f */
    private bqgj f82051f;

    /* renamed from: g */
    private final amuh f82052g = new amuh();

    /* renamed from: a */
    public final bdej mo41298a() {
        return this.f82049d;
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            return super.mo8629aX();
        }
        onBackPressed();
        return true;
    }

    /* renamed from: e */
    public final void mo46474e() {
        amuh amuh = this.f82052g;
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = 3;
        int i = ammm.f75307a | 1;
        ammm.f75307a = i;
        ammm.f75309c = 2;
        ammm.f75307a = i | 2;
        amuh.mo41352a(2, (ammm) da.mo74062i(), (String) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!cfus.m143108f()) {
            finish();
            return;
        }
        setTheme(C0126R.style.ContactsCoreUiTheme);
        setContentView((int) C0126R.C0128layout.contacts_sync_core_activity);
        this.f82047b = (amud) adcj.m50162a(this, amuq.m63320a(this)).mo3444a(amud.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            this.f82047b.f75938a.f75849g = getIntent().getStringExtra("authAccount");
        }
        this.f82047b.f75939d.mo2445a(this, new amtp(this));
        allp a = allq.m61232a();
        a.f73626a = 80;
        allq a2 = a.mo40491a();
        this.f82050e = a2;
        alsl a3 = alsk.m61691a(this, a2);
        this.f82051f = snp.m35702a(9);
        this.f82049d = new bdej(this.f82051f);
        AccountParticleDisc.m94876a(this, this.f82049d, this.f82051f, new bddp(), new bddr(this, this.f82051f, this.f82050e), bddo.class);
        int size = getSupportFragmentManager().getFragments().size();
        if (size <= 1) {
            z = true;
        } else {
            z = false;
        }
        this.f82048c = z;
        if (bundle == null || size <= 1) {
            String action = getIntent().getAction();
            if ("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS".equals(action)) {
                this.f82047b.mo41347e();
            } else if (!cfus.m143110h()) {
                this.f82047b.mo41347e();
            } else if ("com.google.android.gms.people.sync.CONTACTS_BACKUP_SYNC_SETTINGS".equals(action)) {
                aucb a4 = a3.mo40712a();
                a4.mo50373a(new amtq(this));
                a4.mo50372a(new amtr(this));
            } else {
                aucb a5 = a3.mo40712a();
                a5.mo50373a(new amts(this));
                a5.mo50372a(new amtt(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo46473a(int i) {
        amuh amuh = this.f82052g;
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = 3;
        int i2 = ammm.f75307a | 1;
        ammm.f75307a = i2;
        ammm.f75309c = 1;
        int i3 = i2 | 2;
        ammm.f75307a = i3;
        ammm.f75310d = i - 1;
        ammm.f75307a = i3 | 4;
        amuh.mo41352a(2, (ammm) da.mo74062i(), (String) null);
    }
}

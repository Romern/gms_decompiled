package com.google.android.gms.family.p042v2.tos;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: com.google.android.gms.family.v2.tos.TosChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TosChimeraActivity extends deu implements wrc {

    /* renamed from: b */
    private String f31467b;

    /* renamed from: c */
    private byte[] f31468c;

    /* renamed from: d */
    private boolean f31469d;

    /* renamed from: e */
    private wia f31470e;

    /* renamed from: a */
    private final void m23332a(int i) {
        sbw sbw = wgn.f50624a;
        setResult(4, new Intent().putExtra("accountName", this.f31467b).putExtra("errorCode", i));
        finish();
    }

    /* renamed from: e */
    private final Intent m23333e() {
        return new Intent().putExtra("accountName", getIntent().getStringExtra("accountName")).putExtra("tosAccepted", this.f31469d);
    }

    /* renamed from: n */
    public final void mo18457n() {
        this.f31469d = true;
        setResult(1, m23333e());
        finish();
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
            super.onBackPressed();
            return;
        }
        setResult(3, m23333e());
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31470e = new wia(this);
        boolean z = true;
        setRequestedOrientation(1);
        String a = spn.m35852a((Activity) this);
        if (!rfz.m33557a(this).mo24610b(a)) {
            this.f31470e.mo29111a(3, 8, "tos");
            m23332a(-3);
            return;
        }
        wgp.m41932a(this, getIntent(), a);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.f31467b = stringExtra;
        if (stringExtra == null) {
            this.f31470e.mo29111a(3, 13, "tos");
            m23332a(-2);
            return;
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            this.f31468c = bundle.getByteArray("auditToken");
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            this.f31468c = getIntent().getByteArrayExtra("auditToken");
        } else {
            bxvd da = bsqx.f146703c.mo74144da();
            bxtx a2 = bxtx.m123261a(ggj.m13107a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqx bsqx = (bsqx) da.f164949b;
            a2.getClass();
            bsqx.f146705a |= 1;
            bsqx.f146706b = a2;
            this.f31468c = ((bsqx) da.mo74062i()).mo73642k();
        }
        this.f31470e.mo29114a(this.f31467b, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion), getIntent().getStringExtra("appId"));
        Account[] a3 = adyd.m51363a(this).mo33916a("com.google");
        Account account = null;
        for (Account account2 : a3) {
            if (account2.name.equals(this.f31467b)) {
                account = account2;
            }
        }
        if (account == null) {
            this.f31470e.mo29111a(3, 14, "tos");
            String str = this.f31467b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            m23332a(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("tosContent");
        String stringExtra3 = getIntent().getStringExtra("tosContinueButton");
        String stringExtra4 = getIntent().getStringExtra("tosMoreButton");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3)) {
            this.f31470e.mo29111a(3, 15, "tos");
            m23332a(-2);
            return;
        }
        if (bundle == null || !bundle.getBoolean("tosAccepted", false)) {
            z = false;
        }
        this.f31469d = z;
        setContentView((int) C0126R.C0128layout.fm_activity_play_tos);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_play_tos_fragment_container) == null) {
            supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_family_play_tos_fragment_container, wrd.m42166a(this.f31468c, this.f31467b, stringExtra2, stringExtra3, stringExtra4)).commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("tosAccepted", this.f31469d);
        bundle.putByteArray("auditToken", this.f31468c);
    }
}

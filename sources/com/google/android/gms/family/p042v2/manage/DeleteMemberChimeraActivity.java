package com.google.android.gms.family.p042v2.manage;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: com.google.android.gms.family.v2.manage.DeleteMemberChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeleteMemberChimeraActivity extends deu implements wpx, wpt {

    /* renamed from: b */
    public wgj f31403b;

    /* renamed from: c */
    public String f31404c;

    /* renamed from: d */
    public String f31405d;

    /* renamed from: e */
    public String f31406e;

    /* renamed from: f */
    public boolean f31407f;

    /* renamed from: g */
    public boolean f31408g = false;

    /* renamed from: h */
    public ProgressDialog f31409h = null;

    /* renamed from: i */
    public wgh f31410i;

    /* renamed from: j */
    public wia f31411j;

    /* renamed from: k */
    private String f31412k;

    /* renamed from: a */
    private final void m23268a(int i) {
        sbw sbw = wgn.f50624a;
        setResult(4, new Intent().putExtra("accountName", this.f31404c).putExtra("errorCode", i));
        finish();
    }

    /* renamed from: n */
    private final void m23269n() {
        ProgressDialog progressDialog = new ProgressDialog(this, wgp.m41933b(getIntent()));
        this.f31409h = progressDialog;
        progressDialog.setIndeterminate(true);
        this.f31409h.setCancelable(false);
        if (this.f31407f) {
            this.f31409h.setMessage(getResources().getString(C0126R.string.fm_leave_family_progress));
        } else {
            this.f31409h.setMessage(getResources().getString(C0126R.string.fm_remove_member_progress));
        }
        this.f31409h.show();
    }

    /* renamed from: b */
    public final void mo18494b(Intent intent) {
        if (this.f31403b.mo29096a() != null && !this.f31403b.mo29096a().isEmpty()) {
            intent.putExtra("consistencyToken", this.f31403b.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31403b.mo29098b());
        }
    }

    /* renamed from: br */
    public final int mo18495br() {
        return 1;
    }

    /* renamed from: bs */
    public final int mo18496bs() {
        return 2;
    }

    /* renamed from: bt */
    public final void mo18497bt() {
        wgn.m41923c("DeleteMemberActivity", "Starting delete member loader", new Object[0]);
        this.f31408g = true;
        m23269n();
        getSupportLoaderManager().initLoader(0, null, new wog(this));
    }

    /* renamed from: e */
    public final wgj mo18498e() {
        return this.f31403b;
    }

    /* renamed from: g */
    public final void mo18499g() {
        this.f31411j.mo29109a(8);
        setResult(7);
        finish();
    }

    /* renamed from: h */
    public final void mo18500h() {
        this.f31411j.mo29109a(17);
        setResult(10);
        finish();
    }

    /* renamed from: i */
    public final void mo18501i() {
        String str;
        String str2;
        if (this.f31407f) {
            str = getString(C0126R.string.fm_reauth_password_title_leave_family, new Object[]{this.f31412k});
        } else {
            str = getString(C0126R.string.fm_reauth_password_title_remove_member, new Object[]{this.f31406e});
        }
        if (this.f31407f) {
            str2 = getString(C0126R.string.fm_reauth_pin_title_leave_family, new Object[]{this.f31412k});
        } else {
            str2 = getString(C0126R.string.fm_reauth_pin_title_remove_member, new Object[]{this.f31406e});
        }
        wpu.m42156a(this.f31404c, str, str2).show(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: m */
    public final wgh mo18502m() {
        return this.f31410i;
    }

    public final void onCreate(Bundle bundle) {
        wqb wqb;
        super.onCreate(bundle);
        this.f31411j = new wia(this);
        String a = spn.m35852a((Activity) this);
        if (!rfz.m33557a(this).mo24610b(a)) {
            this.f31411j.mo29111a(2, 8, "deletemember");
            m23268a(-3);
            return;
        }
        if (getIntent().getStringExtra("clientCallingPackage") != null) {
            a = getIntent().getStringExtra("clientCallingPackage");
        }
        wgp.m41932a(this, getIntent(), a);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.f31404c = stringExtra;
        if (stringExtra == null) {
            this.f31411j.mo29111a(2, 13, "deletemember");
            m23268a(-2);
            return;
        }
        Account[] a2 = adyd.m51363a(this).mo33916a("com.google");
        Account account = null;
        for (Account account2 : a2) {
            if (account2.name.equals(this.f31404c)) {
                account = account2;
            }
        }
        if (account == null) {
            this.f31411j.mo29111a(2, 14, "deletemember");
            String str = this.f31404c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            m23268a(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("memberId");
        this.f31405d = stringExtra2;
        if (stringExtra2 == null) {
            this.f31411j.mo29111a(2, 10, "deletemember");
            m23268a(-2);
            return;
        }
        String stringExtra3 = getIntent().getStringExtra("memberGivenName");
        this.f31406e = stringExtra3;
        if (TextUtils.isEmpty(stringExtra3)) {
            this.f31411j.mo29111a(2, 11, "deletemember");
            m23268a(-2);
            return;
        }
        this.f31407f = getIntent().getBooleanExtra("leaveFamily", false);
        String stringExtra4 = getIntent().getStringExtra("hohGivenName");
        this.f31412k = stringExtra4;
        if (!this.f31407f || !TextUtils.isEmpty(stringExtra4)) {
            wgh wgh = new wgh(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
            this.f31410i = wgh;
            this.f31411j.mo29114a(this.f31404c, wgh.f50618b, wgh.f50617a);
            this.f31403b = new wgj();
            if (getIntent().getStringExtra("consistencyToken") != null) {
                this.f31403b.mo29097a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
            }
            setContentView((int) C0126R.C0128layout.fm_activity_delete_member);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (!this.f31407f) {
                String str2 = this.f31404c;
                String str3 = this.f31405d;
                wqb = new wqb();
                Bundle bundle2 = new Bundle(2);
                bundle2.putString("accountName", str2);
                bundle2.putString("memberId", str3);
                wqb.setArguments(bundle2);
            } else {
                String str4 = this.f31404c;
                wqb = new wqb();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("accountName", str4);
                wqb.setArguments(bundle3);
            }
            if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_delete_member_fragment_container) == null) {
                supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_delete_member_fragment_container, wqb).commit();
            }
            if (bundle != null && bundle.getBoolean("DeleteMemberInProgress", false)) {
                m23269n();
                getSupportLoaderManager().initLoader(0, null, new wog(this));
            }
            int i = Build.VERSION.SDK_INT;
            setRequestedOrientation(14);
            return;
        }
        this.f31411j.mo29111a(2, 12, "deletemember");
        m23268a(-2);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("DeleteMemberInProgress", this.f31408g);
        ProgressDialog progressDialog = this.f31409h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}

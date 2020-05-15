package com.google.android.gms.constellation.p038ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.constellation.ui.ConstellationSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstellationSettingsChimeraActivity extends qkh {

    /* renamed from: b */
    public static final sek f30536b = tea.m36798a("constellation_settings");

    /* renamed from: A */
    public tdx f30537A;

    /* renamed from: B */
    public tay f30538B;

    /* renamed from: C */
    public final Object f30539C = new Object();

    /* renamed from: D */
    public boolean f30540D = false;

    /* renamed from: E */
    public boolean f30541E = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f30542F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f30543G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f30544H = false;

    /* renamed from: I */
    private boolean f30545I = false;

    /* renamed from: c */
    public ProgressDialog f30546c;

    /* renamed from: d */
    public final Handler f30547d = new adzt();

    /* renamed from: e */
    public final Executor f30548e = new soc(1, 9);

    /* renamed from: f */
    public boolean f30549f = false;

    /* renamed from: j */
    public boolean f30550j = false;

    /* renamed from: k */
    public boolean f30551k = false;

    /* renamed from: l */
    public boolean f30552l = false;

    /* renamed from: m */
    public int f30553m = 0;

    /* renamed from: n */
    public int f30554n = 0;

    /* renamed from: o */
    public String f30555o;

    /* renamed from: p */
    public ArrayList f30556p;

    /* renamed from: q */
    public final List f30557q = new ArrayList();

    /* renamed from: r */
    public Context f30558r;

    /* renamed from: s */
    public szq f30559s;

    /* renamed from: t */
    public sug f30560t;

    /* renamed from: u */
    public C1350sh f30561u;

    /* renamed from: v */
    public UUID f30562v;

    /* renamed from: w */
    public cbqb f30563w = null;

    /* renamed from: x */
    public Menu f30564x;

    /* renamed from: y */
    public Uri f30565y;

    /* renamed from: z */
    public tds f30566z;

    /* renamed from: e */
    public final void mo17979e() {
        synchronized (this.f30539C) {
            this.f30545I = true;
        }
        ProgressDialog progressDialog = this.f30546c;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f30546c.dismiss();
        }
        this.f30566z.mo26406a(this.f30537A, 32);
        svf a = this.f30560t.mo26094a(getResources().getString(C0126R.string.c11n_device_consent_activity_label), 0);
        svk svk = new svk(this.f30558r);
        svk.mo26104a(false);
        svk.mo26106c(C0126R.string.c11n_connection_lost);
        svk.mo26086b(0);
        a.mo26149a((sui) svk);
        svk svk2 = new svk(this.f30558r);
        svk2.mo26106c(C0126R.string.c11n_tap_to_retry);
        svk2.mo26102a(new tat(this));
        svk2.mo26086b(1);
        a.mo26149a((sui) svk2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        return;
     */
    /* renamed from: g */
    public final synchronized void mo17980g() {
        if (!this.f30545I && !this.f30544H) {
            if (this.f30540D) {
                if (!this.f30541E) {
                }
            }
            this.f30545I = true;
            if (!this.f30543G) {
                try {
                    this.f30548e.execute(new taz(this));
                } catch (RejectedExecutionException e) {
                    f30536b.mo25417e("Couldn't start ReadDataTask", e, new Object[0]);
                }
            } else {
                mo17979e();
            }
        }
    }

    /* renamed from: h */
    public final void mo17981h() {
        synchronized (this.f30539C) {
            this.f30544H = true;
        }
        try {
            this.f30548e.execute(new taw(this));
        } catch (RejectedExecutionException e) {
            f30536b.mo25417e("Couldn't start GetMessageOverridesTask", e, new Object[0]);
            synchronized (this.f30539C) {
                this.f30543G = true;
                this.f30544H = false;
                mo17980g();
            }
        }
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    /* renamed from: j */
    public final sza mo17982j() {
        return new sza(this);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(cdfz.m133090d())) {
            return false;
        }
        this.f30565y = Uri.parse(cdfz.m133090d());
        this.f30564x = menu;
        getMenuInflater().inflate(C0126R.C0130menu.settings_menu, this.f30564x);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        ProgressDialog progressDialog = this.f30546c;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f30546c.dismiss();
            this.f30546c = null;
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.c11n_learn_more) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", this.f30565y);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.f30542F && isChangingConfigurations()) {
            f30536b.mo25412b("Saving instance state", new Object[0]);
            bundle.putBoolean("changing_configurations", true);
            synchronized (this.f30539C) {
                bundle.putBoolean("init_failed", this.f30543G);
            }
        }
        cbqb cbqb = this.f30563w;
        if (cbqb != null) {
            bundle.putByteArray("message_overrides", cbqb.mo73642k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        Context applicationContext = getApplicationContext();
        this.f30558r = applicationContext;
        this.f30559s = szq.m36667a(applicationContext);
        this.f30546c = ProgressDialog.show(this, null, getResources().getString(C0126R.string.common_loading));
        this.f30560t = sug;
        this.f30562v = UUID.randomUUID();
        this.f30566z = tds.m36774a(this.f30558r);
        this.f30537A = new tdx(this.f30562v.toString(), new tdj());
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        boolean z = false;
        if (bundle != null) {
            this.f30566z.mo26406a(this.f30537A, 29);
            f30536b.mo25412b("savedInstanceState not null", new Object[0]);
            this.f30552l = bundle.getBoolean("changing_configurations", false);
            boolean z2 = bundle.getBoolean("init_failed", false);
            try {
                byte[] byteArray = bundle.getByteArray("message_overrides");
                if (byteArray != null && byteArray.length > 0) {
                    bxvd da = cbqb.f177986o.mo74144da();
                    da.mo73635b(byteArray, bxus.m123744c());
                    this.f30563w = (cbqb) da.mo74062i();
                }
            } catch (bxwf | NullPointerException e) {
                f30536b.mo25417e("Couldn't parse messageOverrides", e, new Object[0]);
                this.f30563w = null;
            }
            z = z2;
        } else {
            this.f30566z.mo26406a(this.f30537A, 28);
        }
        this.f30538B = new tay(this, this.f30547d, z);
        sxt.m36563a();
        sxt.m36567a(this, this.f30562v, this.f30538B);
    }
}

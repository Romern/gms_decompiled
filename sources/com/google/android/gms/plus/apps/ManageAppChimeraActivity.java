package com.google.android.gms.plus.apps;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageAppChimeraActivity extends deu implements View.OnClickListener, AccountManagerCallback, rjz, rka, anun, anum, anuo, anne, anng, annn, anup, anmy {

    /* renamed from: b */
    private static final List f82229b = Collections.emptyList();

    /* renamed from: A */
    private String f82230A;

    /* renamed from: c */
    private Account f82231c;

    /* renamed from: d */
    private String f82232d;

    /* renamed from: e */
    private String f82233e;

    /* renamed from: f */
    private String f82234f;

    /* renamed from: g */
    private String f82235g;

    /* renamed from: h */
    private ApplicationEntity f82236h;

    /* renamed from: i */
    private AppAclsEntity f82237i;

    /* renamed from: j */
    private boolean f82238j;

    /* renamed from: k */
    private boolean f82239k;

    /* renamed from: l */
    private boolean f82240l;

    /* renamed from: m */
    private boolean f82241m;

    /* renamed from: n */
    private boolean f82242n;

    /* renamed from: o */
    private boolean f82243o;

    /* renamed from: p */
    private View f82244p;

    /* renamed from: q */
    private TextView f82245q;

    /* renamed from: r */
    private View f82246r;

    /* renamed from: s */
    private TextView f82247s;

    /* renamed from: t */
    private AppAclsEntity f82248t;

    /* renamed from: u */
    private AppAclsEntity f82249u;

    /* renamed from: v */
    private boolean f82250v;

    /* renamed from: w */
    private boolean f82251w;

    /* renamed from: x */
    private annh f82252x;

    /* renamed from: y */
    private final anul f82253y;

    /* renamed from: z */
    private anuy f82254z;

    public ManageAppChimeraActivity() {
        this(anuy.f77749a);
    }

    /* renamed from: a */
    private static final AppAclsEntity m68299a(AppAclsEntity appAclsEntity, Audience audience, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Integer num) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        anwr anwr = new anwr();
        if (audience == null) {
            audience = appAclsEntity.f82370c;
        }
        anwr.f77832b = audience;
        if (arrayList == null) {
            arrayList = appAclsEntity.f82371d;
        }
        anwr.f77833c = arrayList;
        if (bool == null) {
            z = appAclsEntity.f82372e;
        } else {
            z = bool.booleanValue();
        }
        anwr.f77834d = z;
        if (bool2 == null) {
            z2 = appAclsEntity.f82373f;
        } else {
            z2 = bool2.booleanValue();
        }
        anwr.f77835e = z2;
        if (bool3 == null) {
            z3 = appAclsEntity.f82374g;
        } else {
            z3 = bool3.booleanValue();
        }
        anwr.f77836f = z3;
        if (bool4 == null) {
            z4 = appAclsEntity.f82375h;
        } else {
            z4 = bool4.booleanValue();
        }
        anwr.f77837g = z4;
        if (str == null) {
            str = appAclsEntity.f82377j;
        }
        anwr.f77839i = str;
        if (str2 == null) {
            str2 = appAclsEntity.f82378k;
        }
        anwr.f77840j = str2;
        if (num == null) {
            i = appAclsEntity.f82376i;
        } else {
            i = num.intValue();
        }
        anwr.f77838h = i;
        anwr.f77831a = appAclsEntity.f82369b;
        return anwr.mo42346a();
    }

    /* renamed from: b */
    private final void m68305b(boolean z) {
        this.f82246r.setEnabled(z);
    }

    /* renamed from: e */
    private final void m68306e() {
        findViewById(C0126R.C0129id.loading_spinner).setVisibility(8);
        findViewById(C0126R.C0129id.content_view).setVisibility(0);
    }

    /* renamed from: g */
    private final ApplicationEntity m68307g() {
        boolean booleanExtra = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_IS_ASPEN", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_HAS_CONN_READ", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_IS_FITNESS", false);
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.plus.APP_PACKAGE");
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.plus.APP_REVOKE_MESSAGE");
        if (stringExtra != null) {
            PackageManager packageManager = getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(stringExtra, 0);
                if (applicationInfo != null) {
                    return new ApplicationEntity(packageManager.getApplicationLabel(applicationInfo).toString(), null, this.f82232d, applicationInfo, booleanExtra, this.f82234f, this.f82235g, booleanExtra2, booleanExtra3, stringExtra2);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        String stringExtra3 = getIntent().getStringExtra("com.google.android.gms.plus.APP_NAME");
        if (!TextUtils.isEmpty(stringExtra3)) {
            return new ApplicationEntity(stringExtra3, getIntent().getStringExtra("com.google.android.gms.plus.APP_ICON_URL"), this.f82232d, null, booleanExtra, this.f82234f, this.f82235g, booleanExtra2, booleanExtra3, stringExtra2);
        }
        if (!Log.isLoggable("AppSettings", 5)) {
            return null;
        }
        Log.w("AppSettings", "Missing required EXTRA_APP_NAME");
        return null;
    }

    /* renamed from: h */
    private final void m68308h() {
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
    }

    /* renamed from: i */
    private final void m68309i() {
        if ((this.f82238j && this.f82236h.f82385g) || this.f82236h.f82388j) {
            mo8628aW().mo15850b((int) C0126R.C0127drawable.plus_icon_red_32);
            View findViewById = findViewById(C0126R.C0129id.pacl_layout);
            this.f82244p = findViewById;
            findViewById.setOnClickListener(this);
            this.f82245q = (TextView) findViewById(C0126R.C0129id.pacl_label);
            this.f82246r = findViewById(C0126R.C0129id.facl_layout);
            this.f82247s = (TextView) findViewById(C0126R.C0129id.facl_label);
        }
        m68310j();
        m68311k();
    }

    /* renamed from: j */
    private final void m68310j() {
        if (this.f82234f != null) {
            ((TextView) findViewById(C0126R.C0129id.scopes_label)).setText(this.f82234f);
            findViewById(C0126R.C0129id.scopes_layout).setVisibility(0);
            findViewById(C0126R.C0129id.scopes_divider).setVisibility(0);
        }
    }

    /* renamed from: k */
    private final void m68311k() {
        if (this.f82235g != null) {
            findViewById(C0126R.C0129id.disconnect_divider).setVisibility(0);
            View findViewById = findViewById(C0126R.C0129id.disconnect_layout);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(this);
            ((TextView) findViewById(C0126R.C0129id.disconnect_label)).setText((int) C0126R.string.plus_manage_app_disconnect_label);
            return;
        }
        findViewById(C0126R.C0129id.disconnect_divider).setVisibility(8);
        findViewById(C0126R.C0129id.disconnect_layout).setVisibility(8);
    }

    /* renamed from: l */
    private final void m68312l() {
        setResult(1);
        finish();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Audience audience;
        if (i == 0) {
            m68304a(true);
            if (i2 == -1) {
                AppAclsEntity appAclsEntity = this.f82237i;
                if (appAclsEntity != null) {
                    audience = appAclsEntity.f82370c;
                } else {
                    audience = null;
                }
                if (audience == null) {
                    audience = new sfd().mo25465a();
                }
                ArrayList f = rqa.m34231f(intent);
                sfd sfd = new sfd(audience);
                sfd.mo25467a(f);
                Audience a = sfd.mo25465a();
                m68303a(getString(C0126R.string.plus_manage_app_updating_acl));
                anwr anwr = new anwr();
                anwr.f77832b = a;
                this.f82248t = anwr.mo42346a();
            }
        } else if (i == 1) {
            m68305b(true);
            if (i2 != -1) {
                return;
            }
            if (this.f82250v || this.f82251w) {
                m68303a(getString(C0126R.string.plus_manage_app_updating_acl));
                rqa a2 = rqg.m34262a(intent);
                anwr anwr2 = new anwr();
                anwr2.f77833c = a2.mo25016c();
                anwr2.f77834d = a2.mo25010a();
                anwr2.f77835e = a2.mo25015b();
                anwr2.f77836f = this.f82250v;
                anwr2.f77837g = this.f82251w;
                this.f82249u = anwr2.mo42346a();
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.pacl_layout) {
            m68304a(false);
            List list = this.f82237i.f82370c.f30287b;
            if (list == null) {
                list = f82229b;
            }
            rqa a = rpz.m34221a();
            a.mo25007a(this.f82231c.name);
            a.mo25013b(list);
            a.mo25011b(getString(C0126R.string.plus_manage_app_pacl_sub_label));
            a.mo25019d(String.valueOf(byug.GOOGLE_SETTINGS.f168292ja));
            startActivityForResult(a.f43513a, 0);
            m68301a(rig.f43034b);
        } else if (id == C0126R.C0129id.facl_layout) {
            m68305b(false);
            AppAclsEntity appAclsEntity = this.f82237i;
            List list2 = appAclsEntity.f82371d;
            boolean z = appAclsEntity.f82372e;
            boolean z2 = appAclsEntity.f82373f;
            boolean z3 = appAclsEntity.f82374g;
            boolean z4 = appAclsEntity.f82375h;
            String str = appAclsEntity.f82376i != 0 ? "GOOGLE_PLUS" : "GOOGLE";
            String str2 = appAclsEntity.f82377j;
            if (list2 == null) {
                list2 = f82229b;
            }
            rqa a2 = rqg.m34261a();
            a2.mo25007a(this.f82231c.name);
            a2.mo25013b(list2);
            a2.mo25009a(z);
            a2.mo25014b(z2);
            a2.mo25018c(true);
            a2.mo25020d(z3);
            a2.mo25021e(z4);
            a2.f43513a.putExtra("TITLE_LOGO", str);
            a2.mo25011b(str2);
            a2.mo25019d(String.valueOf(byug.GOOGLE_SETTINGS.f168292ja));
            startActivityForResult(a2.f43513a, 1);
            m68301a(rig.f43033a);
        } else if (id != C0126R.C0129id.disconnect_layout) {
            throw new IllegalArgumentException();
        } else if (this.f82240l) {
            Account account = this.f82231c;
            ApplicationEntity applicationEntity = this.f82236h;
            String a3 = spn.m35852a((Activity) this);
            boolean z5 = this.f82238j;
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putParcelable("application", ApplicationEntity.m68424a(applicationEntity));
            bundle.putString("calling_package_name", a3);
            bundle.putBoolean("signed_up", z5);
            annf annf = new annf();
            annf.setArguments(bundle);
            annf.show(getSupportFragmentManager(), "disconnect_source_dialog");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (soz.m35807f(this)) {
            Log.w("AppSettings", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
            return;
        }
        String a = spn.m35852a((Activity) this);
        this.f82233e = a;
        if (a == null || !rfz.m33557a(this).mo24610b(this.f82233e)) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null) {
            this.f82231c = (Account) bundle.getParcelable("account");
            this.f82232d = bundle.getString("app_id");
            this.f82236h = (ApplicationEntity) bundle.getParcelable("app_entity");
            this.f82237i = (AppAclsEntity) bundle.getParcelable("app_acls");
            this.f82241m = bundle.getBoolean("app_acls_loading");
            this.f82242n = bundle.getBoolean("app_acls_loaded");
            this.f82248t = (AppAclsEntity) bundle.getParcelable("pacl_to_write");
            this.f82249u = (AppAclsEntity) bundle.getParcelable("facl_to_write");
            this.f82250v = bundle.getBoolean("facl_show_circles");
            this.f82251w = bundle.getBoolean("facl_show_contacts");
            this.f82234f = bundle.getString("scopes");
            this.f82235g = bundle.getString("revoke_handle");
            if (bundle.containsKey("is_signed_up")) {
                this.f82238j = bundle.getBoolean("is_signed_up");
                this.f82239k = true;
            }
        }
        if (this.f82231c == null || this.f82232d == null) {
            this.f82231c = (Account) getIntent().getParcelableExtra("com.google.android.gms.plus.ACCOUNT");
            this.f82232d = getIntent().getStringExtra("com.google.android.gms.plus.APP_ID");
            this.f82234f = getIntent().getStringExtra("com.google.android.gms.plus.APP_SCOPES");
            this.f82235g = getIntent().getStringExtra("com.google.android.gms.plus.APP_REVOKE_HANDLE");
        }
        Account account = this.f82231c;
        if (account == null || this.f82232d == null) {
            if (Log.isLoggable("AppSettings", 5)) {
                Log.w("AppSettings", String.format("Missing required extra(s): account=%s appId=%s", this.f82231c, this.f82232d));
            }
            m68312l();
            return;
        }
        sez.m35132a(this, account.name, new String[]{"service_googleme"}, this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        annh annh = (annh) supportFragmentManager.findFragmentByTag("disconnect_source_fragment");
        this.f82252x = annh;
        if (annh == null) {
            Account account2 = this.f82231c;
            anul anul = anuy.f77749a;
            annh annh2 = new annh();
            annh2.f77187a = anul;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("account", account2);
            annh2.setArguments(bundle2);
            this.f82252x = annh2;
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(this.f82252x, "disconnect_source_fragment");
            beginTransaction.commit();
        }
        ApplicationEntity g = m68307g();
        this.f82236h = g;
        if (g == null) {
            m68312l();
            return;
        }
        anlv a2 = anlw.m64727a(this).mo41925a(this.f82236h);
        if (a2.f77094c && this.f82236h.f82381c != null) {
            anno a3 = anno.m64822a((Context) this);
            a3.mo41997a((annn) this);
            ApplicationEntity applicationEntity = this.f82236h;
            a3.mo41998a(applicationEntity, applicationEntity.f82381c);
        }
        setContentView((int) C0126R.C0128layout.plus_manage_app_activity);
        if (this.f82242n) {
            m68306e();
        }
        C1341rz aW = mo8628aW();
        if (this.f82236h.f82385g) {
            aW.mo15855c((int) C0126R.string.plus_manage_aspen_app_label);
        } else {
            aW.mo15855c((int) C0126R.string.plus_manage_app_label);
        }
        aW.mo15853b(true);
        ((TextView) findViewById(C0126R.C0129id.app_name)).setText(a2.f77092a);
        ((ImageView) findViewById(C0126R.C0129id.app_icon)).setImageDrawable(a2.f77093b);
        m68309i();
        anna.m64797a();
        if (anna.m64798b(this, 3)) {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            if (supportFragmentManager2.findFragmentByTag("disabled_dialog") == null) {
                CharSequence a4 = anna.m64796a(this, 3);
                Bundle bundle3 = new Bundle();
                bundle3.putCharSequence("message", a4);
                anmz anmz = new anmz();
                anmz.setArguments(bundle3);
                anmz.show(supportFragmentManager2, "disabled_dialog");
            }
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, (int) C0126R.string.common_list_apps_menu_help);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse((String) ansx.f77697s.mo25081c()));
        if (!spn.m35860a(this, data)) {
            rid.m33629a(this, data, 2);
        } else {
            startActivity(data);
        }
        return true;
    }

    public final void onPause() {
        super.onPause();
        anuy anuy = this.f82254z;
        if (anuy != null && (anuy.mo24648p() || this.f82254z.mo24649q())) {
            this.f82254z.mo14032j();
        }
        this.f82240l = false;
    }

    public final void onResumeFragments() {
        super.onResumeFragments();
        anuy anuy = this.f82254z;
        if (anuy != null && !anuy.mo24648p() && !this.f82254z.mo24649q()) {
            this.f82254z.mo42332x();
        }
        this.f82240l = true;
        annh annh = this.f82252x;
        if (annh.f77194h) {
            annh.mo41982b(annh.f77193g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.f82231c);
        bundle.putString("app_id", this.f82232d);
        bundle.putParcelable("app_entity", this.f82236h);
        bundle.putParcelable("app_acls", this.f82237i);
        bundle.putBoolean("app_acls_loading", this.f82241m);
        bundle.putBoolean("app_acls_loaded", this.f82242n);
        bundle.putParcelable("pacl_to_write", this.f82248t);
        bundle.putParcelable("facl_to_write", this.f82249u);
        bundle.putBoolean("facl_show_circles", this.f82250v);
        bundle.putBoolean("facl_show_contacts", this.f82251w);
        if (this.f82239k) {
            bundle.putBoolean("is_signed_up", this.f82238j);
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.f82239k = true;
        try {
            this.f82238j = ((Boolean) accountManagerFuture.getResult()).booleanValue();
        } catch (Exception e) {
        }
        m68309i();
        if (this.f82238j) {
            this.f82254z = anme.m64734a(this.f82253y, this, this, this, this.f82231c.name);
        } else {
            this.f82254z = anme.m64737b(this.f82253y, this, this, this, this.f82231c.name);
        }
        if (this.f82240l) {
            this.f82254z.mo42332x();
        }
    }

    public ManageAppChimeraActivity(anul anul) {
        this.f82253y = anul;
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        setResult(0);
        finish();
        return true;
    }

    /* renamed from: b */
    public final void mo42294b(ConnectionResult connectionResult) {
        String str;
        m68308h();
        if (!connectionResult.mo17671b()) {
            Toast.makeText(this, (int) C0126R.string.plus_manage_app_acl_error, 0).show();
            this.f82248t = null;
            this.f82249u = null;
            return;
        }
        AppAclsEntity appAclsEntity = this.f82248t;
        if (appAclsEntity != null) {
            this.f82237i = m68299a(this.f82237i, appAclsEntity.f82370c, null, null, null, null, null, null, null, null);
            Audience audience = this.f82248t.f82370c;
            if (audience != null) {
                TextView textView = this.f82245q;
                List list = audience.f30287b;
                if (list == null || list.isEmpty()) {
                    str = getString(C0126R.string.plus_manage_app_only_you_label);
                } else if (list.size() == 1) {
                    str = ((AudienceMember) list.get(0)).f30296f;
                    if (TextUtils.isEmpty(str)) {
                        str = getString(C0126R.string.plus_manage_app_limited_label);
                    }
                } else {
                    AudienceMember audienceMember = null;
                    AudienceMember audienceMember2 = null;
                    AudienceMember audienceMember3 = null;
                    for (int i = 0; i < list.size(); i++) {
                        AudienceMember audienceMember4 = (AudienceMember) list.get(i);
                        int i2 = audienceMember4.f30292b;
                        if (i2 == 1 && audienceMember4.f30293c == 1) {
                            audienceMember = audienceMember4;
                        } else if (i2 == 1 && audienceMember4.f30293c == 4) {
                            audienceMember2 = audienceMember4;
                        } else if (i2 == 1 && audienceMember4.f30293c == 2) {
                            audienceMember3 = audienceMember4;
                        }
                    }
                    str = audienceMember != null ? m68300a(audienceMember.f30296f, (int) C0126R.string.common_chips_label_public) : audienceMember2 != null ? m68300a(audienceMember2.f30296f, (int) C0126R.string.plus_manage_app_extended_circles_label) : (audience.f30288c == 1 && audienceMember3 != null) ? m68300a(audienceMember3.f30296f, (int) C0126R.string.plus_manage_app_domain_label) : getString(C0126R.string.plus_manage_app_limited_label);
                }
                textView.setText(str);
            } else {
                this.f82245q.setVisibility(8);
            }
            m68302a(rig.f43036d, rij.m33634a(this.f82248t.f82370c));
            this.f82248t = null;
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        anna.m64797a();
        if (!anna.m64798b(this, 3)) {
            if ((!this.f82238j || !this.f82236h.f82385g) && !this.f82236h.f82388j) {
                m68306e();
            } else if (this.f82237i == null && !this.f82241m) {
                this.f82241m = true;
                this.f82242n = false;
                this.f82254z.mo42310a(this, this.f82232d, this.f82236h);
            } else {
                AppAclsEntity appAclsEntity = this.f82248t;
                if (appAclsEntity != null) {
                    this.f82254z.mo42309a(this, this.f82232d, appAclsEntity.f82370c);
                } else {
                    AppAclsEntity appAclsEntity2 = this.f82249u;
                    if (appAclsEntity2 != null) {
                        this.f82254z.mo42311a(this, this.f82232d, this.f82236h, appAclsEntity2.f82371d, appAclsEntity2.f82372e, appAclsEntity2.f82373f, appAclsEntity2.f82374g, appAclsEntity2.f82375h);
                    }
                }
            }
            if (this.f82235g == null && !this.f82243o) {
                this.f82243o = true;
                this.f82254z.mo42312a(this, ((Integer) ansx.f77703y.mo25081c()).intValue(), this.f82230A);
            }
        }
    }

    /* renamed from: a */
    private final String m68300a(String str, int i) {
        return TextUtils.isEmpty(str) ? getString(i) : str;
    }

    /* renamed from: a */
    private final void m68301a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        m68302a(favaDiagnosticsEntity, (ClientActionDataEntity) null);
    }

    /* renamed from: a */
    private final void m68302a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        shy shy = new shy(this);
        shy.mo25576a(this.f82231c.name);
        shy.mo25573a(favaDiagnosticsEntity);
        shy.mo25581c(this.f82236h.f82385g ? rih.f43051e : rih.f43052f);
        shy.mo25579b(this.f82233e);
        if (clientActionDataEntity != null) {
            shy.mo25575a(clientActionDataEntity);
        }
        shz.m35341a(this, shy);
    }

    /* renamed from: a */
    private final void m68303a(String str) {
        aoni a = aoni.m66138a(str);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(a, "progress_dialog");
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    private final void m68304a(boolean z) {
        this.f82244p.setEnabled(z);
        this.f82246r.setEnabled(z);
    }

    /* renamed from: b */
    public final void mo42295b(ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        this.f82241m = false;
        this.f82242n = true;
        if (connectionResult.mo17671b()) {
            this.f82237i = appAclsEntity;
            this.f82250v = appAclsEntity.f82374g;
            this.f82251w = appAclsEntity.f82375h;
        } else if (Log.isLoggable("AppSettings", 5)) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to load application ACLs: ");
            sb.append(valueOf);
            Log.w("AppSettings", sb.toString());
        }
        m68306e();
    }

    /* renamed from: a */
    public final void mo41974a() {
        finish();
    }

    /* renamed from: a */
    public final void mo41933a(anxl anxl, Drawable drawable) {
        if (drawable != null) {
            ((ImageView) findViewById(C0126R.C0129id.app_icon)).setImageDrawable(drawable);
            anlw.m64727a(this).mo41926a(anxl, drawable);
        }
    }

    /* renamed from: a */
    public final void mo41978a(anxl anxl, boolean z) {
        annh annh = this.f82252x;
        if (!annh.f77190d) {
            annh.f77190d = true;
            annh.f77191e = ApplicationEntity.m68424a(anxl);
            annh.f77192f = z;
            if (annh.f77188b.mo24648p()) {
                annh.mo7257g(Bundle.EMPTY);
            } else if (!annh.f77189c) {
                annh.f77188b.mo42332x();
                annh.f77189c = true;
            }
            m68303a(getString(C0126R.string.plus_disconnect_source_progress_dialog_message, new Object[]{anlw.m64727a(this).mo41925a(anxl).f77092a}));
            return;
        }
        if (Log.isLoggable("DisconnectSource", 5)) {
            Log.w("DisconnectSource", "Can only disconnect one app at a time.");
        }
        aong.m66135a(getString(C0126R.string.plus_disconnect_source_failed_dialog_message, new Object[]{anxl.mo42351a()})).show(getSupportFragmentManager(), "error_dialog");
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        m68312l();
    }

    /* renamed from: a */
    public final void mo42028a(ConnectionResult connectionResult, anxm anxm, String str) {
        int i = 0;
        this.f82243o = false;
        if (anxm != null && connectionResult.mo17671b()) {
            int a = anxm.mo24660a();
            while (true) {
                if (i >= a) {
                    break;
                }
                anxl b = anxm.mo24661a(i);
                if (this.f82232d.equals(b.mo42353c())) {
                    this.f82234f = b.mo42357h();
                    this.f82235g = b.mo42358i();
                    this.f82236h = m68307g();
                    m68310j();
                    m68311k();
                    break;
                }
                i++;
            }
            if (this.f82235g == null && str != null) {
                this.f82243o = true;
                this.f82230A = str;
                this.f82254z.mo42312a(this, ((Integer) ansx.f77703y.mo25081c()).intValue(), str);
            }
        }
    }

    /* renamed from: a */
    public final void mo42296a(ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        m68308h();
        if (connectionResult.mo17671b()) {
            AppAclsEntity a = m68299a(this.f82237i, null, appAclsEntity.f82371d, Boolean.valueOf(appAclsEntity.f82372e), Boolean.valueOf(appAclsEntity.f82373f), Boolean.valueOf(appAclsEntity.f82374g), Boolean.valueOf(appAclsEntity.f82375h), appAclsEntity.f82377j, appAclsEntity.f82378k, Integer.valueOf(appAclsEntity.f82376i));
            this.f82237i = a;
            if (a.mo46590a()) {
                this.f82247s.setText(a.f82378k);
            } else {
                this.f82247s.setVisibility(8);
            }
            m68302a(rig.f43035c, rij.m33635a(appAclsEntity.f82371d, appAclsEntity.f82372e, appAclsEntity.f82373f));
        } else {
            Toast.makeText(this, (int) C0126R.string.plus_manage_app_acl_error, 0).show();
        }
        this.f82249u = null;
    }

    /* renamed from: a */
    public final boolean mo41981a(ConnectionResult connectionResult, anxl anxl) {
        ApplicationInfo d;
        if (this.f82240l) {
            m68308h();
            if (connectionResult == null || !connectionResult.mo17671b()) {
                aong a = aong.m66135a(getString(C0126R.string.plus_disconnect_source_failed_dialog_message, new Object[]{anxl.mo42351a()}));
                try {
                    FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                    beginTransaction.add(a, "error_dialog");
                    beginTransaction.commit();
                } catch (IllegalStateException e) {
                }
            } else {
                if (anxl.mo42356g() && (d = anxl.mo42354d()) != null && !TextUtils.isEmpty(d.packageName)) {
                    Intent b = sbv.m34880b(d.packageName, this.f82231c.name);
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("Broadcasting Fitness app disconnected intent: ");
                    sb.append(valueOf);
                    sb.toString();
                    sendBroadcast(b);
                }
                Intent intent = new Intent();
                intent.putExtra("com.google.android.gms.plus.DISCONNECTED_APP_ID", anxl.mo42353c());
                setResult(-1, intent);
                finish();
            }
            return true;
        }
        return false;
    }
}

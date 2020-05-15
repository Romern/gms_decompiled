package com.google.android.libraries.matchstick.settings;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickSettingsChimeraActivity extends qkh {

    /* renamed from: A */
    public static final /* synthetic */ int f111130A = 0;

    /* renamed from: B */
    private azjr f111131B;

    /* renamed from: C */
    private sui f111132C;

    /* renamed from: D */
    private BroadcastReceiver f111133D;

    /* renamed from: E */
    private SettingItemsChangeReceiver f111134E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f111135F;

    /* renamed from: G */
    private boolean f111136G;

    /* renamed from: H */
    private qxo f111137H;

    /* renamed from: I */
    private boolean f111138I = false;

    /* renamed from: J */
    private SwitchBar f111139J;

    /* renamed from: b */
    public azdl f111140b;

    /* renamed from: c */
    public final Object f111141c = new Object();

    /* renamed from: d */
    public String f111142d;

    /* renamed from: e */
    public boolean f111143e = true;

    /* renamed from: f */
    public ArrayList f111144f;

    /* renamed from: j */
    public ConditionVariable f111145j;

    /* renamed from: k */
    public String f111146k;

    /* renamed from: l */
    public String f111147l;

    /* renamed from: m */
    public AlertDialog f111148m;

    /* renamed from: n */
    public ProgressDialog f111149n;

    /* renamed from: o */
    public boolean f111150o;

    /* renamed from: p */
    public boolean f111151p;

    /* renamed from: q */
    public sug f111152q;

    /* renamed from: r */
    public azph f111153r;

    /* renamed from: s */
    public Context f111154s;

    /* renamed from: t */
    public AccessibilityManager f111155t;

    /* renamed from: u */
    public Handler f111156u;

    /* renamed from: v */
    public final Map f111157v = new ConcurrentHashMap();

    /* renamed from: w */
    public HashSet f111158w;

    /* renamed from: x */
    public HashSet f111159x;

    /* renamed from: y */
    public boolean f111160y;

    /* renamed from: z */
    public svf f111161z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SettingItemsChangeReceiver extends aacn {

        /* renamed from: a */
        public aziu f111164a;

        public SettingItemsChangeReceiver(aziu aziu) {
            super("matchstick");
            this.f111164a = aziu;
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("all_accounts_extra");
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f111164a.f99500a;
            azox.m85981a();
            matchstickSettingsChimeraActivity.f111144f = parcelableArrayListExtra;
            matchstickSettingsChimeraActivity.f111145j.open();
        }
    }

    /* renamed from: a */
    private final sui m94641a(boolean z) {
        svk svk = new svk(getApplicationContext());
        this.f111132C = svk;
        svk.mo26106c(C0126R.string.google_accounts);
        this.f111132C.mo26104a(z);
        this.f111132C.mo26102a(new aziw(this));
        return this.f111132C;
    }

    /* renamed from: h */
    private final sui m94644h() {
        return mo60394a((int) C0126R.string.ms_settings_learn_more_desc);
    }

    /* renamed from: j */
    private final sui m94645j() {
        svk svk = new svk(getApplicationContext());
        svk.mo26106c(C0126R.string.ms_manage_storage);
        svk.mo26102a(new azjp(this));
        return svk;
    }

    /* renamed from: e */
    public final boolean mo60397e() {
        boolean e = this.f111140b.mo54770e();
        String a = this.f111140b.mo54738a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 37);
        sb.append("isRegistered=");
        sb.append(e);
        sb.append("  activeUserNumber=");
        sb.append(a);
        sb.toString();
        synchronized (this.f111141c) {
            this.f111142d = a;
            this.f111143e = e;
        }
        return !e || this.f111136G || this.f111140b.f99088a.getLong("last_successful_token_refresh_timestamp_millis", 0) + (cfeo.f183719a.mo6606a().mo81002bI() * 1000) >= System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo60398g() {
        int length;
        for (sui sui : this.f111161z.mo26154g()) {
            this.f111161z.mo26153d(sui);
        }
        Cursor a = azcd.m85251a(getContentResolver(), azcc.f98959a);
        if (a != null) {
            while (a.moveToNext()) {
                azcb a2 = azcb.m85239a(a);
                if (!TextUtils.equals("businessmessaging", a2.mo54588a())) {
                    Iterator it = bmyx.m108640a(';').mo66918a((CharSequence) cfeo.m138847D()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals((String) it.next(), a2.mo54588a())) {
                                break;
                            }
                        } else {
                            svk svk = new svk(getApplicationContext());
                            svk.mo26085a(a2.mo54590c());
                            byte[] d = a2.mo54591d();
                            if (d != null && (length = d.length) > 0) {
                                svk.mo26101a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(d, 0, length)));
                            } else {
                                svk.mo26101a(new BitmapDrawable(getResources(), azpi.m86076b(this.f111154s)));
                            }
                            svk.mo26104a(true);
                            svk.mo26102a(new aziv(this, a2));
                            this.f111161z.mo26149a((sui) svk);
                        }
                    }
                }
            }
        }
        if (a != null) {
            a.close();
        }
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if ((i == 1 || i == 2) && i2 == -1) {
            if (i == 2) {
                this.f111153r.mo55125a(275);
            }
            this.f111151p = true;
            recreate();
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.ms_settings_activity);
        mo8628aW().mo15839a(3.0f);
        this.f111139J = (SwitchBar) findViewById(C0126R.C0129id.ms_switch_bar);
        if (cfec.m138765b()) {
            this.f111134E = new SettingItemsChangeReceiver(new aziu(this));
            registerReceiver(this.f111134E, new IntentFilter("com.google.android.apps.libraries.matchstick.action.settings_account_populate"));
            this.f111145j = new ConditionVariable(false);
            new soa(9, new azix(this)).start();
        }
        this.f111138I = true;
        mo7102a(this.f41601g, bundle);
        this.f41601g.mo26095a((RecyclerView) findViewById(16908298));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        SettingItemsChangeReceiver settingItemsChangeReceiver = this.f111134E;
        if (settingItemsChangeReceiver != null) {
            settingItemsChangeReceiver.f111164a = null;
            unregisterReceiver(settingItemsChangeReceiver);
            this.f111134E = null;
        }
        BroadcastReceiver broadcastReceiver = this.f111133D;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f111133D = null;
        }
        ProgressDialog progressDialog = this.f111149n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f111149n.dismiss();
            this.f111149n = null;
        }
        synchronized (this.f111141c) {
            if (this.f111131B != null) {
                getContentResolver().unregisterContentObserver(this.f111131B);
                this.f111131B = null;
            }
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
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
    /* access modifiers changed from: protected */
    public final void onPause() {
        boolean z;
        super.onPause();
        AlertDialog alertDialog = this.f111148m;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f111148m.dismiss();
        }
        if (cfeo.m138866W()) {
            synchronized (this.f111141c) {
                z = this.f111143e;
            }
            if (z) {
                if (!this.f111158w.isEmpty()) {
                    Iterator it = this.f111158w.iterator();
                    while (it.hasNext()) {
                        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP");
                        intent.putExtra("server_app_id", (String) it.next());
                        intent.putExtra("sync_app_block_state_with_server", true);
                        MessagingService.m94557b(intent, this);
                    }
                }
                if (!this.f111159x.isEmpty()) {
                    Iterator it2 = this.f111159x.iterator();
                    while (it2.hasNext()) {
                        Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP");
                        intent2.putExtra("server_app_id", (String) it2.next());
                        intent2.putExtra("sync_app_block_state_with_server", true);
                        MessagingService.m94557b(intent2, this);
                    }
                }
            }
        }
        this.f111158w.clear();
        this.f111159x.clear();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.f111151p && isChangingConfigurations()) {
            bundle.putBoolean("changing_configurations", true);
        }
        if (this.f111135F) {
            bundle.putBoolean("is_last_operation_timed_out", true);
        }
    }

    /* renamed from: a */
    public final sui mo60394a(int i) {
        svk svk = new svk(getApplicationContext());
        String string = getString(i);
        String str = this.f111147l;
        String string2 = getResources().getString(C0126R.string.common_learn_more);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(string2).length());
        sb.append("<a href=");
        sb.append(str);
        sb.append(">");
        sb.append(string2);
        sb.append("</a>");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(sb2).length());
        sb3.append(string);
        sb3.append(" ");
        sb3.append(sb2);
        svk.mo26105b(URLSpanNoUnderline.m22736a(Html.fromHtml(sb3.toString())));
        svk.mo26102a(new azjo(this));
        return svk;
    }

    /* renamed from: a */
    public final void mo60395a(String str, String str2) {
        GoogleHelp a = GoogleHelp.m66336a(str);
        a.f78774q = Uri.parse(str2);
        new aarh(this).mo31646a(a.mo43194a());
    }

    /* renamed from: a */
    public final void mo60396a(sug sug) {
        azox.m85981a();
        qxo qxo = this.f111137H;
        if (qxo != null) {
            this.f111153r.mo55163a(qxo);
            this.f111137H = null;
        }
        if (this.f111135F) {
            this.f111135F = false;
            this.f111153r.mo55125a(271);
            if (!azfn.m85585b(this.f111154s)) {
                registerReceiver(new aacn("matchstick") {
                    /* class com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity.C16785 */

                    /* renamed from: a */
                    public final void mo6253a(Context context, Intent intent) {
                        MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = MatchstickSettingsChimeraActivity.this;
                        int i = MatchstickSettingsChimeraActivity.f111130A;
                        if (azfn.m85585b(matchstickSettingsChimeraActivity.f111154s)) {
                            MatchstickSettingsChimeraActivity.this.unregisterReceiver(this);
                            MatchstickSettingsChimeraActivity.this.f111151p = true;
                            MatchstickSettingsChimeraActivity.this.recreate();
                        }
                    }
                }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
            svf svf = ((svi) sug).f45221a;
            sui h = m94644h();
            h.mo26086b(0);
            svf.mo26149a(h);
            svk svk = new svk(getApplicationContext());
            svk.mo26085a(getString(C0126R.string.common_network_unavailable));
            svk.mo26105b(getString(C0126R.string.common_retry));
            svk.mo26086b(1);
            svk.mo26102a(new azjn(this));
            svf.mo26149a((sui) svk);
            this.f111150o = true;
            return;
        }
        synchronized (this.f111141c) {
            if (!this.f111143e) {
                this.f111153r.mo55125a(269);
                this.f111139J.setChecked(false);
                this.f111139J.setVisibility(0);
                this.f111139J.setOnClickListener(new azjm(this));
                svf svf2 = ((svi) sug).f45221a;
                sui h2 = m94644h();
                h2.mo26086b(0);
                svf2.mo26149a(h2);
                sui a = m94641a(false);
                a.mo26086b(1);
                svf2.mo26149a(a);
                sui j = m94645j();
                j.mo26086b(2);
                svf2.mo26149a(j);
            } else {
                this.f111153r.mo55125a(270);
                this.f111139J.setChecked(true);
                this.f111139J.setVisibility(0);
                if (this.f111148m == null) {
                    this.f111148m = new AlertDialog.Builder(this).setTitle(getString(C0126R.string.phone_number_notification_disable)).setMessage(URLSpanNoUnderline.m22736a((Spannable) Html.fromHtml(getResources().getString(C0126R.string.phone_notification_disable_message, this.f111146k)))).setPositiveButton(17039370, new azja(this)).setNegativeButton(17039360, new azjq(this)).create();
                }
                this.f111139J.setOnClickListener(new azjk(this));
                svf svf3 = ((svi) sug).f45221a;
                sui h3 = m94644h();
                h3.mo26086b(0);
                svf3.mo26149a(h3);
                sui a2 = m94641a(true);
                a2.mo26086b(1);
                svf3.mo26149a(a2);
                sui j2 = m94645j();
                j2.mo26086b(2);
                svf3.mo26149a(j2);
                if (cfeo.f183719a.mo6606a().mo80924K()) {
                    synchronized (this.f111141c) {
                        if (cfec.m138765b() && cffg.m139304b()) {
                            this.f111161z = sug.mo26098e(C0126R.string.app_settings_title);
                            mo60398g();
                        } else {
                            this.f111161z = sug.mo26098e(C0126R.string.common_connected_apps_settings_title);
                            new azju(this, this.f111161z).start();
                        }
                    }
                    if (cfeo.m138866W()) {
                        new azjl(this).start();
                    }
                }
            }
        }
        this.f111150o = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        boolean z;
        if (this.f111138I) {
            this.f111154s = getApplicationContext();
            this.f111156u = new adzt();
            this.f111155t = (AccessibilityManager) this.f111154s.getSystemService("accessibility");
            azph a = azph.m85998a(this.f111154s);
            this.f111153r = a;
            a.mo55125a(252);
            this.f111152q = sug;
            boolean z2 = false;
            this.f111150o = false;
            this.f111151p = false;
            if (bundle == null || !bundle.getBoolean("is_last_operation_timed_out", false)) {
                z = false;
            } else {
                z = true;
            }
            this.f111135F = z;
            if (bundle != null && bundle.getBoolean("changing_configurations", false)) {
                z2 = true;
            }
            this.f111136G = z2;
            this.f111140b = azdl.m85412a(this);
            this.f111146k = cfeo.f183719a.mo6606a().mo81048cB();
            this.f111147l = cfeo.f183719a.mo6606a().mo81017bX();
            this.f111158w = new HashSet();
            this.f111159x = new HashSet();
            C1341rz aW = mo8628aW();
            if (aW != null) {
                aW.mo15853b(true);
            }
            if (this.f111133D == null) {
                this.f111133D = new aacn("matchstick") {
                    /* class com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity.C167712 */

                    /* renamed from: a */
                    public final void mo6253a(Context context, Intent intent) {
                        String stringExtra = intent.getStringExtra("KEY_NAME");
                        if ("user_unregister_request_status".equals(stringExtra)) {
                            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = MatchstickSettingsChimeraActivity.this;
                            int i = MatchstickSettingsChimeraActivity.f111130A;
                            matchstickSettingsChimeraActivity.f111160y = true;
                            new azjd(this).start();
                        } else if ("tachyon_gaia_registration_status".equals(stringExtra)) {
                            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = MatchstickSettingsChimeraActivity.this;
                            int i2 = MatchstickSettingsChimeraActivity.f111130A;
                            matchstickSettingsChimeraActivity2.f111160y = true;
                            new azjf(this).start();
                        } else if ("check_registration_request_status".equals(stringExtra)) {
                            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity3 = MatchstickSettingsChimeraActivity.this;
                            int i3 = MatchstickSettingsChimeraActivity.f111130A;
                            matchstickSettingsChimeraActivity3.f111160y = true;
                            new azjh(this).start();
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.common.internal.SHARED_PREFERENCES_CHANGED");
                intentFilter.addCategory("com.google.android.gms.common.internal.SHARED_PREFERENCES:matchstick_prefs");
                registerReceiver(this.f111133D, intentFilter, "com.google.android.gms.common.internal.SHARED_PREFERENCES_PERMISSION", null);
            }
            synchronized (this.f111141c) {
                this.f111131B = new azjr(this, this.f111156u);
                getContentResolver().registerContentObserver(DatabaseProvider.m94544h("appData"), true, this.f111131B);
            }
            this.f111149n = ProgressDialog.show(this, null, getResources().getString(C0126R.string.common_loading));
            this.f111137H = this.f111153r.mo55123a("Matchstick.Settings.LoadSpinner.Time");
            new azji(this).start();
        }
    }
}

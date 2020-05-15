package com.google.android.location.settings;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Html;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.LocationRequest;
import com.google.android.location.p094ui.widget.DeviceSwitch;
import com.google.android.location.reporting.server.DeleteHistoryIntentOperation;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationHistorySettingsChimeraActivity extends bhad implements bhbc, bgzz {

    /* renamed from: f */
    public Button f150923f;

    /* renamed from: g */
    public int f150924g;

    /* renamed from: h */
    private Button f150925h;

    /* renamed from: i */
    private boolean f150926i;

    /* renamed from: j */
    private UlrSettingsChangeReceiver f150927j;

    /* renamed from: k */
    private LayoutInflater f150928k;

    /* renamed from: l */
    private int f150929l;

    /* renamed from: m */
    private ConnectivityManager f150930m;

    /* renamed from: n */
    private View f150931n;

    /* renamed from: o */
    private View f150932o;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class UlrSettingsChangeReceiver extends aacn {
        public UlrSettingsChangeReceiver() {
            super("location");
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            char c;
            LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity;
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -1848594810:
                    if (action.equals("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1239299127:
                    if (action.equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1172645946:
                    if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -177095062:
                    if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 187057876:
                    if (action.equals("com.google.android.location.settings.REMOTE_CHANGED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1 || c == 2) {
                    locationHistorySettingsChimeraActivity = LocationHistorySettingsChimeraActivity.this;
                } else if (c == 3) {
                    locationHistorySettingsChimeraActivity = LocationHistorySettingsChimeraActivity.this;
                } else if (c != 4) {
                    String valueOf = String.valueOf(action);
                    Log.e("GCoreLocationSettings", valueOf.length() == 0 ? new String("Unexpected intent: ") : "Unexpected intent: ".concat(valueOf));
                    return;
                } else {
                    Account a = bgyc.m100305a(intent);
                    if (a == null || a.equals(LocationHistorySettingsChimeraActivity.this.f118186d)) {
                        LocationHistorySettingsChimeraActivity.this.mo70944j();
                        if (a == null) {
                            Log.wtf("GCoreLocationSettings", "REMOTE_CHANGED received without an account", new Exception());
                        }
                    }
                    bguv.m100042a("UlrUiChangedDeviceSettingByRemote");
                    return;
                }
                locationHistorySettingsChimeraActivity.mo70944j();
                return;
            }
            Integer num = null;
            if ("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED".equals(intent.getAction()) && intent.hasExtra("initialization")) {
                num = Integer.valueOf(intent.getIntExtra("initialization", 0));
            }
            Account a2 = bgyc.m100305a(intent);
            if (num != null && a2 != null && a2.equals(LocationHistorySettingsChimeraActivity.this.f118186d)) {
                LocationHistorySettingsChimeraActivity.this.f150924g = num.intValue();
                LocationHistorySettingsChimeraActivity.this.mo70944j();
            }
        }
    }

    /* renamed from: a */
    private final void m117352a(Account account) {
        if (account != null) {
            bgxm.m100247a(this, "LocationHistorySettingsChimeraActivity", account);
        }
    }

    /* renamed from: d */
    private final void m117355d(String str) {
        startActivityForResult(m117360k().putExtra("extra.accountName", str), 102);
    }

    /* renamed from: e */
    private final void m117356e(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            Log.e("GCoreLocationSettings", str.length() == 0 ? new String("can't show ") : "can't show ".concat(str), e);
        }
    }

    /* renamed from: g */
    private final void m117357g(boolean z) {
        this.f150926i = z;
        String a = bgze.m100439a();
        bgxe bgxe = this.f118185c;
        if (bgxe != null) {
            bgxe.mo63308b(this.f118186d, m117361l(), this.f150926i, a);
            bguv.m100048a("UlrUiChangedAccountSetting", this.f150926i);
        }
    }

    /* renamed from: h */
    private final void m117358h(boolean z) {
        String str;
        try {
            m117357g(z);
            mo70944j();
        } catch (RemoteException e) {
            if (!z) {
                str = "Starting Location history";
            } else {
                str = "Pausing";
            }
            Log.wtf("GCoreLocationSettings", str, e);
        }
    }

    /* renamed from: i */
    private final void m117359i(boolean z) {
        if (z && !aeri.m52437b(this)) {
            LocationRequest a = LocationRequest.m66854a();
            a.mo43553c(100);
            aerj aerj = new aerj();
            aerj.mo34489a(a);
            aerj.mo34490b();
            startActivityForResult(aerj.mo34488a(), 0);
        }
    }

    /* renamed from: k */
    private static Intent m117360k() {
        Intent putExtra = new Intent().setPackage("com.google.android.gms").putExtra("extra.screenId", 227);
        if (cbro.m128210n()) {
            putExtra.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").putExtra("utmMedium", "location-history").putExtra("utmSource", "android-settings");
        } else {
            putExtra.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        }
        return putExtra;
    }

    /* renamed from: l */
    private final String m117361l() {
        int i = Build.VERSION.SDK_INT;
        Uri referrer = getReferrer();
        if (referrer != null) {
            return referrer.getHost();
        }
        return null;
    }

    /* renamed from: m */
    private final AccountConfig m117362m() {
        Account account;
        bgxe bgxe = this.f118185c;
        if (bgxe == null || (account = this.f118186d) == null) {
            return null;
        }
        try {
            AccountConfig a = bgxe.mo63304a(account);
            if (a.f150891b) {
                this.f150924g = 1;
            }
            return a;
        } catch (RemoteException e) {
            bguz.m100120a(e);
            Log.wtf("GCoreLocationSettings", e);
            return null;
        }
    }

    /* renamed from: n */
    private final void m117363n() {
        AccountConfig m = m117362m();
        if (m != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.this_device);
            linearLayout.removeAllViews();
            this.f150929l = m.f150903n;
            boolean z = true;
            if (!m.mo70907c() && m.f150908s != 2) {
                z = false;
            }
            boolean z2 = m.f150894e;
            bgws bgws = new bgws(this.f150929l);
            bgws.f117862b = m.f150904o;
            bgws.f117863c = Boolean.valueOf(z);
            bgws.f117864d = Boolean.valueOf(z2);
            bgws.f117865e = m.f150906q;
            bgws.f117866f = Long.valueOf(m.f150898i);
            RemoteDevice remoteDevice = new RemoteDevice(bgws);
            boolean z3 = m.f150902m.f150913e;
            String str = null;
            if (z2 && !z3) {
                str = getString(C0126R.string.location_ulr_settings_not_reporting_because_location_off);
            }
            m117353a(linearLayout, remoteDevice, str);
        }
    }

    /* renamed from: b */
    public final void mo63473b(String str) {
        if (((str.hashCode() == 1384328227 && str.equals("ConfirmHistoryOffDialog")) ? (char) 0 : 65535) == 0) {
            m117358h(true);
            bguv.m100042a("UlrUiLHDialogButtonCancel");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* renamed from: c */
    public final void mo63474c(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1833605732) {
            if (hashCode == 1384328227 && str.equals("ConfirmHistoryOffDialog")) {
                c = 0;
                if (c == 0) {
                    m117358h(false);
                    bguv.m100042a("UlrUiLHDialogButtonOk");
                    return;
                } else if (c == 1) {
                    this.f150923f.setText((int) C0126R.string.location_settings_delete_location_history_in_progress);
                    this.f150923f.setEnabled(false);
                    Messenger messenger = new Messenger(new bhai(this, this));
                    Account account = this.f118186d;
                    Intent startIntent = IntentOperation.getStartIntent(this, DeleteHistoryIntentOperation.class, "com.google.android.location.reporting.service.action.DELETE_HISTORY");
                    if (startIntent != null) {
                        sdo.m34959a(account);
                        startIntent.putExtra("account", account);
                        startIntent.putExtra("messenger", messenger);
                        bgzo.m100465a(this, startIntent);
                        bguv.m100042a("UlrUiHistoryDeleted");
                        return;
                    }
                    throw new IllegalStateException();
                } else {
                    return;
                }
            }
        } else if (str.equals("ConfirmDeleteLocationHistoryDialog")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo63479f(boolean z) {
        if (!z) {
            bhaa.m100507a(C0126R.string.location_settings_confirm_location_history_pause_title, C0126R.string.location_settings_confirm_location_history_pause_body, 17039370, 17039360).show(getSupportFragmentManager(), "ConfirmHistoryOffDialog");
            return;
        }
        m117357g(true);
        m117359i(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.location.settings.LocationHistorySettingsChimeraActivity.a(java.lang.String, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.location.settings.LocationHistorySettingsChimeraActivity.a(int, java.lang.String):void
      com.google.android.location.settings.LocationHistorySettingsChimeraActivity.a(com.google.android.location.reporting.server.RemoteDevice, boolean):void
      bhbc.a(com.google.android.location.reporting.server.RemoteDevice, boolean):void
      com.google.android.location.settings.LocationHistorySettingsChimeraActivity.a(java.lang.String, boolean):void */
    /* renamed from: j */
    public final void mo70944j() {
        if (!chcs.m148240l()) {
            boolean z = false;
            if (((bfkd) ((bhad) this).f118184b).f114281b.length > 0) {
                if (this.f150931n.getVisibility() != 0) {
                    this.f150931n.setVisibility(0);
                    mo63477a(0);
                    this.f150932o.setVisibility(8);
                }
                AccountConfig m = m117362m();
                if (m != null) {
                    TextView textView = (TextView) findViewById(C0126R.C0129id.other_devices_status_text);
                    View findViewById = findViewById(C0126R.C0129id.devices_section);
                    View findViewById2 = findViewById(C0126R.C0129id.no_devices_section);
                    boolean z2 = true;
                    if (!bgzo.m100466a(this, m)) {
                        mo26139b(false);
                        if (!m.f150900k && this.f150930m.getActiveNetworkInfo() != null) {
                            z = true;
                        }
                        m117354a(bgzo.m100457a(this, m, this.f150924g), z);
                        String valueOf = String.valueOf(aeqm.m52397a(this.f118186d));
                        Log.i("GCoreLocationSettings", valueOf.length() == 0 ? new String("Location History unavailable for account ") : "Location History unavailable for account ".concat(valueOf));
                        return;
                    }
                    mo63480g();
                    mo26139b(true);
                    if (m.f150908s == 2) {
                        z2 = false;
                    }
                    this.f150923f.setEnabled(z2);
                    this.f150925h.setEnabled(z2);
                    if (!z2) {
                        TextView textView2 = (TextView) findViewById(C0126R.C0129id.summary_text_kids);
                        textView2.setVisibility(0);
                        textView2.setText(Html.fromHtml(getString(C0126R.string.location_settings_location_history_learn_more_kids)));
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    } else {
                        findViewById(C0126R.C0129id.summary_text_kids).setVisibility(8);
                    }
                    if (this.f150926i) {
                        textView.setText((int) C0126R.string.common_loading);
                        findViewById.setVisibility(0);
                        findViewById2.setVisibility(8);
                        m117363n();
                        new bhaj(this).execute(new Void[0]);
                        return;
                    }
                    m117354a((String) null, false);
                }
            } else if (this.f150932o.getVisibility() != 0) {
                mo63477a(8);
                this.f150931n.setVisibility(8);
                this.f150932o.setVisibility(0);
                findViewById(C0126R.C0129id.add_account).setOnClickListener(new bhah(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 101) {
            if (i != 102) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("onActivityResult received unknown requestCode ");
                sb.append(i);
                Log.e("GCoreLocationSettings", sb.toString());
                finish();
                return;
            }
            if (i2 != -1) {
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("UDC activity failed, resultCode=");
                sb2.append(i2);
                Log.e("GCoreLocationSettings", sb2.toString());
            }
            finish();
        } else if (i2 != -1) {
            if (i2 == 0) {
                finish();
            }
        } else if (intent != null && (stringExtra = intent.getStringExtra("authAccount")) != null) {
            m117355d(stringExtra);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bguv.m100041a(this);
        bgux.m100090a(this);
        if (!sse.m36205a(this)) {
            Log.wtf("GCoreLocationSettings", "LocationHistorySettingsChimeraActivity should not have been called", new Exception());
            finish();
        } else if (bhar.m100526a(this)) {
            finish();
        } else if (!chcs.m148240l()) {
            setContentView((int) C0126R.C0128layout.location_history_reporting_settings);
            this.f150931n = findViewById(C0126R.C0129id.account_settings);
            this.f150932o = findViewById(C0126R.C0129id.no_accounts);
            this.f150923f = (Button) findViewById(C0126R.C0129id.delete_location_history);
            this.f150925h = (Button) findViewById(C0126R.C0129id.manage_activities);
            TextView textView = (TextView) findViewById(C0126R.C0129id.summary_text);
            URLSpan[] urls = textView.getUrls();
            if (urls.length > 0) {
                URLSpan uRLSpan = urls[0];
                SpannableString spannableString = new SpannableString(textView.getText());
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new bhag(this), spanStart, spanEnd, spanFlags);
                textView.setText(spannableString);
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.f150927j = null;
            this.f150924g = 0;
            this.f150928k = (LayoutInflater) getSystemService("layout_inflater");
            this.f150930m = (ConnectivityManager) getSystemService("connectivity");
            bguv.m100042a("UlrUiShown");
        } else if (chde.m148508b()) {
            startActivityForResult(m117360k(), 102);
        } else {
            Account account = this.f118186d;
            if (account == null || account.name == null) {
                String[] strArr = {"com.google"};
                startActivityForResult(rew.m33486a(null, null, strArr, false, getString(C0126R.string.location_settings_location_history_activity_title), false, 1, 2, null, false), 101);
                return;
            }
            m117355d(this.f118186d.name);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.location_history, menu);
        return true;
    }

    public void onDeleteLocationHistoryClicked(View view) {
        bhaa a = bhaa.m100507a(C0126R.string.location_settings_confirm_deleting_location_history_title, C0126R.string.location_settings_confirm_deleting_location_history_body, C0126R.string.common_ui_confirm_deleting_button, 17039360);
        a.getArguments().putInt("enablingCheckbox", C0126R.string.common_ui_confirm_deleting_checkbox);
        a.show(getSupportFragmentManager(), "ConfirmDeleteLocationHistoryDialog");
        bguv.m100042a("UlrUiHistoryDeleteClicked");
    }

    public void onManageActivitiesClicked(View view) {
        bguv.m100042a("UlrUiManageActivitiesClicked");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", null));
        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        Account account = this.f118186d;
        if (account != null) {
            intent.putExtra("account_name", account.name);
        } else {
            Log.wtf("GCoreLocationSettings", "Account null when timeline pressed", new Exception());
        }
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            bguv.m100042a("UlrUiCannotCallMaps");
            this.f150923f.setVisibility(0);
            this.f150925h.setVisibility(8);
            Log.wtf("GCoreLocationSettings", "Failed to call Maps", e);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.view_manage) {
            m117356e("https://www.google.com/locationhistory");
            return true;
        } else if (menuItem.getItemId() == C0126R.C0129id.help) {
            m117356e("https://support.google.com/accounts/answer/3118687");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        UlrSettingsChangeReceiver ulrSettingsChangeReceiver = this.f150927j;
        if (ulrSettingsChangeReceiver == null) {
            Log.e("GCoreLocationSettings", "cannot unregister UlrReceiver, it is null");
        } else {
            unregisterReceiver(ulrSettingsChangeReceiver);
            this.f150927j = null;
        }
        bguv.m100051b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        int parseInt;
        super.onResume();
        if (!chcs.m148240l()) {
            UlrSettingsChangeReceiver ulrSettingsChangeReceiver = new UlrSettingsChangeReceiver();
            this.f150927j = ulrSettingsChangeReceiver;
            LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = LocationHistorySettingsChimeraActivity.this;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
            intentFilter.addAction("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("com.google.android.location.settings.REMOTE_CHANGED");
            intentFilter.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED");
            locationHistorySettingsChimeraActivity.registerReceiver(ulrSettingsChangeReceiver, intentFilter);
            this.f150923f.setVisibility(0);
            this.f150925h.setVisibility(8);
            if (chcs.f188354a.mo6606a().mo85023L()) {
                try {
                    int applicationEnabledSetting = getPackageManager().getApplicationEnabledSetting("com.google.android.apps.maps");
                    if (applicationEnabledSetting == 1 || applicationEnabledSetting == 0) {
                        try {
                            String str = svr.m36484b(this).mo26176b("com.google.android.apps.maps", 0).versionName;
                            if (!(str == null || str.length() == 0)) {
                                String[] split = str.split("\\.");
                                if (split.length >= 2 && ((parseInt = Integer.parseInt(split[0])) != 9 ? parseInt > 9 : Integer.parseInt(split[1]) >= 20)) {
                                    this.f150923f.setVisibility(8);
                                    this.f150925h.setVisibility(0);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | NumberFormatException e) {
                        }
                    }
                } catch (IllegalArgumentException e2) {
                }
                bguv.m100042a("UlrUiMapsNotInstalled");
            }
            mo70944j();
            m117352a(this.f118186d);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m117353a(ViewGroup viewGroup, RemoteDevice remoteDevice, String str) {
        String str2;
        if (remoteDevice != null) {
            DeviceSwitch deviceSwitch = (DeviceSwitch) this.f150928k.inflate((int) C0126R.C0128layout.location_reporting_device_switch, viewGroup, false);
            deviceSwitch.f150949a = remoteDevice;
            View findViewById = deviceSwitch.findViewById(C0126R.C0129id.location_device_switch);
            sdo.m34959a(findViewById);
            deviceSwitch.f150950b = (CompoundButton) findViewById;
            ProgressBar progressBar = (ProgressBar) deviceSwitch.findViewById(C0126R.C0129id.progress_bar);
            sdo.m34959a(progressBar);
            deviceSwitch.f150951c = progressBar;
            TextView textView = (TextView) deviceSwitch.findViewById(C0126R.C0129id.device_name);
            sdo.m34959a(textView);
            deviceSwitch.f150952d = textView;
            TextView textView2 = (TextView) deviceSwitch.findViewById(C0126R.C0129id.last_report_date);
            sdo.m34959a(textView2);
            deviceSwitch.f150953e = textView2;
            if (chcs.m148243o()) {
                deviceSwitch.f150950b.setVisibility(4);
            }
            deviceSwitch.f150952d.setText(deviceSwitch.f150949a.f150870b);
            Long l = deviceSwitch.f150949a.f150873e;
            if (l != null) {
                str2 = deviceSwitch.getContext().getString(C0126R.string.location_reporting_last_reported, DateFormat.getMediumDateFormat(deviceSwitch.getContext().getApplicationContext()).format(new Date(l.longValue())));
            } else {
                str2 = deviceSwitch.getContext().getString(C0126R.string.location_reporting_last_reported_unknown);
            }
            if (str != null) {
                String valueOf = String.valueOf(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + str.length());
                sb.append(valueOf);
                sb.append(10);
                sb.append(str);
                str2 = sb.toString();
            }
            deviceSwitch.f150953e.setText(str2);
            deviceSwitch.f150950b.setChecked(deviceSwitch.f150949a.f150872d);
            boolean z = !deviceSwitch.f150949a.f150871c;
            deviceSwitch.setEnabled(z);
            deviceSwitch.f150952d.setEnabled(z);
            deviceSwitch.f150953e.setEnabled(z);
            deviceSwitch.f150950b.setEnabled(z);
            if (deviceSwitch.isEnabled() && !chcs.m148243o()) {
                deviceSwitch.setOnClickListener(deviceSwitch);
                deviceSwitch.f150950b.setOnCheckedChangeListener(deviceSwitch);
            }
            deviceSwitch.f150954f = this;
            viewGroup.addView(deviceSwitch);
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bhac mo63478e() {
        return new bhan(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo63481h() {
        this.f150924g = 0;
        m117352a(this.f118186d);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.other_devices);
        linearLayout.removeAllViewsInLayout();
        linearLayout.invalidate();
        mo70944j();
    }

    /* renamed from: i */
    public final String mo70943i() {
        return getResources().getString(C0126R.string.location_settings_location_history_summary_full);
    }

    /* renamed from: a */
    private final void m117354a(String str, boolean z) {
        View findViewById = findViewById(C0126R.C0129id.devices_section);
        View findViewById2 = findViewById(C0126R.C0129id.no_devices_section);
        View findViewById3 = findViewById(C0126R.C0129id.extra_status_section);
        int i = 8;
        findViewById.setVisibility(8);
        if (str != null) {
            TextView textView = (TextView) findViewById(C0126R.C0129id.extra_status_text);
            findViewById3.setVisibility(0);
            if (z) {
                str = getString(C0126R.string.location_settings_ulr_summary_auth_error);
            }
            textView.setText(str);
            TextView textView2 = (TextView) findViewById(C0126R.C0129id.retry_view);
            textView2.setOnClickListener(new bhak(this));
            textView2.setClickable(true);
            textView2.setEnabled(true);
            if (z) {
                i = 0;
            }
            textView2.setVisibility(i);
            findViewById(C0126R.C0129id.retry_view_divider).setVisibility(i);
        } else {
            findViewById3.setVisibility(8);
        }
        TextView textView3 = (TextView) findViewById(C0126R.C0129id.full_text);
        textView3.setText(Html.fromHtml(mo70943i()));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        findViewById2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo63476a(AccountConfig accountConfig) {
        int b = accountConfig.mo70906b();
        this.f150926i = aepw.m52375a(b);
        return b;
    }

    /* renamed from: a */
    public final void mo70941a(int i, String str) {
        bhaa a = bhaa.m100507a(0, i, 17039370, 0);
        a.getArguments().putBoolean("process_html", true);
        a.show(getSupportFragmentManager(), str);
    }

    /* renamed from: a */
    public final void mo63514a(RemoteDevice remoteDevice, boolean z) {
        if (this.f118185c == null) {
            Log.w("GCoreLocationSettings", "Device switch changed but no preference service");
        } else if (this.f150929l == remoteDevice.f150869a) {
            try {
                this.f118185c.mo63306a(this.f118186d, m117361l(), z, bgze.m100439a());
            } catch (RemoteException e) {
                Log.wtf("GCoreLocationSettings", "Pref service failed for this device", e);
            }
            m117359i(z);
            m117363n();
            bguv.m100048a("UlrUiChangedDeviceSettingForThis", z);
        } else {
            bguv.m100048a("UlrUiChangedDeviceSettingForRemote", z);
            new bhal(this, remoteDevice, z).execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public final void mo63472a(String str) {
        if (((str.hashCode() == 1384328227 && str.equals("ConfirmHistoryOffDialog")) ? (char) 0 : 65535) == 0) {
            m117358h(true);
            bguv.m100042a("UlrUiLHDialogCancel");
        }
    }

    /* renamed from: a */
    public final void mo70942a(List list) {
        int i;
        View findViewById = findViewById(C0126R.C0129id.other_devices_section);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.other_devices);
        View findViewById2 = findViewById(C0126R.C0129id.other_devices_status);
        TextView textView = (TextView) findViewById(C0126R.C0129id.other_devices_status_text);
        linearLayout.setVisibility(8);
        linearLayout.removeAllViewsInLayout();
        if (list == null) {
            NetworkInfo activeNetworkInfo = this.f150930m.getActiveNetworkInfo();
            int i2 = this.f150924g;
            if (i2 != 1) {
                i = bgzh.m100442a(i2);
            } else {
                i = activeNetworkInfo == null ? C0126R.string.location_settings_ulr_summary_offline : C0126R.string.location_settings_ulr_summary_error;
            }
            textView.setText(i);
            findViewById2.setVisibility(0);
        } else if (list.isEmpty()) {
            findViewById.setVisibility(8);
        } else {
            findViewById2.setVisibility(8);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m117353a(linearLayout, (RemoteDevice) it.next(), null);
            }
            linearLayout.setVisibility(0);
            findViewById.setVisibility(0);
        }
    }
}

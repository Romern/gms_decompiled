package com.google.android.gms.smartdevice.setup.p066ui;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.DiscoveryChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiscoveryChimeraActivity extends deu implements asas, aryn, arok {

    /* renamed from: c */
    private static final sek f108227c = ascp.m73787a("DiscoveryChimeraActivity");

    /* renamed from: b */
    SourceLogManager f108228b;

    /* renamed from: d */
    private boolean f108229d;

    /* renamed from: e */
    private boolean f108230e;

    /* renamed from: f */
    private aryq f108231f;

    /* renamed from: g */
    private WifiManager f108232g;

    /* renamed from: h */
    private boolean f108233h;

    /* renamed from: a */
    public static Intent m92955a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.DiscoveryActivity");
    }

    /* renamed from: h */
    private final Fragment m92957h() {
        String string = getString(C0126R.string.smartdevice_choose_device);
        aryp aryp = new aryp();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", string);
        aryp.setArguments(bundle);
        return aryp;
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i != 1) {
            finish();
        } else if (this.f108231f.mo48945a()) {
            aryq aryq = this.f108231f;
            ConnectionRequest connectionRequest = aryq.f88477a;
            if (connectionRequest != null) {
                startActivityForResult(D2DSetupChimeraActivity.m92900a(connectionRequest, aryq.f88478b, this.f108228b, aryq.f88479c), 6);
            }
        } else {
            onBackPressed();
        }
    }

    /* renamed from: e */
    public final void mo48937e() {
        this.f108228b.mo59112a(-1, (byte) 0, false, 1);
    }

    /* renamed from: g */
    public final void mo48938g() {
        this.f108228b.mo59118d();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        aryq aryq;
        SourceLogManager sourceLogManager;
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        this.f108233h = false;
        f108227c.mo25409a("onActivityResult requestCode: %d resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!(intent == null || (sourceLogManager = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager")) == null)) {
            this.f108228b = sourceLogManager;
            sourceLogManager.f108008f = this;
        }
        if (i != 6) {
            sek sek = f108227c;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Unhandled activity result for request code ");
            sb.append(i);
            sek.mo25416d(sb.toString(), new Object[0]);
        } else if (i2 != 3) {
            if (i2 == 6 && (aryq = this.f108231f) != null && aryq.f88478b == 7) {
                arpg arpg = new arpg();
                arpg.f88057a = C0126R.C0127drawable.quantum_ic_warning_googred_36;
                arpg.mo48733a(getString(C0126R.string.smartdevice_alert_quit_button), 2);
                arpg.f88058b = getString(C0126R.string.smartdevice_connection_error_title);
                arpg.f88059c = getString(C0126R.string.smartdevice_web_deeplink_failed_description);
                m92956a(arpg.mo48731a(), true);
                return;
            }
            finish();
        } else if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                i3 = extras.getInt("restart_code", 0);
            }
            if (i3 != 0) {
                arpg arpg2 = new arpg();
                arpg2.f88057a = C0126R.C0127drawable.quantum_ic_warning_googred_36;
                arpg2.f88058b = getString(C0126R.string.smartdevice_problem_copying_title);
                arpg2.f88059c = getString(C0126R.string.smartdevice_problem_copying);
                arpg2.mo48733a(getString(C0126R.string.common_try_again), 1);
                arpg2.mo48735b(getString(C0126R.string.smartdevice_alert_quit_button), 2);
                if (i3 == 1) {
                    arpg2.f88058b = getString(C0126R.string.smartdevice_connection_error_title);
                    arpg2.f88059c = getString(C0126R.string.smartdevice_connection_error);
                } else if (i3 == 2) {
                    arpg2.f88058b = getString(C0126R.string.smartdevice_alert_disconnected_title);
                    arpg2.f88059c = getString(C0126R.string.smartdevice_connection_error);
                }
                m92956a(arpg2.mo48731a(), true);
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f108231f.mo48945a()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        asat asat;
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        this.f108231f = aryq.m73690a(intent);
        this.f108232g = (WifiManager) getApplicationContext().getSystemService("wifi");
        int i = this.f108231f.f88478b;
        boolean z2 = true;
        if (bundle == null) {
            SourceLogManager sourceLogManager = new SourceLogManager(this);
            this.f108228b = sourceLogManager;
            sourceLogManager.mo59113a(i, arpu.m73280a(this));
            if (intent == null || !cgqs.f187523a.mo6606a().mo84321g() || !intent.getBooleanExtra("skipStartScreen", false)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            this.f108233h = bundle.getBoolean("isWaitingForResult");
            this.f108229d = bundle.getBoolean("smartdevice.discoveryActivity.consentConfirmed");
            this.f108230e = bundle.getBoolean("smartdevice.discoveryActivity.enabledWifi");
            SourceLogManager sourceLogManager2 = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
            bmxy.m108581a(sourceLogManager2);
            this.f108228b = sourceLogManager2;
            sourceLogManager2.f108008f = this;
            z = false;
        }
        ascv a = ascv.m73797a();
        if (a == null || !a.mo49047b() || !cgrn.m146752b() || !cgqs.f187523a.mo6606a().mo84303P()) {
            z2 = z;
        }
        ConnectionRequest connectionRequest = this.f108231f.f88477a;
        if (connectionRequest != null) {
            this.f108228b.mo59118d();
            this.f108228b.mo59112a(0, this.f108231f.f88479c.f87167h, false, 3);
            startActivityForResult(D2DSetupChimeraActivity.m92900a(connectionRequest, i, this.f108228b, this.f108231f.f88479c), 6);
        } else if (z2) {
            m92956a(m92957h(), false);
        } else if (!this.f108229d) {
            if (cgqa.f187489a.mo6606a().mo84261a() && intent != null && aqzm.m72294a(intent.getStringExtra("device_type")) == aqzm.AUTO) {
                asat = asat.m73743a(0, getString(C0126R.string.smartdevice_intro_title_auto), getString(C0126R.string.smartdevice_intro_text_auto), getString(C0126R.string.common_connect), Integer.valueOf((int) C0126R.C0127drawable.quantum_gm_ic_directions_car_gm_blue_36), false, true);
            } else {
                asat = asat.m73745a(getString(C0126R.string.smartdevice_setup_intro_title), cgrn.m146752b() ? getString(C0126R.string.smartdevice_intro_text_bt_only) : getString(C0126R.string.smartdevice_setup_intro_text), getString(C0126R.string.common_next));
            }
            m92956a(asat, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            if (this.f108232g != null && this.f108230e) {
                f108227c.mo25409a("Resetting wifi to disabled state", new Object[0]);
                this.f108232g.setWifiEnabled(false);
                this.f108230e = false;
            }
            if (!this.f108233h) {
                this.f108228b.mo59120e();
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        f108227c.mo25412b("onNewIntent().", new Object[0]);
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            stringExtra.equals("fastpair");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("smartdevice.discoveryActivity.consentConfirmed", this.f108229d);
        bundle.putBoolean("smartdevice.discoveryActivity.enabledWifi", this.f108230e);
        bundle.putParcelable("smartdevice.sourceLogManager", this.f108228b);
        bundle.putBoolean("isWaitingForResult", this.f108233h);
    }

    /* renamed from: a */
    private final void m92956a(Fragment fragment, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fragment_container) != null) {
            beginTransaction.setCustomAnimations(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out, C0126R.anim.slide_back_in, C0126R.anim.slide_back_out);
        }
        if (z) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.replace(C0126R.C0129id.fragment_container, fragment).commitAllowingStateLoss();
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            asbr.m73757a(getContainerActivity(), arguments.getString("smartdevice.title"));
        }
    }

    /* renamed from: a */
    public final void mo49010a(int i) {
        WifiManager wifiManager;
        if (i == 0) {
            this.f108229d = true;
            this.f108228b.mo59110a();
            if (!cgrn.m146752b() && (wifiManager = this.f108232g) != null && !wifiManager.isWifiEnabled()) {
                f108227c.mo25412b("Enabling wifi", new Object[0]);
                this.f108232g.setWifiEnabled(true);
                this.f108230e = true;
            }
            m92956a(m92957h(), true);
            return;
        }
        sek sek = f108227c;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown text fragment id: ");
        sb.append(i);
        sek.mo25418e(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo48936a(D2DDevice d2DDevice, int i, boolean z) {
        this.f108228b.mo59112a(i, d2DDevice.f107876e, z, bovj.m111582a(d2DDevice.f107873b));
        this.f108233h = true;
        startActivityForResult(D2DSetupChimeraActivity.m92899a(this, d2DDevice, this.f108231f.f88478b, (String) null, this.f108228b), 6);
    }
}

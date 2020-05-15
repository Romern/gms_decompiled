package com.google.android.gms.carsetup.setup;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Fragment;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreSetupActivityImpl extends deu implements ozi, ozf {

    /* renamed from: b */
    public static final bnsn f29670b = odk.m28481a("CAR.SETUP.FRX");

    /* renamed from: c */
    public static final Intent f29671c = new Intent("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH").setPackage(nzg.f37003e.getPackageName());

    /* renamed from: d */
    static final IntentFilter f29672d = new IntentFilter("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH");

    /* renamed from: e */
    static final IntentFilter f29673e = new IntentFilter("android.hardware.usb.action.USB_ACCESSORY_DETACHED");

    /* renamed from: f */
    public ozj f29674f;

    /* renamed from: g */
    private Handler f29675g;

    /* renamed from: h */
    private Intent f29676h = null;

    /* renamed from: i */
    private TracingBroadcastReceiver f29677i;

    /* renamed from: j */
    private TracingBroadcastReceiver f29678j;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ForceFinishRequestReceiver extends TracingBroadcastReceiver {
        public ForceFinishRequestReceiver() {
            super("car_setup");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            bnsi d = PreSetupActivityImpl.f29670b.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl$ForceFinishRequestReceiver", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Request PreSetup force finish");
            bmxy.m108581a(PreSetupActivityImpl.this.f29674f);
            ozj ozj = PreSetupActivityImpl.this.f29674f;
            if (!ozj.f38657c) {
                ozj.f38656b.mo22797a(bpeb.FRX_PRESETUP_EXIT_CONDITIONS, bpea.FRX_PRESETUP_FORCE_FINISH);
                ozj.mo22805f();
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class UsbDisconnectReceiver extends TracingBroadcastReceiver {
        public UsbDisconnectReceiver() {
            super("car_setup");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            bnsi d = PreSetupActivityImpl.f29670b.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl$UsbDisconnectReceiver", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Received USB disconnect");
            bmxy.m108581a(PreSetupActivityImpl.this.f29674f);
            ozj ozj = PreSetupActivityImpl.this.f29674f;
            if (!ozj.f38657c) {
                ozj.f38656b.mo22797a(bpeb.FRX_PRESETUP_GENERAL, bpea.CONNECTION_DETACHED);
            }
        }
    }

    /* renamed from: a */
    public static void m22237a(Context context) {
        if (ccps.f179712a.mo6606a().mo76607a()) {
            bnsi d = f29670b.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Sending presetup finish request");
            context.sendBroadcast(f29671c);
        }
    }

    /* renamed from: p */
    private final void m22238p() {
        if (this.f29675g == null) {
            adzt adzt = new adzt(Looper.getMainLooper());
            this.f29675g = adzt;
            adzt.postDelayed(new oyu(this), 30000);
            return;
        }
        bnsi c = f29670b.mo68388c();
        c.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "p", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Dismissal already scheduled");
    }

    /* renamed from: e */
    public final ozj mo17470e() {
        bmxy.m108581a(this.f29674f);
        return this.f29674f;
    }

    /* renamed from: g */
    public final boolean mo17471g() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: h */
    public final boolean mo17472h() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    /* renamed from: i */
    public final void mo17473i() {
        getWindow().addFlags(2621568);
        if (this.f29675g != null) {
            bnsi c = f29670b.mo68388c();
            c.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "p", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Dismissal already scheduled");
        } else {
            adzt adzt = new adzt(Looper.getMainLooper());
            this.f29675g = adzt;
            adzt.postDelayed(new oyu(this), 30000);
        }
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
        }
    }

    /* renamed from: j */
    public final void mo17474j() {
        getWindow().clearFlags(2621568);
        Handler handler = this.f29675g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f29675g = null;
        }
    }

    /* renamed from: k */
    public final void mo17475k() {
        if (this.f29677i == null) {
            ForceFinishRequestReceiver forceFinishRequestReceiver = new ForceFinishRequestReceiver();
            this.f29677i = forceFinishRequestReceiver;
            registerReceiver(forceFinishRequestReceiver, f29672d);
        }
    }

    /* renamed from: l */
    public final void mo17476l() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.f29677i;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.f29677i = null;
        }
    }

    /* renamed from: m */
    public final void mo17477m() {
        if (this.f29678j == null) {
            UsbDisconnectReceiver usbDisconnectReceiver = new UsbDisconnectReceiver();
            this.f29678j = usbDisconnectReceiver;
            registerReceiver(usbDisconnectReceiver, f29673e);
        }
    }

    /* renamed from: n */
    public final void mo17478n() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.f29678j;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.f29678j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo17479o() {
        bnsi b = f29670b.mo68387b();
        b.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "o", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user didn't unlock to proceed within 30s.");
        bmxy.m108581a(this.f29674f);
        ozj ozj = this.f29674f;
        if (!ozj.f38657c) {
            ozj.f38656b.mo22797a(bpeb.FRX_PRESETUP_EXIT_CONDITIONS, bpea.AUTO_DISMISS);
            ozj.mo22805f();
        }
    }

    public final void onBackPressed() {
        bmxy.m108581a(this.f29674f);
        ozj ozj = this.f29674f;
        if (!ozj.f38657c) {
            ozj.f38656b.mo22797a(bpeb.FRX_PRESETUP_EXIT_CONDITIONS, bpea.BACK_BUTTON);
            ozj.mo22805f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        bnsi d = f29670b.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "onCreate", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("PreSetupActivity:onCreate");
        overridePendingTransition(0, 0);
        bmxy.m108589a(getIntent().hasExtra("PreSetup.AA_SUPPORT_RESULT"), "Invalid intent: missing AaSupportedResult extra");
        int intExtra = getIntent().getIntExtra("PreSetup.AA_SUPPORT_RESULT", -1);
        bmxy.m108589a(getIntent().hasExtra("connection_type"), "Invalid intent: missing ConnectionType extra");
        int intExtra2 = getIntent().getIntExtra("connection_type", -1);
        Intent intent = (Intent) getIntent().getParcelableExtra("PreSetup.CONTINUE_INTENT");
        bmxy.m108581a(intent);
        this.f29676h = intent;
        setTheme(C0126R.style.BottomSheetTheme);
        setRequestedOrientation(1);
        setContentView((int) C0126R.C0128layout.car_bottom_sheet_activity);
        if (!getIntent().getBooleanExtra("PreSetup.SKIP_TO_USB_RESET", false)) {
            i = 1;
        } else {
            i = 7;
        }
        ozj ozj = new ozj(this, intExtra, new oyz(this), intExtra2, i);
        bmxy.m108581a(ozj);
        this.f29674f = ozj;
    }

    /* renamed from: a */
    public final void mo17468a(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, fragment, "fragment_main").commit();
    }

    /* renamed from: a */
    public final void mo17469a(boolean z) {
        if (!isFinishing()) {
            if (z) {
                PackageManager packageManager = getPackageManager();
                Intent intent = this.f29676h;
                if (intent == null) {
                    bnsi c = f29670b.mo68388c();
                    c.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("continueIntent request to launch was null: skipping");
                } else if (intent.resolveActivityInfo(packageManager, 0) != null) {
                    startActivity(this.f29676h);
                } else {
                    bnsi c2 = f29670b.mo68388c();
                    c2.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Unable to launch continueIntent: did not resolve");
                }
            }
            BottomSheetView bottomSheetView = (BottomSheetView) findViewById(C0126R.C0129id.bottom_sheet);
            if (bottomSheetView == null) {
                finish();
            } else {
                bottomSheetView.f29497a.mo71037c(5);
            }
        }
    }
}

package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2dSourceChimeraActivity extends Activity implements mmz, mnf, mnl, mmw {

    /* renamed from: a */
    public static final lvn f29016a = new lvn("D2dSourceChimeraActivity");

    /* renamed from: h */
    static final bngx f29017h = bngx.m109358a("android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.READ_SMS");

    /* renamed from: b */
    public mfy f29018b;

    /* renamed from: c */
    public String f29019c;

    /* renamed from: d */
    public String f29020d;

    /* renamed from: e */
    public boolean f29021e;

    /* renamed from: f */
    public String f29022f;

    /* renamed from: g */
    public mtf f29023g = null;

    /* renamed from: i */
    private boolean f29024i = true;

    /* renamed from: j */
    private final mdl f29025j = new mdl(this);

    /* renamed from: k */
    private final bmzi f29026k = bmzn.m108681a(mdf.f33479a);

    /* renamed from: a */
    private final void m21881a(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString("target_device_model", this.f29020d);
        fragment.setArguments(bundle);
    }

    /* renamed from: l */
    private final void m21883l() {
        if (ccnx.f179588a.mo6606a().mo76501b()) {
            HashSet hashSet = new HashSet();
            bnre i = f29017h.listIterator();
            while (i.hasNext()) {
                String str = (String) i.next();
                if (C1145kt.m18540a(this, str) != 0) {
                    hashSet.add(str);
                }
            }
            if (hashSet.isEmpty()) {
                f29016a.mo25412b("All required permissions granted, proceeding.", new Object[0]);
                m21884m();
                return;
            }
            f29016a.mo25412b("%s permissions not granted, requesting permissions.", hashSet);
            C1133kh.m17842a(getContainerActivity(), (String[]) hashSet.toArray(new String[hashSet.size()]), 0);
            return;
        }
        m21884m();
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
    /* renamed from: m */
    private final void m21884m() {
        Intent intent;
        f29016a.mo25409a("Starting the service and binding to it.", new Object[0]);
        if (this.f29019c != null) {
            f29016a.mo25416d("uuidForServiceCallbacksRegister is not null. The service resources might have not been freed correctly!", new Object[0]);
        }
        this.f29019c = UUID.randomUUID().toString();
        if (!mo17225b()) {
            intent = D2dSourceChimeraService.m21900a(this);
        } else {
            intent = D2dSourceChimeraService.m21900a(this).putExtra("is_wifi_d2d", true);
        }
        startService(intent);
        skh.m35531a().mo25690a(this, intent, this.f29025j, 1);
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
    /* renamed from: n */
    private final void m21885n() {
        f29016a.mo25414c("Stopping service.", new Object[0]);
        Intent a = D2dSourceChimeraService.m21900a(this);
        a.putExtra("stop_service", true);
        startService(a);
        finishAndRemoveTask();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public final Fragment mo17224b(String str) {
        char c;
        mni mni;
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(str);
        if (findFragmentByTag != null) {
            f29016a.mo25409a("%s already exists, reusing.", str);
            return findFragmentByTag;
        }
        switch (str.hashCode()) {
            case -1392622590:
                if (str.equals("waiting_fragment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -949949384:
                if (str.equals("lockscreen_fragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -851942910:
                if (str.equals("copying_fragment")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 175648208:
                if (str.equals("copy_confirmation_fragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 715422406:
                if (str.equals("connected_fragment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1192699660:
                if (str.equals("success_fragment")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1211802615:
                if (str.equals("connecting_fragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2068789204:
                if (str.equals("disconnected_fragment")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mni = new mnc();
                break;
            case 1:
                mnb mnb = new mnb();
                m21881a(mnb);
                mni = mnb;
                break;
            case 2:
                mni = new mna();
                break;
            case 3:
                mng mng = new mng();
                m21881a(mng);
                mni = mng;
                break;
            case 4:
                mnn mnn = new mnn();
                m21881a(mnn);
                mni = mnn;
                break;
            case 5:
                mnh mnh = new mnh();
                m21881a(mnh);
                mni = mnh;
                break;
            case 6:
                boolean b = mo17225b();
                mnm mnm = new mnm();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isWifiD2d", b);
                mnm.setArguments(bundle);
                m21881a(mnm);
                mni = mnm;
                break;
            case 7:
                boolean b2 = mo17225b();
                mni mni2 = new mni();
                mni2.f34036a = b2;
                m21881a(mni2);
                mni = mni2;
                break;
            default:
                throw new RuntimeException("Unknown fragment tag.");
        }
        f29016a.mo25409a("Created new %s", str);
        return mni;
    }

    /* renamed from: c */
    public final boolean mo17226c() {
        return ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(getIntent().getAction()) && getIntent().hasExtra("accessory")) || ((Boolean) this.f29026k.mo6606a()).booleanValue();
    }

    /* renamed from: d */
    public final void mo17227d() {
        m21885n();
    }

    /* renamed from: e */
    public final void mo17228e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_transferring", false);
        mmx mmx = new mmx();
        mmx.setArguments(bundle);
        mmx.show(getSupportFragmentManager(), "DIALOG");
    }

    /* renamed from: f */
    public final void mo17229f() {
        mo17223a(new mdg(this));
        m21885n();
    }

    /* renamed from: g */
    public final void mo17230g() {
        mo17222a("waiting_fragment");
        mo17223a(new C1572mdh(this));
    }

    /* renamed from: h */
    public final void mo17231h() {
        if (this.f29018b == null) {
            f29016a.mo25409a("onScreenUnlocked() was called before the service is bound,saving the unlocked state.", new Object[0]);
            this.f29021e = true;
            return;
        }
        mo17232i();
    }

    /* renamed from: i */
    public final void mo17232i() {
        mo17223a(new C1573mdi(this));
    }

    /* renamed from: j */
    public final void mo17233j() {
        f29016a.mo25418e("The screen lock failed", new Object[0]);
    }

    /* renamed from: k */
    public final void mo17234k() {
    }

    public final void onBackPressed() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bizb.a(android.view.Window, boolean):void
     arg types: [android.view.Window, int]
     candidates:
      bizb.a(android.view.Window, int):void
      bizb.a(android.view.Window, biyz):void
      bizb.a(android.view.Window, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        f29016a.mo25409a("onCreate", new Object[0]);
        super.onCreate(bundle);
        if (!mo17225b() || ccom.m131019b()) {
            if (ccoa.f179599a.mo6606a().mo76512c()) {
                setTheme(C0126R.style.BackupGlifV3DayNight);
            } else if (ccnx.f179588a.mo6606a().mo76503d()) {
                setTheme(2132018266);
            }
            if (C1145kt.m18540a(this, "android.permission.NFC") == 0) {
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
                if (defaultAdapter != null) {
                    f29016a.mo25412b("Disabling NFC for d2d source device", new Object[0]);
                    defaultAdapter.setNdefPushMessage(null, getContainerActivity(), new android.app.Activity[0]);
                }
            } else {
                f29016a.mo25412b("Unable to disable NFC for d2d source device because NFC permission is not granted.", new Object[0]);
            }
            setContentView(getLayoutInflater().inflate((int) C0126R.C0128layout.source_activity, (ViewGroup) null));
            setRequestedOrientation(1);
            bizb.m103020a(getWindow(), false);
            getWindow().addFlags(128);
            this.f29020d = getString(C0126R.string.source_default_target_device_name);
            if (bundle != null) {
                this.f29022f = bundle.getString("current_fragment", "connected_fragment");
                if (bundle.isEmpty()) {
                    f29016a.mo25414c("Activity is restored with an empty savedInstanceState bundle.", new Object[0]);
                }
            } else if (mo17225b()) {
                this.f29022f = "connecting_fragment";
            } else if (mo17226c() || ccop.f179637a.mo6606a().mo76550h()) {
                this.f29022f = "connected_fragment";
            }
            if (bundle != null) {
                f29016a.mo25409a("Activity is restored with non empty saved instance state.", new Object[0]);
                this.f29023g = (mtf) bundle.getSerializable("connection_type");
            } else if ((getIntent().getFlags() & 1048576) != 0) {
                f29016a.mo25409a("Activity is launched from history, not starting the protocol.", new Object[0]);
                this.f29023g = null;
            } else if (mo17226c()) {
                if (((Boolean) this.f29026k.mo6606a()).booleanValue()) {
                    f29016a.mo25409a("Activity is created via adb for e2e testing. Not Starting protocol yet.", new Object[0]);
                    this.f29023g = null;
                } else {
                    f29016a.mo25409a("Activity is created by attaching the cable.", new Object[0]);
                    this.f29023g = mtf.USB;
                }
            } else if (mo17225b()) {
                f29016a.mo25409a("Activity is created by wifi d2d intent.", new Object[0]);
                this.f29023g = mtf.WIFI;
            } else {
                f29016a.mo25414c("Activity is launched by a general intent, not starting the protocol.", new Object[0]);
                this.f29023g = null;
            }
            m21883l();
            return;
        }
        f29016a.mo25414c("Launched for wifi d2d but feature is disabled by flag. Finishing.", new Object[0]);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        f29016a.mo25409a("onDestroy", new Object[0]);
        super.onDestroy();
        mo17221a();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        f29016a.mo25409a("onNewIntent. Action=%s", intent.getAction());
        mo17221a();
        super.onNewIntent(intent);
        setIntent(intent);
        if (mo17225b()) {
            this.f29023g = mtf.WIFI;
        } else if (mo17226c()) {
            this.f29023g = mtf.USB;
        }
        m21883l();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        f29016a.mo25409a("onPause", new Object[0]);
        this.f29024i = true;
        super.onPause();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 0) {
            lvn lvn = f29016a;
            StringBuilder sb = new StringBuilder(50);
            sb.append("unhandled onRequestPermissionsResult() ");
            sb.append(i);
            lvn.mo25416d(sb.toString(), new Object[0]);
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (iArr[i2] == 0) {
                f29016a.mo25412b("onRequestPermissionsResult() Permission granted: %s", strArr[i2]);
            } else {
                f29016a.mo25412b("onRequestPermissionsResult() Permission denied: %s", strArr[i2]);
            }
        }
        m21884m();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        f29016a.mo25409a("onResume", new Object[0]);
        this.f29024i = false;
        super.onResume();
        mo17222a(this.f29022f);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("connection_type", this.f29023g);
        bundle.putString("current_fragment", this.f29022f);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo17221a() {
        if (this.f29018b != null) {
            try {
                f29016a.mo25409a("Calling unregister callbacks.", new Object[0]);
                this.f29018b.mo19955a(this.f29019c);
                this.f29019c = null;
            } catch (RemoteException e) {
                f29016a.mo25409a("Remote exception while trying to unregister; ignroing.", new Object[0]);
            }
            try {
                skh.m35531a().mo25689a(this, this.f29025j);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                f29016a.mo25410a(e2);
            }
            this.f29018b = null;
            return;
        }
        f29016a.mo25412b("mBoundServiceInterface already null; not unbinding.", new Object[0]);
    }

    /* renamed from: a */
    public final void mo17222a(String str) {
        this.f29022f = str;
        Fragment b = mo17224b(str);
        if (b.isVisible()) {
            f29016a.mo25412b(String.valueOf(str).concat(" is already visible, reusing."), new Object[0]);
        } else if (!this.f29024i) {
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.source_main_container, b, str).commit();
            f29016a.mo25409a("Changing the visible fragment to %s", str);
        } else {
            f29016a.mo25416d("Activity is paused; ignoring fragment change.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo17223a(mdj mdj) {
        try {
            if (this.f29018b == null) {
                f29016a.mo25418e("Unable to call method because boundServiceInterface is null. Raise a bug.", new Object[0]);
                f29016a.mo25418e("Unable to call service; killing activity.", new Object[0]);
                m21885n();
                return;
            }
            mdj.mo19852a();
        } catch (RemoteException e) {
            f29016a.mo25417e("Unexpected remote exception; aborting migration: ", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final boolean mo17225b() {
        return "com.google.android.gms.backup.ACTION_WIFI_D2D".equals(getIntent().getAction());
    }
}

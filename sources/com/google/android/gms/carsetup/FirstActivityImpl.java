package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.Activity;
import com.google.android.gms.carsetup.restart.RestartOperation;
import com.google.android.gms.carsetup.setup.PreSetupActivityImpl;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirstActivityImpl extends Activity {

    /* renamed from: a */
    public static final bnsn f29636a = odk.m28481a("CAR.FIRST");

    /* renamed from: c */
    static boolean f29637c;

    /* renamed from: b */
    public asfb f29638b;

    /* renamed from: d */
    private final ozl f29639d = new ozo();

    /* renamed from: e */
    private LocalBinder f29640e;

    /* renamed from: f */
    private npd f29641f;

    /* renamed from: g */
    private omx f29642g;

    /* renamed from: h */
    private orn f29643h;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class LocalBinder extends Binder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new otu();

        /* renamed from: a */
        public final Intent f29644a;

        /* renamed from: b */
        public FirstActivityImpl f29645b;

        public LocalBinder(FirstActivityImpl firstActivityImpl, Intent intent) {
            this.f29644a = intent;
            this.f29645b = firstActivityImpl;
        }

        /* renamed from: a */
        public final void mo17444a() {
            this.f29645b = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStrongBinder(this);
        }
    }

    /* renamed from: a */
    private final void m22162a(bpea bpea) {
        this.f29643h.mo22548a(odi.m28455a(bpcy.CONNECTIVITY, bpeb.FIRST_ACTIVITY, bpea).mo22019b());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    private final void m22165c(Intent intent) {
        char c;
        if (intent == null) {
            m22164a(oew.INVALID);
            finish();
        } else if (intent.getAction() == null) {
            bnsi b = f29636a.mo68387b();
            b.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "c", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("First activity intent has null action: %s", intent);
            m22164a(oew.UNKNOWN);
            finish();
        } else {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -1989641542:
                    if (action.equals("com.google.android.gms.carsetup.START_DUPLEX")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1785280654:
                    if (action.equals("com.google.android.gms.carsetup.RESTART")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -528141398:
                    if (action.equals("com.google.android.gms.car.WIFI_ACTION_BRIDGE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -442962299:
                    if (action.equals("com.google.android.gms.carsetup.START")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 50829460:
                    if (action.equals("com.google.android.gms.car.START_WIFI")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099555123:
                    if (action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                m22164a(oew.ACCESSORY_ATTACHED);
                mo17441a(intent);
            } else if (c != 1) {
                if (c == 2 || c == 3) {
                    if (!ccpv.m131199h()) {
                        m22164a(oew.CAR_SERVICE);
                        m22166d(intent);
                    } else if (this.f29639d.mo22807a(this, intent)) {
                        m22164a(oew.CAR_SERVICE);
                        mo17441a(intent);
                    } else {
                        m22164a(oew.UNKNOWN);
                        bnsi b2 = f29636a.mo68387b();
                        b2.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "c", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b2.mo68420a("Unknown caller for start connection intent %s", intent);
                        finish();
                    }
                } else if (c == 4) {
                    m22164a(oew.RESTART);
                    m22166d(intent);
                } else if (c != 5) {
                    bnsi b3 = f29636a.mo68387b();
                    b3.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "c", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b3.mo68420a("Unknown intent %s", intent);
                    m22164a(oew.UNKNOWN);
                    finish();
                } else {
                    m22164a(oew.WIRELESS);
                    m22166d(intent);
                }
            } else if (getCallingPackage() == null || !rfz.m33557a(this).mo24610b(getCallingPackage())) {
                m22164a(oew.UNKNOWN);
                bnsi b4 = f29636a.mo68387b();
                b4.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "c", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68420a("Unknown caller for bridge intent %s", intent);
                finish();
            } else {
                m22164a(oew.WIRELESS_BRIDGE);
                mo17441a(intent);
            }
        }
    }

    /* renamed from: d */
    private final void m22166d(Intent intent) {
        IBinder iBinder;
        ova ova;
        new ouz();
        ots ots = new ots(this, intent);
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("0p_checker");
        if (binderParcel == null || (iBinder = binderParcel.f29535a) == null) {
            Log.e("CAR.MISC", "No 0p checker");
            ots.mo22620a(false);
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyChecker");
        if (queryLocalInterface instanceof ova) {
            ova = (ova) queryLocalInterface;
        } else {
            ova = new ouy(iBinder);
        }
        ovm ovm = new ovm(ova.asBinder(), ots);
        try {
            ova.asBinder().linkToDeath(ovm, 0);
            ova.mo22659a(ovm);
        } catch (RemoteException e) {
            Log.e("CAR.MISC", "Remote process died before validation");
            ovm.binderDied();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* renamed from: b */
    public final boolean mo17443b(Intent intent) {
        char c;
        boolean a = oyh.f38613a.mo22779a(this);
        boolean b = ccps.m131180b();
        bnsi d = f29636a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68435a("Checking preSetup required: cakewalkPhase1Enabled=%b and gearheadUpToDate=%b", b, a);
        if (b) {
            bmxy.m108581a(intent.getAction());
            String action = intent.getAction();
            int hashCode = action.hashCode();
            int i = -1;
            if (hashCode != -528141398) {
                if (hashCode == 1099555123 && action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                    c = 0;
                    if (c == 0) {
                        i = 1;
                    } else if (c == 1) {
                        i = 2;
                    }
                    if (i != 1) {
                        bnsi d2 = f29636a.mo68390d();
                        d2.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d2.mo68409a("Presetup does not support connectionType=%s from this activity", i);
                        return false;
                    } else if (!a) {
                        int a2 = new ovr(this).mo22703a();
                        bnsi d3 = f29636a.mo68390d();
                        d3.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d3.mo68420a("Starting presetup isKeyguardLocked=%b", Boolean.valueOf(((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()));
                        oza oza = new oza();
                        oza.f38643a = 1;
                        oza.f38644b = a2;
                        oza.f38645c = intent;
                        oza.mo22798a(this);
                        return true;
                    } else {
                        PreSetupActivityImpl.m22237a(this);
                    }
                }
            } else if (action.equals("com.google.android.gms.car.WIFI_ACTION_BRIDGE")) {
                c = 1;
                if (c == 0) {
                }
                if (i != 1) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
            if (i != 1) {
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        m22163a(oeu.FIRST_ACTIVITY_CREATED);
        super.onCreate(bundle);
        if (!aytw.m84815b(getApplicationContext())) {
            bnsi d = f29636a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "onCreate", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("User is locked");
            m22163a(oeu.FIRST_ACTIVITY_DIRECT_BOOT_USER_LOCKED);
            finish();
            return;
        }
        omx a = omx.m29200a((Context) this);
        this.f29642g = a;
        a.mo22344a(this, 100);
        this.f29641f = npd.m27127a(this);
        this.f29643h = new orn(this, this.f29641f);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        overridePendingTransition(0, 0);
        m22165c(getIntent());
    }

    public final void onDestroy() {
        m22163a(oeu.FIRST_ACTIVITY_DESTROYED);
        super.onDestroy();
        asfb asfb = this.f29638b;
        if (asfb != null) {
            asfb.mo49120c();
            this.f29638b = null;
        }
        LocalBinder localBinder = this.f29640e;
        if (localBinder != null) {
            localBinder.mo17444a();
            this.f29640e = null;
        }
        omx omx = this.f29642g;
        if (omx != null) {
            omx.mo22343a((Object) this);
            this.f29642g = null;
        }
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (ccql.f179756a.mo6606a().mo76650g()) {
            bnsi d = f29636a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "onNewIntent", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Received new intent: %s, ignoring it.", intent);
            m22164a(oew.NEW_INTENT);
        }
        if (ccql.f179756a.mo6606a().mo76646c()) {
            m22165c(intent);
        }
    }

    /* renamed from: a */
    private final void m22163a(oeu oeu) {
        Context applicationContext = getApplicationContext();
        if (ccql.f179756a.mo6606a().mo76644a()) {
            ofd.m28611a(applicationContext, "com.google.android.gms.car.CONNECTIVITY_STAGE_REACHED", oeu);
        }
    }

    /* renamed from: a */
    private final void m22164a(oew oew) {
        ofd.m28611a(this, "com.google.android.gms.car.FIRST_ACTIVITY", oew);
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
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* renamed from: a */
    public final void mo17441a(Intent intent) {
        char c;
        boolean a = RestartOperation.m22236a();
        if (!ccui.m131662b() || !this.f29641f.mo21399j() || !ovr.m29886a(this)) {
            orn orn = this.f29643h;
            if (!ccsq.f179858a.mo6606a().mo76732f() || !oyh.f38613a.mo22782c(this)) {
                if (!a) {
                    if ("com.google.android.gms.carsetup.RESTART".equals(intent.getAction())) {
                        m22162a(bpea.FIRST_ACTIVITY_RESTART_DONE);
                        intent = (Intent) intent.getParcelableExtra("original_intent");
                        f29637c = true;
                    } else if (!oyh.f38613a.mo22779a(this) && !f29637c) {
                        m22162a(bpea.FIRST_ACTIVITY_RESTART_STARTED);
                        RestartOperation.m22235a(this, new Intent("com.google.android.gms.carsetup.RESTART").setComponent(ccrv.m131380d() ? (ComponentName) nzg.f37001c.mo6606a() : npp.f36341c).putExtra("original_intent", intent));
                        finish();
                        return;
                    }
                }
                boolean a2 = oyh.f38613a.mo22779a(this);
                boolean b = ccps.m131180b();
                bnsi d = f29636a.mo68390d();
                d.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68435a("Checking preSetup required: cakewalkPhase1Enabled=%b and gearheadUpToDate=%b", b, a2);
                if (b) {
                    bmxy.m108581a(intent.getAction());
                    String action = intent.getAction();
                    int hashCode = action.hashCode();
                    int i = -1;
                    if (hashCode != -528141398) {
                        if (hashCode == 1099555123 && action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                            c = 0;
                            if (c == 0) {
                                i = 1;
                            } else if (c == 1) {
                                i = 2;
                            }
                            if (i != 1) {
                                bnsi d2 = f29636a.mo68390d();
                                d2.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d2.mo68409a("Presetup does not support connectionType=%s from this activity", i);
                            } else if (!a2) {
                                int a3 = new ovr(this).mo22703a();
                                bnsi d3 = f29636a.mo68390d();
                                d3.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "b", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d3.mo68420a("Starting presetup isKeyguardLocked=%b", Boolean.valueOf(((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()));
                                oza oza = new oza();
                                oza.f38643a = 1;
                                oza.f38644b = a3;
                                oza.f38645c = intent;
                                oza.mo22798a(this);
                                bnsi d4 = f29636a.mo68390d();
                                d4.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "a", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d4.mo68405a("PreSetup flow started, exiting for now");
                                finishAndRemoveTask();
                                return;
                            } else {
                                PreSetupActivityImpl.m22237a(this);
                            }
                        }
                    } else if (action.equals("com.google.android.gms.car.WIFI_ACTION_BRIDGE")) {
                        c = 1;
                        if (c == 0) {
                        }
                        if (i != 1) {
                        }
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    if (i != 1) {
                    }
                }
                asfb asfb = new asfb(getApplicationContext(), 268435462, "CAR.FIRST", null, "com.google.android.gms");
                this.f29638b = asfb;
                asfb.mo49115a(false);
                this.f29638b.mo49117b();
                m22163a(oeu.FIRST_ACTIVITY_WAKE_LOCK_ACQUIRED);
                this.f29640e = new LocalBinder(this, intent);
                startService(new Intent().setClassName(this, ((ComponentName) nzg.f37000b.mo6606a()).getClassName()).putExtra("EXTRA_LOCAL_BINDER", this.f29640e).putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false));
                return;
            }
            bnsi c2 = f29636a.mo68388c();
            c2.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "a", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68420a("Detected user disabled Gearhead, ignoring %s", intent);
            orn.mo22548a(odi.m28455a(bpcy.CAR_SERVICE, bpeb.FIRST_ACTIVITY, bpea.FIRST_ACTIVITY_EXIT_GEARHEAD_DISABLED).mo22019b());
            finishAndRemoveTask();
            return;
        }
        bnsi c3 = f29636a.mo68388c();
        c3.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c3.mo68420a("Detected unsupported device, ignoring %s", intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo17442a(boolean z, Intent intent) {
        if (!z) {
            bnsi b = f29636a.mo68387b();
            b.mo68432a("com.google.android.gms.carsetup.FirstActivityImpl", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Intent validation failed %s", intent);
            finish();
            return;
        }
        mo17441a(intent);
    }
}

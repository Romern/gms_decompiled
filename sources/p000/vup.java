package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: vup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vup extends dck implements vuq {

    /* renamed from: a */
    public final Set f49995a;

    /* renamed from: b */
    SharedPreferences f49996b;

    /* renamed from: c */
    private final Context f49997c;

    /* renamed from: d */
    private final vqy f49998d;

    /* renamed from: e */
    private final vrb f49999e;

    /* renamed from: f */
    private final SharedPreferences.OnSharedPreferenceChangeListener f50000f;

    public vup() {
        super("com.google.android.gms.drivingmode.IDrivingModeManager");
    }

    /* renamed from: a */
    private final void m41361a(vuu vuu) {
        this.f49996b.edit().putInt("strongest_start_source", vuu.ordinal()).apply();
        String valueOf = String.valueOf(vuu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Setting strongest TriggerSource to: ");
        sb.append(valueOf);
        sb.toString();
    }

    /* renamed from: b */
    private final vuu m41362b() {
        try {
            return vuu.m41424b(this.f49996b.getInt("strongest_start_source", -1));
        } catch (IllegalArgumentException e) {
            this.f49999e.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_MISSING_TRIGGER_SOURCE);
            Log.w("CAR.DRIVINGMODE", "Unable to find DrivingMode TriggerSource: returning ACTIVITY_RECOGNITION and setting it as the current value");
            m41361a(vuu.ACTIVITY_RECOGNITION);
            return vuu.ACTIVITY_RECOGNITION;
        }
    }

    /* renamed from: c */
    private final void m41365c(String str, boolean z) {
        String str2;
        bpea bpea;
        vrs a = vrs.m41126a(str);
        ComponentName b = a.mo28741b(this.f49997c);
        if (b == null) {
            Log.w("CAR.DRIVINGMODE", "Invalid component name, dropping request to send intent.");
            this.f49999e.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
            return;
        }
        Intent component = new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT").setComponent(b);
        if (!z) {
            str2 = "DISABLED";
        } else {
            str2 = "ENABLED";
        }
        Intent addFlags = component.putExtra("com.google.android.gms.car.drivingMode", str2).addFlags(268435456);
        if (a.mo28743c() != 2) {
            bpea = !z ? bpea.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR : bpea.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR;
        } else {
            bpea = !z ? bpea.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR : bpea.DRIVING_MODE_START_GEARHEAD_BEHAVIOR;
        }
        this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea);
        this.f49997c.startActivity(addFlags);
    }

    /* renamed from: g */
    private final void m41366g(boolean z) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && mo28886h() && vqw.m41077a(this.f49997c)) {
            boolean isEnabled = defaultAdapter.isEnabled();
            if (z) {
                this.f49996b.edit().putBoolean("previous_bluetooth_state", isEnabled).apply();
                if (!isEnabled) {
                    defaultAdapter.enable();
                    return;
                }
                return;
            }
            boolean z2 = this.f49996b.getBoolean("previous_bluetooth_state", isEnabled);
            if (isEnabled && !z2) {
                defaultAdapter.disable();
            }
        }
    }

    /* renamed from: d */
    public final void mo28879d(boolean z) {
        this.f49996b.edit().putBoolean("prompt_before_launch", z).apply();
    }

    /* renamed from: e */
    public final void mo28881e(boolean z) {
        this.f49996b.edit().putBoolean("bluetooth_on_while_driving", z).apply();
    }

    /* renamed from: f */
    public final void mo28883f(boolean z) {
        this.f49996b.edit().putBoolean("setup_completed", z).apply();
    }

    /* renamed from: h */
    public final boolean mo28886h() {
        return this.f49996b.getBoolean("bluetooth_on_while_driving", true);
    }

    /* renamed from: i */
    public final boolean mo28887i() {
        return this.f49996b.getBoolean("setup_completed", false);
    }

    /* renamed from: j */
    public final int mo28888j() {
        int i = this.f49996b.getInt("pending_trigger_source", -1);
        if (i != -1) {
            return i;
        }
        this.f49999e.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE);
        Log.w("CAR.DRIVINGMODE", "Unable to find DrivingMode TriggerSource: returning ACTIVITY_RECOGNITION and setting it as the current value");
        m41364b(vuu.ACTIVITY_RECOGNITION);
        return vuu.ACTIVITY_RECOGNITION.ordinal();
    }

    /* renamed from: k */
    public final void mo28889k() {
        this.f49996b.edit().remove("pending_trigger_source").apply();
    }

    /* renamed from: l */
    public final boolean mo28890l() {
        long millis = TimeUnit.MINUTES.toMillis(ccrs.f179811a.mo6606a().mo76688a());
        if (millis != 0 && this.f49996b.contains("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis")) {
            long j = this.f49996b.getLong("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis", 0);
            if (j > SystemClock.elapsedRealtime()) {
                this.f49996b.edit().remove("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis").apply();
                return false;
            } else if (SystemClock.elapsedRealtime() - j < millis) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo28867a(int i) {
        vuu b = vuu.m41424b(i);
        bmxy.m108596a(b.mo28893a(), "TriggerSource %s cannot be set as PendingAutoLaunchTriggerSource", b);
        if (mo28870a()) {
            return;
        }
        if (!this.f49996b.contains("pending_trigger_source") || b.compareTo((Enum) vuu.m41424b(mo28888j())) >= 0) {
            m41364b(b);
        }
    }

    /* renamed from: d */
    public final boolean mo28880d() {
        return this.f49996b.getBoolean("bluetooth_auto_launch", false);
    }

    /* renamed from: e */
    public final boolean mo28882e() {
        return this.f49996b.getBoolean("pocket_detection", true);
    }

    /* renamed from: f */
    public final boolean mo28884f() {
        return this.f49996b.getBoolean("activity_recognition_launch", false);
    }

    public vup(Context context) {
        super("com.google.android.gms.drivingmode.IDrivingModeManager");
        this.f49995a = new CopyOnWriteArraySet();
        this.f50000f = new vtu(this);
        this.f49997c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("driving_mode_prefs", 0);
        this.f49996b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f50000f);
        vuk.m41322a();
        this.f49998d = vuk.m41325d(context);
        vuk.m41322a();
        this.f49999e = vuk.m41326e(context);
    }

    /* renamed from: b */
    private final void m41363b(String str, boolean z) {
        String str2;
        if (vrs.m41126a(str).mo28745d(this.f49997c)) {
            Intent intent = new Intent();
            intent.setPackage(ceyg.m138425f());
            intent.setAction(ceyg.f183508a.mo6606a().morrisBroadcastIntent());
            if (!z) {
                str2 = "DISABLED";
            } else {
                str2 = "ENABLED";
            }
            intent.putExtra("com.google.android.gms.car.drivingMode", str2);
            this.f49997c.sendBroadcast(intent);
        }
    }

    /* renamed from: g */
    public final boolean mo28885g() {
        return this.f49996b.getBoolean("prompt_before_launch", true);
    }

    /* renamed from: b */
    private final void m41364b(vuu vuu) {
        this.f49996b.edit().putInt("pending_trigger_source", vuu.ordinal()).apply();
    }

    /* renamed from: a */
    public final void mo28868a(String str, boolean z) {
        this.f49996b.edit().putBoolean(str, z).apply();
    }

    /* renamed from: a */
    public final void mo28869a(boolean z) {
        this.f49996b.edit().putBoolean("bluetooth_auto_launch", z).apply();
    }

    /* renamed from: b */
    public final void mo28873b(int i) {
        boolean z;
        vuu b = vuu.m41424b(i);
        if (b != vuu.FORCE) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot update Driving Mode with FORCE TriggerSource");
        if (b != vuu.ANDROID_AUTO && m41362b().compareTo((Enum) b) < 0) {
            m41361a(b);
        }
    }

    /* renamed from: a */
    public final boolean mo28870a() {
        return this.f49996b.getBoolean("activated", false);
    }

    /* renamed from: c */
    public final String mo28877c() {
        if (this.f49996b.contains("behavior")) {
            String string = this.f49996b.getString("behavior", "car_pref_key_driving_mode_behavior_none_preference");
            vrs a = vrs.m41126a(string);
            if (a.mo28744c(this.f49997c) && a.mo28745d(this.f49997c)) {
                return string;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 46);
            sb.append("Got invalid behavior key (");
            sb.append(string);
            sb.append("); reset to default.");
            Log.i("CAR.DRIVINGMODE", sb.toString());
            this.f49999e.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR);
        }
        vrs e = vrs.m41128e(this.f49997c);
        mo28874b(e.mo28740a());
        return e.mo28740a();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vun vun = null;
        switch (i) {
            case 1:
                boolean a = mo28870a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                break;
            case 2:
                boolean a2 = mo28872a(dcl.m8167a(parcel), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a2);
                break;
            case 3:
                boolean b = mo28876b(dcl.m8167a(parcel), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                break;
            case 4:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.drivingmode.IDrivingModeListener");
                    if (queryLocalInterface instanceof vun) {
                        vun = (vun) queryLocalInterface;
                    } else {
                        vun = new vun(readStrongBinder);
                    }
                }
                this.f49995a.add(vun);
                parcel2.writeNoException();
                break;
            case 5:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.drivingmode.IDrivingModeListener");
                    if (queryLocalInterface2 instanceof vun) {
                        vun = (vun) queryLocalInterface2;
                    } else {
                        vun = new vun(readStrongBinder2);
                    }
                }
                this.f49995a.remove(vun);
                parcel2.writeNoException();
                break;
            case 6:
                boolean a3 = mo28871a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a3);
                break;
            case 7:
                mo28868a(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 8:
                String c = mo28877c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 9:
                mo28874b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 10:
                boolean d = mo28880d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                break;
            case 11:
                mo28869a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 12:
                boolean e = mo28882e();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, e);
                break;
            case 13:
                mo28875b(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 14:
                boolean f = mo28884f();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                break;
            case 15:
                mo28878c(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 16:
                boolean g = mo28885g();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, g);
                break;
            case 17:
                mo28879d(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 18:
                boolean h = mo28886h();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, h);
                break;
            case 19:
                mo28881e(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 20:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                SharedPreferences.Editor edit = this.f49996b.edit();
                for (String str : this.f49996b.getAll().keySet()) {
                    if (str.startsWith("bt_autolaunch")) {
                        edit.remove(str);
                    }
                }
                int size = createStringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    edit.putBoolean(createStringArrayList.get(i2), true);
                }
                edit.apply();
                parcel2.writeNoException();
                break;
            case 21:
                boolean i3 = mo28887i();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, i3);
                break;
            case 22:
                mo28883f(dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 23:
                mo28867a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 24:
                int j = mo28888j();
                parcel2.writeNoException();
                parcel2.writeInt(j);
                break;
            case 25:
                mo28889k();
                parcel2.writeNoException();
                break;
            case 26:
                mo28873b(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 27:
                boolean l = mo28890l();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, l);
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo28874b(String str) {
        this.f49996b.edit().putString("behavior", str).apply();
    }

    /* renamed from: b */
    public final void mo28875b(boolean z) {
        this.f49996b.edit().putBoolean("pocket_detection", z).apply();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vup.b(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      vup.b(boolean, int):boolean
      vuq.b(boolean, int):boolean
      vup.b(java.lang.String, boolean):void */
    /* renamed from: b */
    public final boolean mo28876b(boolean z, int i) {
        vuu b = vuu.m41424b(i);
        if (!mo28870a()) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
            sb.append("Stop signal received with TriggerSource ");
            sb.append(valueOf);
            sb.append(" while already stopped");
            sb.toString();
            return true;
        } else if (!ccrs.f179811a.mo6606a().mo76689b() || !b.mo28893a() || m41362b().compareTo((Enum) b) <= 0) {
            String valueOf2 = String.valueOf(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("Ending driving mode. TriggerSource: ");
            sb2.append(valueOf2);
            Log.i("CAR.DRIVINGMODE", sb2.toString());
            this.f49996b.edit().remove("strongest_start_source").apply();
            m41366g(false);
            this.f49996b.edit().putBoolean("activated", false).apply();
            if (z) {
                String c = mo28877c();
                if ("car_pref_key_driving_mode_behavior_dnd_preference".equals(c)) {
                    this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_STOP_DND_BEHAVIOR);
                    vqy vqy = this.f49998d;
                    if (!vqy.mo28756a()) {
                        Log.i("CAR.DRIVINGMODE", "Dropping disable request, no permissions");
                    } else {
                        vqy.mo28755a(false);
                    }
                } else if ("car_pref_key_driving_mode_behavior_none_preference".equals(c)) {
                    this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_STOP_EMPTY_BEHAVIOR);
                } else if ("car_pref_key_driving_mode_behavior_morris_preference".equals(c)) {
                    this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_STOP_MORRIS_BEHAVIOR);
                    m41363b(c, false);
                } else {
                    m41365c(c, false);
                }
            }
            if (!b.mo28893a() && b != vuu.FORCE) {
                this.f49996b.edit().putLong("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis", SystemClock.elapsedRealtime()).apply();
            }
            return true;
        } else {
            String valueOf3 = String.valueOf(b);
            String valueOf4 = String.valueOf(m41362b());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 88 + String.valueOf(valueOf4).length());
            sb3.append("Stop signal received with TriggerSource ");
            sb3.append(valueOf3);
            sb3.append(". Not stopping because current TriggerSource is ");
            sb3.append(valueOf4);
            sb3.toString();
            return false;
        }
    }

    /* renamed from: c */
    public final void mo28878c(boolean z) {
        this.f49996b.edit().putBoolean("activity_recognition_launch", z).apply();
    }

    /* renamed from: a */
    public final boolean mo28871a(String str) {
        return this.f49996b.getBoolean(str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vup.b(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      vup.b(boolean, int):boolean
      vuq.b(boolean, int):boolean
      vup.b(java.lang.String, boolean):void */
    /* renamed from: a */
    public final boolean mo28872a(boolean z, int i) {
        vuu b = vuu.m41424b(i);
        bmxy.m108589a(b != vuu.FORCE, "Cannot start Driving Mode with FORCE TriggerSource");
        if (mo28870a()) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 108);
            sb.append("Duplicate start signal received with TriggerSource ");
            sb.append(valueOf);
            sb.append(". checking if Strongest TriggerSource needs to be updated");
            sb.toString();
            if (b != vuu.ANDROID_AUTO && m41362b().compareTo((Enum) b) < 0) {
                m41361a(b);
            }
            return false;
        }
        vuk.m41322a();
        vuk.m41328g(this.f49997c).mo28846b();
        String valueOf2 = String.valueOf(b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("Starting driving mode. TriggerSource: ");
        sb2.append(valueOf2);
        Log.i("CAR.DRIVINGMODE", sb2.toString());
        m41361a(b);
        m41366g(true);
        this.f49996b.edit().putBoolean("activated", true).apply();
        if (z) {
            String c = mo28877c();
            if ("car_pref_key_driving_mode_behavior_dnd_preference".equals(c)) {
                this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_START_DND_BEHAVIOR);
                vqy vqy = this.f49998d;
                if (!vqy.mo28756a()) {
                    Log.i("CAR.DRIVINGMODE", "Dropping enable request, no permissions");
                } else {
                    vqy.mo28755a(true);
                }
            } else if ("car_pref_key_driving_mode_behavior_none_preference".equals(c)) {
                this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_START_EMPTY_BEHAVIOR);
            } else if ("car_pref_key_driving_mode_behavior_morris_preference".equals(c)) {
                this.f49999e.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_START_MORRIS_BEHAVIOR);
                m41363b(c, true);
            } else {
                m41365c(c, true);
            }
        }
        this.f49996b.edit().remove("PREF_LAST_EXPLICIT_EXIT_MILLIS_millis").apply();
        return true;
    }
}

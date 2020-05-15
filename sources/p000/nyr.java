package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.car.bluetooth.BluetoothUtil$A2dpStateChangeReceiver;
import com.google.android.gms.car.bluetooth.BluetoothUtil$AdapterStateChangeReceiver;
import com.google.android.gms.car.bluetooth.BluetoothUtil$BondStateChangeReceiver;
import com.google.android.gms.car.bluetooth.BluetoothUtil$HeadsetConnectionStateChangeReceiver;
import com.google.android.gms.car.bluetooth.BluetoothUtil$PairingRequestReceiver;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* renamed from: nyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyr {

    /* renamed from: a */
    public static final bnsn f36964a = odk.m28481a("CAR.BT");

    /* renamed from: b */
    public final Context f36965b;

    /* renamed from: c */
    public final nxy f36966c;

    /* renamed from: d */
    public String f36967d = null;

    /* renamed from: e */
    public nxz f36968e;

    /* renamed from: f */
    public final nyp f36969f;

    /* renamed from: g */
    public final boolean f36970g;

    /* renamed from: h */
    public final boolean f36971h;

    /* renamed from: i */
    public final BluetoothUtil$AdapterStateChangeReceiver f36972i = new BluetoothUtil$AdapterStateChangeReceiver(this);

    /* renamed from: j */
    public final BluetoothUtil$PairingRequestReceiver f36973j = new BluetoothUtil$PairingRequestReceiver(this);

    /* renamed from: k */
    public final BluetoothUtil$BondStateChangeReceiver f36974k = new BluetoothUtil$BondStateChangeReceiver(this);

    /* renamed from: l */
    public final BluetoothUtil$HeadsetConnectionStateChangeReceiver f36975l = new BluetoothUtil$HeadsetConnectionStateChangeReceiver(this);

    /* renamed from: m */
    public final BluetoothUtil$A2dpStateChangeReceiver f36976m = new BluetoothUtil$A2dpStateChangeReceiver(this);

    /* renamed from: n */
    public volatile int f36977n = -1;

    /* renamed from: o */
    public nyl f36978o;

    /* renamed from: p */
    public int f36979p = Integer.MIN_VALUE;

    /* renamed from: q */
    public int f36980q = Integer.MIN_VALUE;

    /* renamed from: r */
    public volatile String f36981r;

    /* renamed from: s */
    public boolean f36982s;

    /* renamed from: t */
    private final boolean f36983t;

    /* renamed from: u */
    private final boolean f36984u;

    public nyr(Context context, String str, nyp nyp) {
        srl srl = nym.f36959a;
        this.f36965b = context;
        this.f36969f = nyp;
        this.f36982s = true;
        this.f36983t = ccpm.f179688a.mo6606a().mo76596l();
        this.f36984u = ccpm.f179688a.mo6606a().mo76587c();
        this.f36970g = ccpm.f179688a.mo6606a().mo76588d();
        this.f36971h = ccpm.f179688a.mo6606a().mo76598n();
        if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
            nxy nxy = (nxy) srl.mo21850a(context);
            this.f36966c = nxy;
            if (nxy == null) {
                bnsi b = f36964a.mo68387b();
                b.mo68432a("nyr", "<init>", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("BluetoothAdapter is null");
                this.f36977n = -3;
                this.f36968e = null;
                return;
            }
            this.f36967d = str;
            if (str != null) {
                bmxy.m108581a(nxy);
                this.f36968e = this.f36966c.mo21819a(str);
            } else {
                this.f36968e = null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36972i, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
            intentFilter2.setPriority(999);
            this.f36965b.registerReceiver(this.f36973j, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36974k, intentFilter3);
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36975l, intentFilter4);
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter5.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36976m, intentFilter5);
            this.f36977n = 0;
            return;
        }
        bnsi b2 = f36964a.mo68387b();
        b2.mo68432a("nyr", "<init>", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68420a("Invalid peer Bluetooth address: %s", str);
        this.f36977n = -2;
        this.f36966c = null;
        this.f36968e = null;
    }

    /* renamed from: a */
    public final void mo21854a(int i) {
        this.f36969f.mo20946a(i);
        mo21864f();
    }

    /* renamed from: b */
    public final void mo21859b(nxz nxz) {
        bnsi d = f36964a.mo68390d();
        d.mo68432a("nyr", "b", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("attemptEnablePhoneBookAccessWithState, shouldEnablePbap=%b", Boolean.valueOf(this.f36982s));
        if (nxz == null) {
            bnsi d2 = f36964a.mo68390d();
            d2.mo68432a("nyr", "b", 713, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("attemptEnablePhoneBookAccessWithState failed due to null device");
        } else if (this.f36982s) {
            nxz.mo21826d();
        } else {
            nxz.mo21827e();
        }
        mo21856a(nxz, this.f36982s);
    }

    /* renamed from: c */
    public final boolean mo21861c() {
        if (this.f36977n == 0) {
            bmxy.m108581a(this.f36968e);
            if (this.f36968e.mo21822a() == 12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo21862d() {
        if (this.f36977n != 0) {
            bnsi b = f36964a.mo68387b();
            b.mo68432a("nyr", "d", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("invalidateAuthenticationData: This object wasn't initialized successfully");
            return;
        }
        this.f36979p = Integer.MIN_VALUE;
        this.f36980q = Integer.MIN_VALUE;
        this.f36981r = null;
    }

    /* renamed from: e */
    public final void mo21863e() {
        if (this.f36979p != Integer.MIN_VALUE && this.f36981r != null) {
            int i = this.f36979p;
            int i2 = 2;
            boolean z = false;
            if (i == 0) {
                try {
                    bmxy.m108581a(this.f36981r);
                    byte[] bytes = this.f36981r.getBytes("UTF-8");
                    if (ccpm.m131130c()) {
                        bytes[0] = (byte) (bytes[0] ^ 1);
                    }
                    bmxy.m108581a(this.f36968e);
                    z = this.f36968e.f36910a.setPin(bytes);
                    i2 = 1;
                } catch (UnsupportedEncodingException e) {
                    bnsi b = f36964a.mo68387b();
                    b.mo68432a("nyr", "e", 505, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Cannot encode the authentication data from the car");
                    i2 = 3;
                }
            } else if (i != 2) {
                bnsi b2 = f36964a.mo68387b();
                b2.mo68432a("nyr", "e", 560, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68409a("Invalid Bluetooth pairing method: %d", this.f36979p);
            } else {
                String format = String.format(Locale.US, "%06d", Integer.valueOf(this.f36980q));
                if ((format.equals(this.f36981r) || (ccpm.f179688a.mo6606a().mo76585a() && Integer.toString(this.f36980q).equals(this.f36981r))) && !ccpm.m131130c()) {
                    bmxy.m108581a(this.f36968e);
                    z = this.f36968e.mo21823a(true);
                    i2 = 1;
                } else {
                    bnsi b3 = f36964a.mo68387b();
                    b3.mo68432a("nyr", "e", 534, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b3.mo68424a("Bluetooth pairing authentication data mismatch. Pairing passkey from intent=%s, auth data from client=%s", format, this.f36981r);
                    if (ccpm.f179688a.mo6606a().mo76589e()) {
                        Intent intent = new Intent("com.google.android.gms.car.ACTION_SSP_KEY_MISMATCH").setPackage(npe.m27161b(this.f36965b));
                        nxz nxz = this.f36968e;
                        bmxy.m108581a(nxz);
                        this.f36965b.sendBroadcast(intent.putExtra("android.bluetooth.device.extra.DEVICE", nxz.f36910a));
                    }
                    bmxy.m108581a(this.f36968e);
                    this.f36968e.mo21823a(false);
                    i2 = 4;
                }
            }
            mo21862d();
            if (!z) {
                bnsi b4 = f36964a.mo68387b();
                b4.mo68432a("nyr", "e", 568, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68405a("Authentication failed. Unpairing");
                if (ccpm.m131133f()) {
                    mo21854a(5);
                } else {
                    mo21864f();
                }
            }
            this.f36969f.mo20950b(i2);
        }
    }

    /* renamed from: f */
    public final void mo21864f() {
        if (this.f36977n == 0) {
            bmxy.m108581a(this.f36968e);
            if (this.f36984u) {
                this.f36982s = this.f36968e.mo21828f();
            }
            int a = this.f36968e.mo21822a();
            if (a == 11) {
                this.f36968e.mo21825c();
            } else if (a == 10) {
                return;
            }
            this.f36968e.mo21824b();
        }
    }

    /* renamed from: a */
    public final void mo21855a(nxz nxz) {
        bnsi d = f36964a.mo68390d();
        d.mo68432a("nyr", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("enablePhoneBookAccess");
        if (nxz != null) {
            nxz.mo21826d();
        }
        mo21856a(nxz, this.f36982s);
    }

    /* renamed from: a */
    public final void mo21856a(nxz nxz, boolean z) {
        boolean z2;
        if (this.f36983t) {
            if (nxz != null) {
                z2 = nxz.mo21828f();
            } else {
                z2 = false;
            }
            bnsi d = f36964a.mo68390d();
            d.mo68432a("nyr", "a", 729, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68435a("logPhonebookAccess expected:%b, observed:%b", z, z2);
            this.f36969f.mo20948a(z, z2);
        }
    }

    /* renamed from: b */
    public final boolean mo21860b() {
        if (this.f36977n == 0) {
            bmxy.m108581a(this.f36968e);
            if (this.f36968e.mo21822a() == 11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo21857a() {
        if (this.f36977n != 0) {
            return false;
        }
        bmxy.m108581a(this.f36966c);
        return this.f36966c.f36908a.isEnabled();
    }

    /* renamed from: a */
    public final boolean mo21858a(BluetoothDevice bluetoothDevice) {
        bmxy.m108581a(this.f36968e);
        nxz nxz = this.f36968e;
        return nxz != null && nxz.f36910a.equals(bluetoothDevice);
    }

    public nyr(Context context, String str, nyp nyp, srl srl) {
        this.f36965b = context;
        this.f36969f = nyp;
        this.f36982s = true;
        this.f36983t = ccpm.f179688a.mo6606a().mo76596l();
        this.f36984u = ccpm.f179688a.mo6606a().mo76587c();
        this.f36970g = ccpm.f179688a.mo6606a().mo76588d();
        this.f36971h = ccpm.f179688a.mo6606a().mo76598n();
        if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
            nxy nxy = (nxy) srl.mo21850a(context);
            this.f36966c = nxy;
            if (nxy == null) {
                bnsi b = f36964a.mo68387b();
                b.mo68432a("nyr", "<init>", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("BluetoothAdapter is null");
                this.f36977n = -3;
                this.f36968e = null;
                return;
            }
            this.f36967d = str;
            if (str != null) {
                bmxy.m108581a(nxy);
                this.f36968e = this.f36966c.mo21819a(str);
            } else {
                this.f36968e = null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36972i, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
            intentFilter2.setPriority(999);
            this.f36965b.registerReceiver(this.f36973j, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36974k, intentFilter3);
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36975l, intentFilter4);
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter5.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
            this.f36965b.registerReceiver(this.f36976m, intentFilter5);
            this.f36977n = 0;
            return;
        }
        bnsi b2 = f36964a.mo68387b();
        b2.mo68432a("nyr", "<init>", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68420a("Invalid peer Bluetooth address: %s", str);
        this.f36977n = -2;
        this.f36966c = null;
        this.f36968e = null;
    }
}

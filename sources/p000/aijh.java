package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: aijh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aijh {

    /* renamed from: a */
    public final Context f68960a;

    /* renamed from: b */
    public final airs f68961b;

    /* renamed from: c */
    public airo f68962c;

    /* renamed from: d */
    public airo f68963d;

    /* renamed from: e */
    private final BluetoothClassic$BluetoothPairingDialogZapper f68964e;

    /* renamed from: f */
    private final BluetoothAdapter f68965f;

    /* renamed from: g */
    private final Map f68966g = new C1223np();

    /* renamed from: h */
    private final bqgj f68967h;

    public aijh(Context context, airs airs) {
        bqgj b = ahhr.m55806b();
        this.f68960a = context.getApplicationContext();
        this.f68961b = airs;
        this.f68967h = b;
        this.f68965f = BluetoothAdapter.getDefaultAdapter();
        this.f68964e = new BluetoothClassic$BluetoothPairingDialogZapper(this.f68960a);
        if (mo37580b()) {
            aipd.m57627a().mo37797c(this.f68960a);
        }
    }

    /* renamed from: a */
    public static UUID m57292a(String str) {
        return UUID.nameUUIDFromBytes(str.getBytes());
    }

    /* renamed from: e */
    private final boolean m57294e() {
        return this.f68963d != null;
    }

    /* renamed from: f */
    private final boolean m57295f() {
        return this.f68962c != null;
    }

    /* renamed from: b */
    public final boolean mo37580b() {
        return cfnv.f184625a.mo6606a().mo81746aE() && this.f68960a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.f68965f != null;
    }

    /* renamed from: c */
    public final synchronized void mo37582c() {
        if (!m57294e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aijh", "c", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop Bluetooth Classic advertising because it was never turned on.");
            return;
        }
        this.f68961b.mo37910c(this.f68963d);
        this.f68963d = null;
        srn srn = ailf.f69111a;
    }

    /* renamed from: d */
    public final synchronized void mo37584d() {
        if (!m57295f()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aijh", "d", 294, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop stop Bluetooth Classic discovery because it never started.");
            return;
        }
        this.f68961b.mo37910c(this.f68962c);
        this.f68962c = null;
        srn srn = ailf.f69111a;
    }

    /* renamed from: a */
    public static boolean m57293a(airr airr) {
        airr airr2 = airr.UNKNOWN;
        int ordinal = airr.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", airr));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized BluetoothDevice mo37586e(String str) {
        if (str == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "e", 508, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to get remote Bluetooth device because a null bluetoothMacAddress was passed in.");
            return null;
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aijh", "e", 516, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("%s is not a valid Bluetooth MAC address", str);
            return null;
        } else {
            try {
                return this.f68965f.getRemoteDevice(str);
            } catch (IllegalArgumentException e) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aijh", "e", 523, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("A valid Bluetooth Device could not be generated from %s", str);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized aipa mo37574a(BluetoothDevice bluetoothDevice, String str, ahfk ahfk) {
        if (bluetoothDevice == null || str == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "a", 464, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to create client Bluetooth socket because at least one of bluetoothDevice or serviceName is null.");
            return null;
        }
        aije aije = new aije(this.f68964e, bluetoothDevice, str, ahfk);
        if (!m57293a(this.f68961b.mo37908b(aije))) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aijh", "a", 475, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to create client Bluetooth socket because we failed to register the MediumOperation.");
            return null;
        }
        aipa aipa = aije.f68945b;
        aipa.mo37637a(new aiiv(this, aije));
        return aipa;
    }

    /* renamed from: b */
    public final synchronized boolean mo37581b(String str) {
        if (str == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "b", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start Bluetooth Classic advertising because a null deviceName was passed in.");
            return false;
        } else if (m57294e()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aijh", "b", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Refusing to start Bluetooth Classic advertising with device name %s because we're already discoverable with device name %s.", str, this.f68965f.getName());
            return false;
        } else if (!mo37580b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aijh", "b", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't start Bluetooth Classic advertising because Bluetooth is not available.");
            return false;
        } else {
            aijb aijb = new aijb(this.f68960a, this.f68965f, str);
            if (!m57293a(this.f68961b.mo37908b(aijb))) {
                srn srn = ailf.f69111a;
                return false;
            }
            this.f68963d = aijb;
            srn srn2 = ailf.f69111a;
            return true;
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo37583c(String str) {
        return this.f68966g.containsKey(str);
    }

    /* renamed from: d */
    public final synchronized void mo37585d(String str) {
        if (str == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "d", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to stop accepting Bluetooth Classic connections because the serviceName is null.");
        } else if (!mo37583c(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aijh", "d", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Can't stop accepting Bluetooth Classic connections for %s because it was never started.", str);
        } else {
            try {
                ((BluetoothServerSocket) this.f68966g.remove(str)).close();
            } catch (IOException e) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aijh", "d", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to close Bluetooth Classic server socket for %s.", str);
            }
            this.f68964e.mo44290b();
            srn srn = ailf.f69111a;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37575a() {
        ahhr.m55805a(this.f68967h, "BluetoothClassic.singleThreadOffloader");
        mo37584d();
        Iterator it = new C1225nr(this.f68966g.keySet()).iterator();
        while (it.hasNext()) {
            mo37585d((String) it.next());
        }
        mo37582c();
    }

    /* renamed from: a */
    public final synchronized void mo37576a(airo airo) {
        this.f68961b.mo37910c(airo);
    }

    /* renamed from: a */
    public final void mo37577a(Runnable runnable) {
        this.f68967h.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized boolean mo37578a(ahoi ahoi) {
        if (ahoi == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start Bluetooth Classic discovery because a null discoveredDeviceCallback was passed in.");
            return false;
        } else if (m57295f()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aijh", "a", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start Bluetooth Classic discovery because another discovery is already in-progress.");
            return false;
        } else if (!mo37580b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aijh", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't start Bluetooth Classic discovery because Bluetooth is not available.");
            return false;
        } else {
            aijg aijg = new aijg(this.f68960a, this.f68965f, this.f68967h, ahoi);
            if (!m57293a(this.f68961b.mo37908b(aijg))) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68432a("aijh", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to start Bluetooth Classic discovery because we were unable to register the MediumOperation.");
                return false;
            }
            this.f68962c = aijg;
            srn srn = ailf.f69111a;
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37579a(String str, ahoa ahoa) {
        if (str == null || ahoa == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aijh", "a", 317, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting Bluetooth Classic connections because at least one of serviceName or acceptedConnectionCallback is null.");
            return false;
        } else if (mo37583c(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aijh", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Refusing to start accepting Bluetooth Classic connections for %s because a Bluetooth server is already in-progress for that service name.", str);
            return false;
        } else if (!mo37580b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aijh", "a", 332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Can't start accepting Bluetooth Classic connections for %s because Bluetooth is not available.", str);
            return false;
        } else {
            this.f68964e.mo44289a();
            try {
                BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord = this.f68965f.listenUsingInsecureRfcommWithServiceRecord(str, m57292a(str));
                new aiiz(this, 9, listenUsingInsecureRfcommWithServiceRecord, ahoa, str).start();
                this.f68966g.put(str, listenUsingInsecureRfcommWithServiceRecord);
                srn srn = ailf.f69111a;
                return true;
            } catch (IOException e) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68437a(e);
                bnsl4.mo68432a("aijh", "a", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to start accepting Bluetooth Classic connections for %s.", str);
                return false;
            }
        }
    }
}

package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ayns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayns {

    /* renamed from: a */
    public final Context f98083a;

    /* renamed from: b */
    public final ayqk f98084b;

    /* renamed from: c */
    public final ayox f98085c;

    /* renamed from: d */
    public final BluetoothDevice f98086d;

    /* renamed from: e */
    public final aynq f98087e;

    /* renamed from: f */
    public final ayqt f98088f;

    public ayns(Context context, BluetoothDevice bluetoothDevice, ayqk ayqk, ayox ayox, aynq aynq, ayqt ayqt) {
        this.f98083a = context;
        this.f98086d = bluetoothDevice;
        this.f98084b = ayqk;
        this.f98085c = ayox;
        this.f98087e = aynq;
        this.f98088f = ayqt;
        int i = Build.VERSION.SDK_INT;
        if (ayqk.mo54096D()) {
            if (!((Boolean) ayqm.m84613a(bluetoothDevice).mo54282a("setPhonebookAccessPermission", Integer.TYPE).mo54281b(2)).booleanValue()) {
                throw new PairingException("Failed to deny contacts (phonebook) access.", new Object[0]);
            }
        }
        if (ayqk.mo54097E()) {
            if (!((Boolean) ayqm.m84613a(bluetoothDevice).mo54282a("setMessageAccessPermission", Integer.TYPE).mo54281b(2)).booleanValue()) {
                throw new PairingException("Failed to deny message access.", new Object[0]);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (ayqk.mo54098F()) {
            if (!((Boolean) ayqm.m84613a(bluetoothDevice).mo54282a("setSimAccessPermission", Integer.TYPE).mo54281b(2)).booleanValue()) {
                throw new PairingException("Failed to deny SIM access.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private final void m84369a(ayoe ayoe) {
        ayqr ayqr;
        aynl aynl = new aynl(this, ayoe);
        try {
            aynp aynp = new aynp(this, ayoe);
            try {
                BluetoothProfile bluetoothProfile = aynl.f98068a;
                bnsp bnsp = aypn.f98194a;
                if (!((Boolean) ayqm.m84613a(bluetoothProfile).mo54282a("connect", BluetoothDevice.class).mo54281b(this.f98086d)).booleanValue()) {
                    bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                    bnsl.mo68432a("ayns", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("connect returned false, expected if connecting, state=%d", bluetoothProfile.getConnectionState(this.f98086d));
                }
                if (bluetoothProfile.getConnectionState(this.f98086d) != 2) {
                    ayqr = new ayqr(this.f98088f, "Wait connection");
                    aynp.mo54283a((long) this.f98084b.mo54093A(), TimeUnit.SECONDS);
                    ayqr.close();
                }
                aynp.close();
                aynl.close();
                return;
            } catch (Throwable th) {
                aynp.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                aynl.close();
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54164b() {
        String str;
        ayqr ayqr;
        int bondState = this.f98086d.getBondState();
        if (bondState == 11) {
            this.f98085c.mo54180a(bvjc.CANCEL_BOND);
            str = "cancelBondProcess";
        } else if (bondState == 12) {
            this.f98085c.mo54180a(bvjc.REMOVE_BOND);
            str = "removeBond";
        } else {
            return;
        }
        aynr aynr = new aynr(this);
        try {
            ayqr = new ayqr(this.f98088f, str.length() == 0 ? new String("Unpair: ") : "Unpair: ".concat(str));
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayns", "b", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s with %s", str, this.f98086d);
            if (!((Boolean) ayqm.m84613a(this.f98086d).mo54282a(str, new Class[0]).mo54281b(new Object[0])).booleanValue()) {
                int bondState2 = this.f98086d.getBondState();
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                bnsl2.mo68432a("ayns", "b", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68422a("%s returned false, state=%s.", (Object) str, bondState2);
                if (bondState2 != 10) {
                    throw new PairingException("%s failed, returned false, state=%s", str, Integer.valueOf(bondState2));
                }
            } else {
                aynr.mo54283a((long) this.f98084b.mo54152y(), TimeUnit.SECONDS);
            }
            ayqr.close();
            aynr.close();
            SystemClock.sleep((long) this.f98084b.mo54153z());
            this.f98085c.mo54183b();
            return;
        } catch (Throwable th) {
            try {
                aynr.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, android.bluetooth.BluetoothDevice, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2.f98081c == false) goto L_0x0027;
     */
    /* renamed from: c */
    public final void mo54165c() {
        mo54164b();
        this.f98085c.mo54180a(bvjc.CREATE_BOND);
        ayno ayno = new ayno(this);
        try {
            ayqr ayqr = new ayqr(this.f98088f, "Create bond");
            try {
                aynq aynq = this.f98087e;
                if (aynq != null) {
                }
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("ayns", "c", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                BluetoothDevice bluetoothDevice = this.f98086d;
                bnsl.mo68422a("createBond with %s, type=%s", (Object) bluetoothDevice, bluetoothDevice.getType());
                if (this.f98084b.mo54110R()) {
                    ayqm.m84613a(this.f98086d).mo54282a("createBond", Integer.TYPE).mo54280a(Integer.valueOf(this.f98084b.mo54111S()));
                } else {
                    this.f98086d.createBond();
                }
                ayno.mo54283a((long) this.f98084b.mo54093A(), TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                bnsl2.mo68432a("ayns", "c", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("bondedReceiver time out after %s seconds", this.f98084b.mo54093A());
                if (!this.f98084b.mo54109Q() || !mo54162a()) {
                    throw e;
                }
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
                bnsl3.mo68432a("ayns", "c", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Created bond but never received UUIDs, attempting to continue.");
            } catch (Throwable th) {
                ayqr.close();
                throw th;
            }
            ayqr.close();
            ayno.close();
            this.f98085c.mo54183b();
        } catch (Throwable th2) {
            try {
                ayno.close();
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54161a(short s, boolean z) {
        ayno ayno;
        ayqr ayqr;
        if (this.f98084b.mo54279a(s)) {
            ayoe ayoe = (ayoe) ayok.f98122a.get(Short.valueOf(s));
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayns", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Connecting to profile=%s on device=%s", ayoe, this.f98086d);
            if (z) {
                ayno = new ayno(this);
            } else {
                ayno = null;
            }
            try {
                ayqt ayqt = this.f98088f;
                String valueOf = String.valueOf(ayoe);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb.append("Connect: ");
                sb.append(valueOf);
                ayqr ayqr2 = new ayqr(ayqt, sb.toString());
                try {
                    aynl aynl = new aynl(this, ayoe);
                    try {
                        aynp aynp = new aynp(this, ayoe);
                        try {
                            BluetoothProfile bluetoothProfile = aynl.f98068a;
                            if (!((Boolean) ayqm.m84613a(bluetoothProfile).mo54282a("connect", BluetoothDevice.class).mo54281b(this.f98086d)).booleanValue()) {
                                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                                bnsl2.mo68432a("ayns", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68409a("connect returned false, expected if connecting, state=%d", bluetoothProfile.getConnectionState(this.f98086d));
                            }
                            if (bluetoothProfile.getConnectionState(this.f98086d) != 2) {
                                ayqr = new ayqr(this.f98088f, "Wait connection");
                                aynp.mo54283a((long) this.f98084b.mo54093A(), TimeUnit.SECONDS);
                                ayqr.close();
                                aynp.close();
                            } else {
                                aynp.close();
                            }
                            aynl.close();
                            ayqr2.close();
                            if (ayno != null) {
                                ayno.close();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            aynp.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        aynl.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ayqr2.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                if (ayno != null) {
                    try {
                        ayno.close();
                    } catch (Throwable th5) {
                        bqye.m113761a(th4, th5);
                    }
                }
                throw th4;
            }
        } else {
            throw new ConnectException(2, "Unsupported profile=%s", Short.valueOf(s));
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54162a() {
        return this.f98086d.getBondState() == 12;
    }

    /* renamed from: a */
    public final boolean mo54163a(String str) {
        return C1133kh.m17835a(this.f98083a, str) == 0;
    }
}

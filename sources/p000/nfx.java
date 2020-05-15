package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.beacon.BleServiceImpl$FlagChangeBroadcastReceiver;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: nfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfx extends dck implements nfy {

    /* renamed from: a */
    public final BleServiceImpl$FlagChangeBroadcastReceiver f35467a;

    /* renamed from: b */
    public final Cnew f35468b;

    /* renamed from: c */
    public final Context f35469c;

    /* renamed from: d */
    public final ReentrantLock f35470d;

    /* renamed from: e */
    public final Map f35471e;

    /* renamed from: f */
    public final Map f35472f;

    /* renamed from: g */
    public nga f35473g;

    public nfx() {
        super("com.google.android.gms.beacon.internal.IBleService");
    }

    /* renamed from: a */
    private final nel m26141a(nfv nfv) {
        IBinder asBinder = nfv.asBinder();
        synchronized (this.f35471e) {
            nel nel = (nel) this.f35471e.get(asBinder);
            if (nel != null) {
                return nel;
            }
            nel nel2 = new nel(this, asBinder);
            this.f35471e.put(asBinder, nel2);
            return nel2;
        }
    }

    /* renamed from: b */
    private final synchronized void m26143b() {
        ArrayList arrayList = new ArrayList(this.f35471e.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nel nel = (nel) arrayList.get(i);
            nel.f35405a.mo20572a(3);
            nel.mo20530a();
        }
    }

    public nfx(nga nga, Cnew newR, Context context) {
        super("com.google.android.gms.beacon.internal.IBleService");
        this.f35467a = new BleServiceImpl$FlagChangeBroadcastReceiver(this);
        this.f35470d = new ReentrantLock();
        this.f35473g = nga;
        this.f35471e = Collections.synchronizedMap(new HashMap());
        this.f35468b = newR;
        this.f35472f = Collections.synchronizedMap(new HashMap());
        this.f35469c = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("com.google.android.gms.phenotype.UPDATE");
        this.f35469c.registerReceiver(this.f35467a, intentFilter);
    }

    /* renamed from: a */
    public static boolean m26142a(nga nga) {
        return nga != null && nga.mo20585a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo20579a(nel nel) {
        this.f35470d.lock();
        try {
            this.f35473g.mo20583a(nel);
            this.f35470d.unlock();
            this.f35471e.remove(nel.f35406b);
            Integer num = (Integer) this.f35472f.remove(nel);
            if (num != null) {
                nha.m26245b(BleSettings.m22044b(num.intValue()).concat(" requested to stop scan"));
            }
            if (num != null) {
                this.f35468b.mo20549a(num);
                ngz.m26240a(num.intValue());
            }
        } catch (Throwable th) {
            this.f35470d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo20576a(rnt rnt, nfv nfv) {
        try {
            mo20579a(m26141a(nfv));
            nha.m26245b("Scan canceled successfully.");
            if (rnt != null) {
                rnt.mo11797a(Status.f30107a);
            }
        } catch (Exception e) {
            nha.m26244a("Canceling scan failed", e);
            if (rnt != null) {
                rnt.mo11797a(Status.f30109c);
            }
        }
    }

    /* renamed from: a */
    public final void mo20577a(rnt rnt, nfv nfv, BleSettings bleSettings) {
        ReentrantLock reentrantLock;
        nha.m26245b(String.format("Client requested scan, settings=%s", bleSettings));
        int i = bleSettings.f29270f;
        int i2 = bleSettings.f29265a;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i == 1) {
                        ngz.m26242b(8);
                    } else if (i == 2) {
                        ngz.m26242b(12);
                    } else if (i == 3) {
                        ngz.m26242b(3);
                    } else if (i != 7) {
                        ngz.m26242b(18);
                    } else {
                        ngz.m26242b(16);
                    }
                }
            } else if (i == 1) {
                ngz.m26242b(6);
            } else if (i == 2) {
                ngz.m26242b(11);
            } else if (i == 3) {
                ngz.m26242b(2);
            } else if (i != 7) {
                ngz.m26242b(18);
            } else {
                ngz.m26242b(15);
            }
        } else if (i == 1) {
            ngz.m26242b(7);
        } else if (i == 2) {
            ngz.m26242b(13);
        } else if (i == 3) {
            ngz.m26242b(4);
        } else if (i != 7) {
            ngz.m26242b(18);
        } else {
            ngz.m26242b(15);
        }
        this.f35470d.lock();
        try {
            nel a = m26141a(nfv);
            if (!this.f35473g.mo20586a(bleSettings, a)) {
                nha.m26246c(String.format("Scan couldn't start for %s", bleSettings.mo17297a()));
                rnt.mo11797a(Status.f30109c);
                reentrantLock = this.f35470d;
                reentrantLock.unlock();
                return;
            }
            this.f35470d.unlock();
            this.f35468b.mo20548a(bleSettings);
            this.f35472f.put(a, Integer.valueOf(i));
            rnt.mo11797a(Status.f30107a);
        } catch (Exception e) {
            nha.m26244a("Scan failed. All scans will be stopped.", e);
            m26143b();
            this.f35473g.mo20584a(false);
            rnt.mo11797a(Status.f30109c);
            reentrantLock = this.f35470d;
        } catch (Throwable th) {
            this.f35470d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo20578a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f35470d.lock();
        try {
            boolean z = false;
            if (m26142a(this.f35473g)) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (defaultAdapter != null && defaultAdapter.isOffloadedFilteringSupported()) {
                        z = true;
                    }
                } catch (NullPointerException e) {
                }
            }
            return z;
        } finally {
            this.f35470d.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        rnt rnt2;
        nfv nfv = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
            } else {
                rnt = null;
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.beacon.internal.IBleListener");
                if (queryLocalInterface2 instanceof nfv) {
                    nfv = (nfv) queryLocalInterface2;
                } else {
                    nfv = new nft(readStrongBinder2);
                }
            }
            mo20577a(rnt, nfv, (BleSettings) dcl.m8163a(parcel, BleSettings.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt2 = queryLocalInterface3 instanceof rnt ? (rnt) queryLocalInterface3 : new rnr(readStrongBinder3);
            } else {
                rnt2 = null;
            }
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.beacon.internal.IBleListener");
                if (queryLocalInterface4 instanceof nfv) {
                    nfv = (nfv) queryLocalInterface4;
                } else {
                    nfv = new nft(readStrongBinder4);
                }
            }
            mo20576a(rnt2, nfv);
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            boolean a = mo20578a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        }
        return true;
    }
}

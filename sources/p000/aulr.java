package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: aulr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aulr extends aulp {

    /* renamed from: h */
    private static final aunx f92051h = new aunx("TrustAgent", "BondedDeviceEidSupportedOperation");

    /* renamed from: i */
    private static final long f92052i = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    public final Object f92053a = new Object();

    /* renamed from: d */
    public final BlockingQueue f92054d;

    /* renamed from: e */
    protected final aulq f92055e = new aulq(this);

    /* renamed from: j */
    private final ausf f92056j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aulr(auqe auqe, Bundle bundle) {
        super(auqe, bundle);
        ausf a = ausf.m77753a();
        this.f92056j = a;
        this.f92054d = new ArrayBlockingQueue(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo50660a(Bundle bundle) {
        HashMap hashMap;
        f92051h.mo50711a("doExecute", new Object[0]);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        try {
            ausf ausf = this.f92056j;
            aulq aulq = this.f92055e;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                ArrayList<BluetoothDevice> arrayList = new ArrayList(defaultAdapter.getBondedDevices());
                ausf.f92413i = ausf.mo50869b();
                ausp ausp = ausf.f92413i;
                ausn ausn = new ausn(ausp, aulq);
                if (arrayList.isEmpty()) {
                    aulq.mo50662a(new ArrayList());
                } else {
                    synchronized (ausp.f92435b) {
                        for (BluetoothDevice bluetoothDevice : arrayList) {
                            if (ausp.mo50883a(bluetoothDevice)) {
                                ausp.f92436c.put(bluetoothDevice, new auso(ausp, new Object[]{bluetoothDevice}, bluetoothDevice, ausn));
                            }
                        }
                        if (!ausp.f92436c.isEmpty()) {
                            hashMap = new HashMap(ausp.f92436c);
                        } else {
                            throw new ausj("Eid support check is not needed");
                        }
                    }
                    for (BluetoothDevice bluetoothDevice2 : hashMap.keySet()) {
                        try {
                            ausp.f92438e.mo50878a((ausl) hashMap.get(bluetoothDevice2));
                        } catch (ausj e) {
                            aunx aunx = ausp.f92434a;
                            String valueOf2 = String.valueOf(bluetoothDevice2);
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 46 + String.valueOf(message).length());
                            sb.append("execute eid check operation fails on ");
                            sb.append(valueOf2);
                            sb.append("; error: ");
                            sb.append(message);
                            aunx.mo50711a(sb.toString(), new Object[0]).mo50706a();
                        }
                    }
                    ausp.f92439f.set(false);
                }
                new ArrayList();
                try {
                    List list = (List) this.f92054d.poll(f92052i, TimeUnit.MILLISECONDS);
                    Long valueOf3 = Long.valueOf(System.currentTimeMillis());
                    aunx aunx2 = f92051h;
                    long longValue = valueOf3.longValue();
                    long longValue2 = valueOf.longValue();
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("find bonded eid supported devices takes ");
                    sb2.append(longValue - longValue2);
                    sb2.append("ms");
                    aunx2.mo50711a(sb2.toString(), new Object[0]).mo50708c();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArrayList("trustagent.api.bridge.be.BondedDeviceEidSupportedOperation.eid_device_key", (ArrayList) list);
                    return bundle2;
                } catch (InterruptedException e2) {
                    f92051h.mo50710a("error when wait on eid supported devices.", e2, new Object[0]).mo50706a();
                    throw new sju(e2.getMessage());
                }
            } else {
                throw new ausj("Bluetooth adapter is not available");
            }
        } catch (ausj e3) {
            throw new sju(e3.getMessage());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50661a() {
        boolean z;
        ausf ausf = this.f92056j;
        synchronized (ausf.f92409e) {
            ausp ausp = ausf.f92413i;
            if (ausp != null) {
                if (!ausp.mo50882a()) {
                    try {
                        ausp ausp2 = ausf.f92413i;
                        synchronized (ausp2.f92435b) {
                            z = false;
                            for (ausl ausl : ausp2.f92436c.values()) {
                                try {
                                    ausp2.f92438e.mo50880a(ausl, false);
                                } catch (ausj e) {
                                    ausp.f92434a.mo50710a("fails cancelling operation", e, new Object[0]);
                                    z = true;
                                }
                            }
                            ausp2.f92436c.clear();
                            ausp2.f92437d.clear();
                        }
                        ausp2.f92439f.set(false);
                        if (!z) {
                            ausf.f92413i = null;
                        } else {
                            throw new ausj("fails cancel");
                        }
                    } catch (ausj e2) {
                        try {
                            ausf.f92404a.mo50710a("error on stopping operation", e2, new Object[0]).mo50706a();
                            ausf.f92413i = null;
                        } catch (Throwable th) {
                            ausf.f92413i = null;
                            throw th;
                        }
                    }
                }
            }
            ausf.f92404a.mo50711a("no need to stop", new Object[0]).mo50709d();
        }
        synchronized (this.f92053a) {
            this.f92054d.clear();
            this.f92054d.add(new ArrayList());
        }
    }
}

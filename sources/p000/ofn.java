package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarGalMessage;
import java.io.PrintWriter;

/* renamed from: ofn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofn extends nro implements ofo {

    /* renamed from: h */
    private static final bnsn f37518h = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: a */
    public final Object f37519a;

    /* renamed from: b */
    public final SparseArray f37520b;

    /* renamed from: c */
    public final SparseArray f37521c;

    /* renamed from: d */
    public ofm f37522d;

    /* renamed from: e */
    public final CarGalMessage f37523e;

    /* renamed from: f */
    public final SparseIntArray f37524f;

    /* renamed from: g */
    public final nrp f37525g;

    public ofn() {
        this.f37519a = new Object();
        this.f37520b = new SparseArray();
        this.f37521c = new SparseArray();
        this.f37523e = new CarGalMessage();
        this.f37524f = new SparseIntArray();
        this.f37525g = null;
    }

    /* renamed from: a */
    private final void m28638a(SparseArray sparseArray, nrm nrm, int i) {
        ofm c = m28641c(nrm);
        if (c == null) {
            try {
                c = new ofm(this, nrm);
                nrm.f12819a.linkToDeath(c, 0);
            } catch (RemoteException e) {
                return;
            }
        }
        ArrayMap arrayMap = (ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        arrayMap.put(c, null);
        arrayMap.size();
    }

    /* renamed from: b */
    private final void m28640b(SparseArray sparseArray, nrm nrm, int i) {
        ArrayMap arrayMap;
        ofm c = m28641c(nrm);
        if (c != null && (arrayMap = (ArrayMap) sparseArray.get(i)) != null) {
            arrayMap.remove(c);
            arrayMap.size();
            m28639a(c);
        }
    }

    /* renamed from: c */
    private final ofm m28641c(nrm nrm) {
        IBinder iBinder = nrm.f12819a;
        for (int i = 0; i < this.f37520b.size(); i++) {
            for (ofm ofm : ((ArrayMap) this.f37520b.valueAt(i)).keySet()) {
                if (ofm.mo22097a(iBinder)) {
                    return ofm;
                }
            }
        }
        for (int i2 = 0; i2 < this.f37521c.size(); i2++) {
            for (ofm ofm2 : ((ArrayMap) this.f37521c.valueAt(i2)).keySet()) {
                if (ofm2.mo22097a(iBinder)) {
                    return ofm2;
                }
            }
        }
        ofm ofm3 = this.f37522d;
        if (ofm3 == null || !ofm3.mo22097a(iBinder)) {
            return null;
        }
        return this.f37522d;
    }

    /* renamed from: d */
    public final void mo21492d(nrm nrm, int i) {
        synchronized (this.f37519a) {
            m28640b(this.f37521c, nrm, i);
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21492d(nrm, i);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: c */
    public final void mo21491c(nrm nrm, int i) {
        synchronized (this.f37519a) {
            m28638a(this.f37521c, nrm, i);
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21491c(nrm, i);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: b */
    public final void mo22105b(int i, int i2, int i3) {
        synchronized (this.f37519a) {
            int i4 = this.f37524f.get(i, -1);
            if (this.f37521c.get(i4) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                for (ofm ofm : ((ArrayMap) this.f37521c.get(i4)).keySet()) {
                    try {
                        nrm nrm = ofm.f37516b;
                        Parcel bj = nrm.mo8529bj();
                        bj.writeLong(currentTimeMillis);
                        bj.writeInt(i);
                        bj.writeInt(i4);
                        bj.writeInt(i2);
                        bj.writeInt(i3);
                        nrm.mo8530c(4, bj);
                    } catch (RemoteException e) {
                    }
                }
            }
        }
    }

    public ofn(nrp nrp) {
        this.f37519a = new Object();
        this.f37520b = new SparseArray();
        this.f37521c = new SparseArray();
        this.f37523e = new CarGalMessage();
        this.f37524f = new SparseIntArray();
        this.f37525g = nrp;
    }

    /* renamed from: a */
    private final void m28639a(ofm ofm) {
        boolean z = false;
        for (int i = 0; i < this.f37520b.size(); i++) {
            z |= ((ArrayMap) this.f37520b.valueAt(i)).containsKey(ofm);
        }
        for (int i2 = 0; i2 < this.f37521c.size(); i2++) {
            z |= ((ArrayMap) this.f37521c.valueAt(i2)).containsKey(ofm);
        }
        ofm ofm2 = this.f37522d;
        if (ofm2 != null) {
            z |= ofm2.equals(ofm);
        }
        if (!z) {
            ofm.mo22096a();
        }
    }

    /* renamed from: b */
    public final void mo22106b(long j, int i) {
        synchronized (this.f37519a) {
            ofm ofm = this.f37522d;
            if (ofm != null) {
                try {
                    nrm nrm = ofm.f37516b;
                    Parcel bj = nrm.mo8529bj();
                    bj.writeLong(j);
                    bj.writeInt(i);
                    nrm.mo8530c(6, bj);
                } catch (RemoteException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22101a(int i, int i2) {
        if (i2 != 0) {
            bnsi d = f37518h.mo68390d();
            d.mo68432a("ofn", "a", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68411a("Update channel map channelId %d -> serviceType %d", i, i2);
            this.f37524f.put(i, i2);
            return;
        }
        bnsi c = f37518h.mo68388c();
        c.mo68432a("ofn", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68411a("Ignore mapping channelId %d -> serviceType %d", i, 0);
    }

    /* renamed from: b */
    public final void mo21489b(nrm nrm) {
        synchronized (this.f37519a) {
            ofm c = m28641c(nrm);
            if (c != null) {
                this.f37522d = null;
                m28639a(c);
            }
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21489b(nrm);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo22102a(int i, int i2, int i3) {
        synchronized (this.f37519a) {
            int i4 = this.f37524f.get(i, -1);
            if (this.f37521c.get(i4) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                for (ofm ofm : ((ArrayMap) this.f37521c.get(i4)).keySet()) {
                    try {
                        nrm nrm = ofm.f37516b;
                        Parcel bj = nrm.mo8529bj();
                        bj.writeLong(currentTimeMillis);
                        bj.writeInt(i);
                        bj.writeInt(i4);
                        bj.writeInt(i2);
                        bj.writeInt(i3);
                        nrm.mo8530c(3, bj);
                    } catch (RemoteException e) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21490b(nrm nrm, int i) {
        synchronized (this.f37519a) {
            m28640b(this.f37520b, nrm, i);
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21490b(nrm, i);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo22103a(long j, int i) {
        synchronized (this.f37519a) {
            ofm ofm = this.f37522d;
            if (ofm != null) {
                try {
                    nrm nrm = ofm.f37516b;
                    Parcel bj = nrm.mo8529bj();
                    bj.writeLong(j);
                    bj.writeInt(i);
                    nrm.mo8530c(5, bj);
                } catch (RemoteException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22104a(PrintWriter printWriter) {
        printWriter.print("CarGalMonitor{messageListeners=[");
        synchronized (this.f37519a) {
            for (int i = 0; i < this.f37520b.size(); i++) {
                ArrayMap arrayMap = (ArrayMap) this.f37520b.valueAt(i);
                if (arrayMap != null) {
                    if (!arrayMap.isEmpty()) {
                        int keyAt = this.f37520b.keyAt(i);
                        StringBuilder sb = new StringBuilder(12);
                        sb.append(keyAt);
                        sb.append(",");
                        printWriter.print(sb.toString());
                    }
                }
            }
            printWriter.print("], frameListeners=[");
            for (int i2 = 0; i2 < this.f37521c.size(); i2++) {
                ArrayMap arrayMap2 = (ArrayMap) this.f37521c.valueAt(i2);
                if (arrayMap2 != null) {
                    if (!arrayMap2.isEmpty()) {
                        int keyAt2 = this.f37521c.keyAt(i2);
                        StringBuilder sb2 = new StringBuilder(12);
                        sb2.append(keyAt2);
                        sb2.append(",");
                        printWriter.print(sb2.toString());
                    }
                }
            }
        }
        printWriter.println("]}");
    }

    /* renamed from: a */
    public final void mo21487a(nrm nrm) {
        synchronized (this.f37519a) {
            ofm c = m28641c(nrm);
            if (c == null) {
                try {
                    c = new ofm(this, nrm);
                    nrm.f12819a.linkToDeath(c, 0);
                } catch (RemoteException e) {
                }
            }
            this.f37522d = c;
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21487a(nrm);
            } catch (RemoteException e2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo21488a(nrm nrm, int i) {
        synchronized (this.f37519a) {
            m28638a(this.f37520b, nrm, i);
        }
        nrp nrp = this.f37525g;
        if (nrp != null) {
            try {
                nrp.mo21488a(nrm, i);
            } catch (RemoteException e) {
            }
        }
    }
}

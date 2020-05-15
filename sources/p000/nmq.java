package p000;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nmq implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final nsr f36046a;

    /* renamed from: b */
    public final SparseBooleanArray f36047b = new SparseBooleanArray();

    /* renamed from: c */
    final /* synthetic */ nmv f36048c;

    /* renamed from: d */
    private volatile boolean f36049d = true;

    public nmq(nmv nmv, nsr nsr) {
        this.f36048c = nmv;
        this.f36046a = nsr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21155a(int i) {
        this.f36047b.delete(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21158b() {
        if (this.f36049d) {
            this.f36046a.asBinder().unlinkToDeath(this, 0);
            this.f36047b.clear();
            this.f36049d = false;
        }
    }

    public final void binderDied() {
        this.f36046a.asBinder().unlinkToDeath(this, 0);
        nmv nmv = this.f36048c;
        nmv.f36064b.lock();
        try {
            for (int i : mo21157a()) {
                nmv.mo21175a(i, this.f36046a);
            }
            nmv.f36065c.remove(this);
        } finally {
            nmv.f36064b.unlock();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nmq) && this.f36046a.asBinder() == ((nmq) obj).f36046a.asBinder();
    }

    public final int hashCode() {
        return this.f36046a.asBinder().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21156a(CarSensorEvent carSensorEvent) {
        try {
            if (this.f36049d) {
                this.f36046a.mo21436a(carSensorEvent);
            } else {
                bnsn bnsn = nmv.f36061a;
            }
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int[] mo21157a() {
        int size = this.f36047b.size();
        int[] iArr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            iArr[i] = this.f36047b.keyAt(i);
        }
        return iArr;
    }
}

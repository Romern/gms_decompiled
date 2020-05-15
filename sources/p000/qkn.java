package p000;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: qkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qkn extends Binder {

    /* renamed from: a */
    public static final Binder f41609a = new Binder();

    /* renamed from: b */
    public final Intent f41610b;

    /* renamed from: c */
    public final qkp f41611c;

    /* renamed from: d */
    private final qko f41612d;

    /* renamed from: e */
    private Binder f41613e;

    /* renamed from: f */
    private boolean f41614f = true;

    public qkn(qkp qkp, Intent intent, qko qko) {
        this.f41611c = qkp;
        this.f41610b = intent;
        this.f41612d = qko;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder;
        if (!this.f41614f && this.f41613e == null) {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            qkp qkp = this.f41611c;
            int i3 = qkp.f41615c;
            qkp.f41616b.post(new qkm(this, arrayBlockingQueue));
            try {
                iBinder = (IBinder) arrayBlockingQueue.take();
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Take interrupted: ");
                sb.append(valueOf);
                Log.w("GmsApiChimeraSvc", sb.toString());
                iBinder = null;
            }
            if (iBinder != f41609a) {
                this.f41613e = (Binder) iBinder;
            }
        }
        Binder binder = this.f41613e;
        if (binder != null) {
            return binder.transact(i, parcel, parcel2, i2);
        }
        this.f41614f = false;
        String action = this.f41610b.getAction();
        StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 77);
        sb2.append("Using MissingApiServiceBroker for ");
        sb2.append(action);
        sb2.append(" due to missing BoundService implementation");
        Log.i("GmsApiChimeraSvc", sb2.toString());
        return this.f41612d.onTransact(i, parcel, parcel2, i2);
    }

    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}

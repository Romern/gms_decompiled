package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dck extends Binder implements IInterface {

    /* renamed from: CX */
    private static aabn f12821CX = null;

    public dck() {
        this("com.google.android.gms.growth.internal.IGrowthService");
    }

    /* renamed from: a */
    public static synchronized void m8161a(aabn aabn) {
        synchronized (dck.class) {
            if (f12821CX == null) {
                f12821CX = aabn;
            } else {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
        }
    }

    /* renamed from: a */
    public boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (f12821CX == null) {
            return mo3209a(i, parcel, parcel2);
        }
        if ((this instanceof aaai) || (this instanceof sjr) || blkh.m107295b(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
            return mo3209a(i, parcel, parcel2);
        }
        blji a = new aaaz(this).mo16672a(i, (bmzi) null);
        try {
            boolean a2 = mo3209a(i, parcel, parcel2);
            if (a == null) {
                return a2;
            }
            a.close();
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    protected dck(String str) {
        attachInterface(this, str);
    }
}

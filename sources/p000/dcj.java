package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dcj implements IInterface {

    /* renamed from: a */
    public final IBinder f12819a;

    /* renamed from: b */
    private final String f12820b;

    protected dcj(IBinder iBinder, String str) {
        this.f12819a = iBinder;
        this.f12820b = str;
    }

    /* renamed from: a */
    public final Parcel mo8526a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12819a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12819a;
    }

    /* renamed from: b */
    public final void mo8528b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12819a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: bj */
    public final Parcel mo8529bj() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12820b);
        return obtain;
    }

    /* renamed from: c */
    public final void mo8530c(int i, Parcel parcel) {
        try {
            this.f12819a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

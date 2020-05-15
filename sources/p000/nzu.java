package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: nzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nzu extends dck implements nzv {
    public nzu() {
        super("com.google.android.gms.car.diagnostics.ICarDiagnostics");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nzw nzw = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                if (queryLocalInterface instanceof nzw) {
                    nzw = (nzw) queryLocalInterface;
                } else {
                    nzw = new nzw(readStrongBinder);
                }
            }
            mo21034a(nzw);
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                if (queryLocalInterface2 instanceof nzw) {
                    nzw = (nzw) queryLocalInterface2;
                } else {
                    nzw = new nzw(readStrongBinder2);
                }
            }
            mo21035b(nzw);
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                if (queryLocalInterface3 instanceof nzw) {
                    nzw nzw2 = (nzw) queryLocalInterface3;
                } else {
                    new nzw(readStrongBinder3);
                }
            }
            parcel2.writeNoException();
            dcl.m8166a(parcel2, mo21036b());
        } else if (i != 4) {
            return false;
        } else {
            List a = mo21033a();
            parcel2.writeNoException();
            parcel2.writeTypedList(a);
        }
        return true;
    }
}

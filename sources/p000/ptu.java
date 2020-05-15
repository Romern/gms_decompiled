package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.RequestItem;

/* renamed from: ptu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ptu extends dck implements ptv {
    public ptu() {
        super("com.google.android.gms.cast.internal.ICastService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt = null;
        ptn ptn = null;
        ptn ptn2 = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface instanceof rnt) {
                        rnt = (rnt) queryLocalInterface;
                    } else {
                        rnt = new rnr(readStrongBinder);
                    }
                }
                mo23666a(rnt, parcel.createStringArray(), parcel.readString());
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt3 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo23667a(rnt3, parcel.createStringArray(), parcel.readString(), parcel.createTypedArrayList(RequestItem.CREATOR));
                return true;
            case 3:
                parcel.createByteArray();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface3;
                    } else {
                        rnt2 = new rnr(readStrongBinder3);
                    }
                }
                mo23665a(rnt2);
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.cast.internal.IBundleCallback");
                    if (queryLocalInterface4 instanceof ptn) {
                        ptn2 = (ptn) queryLocalInterface4;
                    } else {
                        ptn2 = new ptn(readStrongBinder4);
                    }
                }
                mo23664a(ptn2, parcel.createStringArray());
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.cast.internal.IBundleCallback");
                    if (queryLocalInterface5 instanceof ptn) {
                        ptn = (ptn) queryLocalInterface5;
                    } else {
                        ptn = new ptn(readStrongBinder5);
                    }
                }
                mo23668b(ptn, parcel.createStringArray());
                return true;
            default:
                return false;
        }
    }
}

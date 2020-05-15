package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* renamed from: avyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avyy extends dck implements avyz {
    public avyy() {
        super("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    public static avyz asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof avyz) {
            return (avyz) queryLocalInterface;
        }
        return new avyx(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        avyw newBarcodeDetector$ar$class_merging = newBarcodeDetector$ar$class_merging(vzr, (BarcodeDetectorOptions) dcl.m8163a(parcel, BarcodeDetectorOptions.CREATOR));
        parcel2.writeNoException();
        dcl.m8164a(parcel2, newBarcodeDetector$ar$class_merging);
        return true;
    }
}

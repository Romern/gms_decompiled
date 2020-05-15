package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* renamed from: avyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyx extends dcj implements avyz {
    public avyx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    public final avyw newBarcodeDetector$ar$class_merging(vzr vzr, BarcodeDetectorOptions barcodeDetectorOptions) {
        avyw avyw;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, barcodeDetectorOptions);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            avyw = queryLocalInterface instanceof avyw ? (avyw) queryLocalInterface : new avyw(readStrongBinder);
        } else {
            avyw = null;
        }
        a.recycle();
        return avyw;
    }
}

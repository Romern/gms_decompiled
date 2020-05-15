package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: avzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avzi extends dck implements avzj {
    public avzi() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static avzj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof avzj) {
            return (avzj) queryLocalInterface;
        }
        return new avzh(iBinder);
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
        avzg newFaceDetector$ar$class_merging = newFaceDetector$ar$class_merging(vzr, (FaceSettingsParcel) dcl.m8163a(parcel, FaceSettingsParcel.CREATOR));
        parcel2.writeNoException();
        dcl.m8164a(parcel2, newFaceDetector$ar$class_merging);
        return true;
    }
}

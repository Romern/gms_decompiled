package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: avzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzh extends dcj implements avzj {
    public avzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public final avzg newFaceDetector$ar$class_merging(vzr vzr, FaceSettingsParcel faceSettingsParcel) {
        avzg avzg;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, faceSettingsParcel);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            avzg = queryLocalInterface instanceof avzg ? (avzg) queryLocalInterface : new avzg(readStrongBinder);
        } else {
            avzg = null;
        }
        a.recycle();
        return avzg;
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: bjdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdl {
    @Deprecated
    /* renamed from: a */
    public static Parcelable m103244a(byte[] bArr, Parcelable.Creator creator) {
        bmxy.m108581a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable parcelable = (Parcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return parcelable;
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m103245a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}

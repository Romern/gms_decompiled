package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: dcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcl {

    /* renamed from: a */
    private static final ClassLoader f12822a = dcl.class.getClassLoader();

    private dcl() {
    }

    /* renamed from: a */
    public static Parcelable m8163a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: b */
    public static ArrayList m8168b(Parcel parcel) {
        return parcel.readArrayList(f12822a);
    }

    /* renamed from: c */
    public static HashMap m8170c(Parcel parcel) {
        return parcel.readHashMap(f12822a);
    }

    /* renamed from: b */
    public static void m8169b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: a */
    public static void m8164a(Parcel parcel, IInterface iInterface) {
        if (iInterface != null) {
            parcel.writeStrongBinder(iInterface.asBinder());
        } else {
            parcel.writeStrongBinder(null);
        }
    }

    /* renamed from: a */
    public static void m8165a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: a */
    public static void m8166a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m8167a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

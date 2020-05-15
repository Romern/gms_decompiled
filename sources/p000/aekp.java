package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: aekp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekp implements Parcelable.Creator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m52067a(ParcelableGeofence parcelableGeofence, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, parcelableGeofence.f79438a, false);
        see.m35036a(parcel, 2, parcelableGeofence.f79439b);
        see.m35050a(parcel, 3, parcelableGeofence.f79440c);
        see.m35033a(parcel, 4, parcelableGeofence.f79441d);
        see.m35033a(parcel, 5, parcelableGeofence.f79442e);
        see.m35034a(parcel, 6, parcelableGeofence.f79443f);
        see.m35063b(parcel, 7, parcelableGeofence.f79444g);
        see.m35063b(parcel, 8, parcelableGeofence.f79445h);
        see.m35063b(parcel, 9, parcelableGeofence.f79446i);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    s = sed.m35009f(parcel2, readInt);
                    break;
                case 4:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 5:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                case 6:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ParcelableGeofence(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmq implements Parcelable.Creator {
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
    public static void m54587a(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, userAttributeParcel.f80138a);
        see.m35046a(parcel, 2, userAttributeParcel.f80139b, false);
        see.m35036a(parcel, 3, userAttributeParcel.f80140c);
        see.m35045a(parcel, 4, userAttributeParcel.f80141d);
        see.m35043a(parcel, 5, (Float) null);
        see.m35046a(parcel, 6, userAttributeParcel.f80142e, false);
        see.m35046a(parcel, 7, userAttributeParcel.f80143f, false);
        see.m35042a(parcel, 8, userAttributeParcel.f80144g);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                case 5:
                    f = sed.m35016m(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    d = sed.m35018o(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new UserAttributeParcel(i, str, j, l, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}

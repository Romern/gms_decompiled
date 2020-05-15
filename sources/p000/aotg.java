package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.AddressEntity;

/* renamed from: aotg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotg implements Parcelable.Creator {
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
    public static void m69494a(AddressEntity addressEntity, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, addressEntity.f107106a, false);
        see.m35046a(parcel, 3, addressEntity.f107107b, false);
        see.m35046a(parcel, 4, addressEntity.f107108c, false);
        see.m35046a(parcel, 5, addressEntity.f107109d, false);
        see.m35046a(parcel, 6, addressEntity.f107112g, false);
        see.m35046a(parcel, 7, addressEntity.f107110e, false);
        see.m35046a(parcel, 8, addressEntity.f107111f, false);
        see.m35046a(parcel, 9, addressEntity.f107113h, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str7 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    str8 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AddressEntity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddressEntity[i];
    }
}

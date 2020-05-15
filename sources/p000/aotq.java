package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.AddressEntity;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;
import com.google.android.gms.reminders.model.LocationEntity;

/* renamed from: aotq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotq implements Parcelable.Creator {
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
    public static void m69508a(LocationEntity locationEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35042a(parcel, 2, locationEntity.f107138a);
        see.m35042a(parcel, 3, locationEntity.f107139b);
        see.m35046a(parcel, 4, locationEntity.f107140c, false);
        see.m35044a(parcel, 5, locationEntity.f107141d);
        see.m35044a(parcel, 6, locationEntity.f107142e);
        see.m35040a(parcel, 7, locationEntity.f107143f, i, false);
        see.m35046a(parcel, 8, locationEntity.f107144g, false);
        see.m35046a(parcel, 9, locationEntity.f107146i, false);
        see.m35040a(parcel, 10, locationEntity.f107145h, i, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Double d = null;
        Double d2 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        FeatureIdProtoEntity featureIdProtoEntity = null;
        String str2 = null;
        AddressEntity addressEntity = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    d = sed.m35018o(parcel, readInt);
                    break;
                case 3:
                    d2 = sed.m35018o(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 6:
                    num2 = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    featureIdProtoEntity = (FeatureIdProtoEntity) sed.m34998a(parcel, readInt, FeatureIdProtoEntity.CREATOR);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 10:
                    addressEntity = (AddressEntity) sed.m34998a(parcel, readInt, AddressEntity.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new LocationEntity(d, d2, str, num, num2, featureIdProtoEntity, str2, addressEntity, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationEntity[i];
    }
}

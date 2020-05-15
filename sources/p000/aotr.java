package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.LocationGroupEntity;

/* renamed from: aotr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotr implements Parcelable.Creator {
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
    public static void m69509a(LocationGroupEntity locationGroupEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, locationGroupEntity.f107147a, false);
        see.m35044a(parcel, 3, locationGroupEntity.f107148b);
        see.m35040a(parcel, 5, locationGroupEntity.f107149c, i, false);
        see.m35040a(parcel, 6, locationGroupEntity.f107150d, i, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Integer num = null;
        ChainInfoEntity chainInfoEntity = null;
        CategoryInfoEntity categoryInfoEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                num = sed.m35011h(parcel, readInt);
            } else if (a == 5) {
                chainInfoEntity = (ChainInfoEntity) sed.m34998a(parcel, readInt, ChainInfoEntity.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                categoryInfoEntity = (CategoryInfoEntity) sed.m34998a(parcel, readInt, CategoryInfoEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LocationGroupEntity(str, num, chainInfoEntity, categoryInfoEntity);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationGroupEntity[i];
    }
}

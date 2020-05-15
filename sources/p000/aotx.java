package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;

/* renamed from: aotx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotx implements Parcelable.Creator {
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
    public static void m69514a(RecurrenceInfoEntity recurrenceInfoEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, recurrenceInfoEntity.f107166a, i, false);
        see.m35046a(parcel, 3, recurrenceInfoEntity.f107167b, false);
        see.m35041a(parcel, 4, recurrenceInfoEntity.f107168c);
        see.m35041a(parcel, 5, recurrenceInfoEntity.f107169d);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        RecurrenceEntity recurrenceEntity = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                recurrenceEntity = (RecurrenceEntity) sed.m34998a(parcel, readInt, RecurrenceEntity.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                bool = sed.m35007d(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bool2 = sed.m35007d(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new RecurrenceInfoEntity(recurrenceEntity, str, bool, bool2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceInfoEntity[i];
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import java.util.ArrayList;

/* renamed from: aouh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouh implements Parcelable.Creator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    /* renamed from: a */
    public static void m69525a(YearlyPatternEntity yearlyPatternEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, yearlyPatternEntity.f107199a, i, false);
        see.m35049a(parcel, 3, yearlyPatternEntity.f107200b, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        MonthlyPatternEntity monthlyPatternEntity = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                monthlyPatternEntity = (MonthlyPatternEntity) sed.m34998a(parcel, readInt, MonthlyPatternEntity.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m34990B(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new YearlyPatternEntity(monthlyPatternEntity, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new YearlyPatternEntity[i];
    }
}

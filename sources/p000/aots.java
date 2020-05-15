package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import java.util.ArrayList;

/* renamed from: aots */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aots implements Parcelable.Creator {
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
    public static void m69510a(MonthlyPatternEntity monthlyPatternEntity, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35049a(parcel, 2, monthlyPatternEntity.f107151a, false);
        see.m35044a(parcel, 4, monthlyPatternEntity.f107152b);
        see.m35044a(parcel, 5, monthlyPatternEntity.f107153c);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m34990B(parcel, readInt);
            } else if (a == 4) {
                num = sed.m35011h(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                num2 = sed.m35011h(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MonthlyPatternEntity(arrayList, num, num2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MonthlyPatternEntity[i];
    }
}

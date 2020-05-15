package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPreferredSleepWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeiv();

    /* renamed from: a */
    public final int f79394a;

    /* renamed from: b */
    public final int f79395b;

    /* renamed from: c */
    public final int f79396c;

    /* renamed from: d */
    public final int f79397d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public UserPreferredSleepWindow(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i < 0) {
            z = false;
        } else {
            z = i <= 23;
        }
        sdo.m34971a(z, (Object) "Start hour must be in range [0, 23].");
        if (i2 < 0) {
            z2 = false;
        } else {
            z2 = i2 <= 59;
        }
        sdo.m34971a(z2, (Object) "Start minute must be in range [0, 59].");
        if (i3 < 0) {
            z3 = false;
        } else {
            z3 = i3 <= 23;
        }
        sdo.m34971a(z3, (Object) "End hour must be in range [0, 23].");
        if (i4 < 0) {
            z4 = false;
        } else {
            z4 = i4 <= 59;
        }
        sdo.m34971a(z4, (Object) "End minute must be in range [0, 59].");
        sdo.m34971a(((i + i2) + i3) + i4 <= 0 ? false : z5, (Object) "Parameters can't be all 0.");
        this.f79394a = i;
        this.f79395b = i2;
        this.f79396c = i3;
        this.f79397d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserPreferredSleepWindow) {
            UserPreferredSleepWindow userPreferredSleepWindow = (UserPreferredSleepWindow) obj;
            return this.f79394a == userPreferredSleepWindow.f79394a && this.f79395b == userPreferredSleepWindow.f79395b && this.f79396c == userPreferredSleepWindow.f79396c && this.f79397d == userPreferredSleepWindow.f79397d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79394a), Integer.valueOf(this.f79395b), Integer.valueOf(this.f79396c), Integer.valueOf(this.f79397d)});
    }

    public final String toString() {
        int i = this.f79394a;
        int i2 = this.f79395b;
        int i3 = this.f79396c;
        int i4 = this.f79397d;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79394a);
        see.m35063b(parcel, 2, this.f79395b);
        see.m35063b(parcel, 3, this.f79396c);
        see.m35063b(parcel, 4, this.f79397d);
        see.m35062b(parcel, a);
    }
}

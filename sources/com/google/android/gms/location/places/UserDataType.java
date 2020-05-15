package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserDataType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeml();

    /* renamed from: a */
    public static final UserDataType f79501a = m66919a("test_type", 1);

    /* renamed from: b */
    public static final UserDataType f79502b = m66919a("labeled_place", 6);

    /* renamed from: c */
    public static final UserDataType f79503c;

    /* renamed from: d */
    final String f79504d;

    /* renamed from: e */
    final int f79505e;

    static {
        UserDataType a = m66919a("here_content", 7);
        f79503c = a;
        sqw.m36039a(f79501a, f79502b, a);
    }

    public UserDataType(String str, int i) {
        sdo.m34977c(str);
        this.f79504d = str;
        this.f79505e = i;
    }

    /* renamed from: a */
    private static UserDataType m66919a(String str, int i) {
        return new UserDataType(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserDataType) {
            UserDataType userDataType = (UserDataType) obj;
            return this.f79504d.equals(userDataType.f79504d) && this.f79505e == userDataType.f79505e;
        }
    }

    public final int hashCode() {
        return this.f79504d.hashCode();
    }

    public final String toString() {
        return this.f79504d;
    }

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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79504d, false);
        see.m35063b(parcel, 2, this.f79505e);
        see.m35062b(parcel, a);
    }
}

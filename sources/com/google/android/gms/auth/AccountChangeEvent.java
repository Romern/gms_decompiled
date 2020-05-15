package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ghq();

    /* renamed from: a */
    final int f9904a;

    /* renamed from: b */
    final long f9905b;

    /* renamed from: c */
    final String f9906c;

    /* renamed from: d */
    public final int f9907d;

    /* renamed from: e */
    public final int f9908e;

    /* renamed from: f */
    public final String f9909f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f9904a = i;
        this.f9905b = j;
        sdo.m34959a((Object) str);
        this.f9906c = str;
        this.f9907d = i2;
        this.f9908e = i3;
        this.f9909f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f9904a == accountChangeEvent.f9904a && this.f9905b == accountChangeEvent.f9905b && sdg.m34949a(this.f9906c, accountChangeEvent.f9906c) && this.f9907d == accountChangeEvent.f9907d && this.f9908e == accountChangeEvent.f9908e && sdg.m34949a(this.f9909f, accountChangeEvent.f9909f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9904a), Long.valueOf(this.f9905b), this.f9906c, Integer.valueOf(this.f9907d), Integer.valueOf(this.f9908e), this.f9909f});
    }

    public final String toString() {
        int i = this.f9907d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f9906c;
        String str3 = this.f9909f;
        int i2 = this.f9908e;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
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
        see.m35063b(parcel, 1, this.f9904a);
        see.m35036a(parcel, 2, this.f9905b);
        see.m35046a(parcel, 3, this.f9906c, false);
        see.m35063b(parcel, 4, this.f9907d);
        see.m35063b(parcel, 5, this.f9908e);
        see.m35046a(parcel, 6, this.f9909f, false);
        see.m35062b(parcel, a);
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f9904a = 1;
        this.f9905b = j;
        sdo.m34959a((Object) str);
        this.f9906c = str;
        this.f9907d = i;
        this.f9908e = i2;
        this.f9909f = str2;
    }
}

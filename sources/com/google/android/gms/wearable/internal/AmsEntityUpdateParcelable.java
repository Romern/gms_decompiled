package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AmsEntityUpdateParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axps();

    /* renamed from: a */
    public byte f110883a;

    /* renamed from: b */
    public final byte f110884b;

    /* renamed from: c */
    public final String f110885c;

    public AmsEntityUpdateParcelable(byte b, byte b2, String str) {
        this.f110883a = b;
        this.f110884b = b2;
        this.f110885c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
            return this.f110883a == amsEntityUpdateParcelable.f110883a && this.f110884b == amsEntityUpdateParcelable.f110884b && this.f110885c.equals(amsEntityUpdateParcelable.f110885c);
        }
    }

    public final int hashCode() {
        return ((((this.f110883a + 31) * 31) + this.f110884b) * 31) + this.f110885c.hashCode();
    }

    public final String toString() {
        byte b = this.f110883a;
        byte b2 = this.f110884b;
        String str = this.f110885c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append((int) b);
        sb.append(", mAttributeId=");
        sb.append((int) b2);
        sb.append(", mValue='");
        sb.append(str);
        sb.append("'}");
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
        see.m35032a(parcel, 2, this.f110883a);
        see.m35032a(parcel, 3, this.f110884b);
        see.m35046a(parcel, 4, this.f110885c, false);
        see.m35062b(parcel, a);
    }
}

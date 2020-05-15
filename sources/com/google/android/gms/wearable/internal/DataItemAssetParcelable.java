package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, axor {
    public static final Parcelable.Creator CREATOR = new axqw();

    /* renamed from: a */
    public final String f110912a;

    /* renamed from: b */
    public final String f110913b;

    public DataItemAssetParcelable(axor axor) {
        String a = axor.mo53320a();
        sdo.m34959a((Object) a);
        this.f110912a = a;
        String b = axor.mo53321b();
        sdo.m34959a((Object) b);
        this.f110913b = b;
    }

    /* renamed from: a */
    public final String mo53320a() {
        return this.f110912a;
    }

    /* renamed from: b */
    public final String mo53321b() {
        return this.f110913b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f110912a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f110912a);
        }
        sb.append(", key=");
        sb.append(this.f110913b);
        sb.append("]");
        return sb.toString();
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.f110912a = str;
        this.f110913b = str2;
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
        see.m35046a(parcel, 2, this.f110912a, false);
        see.m35046a(parcel, 3, this.f110913b, false);
        see.m35062b(parcel, a);
    }
}

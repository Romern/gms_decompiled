package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajcq();

    /* renamed from: a */
    final int f80738a;

    /* renamed from: b */
    public final String f80739b;

    /* renamed from: c */
    public final String f80740c;

    public MessageType(int i, String str, String str2) {
        this.f80738a = i;
        this.f80739b = str;
        this.f80740c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MessageType) && hashCode() == obj.hashCode()) {
            MessageType messageType = (MessageType) obj;
            return sdg.m34949a(this.f80739b, messageType.f80739b) && sdg.m34949a(this.f80740c, messageType.f80740c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80739b, this.f80740c});
    }

    public final String toString() {
        String str = this.f80739b;
        String str2 = this.f80740c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append("namespace=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        return sb.toString();
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
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
        see.m35046a(parcel, 1, this.f80739b, false);
        see.m35046a(parcel, 2, this.f80740c, false);
        see.m35063b(parcel, 1000, this.f80738a);
        see.m35062b(parcel, a);
    }
}

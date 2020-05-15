package com.google.android.gms.mdh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdhBroadcastListenerKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afkr();

    /* renamed from: a */
    public final String f79983a;

    /* renamed from: b */
    public final Account f79984b;

    /* renamed from: c */
    public final byte[] f79985c;

    public MdhBroadcastListenerKey(String str, Account account, byte[] bArr) {
        this.f79983a = str;
        this.f79984b = account;
        this.f79985c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) obj;
            return sdg.m34949a(this.f79983a, mdhBroadcastListenerKey.f79983a) && sdg.m34949a(this.f79984b, mdhBroadcastListenerKey.f79984b) && sdg.m34949a(this.f79985c, mdhBroadcastListenerKey.f79985c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79983a, this.f79984b, this.f79985c});
    }

    public final String toString() {
        String str = this.f79983a;
        String valueOf = String.valueOf(this.f79984b);
        String arrays = Arrays.toString(this.f79985c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf).length() + String.valueOf(arrays).length());
        sb.append("MdhBroadcastListenerKey{action='");
        sb.append(str);
        sb.append("', account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(arrays);
        sb.append('}');
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79983a, false);
        see.m35040a(parcel, 2, this.f79984b, i, false);
        see.m35052a(parcel, 3, this.f79985c, false);
        see.m35062b(parcel, a);
    }
}

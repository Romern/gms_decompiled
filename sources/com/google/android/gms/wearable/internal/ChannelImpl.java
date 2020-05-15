package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, Parcelable {
    public static final Parcelable.Creator CREATOR = new axqg();

    /* renamed from: a */
    public final String f110906a;

    /* renamed from: b */
    public final String f110907b;

    /* renamed from: c */
    public final String f110908c;

    public ChannelImpl(String str, String str2, String str3) {
        sdo.m34959a((Object) str);
        this.f110906a = str;
        sdo.m34959a((Object) str2);
        this.f110907b = str2;
        sdo.m34959a((Object) str3);
        this.f110908c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChannelImpl) {
            ChannelImpl channelImpl = (ChannelImpl) obj;
            return this.f110906a.equals(channelImpl.f110906a) && sdg.m34949a(channelImpl.f110907b, this.f110907b) && sdg.m34949a(channelImpl.f110908c, this.f110908c);
        }
    }

    public final int hashCode() {
        return this.f110906a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f110906a.toCharArray()) {
            i += c;
        }
        String trim = this.f110906a.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str = this.f110907b;
        String str2 = this.f110908c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 31 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str);
        sb2.append(", path=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
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
        see.m35046a(parcel, 2, this.f110906a, false);
        see.m35046a(parcel, 3, this.f110907b, false);
        see.m35046a(parcel, 4, this.f110908c, false);
        see.m35062b(parcel, a);
    }
}

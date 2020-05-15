package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DirectTransferConfigurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arqn();

    /* renamed from: a */
    public String f108050a;

    /* renamed from: b */
    public String f108051b;

    /* renamed from: c */
    public String f108052c;

    public DirectTransferConfigurations() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DirectTransferConfigurations) {
            DirectTransferConfigurations directTransferConfigurations = (DirectTransferConfigurations) obj;
            if (this.f108050a.equals(directTransferConfigurations.f108050a) && this.f108051b.equals(directTransferConfigurations.f108051b)) {
                String str = this.f108052c;
                if (str.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108050a, this.f108051b, this.f108052c});
    }

    public DirectTransferConfigurations(String str, String str2, String str3) {
        this.f108050a = str;
        this.f108051b = str2;
        this.f108052c = str3;
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
        see.m35046a(parcel, 1, this.f108050a, false);
        see.m35046a(parcel, 2, this.f108051b, false);
        see.m35046a(parcel, 3, this.f108052c, false);
        see.m35062b(parcel, a);
    }
}

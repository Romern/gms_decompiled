package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConsentPromptUserResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hyh();

    /* renamed from: a */
    public int f10257a;

    /* renamed from: b */
    public String f10258b;

    /* renamed from: c */
    public String f10259c;

    public ConsentPromptUserResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentPromptUserResponse) {
            ConsentPromptUserResponse consentPromptUserResponse = (ConsentPromptUserResponse) obj;
            return sdg.m34949a(Integer.valueOf(this.f10257a), Integer.valueOf(consentPromptUserResponse.f10257a)) && sdg.m34949a(this.f10258b, consentPromptUserResponse.f10258b) && sdg.m34949a(this.f10259c, consentPromptUserResponse.f10259c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10257a), this.f10258b, this.f10259c});
    }

    public ConsentPromptUserResponse(int i, String str, String str2) {
        this.f10257a = i;
        this.f10258b = str;
        this.f10259c = str2;
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
        see.m35063b(parcel, 1, this.f10257a);
        see.m35046a(parcel, 2, this.f10258b, false);
        see.m35046a(parcel, 3, this.f10259c, false);
        see.m35062b(parcel, a);
    }
}

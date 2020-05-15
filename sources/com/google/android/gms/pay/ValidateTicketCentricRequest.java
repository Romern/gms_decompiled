package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ValidateTicketCentricRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhg();

    /* renamed from: a */
    public Account f81650a;

    /* renamed from: b */
    public byte[] f81651b;

    private ValidateTicketCentricRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateTicketCentricRequest) {
            ValidateTicketCentricRequest validateTicketCentricRequest = (ValidateTicketCentricRequest) obj;
            return sdg.m34949a(this.f81650a, validateTicketCentricRequest.f81650a) && Arrays.equals(this.f81651b, validateTicketCentricRequest.f81651b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81650a, Integer.valueOf(Arrays.hashCode(this.f81651b))});
    }

    public ValidateTicketCentricRequest(Account account, byte[] bArr) {
        this.f81650a = account;
        this.f81651b = bArr;
    }

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
        see.m35040a(parcel, 1, this.f81650a, i, false);
        see.m35052a(parcel, 2, this.f81651b, false);
        see.m35062b(parcel, a);
    }
}

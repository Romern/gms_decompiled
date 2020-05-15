package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TokenizeAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyz();

    /* renamed from: a */
    public int f108562a;

    /* renamed from: b */
    public long f108563b;

    /* renamed from: c */
    public String f108564c;

    /* renamed from: d */
    public byte[] f108565d;

    public TokenizeAccountRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenizeAccountRequest) {
            TokenizeAccountRequest tokenizeAccountRequest = (TokenizeAccountRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108562a), Integer.valueOf(tokenizeAccountRequest.f108562a)) && sdg.m34949a(Long.valueOf(this.f108563b), Long.valueOf(tokenizeAccountRequest.f108563b)) && sdg.m34949a(this.f108564c, tokenizeAccountRequest.f108564c) && Arrays.equals(this.f108565d, tokenizeAccountRequest.f108565d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108562a), Long.valueOf(this.f108563b), this.f108564c, Integer.valueOf(Arrays.hashCode(this.f108565d))});
    }

    public TokenizeAccountRequest(int i, long j, String str, byte[] bArr) {
        this.f108562a = i;
        this.f108563b = j;
        this.f108564c = str;
        this.f108565d = bArr;
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
        see.m35063b(parcel, 1, this.f108562a);
        see.m35036a(parcel, 2, this.f108563b);
        see.m35046a(parcel, 3, this.f108564c, false);
        see.m35052a(parcel, 4, this.f108565d, false);
        see.m35062b(parcel, a);
    }
}

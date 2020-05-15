package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateClosedLoopBundleRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhc();

    /* renamed from: a */
    public Account f81637a;

    /* renamed from: b */
    public String f81638b;

    /* renamed from: c */
    public long f81639c;

    /* renamed from: d */
    public byte[] f81640d;

    /* renamed from: e */
    public long f81641e;

    /* renamed from: f */
    public long f81642f;

    /* renamed from: g */
    public byte[] f81643g;

    private UpdateClosedLoopBundleRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateClosedLoopBundleRequest) {
            UpdateClosedLoopBundleRequest updateClosedLoopBundleRequest = (UpdateClosedLoopBundleRequest) obj;
            return sdg.m34949a(this.f81637a, updateClosedLoopBundleRequest.f81637a) && sdg.m34949a(this.f81638b, updateClosedLoopBundleRequest.f81638b) && sdg.m34949a(Long.valueOf(this.f81639c), Long.valueOf(updateClosedLoopBundleRequest.f81639c)) && Arrays.equals(this.f81640d, updateClosedLoopBundleRequest.f81640d) && sdg.m34949a(Long.valueOf(this.f81641e), Long.valueOf(updateClosedLoopBundleRequest.f81641e)) && sdg.m34949a(Long.valueOf(this.f81642f), Long.valueOf(updateClosedLoopBundleRequest.f81642f)) && Arrays.equals(this.f81643g, updateClosedLoopBundleRequest.f81643g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81637a, this.f81638b, Long.valueOf(this.f81639c), Integer.valueOf(Arrays.hashCode(this.f81640d)), Long.valueOf(this.f81641e), Long.valueOf(this.f81642f), Integer.valueOf(Arrays.hashCode(this.f81643g))});
    }

    public UpdateClosedLoopBundleRequest(Account account, String str, long j, byte[] bArr, long j2, long j3, byte[] bArr2) {
        this.f81637a = account;
        this.f81638b = str;
        this.f81639c = j;
        this.f81640d = bArr;
        this.f81641e = j2;
        this.f81642f = j3;
        this.f81643g = bArr2;
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
        see.m35040a(parcel, 1, this.f81637a, i, false);
        see.m35046a(parcel, 2, this.f81638b, false);
        see.m35036a(parcel, 3, this.f81639c);
        see.m35052a(parcel, 4, this.f81640d, false);
        see.m35036a(parcel, 5, this.f81641e);
        see.m35036a(parcel, 6, this.f81642f);
        see.m35052a(parcel, 7, this.f81643g, false);
        see.m35062b(parcel, a);
    }
}

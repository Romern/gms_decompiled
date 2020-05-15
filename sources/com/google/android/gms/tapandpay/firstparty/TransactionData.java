package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransactionData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspc();

    /* renamed from: a */
    public long f108461a;

    /* renamed from: b */
    public long f108462b;

    /* renamed from: c */
    public String f108463c;

    /* renamed from: d */
    public int f108464d;

    /* renamed from: e */
    public List f108465e;

    /* renamed from: f */
    public int f108466f;

    /* renamed from: g */
    public boolean f108467g;

    public TransactionData(long j, long j2, String str, int i, List list, int i2, boolean z) {
        this.f108461a = j;
        this.f108462b = j2;
        this.f108463c = str;
        this.f108464d = i;
        this.f108465e = list;
        this.f108466f = i2;
        this.f108467g = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransactionData) {
            TransactionData transactionData = (TransactionData) obj;
            return sdg.m34949a(Long.valueOf(this.f108461a), Long.valueOf(transactionData.f108461a)) && sdg.m34949a(Long.valueOf(this.f108462b), Long.valueOf(transactionData.f108462b)) && sdg.m34949a(this.f108463c, transactionData.f108463c) && sdg.m34949a(Integer.valueOf(this.f108464d), Integer.valueOf(transactionData.f108464d)) && sdg.m34949a(this.f108465e, transactionData.f108465e) && sdg.m34949a(Integer.valueOf(this.f108466f), Integer.valueOf(transactionData.f108466f)) && sdg.m34949a(Boolean.valueOf(this.f108467g), Boolean.valueOf(transactionData.f108467g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f108461a), Long.valueOf(this.f108462b), this.f108463c, Integer.valueOf(this.f108464d), this.f108465e, Integer.valueOf(this.f108466f), Boolean.valueOf(this.f108467g)});
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
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f108461a);
        see.m35036a(parcel, 4, this.f108462b);
        see.m35046a(parcel, 5, this.f108463c, false);
        see.m35063b(parcel, 6, this.f108464d);
        see.m35049a(parcel, 7, this.f108465e, false);
        see.m35063b(parcel, 8, this.f108466f);
        see.m35051a(parcel, 9, this.f108467g);
        see.m35062b(parcel, a);
    }
}

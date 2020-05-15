package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SaveTicketCentricIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algb();

    /* renamed from: a */
    public ProtoSafeParcelable f81579a;

    /* renamed from: b */
    public long f81580b;

    /* renamed from: c */
    public boolean f81581c;

    /* renamed from: d */
    public int f81582d;

    /* renamed from: e */
    public ProtoSafeParcelable f81583e;

    /* renamed from: f */
    public String f81584f;

    /* renamed from: g */
    public byte[] f81585g;

    private SaveTicketCentricIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveTicketCentricIntentArgs) {
            SaveTicketCentricIntentArgs saveTicketCentricIntentArgs = (SaveTicketCentricIntentArgs) obj;
            return sdg.m34949a(this.f81579a, saveTicketCentricIntentArgs.f81579a) && sdg.m34949a(Long.valueOf(this.f81580b), Long.valueOf(saveTicketCentricIntentArgs.f81580b)) && sdg.m34949a(Boolean.valueOf(this.f81581c), Boolean.valueOf(saveTicketCentricIntentArgs.f81581c)) && sdg.m34949a(Integer.valueOf(this.f81582d), Integer.valueOf(saveTicketCentricIntentArgs.f81582d)) && sdg.m34949a(this.f81583e, saveTicketCentricIntentArgs.f81583e) && sdg.m34949a(this.f81584f, saveTicketCentricIntentArgs.f81584f) && Arrays.equals(this.f81585g, saveTicketCentricIntentArgs.f81585g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81579a, Long.valueOf(this.f81580b), Boolean.valueOf(this.f81581c), Integer.valueOf(this.f81582d), this.f81583e, this.f81584f, Integer.valueOf(Arrays.hashCode(this.f81585g))});
    }

    public SaveTicketCentricIntentArgs(ProtoSafeParcelable protoSafeParcelable, long j, boolean z, int i, ProtoSafeParcelable protoSafeParcelable2, String str, byte[] bArr) {
        this.f81579a = protoSafeParcelable;
        this.f81580b = j;
        this.f81581c = z;
        this.f81582d = i;
        this.f81583e = protoSafeParcelable2;
        this.f81584f = str;
        this.f81585g = bArr;
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
        see.m35040a(parcel, 1, this.f81579a, i, false);
        see.m35036a(parcel, 2, this.f81580b);
        see.m35051a(parcel, 3, this.f81581c);
        see.m35063b(parcel, 4, this.f81582d);
        see.m35040a(parcel, 5, this.f81583e, i, false);
        see.m35046a(parcel, 6, this.f81584f, false);
        see.m35052a(parcel, 7, this.f81585g, false);
        see.m35062b(parcel, a);
    }
}

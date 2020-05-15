package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aepu();

    /* renamed from: a */
    public final Account f79597a;

    /* renamed from: b */
    public final String f79598b;

    /* renamed from: c */
    public final String f79599c;

    public OptInRequest(aept aept) {
        this.f79597a = aept.f63613a;
        this.f79598b = aept.f63614b;
        this.f79599c = aept.f63615c;
    }

    /* renamed from: a */
    public static aept m66974a(Account account) {
        return new aept(account);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptInRequest) {
            OptInRequest optInRequest = (OptInRequest) obj;
            return this.f79597a.equals(optInRequest.f79597a) && sdg.m34949a(this.f79598b, optInRequest.f79598b) && sdg.m34949a(this.f79599c, optInRequest.f79599c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79597a, this.f79598b, this.f79599c});
    }

    public final String toString() {
        String a = aeqm.m52397a(this.f79597a);
        String str = this.f79598b;
        String str2 = this.f79599c;
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a);
        sb.append(", mTag='");
        sb.append(str);
        sb.append(", mAuditToken=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public OptInRequest(Account account, String str, String str2) {
        this.f79597a = account;
        this.f79598b = str;
        this.f79599c = str2;
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
        see.m35040a(parcel, 2, this.f79597a, i, false);
        see.m35046a(parcel, 3, this.f79598b, false);
        see.m35046a(parcel, 4, this.f79599c, false);
        see.m35062b(parcel, a);
    }
}

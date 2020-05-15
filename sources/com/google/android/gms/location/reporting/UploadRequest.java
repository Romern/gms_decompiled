package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeqh();

    /* renamed from: a */
    public final Account f79612a;

    /* renamed from: b */
    public final String f79613b;

    /* renamed from: c */
    public final long f79614c;

    /* renamed from: d */
    public final long f79615d;

    /* renamed from: e */
    public final long f79616e;

    /* renamed from: f */
    public final String f79617f;

    public UploadRequest(aeqg aeqg) {
        this.f79612a = aeqg.f63623a;
        this.f79613b = aeqg.f63624b;
        this.f79614c = aeqg.f63625c;
        this.f79615d = aeqg.f63626d;
        this.f79616e = aeqg.f63627e;
        this.f79617f = aeqg.f63628f;
    }

    /* renamed from: a */
    public static aeqg m66980a(Account account, String str, long j) {
        return new aeqg(account, str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadRequest) {
            UploadRequest uploadRequest = (UploadRequest) obj;
            return this.f79612a.equals(uploadRequest.f79612a) && this.f79613b.equals(uploadRequest.f79613b) && sdg.m34949a(Long.valueOf(this.f79614c), Long.valueOf(uploadRequest.f79614c)) && this.f79615d == uploadRequest.f79615d && this.f79616e == uploadRequest.f79616e && sdg.m34949a(this.f79617f, uploadRequest.f79617f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79612a, this.f79613b, Long.valueOf(this.f79614c), Long.valueOf(this.f79615d), Long.valueOf(this.f79616e), this.f79617f});
    }

    public final String toString() {
        String a = aeqm.m52397a(this.f79612a);
        String str = this.f79613b;
        long j = this.f79614c;
        long j2 = this.f79615d;
        long j3 = this.f79616e;
        String str2 = this.f79617f;
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 186 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a);
        sb.append(", mReason='");
        sb.append(str);
        sb.append("', mDurationMillis=");
        sb.append(j);
        sb.append(", mMovingLatencyMillis=");
        sb.append(j2);
        sb.append(", mStationaryLatencyMillis=");
        sb.append(j3);
        sb.append(", mAppSpecificKey='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    public UploadRequest(Account account, String str, long j, long j2, long j3, String str2) {
        this.f79612a = account;
        this.f79613b = str;
        this.f79614c = j;
        this.f79615d = j2;
        this.f79616e = j3;
        this.f79617f = str2;
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
        see.m35040a(parcel, 2, this.f79612a, i, false);
        see.m35046a(parcel, 3, this.f79613b, false);
        see.m35036a(parcel, 4, this.f79614c);
        see.m35036a(parcel, 5, this.f79615d);
        see.m35036a(parcel, 6, this.f79616e);
        see.m35046a(parcel, 7, this.f79617f, false);
        see.m35062b(parcel, a);
    }
}

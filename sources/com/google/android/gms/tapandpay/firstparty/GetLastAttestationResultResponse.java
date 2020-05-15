package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetLastAttestationResultResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnu();

    /* renamed from: a */
    public int f108376a;

    /* renamed from: b */
    long f108377b;

    public GetLastAttestationResultResponse(int i, long j) {
        this.f108376a = i;
        this.f108377b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetLastAttestationResultResponse) {
            GetLastAttestationResultResponse getLastAttestationResultResponse = (GetLastAttestationResultResponse) obj;
            return this.f108376a == getLastAttestationResultResponse.f108376a && this.f108377b == getLastAttestationResultResponse.f108377b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108376a), Long.valueOf(this.f108377b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("result", Integer.valueOf(this.f108376a));
        a.mo25396a("timeMillis", Long.valueOf(this.f108377b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108376a);
        see.m35036a(parcel, 2, this.f108377b);
        see.m35062b(parcel, a);
    }
}

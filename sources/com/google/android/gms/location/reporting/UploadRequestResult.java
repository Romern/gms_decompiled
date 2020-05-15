package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UploadRequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeqi();

    /* renamed from: a */
    public final int f79618a;

    /* renamed from: b */
    public final long f79619b;

    public UploadRequestResult(int i, long j) {
        this.f79618a = i;
        this.f79619b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UploadRequestResult) {
            UploadRequestResult uploadRequestResult = (UploadRequestResult) obj;
            if (this.f79619b == uploadRequestResult.f79619b && this.f79618a == uploadRequestResult.f79618a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79618a), Long.valueOf(this.f79619b)});
    }

    public final String toString() {
        int i = this.f79618a;
        long j = this.f79619b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Result{, mResultCode=");
        sb.append(i);
        sb.append(", mRequestId=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79618a);
        see.m35036a(parcel, 3, this.f79619b);
        see.m35062b(parcel, a);
    }
}

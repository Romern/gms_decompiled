package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InAppCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnz();

    /* renamed from: a */
    public int f108382a;

    /* renamed from: b */
    public int f108383b;

    public InAppCvmConfig(int i, int i2) {
        this.f108382a = i;
        this.f108383b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InAppCvmConfig) {
            InAppCvmConfig inAppCvmConfig = (InAppCvmConfig) obj;
            return this.f108382a == inAppCvmConfig.f108382a && this.f108383b == inAppCvmConfig.f108383b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108382a), Integer.valueOf(this.f108383b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("cdcvmExpirtaionInSecs", Integer.valueOf(this.f108382a));
        a.mo25396a("cdcvmTransactionLimit", Integer.valueOf(this.f108383b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f108382a);
        see.m35063b(parcel, 3, this.f108383b);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.plus.circles;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddToCircleConsentData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ansl();

    /* renamed from: a */
    public final boolean f82336a;

    /* renamed from: b */
    public final String f82337b;

    /* renamed from: c */
    public final String f82338c;

    /* renamed from: d */
    public final String f82339d;

    public AddToCircleConsentData(Parcel parcel) {
        this.f82336a = parcel.readInt() != 0;
        this.f82337b = parcel.readString();
        this.f82338c = parcel.readString();
        this.f82339d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AddToCircleConsentData) {
            AddToCircleConsentData addToCircleConsentData = (AddToCircleConsentData) obj;
            if (this.f82336a != addToCircleConsentData.f82336a || !sdg.m34949a(this.f82337b, addToCircleConsentData.f82337b) || !sdg.m34949a(this.f82338c, addToCircleConsentData.f82338c) || !sdg.m34949a(this.f82339d, addToCircleConsentData.f82339d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f82336a), this.f82337b, this.f82338c, this.f82339d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f82336a ? 1 : 0);
        parcel.writeString(this.f82337b);
        parcel.writeString(this.f82338c);
        parcel.writeString(this.f82339d);
    }

    public AddToCircleConsentData(boolean z, String str, String str2, String str3) {
        this.f82336a = z;
        this.f82337b = str;
        this.f82338c = str2;
        this.f82339d = str3;
    }
}

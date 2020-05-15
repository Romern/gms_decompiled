package com.google.android.gms.autofill.operation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserFieldTypeManager implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kza();

    /* renamed from: a */
    public final Set f11666a = new LinkedHashSet();

    /* renamed from: a */
    public final boolean mo7964a(kpb kpb) {
        return this.f11666a.contains(kpb);
    }

    /* renamed from: b */
    public final void mo7965b(kpb kpb) {
        this.f11666a.add(kpb);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.f11666a;
        kpb[] kpbArr = (kpb[]) set.toArray(new kpb[set.size()]);
        int[] iArr = new int[kpbArr.length];
        for (int i2 = 0; i2 < kpbArr.length; i2++) {
            iArr[i2] = kpbArr[i2].mo3214a();
        }
        parcel.writeIntArray(iArr);
    }
}

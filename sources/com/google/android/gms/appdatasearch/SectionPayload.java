package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SectionPayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsr();

    /* renamed from: a */
    public final SparseArray f9686a;

    public SectionPayload(SparseArray sparseArray) {
        this.f9686a = sparseArray;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        SparseArray sparseArray = this.f9686a;
        if (sparseArray != null) {
            int a2 = see.m35031a(parcel, 1);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeByteArray((byte[]) sparseArray.valueAt(i2));
            }
            see.m35062b(parcel, a2);
        }
        see.m35062b(parcel, a);
    }
}

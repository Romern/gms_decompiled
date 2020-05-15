package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataTypeResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfv();

    /* renamed from: a */
    public final Status f32348a;

    /* renamed from: b */
    public final DataType f32349b;

    public DataTypeResult(Status status, DataType dataType) {
        this.f32348a = status;
        this.f32349b = dataType;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32348a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataTypeResult)) {
                return false;
            }
            DataTypeResult dataTypeResult = (DataTypeResult) obj;
            if (!this.f32348a.equals(dataTypeResult.f32348a) || !sdg.m34949a(this.f32349b, dataTypeResult.f32349b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32348a, this.f32349b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32348a);
        a.mo25396a("dataType", this.f32349b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32348a, i, false);
        see.m35040a(parcel, 3, this.f32349b, i, false);
        see.m35062b(parcel, a);
    }
}

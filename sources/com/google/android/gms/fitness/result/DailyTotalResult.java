package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DailyTotalResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfq();

    /* renamed from: a */
    public final Status f32327a;

    /* renamed from: b */
    public final DataSet f32328b;

    public DailyTotalResult(Status status, DataSet dataSet) {
        this.f32327a = status;
        this.f32328b = dataSet;
    }

    /* renamed from: a */
    public static DailyTotalResult m23712a(Status status, DataType dataType) {
        ywq ywq = new ywq();
        ywq.f54713b = 1;
        ywq.f54712a = dataType;
        return new DailyTotalResult(DataSet.m23672a(ywq.mo30804a()).mo30800a(), status);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32327a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DailyTotalResult)) {
                return false;
            }
            DailyTotalResult dailyTotalResult = (DailyTotalResult) obj;
            if (!this.f32327a.equals(dailyTotalResult.f32327a) || !sdg.m34949a(this.f32328b, dailyTotalResult.f32328b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32327a, this.f32328b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32327a);
        a.mo25396a("dataPoint", this.f32328b);
        return a.toString();
    }

    public DailyTotalResult(DataSet dataSet, Status status) {
        this.f32327a = status;
        this.f32328b = dataSet;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32327a, i, false);
        see.m35040a(parcel, 2, this.f32328b, i, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataSourcesResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zft();

    /* renamed from: a */
    public final List f32340a;

    /* renamed from: b */
    public final Status f32341b;

    public DataSourcesResult(List list, Status status) {
        this.f32340a = Collections.unmodifiableList(list);
        this.f32341b = status;
    }

    /* renamed from: a */
    public static DataSourcesResult m23716a(Status status) {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32341b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataSourcesResult)) {
                return false;
            }
            DataSourcesResult dataSourcesResult = (DataSourcesResult) obj;
            if (!this.f32341b.equals(dataSourcesResult.f32341b) || !sdg.m34949a(this.f32340a, dataSourcesResult.f32340a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32341b, this.f32340a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32341b);
        a.mo25396a("dataSources", this.f32340a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32340a, false);
        see.m35040a(parcel, 2, this.f32341b, i, false);
        see.m35062b(parcel, a);
    }
}

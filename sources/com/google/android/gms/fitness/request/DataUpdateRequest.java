package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zeo();

    /* renamed from: a */
    public final long f32250a;

    /* renamed from: b */
    public final long f32251b;

    /* renamed from: c */
    public final DataSet f32252c;

    /* renamed from: d */
    public final zcl f32253d;

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        zcl zcl;
        this.f32250a = j;
        this.f32251b = j2;
        this.f32252c = dataSet;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32253d = zcl;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof DataUpdateRequest)) {
                return false;
            }
            DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
            if (!(this.f32250a == dataUpdateRequest.f32250a && this.f32251b == dataUpdateRequest.f32251b && sdg.m34949a(this.f32252c, dataUpdateRequest.f32252c))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32250a), Long.valueOf(this.f32251b), this.f32252c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("startTimeMillis", Long.valueOf(this.f32250a));
        a.mo25396a("endTimeMillis", Long.valueOf(this.f32251b));
        a.mo25396a("dataSet", this.f32252c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32250a);
        see.m35036a(parcel, 2, this.f32251b);
        see.m35040a(parcel, 3, this.f32252c, i, false);
        zcl zcl = this.f32253d;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        see.m35062b(parcel, a);
    }
}

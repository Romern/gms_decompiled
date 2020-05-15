package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zlw();

    /* renamed from: a */
    public final DataSource f32388a;

    /* renamed from: b */
    public final long f32389b;

    /* renamed from: c */
    public final long f32390c;

    /* renamed from: d */
    private final yxh f32391d;

    public FitnessSensorServiceRequest(DataSource dataSource, IBinder iBinder, long j, long j2) {
        yxh yxh;
        this.f32388a = dataSource;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            yxh = queryLocalInterface instanceof yxh ? (yxh) queryLocalInterface : new yxf(iBinder);
        } else {
            yxh = null;
        }
        this.f32391d = yxh;
        this.f32389b = j;
        this.f32390c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FitnessSensorServiceRequest) {
            FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) obj;
            return sdg.m34949a(this.f32388a, fitnessSensorServiceRequest.f32388a) && this.f32389b == fitnessSensorServiceRequest.f32389b && this.f32390c == fitnessSensorServiceRequest.f32390c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32388a, Long.valueOf(this.f32389b), Long.valueOf(this.f32390c)});
    }

    public final String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.f32388a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32388a, i, false);
        see.m35038a(parcel, 2, this.f32391d.asBinder());
        see.m35036a(parcel, 3, this.f32389b);
        see.m35036a(parcel, 4, this.f32390c);
        see.m35062b(parcel, a);
    }

    public FitnessSensorServiceRequest(zlv zlv) {
        this.f32388a = zlv.f55414a;
        this.f32391d = zlv.f55415b;
        this.f32389b = zlv.f55416c;
        this.f32390c = zlv.f55417d;
    }
}

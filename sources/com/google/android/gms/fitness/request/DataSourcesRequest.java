package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zej();

    /* renamed from: a */
    public final List f32235a;

    /* renamed from: b */
    public final List f32236b;

    /* renamed from: c */
    public final boolean f32237c;

    /* renamed from: d */
    public final zba f32238d;

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, zba zba) {
        List list = dataSourcesRequest.f32235a;
        List list2 = dataSourcesRequest.f32236b;
        boolean z = dataSourcesRequest.f32237c;
        this.f32235a = list;
        this.f32236b = list2;
        this.f32237c = z;
        this.f32238d = zba;
    }

    /* renamed from: a */
    public final boolean mo19017a(DataSource dataSource) {
        return this.f32235a.contains(dataSource.f32005a) && this.f32236b.contains(Integer.valueOf(dataSource.f32006b));
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataTypes", this.f32235a);
        a.mo25396a("sourceTypes", this.f32236b);
        if (this.f32237c) {
            a.mo25396a("includeDbOnlySources", "true");
        }
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32235a, false);
        see.m35049a(parcel, 2, this.f32236b, false);
        see.m35051a(parcel, 3, this.f32237c);
        zba zba = this.f32238d;
        if (zba != null) {
            iBinder = zba.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        see.m35062b(parcel, a);
    }

    public DataSourcesRequest(List list, List list2, boolean z, IBinder iBinder) {
        zba zba;
        this.f32235a = list;
        this.f32236b = list2;
        this.f32237c = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            zba = queryLocalInterface instanceof zba ? (zba) queryLocalInterface : new zay(iBinder);
        } else {
            zba = null;
        }
        this.f32238d = zba;
    }
}

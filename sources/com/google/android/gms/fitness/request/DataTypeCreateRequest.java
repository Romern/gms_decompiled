package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zek();

    /* renamed from: a */
    public final String f32239a;

    /* renamed from: b */
    public final List f32240b;

    /* renamed from: c */
    public final zbb f32241c;

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, zbb zbb) {
        String str = dataTypeCreateRequest.f32239a;
        List list = dataTypeCreateRequest.f32240b;
        this.f32239a = str;
        this.f32240b = Collections.unmodifiableList(list);
        this.f32241c = zbb;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof DataTypeCreateRequest)) {
                return false;
            }
            DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
            if (!sdg.m34949a(this.f32239a, dataTypeCreateRequest.f32239a) || !sdg.m34949a(this.f32240b, dataTypeCreateRequest.f32240b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32239a, this.f32240b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f32239a);
        a.mo25396a("fields", this.f32240b);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32239a, false);
        see.m35066c(parcel, 2, this.f32240b, false);
        zbb zbb = this.f32241c;
        if (zbb != null) {
            iBinder = zbb.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35062b(parcel, a);
    }

    public DataTypeCreateRequest(String str, List list, IBinder iBinder) {
        zbb zbb;
        this.f32239a = str;
        this.f32240b = Collections.unmodifiableList(list);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            zbb = queryLocalInterface instanceof zbb ? (zbb) queryLocalInterface : new zbb(iBinder);
        } else {
            zbb = null;
        }
        this.f32241c = zbb;
    }
}

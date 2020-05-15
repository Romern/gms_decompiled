package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zel();

    /* renamed from: a */
    public final String f32242a;

    /* renamed from: b */
    public final zbb f32243b;

    public DataTypeReadRequest(String str, IBinder iBinder) {
        zbb zbb;
        this.f32242a = str;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            zbb = queryLocalInterface instanceof zbb ? (zbb) queryLocalInterface : new zbb(iBinder);
        } else {
            zbb = null;
        }
        this.f32243b = zbb;
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof DataTypeReadRequest) && sdg.m34949a(this.f32242a, ((DataTypeReadRequest) obj).f32242a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32242a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f32242a);
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32242a, false);
        see.m35038a(parcel, 3, this.f32243b.f12819a);
        see.m35062b(parcel, a);
    }

    public DataTypeReadRequest(String str, zbb zbb) {
        this.f32242a = str;
        this.f32243b = zbb;
    }
}

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zeg();

    /* renamed from: a */
    public final DataSet f32212a;

    /* renamed from: b */
    public final zcl f32213b;

    /* renamed from: c */
    public final boolean f32214c;

    public DataInsertRequest(DataSet dataSet, IBinder iBinder, boolean z) {
        zcl zcl;
        this.f32212a = dataSet;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32213b = zcl;
        this.f32214c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof DataInsertRequest) && sdg.m34949a(this.f32212a, ((DataInsertRequest) obj).f32212a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32212a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataSet", this.f32212a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32212a, i, false);
        zcl zcl = this.f32213b;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35051a(parcel, 4, this.f32214c);
        see.m35062b(parcel, a);
    }

    public DataInsertRequest(DataSet dataSet, zcl zcl, boolean z) {
        this.f32212a = dataSet;
        this.f32213b = zcl;
        this.f32214c = z;
    }
}

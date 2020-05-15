package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zem();

    /* renamed from: a */
    public DataSource f32244a;

    /* renamed from: b */
    public DataType f32245b;

    /* renamed from: c */
    public final PendingIntent f32246c;

    /* renamed from: d */
    public final zcl f32247d;

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        zcl zcl;
        this.f32244a = dataSource;
        this.f32245b = dataType;
        this.f32246c = pendingIntent;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32247d = zcl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataUpdateListenerRegistrationRequest)) {
                return false;
            }
            DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
            if (!sdg.m34949a(this.f32244a, dataUpdateListenerRegistrationRequest.f32244a) || !sdg.m34949a(this.f32245b, dataUpdateListenerRegistrationRequest.f32245b) || !sdg.m34949a(this.f32246c, dataUpdateListenerRegistrationRequest.f32246c)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32244a, this.f32245b, this.f32246c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataSource", this.f32244a);
        a.mo25396a("dataType", this.f32245b);
        a.mo25396a("pendingIntent", this.f32246c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32244a, i, false);
        see.m35040a(parcel, 2, this.f32245b, i, false);
        see.m35040a(parcel, 3, this.f32246c, i, false);
        zcl zcl = this.f32247d;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        see.m35062b(parcel, a);
    }
}

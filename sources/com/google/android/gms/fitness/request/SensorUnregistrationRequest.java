package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfd();

    /* renamed from: a */
    public final yxh f32285a;

    /* renamed from: b */
    public final PendingIntent f32286b;

    /* renamed from: c */
    public final zcl f32287c;

    public SensorUnregistrationRequest(IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        yxh yxh;
        zcl zcl = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            yxh = queryLocalInterface instanceof yxh ? (yxh) queryLocalInterface : new yxf(iBinder);
        } else {
            yxh = null;
        }
        this.f32285a = yxh;
        this.f32286b = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof zcl) {
                zcl = (zcl) queryLocalInterface2;
            } else {
                zcl = new zcj(iBinder2);
            }
        }
        this.f32287c = zcl;
    }

    public final String toString() {
        return String.format("SensorUnregistrationRequest{%s}", this.f32285a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        yxh yxh = this.f32285a;
        IBinder iBinder2 = null;
        if (yxh != null) {
            iBinder = yxh.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35040a(parcel, 2, this.f32286b, i, false);
        zcl zcl = this.f32287c;
        if (zcl != null) {
            iBinder2 = zcl.asBinder();
        }
        see.m35038a(parcel, 3, iBinder2);
        see.m35062b(parcel, a);
    }

    public SensorUnregistrationRequest(yxh yxh, PendingIntent pendingIntent, zcl zcl) {
        this.f32285a = yxh;
        this.f32286b = pendingIntent;
        this.f32287c = zcl;
    }
}

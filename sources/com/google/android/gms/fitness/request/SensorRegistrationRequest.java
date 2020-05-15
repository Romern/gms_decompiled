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
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SensorRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfc();

    /* renamed from: a */
    public DataSource f32274a;

    /* renamed from: b */
    public DataType f32275b;

    /* renamed from: c */
    public final yxh f32276c;

    /* renamed from: d */
    public final long f32277d;

    /* renamed from: e */
    public final long f32278e;

    /* renamed from: f */
    public final PendingIntent f32279f;

    /* renamed from: g */
    public final long f32280g;

    /* renamed from: h */
    public final int f32281h;

    /* renamed from: i */
    public final long f32282i;

    /* renamed from: j */
    public final List f32283j;

    /* renamed from: k */
    public final zcl f32284k;

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, IBinder iBinder, long j, long j2, PendingIntent pendingIntent, long j3, int i, long j4, IBinder iBinder2) {
        yxh yxh;
        this.f32274a = dataSource;
        this.f32275b = dataType;
        zcl zcl = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            yxh = queryLocalInterface instanceof yxh ? (yxh) queryLocalInterface : new yxf(iBinder);
        } else {
            yxh = null;
        }
        this.f32276c = yxh;
        this.f32277d = j;
        this.f32280g = j3;
        this.f32278e = j2;
        this.f32279f = pendingIntent;
        this.f32281h = i;
        this.f32283j = Collections.emptyList();
        this.f32282i = j4;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof zcl) {
                zcl = (zcl) queryLocalInterface2;
            } else {
                zcl = new zcj(iBinder2);
            }
        }
        this.f32284k = zcl;
    }

    /* renamed from: a */
    public final DataType mo19062a() {
        DataType dataType = this.f32275b;
        if (dataType != null) {
            return dataType;
        }
        DataSource dataSource = this.f32274a;
        if (dataSource == null) {
            return null;
        }
        return dataSource.f32005a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SensorRegistrationRequest)) {
                return false;
            }
            SensorRegistrationRequest sensorRegistrationRequest = (SensorRegistrationRequest) obj;
            if (!(sdg.m34949a(this.f32274a, sensorRegistrationRequest.f32274a) && sdg.m34949a(this.f32275b, sensorRegistrationRequest.f32275b) && sdg.m34949a(this.f32276c, sensorRegistrationRequest.f32276c) && this.f32277d == sensorRegistrationRequest.f32277d && this.f32280g == sensorRegistrationRequest.f32280g && this.f32278e == sensorRegistrationRequest.f32278e && this.f32281h == sensorRegistrationRequest.f32281h)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32274a, this.f32275b, this.f32276c, Long.valueOf(this.f32277d), Long.valueOf(this.f32280g), Long.valueOf(this.f32278e), Integer.valueOf(this.f32281h)});
    }

    public final String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.f32275b, this.f32274a, Long.valueOf(this.f32277d), Long.valueOf(this.f32280g), Long.valueOf(this.f32278e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32274a, i, false);
        see.m35040a(parcel, 2, this.f32275b, i, false);
        yxh yxh = this.f32276c;
        IBinder iBinder2 = null;
        if (yxh != null) {
            iBinder = yxh.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35036a(parcel, 6, this.f32277d);
        see.m35036a(parcel, 7, this.f32278e);
        see.m35040a(parcel, 8, this.f32279f, i, false);
        see.m35036a(parcel, 9, this.f32280g);
        see.m35063b(parcel, 10, this.f32281h);
        see.m35036a(parcel, 12, this.f32282i);
        zcl zcl = this.f32284k;
        if (zcl != null) {
            iBinder2 = zcl.asBinder();
        }
        see.m35038a(parcel, 13, iBinder2);
        see.m35062b(parcel, a);
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, yxh yxh, PendingIntent pendingIntent, long j, long j2, long j3, int i, List list, long j4, zcl zcl) {
        this.f32274a = dataSource;
        this.f32275b = dataType;
        this.f32276c = yxh;
        this.f32279f = pendingIntent;
        this.f32277d = j;
        this.f32280g = j2;
        this.f32278e = j3;
        this.f32281h = i;
        this.f32283j = list;
        this.f32282i = j4;
        this.f32284k = zcl;
    }
}

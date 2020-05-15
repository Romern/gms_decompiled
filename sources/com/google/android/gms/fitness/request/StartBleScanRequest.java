package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfk();

    /* renamed from: a */
    public final List f32311a;

    /* renamed from: b */
    public final int f32312b;

    /* renamed from: c */
    public final zcl f32313c;

    /* renamed from: d */
    public final zew f32314d;

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, zcl zcl) {
        List list = startBleScanRequest.f32311a;
        zew zew = startBleScanRequest.f32314d;
        int i = startBleScanRequest.f32312b;
        this.f32311a = list;
        this.f32314d = zew;
        this.f32312b = i;
        this.f32313c = zcl;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataTypes", this.f32311a);
        a.mo25396a("timeoutSecs", Integer.valueOf(this.f32312b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, Collections.unmodifiableList(this.f32311a), false);
        zew zew = this.f32314d;
        IBinder iBinder2 = null;
        if (zew != null) {
            iBinder = zew.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35063b(parcel, 3, this.f32312b);
        zcl zcl = this.f32313c;
        if (zcl != null) {
            iBinder2 = zcl.asBinder();
        }
        see.m35038a(parcel, 4, iBinder2);
        see.m35062b(parcel, a);
    }

    public StartBleScanRequest(List list, IBinder iBinder, int i, IBinder iBinder2) {
        zew zew;
        this.f32311a = list;
        zcl zcl = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zew = queryLocalInterface instanceof zew ? (zew) queryLocalInterface : new zew(iBinder);
        } else {
            zew = null;
        }
        this.f32314d = zew;
        this.f32312b = i;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof zcl) {
                zcl = (zcl) queryLocalInterface2;
            } else {
                zcl = new zcj(iBinder2);
            }
        }
        this.f32313c = zcl;
    }
}

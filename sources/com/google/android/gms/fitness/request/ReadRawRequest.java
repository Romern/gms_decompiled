package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfa();

    /* renamed from: a */
    public final List f32269a;

    /* renamed from: b */
    public final zcf f32270b;

    public ReadRawRequest(IBinder iBinder, List list) {
        zcf zcf;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadRawCallback");
            zcf = queryLocalInterface instanceof zcf ? (zcf) queryLocalInterface : new zcf(iBinder);
        } else {
            zcf = null;
        }
        this.f32270b = zcf;
        this.f32269a = list;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("params", this.f32269a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        zcf zcf = this.f32270b;
        if (zcf != null) {
            iBinder = zcf.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35066c(parcel, 3, this.f32269a, false);
        see.m35062b(parcel, a);
    }
}

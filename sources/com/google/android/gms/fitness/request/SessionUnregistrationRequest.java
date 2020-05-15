package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfj();

    /* renamed from: a */
    public final PendingIntent f32309a;

    /* renamed from: b */
    public final zcl f32310b;

    public SessionUnregistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
        zcl zcl;
        this.f32309a = pendingIntent;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32310b = zcl;
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof SessionUnregistrationRequest) && sdg.m34949a(this.f32309a, ((SessionUnregistrationRequest) obj).f32309a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32309a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("pendingIntent", this.f32309a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32309a, i, false);
        zcl zcl = this.f32310b;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35062b(parcel, a);
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, zcl zcl) {
        this.f32309a = pendingIntent;
        this.f32310b = zcl;
    }
}

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfh();

    /* renamed from: a */
    public final Session f32304a;

    /* renamed from: b */
    public final zcl f32305b;

    public SessionStartRequest(Session session, IBinder iBinder) {
        zcl zcl;
        this.f32304a = session;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32305b = zcl;
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof SessionStartRequest) && sdg.m34949a(this.f32304a, ((SessionStartRequest) obj).f32304a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32304a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("session", this.f32304a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32304a, i, false);
        zcl zcl = this.f32305b;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35062b(parcel, a);
    }

    public SessionStartRequest(Session session, zcl zcl) {
        boolean z;
        boolean z2 = true;
        if (session.mo18972a(TimeUnit.MILLISECONDS) <= System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Cannot start a session in the future");
        sdo.m34975b(session.f32167b != 0 ? false : z2, "Cannot start a session which has already ended");
        this.f32304a = session;
        this.f32305b = zcl;
    }
}

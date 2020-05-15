package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetSyncInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zeu();

    /* renamed from: a */
    public final zcm f32259a;

    public GetSyncInfoRequest(IBinder iBinder) {
        zcm zcm;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
            zcm = queryLocalInterface instanceof zcm ? (zcm) queryLocalInterface : new zcm(iBinder);
        } else {
            zcm = null;
        }
        this.f32259a = zcm;
    }

    public final String toString() {
        return String.format(Locale.US, "GetSyncInfoRequest {%s}", this.f32259a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32259a.f12819a);
        see.m35062b(parcel, a);
    }

    public GetSyncInfoRequest(zcm zcm) {
        this.f32259a = zcm;
    }
}

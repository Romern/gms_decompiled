package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfb();

    /* renamed from: a */
    public final int f32271a;

    /* renamed from: b */
    public final List f32272b;

    /* renamed from: c */
    public final zcg f32273c;

    public ReadStatsRequest(IBinder iBinder, List list, int i) {
        zcg zcg;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
            zcg = queryLocalInterface instanceof zcg ? (zcg) queryLocalInterface : new zcg(iBinder);
        } else {
            zcg = null;
        }
        this.f32273c = zcg;
        this.f32272b = list;
        this.f32271a = i;
    }

    public final String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32273c.f12819a);
        see.m35066c(parcel, 3, this.f32272b, false);
        see.m35063b(parcel, 1000, this.f32271a);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfm();

    /* renamed from: a */
    public Subscription f32317a;

    /* renamed from: b */
    public final boolean f32318b;

    /* renamed from: c */
    public final zcl f32319c;

    public SubscribeRequest(Subscription subscription, boolean z, IBinder iBinder) {
        zcl zcl;
        this.f32317a = subscription;
        this.f32318b = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32319c = zcl;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("subscription", this.f32317a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32317a, i, false);
        see.m35051a(parcel, 2, this.f32318b);
        zcl zcl = this.f32319c;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35062b(parcel, a);
    }

    public SubscribeRequest(Subscription subscription, boolean z, zcl zcl) {
        this.f32317a = subscription;
        this.f32318b = z;
        this.f32319c = zcl;
    }
}

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aher();

    /* renamed from: a */
    final int f80433a;

    /* renamed from: b */
    public final ahdv f80434b;

    /* renamed from: c */
    public final ahdp f80435c;

    /* renamed from: d */
    public final byte f80436d;

    public StartScanRequest(int i, byte b, IBinder iBinder, IBinder iBinder2) {
        ahdv ahdv;
        this.f80433a = i;
        this.f80436d = b;
        sdo.m34959a(iBinder);
        ahdp ahdp = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            ahdv = queryLocalInterface instanceof ahdv ? (ahdv) queryLocalInterface : new ahdt(iBinder);
        } else {
            ahdv = null;
        }
        this.f80434b = ahdv;
        sdo.m34959a(iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface2 instanceof ahdp) {
                ahdp = (ahdp) queryLocalInterface2;
            } else {
                ahdp = new ahdn(iBinder2);
            }
        }
        this.f80435c = ahdp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        ahdv ahdv = this.f80434b;
        IBinder iBinder2 = null;
        if (ahdv != null) {
            iBinder = ahdv.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        ahdp ahdp = this.f80435c;
        if (ahdp != null) {
            iBinder2 = ahdp.asBinder();
        }
        see.m35038a(parcel, 2, iBinder2);
        see.m35032a(parcel, 3, this.f80436d);
        see.m35063b(parcel, 1000, this.f80433a);
        see.m35062b(parcel, a);
    }

    public StartScanRequest(ahdv ahdv, ahdp ahdp) {
        this.f80433a = 1;
        this.f80436d = 1;
        sdo.m34959a(ahdv);
        this.f80434b = ahdv;
        sdo.m34959a(ahdp);
        this.f80435c = ahdp;
    }
}

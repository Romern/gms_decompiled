package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aekn();

    /* renamed from: a */
    public int f79431a;

    /* renamed from: b */
    public LocationRequestInternal f79432b;

    /* renamed from: c */
    public aehw f79433c;

    /* renamed from: d */
    public PendingIntent f79434d;

    /* renamed from: e */
    public aeht f79435e;

    /* renamed from: f */
    public aejv f79436f;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        aehw aehw;
        aeht aeht;
        this.f79431a = i;
        this.f79432b = locationRequestInternal;
        aejv aejv = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            aehw = queryLocalInterface instanceof aehw ? (aehw) queryLocalInterface : new aehu(iBinder);
        } else {
            aehw = null;
        }
        this.f79433c = aehw;
        this.f79434d = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            aeht = queryLocalInterface2 instanceof aeht ? (aeht) queryLocalInterface2 : new aehr(iBinder2);
        } else {
            aeht = null;
        }
        this.f79435e = aeht;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof aejv) {
                aejv = (aejv) queryLocalInterface3;
            } else {
                aejv = new aejt(iBinder3);
            }
        }
        this.f79436f = aejv;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aeht, android.os.IBinder], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static LocationRequestUpdateData m66895a(aeht r8, aejv aejv) {
        return new LocationRequestUpdateData(2, null, null, null, r8, aejv != null ? aejv.asBinder() : null);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aehw, android.os.IBinder], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static LocationRequestUpdateData m66896a(aehw r8, aejv aejv) {
        return new LocationRequestUpdateData(2, null, r8, null, null, aejv != null ? aejv.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79431a);
        see.m35040a(parcel, 2, this.f79432b, i, false);
        aehw aehw = this.f79433c;
        IBinder iBinder3 = null;
        if (aehw != null) {
            iBinder = aehw.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35040a(parcel, 4, this.f79434d, i, false);
        aeht aeht = this.f79435e;
        if (aeht != null) {
            iBinder2 = aeht.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 5, iBinder2);
        aejv aejv = this.f79436f;
        if (aejv != null) {
            iBinder3 = aejv.asBinder();
        }
        see.m35038a(parcel, 6, iBinder3);
        see.m35062b(parcel, a);
    }
}

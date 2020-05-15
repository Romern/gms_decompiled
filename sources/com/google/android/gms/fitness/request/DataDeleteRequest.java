package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zef();

    /* renamed from: a */
    public final long f32202a;

    /* renamed from: b */
    public final long f32203b;

    /* renamed from: c */
    public final List f32204c;

    /* renamed from: d */
    public final List f32205d;

    /* renamed from: e */
    public final List f32206e;

    /* renamed from: f */
    public final boolean f32207f;

    /* renamed from: g */
    public final boolean f32208g;

    /* renamed from: h */
    public final zcl f32209h;

    /* renamed from: i */
    public final boolean f32210i;

    /* renamed from: j */
    public final boolean f32211j;

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, IBinder iBinder) {
        zcl zcl;
        this.f32202a = j;
        this.f32203b = j2;
        this.f32204c = Collections.unmodifiableList(list);
        this.f32205d = Collections.unmodifiableList(list2);
        this.f32206e = list3;
        this.f32207f = z;
        this.f32208g = z2;
        this.f32210i = z3;
        this.f32211j = z4;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32209h = zcl;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof DataDeleteRequest)) {
                return false;
            }
            DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) obj;
            if (!(this.f32202a == dataDeleteRequest.f32202a && this.f32203b == dataDeleteRequest.f32203b && sdg.m34949a(this.f32204c, dataDeleteRequest.f32204c) && sdg.m34949a(this.f32205d, dataDeleteRequest.f32205d) && sdg.m34949a(this.f32206e, dataDeleteRequest.f32206e) && this.f32207f == dataDeleteRequest.f32207f && this.f32208g == dataDeleteRequest.f32208g && this.f32210i == dataDeleteRequest.f32210i && this.f32211j == dataDeleteRequest.f32211j)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32202a), Long.valueOf(this.f32203b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("startTimeMillis", Long.valueOf(this.f32202a));
        a.mo25396a("endTimeMillis", Long.valueOf(this.f32203b));
        a.mo25396a("dataSources", this.f32204c);
        a.mo25396a("dateTypes", this.f32205d);
        a.mo25396a("sessions", this.f32206e);
        a.mo25396a("deleteAllData", Boolean.valueOf(this.f32207f));
        a.mo25396a("deleteAllSessions", Boolean.valueOf(this.f32208g));
        if (this.f32210i) {
            a.mo25396a("deleteByTimeRange", true);
        }
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32202a);
        see.m35036a(parcel, 2, this.f32203b);
        see.m35066c(parcel, 3, this.f32204c, false);
        see.m35066c(parcel, 4, this.f32205d, false);
        see.m35066c(parcel, 5, this.f32206e, false);
        see.m35051a(parcel, 6, this.f32207f);
        see.m35051a(parcel, 7, this.f32208g);
        zcl zcl = this.f32209h;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 8, iBinder);
        see.m35051a(parcel, 10, this.f32210i);
        see.m35051a(parcel, 11, this.f32211j);
        see.m35062b(parcel, a);
    }

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, zcl zcl) {
        this.f32202a = j;
        this.f32203b = j2;
        this.f32204c = Collections.unmodifiableList(list);
        this.f32205d = Collections.unmodifiableList(list2);
        this.f32206e = list3;
        this.f32207f = z;
        this.f32208g = z2;
        this.f32210i = z3;
        this.f32211j = z4;
        this.f32209h = zcl;
    }
}

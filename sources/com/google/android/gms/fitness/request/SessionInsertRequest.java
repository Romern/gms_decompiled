package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfe();

    /* renamed from: a */
    public final Session f32288a;

    /* renamed from: b */
    public final List f32289b;

    /* renamed from: c */
    public final List f32290c;

    /* renamed from: d */
    public final zcl f32291d;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    }

    public SessionInsertRequest(Session session, List list, List list2, IBinder iBinder) {
        zcl zcl;
        this.f32288a = session;
        this.f32289b = Collections.unmodifiableList(list);
        this.f32290c = Collections.unmodifiableList(list2);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32291d = zcl;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SessionInsertRequest)) {
                return false;
            }
            SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
            if (!sdg.m34949a(this.f32288a, sessionInsertRequest.f32288a) || !sdg.m34949a(this.f32289b, sessionInsertRequest.f32289b) || !sdg.m34949a(this.f32290c, sessionInsertRequest.f32290c)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32288a, this.f32289b, this.f32290c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("session", this.f32288a);
        a.mo25396a("dataSets", this.f32289b);
        a.mo25396a("aggregateDataPoints", this.f32290c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32288a, i, false);
        see.m35066c(parcel, 2, this.f32289b, false);
        see.m35066c(parcel, 3, this.f32290c, false);
        zcl zcl = this.f32291d;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        see.m35062b(parcel, a);
    }

    public SessionInsertRequest(Session session, List list, List list2, zcl zcl) {
        this.f32288a = session;
        this.f32289b = Collections.unmodifiableList(list);
        this.f32290c = Collections.unmodifiableList(list2);
        this.f32291d = zcl;
    }
}

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfi();

    /* renamed from: a */
    public final String f32306a;

    /* renamed from: b */
    public final String f32307b;

    /* renamed from: c */
    public final zci f32308c;

    public SessionStopRequest(String str, String str2, IBinder iBinder) {
        zci zci;
        this.f32306a = str;
        this.f32307b = str2;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            zci = queryLocalInterface instanceof zci ? (zci) queryLocalInterface : new zci(iBinder);
        } else {
            zci = null;
        }
        this.f32308c = zci;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SessionStopRequest)) {
                return false;
            }
            SessionStopRequest sessionStopRequest = (SessionStopRequest) obj;
            if (!sdg.m34949a(this.f32306a, sessionStopRequest.f32306a) || !sdg.m34949a(this.f32307b, sessionStopRequest.f32307b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32306a, this.f32307b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f32306a);
        a.mo25396a("identifier", this.f32307b);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32306a, false);
        see.m35046a(parcel, 2, this.f32307b, false);
        zci zci = this.f32308c;
        if (zci != null) {
            iBinder = zci.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35062b(parcel, a);
    }

    public SessionStopRequest(String str, String str2, zci zci) {
        this.f32306a = str;
        this.f32307b = str2;
        this.f32308c = zci;
    }
}

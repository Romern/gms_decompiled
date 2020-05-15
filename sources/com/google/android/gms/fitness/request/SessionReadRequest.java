package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zff();

    /* renamed from: a */
    public final String f32292a;

    /* renamed from: b */
    public final String f32293b;

    /* renamed from: c */
    public final long f32294c;

    /* renamed from: d */
    public final long f32295d;

    /* renamed from: e */
    public final List f32296e;

    /* renamed from: f */
    public final List f32297f;

    /* renamed from: g */
    public final boolean f32298g;

    /* renamed from: h */
    public final boolean f32299h;

    /* renamed from: i */
    public final List f32300i;

    /* renamed from: j */
    public final zch f32301j;

    public SessionReadRequest(String str, String str2, long j, long j2, List list, List list2, boolean z, boolean z2, List list3, IBinder iBinder) {
        zch zch;
        this.f32292a = str;
        this.f32293b = str2;
        this.f32294c = j;
        this.f32295d = j2;
        this.f32296e = list;
        this.f32297f = list2;
        this.f32298g = z;
        this.f32299h = z2;
        this.f32300i = list3;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
            zch = queryLocalInterface instanceof zch ? (zch) queryLocalInterface : new zch(iBinder);
        } else {
            zch = null;
        }
        this.f32301j = zch;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SessionReadRequest)) {
                return false;
            }
            SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
            if (!sdg.m34949a(this.f32292a, sessionReadRequest.f32292a) || !this.f32293b.equals(sessionReadRequest.f32293b) || this.f32294c != sessionReadRequest.f32294c || this.f32295d != sessionReadRequest.f32295d || !sdg.m34949a(this.f32296e, sessionReadRequest.f32296e) || !sdg.m34949a(this.f32297f, sessionReadRequest.f32297f) || this.f32298g != sessionReadRequest.f32298g || !this.f32300i.equals(sessionReadRequest.f32300i) || this.f32299h != sessionReadRequest.f32299h) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32292a, this.f32293b, Long.valueOf(this.f32294c), Long.valueOf(this.f32295d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("sessionName", this.f32292a);
        a.mo25396a("sessionId", this.f32293b);
        a.mo25396a("startTimeMillis", Long.valueOf(this.f32294c));
        a.mo25396a("endTimeMillis", Long.valueOf(this.f32295d));
        a.mo25396a("dataTypes", this.f32296e);
        a.mo25396a("dataSources", this.f32297f);
        a.mo25396a("sessionsFromAllApps", Boolean.valueOf(this.f32298g));
        a.mo25396a("excludedPackages", this.f32300i);
        a.mo25396a("useServer", Boolean.valueOf(this.f32299h));
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
        see.m35046a(parcel, 1, this.f32292a, false);
        see.m35046a(parcel, 2, this.f32293b, false);
        see.m35036a(parcel, 3, this.f32294c);
        see.m35036a(parcel, 4, this.f32295d);
        see.m35066c(parcel, 5, this.f32296e, false);
        see.m35066c(parcel, 6, this.f32297f, false);
        see.m35051a(parcel, 7, this.f32298g);
        see.m35051a(parcel, 8, this.f32299h);
        see.m35065b(parcel, 9, this.f32300i, false);
        zch zch = this.f32301j;
        if (zch != null) {
            iBinder = zch.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 10, iBinder);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.fitness.sessions.registration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionRegistration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zpd();

    /* renamed from: a */
    public final String f32438a;

    /* renamed from: b */
    public final String f32439b;

    /* renamed from: c */
    public final int f32440c;

    /* renamed from: d */
    public final PendingIntent f32441d;

    public SessionRegistration(String str, String str2, int i, PendingIntent pendingIntent) {
        this.f32438a = str;
        this.f32439b = str2;
        this.f32440c = i;
        this.f32441d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionRegistration) {
            SessionRegistration sessionRegistration = (SessionRegistration) obj;
            return this.f32440c == sessionRegistration.f32440c && bmxi.m108538a(this.f32438a, sessionRegistration.f32438a) && bmxi.m108538a(this.f32439b, sessionRegistration.f32439b) && bmxi.m108538a(this.f32441d, sessionRegistration.f32441d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32441d});
    }

    public final String toString() {
        return String.format("SessionRegistration{accountName=%s, packageName=%s, uid=%s, pendingIntent=%s}", this.f32438a, this.f32439b, Integer.valueOf(this.f32440c), this.f32441d);
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f32438a, false);
        see.m35046a(parcel, 2, this.f32439b, false);
        see.m35063b(parcel, 3, this.f32440c);
        see.m35040a(parcel, 4, this.f32441d, i, false);
        see.m35062b(parcel, a);
    }
}

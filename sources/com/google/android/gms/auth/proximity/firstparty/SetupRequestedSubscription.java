package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupRequestedSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new jqn();

    /* renamed from: a */
    public final PendingIntent f11183a;

    /* renamed from: b */
    public final String f11184b;

    /* renamed from: c */
    public final String f11185c;

    public SetupRequestedSubscription(PendingIntent pendingIntent, String str, String str2) {
        sdo.m34959a(pendingIntent);
        this.f11183a = pendingIntent;
        sdo.m34959a((Object) str);
        this.f11184b = str;
        sdo.m34974b(!str.isEmpty());
        sdo.m34959a((Object) str2);
        this.f11185c = str2;
        sdo.m34974b(!str2.isEmpty());
    }

    /* renamed from: a */
    public final PendingIntent mo7801a() {
        return this.f11183a;
    }

    /* renamed from: c */
    public final String mo7803c() {
        return this.f11185c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SetupRequestedSubscription setupRequestedSubscription = (SetupRequestedSubscription) obj;
            return this.f11183a.equals(setupRequestedSubscription.f11183a) && this.f11184b.equals(setupRequestedSubscription.f11184b) && this.f11185c.equals(setupRequestedSubscription.f11185c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11183a, this.f11184b, this.f11185c});
    }

    public final String toString() {
        return String.format(Locale.US, "SetupRequestedSubscription{mCallbackIntent=%s, mFeatureName=%s, mPackageName=%s}", this.f11183a, this.f11184b, this.f11185c);
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
        see.m35040a(parcel, 1, this.f11183a, i, false);
        see.m35046a(parcel, 2, this.f11184b, false);
        see.m35046a(parcel, 3, this.f11185c, false);
        see.m35062b(parcel, a);
    }
}

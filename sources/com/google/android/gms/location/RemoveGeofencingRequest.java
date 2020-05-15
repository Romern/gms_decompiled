package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeio();

    /* renamed from: a */
    public final List f79378a;

    /* renamed from: b */
    public final PendingIntent f79379b;

    /* renamed from: c */
    public final String f79380c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        this.f79378a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f79379b = pendingIntent;
        this.f79380c = str;
    }

    /* renamed from: a */
    public static RemoveGeofencingRequest m66873a(PendingIntent pendingIntent) {
        sdo.m34966a(pendingIntent, "PendingIntent can not be null.");
        return new RemoveGeofencingRequest(null, pendingIntent, "");
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
        see.m35065b(parcel, 1, this.f79378a, false);
        see.m35040a(parcel, 2, this.f79379b, i, false);
        see.m35046a(parcel, 3, this.f79380c, false);
        see.m35062b(parcel, a);
    }
}

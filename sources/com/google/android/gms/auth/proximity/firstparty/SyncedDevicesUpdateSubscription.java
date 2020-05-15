package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncedDevicesUpdateSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new jqz();

    /* renamed from: a */
    public final PendingIntent f11200a;

    /* renamed from: b */
    public final DeviceFilter f11201b;

    /* renamed from: c */
    public final String f11202c;

    /* renamed from: d */
    public final int f11203d;

    public SyncedDevicesUpdateSubscription(PendingIntent pendingIntent, DeviceFilter deviceFilter, String str, int i) {
        sdo.m34959a(pendingIntent);
        this.f11200a = pendingIntent;
        sdo.m34959a(deviceFilter);
        this.f11201b = deviceFilter;
        sdo.m34959a((Object) str);
        this.f11202c = str;
        this.f11203d = i;
    }

    /* renamed from: a */
    public static int m6812a(List list, DeviceFilter deviceFilter) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        sdo.m34959a(list);
        sdo.m34959a(deviceFilter);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) list.get(i);
                Boolean bool5 = deviceFilter.f11157a;
                if ((bool5 == null || bool5.booleanValue() == syncedCryptauthDevice.f11190e) && (((bool = deviceFilter.f11159c) == null || bool.booleanValue() == syncedCryptauthDevice.f11193h) && (((bool2 = deviceFilter.f11158b) == null || bool2.booleanValue() == syncedCryptauthDevice.f11191f) && ((deviceFilter.f11160d.isEmpty() || deviceFilter.f11160d.contains(syncedCryptauthDevice.f11194i)) && (((bool3 = deviceFilter.f11161e) == null || bool3.booleanValue() == syncedCryptauthDevice.f11195j) && (((bool4 = deviceFilter.f11162f) == null || bool4.booleanValue() == syncedCryptauthDevice.f11196k) && syncedCryptauthDevice.f11197l.containsAll(deviceFilter.f11163g) && syncedCryptauthDevice.f11198m.containsAll(deviceFilter.f11164h))))))) {
                    arrayList.add(Base64.encodeToString(syncedCryptauthDevice.f11186a, 8));
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                return arrayList.hashCode();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final PendingIntent mo7801a() {
        return this.f11200a;
    }

    /* renamed from: c */
    public final String mo7803c() {
        return this.f11202c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription = (SyncedDevicesUpdateSubscription) obj;
            return this.f11200a.equals(syncedDevicesUpdateSubscription.f11200a) && this.f11201b.equals(syncedDevicesUpdateSubscription.f11201b) && this.f11202c.equals(syncedDevicesUpdateSubscription.f11202c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11200a, this.f11201b, this.f11202c});
    }

    public final String toString() {
        return String.format("SyncedDevicesUpdateSubscription{mCallbackIntent=%s, mDeviceFilter=%s, mPackageName='%s', mLastMatchToken=%d}", this.f11200a, this.f11201b, this.f11202c, Integer.valueOf(this.f11203d));
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
        see.m35040a(parcel, 1, this.f11200a, i, false);
        see.m35040a(parcel, 2, this.f11201b, i, false);
        see.m35046a(parcel, 3, this.f11202c, false);
        see.m35063b(parcel, 4, this.f11203d);
        see.m35062b(parcel, a);
    }
}

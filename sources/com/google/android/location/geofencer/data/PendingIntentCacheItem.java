package com.google.android.location.geofencer.data;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PendingIntentCacheItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bfwq();

    /* renamed from: a */
    public final PendingIntent f150774a;

    /* renamed from: b */
    public final String f150775b;

    /* renamed from: c */
    public final List f150776c;

    /* renamed from: d */
    public final String f150777d;

    public PendingIntentCacheItem(PendingIntent pendingIntent, String str, List list, String str2) {
        this.f150774a = pendingIntent;
        this.f150775b = str;
        this.f150776c = list;
        this.f150777d = str2;
    }

    /* renamed from: a */
    public final int mo70871a() {
        List list = this.f150776c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int hashCode() {
        return ((((this.f150774a.hashCode() + 31) * 31) + this.f150775b.hashCode()) * 31) + this.f150777d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PendingIntentCacheItem [mPendingIntent=");
        sb.append(this.f150774a);
        sb.append(", mExternalKey=");
        sb.append(this.f150775b);
        sb.append(", mTag=");
        sb.append(this.f150777d);
        sb.append(", mAssociatedGeofenceIds=[");
        List list = this.f150776c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) list.get(i)).replaceAll("\\p{C}", "?"));
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]]");
        return sb.toString();
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
        see.m35040a(parcel, 1, this.f150774a, i, false);
        see.m35046a(parcel, 2, this.f150775b, false);
        see.m35065b(parcel, 3, Collections.unmodifiableList(this.f150776c), false);
        see.m35046a(parcel, 4, this.f150777d, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aejd();

    /* renamed from: a */
    public static final List f79408a = Collections.emptyList();

    /* renamed from: b */
    public static final DeviceOrientationRequest f79409b = new DeviceOrientationRequest();

    /* renamed from: c */
    public DeviceOrientationRequest f79410c;

    /* renamed from: d */
    public List f79411d;

    /* renamed from: e */
    public String f79412e;

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.f79410c = deviceOrientationRequest;
        this.f79411d = list;
        this.f79412e = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceOrientationRequestInternal) {
            DeviceOrientationRequestInternal deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) obj;
            if (!sdg.m34949a(this.f79410c, deviceOrientationRequestInternal.f79410c) || !sdg.m34949a(this.f79411d, deviceOrientationRequestInternal.f79411d) || !sdg.m34949a(this.f79412e, deviceOrientationRequestInternal.f79412e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79410c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79410c);
        String valueOf2 = String.valueOf(this.f79411d);
        String str = this.f79412e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
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
        see.m35040a(parcel, 1, this.f79410c, i, false);
        see.m35066c(parcel, 2, this.f79411d, false);
        see.m35046a(parcel, 3, this.f79412e, false);
        see.m35062b(parcel, a);
    }
}

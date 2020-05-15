package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfb();

    /* renamed from: a */
    public static final ConnectionResult f30063a = new ConnectionResult(0);

    /* renamed from: b */
    final int f30064b;

    /* renamed from: c */
    public final int f30065c;

    /* renamed from: d */
    public final PendingIntent f30066d;

    /* renamed from: e */
    public final String f30067e;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    /* renamed from: a */
    public static String m22453a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: a */
    public final boolean mo17670a() {
        return (this.f30065c == 0 || this.f30066d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo17671b() {
        return this.f30065c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.f30065c == connectionResult.f30065c && sdg.m34949a(this.f30066d, connectionResult.f30066d) && sdg.m34949a(this.f30067e, connectionResult.f30067e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30065c), this.f30066d, this.f30067e});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("statusCode", m22453a(this.f30065c));
        a.mo25396a("resolution", this.f30066d);
        a.mo25396a("message", this.f30067e);
        return a.toString();
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f30064b = i;
        this.f30065c = i2;
        this.f30066d = pendingIntent;
        this.f30067e = str;
    }

    /* renamed from: a */
    public final void mo17669a(Activity activity, int i) {
        if (mo17670a()) {
            activity.startIntentSenderForResult(this.f30066d.getIntentSender(), i, null, 0, 0, 0);
        }
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
        see.m35063b(parcel, 1, this.f30064b);
        see.m35063b(parcel, 2, this.f30065c);
        see.m35040a(parcel, 3, this.f30066d, i, false);
        see.m35046a(parcel, 4, this.f30067e, false);
        see.m35062b(parcel, a);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}

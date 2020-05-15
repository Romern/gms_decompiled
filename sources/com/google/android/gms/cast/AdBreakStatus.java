package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdBreakStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pef();

    /* renamed from: f */
    private static final ptx f29700f = new ptx("AdBreakStatus");

    /* renamed from: a */
    public final long f29701a;

    /* renamed from: b */
    public final long f29702b;

    /* renamed from: c */
    public final String f29703c;

    /* renamed from: d */
    public final String f29704d;

    /* renamed from: e */
    public final long f29705e;

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.f29701a = j;
        this.f29702b = j2;
        this.f29703c = str;
        this.f29704d = str2;
        this.f29705e = j3;
    }

    /* renamed from: a */
    static AdBreakStatus m22253a(JSONObject jSONObject) {
        long j;
        if (jSONObject == null || !jSONObject.has("currentBreakTime") || !jSONObject.has("currentBreakClipTime")) {
            return null;
        }
        try {
            long a = ptk.m31228a((double) jSONObject.getLong("currentBreakTime"));
            long a2 = ptk.m31228a((double) jSONObject.getLong("currentBreakClipTime"));
            String optString = jSONObject.optString("breakId", null);
            String optString2 = jSONObject.optString("breakClipId", null);
            long optLong = jSONObject.optLong("whenSkippable", -1);
            if (optLong != -1) {
                j = ptk.m31228a((double) optLong);
            } else {
                j = optLong;
            }
            return new AdBreakStatus(a, a2, optString, optString2, j);
        } catch (JSONException e) {
            f29700f.mo23676c(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdBreakStatus) {
            AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
            return this.f29701a == adBreakStatus.f29701a && this.f29702b == adBreakStatus.f29702b && ptk.m31236a(this.f29703c, adBreakStatus.f29703c) && ptk.m31236a(this.f29704d, adBreakStatus.f29704d) && this.f29705e == adBreakStatus.f29705e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29701a), Long.valueOf(this.f29702b), this.f29703c, this.f29704d, Long.valueOf(this.f29705e)});
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
        see.m35036a(parcel, 2, this.f29701a);
        see.m35036a(parcel, 3, this.f29702b);
        see.m35046a(parcel, 4, this.f29703c, false);
        see.m35046a(parcel, 5, this.f29704d, false);
        see.m35036a(parcel, 6, this.f29705e);
        see.m35062b(parcel, a);
    }
}

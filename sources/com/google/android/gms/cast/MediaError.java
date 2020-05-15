package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new pfz();

    /* renamed from: a */
    public final long f29741a;

    /* renamed from: b */
    public final Integer f29742b;

    /* renamed from: c */
    public final String f29743c;

    /* renamed from: d */
    String f29744d;

    /* renamed from: e */
    private final JSONObject f29745e;

    public MediaError(long j, Integer num, String str, JSONObject jSONObject) {
        this.f29741a = j;
        this.f29742b = num;
        this.f29743c = str;
        this.f29745e = jSONObject;
    }

    /* renamed from: a */
    public static MediaError m22269a(JSONObject jSONObject) {
        Integer num;
        String str;
        JSONObject jSONObject2;
        long optLong = jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        if (jSONObject.has("reason")) {
            str = jSONObject.optString("reason");
        } else {
            str = null;
        }
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        } else {
            jSONObject2 = null;
        }
        return new MediaError(optLong, num, str, jSONObject2);
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
        String str;
        JSONObject jSONObject = this.f29745e;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        this.f29744d = str;
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f29741a);
        see.m35044a(parcel, 3, this.f29742b);
        see.m35046a(parcel, 4, this.f29743c, false);
        see.m35046a(parcel, 5, this.f29744d, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new pgq();

    /* renamed from: a */
    public long f29832a;

    /* renamed from: b */
    public int f29833b;

    /* renamed from: c */
    public String f29834c;

    /* renamed from: d */
    public String f29835d;

    /* renamed from: e */
    public String f29836e;

    /* renamed from: f */
    public String f29837f;

    /* renamed from: g */
    public int f29838g;

    /* renamed from: h */
    String f29839h;

    /* renamed from: i */
    public JSONObject f29840i;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f29832a = j;
        this.f29833b = i;
        this.f29834c = str;
        this.f29835d = str2;
        this.f29836e = str3;
        this.f29837f = str4;
        this.f29838g = i2;
        this.f29839h = str5;
        if (str5 != null) {
            try {
                this.f29840i = new JSONObject(str5);
            } catch (JSONException e) {
                this.f29840i = null;
                this.f29839h = null;
            }
        } else {
            this.f29840i = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaTrack) {
            MediaTrack mediaTrack = (MediaTrack) obj;
            JSONObject jSONObject = this.f29840i;
            if (jSONObject != null) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject2 = mediaTrack.f29840i;
            if (jSONObject2 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return (jSONObject == null || jSONObject2 == null || ssd.m36200a(jSONObject, jSONObject2)) && this.f29832a == mediaTrack.f29832a && this.f29833b == mediaTrack.f29833b && ptk.m31236a(this.f29834c, mediaTrack.f29834c) && ptk.m31236a(this.f29835d, mediaTrack.f29835d) && ptk.m31236a(this.f29836e, mediaTrack.f29836e) && ptk.m31236a(this.f29837f, mediaTrack.f29837f) && this.f29838g == mediaTrack.f29838g;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29832a), Integer.valueOf(this.f29833b), this.f29834c, this.f29835d, this.f29836e, this.f29837f, Integer.valueOf(this.f29838g), String.valueOf(this.f29840i)});
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
        JSONObject jSONObject = this.f29840i;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        this.f29839h = str;
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f29832a);
        see.m35063b(parcel, 3, this.f29833b);
        see.m35046a(parcel, 4, this.f29834c, false);
        see.m35046a(parcel, 5, this.f29835d, false);
        see.m35046a(parcel, 6, this.f29836e, false);
        see.m35046a(parcel, 7, this.f29837f, false);
        see.m35063b(parcel, 8, this.f29838g);
        see.m35046a(parcel, 9, this.f29839h, false);
        see.m35062b(parcel, a);
    }

    public MediaTrack(JSONObject jSONObject) {
        this(0, 0, null, null, null, null, -1, null);
        int i;
        this.f29832a = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.f29833b = 1;
        } else if ("AUDIO".equals(string)) {
            this.f29833b = 2;
        } else if (!"VIDEO".equals(string)) {
            String valueOf = String.valueOf(string);
            throw new JSONException(valueOf.length() == 0 ? new String("invalid type: ") : "invalid type: ".concat(valueOf));
        } else {
            this.f29833b = 3;
        }
        this.f29834c = jSONObject.optString("trackContentId", null);
        this.f29835d = jSONObject.optString("trackContentType", null);
        this.f29836e = jSONObject.optString("name", null);
        this.f29837f = jSONObject.optString("language", null);
        if (jSONObject.has("subtype")) {
            String string2 = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string2)) {
                this.f29838g = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.f29838g = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.f29838g = 3;
            } else if ("CHAPTERS".equals(string2)) {
                i = 4;
            } else if ("METADATA".equals(string2)) {
                this.f29838g = 5;
            } else {
                i = -1;
            }
            this.f29840i = jSONObject.optJSONObject("customData");
        }
        i = 0;
        this.f29838g = i;
        this.f29840i = jSONObject.optJSONObject("customData");
    }
}

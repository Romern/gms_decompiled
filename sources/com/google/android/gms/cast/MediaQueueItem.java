package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgm();

    /* renamed from: a */
    public MediaInfo f29800a;

    /* renamed from: b */
    public int f29801b;

    /* renamed from: c */
    public boolean f29802c;

    /* renamed from: d */
    public double f29803d;

    /* renamed from: e */
    public double f29804e;

    /* renamed from: f */
    public double f29805f;

    /* renamed from: g */
    public long[] f29806g;

    /* renamed from: h */
    String f29807h;

    /* renamed from: i */
    public JSONObject f29808i;

    public MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f29800a = mediaInfo;
        this.f29801b = i;
        this.f29802c = z;
        this.f29803d = d;
        this.f29804e = d2;
        this.f29805f = d3;
        this.f29806g = jArr;
        this.f29807h = str;
        if (str != null) {
            try {
                this.f29808i = new JSONObject(str);
            } catch (JSONException e) {
                this.f29808i = null;
                this.f29807h = null;
            }
        } else {
            this.f29808i = null;
        }
    }

    /* renamed from: a */
    public final boolean mo17556a(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f29800a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f29801b != (i = jSONObject.getInt("itemId"))) {
            this.f29801b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f29802c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f29802c = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f29803d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f29803d) > 1.0E-7d)) {
            this.f29803d = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f29804e) > 1.0E-7d) {
                this.f29804e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f29805f) > 1.0E-7d) {
                this.f29805f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f29806g;
            if (jArr2 != null) {
                if (jArr2.length == length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (this.f29806g[i3] != jArr[i3]) {
                                z3 = true;
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                } else {
                    z3 = true;
                }
            } else {
                z3 = true;
            }
        } else {
            jArr = null;
        }
        if (z3) {
            this.f29806g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f29808i = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaQueueItem) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
            JSONObject jSONObject = this.f29808i;
            if (jSONObject != null) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject2 = mediaQueueItem.f29808i;
            if (jSONObject2 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return (jSONObject == null || jSONObject2 == null || ssd.m36200a(jSONObject, jSONObject2)) && ptk.m31236a(this.f29800a, mediaQueueItem.f29800a) && this.f29801b == mediaQueueItem.f29801b && this.f29802c == mediaQueueItem.f29802c && ((Double.isNaN(this.f29803d) && Double.isNaN(mediaQueueItem.f29803d)) || this.f29803d == mediaQueueItem.f29803d) && this.f29804e == mediaQueueItem.f29804e && this.f29805f == mediaQueueItem.f29805f && Arrays.equals(this.f29806g, mediaQueueItem.f29806g);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29800a, Integer.valueOf(this.f29801b), Boolean.valueOf(this.f29802c), Double.valueOf(this.f29803d), Double.valueOf(this.f29804e), Double.valueOf(this.f29805f), Integer.valueOf(Arrays.hashCode(this.f29806g)), String.valueOf(this.f29808i)});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, long[], boolean):void
     arg types: [android.os.Parcel, int, long[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void */
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
        JSONObject jSONObject = this.f29808i;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        this.f29807h = str;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f29800a, i, false);
        see.m35063b(parcel, 3, this.f29801b);
        see.m35051a(parcel, 4, this.f29802c);
        see.m35033a(parcel, 5, this.f29803d);
        see.m35033a(parcel, 6, this.f29804e);
        see.m35033a(parcel, 7, this.f29805f);
        see.m35056a(parcel, 8, this.f29806g, false);
        see.m35046a(parcel, 9, this.f29807h, false);
        see.m35062b(parcel, a);
    }

    public MediaQueueItem(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        mo17556a(jSONObject);
    }
}

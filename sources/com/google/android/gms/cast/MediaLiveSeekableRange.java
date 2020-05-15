package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgc();

    /* renamed from: e */
    private static final ptx f29762e = new ptx("MediaLiveSeekableRange");

    /* renamed from: a */
    public final long f29763a;

    /* renamed from: b */
    public final long f29764b;

    /* renamed from: c */
    public final boolean f29765c;

    /* renamed from: d */
    public final boolean f29766d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.f29763a = Math.max(j, 0L);
        this.f29764b = Math.max(j2, 0L);
        this.f29765c = z;
        this.f29766d = z2;
    }

    /* renamed from: a */
    static MediaLiveSeekableRange m22272a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("start") || !jSONObject.has("end")) {
            return null;
        }
        try {
            double d = jSONObject.getDouble("start");
            double d2 = jSONObject.getDouble("end");
            return new MediaLiveSeekableRange(ptk.m31228a(d), ptk.m31228a(d2), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
        } catch (JSONException e) {
            ptx ptx = f29762e;
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
            sb.append(valueOf);
            ptx.mo23677d(sb.toString(), new Object[0]);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaLiveSeekableRange) {
            MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
            return this.f29763a == mediaLiveSeekableRange.f29763a && this.f29764b == mediaLiveSeekableRange.f29764b && this.f29765c == mediaLiveSeekableRange.f29765c && this.f29766d == mediaLiveSeekableRange.f29766d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29763a), Long.valueOf(this.f29764b), Boolean.valueOf(this.f29765c), Boolean.valueOf(this.f29766d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f29763a);
        see.m35036a(parcel, 3, this.f29764b);
        see.m35051a(parcel, 4, this.f29765c);
        see.m35051a(parcel, 5, this.f29766d);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgt();

    /* renamed from: a */
    public float f29845a;

    /* renamed from: b */
    public int f29846b;

    /* renamed from: c */
    public int f29847c;

    /* renamed from: d */
    public int f29848d;

    /* renamed from: e */
    public int f29849e;

    /* renamed from: f */
    public int f29850f;

    /* renamed from: g */
    public int f29851g;

    /* renamed from: h */
    public int f29852h;

    /* renamed from: i */
    public String f29853i;

    /* renamed from: j */
    public int f29854j;

    /* renamed from: k */
    public int f29855k;

    /* renamed from: l */
    String f29856l;

    /* renamed from: m */
    public JSONObject f29857m;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    /* renamed from: a */
    public static final int m22289a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextTrackStyle) {
            TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
            JSONObject jSONObject = this.f29857m;
            if (jSONObject != null) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject2 = textTrackStyle.f29857m;
            if (jSONObject2 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return (jSONObject == null || jSONObject2 == null || ssd.m36200a(jSONObject, jSONObject2)) && this.f29845a == textTrackStyle.f29845a && this.f29846b == textTrackStyle.f29846b && this.f29847c == textTrackStyle.f29847c && this.f29848d == textTrackStyle.f29848d && this.f29849e == textTrackStyle.f29849e && this.f29850f == textTrackStyle.f29850f && this.f29852h == textTrackStyle.f29852h && ptk.m31236a(this.f29853i, textTrackStyle.f29853i) && this.f29854j == textTrackStyle.f29854j && this.f29855k == textTrackStyle.f29855k;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29845a), Integer.valueOf(this.f29846b), Integer.valueOf(this.f29847c), Integer.valueOf(this.f29848d), Integer.valueOf(this.f29849e), Integer.valueOf(this.f29850f), Integer.valueOf(this.f29851g), Integer.valueOf(this.f29852h), this.f29853i, Integer.valueOf(this.f29854j), Integer.valueOf(this.f29855k), String.valueOf(this.f29857m)});
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
        JSONObject jSONObject = this.f29857m;
        this.f29856l = jSONObject != null ? jSONObject.toString() : null;
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 2, this.f29845a);
        see.m35063b(parcel, 3, this.f29846b);
        see.m35063b(parcel, 4, this.f29847c);
        see.m35063b(parcel, 5, this.f29848d);
        see.m35063b(parcel, 6, this.f29849e);
        see.m35063b(parcel, 7, this.f29850f);
        see.m35063b(parcel, 8, this.f29851g);
        see.m35063b(parcel, 9, this.f29852h);
        see.m35046a(parcel, 10, this.f29853i, false);
        see.m35063b(parcel, 11, this.f29854j);
        see.m35063b(parcel, 12, this.f29855k);
        see.m35046a(parcel, 13, this.f29856l, false);
        see.m35062b(parcel, a);
    }

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f29845a = f;
        this.f29846b = i;
        this.f29847c = i2;
        this.f29848d = i3;
        this.f29849e = i4;
        this.f29850f = i5;
        this.f29851g = i6;
        this.f29852h = i7;
        this.f29853i = str;
        this.f29854j = i8;
        this.f29855k = i9;
        this.f29856l = str2;
        if (str2 != null) {
            try {
                this.f29857m = new JSONObject(str2);
            } catch (JSONException e) {
                this.f29857m = null;
                this.f29856l = null;
            }
        } else {
            this.f29857m = null;
        }
    }

    /* renamed from: a */
    public static final String m22290a(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }
}

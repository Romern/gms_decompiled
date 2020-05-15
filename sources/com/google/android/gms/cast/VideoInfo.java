package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VideoInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgv();

    /* renamed from: d */
    private static final ptx f29860d = new ptx("VideoInfo");

    /* renamed from: a */
    public int f29861a;

    /* renamed from: b */
    public int f29862b;

    /* renamed from: c */
    public int f29863c;

    public VideoInfo(int i, int i2, int i3) {
        this.f29861a = i;
        this.f29862b = i2;
        this.f29863c = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ JSONException -> 0x007b }] */
    /* renamed from: a */
    static VideoInfo m22293a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            int hashCode = string.hashCode();
            int i = 3;
            char c = 65535;
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405 && string.equals("hdr10")) {
                            c = 1;
                            if (c != 0) {
                                if (c == 1) {
                                    i = 2;
                                } else if (c == 2) {
                                    i = 4;
                                } else if (c != 3) {
                                    f29860d.mo23670a("Unknown HDR type: %s", string);
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                            }
                            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                        }
                    } else if (string.equals("sdr")) {
                        c = 3;
                        if (c != 0) {
                        }
                        return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                    }
                } else if (string.equals("hdr")) {
                    c = 2;
                    if (c != 0) {
                    }
                    return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                }
            } else if (string.equals("dv")) {
                c = 0;
                if (c != 0) {
                }
                return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            }
            if (c != 0) {
            }
            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            f29860d.mo23670a("Error while creating a VideoInfo instance from JSON: %s", e.getMessage());
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoInfo) {
            VideoInfo videoInfo = (VideoInfo) obj;
            return this.f29862b == videoInfo.f29862b && this.f29861a == videoInfo.f29861a && this.f29863c == videoInfo.f29863c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29862b), Integer.valueOf(this.f29861a), Integer.valueOf(this.f29863c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f29861a);
        see.m35063b(parcel, 3, this.f29862b);
        see.m35063b(parcel, 4, this.f29863c);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pey();

    /* renamed from: a */
    public final float f29731a;

    /* renamed from: b */
    public final float f29732b;

    /* renamed from: c */
    public final float f29733c;

    public EqualizerBandSettings(float f, float f2, float f3) {
        this.f29731a = f;
        this.f29732b = f2;
        this.f29733c = f3;
    }

    /* renamed from: a */
    public static EqualizerBandSettings m22265a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gain_db")) {
            try {
                return new EqualizerBandSettings(BigDecimal.valueOf(jSONObject.optDouble("frequency", -1.0d)).floatValue(), BigDecimal.valueOf(jSONObject.optDouble("quality", -1.0d)).floatValue(), BigDecimal.valueOf(jSONObject.getDouble("gain_db")).floatValue());
            } catch (JSONException e) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EqualizerBandSettings) {
            EqualizerBandSettings equalizerBandSettings = (EqualizerBandSettings) obj;
            return this.f29731a == equalizerBandSettings.f29731a && this.f29732b == equalizerBandSettings.f29732b && this.f29733c == equalizerBandSettings.f29733c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29731a), Float.valueOf(this.f29732b), Float.valueOf(this.f29733c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 2, this.f29731a);
        see.m35034a(parcel, 3, this.f29732b);
        see.m35034a(parcel, 4, this.f29733c);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final JSONObject mo17508a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gain_db", (double) this.f29733c);
            float f = this.f29731a;
            if (f != -1.0f) {
                jSONObject.put("frequency", (double) f);
            }
            float f2 = this.f29732b;
            if (f2 != -1.0f) {
                jSONObject.put("quality", (double) f2);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}

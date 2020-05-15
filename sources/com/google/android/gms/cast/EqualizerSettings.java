package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pez();

    /* renamed from: a */
    public final EqualizerBandSettings f29734a;

    /* renamed from: b */
    public final EqualizerBandSettings f29735b;

    public EqualizerSettings(EqualizerBandSettings equalizerBandSettings, EqualizerBandSettings equalizerBandSettings2) {
        this.f29734a = equalizerBandSettings;
        this.f29735b = equalizerBandSettings2;
    }

    /* renamed from: a */
    public final JSONObject mo17512a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("low_shelf", this.f29734a.mo17508a());
            jSONObject.put("high_shelf", this.f29735b.mo17508a());
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EqualizerSettings) {
            EqualizerSettings equalizerSettings = (EqualizerSettings) obj;
            return ptk.m31236a(this.f29734a, equalizerSettings.f29734a) && ptk.m31236a(this.f29735b, equalizerSettings.f29735b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29734a, this.f29735b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f29734a, i, false);
        see.m35040a(parcel, 3, this.f29735b, i, false);
        see.m35062b(parcel, a);
    }
}

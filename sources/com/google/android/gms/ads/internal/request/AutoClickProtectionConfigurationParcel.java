package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoClickProtectionConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0542c();

    /* renamed from: a */
    public final boolean f8687a;

    /* renamed from: b */
    public final List f8688b;

    public AutoClickProtectionConfigurationParcel() {
        this(false, Collections.emptyList());
    }

    /* renamed from: a */
    public static AutoClickProtectionConfigurationParcel m5532a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new AutoClickProtectionConfigurationParcel();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    C0633h.m5673d("Error grabbing url from json.", e);
                }
            }
        }
        return new AutoClickProtectionConfigurationParcel(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public AutoClickProtectionConfigurationParcel(boolean z, List list) {
        this.f8687a = z;
        this.f8688b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f8687a);
        see.m35065b(parcel, 3, this.f8688b, false);
        see.m35062b(parcel, a);
    }
}

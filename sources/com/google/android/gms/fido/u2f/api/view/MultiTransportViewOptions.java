package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MultiTransportViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yap();

    /* renamed from: a */
    public final int f31965a;

    /* renamed from: b */
    public final List f31966b;

    public MultiTransportViewOptions(int i, List list) {
        this.f31965a = i;
        sdo.m34959a(list);
        this.f31966b = list;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Transport transport : this.f31966b) {
                jSONArray.put(transport.f31675g);
            }
            a.put("transports", jSONArray);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18854b() {
        return null;
    }

    /* renamed from: c */
    public final yav mo18855c() {
        return yav.MULTI_TRANSPORT;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return mo18664a();
    }

    /* renamed from: e */
    public final int mo18868e() {
        return this.f31965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiTransportViewOptions) {
            MultiTransportViewOptions multiTransportViewOptions = (MultiTransportViewOptions) obj;
            return this.f31966b.containsAll(multiTransportViewOptions.f31966b) && multiTransportViewOptions.f31966b.containsAll(this.f31966b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31966b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f31965a);
        see.m35048a(parcel, 2, new ArrayList(this.f31966b));
        see.m35062b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiTransportViewOptions(Collection collection) {
        this(1, collection != null ? new ArrayList(collection) : new ArrayList());
    }
}

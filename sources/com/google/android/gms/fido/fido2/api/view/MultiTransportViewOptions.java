package com.google.android.gms.fido.fido2.api.view;

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
    public static final Parcelable.Creator CREATOR = new xrp();

    /* renamed from: a */
    public final int f31832a;

    /* renamed from: b */
    private final List f31833b;

    public MultiTransportViewOptions(int i, List list) {
        this.f31832a = i;
        sdo.m34959a(list);
        this.f31833b = list;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Transport transport : this.f31833b) {
                jSONArray.put(transport.f31675g);
            }
            a.put("transports", jSONArray);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return null;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.MULTI_TRANSPORT;
    }

    /* renamed from: d */
    public final int mo18776d() {
        return this.f31832a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MultiTransportViewOptions) {
            MultiTransportViewOptions multiTransportViewOptions = (MultiTransportViewOptions) obj;
            if (!this.f31833b.containsAll(multiTransportViewOptions.f31833b) || !multiTransportViewOptions.f31833b.containsAll(this.f31833b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31833b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f31832a);
        see.m35048a(parcel, 2, new ArrayList(this.f31833b));
        see.m35062b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiTransportViewOptions(Collection collection) {
        this(1, collection != null ? new ArrayList(collection) : new ArrayList());
    }
}

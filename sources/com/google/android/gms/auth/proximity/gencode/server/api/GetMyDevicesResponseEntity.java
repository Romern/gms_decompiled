package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetMyDevicesResponseEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new jrr();

    /* renamed from: c */
    private static final HashMap f11238c;

    /* renamed from: a */
    final Set f11239a;

    /* renamed from: b */
    public List f11240b;

    static {
        HashMap hashMap = new HashMap();
        f11238c = hashMap;
        hashMap.put("devices", FastJsonResponse$Field.m22657b("devices", 2, ExternalDeviceInfoEntity.class));
    }

    public GetMyDevicesResponseEntity() {
        this.f11239a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f11238c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f11240b;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetMyDevicesResponseEntity)) {
            return false;
        }
        if (this != obj) {
            GetMyDevicesResponseEntity getMyDevicesResponseEntity = (GetMyDevicesResponseEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f11238c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!getMyDevicesResponseEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(getMyDevicesResponseEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (getMyDevicesResponseEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f11238c.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public GetMyDevicesResponseEntity(Set set, List list) {
        this.f11239a = set;
        this.f11240b = list;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f11240b = arrayList;
            this.f11239a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        if (this.f11239a.contains(2)) {
            see.m35066c(parcel, 2, this.f11240b, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f11239a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

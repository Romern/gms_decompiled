package com.google.android.gms.plus.service.v1whitelisted.models;

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
public final class ClientLoggedRhsComponentEntity extends FastSafeParcelableJsonResponse implements aogi {
    public static final Parcelable.Creator CREATOR = new aogj();

    /* renamed from: d */
    private static final HashMap f82878d;

    /* renamed from: a */
    final Set f82879a;

    /* renamed from: b */
    final int f82880b;

    /* renamed from: c */
    List f82881c;

    static {
        HashMap hashMap = new HashMap();
        f82878d = hashMap;
        hashMap.put("item", FastJsonResponse$Field.m22657b("item", 5, ClientLoggedRhsComponentItemEntity.class));
    }

    public ClientLoggedRhsComponentEntity() {
        this.f82880b = 1;
        this.f82879a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82878d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            return this.f82881c;
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
        if (!(obj instanceof ClientLoggedRhsComponentEntity)) {
            return false;
        }
        if (this != obj) {
            ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity = (ClientLoggedRhsComponentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82878d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientLoggedRhsComponentEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientLoggedRhsComponentEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientLoggedRhsComponentEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82878d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82881c = arrayList;
            this.f82879a.add(Integer.valueOf(i));
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
        Set set = this.f82879a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82880b);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f82881c, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientLoggedRhsComponentEntity(Set set, int i, List list) {
        this.f82879a = set;
        this.f82880b = i;
        this.f82881c = list;
    }

    public ClientLoggedRhsComponentEntity(Set set, List list) {
        this.f82879a = set;
        this.f82880b = 1;
        this.f82881c = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82879a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

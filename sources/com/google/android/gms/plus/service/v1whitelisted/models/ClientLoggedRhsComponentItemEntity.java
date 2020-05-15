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
public final class ClientLoggedRhsComponentItemEntity extends FastSafeParcelableJsonResponse implements aogl {
    public static final Parcelable.Creator CREATOR = new aogm();

    /* renamed from: e */
    private static final HashMap f82882e;

    /* renamed from: a */
    final Set f82883a;

    /* renamed from: b */
    final int f82884b;

    /* renamed from: c */
    List f82885c;

    /* renamed from: d */
    List f82886d;

    static {
        HashMap hashMap = new HashMap();
        f82882e = hashMap;
        hashMap.put("circle", FastJsonResponse$Field.m22657b("circle", 2, ClientLoggedCircleEntity.class));
        f82882e.put("person", FastJsonResponse$Field.m22657b("person", 9, ClientLoggedCircleMemberEntity.class));
    }

    public ClientLoggedRhsComponentItemEntity() {
        this.f82884b = 1;
        this.f82883a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82882e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82885c;
        }
        if (i == 9) {
            return this.f82886d;
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
        if (!(obj instanceof ClientLoggedRhsComponentItemEntity)) {
            return false;
        }
        if (this != obj) {
            ClientLoggedRhsComponentItemEntity clientLoggedRhsComponentItemEntity = (ClientLoggedRhsComponentItemEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82882e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientLoggedRhsComponentItemEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientLoggedRhsComponentItemEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientLoggedRhsComponentItemEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82882e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82885c = arrayList;
        } else if (i == 9) {
            this.f82886d = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82883a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82883a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82884b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f82885c, true);
        }
        if (set.contains(9)) {
            see.m35066c(parcel, 9, this.f82886d, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientLoggedRhsComponentItemEntity(Set set, int i, List list, List list2) {
        this.f82883a = set;
        this.f82884b = i;
        this.f82885c = list;
        this.f82886d = list2;
    }

    public ClientLoggedRhsComponentItemEntity(Set set, List list, List list2) {
        this.f82883a = set;
        this.f82884b = 1;
        this.f82885c = list;
        this.f82886d = list2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82883a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

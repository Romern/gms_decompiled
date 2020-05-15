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
public final class ClientAclDetailsEntity extends FastSafeParcelableJsonResponse implements aofw {
    public static final Parcelable.Creator CREATOR = new aofx();

    /* renamed from: f */
    private static final HashMap f82855f;

    /* renamed from: a */
    final Set f82856a;

    /* renamed from: b */
    final int f82857b;

    /* renamed from: c */
    List f82858c;

    /* renamed from: d */
    List f82859d;

    /* renamed from: e */
    List f82860e;

    static {
        HashMap hashMap = new HashMap();
        f82855f = hashMap;
        hashMap.put("circle", FastJsonResponse$Field.m22657b("circle", 2, ClientLoggedCircleEntity.class));
        f82855f.put("person", FastJsonResponse$Field.m22657b("person", 4, ClientLoggedCircleMemberEntity.class));
        f82855f.put("systemGroup", FastJsonResponse$Field.m22668g("systemGroup", 5));
    }

    public ClientAclDetailsEntity() {
        this.f82857b = 1;
        this.f82856a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82855f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82858c;
        }
        if (i == 4) {
            return this.f82859d;
        }
        if (i == 5) {
            return this.f82860e;
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
        if (!(obj instanceof ClientAclDetailsEntity)) {
            return false;
        }
        if (this != obj) {
            ClientAclDetailsEntity clientAclDetailsEntity = (ClientAclDetailsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82855f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientAclDetailsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientAclDetailsEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientAclDetailsEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82855f.values()) {
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
            this.f82858c = arrayList;
        } else if (i == 4) {
            this.f82859d = arrayList;
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
        this.f82856a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82860e = arrayList;
            this.f82856a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82856a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82857b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f82858c, true);
        }
        if (set.contains(4)) {
            see.m35066c(parcel, 4, this.f82859d, true);
        }
        if (set.contains(5)) {
            see.m35065b(parcel, 5, this.f82860e, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientAclDetailsEntity(Set set, int i, List list, List list2, List list3) {
        this.f82856a = set;
        this.f82857b = i;
        this.f82858c = list;
        this.f82859d = list2;
        this.f82860e = list3;
    }

    public ClientAclDetailsEntity(Set set, List list, List list2, List list3) {
        this.f82856a = set;
        this.f82857b = 1;
        this.f82858c = list;
        this.f82859d = list2;
        this.f82860e = list3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82856a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

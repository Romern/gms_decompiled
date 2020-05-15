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
public final class Settings extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoig();

    /* renamed from: d */
    private static final HashMap f83060d;

    /* renamed from: a */
    final Set f83061a;

    /* renamed from: b */
    final int f83062b;

    /* renamed from: c */
    public List f83063c;

    static {
        HashMap hashMap = new HashMap();
        f83060d = hashMap;
        hashMap.put("items", FastJsonResponse$Field.m22657b("items", 3, SettingEntity.class));
    }

    public Settings() {
        this.f83062b = 1;
        this.f83061a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83060d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f83063c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Settings)) {
            return false;
        }
        if (this != obj) {
            Settings settings = (Settings) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83060d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!settings.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(settings.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (settings.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83060d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f83063c = arrayList;
            this.f83061a.add(Integer.valueOf(i));
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
        Set set = this.f83061a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83062b);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f83063c, true);
        }
        see.m35062b(parcel, a);
    }

    public Settings(Set set, int i, List list) {
        this.f83061a = set;
        this.f83062b = i;
        this.f83063c = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83061a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

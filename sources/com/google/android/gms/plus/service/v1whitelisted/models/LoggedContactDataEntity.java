package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LoggedContactDataEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohh();

    /* renamed from: d */
    private static final HashMap f82959d;

    /* renamed from: a */
    final Set f82960a;

    /* renamed from: b */
    final int f82961b;

    /* renamed from: c */
    boolean f82962c;

    static {
        HashMap hashMap = new HashMap();
        f82959d = hashMap;
        hashMap.put("hasPhoto", FastJsonResponse$Field.m22664e("hasPhoto", 5));
    }

    public LoggedContactDataEntity() {
        this.f82961b = 1;
        this.f82960a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82959d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            return Boolean.valueOf(this.f82962c);
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
        if (!(obj instanceof LoggedContactDataEntity)) {
            return false;
        }
        if (this != obj) {
            LoggedContactDataEntity loggedContactDataEntity = (LoggedContactDataEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82959d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!loggedContactDataEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(loggedContactDataEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (loggedContactDataEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82959d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82962c = z;
            this.f82960a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82960a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82961b);
        }
        if (set.contains(5)) {
            see.m35051a(parcel, 5, this.f82962c);
        }
        see.m35062b(parcel, a);
    }

    public LoggedContactDataEntity(Set set, int i, boolean z) {
        this.f82960a = set;
        this.f82961b = i;
        this.f82962c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82960a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

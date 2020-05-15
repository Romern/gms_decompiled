package com.google.android.gms.drive.internal.model;

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
public final class ChangeList extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvh();

    /* renamed from: e */
    private static final HashMap f30952e;

    /* renamed from: a */
    final Set f30953a;

    /* renamed from: b */
    public List f30954b;

    /* renamed from: c */
    public long f30955c;

    /* renamed from: d */
    public String f30956d;

    static {
        HashMap hashMap = new HashMap();
        f30952e = hashMap;
        hashMap.put("items", FastJsonResponse$Field.m22657b("items", 4, Change.class));
        f30952e.put("largestChangeId", FastJsonResponse$Field.m22656b("largestChangeId", 6));
        f30952e.put("nextPageToken", FastJsonResponse$Field.m22666f("nextPageToken", 8));
    }

    public ChangeList() {
        this.f30953a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30952e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            return this.f30954b;
        }
        if (i == 6) {
            return Long.valueOf(this.f30955c);
        }
        if (i == 8) {
            return this.f30956d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChangeList)) {
            return false;
        }
        if (this != obj) {
            ChangeList changeList = (ChangeList) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30952e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!changeList.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(changeList.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (changeList.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30952e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public ChangeList(Set set, List list, long j, String str) {
        this.f30953a = set;
        this.f30954b = list;
        this.f30955c = j;
        this.f30956d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f30955c = j;
            this.f30953a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a long.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f30953a;
        if (set.contains(4)) {
            see.m35066c(parcel, 4, this.f30954b, true);
        }
        if (set.contains(6)) {
            see.m35036a(parcel, 6, this.f30955c);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f30956d, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f30956d = str2;
            this.f30953a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f30954b = arrayList;
            this.f30953a.add(Integer.valueOf(i));
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30953a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

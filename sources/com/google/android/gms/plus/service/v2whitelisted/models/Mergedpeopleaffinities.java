package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Mergedpeopleaffinities extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoir();

    /* renamed from: e */
    private static final HashMap f83086e;

    /* renamed from: a */
    final Set f83087a;

    /* renamed from: b */
    public String f83088b;

    /* renamed from: c */
    public String f83089c;

    /* renamed from: d */
    public double f83090d;

    static {
        HashMap hashMap = new HashMap();
        f83086e = hashMap;
        hashMap.put("loggingId", FastJsonResponse$Field.m22666f("loggingId", 2));
        f83086e.put("type", FastJsonResponse$Field.m22666f("type", 3));
        f83086e.put("value", FastJsonResponse$Field.m22662d("value", 4));
    }

    public Mergedpeopleaffinities() {
        this.f83087a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83086e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83088b;
        }
        if (i == 3) {
            return this.f83089c;
        }
        if (i == 4) {
            return Double.valueOf(this.f83090d);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeopleaffinities)) {
            return false;
        }
        if (this != obj) {
            Mergedpeopleaffinities mergedpeopleaffinities = (Mergedpeopleaffinities) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83086e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!mergedpeopleaffinities.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(mergedpeopleaffinities.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (mergedpeopleaffinities.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83086e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Mergedpeopleaffinities(Set set, String str, String str2, double d) {
        this.f83087a = set;
        this.f83088b = str;
        this.f83089c = str2;
        this.f83090d = d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17873a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f83090d = d;
            this.f83087a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a double.");
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
        Set set = this.f83087a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f83088b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f83089c, true);
        }
        if (set.contains(4)) {
            see.m35033a(parcel, 4, this.f83090d);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83088b = str2;
        } else if (i == 3) {
            this.f83089c = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83087a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83087a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

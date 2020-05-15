package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParentReference extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvo();

    /* renamed from: d */
    private static final HashMap f31031d;

    /* renamed from: a */
    public final Set f31032a;

    /* renamed from: b */
    public String f31033b;

    /* renamed from: c */
    public boolean f31034c;

    static {
        HashMap hashMap = new HashMap();
        f31031d = hashMap;
        hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
        f31031d.put("isRoot", FastJsonResponse$Field.m22664e("isRoot", 3));
    }

    public ParentReference() {
        this.f31032a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f31031d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f31033b;
        }
        if (i == 3) {
            return Boolean.valueOf(this.f31034c);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final void mo18248e(String str) {
        this.f31033b = str;
        this.f31032a.add(2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParentReference)) {
            return false;
        }
        if (this != obj) {
            ParentReference parentReference = (ParentReference) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31031d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!parentReference.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(parentReference.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (parentReference.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f31031d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public ParentReference(Set set, String str, boolean z) {
        this.f31032a = set;
        this.f31033b = str;
        this.f31034c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f31033b = str2;
            this.f31032a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
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
        Set set = this.f31032a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f31033b, true);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f31034c);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f31034c = z;
            this.f31032a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f31032a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

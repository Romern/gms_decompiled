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
public final class FileLocalId extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvk();

    /* renamed from: e */
    private static final HashMap f31026e;

    /* renamed from: a */
    public final Set f31027a;

    /* renamed from: b */
    public String f31028b;

    /* renamed from: c */
    public String f31029c;

    /* renamed from: d */
    public String f31030d;

    static {
        HashMap hashMap = new HashMap();
        f31026e = hashMap;
        hashMap.put("space", FastJsonResponse$Field.m22666f("space", 3));
        f31026e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        f31026e.put("version", FastJsonResponse$Field.m22666f("version", 5));
    }

    public FileLocalId() {
        this.f31027a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f31026e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f31028b;
        }
        if (i == 4) {
            return this.f31029c;
        }
        if (i == 5) {
            return this.f31030d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FileLocalId)) {
            return false;
        }
        if (this != obj) {
            FileLocalId fileLocalId = (FileLocalId) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31026e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!fileLocalId.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(fileLocalId.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (fileLocalId.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f31026e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public FileLocalId(Set set, String str, String str2, String str3) {
        this.f31027a = set;
        this.f31028b = str;
        this.f31029c = str2;
        this.f31030d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f31028b = str2;
        } else if (i == 4) {
            this.f31029c = str2;
        } else if (i == 5) {
            this.f31030d = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f31027a.add(Integer.valueOf(i));
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
        Set set = this.f31027a;
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f31028b, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f31029c, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f31030d, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f31027a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

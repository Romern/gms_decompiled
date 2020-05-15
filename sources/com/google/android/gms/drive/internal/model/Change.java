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
public final class Change extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvg();

    /* renamed from: e */
    private static final HashMap f30947e;

    /* renamed from: a */
    final Set f30948a;

    /* renamed from: b */
    public boolean f30949b;

    /* renamed from: c */
    public File f30950c;

    /* renamed from: d */
    public String f30951d;

    static {
        HashMap hashMap = new HashMap();
        f30947e = hashMap;
        hashMap.put("deleted", FastJsonResponse$Field.m22664e("deleted", 2));
        f30947e.put("file", FastJsonResponse$Field.m22653a("file", 3, File.class));
        f30947e.put("fileId", FastJsonResponse$Field.m22666f("fileId", 4));
    }

    public Change() {
        this.f30948a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30947e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Boolean.valueOf(this.f30949b);
        }
        if (i == 3) {
            return this.f30950c;
        }
        if (i == 4) {
            return this.f30951d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Change)) {
            return false;
        }
        if (this != obj) {
            Change change = (Change) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30947e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!change.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(change.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (change.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30947e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Change(Set set, boolean z, File file, String str) {
        this.f30948a = set;
        this.f30949b = z;
        this.f30950c = file;
        this.f30951d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f30951d = str2;
            this.f30948a.add(Integer.valueOf(i));
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
        Set set = this.f30948a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f30949b);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f30950c, i, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f30951d, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f30950c = (File) sio;
            this.f30948a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = sio.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f30949b = z;
            this.f30948a.add(Integer.valueOf(i));
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
        return this.f30948a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

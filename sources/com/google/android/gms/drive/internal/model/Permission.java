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
public final class Permission extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvp();

    /* renamed from: l */
    private static final HashMap f31035l;

    /* renamed from: a */
    public final Set f31036a;

    /* renamed from: b */
    public List f31037b;

    /* renamed from: c */
    public String f31038c;

    /* renamed from: d */
    public String f31039d;

    /* renamed from: e */
    public String f31040e;

    /* renamed from: f */
    public String f31041f;

    /* renamed from: g */
    public String f31042g;

    /* renamed from: h */
    public String f31043h;

    /* renamed from: i */
    public String f31044i;

    /* renamed from: j */
    String f31045j;

    /* renamed from: k */
    public boolean f31046k;

    static {
        HashMap hashMap = new HashMap();
        f31035l = hashMap;
        hashMap.put("additionalRoles", FastJsonResponse$Field.m22668g("additionalRoles", 2));
        f31035l.put("domain", FastJsonResponse$Field.m22666f("domain", 4));
        f31035l.put("emailAddress", FastJsonResponse$Field.m22666f("emailAddress", 5));
        f31035l.put("id", FastJsonResponse$Field.m22666f("id", 7));
        f31035l.put("name", FastJsonResponse$Field.m22666f("name", 9));
        f31035l.put("photoLink", FastJsonResponse$Field.m22666f("photoLink", 10));
        f31035l.put("role", FastJsonResponse$Field.m22666f("role", 11));
        f31035l.put("type", FastJsonResponse$Field.m22666f("type", 13));
        f31035l.put("value", FastJsonResponse$Field.m22666f("value", 15));
        f31035l.put("withLink", FastJsonResponse$Field.m22664e("withLink", 16));
    }

    public Permission() {
        this.f31036a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f31035l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f31037b;
            case 3:
            case 6:
            case 8:
            case 12:
            case 14:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 4:
                return this.f31038c;
            case 5:
                return this.f31039d;
            case 7:
                return this.f31040e;
            case 9:
                return this.f31041f;
            case 10:
                return this.f31042g;
            case 11:
                return this.f31043h;
            case 13:
                return this.f31044i;
            case 15:
                return this.f31045j;
            case 16:
                return Boolean.valueOf(this.f31046k);
        }
    }

    /* renamed from: e */
    public final void mo18250e(String str) {
        this.f31043h = str;
        this.f31036a.add(11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Permission)) {
            return false;
        }
        if (this != obj) {
            Permission permission = (Permission) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31035l.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!permission.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(permission.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (permission.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo18251f(String str) {
        this.f31044i = str;
        this.f31036a.add(13);
    }

    /* renamed from: g */
    public final void mo18252g(String str) {
        this.f31045j = str;
        this.f31036a.add(15);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f31035l.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Permission(Set set, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.f31036a = set;
        this.f31037b = list;
        this.f31038c = str;
        this.f31039d = str2;
        this.f31040e = str3;
        this.f31041f = str4;
        this.f31042g = str5;
        this.f31043h = str6;
        this.f31044i = str7;
        this.f31045j = str8;
        this.f31046k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 4:
                this.f31038c = str2;
                break;
            case 5:
                this.f31039d = str2;
                break;
            case 6:
            case 8:
            case 12:
            case 14:
            default:
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            case 7:
                this.f31040e = str2;
                break;
            case 9:
                this.f31041f = str2;
                break;
            case 10:
                this.f31042g = str2;
                break;
            case 11:
                this.f31043h = str2;
                break;
            case 13:
                this.f31044i = str2;
                break;
            case 15:
                this.f31045j = str2;
                break;
        }
        this.f31036a.add(Integer.valueOf(i));
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
        Set set = this.f31036a;
        if (set.contains(2)) {
            see.m35065b(parcel, 2, this.f31037b, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f31038c, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f31039d, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f31040e, true);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f31041f, true);
        }
        if (set.contains(10)) {
            see.m35046a(parcel, 10, this.f31042g, true);
        }
        if (set.contains(11)) {
            see.m35046a(parcel, 11, this.f31043h, true);
        }
        if (set.contains(13)) {
            see.m35046a(parcel, 13, this.f31044i, true);
        }
        if (set.contains(15)) {
            see.m35046a(parcel, 15, this.f31045j, true);
        }
        if (set.contains(16)) {
            see.m35051a(parcel, 16, this.f31046k);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f31037b = arrayList;
            this.f31036a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 16) {
            this.f31046k = z;
            this.f31036a.add(Integer.valueOf(i));
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
        return this.f31036a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

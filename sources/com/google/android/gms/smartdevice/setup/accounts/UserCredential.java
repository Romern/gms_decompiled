package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserCredential extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aruv();

    /* renamed from: i */
    private static final HashMap f108177i;

    /* renamed from: a */
    final Set f108178a;

    /* renamed from: b */
    public String f108179b;

    /* renamed from: c */
    public int f108180c;

    /* renamed from: d */
    public String f108181d;

    /* renamed from: e */
    public String f108182e;

    /* renamed from: f */
    public String f108183f;

    /* renamed from: g */
    public String f108184g;

    /* renamed from: h */
    public String f108185h;

    static {
        HashMap hashMap = new HashMap();
        f108177i = hashMap;
        hashMap.put("accountIdentifier", FastJsonResponse$Field.m22666f("accountIdentifier", 2));
        f108177i.put("status", FastJsonResponse$Field.m22651a("status", 3));
        f108177i.put("reason", FastJsonResponse$Field.m22666f("reason", 4));
        f108177i.put("fallbackUrl", FastJsonResponse$Field.m22666f("fallbackUrl", 5));
        f108177i.put("credential", FastJsonResponse$Field.m22666f("credential", 6));
        f108177i.put("firstName", FastJsonResponse$Field.m22666f("firstName", 7));
        f108177i.put("lastName", FastJsonResponse$Field.m22666f("lastName", 8));
    }

    public UserCredential() {
        this.f108178a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108177i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f108179b;
            case 3:
                return Integer.valueOf(this.f108180c);
            case 4:
                return this.f108181d;
            case 5:
                return this.f108182e;
            case 6:
                return this.f108183f;
            case 7:
                return this.f108184g;
            case 8:
                return this.f108185h;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f108180c = i;
            this.f108178a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
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
        Set set = this.f108178a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f108179b, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f108180c);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f108181d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f108182e, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f108183f, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f108184g, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f108185h, true);
        }
        see.m35062b(parcel, a);
    }

    public UserCredential(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        HashSet hashSet = new HashSet();
        this.f108178a = hashSet;
        this.f108179b = str;
        hashSet.add(2);
        this.f108180c = i;
        this.f108178a.add(3);
        this.f108181d = str2;
        this.f108178a.add(4);
        this.f108182e = str3;
        this.f108178a.add(5);
        this.f108183f = str4;
        this.f108178a.add(6);
        this.f108184g = str5;
        this.f108178a.add(7);
        this.f108185h = str6;
        this.f108178a.add(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                this.f108179b = str2;
                break;
            case 3:
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            case 4:
                this.f108181d = str2;
                break;
            case 5:
                this.f108182e = str2;
                break;
            case 6:
                this.f108183f = str2;
                break;
            case 7:
                this.f108184g = str2;
                break;
            case 8:
                this.f108185h = str2;
                break;
        }
        this.f108178a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108178a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public UserCredential(Set set, String str, int i, String str2, String str3, String str4, String str5, String str6) {
        this.f108178a = set;
        this.f108179b = str;
        this.f108180c = i;
        this.f108181d = str2;
        this.f108182e = str3;
        this.f108183f = str4;
        this.f108184g = str5;
        this.f108185h = str6;
    }
}

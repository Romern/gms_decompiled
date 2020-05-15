package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CompanionApp extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqzb();

    /* renamed from: g */
    private static final HashMap f107858g;

    /* renamed from: a */
    final Set f107859a;

    /* renamed from: b */
    public String f107860b;

    /* renamed from: c */
    public String f107861c;

    /* renamed from: d */
    public String f107862d;

    /* renamed from: e */
    public String f107863e;

    /* renamed from: f */
    public boolean f107864f;

    static {
        HashMap hashMap = new HashMap();
        f107858g = hashMap;
        hashMap.put("appName", FastJsonResponse$Field.m22666f("appName", 2));
        f107858g.put("packageName", FastJsonResponse$Field.m22666f("packageName", 3));
        f107858g.put("installTitle", FastJsonResponse$Field.m22666f("installTitle", 4));
        f107858g.put("installMessage", FastJsonResponse$Field.m22666f("installMessage", 5));
        f107858g.put("isOptional", FastJsonResponse$Field.m22664e("isOptional", 6));
    }

    public CompanionApp() {
        this.f107859a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107858g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107860b;
        }
        if (i == 3) {
            return this.f107861c;
        }
        if (i == 4) {
            return this.f107862d;
        }
        if (i == 5) {
            return this.f107863e;
        }
        if (i == 6) {
            return Boolean.valueOf(this.f107864f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public CompanionApp(Set set, String str, String str2, String str3, String str4, boolean z) {
        this.f107859a = set;
        this.f107860b = str;
        this.f107861c = str2;
        this.f107862d = str3;
        this.f107863e = str4;
        this.f107864f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107860b = str2;
        } else if (i == 3) {
            this.f107861c = str2;
        } else if (i == 4) {
            this.f107862d = str2;
        } else if (i == 5) {
            this.f107863e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107859a.add(Integer.valueOf(i));
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
        Set set = this.f107859a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f107860b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107861c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f107862d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f107863e, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f107864f);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f107864f = z;
            this.f107859a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107859a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

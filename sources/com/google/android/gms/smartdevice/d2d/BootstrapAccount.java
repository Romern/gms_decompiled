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
public class BootstrapAccount extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqym();

    /* renamed from: d */
    private static final HashMap f107797d;

    /* renamed from: a */
    final Set f107798a;

    /* renamed from: b */
    public String f107799b;

    /* renamed from: c */
    public String f107800c;

    static {
        HashMap hashMap = new HashMap();
        f107797d = hashMap;
        hashMap.put("name", FastJsonResponse$Field.m22666f("name", 2));
        f107797d.put("type", FastJsonResponse$Field.m22666f("type", 3));
    }

    public BootstrapAccount() {
        this.f107798a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107797d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107799b;
        }
        if (i == 3) {
            return this.f107800c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107799b = str2;
        } else if (i == 3) {
            this.f107800c = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f107798a.add(Integer.valueOf(i));
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
        Set set = this.f107798a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f107799b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f107800c, true);
        }
        see.m35062b(parcel, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public BootstrapAccount(String str, String str2) {
        this.f107798a = new HashSet();
        sdo.m34969a(str, (Object) "name cannot be null or empty.");
        this.f107799b = str;
        this.f107798a.add(2);
        sdo.m34969a(str2, (Object) "type cannot be null or empty.");
        this.f107800c = str2;
        this.f107798a.add(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107798a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public BootstrapAccount(Set set, String str, String str2) {
        this.f107798a = set;
        this.f107799b = str;
        this.f107800c = str2;
    }
}

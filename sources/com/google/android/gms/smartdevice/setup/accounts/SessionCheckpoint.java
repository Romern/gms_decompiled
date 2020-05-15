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
public class SessionCheckpoint extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arus();

    /* renamed from: d */
    private static final HashMap f108166d;

    /* renamed from: a */
    final Set f108167a;

    /* renamed from: b */
    public String f108168b;

    /* renamed from: c */
    public String f108169c;

    static {
        HashMap hashMap = new HashMap();
        f108166d = hashMap;
        hashMap.put("accountIdentifier", FastJsonResponse$Field.m22666f("accountIdentifier", 2));
        f108166d.put("sessionCheckpoint", FastJsonResponse$Field.m22666f("sessionCheckpoint", 3));
    }

    public SessionCheckpoint() {
        this.f108167a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108166d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f108168b;
        }
        if (i == 3) {
            return this.f108169c;
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
            this.f108168b = str2;
        } else if (i == 3) {
            this.f108169c = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f108167a.add(Integer.valueOf(i));
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
        Set set = this.f108167a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f108168b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f108169c, true);
        }
        see.m35062b(parcel, a);
    }

    public SessionCheckpoint(String str, String str2) {
        HashSet hashSet = new HashSet();
        this.f108167a = hashSet;
        this.f108168b = str;
        hashSet.add(2);
        this.f108169c = str2;
        this.f108167a.add(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108167a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public SessionCheckpoint(Set set, String str, String str2) {
        this.f108167a = set;
        this.f108168b = str;
        this.f108169c = str2;
    }
}

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
public class ScreenlockState extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arur();

    /* renamed from: g */
    private static final HashMap f108159g;

    /* renamed from: a */
    final Set f108160a;

    /* renamed from: b */
    public boolean f108161b;

    /* renamed from: c */
    public int f108162c;

    /* renamed from: d */
    public long f108163d;

    /* renamed from: e */
    public long f108164e;

    /* renamed from: f */
    public boolean f108165f;

    static {
        HashMap hashMap = new HashMap();
        f108159g = hashMap;
        hashMap.put("isSecureScreenlock", FastJsonResponse$Field.m22664e("isSecureScreenlock", 2));
        f108159g.put("screenlockType", FastJsonResponse$Field.m22651a("screenlockType", 3));
        f108159g.put("screenlockSettingsAgeMillis", FastJsonResponse$Field.m22656b("screenlockSettingsAgeMillis", 4));
        f108159g.put("elapsedTimeSinceUnlockMillis", FastJsonResponse$Field.m22656b("elapsedTimeSinceUnlockMillis", 5));
        f108159g.put("isForcedScreenlock", FastJsonResponse$Field.m22664e("isForcedScreenlock", 6));
    }

    public ScreenlockState() {
        this.f108160a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108159g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Boolean.valueOf(this.f108161b);
        }
        if (i == 3) {
            return Integer.valueOf(this.f108162c);
        }
        if (i == 4) {
            return Long.valueOf(this.f108163d);
        }
        if (i == 5) {
            return Long.valueOf(this.f108164e);
        }
        if (i == 6) {
            return Boolean.valueOf(this.f108165f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public ScreenlockState(Set set, boolean z, int i, long j, long j2, boolean z2) {
        this.f108160a = set;
        this.f108161b = z;
        this.f108162c = i;
        this.f108163d = j;
        this.f108164e = j2;
        this.f108165f = z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f108162c = i;
            this.f108160a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f108160a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f108161b);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f108162c);
        }
        if (set.contains(4)) {
            see.m35036a(parcel, 4, this.f108163d);
        }
        if (set.contains(5)) {
            see.m35036a(parcel, 5, this.f108164e);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f108165f);
        }
        see.m35062b(parcel, a);
    }

    public ScreenlockState(boolean z, int i, long j, long j2, boolean z2) {
        HashSet hashSet = new HashSet();
        this.f108160a = hashSet;
        this.f108161b = z;
        hashSet.add(2);
        this.f108162c = i;
        this.f108160a.add(3);
        this.f108163d = j;
        this.f108160a.add(4);
        this.f108164e = j2;
        this.f108160a.add(5);
        this.f108165f = z2;
        this.f108160a.add(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f108163d = j;
        } else if (i == 5) {
            this.f108164e = j;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108160a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108161b = z;
        } else if (i == 6) {
            this.f108165f = z;
        } else {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108160a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108160a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresence extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aruw();

    /* renamed from: g */
    private static final HashMap f108186g;

    /* renamed from: a */
    final Set f108187a;

    /* renamed from: b */
    public boolean f108188b;

    /* renamed from: c */
    public boolean f108189c;

    /* renamed from: d */
    public int f108190d;

    /* renamed from: e */
    public long f108191e;

    /* renamed from: f */
    public long f108192f;

    static {
        HashMap hashMap = new HashMap();
        f108186g = hashMap;
        hashMap.put("lockScreenSecure", FastJsonResponse$Field.m22664e("lockScreenSecure", 2));
        f108186g.put("shownLockScreen", FastJsonResponse$Field.m22664e("shownLockScreen", 3));
        f108186g.put("lockScreenQuality", FastJsonResponse$Field.m22651a("lockScreenQuality", 4));
        f108186g.put("lastUnlockDurationInSeconds", FastJsonResponse$Field.m22656b("lastUnlockDurationInSeconds", 5));
        f108186g.put("lockScreenSetupDurationInSeconds", FastJsonResponse$Field.m22656b("lockScreenSetupDurationInSeconds", 6));
    }

    public UserPresence() {
        this.f108187a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108186g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Boolean.valueOf(this.f108188b);
        }
        if (i == 3) {
            return Boolean.valueOf(this.f108189c);
        }
        if (i == 4) {
            return Integer.valueOf(this.f108190d);
        }
        if (i == 5) {
            return Long.valueOf(this.f108191e);
        }
        if (i == 6) {
            return Long.valueOf(this.f108192f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public UserPresence(Set set, boolean z, boolean z2, int i, long j, long j2) {
        this.f108187a = set;
        this.f108188b = z;
        this.f108189c = z2;
        this.f108190d = i;
        this.f108191e = j;
        this.f108192f = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 4) {
            this.f108190d = i;
            this.f108187a.add(Integer.valueOf(i2));
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
        Set set = this.f108187a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f108188b);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f108189c);
        }
        if (set.contains(4)) {
            see.m35063b(parcel, 4, this.f108190d);
        }
        if (set.contains(5)) {
            see.m35036a(parcel, 5, this.f108191e);
        }
        if (set.contains(6)) {
            see.m35036a(parcel, 6, this.f108192f);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f108191e = j;
        } else if (i == 6) {
            this.f108192f = j;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108187a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108188b = z;
        } else if (i == 3) {
            this.f108189c = z;
        } else {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108187a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108187a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}

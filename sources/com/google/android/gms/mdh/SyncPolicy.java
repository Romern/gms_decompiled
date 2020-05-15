package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aflb();

    /* renamed from: a */
    public int f79995a;

    /* renamed from: b */
    public SyncSubPolicy f79996b;

    /* renamed from: c */
    public SyncSubPolicy f79997c;

    /* renamed from: d */
    public SyncSubPolicy f79998d;

    /* renamed from: e */
    public SyncSubPolicy f79999e;

    /* renamed from: f */
    public Integer f80000f;

    /* renamed from: g */
    public boolean f80001g;

    /* renamed from: h */
    public boolean f80002h;

    static {
        m67178a().mo34942a();
        afla a = m67178a();
        a.f64318a = 0;
        a.mo34942a();
    }

    public SyncPolicy(int i, SyncSubPolicy syncSubPolicy, SyncSubPolicy syncSubPolicy2, SyncSubPolicy syncSubPolicy3, SyncSubPolicy syncSubPolicy4, Integer num, boolean z, boolean z2) {
        this.f79995a = i;
        this.f79996b = syncSubPolicy;
        this.f79997c = syncSubPolicy2;
        this.f79998d = syncSubPolicy3;
        this.f79999e = syncSubPolicy4;
        this.f80000f = num;
        this.f80001g = z;
        this.f80002h = z2;
    }

    /* renamed from: a */
    public static afla m67178a() {
        return new afla();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncPolicy syncPolicy = (SyncPolicy) obj;
            if (this.f79995a == syncPolicy.f79995a && this.f80001g == syncPolicy.f80001g && this.f80002h == syncPolicy.f80002h && this.f79996b.equals(syncPolicy.f79996b) && this.f79997c.equals(syncPolicy.f79997c) && this.f79998d.equals(syncPolicy.f79998d) && this.f79999e.equals(syncPolicy.f79999e)) {
                Integer num = this.f80000f;
                if (num != null) {
                    return num.equals(syncPolicy.f80000f);
                }
                return syncPolicy.f80000f == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f79995a * 31) + this.f79996b.hashCode()) * 31) + this.f79997c.hashCode()) * 31) + this.f79998d.hashCode()) * 31) + this.f79999e.hashCode()) * 31;
        Integer num = this.f80000f;
        return ((((hashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.f80001g ? 1 : 0)) * 31) + (this.f80002h ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79995a);
        see.m35040a(parcel, 2, this.f79996b, i, false);
        see.m35040a(parcel, 3, this.f79997c, i, false);
        see.m35040a(parcel, 4, this.f79998d, i, false);
        see.m35040a(parcel, 5, this.f79999e, i, false);
        see.m35044a(parcel, 6, this.f80000f);
        see.m35051a(parcel, 7, this.f80001g);
        see.m35051a(parcel, 8, this.f80002h);
        see.m35062b(parcel, a);
    }
}

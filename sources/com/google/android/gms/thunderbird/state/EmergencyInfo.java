package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmergencyInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auhn();

    /* renamed from: a */
    public final ActivationInfo f109086a;

    /* renamed from: b */
    public final List f109087b;

    public EmergencyInfo(ActivationInfo activationInfo, Iterable iterable) {
        this.f109086a = activationInfo;
        this.f109087b = bngx.m109355a(iterable);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final EmergencyInfo mo59536a(bmxz bmxz) {
        return new EmergencyInfo(this.f109086a, bnjd.m109586b((Iterable) this.f109087b, bmxz));
    }

    /* renamed from: a */
    public final String mo59537a() {
        return this.f109086a.f109071a;
    }

    /* renamed from: b */
    public final String mo59538b() {
        return this.f109086a.f109072b;
    }

    /* renamed from: c */
    public final boolean mo59539c() {
        return this.f109086a.f109073c;
    }

    /* renamed from: d */
    public final long mo59540d() {
        return this.f109086a.f109074d;
    }

    /* renamed from: e */
    public final DeviceState mo59541e() {
        boolean z = true;
        if (this.f109087b.size() != 1) {
            z = false;
        }
        bmxy.m108600b(z);
        return (DeviceState) this.f109087b.get(0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo59538b());
        if (mo59539c()) {
            sb.append(":MOCK");
        }
        sb.append(":");
        sb.append(mo59537a());
        sb.append(":");
        sb.append(bnjd.m109575a((Iterable) this.f109087b, auhm.f91827a));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 9, this.f109086a, i, false);
        see.m35066c(parcel, 10, this.f109087b, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aete();

    /* renamed from: a */
    public final Boolean f79631a;

    /* renamed from: b */
    public final List f79632b;

    /* renamed from: c */
    public final List f79633c;

    /* renamed from: d */
    public Boolean f79634d;

    /* renamed from: e */
    public int f79635e;

    /* renamed from: f */
    public final Boolean f79636f;

    /* renamed from: g */
    public final Boolean f79637g;

    public LocationSharingSettings(boolean z, List list, int i, boolean z2) {
        this(z, list, i - 1, z2, null);
    }

    /* renamed from: a */
    public static LocationSharingSettings m66999a(int i) {
        return new LocationSharingSettings(false, null, i - 1, false, null);
    }

    /* renamed from: b */
    public final boolean mo43767b() {
        return this.f79635e >= 4;
    }

    /* renamed from: c */
    public final boolean mo43768c() {
        return mo43770e() != 1 && !mo43767b();
    }

    /* renamed from: d */
    public final void mo43769d() {
        this.f79635e = 0;
    }

    /* renamed from: e */
    public final int mo43770e() {
        return new int[]{1, 2, 3, 4, 5, 6, 7}[this.f79635e];
    }

    private LocationSharingSettings(boolean z, List list, int i, boolean z2, byte[] bArr) {
        this.f79631a = Boolean.valueOf(z);
        this.f79637g = Boolean.valueOf(z2);
        this.f79633c = new ArrayList();
        this.f79632b = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                LocationShare locationShare = (LocationShare) list.get(i2);
                if (locationShare.mo43760f()) {
                    this.f79633c.add(locationShare);
                } else {
                    this.f79632b.add(locationShare);
                }
            }
            Collections.sort(this.f79633c, aetc.f63759a);
            Collections.sort(this.f79632b, aetc.f63759a);
        }
        this.f79635e = i;
        this.f79634d = false;
        this.f79636f = false;
    }

    /* renamed from: a */
    public final int mo43765a(LocationShare locationShare) {
        List list;
        if (!locationShare.mo43760f()) {
            list = this.f79632b;
        } else {
            list = this.f79633c;
        }
        int i = 0;
        while (i < list.size()) {
            if (aetc.f63759a.compare(locationShare, (LocationShare) list.get(i)) >= 0) {
                i++;
            } else {
                list.add(i, locationShare);
                return i;
            }
        }
        list.add(locationShare);
        return list.size() - 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35041a(parcel, 1, this.f79631a);
        see.m35066c(parcel, 2, this.f79632b, false);
        see.m35066c(parcel, 3, this.f79633c, false);
        see.m35041a(parcel, 4, this.f79634d);
        see.m35063b(parcel, 5, this.f79635e);
        see.m35041a(parcel, 6, this.f79636f);
        see.m35041a(parcel, 7, this.f79637g);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final List mo43766a() {
        ArrayList arrayList = new ArrayList(this.f79632b);
        List list = this.f79633c;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public LocationSharingSettings(boolean z, List list, List list2, boolean z2, int i, boolean z3, boolean z4) {
        this.f79631a = Boolean.valueOf(z);
        this.f79632b = list;
        this.f79633c = list2;
        this.f79635e = i;
        this.f79637g = Boolean.valueOf(z4);
        this.f79634d = Boolean.valueOf(z2);
        this.f79636f = Boolean.valueOf(z3);
    }
}

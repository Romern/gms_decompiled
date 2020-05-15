package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new amon();

    /* renamed from: a */
    public final String f81997a;

    /* renamed from: b */
    public final Long f81998b;

    /* renamed from: c */
    public final String f81999c;

    /* renamed from: d */
    public final Long f82000d;

    /* renamed from: e */
    public final Long f82001e;

    /* renamed from: f */
    public final DeviceVersionEntity f82002f;

    /* renamed from: g */
    private final List f82003g;

    /* renamed from: h */
    private List f82004h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.f81997a = str;
        this.f81998b = l;
        this.f82003g = list;
        this.f81999c = str2;
        this.f82000d = l2;
        this.f82001e = l3;
        this.f82002f = deviceVersionEntity;
    }

    /* renamed from: a */
    public final String mo46401a() {
        return this.f81997a;
    }

    /* renamed from: b */
    public final Long mo46402b() {
        return this.f81998b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo46403c() {
        List list;
        if (this.f82004h == null && (list = this.f82003g) != null) {
            this.f82004h = new ArrayList(list.size());
            List list2 = this.f82003g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82004h.add((SourceStats) list2.get(i));
            }
        }
        return this.f82004h;
    }

    /* renamed from: d */
    public final String mo46404d() {
        return this.f81999c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return sdg.m34949a(mo46401a(), backedUpContactsPerDevice.mo46401a()) && sdg.m34949a(mo46402b(), backedUpContactsPerDevice.mo46402b()) && sdg.m34949a(mo46403c(), backedUpContactsPerDevice.mo46403c()) && sdg.m34949a(mo46404d(), backedUpContactsPerDevice.mo46404d()) && sdg.m34949a(mo46405f(), backedUpContactsPerDevice.mo46405f()) && sdg.m34949a(mo46406g(), backedUpContactsPerDevice.mo46406g()) && sdg.m34949a(mo46407h(), backedUpContactsPerDevice.mo46407h());
    }

    /* renamed from: f */
    public final Long mo46405f() {
        return this.f82000d;
    }

    /* renamed from: g */
    public final Long mo46406g() {
        return this.f82001e;
    }

    /* renamed from: h */
    public final DeviceVersion mo46407h() {
        return this.f82002f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46401a(), mo46402b(), mo46403c(), mo46404d(), mo46405f(), mo46406g(), mo46407h()});
    }

    public BackedUpContactsPerDeviceEntity(String str, List list, String str2, Long l, Long l2) {
        this.f81997a = str;
        this.f81998b = null;
        this.f81999c = str2;
        this.f82000d = l;
        this.f82001e = l2;
        this.f82004h = list;
        if (list != null) {
            this.f82003g = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f82003g.add((SourceStatsEntity) ((SourceStats) list.get(i)));
            }
        } else {
            this.f82003g = null;
        }
        this.f82002f = null;
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
        see.m35046a(parcel, 2, this.f81997a, false);
        see.m35066c(parcel, 3, mo46403c(), false);
        see.m35046a(parcel, 4, this.f81999c, false);
        see.m35045a(parcel, 5, this.f82000d);
        see.m35045a(parcel, 6, this.f82001e);
        see.m35045a(parcel, 7, this.f81998b);
        see.m35040a(parcel, 8, this.f82002f, i, false);
        see.m35062b(parcel, a);
    }
}

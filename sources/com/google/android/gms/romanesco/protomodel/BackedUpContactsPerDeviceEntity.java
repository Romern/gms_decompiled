package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new apbx();

    /* renamed from: a */
    public final String f107230a;

    /* renamed from: b */
    public final Long f107231b;

    /* renamed from: c */
    public final String f107232c;

    /* renamed from: d */
    public final Long f107233d;

    /* renamed from: e */
    public final Long f107234e;

    /* renamed from: f */
    public final DeviceVersionEntity f107235f;

    /* renamed from: g */
    private final List f107236g;

    /* renamed from: h */
    private List f107237h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersion deviceVersion, boolean z) {
        this.f107230a = str;
        this.f107231b = l;
        this.f107232c = str2;
        this.f107233d = l2;
        this.f107234e = l3;
        DeviceVersionEntity deviceVersionEntity = null;
        if (z) {
            this.f107237h = list;
            if (list != null) {
                this.f107236g = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f107236g.add((SourceStatsEntity) ((SourceStats) it.next()));
                }
            } else {
                this.f107236g = null;
            }
            this.f107235f = (DeviceVersionEntity) deviceVersion;
            return;
        }
        this.f107237h = list;
        if (list != null) {
            this.f107236g = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SourceStats sourceStats = (SourceStats) it2.next();
                this.f107236g.add(new SourceStatsEntity(sourceStats.mo58831a(), sourceStats.mo58832b()));
            }
        } else {
            this.f107236g = null;
        }
        this.f107235f = deviceVersion != null ? new DeviceVersionEntity(deviceVersion.mo58810a()) : deviceVersionEntity;
    }

    /* renamed from: a */
    public final String mo58800a() {
        return this.f107230a;
    }

    /* renamed from: b */
    public final Long mo58801b() {
        return this.f107231b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo58802c() {
        List list;
        if (this.f107237h == null && (list = this.f107236g) != null) {
            this.f107237h = new ArrayList(list.size());
            List list2 = this.f107236g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f107237h.add((SourceStats) list2.get(i));
            }
        }
        return this.f107237h;
    }

    /* renamed from: d */
    public final String mo58803d() {
        return this.f107232c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return sdg.m34949a(mo58800a(), backedUpContactsPerDevice.mo58800a()) && sdg.m34949a(mo58801b(), backedUpContactsPerDevice.mo58801b()) && sdg.m34949a(mo58802c(), backedUpContactsPerDevice.mo58802c()) && sdg.m34949a(mo58803d(), backedUpContactsPerDevice.mo58803d()) && sdg.m34949a(mo58804f(), backedUpContactsPerDevice.mo58804f()) && sdg.m34949a(mo58805g(), backedUpContactsPerDevice.mo58805g()) && sdg.m34949a(mo58806h(), backedUpContactsPerDevice.mo58806h());
    }

    /* renamed from: f */
    public final Long mo58804f() {
        return this.f107233d;
    }

    /* renamed from: g */
    public final Long mo58805g() {
        return this.f107234e;
    }

    /* renamed from: h */
    public final DeviceVersion mo58806h() {
        return this.f107235f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo58800a(), mo58801b(), mo58802c(), mo58803d(), mo58804f(), mo58805g(), mo58806h()});
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
        see.m35046a(parcel, 2, this.f107230a, false);
        see.m35066c(parcel, 3, mo58802c(), false);
        see.m35046a(parcel, 4, this.f107232c, false);
        see.m35045a(parcel, 5, this.f107233d);
        see.m35045a(parcel, 6, this.f107234e);
        see.m35045a(parcel, 7, this.f107231b);
        see.m35040a(parcel, 8, this.f107235f, i, false);
        see.m35062b(parcel, a);
    }

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.f107230a = str;
        this.f107231b = l;
        this.f107236g = list;
        this.f107232c = str2;
        this.f107233d = l2;
        this.f107234e = l3;
        this.f107235f = deviceVersionEntity;
    }
}

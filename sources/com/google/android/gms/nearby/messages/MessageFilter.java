package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aixe();

    /* renamed from: a */
    public static final MessageFilter f80681a;

    /* renamed from: b */
    final int f80682b;

    /* renamed from: c */
    public final List f80683c;

    /* renamed from: d */
    public final List f80684d;

    /* renamed from: e */
    public final boolean f80685e;

    /* renamed from: f */
    public final List f80686f;

    /* renamed from: g */
    public final int f80687g;

    static {
        aixd aixd = new aixd();
        aixd.f69972a = true;
        f80681a = aixd.mo38199a();
    }

    public MessageFilter(int i, List list, List list2, boolean z, List list3, int i2) {
        this.f80682b = i;
        sdo.m34959a(list);
        this.f80683c = Collections.unmodifiableList(list);
        this.f80685e = z;
        this.f80684d = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f80686f = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f80687g = i2;
    }

    /* renamed from: a */
    public final boolean mo44309a() {
        return this.f80687g > 0;
    }

    /* renamed from: b */
    public final boolean mo44311b() {
        if (this.f80685e) {
            return true;
        }
        for (MessageType messageType : this.f80683c) {
            if (!"__reserved_namespace".equals(messageType.f80739b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageFilter) {
            MessageFilter messageFilter = (MessageFilter) obj;
            return this.f80685e == messageFilter.f80685e && sdg.m34949a(this.f80683c, messageFilter.f80683c) && sdg.m34949a(this.f80684d, messageFilter.f80684d) && sdg.m34949a(this.f80686f, messageFilter.f80686f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80683c, this.f80684d, Boolean.valueOf(this.f80685e), this.f80686f});
    }

    public final String toString() {
        boolean z = this.f80685e;
        String valueOf = String.valueOf(this.f80683c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo44310a(Message message) {
        int i;
        UUID uuid;
        int i2;
        Message message2 = message;
        if (message2 == null) {
            return false;
        }
        if ((!this.f80685e || message.mo44301a()) && !this.f80683c.contains(new MessageType(message2.f80678d, message2.f80677c))) {
            return false;
        }
        if (!message.mo44301a()) {
            return true;
        }
        for (NearbyDeviceFilter nearbyDeviceFilter : this.f80684d) {
            int i3 = nearbyDeviceFilter.f80715b;
            if (!message2.mo44302a("__eddystone_uid")) {
                i2 = message2.mo44302a("__i_beacon_id") ? 3 : 1;
            } else {
                i2 = 2;
            }
            if (i3 == i2) {
                byte[] bArr = nearbyDeviceFilter.f80716c;
                byte[] bArr2 = message2.f80676b;
                if (!(bArr2 == null || bArr == null || bArr2.length < bArr.length)) {
                    int i4 = 0;
                    while (i4 < bArr.length) {
                        if (bArr[i4] == bArr2[i4]) {
                            i4++;
                        }
                    }
                    return true;
                }
            }
            if (message2.mo44302a("__eddystone_url") && nearbyDeviceFilter.f80717d) {
                return true;
            }
        }
        for (BleFilter bleFilter : this.f80686f) {
            if ("__reserved_namespace".equals(message2.f80678d) && "__ble_record".equals(message2.f80677c)) {
                aizv a = aizv.m58304a(message);
                ParcelUuid parcelUuid = bleFilter.f80699b;
                if (parcelUuid != null) {
                    ParcelUuid parcelUuid2 = bleFilter.f80700c;
                    List list = a.f70189a;
                    if (list != null) {
                        if (parcelUuid2 != null) {
                            uuid = parcelUuid2.getUuid();
                        } else {
                            uuid = null;
                        }
                        int size = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                continue;
                                break;
                            }
                            UUID uuid2 = parcelUuid.getUuid();
                            UUID uuid3 = ((ParcelUuid) list.get(i5)).getUuid();
                            if (uuid != null) {
                                if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                                    break;
                                }
                            } else if (uuid2.equals(uuid3)) {
                                break;
                            }
                            i5++;
                        }
                    } else {
                        continue;
                    }
                }
                ParcelUuid parcelUuid3 = bleFilter.f80701d;
                if ((parcelUuid3 == null || BleFilter.m67398a(bleFilter.f80702e, bleFilter.f80703f, (byte[]) a.f70190b.get(parcelUuid3))) && ((i = bleFilter.f80704g) < 0 || BleFilter.m67398a(bleFilter.f80705h, bleFilter.f80706i, a.mo38346a(i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f80683c, false);
        see.m35066c(parcel, 2, this.f80684d, false);
        see.m35051a(parcel, 3, this.f80685e);
        see.m35066c(parcel, 4, this.f80686f, false);
        see.m35063b(parcel, 5, this.f80687g);
        see.m35063b(parcel, 1000, this.f80682b);
        see.m35062b(parcel, a);
    }
}

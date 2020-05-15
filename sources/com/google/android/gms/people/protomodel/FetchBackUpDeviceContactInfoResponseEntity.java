package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new amou();

    /* renamed from: a */
    private final List f82010a;

    /* renamed from: b */
    private List f82011b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.f82010a = list;
    }

    /* renamed from: a */
    public final List mo46425a() {
        List list;
        if (this.f82011b == null && (list = this.f82010a) != null) {
            this.f82011b = new ArrayList(list.size());
            List list2 = this.f82010a;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f82011b.add((BackedUpContactsPerDevice) list2.get(i));
            }
        }
        return this.f82011b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this != obj) {
            return sdg.m34949a(mo46425a(), ((FetchBackUpDeviceContactInfoResponse) obj).mo46425a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46425a()});
    }

    public FetchBackUpDeviceContactInfoResponseEntity(List list, byte[] bArr) {
        this.f82011b = list;
        if (list != null) {
            this.f82010a = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f82010a.add((BackedUpContactsPerDeviceEntity) ((BackedUpContactsPerDevice) list.get(i)));
            }
            return;
        }
        this.f82010a = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, mo46425a(), false);
        see.m35062b(parcel, a);
    }
}

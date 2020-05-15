package com.google.android.gms.netrec.scoring;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScoreNetworksRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akku();

    /* renamed from: a */
    public final List f81194a;

    public ScoreNetworksRequest(List list) {
        this.f81194a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return sdg.m34949a(this.f81194a, ((ScoreNetworksRequest) obj).f81194a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81194a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("wifiNetworkKeys", this.f81194a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f81194a, false);
        see.m35062b(parcel, a);
    }
}

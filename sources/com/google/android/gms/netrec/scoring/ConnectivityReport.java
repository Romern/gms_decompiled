package com.google.android.gms.netrec.scoring;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectivityReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akkr();

    /* renamed from: a */
    public final WifiNetworkKey f81181a;

    /* renamed from: b */
    public final boolean f81182b;

    /* renamed from: c */
    public final int f81183c;

    /* renamed from: d */
    public final int f81184d;

    public ConnectivityReport(WifiNetworkKey wifiNetworkKey, boolean z, int i, int i2) {
        sdo.checkIfNull(wifiNetworkKey, "A non-null WifiNetworkKey must be provided.");
        this.f81181a = wifiNetworkKey;
        this.f81182b = z;
        this.f81183c = i;
        this.f81184d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConnectivityReport connectivityReport = (ConnectivityReport) obj;
            return this.f81182b == connectivityReport.f81182b && this.f81183c == connectivityReport.f81183c && this.f81184d == connectivityReport.f81184d && sdg.m34949a(this.f81181a, connectivityReport.f81181a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81181a, Boolean.valueOf(this.f81182b), Integer.valueOf(this.f81183c), Integer.valueOf(this.f81184d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("wifiNetworkKey", this.f81181a);
        a.mo25396a("hasConnectivity", Boolean.valueOf(this.f81182b));
        a.mo25396a("connectivityReason", Integer.valueOf(this.f81183c));
        a.mo25396a("blacklistSeconds", Integer.valueOf(this.f81184d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81181a, i, false);
        see.m35051a(parcel, 2, this.f81182b);
        see.m35063b(parcel, 3, this.f81183c);
        see.m35063b(parcel, 4, this.f81184d);
        see.m35062b(parcel, a);
    }
}

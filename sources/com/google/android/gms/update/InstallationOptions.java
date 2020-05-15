package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstallationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avkn();

    /* renamed from: a */
    public final boolean f109448a;

    /* renamed from: b */
    public final boolean f109449b;

    /* renamed from: c */
    public final boolean f109450c;

    /* renamed from: d */
    public final boolean f109451d;

    public InstallationOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f109448a = z;
        this.f109449b = z2;
        this.f109450c = z3;
        this.f109451d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InstallationOptions) {
            InstallationOptions installationOptions = (InstallationOptions) obj;
            if (this.f109448a == installationOptions.f109448a && this.f109449b == installationOptions.f109449b && this.f109450c == installationOptions.f109450c && this.f109451d == installationOptions.f109451d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109448a), Boolean.valueOf(this.f109449b), Boolean.valueOf(this.f109450c), Boolean.valueOf(this.f109451d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ignoreDeviceIdleCondition", Boolean.valueOf(this.f109448a));
        a.mo25396a("ignoreMaintenanceWindow", Boolean.valueOf(this.f109449b));
        a.mo25396a("ignoreServerPostponeAbInstallationConfig", Boolean.valueOf(this.f109450c));
        a.mo25396a("ignoreOptionalPostInstall", Boolean.valueOf(this.f109451d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f109448a);
        see.m35051a(parcel, 2, this.f109449b);
        see.m35051a(parcel, 3, this.f109450c);
        see.m35051a(parcel, 4, this.f109451d);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleDevicesResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfp();

    /* renamed from: a */
    public final List f32325a;

    /* renamed from: b */
    public final Status f32326b;

    public BleDevicesResult(List list, Status status) {
        this.f32325a = Collections.unmodifiableList(list);
        this.f32326b = status;
    }

    /* renamed from: a */
    public static BleDevicesResult m23710a(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32326b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BleDevicesResult)) {
                return false;
            }
            BleDevicesResult bleDevicesResult = (BleDevicesResult) obj;
            if (!this.f32326b.equals(bleDevicesResult.f32326b) || !sdg.m34949a(this.f32325a, bleDevicesResult.f32325a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32326b, this.f32325a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32326b);
        a.mo25396a("bleDevices", this.f32325a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32325a, false);
        see.m35040a(parcel, 2, this.f32326b, i, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncInfoResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zgd();

    /* renamed from: a */
    public final Status f32364a;

    /* renamed from: b */
    public final long f32365b;

    /* renamed from: c */
    public final Boolean f32366c;

    public SyncInfoResult(Status status, long j, Boolean bool) {
        this.f32364a = status;
        this.f32365b = j;
        this.f32366c = bool;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32364a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SyncInfoResult)) {
                return false;
            }
            SyncInfoResult syncInfoResult = (SyncInfoResult) obj;
            if (!this.f32364a.equals(syncInfoResult.f32364a) || !sdg.m34949a(Long.valueOf(this.f32365b), Long.valueOf(syncInfoResult.f32365b))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32364a, Long.valueOf(this.f32365b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32364a);
        a.mo25396a("timestamp", Long.valueOf(this.f32365b));
        a.mo25396a("syncEnabled", this.f32366c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32364a, i, false);
        see.m35036a(parcel, 2, this.f32365b);
        see.m35041a(parcel, 3, this.f32366c);
        see.m35062b(parcel, a);
    }
}

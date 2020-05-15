package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListSubscriptionsResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfz();

    /* renamed from: a */
    public final List f32356a;

    /* renamed from: b */
    public final Status f32357b;

    public ListSubscriptionsResult(List list, Status status) {
        this.f32356a = list;
        this.f32357b = status;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32357b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ListSubscriptionsResult)) {
                return false;
            }
            ListSubscriptionsResult listSubscriptionsResult = (ListSubscriptionsResult) obj;
            if (!this.f32357b.equals(listSubscriptionsResult.f32357b) || !sdg.m34949a(this.f32356a, listSubscriptionsResult.f32356a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32357b, this.f32356a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32357b);
        a.mo25396a("subscriptions", this.f32356a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32356a, false);
        see.m35040a(parcel, 2, this.f32357b, i, false);
        see.m35062b(parcel, a);
    }
}

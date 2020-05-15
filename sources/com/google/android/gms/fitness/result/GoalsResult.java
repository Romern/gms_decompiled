package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoalsResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfy();

    /* renamed from: a */
    public final Status f32354a;

    /* renamed from: b */
    public final List f32355b;

    public GoalsResult(Status status, List list) {
        this.f32354a = status;
        this.f32355b = list;
    }

    /* renamed from: a */
    public static GoalsResult m23724a(Status status) {
        return new GoalsResult(status, Collections.emptyList());
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32354a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32354a, i, false);
        see.m35066c(parcel, 2, this.f32355b, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ImmutableDetectionHistory extends ldf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ldi();

    /* renamed from: a */
    private final bngx f11675a;

    public ImmutableDetectionHistory(List list) {
        this.f11675a = bngx.m109368a((Collection) list);
    }

    /* renamed from: a */
    public static final ImmutableDetectionHistory m7172a(ldf ldf) {
        return new ImmutableDetectionHistory(bngx.m109368a((Collection) ((DetectionHistory) ldf).mo7979a()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo7979a() {
        return this.f11675a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f11675a);
    }
}

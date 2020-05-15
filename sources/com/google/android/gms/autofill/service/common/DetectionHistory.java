package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DetectionHistory extends ldf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ldh();

    /* renamed from: a */
    private final List f11674a;

    public DetectionHistory() {
        this.f11674a = new ArrayList();
    }

    /* renamed from: d */
    public final bngx mo7979a() {
        return bngx.m109368a((Collection) this.f11674a);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f11674a);
    }

    /* renamed from: a */
    public final void mo7980a(Collection collection) {
        this.f11674a.addAll(collection);
    }

    public DetectionHistory(Collection collection) {
        ArrayList arrayList = new ArrayList();
        this.f11674a = arrayList;
        arrayList.addAll(collection);
    }

    /* renamed from: a */
    public final void mo7981a(AbstractDetectionHistory$DetectionResult... abstractDetectionHistory$DetectionResultArr) {
        Collections.addAll(this.f11674a, abstractDetectionHistory$DetectionResultArr);
    }
}

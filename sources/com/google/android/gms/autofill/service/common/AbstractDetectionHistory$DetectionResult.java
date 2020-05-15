package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillForm;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractDetectionHistory$DetectionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lde();

    /* renamed from: a */
    public static AbstractDetectionHistory$DetectionResult m7160a(FillForm fillForm, Iterable iterable) {
        return new AutoValue_AbstractDetectionHistory_DetectionResult(bmxv.m108567c(fillForm), bngx.m109355a(iterable));
    }

    /* renamed from: a */
    public abstract bmxv mo7969a();

    /* renamed from: b */
    public abstract bngx mo7970b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bmxv a = mo7969a();
        parcel.writeInt(a.mo66813a() ? 1 : 0);
        if (a.mo66813a()) {
            parcel.writeTypedObject((FillForm) a.mo66814b(), i);
        }
        parcel.writeTypedList(mo7970b());
    }
}

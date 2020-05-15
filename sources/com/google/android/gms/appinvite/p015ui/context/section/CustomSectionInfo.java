package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CustomSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new fyh();

    /* renamed from: a */
    private final int[] f9786a;

    public CustomSectionInfo(Parcel parcel) {
        super(parcel);
        this.f9786a = parcel.createIntArray();
    }

    /* renamed from: a */
    public final fxg mo7291a(fwo fwo, int i) {
        return new fxh(fwo, this.f9786a, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeIntArray(this.f9786a);
    }

    public CustomSectionInfo(int[] iArr) {
        this.f9786a = iArr;
    }
}

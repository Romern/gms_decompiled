package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.SectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class SectionInfo implements ReflectedParcelable {

    /* renamed from: p */
    public boolean f9803p;

    public SectionInfo() {
    }

    /* renamed from: a */
    public abstract fxg mo7291a(fwo fwo, int i);

    /* renamed from: b */
    public fxg mo7296b(fwo fwo, int i) {
        return mo7291a(fwo, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9803p ? 1 : 0);
    }

    public SectionInfo(Parcel parcel) {
        this.f9803p = parcel.readInt() != 0;
    }
}

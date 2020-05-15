package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DashboardDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wib();

    /* renamed from: a */
    public final PageDataMap f31337a;

    /* renamed from: b */
    public final boolean f31338b;

    /* renamed from: c */
    public final brcm f31339c;

    /* renamed from: d */
    public final ViewerDataModel f31340d;

    /* renamed from: e */
    public final PageData f31341e;

    /* renamed from: f */
    public final boolean f31342f;

    public DashboardDataModel(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f31338b = z;
        brcm a = brcm.m113875a(parcel.readInt());
        this.f31339c = a == null ? brcm.UNKNOWN_FAMILY_ROLE : a;
        this.f31337a = (PageDataMap) parcel.readParcelable(PageDataMap.class.getClassLoader());
        this.f31340d = (ViewerDataModel) parcel.readParcelable(ViewerDataModel.class.getClassLoader());
        if (parcel.readInt() == 1) {
            this.f31341e = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
        } else {
            this.f31341e = null;
        }
        this.f31342f = parcel.readInt() == 1 ? true : z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f31338b ? 1 : 0);
        parcel.writeInt(this.f31339c.f142395g);
        parcel.writeParcelable(this.f31337a, i);
        parcel.writeParcelable(this.f31340d, i);
        if (this.f31341e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        PageData pageData = this.f31341e;
        if (pageData != null) {
            parcel.writeParcelable(pageData, i);
        }
        parcel.writeInt(this.f31342f ? 1 : 0);
    }

    public DashboardDataModel(boolean z, PageDataMap pageDataMap, ViewerDataModel viewerDataModel, brcm brcm, PageData pageData) {
        this.f31337a = pageDataMap;
        this.f31338b = z;
        this.f31339c = brcm;
        this.f31340d = viewerDataModel;
        this.f31341e = pageData;
        this.f31342f = false;
    }
}

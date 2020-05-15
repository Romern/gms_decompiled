package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.PageDataMap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PageDataMap implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqt();

    /* renamed from: a */
    private final SparseArray f31457a = new SparseArray();

    public PageDataMap() {
    }

    /* renamed from: a */
    public final PageData mo18558a(int i) {
        return (PageData) this.f31457a.get(i);
    }

    /* renamed from: b */
    public final boolean mo18560b(int i) {
        return this.f31457a.get(i) != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31457a.size());
        for (int i2 = 0; i2 < this.f31457a.size(); i2++) {
            int keyAt = this.f31457a.keyAt(i2);
            parcel.writeInt(keyAt);
            ((PageData) this.f31457a.get(keyAt)).writeToParcel(parcel, i);
        }
    }

    public PageDataMap(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f31457a.put(parcel.readInt(), (PageData) PageData.CREATOR.createFromParcel(parcel));
        }
    }

    /* renamed from: a */
    public final void mo18559a(int i, PageData pageData) {
        this.f31457a.put(i, pageData);
    }
}

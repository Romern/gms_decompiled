package com.google.android.gms.walletp2p.feature.rpcclient.types;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LegalDocuments implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axik();

    /* renamed from: a */
    public final List f110683a;

    public LegalDocuments(List list) {
        this.f110683a = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110683a.size());
        for (bttm bttm : this.f110683a) {
            parcel.writeByteArray(bttm.mo73642k());
        }
    }
}

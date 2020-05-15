package com.google.android.wallet.common.moduleapicalltasks;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySeFetchCardAsyncTaskLoaderResponse extends ModuleApiCallTaskLoaderResponse {
    public static final Parcelable.Creator CREATOR = new bjuk();

    /* renamed from: a */
    public final ArrayList f151811a;

    public PaySeFetchCardAsyncTaskLoaderResponse(ArrayList arrayList) {
        this.f151811a = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104740a(this.f151811a, parcel);
    }
}

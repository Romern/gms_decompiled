package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnListEntriesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator CREATOR = new uue();

    /* renamed from: b */
    public final DataHolder f30889b;

    /* renamed from: c */
    public final boolean f30890c;

    public OnListEntriesResponse(DataHolder dataHolder, boolean z) {
        this.f30889b = dataHolder;
        this.f30890c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18132a(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30889b, i, false);
        see.m35051a(parcel, 3, this.f30890c);
        see.m35062b(parcel, a);
    }
}

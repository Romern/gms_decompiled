package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FenceUpdateRequestImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tkr();

    /* renamed from: a */
    public final ArrayList f30661a;

    @Deprecated
    public FenceUpdateRequestImpl() {
        this(new ArrayList());
    }

    public FenceUpdateRequestImpl(ArrayList arrayList) {
        this.f30661a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30661a, false);
        see.m35062b(parcel, a);
    }
}

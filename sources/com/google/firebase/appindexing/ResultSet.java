package com.google.firebase.appindexing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResultSet extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new bria();

    /* renamed from: a */
    final List f152340a;

    public ResultSet(List list) {
        this.f152340a = list;
    }

    public final Iterator iterator() {
        return this.f152340a.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f152340a, false);
        see.m35062b(parcel, a);
    }
}

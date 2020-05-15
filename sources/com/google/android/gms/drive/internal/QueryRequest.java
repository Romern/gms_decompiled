package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Query;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class QueryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uup();

    /* renamed from: a */
    public final Query f30910a;

    public QueryRequest(Query query) {
        this.f30910a = query;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30910a, i, false);
        see.m35062b(parcel, a);
    }
}

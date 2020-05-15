package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RealtimeDocumentSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new txf();

    /* renamed from: a */
    public final List f30747a;

    /* renamed from: b */
    public final List f30748b;

    public RealtimeDocumentSyncRequest(List list, List list2) {
        sdo.m34959a(list);
        this.f30747a = list;
        sdo.m34959a(list2);
        this.f30748b = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 2, this.f30747a, false);
        see.m35065b(parcel, 3, this.f30748b, false);
        see.m35062b(parcel, a);
    }
}

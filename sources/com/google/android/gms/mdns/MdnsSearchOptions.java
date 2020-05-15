package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdnsSearchOptions extends AbstractSafeParcelable implements rjh {
    public static final Parcelable.Creator CREATOR = new agaw();

    /* renamed from: a */
    public final List f80069a;

    /* renamed from: b */
    public final boolean f80070b;

    public MdnsSearchOptions(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f80069a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f80070b = z;
    }

    /* renamed from: a */
    public static agav m67243a() {
        return new agav();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 2, this.f80069a, false);
        see.m35051a(parcel, 3, this.f80070b);
        see.m35062b(parcel, a);
    }
}

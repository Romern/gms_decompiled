package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchPasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hvg();

    /* renamed from: a */
    public final List f10237a;

    /* renamed from: b */
    public final boolean f10238b;

    public MatchPasswordResult(List list, boolean z) {
        this.f10237a = list;
        this.f10238b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f10237a, false);
        see.m35051a(parcel, 2, this.f10238b);
        see.m35062b(parcel, a);
    }
}

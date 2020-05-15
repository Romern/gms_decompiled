package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListSignInCredentialsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hvf();

    /* renamed from: a */
    public final List f10236a;

    public ListSignInCredentialsResult(List list) {
        sdo.m34975b(!list.isEmpty(), "An error status should be returned if no qualified credentials were found.");
        this.f10236a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f10236a, false);
        see.m35062b(parcel, a);
    }
}

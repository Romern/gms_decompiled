package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAccountInfoUserList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brqn();

    /* renamed from: a */
    public List f152525a;

    public GetAccountInfoUserList() {
        this.f152525a = new ArrayList();
    }

    /* renamed from: a */
    public static GetAccountInfoUserList m118898a() {
        return new GetAccountInfoUserList();
    }

    public GetAccountInfoUserList(List list) {
        this.f152525a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f152525a, false);
        see.m35062b(parcel, a);
    }
}

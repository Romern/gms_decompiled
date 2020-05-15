package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientLanguageSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adup();

    /* renamed from: a */
    public final List f79264a;

    public ClientLanguageSettings(List list) {
        this.f79264a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 1, this.f79264a, false);
        see.m35062b(parcel, a);
    }
}

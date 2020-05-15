package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahbw();

    /* renamed from: a */
    public final Uri f80390a;

    /* renamed from: b */
    public final int f80391b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.f80390a = uri;
        this.f80391b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80390a, i, false);
        see.m35063b(parcel, 2, this.f80391b);
        see.m35062b(parcel, a);
    }
}

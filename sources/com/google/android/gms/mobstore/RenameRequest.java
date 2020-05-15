package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahby();

    /* renamed from: a */
    public final Uri f80393a;

    /* renamed from: b */
    public final Uri f80394b;

    public RenameRequest(Uri uri, Uri uri2) {
        this.f80393a = uri;
        this.f80394b = uri2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80393a, i, false);
        see.m35040a(parcel, 2, this.f80394b, i, false);
        see.m35062b(parcel, a);
    }
}

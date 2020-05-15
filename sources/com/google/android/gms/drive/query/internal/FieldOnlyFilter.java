package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldOnlyFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new vgj();

    /* renamed from: a */
    final MetadataBundle f31099a;

    /* renamed from: b */
    private final uvy f31100b;

    public FieldOnlyFilter(MetadataBundle metadataBundle) {
        this.f31099a = metadataBundle;
        this.f31100b = vgm.m40389a(metadataBundle);
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        return vgn.mo28323a(this.f31100b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31099a, i, false);
        see.m35062b(parcel, a);
    }

    public FieldOnlyFilter(uwb uwb) {
        this(MetadataBundle.m23057a(uwb, null));
    }
}

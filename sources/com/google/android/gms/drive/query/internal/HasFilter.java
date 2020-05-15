package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HasFilter extends AbstractFilter {
    public static final vgq CREATOR = new vgq();

    /* renamed from: a */
    final MetadataBundle f31114a;

    /* renamed from: b */
    final uvy f31115b;

    public HasFilter(MetadataBundle metadataBundle) {
        this.f31114a = metadataBundle;
        this.f31115b = vgm.m40389a(metadataBundle);
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        uvy uvy = this.f31115b;
        return vgn.mo28324a(uvy, this.f31114a.mo18269a(uvy));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31114a, i, false);
        see.m35062b(parcel, a);
    }
}

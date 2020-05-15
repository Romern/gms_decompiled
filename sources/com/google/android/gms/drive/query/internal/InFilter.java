package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InFilter extends AbstractFilter {
    public static final vgr CREATOR = new vgr();

    /* renamed from: a */
    final MetadataBundle f31116a;

    /* renamed from: b */
    private final uvu f31117b;

    public InFilter(MetadataBundle metadataBundle) {
        this.f31116a = metadataBundle;
        this.f31117b = (uvu) vgm.m40389a(metadataBundle);
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        uvu uvu = this.f31117b;
        return vgn.mo28322a(uvu, ((Collection) this.f31116a.mo18269a(uvu)).iterator().next());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31116a, i, false);
        see.m35062b(parcel, a);
    }
}

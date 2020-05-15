package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComparisonFilter extends AbstractFilter {
    public static final vgi CREATOR = new vgi();

    /* renamed from: a */
    final Operator f31096a;

    /* renamed from: b */
    final MetadataBundle f31097b;

    /* renamed from: c */
    final uvy f31098c;

    public ComparisonFilter(Operator operator, MetadataBundle metadataBundle) {
        this.f31096a = operator;
        this.f31097b = metadataBundle;
        this.f31098c = vgm.m40389a(metadataBundle);
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        Operator operator = this.f31096a;
        uvy uvy = this.f31098c;
        return vgn.mo28319a(operator, uvy, this.f31097b.mo18269a(uvy));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31096a, i, false);
        see.m35040a(parcel, 2, this.f31097b, i, false);
        see.m35062b(parcel, a);
    }
}

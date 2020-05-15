package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnChangesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator CREATOR = new utx();

    /* renamed from: b */
    public final DataHolder f30868b;

    /* renamed from: c */
    final List f30869c;

    /* renamed from: d */
    final ChangeSequenceNumber f30870d;

    /* renamed from: e */
    final boolean f30871e;

    public OnChangesResponse(DataHolder dataHolder, List list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.f30868b = dataHolder;
        this.f30869c = list;
        this.f30870d = changeSequenceNumber;
        this.f30871e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18132a(Parcel parcel, int i) {
        int i2 = i | 1;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30868b, i2, false);
        see.m35066c(parcel, 3, this.f30869c, false);
        see.m35040a(parcel, 4, this.f30870d, i2, false);
        see.m35051a(parcel, 5, this.f30871e);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new swv();

    /* renamed from: a */
    public final int f30459a;

    /* renamed from: b */
    public final DataHolder f30460b;

    /* renamed from: c */
    public final long f30461c;

    /* renamed from: d */
    public final DataHolder f30462d;

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, long j, DataHolder dataHolder2) {
        this.f30459a = i;
        this.f30460b = dataHolder;
        this.f30461c = j;
        this.f30462d = dataHolder2;
    }

    /* renamed from: a */
    public final void mo17966a() {
        DataHolder dataHolder = this.f30460b;
        if (dataHolder != null && !dataHolder.mo17768b()) {
            this.f30460b.close();
        }
    }

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, DataHolder dataHolder2) {
        this(i, dataHolder, -1, dataHolder2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30459a);
        see.m35040a(parcel, 3, this.f30460b, i, false);
        see.m35036a(parcel, 4, this.f30461c);
        see.m35040a(parcel, 5, this.f30462d, i, false);
        see.m35062b(parcel, a);
    }
}

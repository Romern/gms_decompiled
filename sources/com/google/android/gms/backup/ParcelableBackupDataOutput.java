package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableBackupDataOutput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new luu();

    /* renamed from: a */
    public final ParcelFileDescriptor f28991a;

    public ParcelableBackupDataOutput(ParcelFileDescriptor parcelFileDescriptor) {
        sdo.m34959a(parcelFileDescriptor);
        this.f28991a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final void mo17212a(lsu lsu) {
        lst.m24354a(lsu, this.f28991a);
    }

    public final void close() {
        this.f28991a.close();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f28991a, i, false);
        see.m35062b(parcel, a);
    }
}

package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableBackupDataInput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new lut();

    /* renamed from: a */
    public final ParcelFileDescriptor f28990a;

    public ParcelableBackupDataInput(ParcelFileDescriptor parcelFileDescriptor) {
        sdo.m34959a(parcelFileDescriptor);
        this.f28990a = parcelFileDescriptor;
    }

    public final void close() {
        this.f28990a.close();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f28990a, i, false);
        see.m35062b(parcel, a);
    }
}

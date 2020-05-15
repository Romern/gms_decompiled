package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FileUploadPreferencesImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new utd();

    /* renamed from: a */
    int f30848a;

    /* renamed from: b */
    int f30849b;

    /* renamed from: c */
    public boolean f30850c;

    public FileUploadPreferencesImpl(int i, int i2, boolean z) {
        this.f30848a = i;
        this.f30849b = i2;
        this.f30850c = z;
    }

    /* renamed from: a */
    public final int mo18192a() {
        int i = this.f30848a;
        if (i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo18193b() {
        int i = this.f30849b;
        if (i == 256 || i == 257) {
            return i;
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30848a);
        see.m35063b(parcel, 3, this.f30849b);
        see.m35051a(parcel, 4, this.f30850c);
        see.m35062b(parcel, a);
    }
}

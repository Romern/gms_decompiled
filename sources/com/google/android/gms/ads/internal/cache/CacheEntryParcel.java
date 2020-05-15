package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CacheEntryParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0321c();

    /* renamed from: a */
    private ParcelFileDescriptor f8080a;

    public CacheEntryParcel() {
        this(null);
    }

    /* renamed from: a */
    public final synchronized boolean mo6554a() {
        return this.f8080a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream mo6555b() {
        ParcelFileDescriptor parcelFileDescriptor = this.f8080a;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f8080a = null;
        return autoCloseInputStream;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized ParcelFileDescriptor mo6556c() {
        return this.f8080a;
    }

    public CacheEntryParcel(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8080a = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, mo6556c(), i, false);
        see.m35062b(parcel, a);
    }
}

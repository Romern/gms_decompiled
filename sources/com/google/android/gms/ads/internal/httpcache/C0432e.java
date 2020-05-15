package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.internal.httpcache.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0432e extends dck implements C0433f {

    /* renamed from: a */
    final /* synthetic */ C0648g f8395a;

    public C0432e() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* renamed from: a */
    public final void mo6633a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8395a.mo6830a(parcelFileDescriptor);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0432e(C0648g gVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f8395a = gVar;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo6633a((ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}

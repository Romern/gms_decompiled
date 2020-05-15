package com.google.android.gms.ads.nonagon.load.service;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.request.C0546g;
import com.google.android.gms.ads.internal.util.C0678z;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import com.google.android.gms.ads.nonagon.load.C0764a;
import com.google.android.gms.ads.nonagon.util.C0846b;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0776l implements bqfp {

    /* renamed from: a */
    final /* synthetic */ C0546g f9194a;

    public C0776l(C0546g gVar) {
        this.f9194a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            C0546g gVar = this.f9194a;
            Parcel bj = gVar.mo8529bj();
            dcl.m8165a(bj, parcelFileDescriptor);
            gVar.mo8528b(1, bj);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        AdErrorParcel adErrorParcel;
        String str;
        try {
            C0546g gVar = this.f9194a;
            if (th instanceof C0764a) {
                C0764a aVar = (C0764a) th;
                if (aVar.getMessage() != null) {
                    adErrorParcel = C0846b.m6030a(aVar.f9178a, aVar.getMessage());
                } else {
                    adErrorParcel = C0846b.m6029a(aVar.f9178a);
                }
            } else if (!(th instanceof C0678z)) {
                adErrorParcel = C0846b.m6029a(1);
            } else {
                C0678z zVar = (C0678z) th;
                throw null;
            }
            if (bmxx.m108577a(th.getMessage())) {
                str = adErrorParcel.f8116b;
            } else {
                str = th.getMessage();
            }
            ExceptionParcel exceptionParcel = new ExceptionParcel(str, adErrorParcel.f8115a);
            Parcel bj = gVar.mo8529bj();
            dcl.m8165a(bj, exceptionParcel);
            gVar.mo8528b(2, bj);
        } catch (RemoteException e) {
        }
    }
}

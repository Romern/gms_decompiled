package com.google.android.gms.ads.internal.request.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0545f;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.request.service.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0555e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AdRequestInfoParcel f8732a;

    /* renamed from: b */
    final /* synthetic */ C0557g f8733b;

    /* renamed from: c */
    final /* synthetic */ C0545f f8734c;

    public C0555e(C0557g gVar, AdRequestInfoParcel adRequestInfoParcel, C0545f fVar) {
        this.f8733b = gVar;
        this.f8732a = adRequestInfoParcel;
        this.f8734c = fVar;
    }

    public final void run() {
        AdResponseParcel adResponseParcel;
        try {
            adResponseParcel = this.f8733b.mo6728a(this.f8732a);
        } catch (Exception e) {
            C0387d.m5366d().mo6783a(e, "AdRequestServiceImpl.loadAdAsync");
            C0633h.m5673d("Could not fetch ad response due to an Exception.", e);
            adResponseParcel = null;
        }
        if (adResponseParcel == null) {
            adResponseParcel = new AdResponseParcel(0);
        }
        try {
            C0545f fVar = this.f8734c;
            Parcel bj = fVar.mo8529bj();
            dcl.m8165a(bj, adResponseParcel);
            fVar.mo8528b(1, bj);
        } catch (RemoteException e2) {
            C0633h.m5673d("Fail to forward ad response.", e2);
        }
    }
}

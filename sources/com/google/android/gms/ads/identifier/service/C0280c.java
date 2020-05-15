package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.ads.eventattestation.internal.AdvertisingIdParcel;
import com.google.android.gms.ads.eventattestation.internal.C0251h;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.ads.identifier.service.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0280c extends aaab {

    /* renamed from: a */
    private final C0251h f8008a;

    public C0280c(C0251h hVar) {
        super(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, "FetchAdvertisingId");
        this.f8008a = hVar;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        C0287e a = C0287e.m5194a(context);
        AdvertisingIdParcel advertisingIdParcel = new AdvertisingIdParcel(a.mo6512c(), a.mo6518i());
        C0251h hVar = this.f8008a;
        Parcel bj = hVar.mo8529bj();
        dcl.m8165a(bj, advertisingIdParcel);
        hVar.mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        C0251h hVar = this.f8008a;
        String str = status.f30116j;
        Parcel bj = hVar.mo8529bj();
        bj.writeInt(1);
        bj.writeString(str);
        hVar.mo8530c(3, bj);
    }
}

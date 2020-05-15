package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0247d extends sbm {
    public C0247d(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return wei.f50589c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
        if (queryLocalInterface instanceof C0254k) {
            return (C0254k) queryLocalInterface;
        }
        return new C0252i(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.ads.eventattestation.internal.IEventAttestationService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19729000;
    }
}

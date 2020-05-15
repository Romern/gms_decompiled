package com.google.android.gms.fido.u2f.service;

import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class U2fChimeraService extends sjh {

    /* renamed from: a */
    private static final bnic f31971a = bnic.m109490a("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    /* JADX WARNING: Illegal instructions before constructor call */
    public U2fChimeraService() {
        super(r2, r3, r4, 3, 9);
        bnic bnic;
        int[] iArr = {119, 118, 117};
        String[] strArr = {"com.google.android.gms.fido.u2f.zeroparty.START", "com.google.android.gms.fido.u2f.privileged.START", "com.google.android.gms.fido.u2f.thirdparty.START"};
        if (cdwo.m135169b()) {
            bnic = f31971a;
        } else {
            bnic = sft.m35178d();
        }
    }

    /* renamed from: a */
    private final sjn m23654a() {
        return sjn.m35483a(this, this.f44565c, this.f44566d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        String string = getServiceRequest.f30233g.getString("ACTION_START_SERVICE");
        if ("com.google.android.gms.fido.u2f.zeroparty.START".equals(string)) {
            if (spn.m35869b()) {
                sjj.mo25645a(new ybk(m23654a(), str));
                return;
            }
            throw new SecurityException("0P only API being called from outside GMSCore!");
        } else if ("com.google.android.gms.fido.u2f.privileged.START".equals(string)) {
            sjj.mo25645a(new ybj(m23654a()));
        } else if ("com.google.android.gms.fido.u2f.thirdparty.START".equals(string)) {
            sjj.mo25645a(new ybi(m23654a()));
        }
    }
}

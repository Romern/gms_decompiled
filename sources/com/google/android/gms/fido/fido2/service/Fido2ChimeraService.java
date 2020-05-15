package com.google.android.gms.fido.fido2.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Fido2ChimeraService extends zzx {

    /* renamed from: a */
    public static final sek f31852a = new sek(new String[]{"Fido2ChimeraService"}, (short[]) null);

    /* renamed from: b */
    private static final bnic f31853b = bnic.m109490a("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    /* renamed from: k */
    private aaag f31854k;

    /* JADX WARNING: Illegal instructions before constructor call */
    public Fido2ChimeraService() {
        super(r2, r3, r4, 3, 9);
        bnic bnic;
        int[] iArr = {149, 148, 180};
        String[] strArr = {"com.google.android.gms.fido.fido2.privileged.START", "com.google.android.gms.fido.fido2.regular.START", "com.google.android.gms.fido.fido2.zeroparty.START"};
        if (cdwo.m135169b()) {
            bnic = f31853b;
        } else {
            bnic = sft.m35178d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String string = getServiceRequest.f30233g.getString("FIDO2_ACTION_START_SERVICE");
        String str = getServiceRequest.f30230d;
        if (this.f31854k == null) {
            this.f31854k = new aaag(this, this.f56354e, this.f56355f);
        }
        if ("com.google.android.gms.fido.fido2.privileged.START".equals(string)) {
            aaac.mo16652a(new xuj(this.f31854k));
        } else if ("com.google.android.gms.fido.fido2.regular.START".equals(string)) {
            aaac.mo16652a(new xui(this.f31854k, str));
        } else if (!"com.google.android.gms.fido.fido2.zeroparty.START".equals(string)) {
        } else {
            if (spn.m35869b()) {
                aaac.mo16652a(new xum(this, this.f31854k, str));
            } else {
                aaac.mo16650a(10, (Bundle) null);
            }
        }
    }
}

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferChimeraService extends zzx {

    /* renamed from: a */
    public static final sbw f10038a = new sbw("AccountTransfer", "[ATChimeraService]");

    public AccountTransferChimeraService() {
        super(128, "com.google.android.gms.auth.api.accounttransfer.service.START", Collections.emptySet(), 3, 9);
    }

    /* renamed from: a */
    public static DeviceAuthInfo m6316a(Bundle bundle) {
        return (DeviceAuthInfo) sef.m35069a(bundle.getByteArray("deviceAuth"), DeviceAuthInfo.CREATOR);
    }

    /* renamed from: b */
    public static ArrayList m6317b(Bundle bundle) {
        return bundle.getStringArrayList("accountTypes");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new gsx(this, aaag.m21013a(), getServiceRequest));
    }
}

package com.google.android.gms.trustlet.face.p074ui;

import android.os.Bundle;

/* renamed from: com.google.android.gms.trustlet.face.ui.GoogleTrustAgentFaceUnlockChimeraSettings */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentFaceUnlockChimeraSettings extends aupg {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final dns mo50789e() {
        return new auur();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50790g() {
        return "FACE_UNLOCK_FRAGMENT_TAG";
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = 7;
        bohi.f133071a |= 4096;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }
}

package com.google.android.gms.tapandpay.diagnostics.data;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcStatusItemLiveData$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ asls f108324a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NfcStatusItemLiveData$1(asls asls, String str) {
        super(str);
        this.f108324a = asls;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
        if (intExtra == 2) {
            this.f108324a.mo2450b(aslx.LOADING);
        } else if (intExtra != 3) {
            this.f108324a.mo2450b(aslx.INCORRECT);
        } else {
            this.f108324a.mo2450b(aslx.CORRECT);
        }
    }
}

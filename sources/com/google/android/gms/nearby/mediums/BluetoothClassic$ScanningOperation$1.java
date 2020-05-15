package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothClassic$ScanningOperation$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ aijg f80647a;

    /* renamed from: b */
    final /* synthetic */ ahoi f80648b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClassic$ScanningOperation$1(aijg aijg, String str, ahoi ahoi) {
        super(str);
        this.f80647a = aijg;
        this.f80648b = ahoi;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1", "a", 876, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring Bluetooth Classic scan result because the broadcasted intent is null.");
            return;
        }
        aijg aijg = this.f80647a;
        aijg.f68955b.execute(new aijf(this, intent, this.f80648b));
    }
}

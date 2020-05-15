package com.google.location.nearby.direct.bluetooth.state;

import android.bluetooth.le.ScanResult;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastPairScanner$1 extends aacm {

    /* renamed from: a */
    public final /* synthetic */ buyc f191765a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairScanner$1(buyc buyc, String str, String str2) {
        super(str, str2);
        this.f191765a = buyc;
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("FastPairScanner: onScanFailed, error code=%d", i);
        buyc buyc = this.f191765a;
        int i2 = buyc.f155286l;
        buyc.f155288a.mo72987c(buyc.f155292e);
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        if (scanResult.getScanRecord() != null) {
            buyc buyc = this.f191765a;
            int i2 = buyc.f155286l;
            buyb buyb = buyc.f155296i;
            if (buyb != null) {
                buyb.f155284c++;
            }
            buyc.f155288a.mo72987c(new buxw(this, "FastPairScanner_onScanResult", i, scanResult));
        }
    }
}

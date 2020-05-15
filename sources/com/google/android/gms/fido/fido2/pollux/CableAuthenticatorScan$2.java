package com.google.android.gms.fido.fido2.pollux;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CableAuthenticatorScan$2 extends aacm {

    /* renamed from: a */
    public final /* synthetic */ xsz f31848a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CableAuthenticatorScan$2(xsz xsz, String str, String str2) {
        super(str, str2);
        this.f31848a = xsz;
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        xsz xsz = this.f31848a;
        sek sek = xsz.f53015k;
        if (xsz.f53021f.compareAndSet(xsy.SCANNING, xsy.SCAN_COMPLETED)) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Scan failed with errorCode= ");
            sb.append(i);
            this.f31848a.f53025j.mo30115a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        bqgg bqgg;
        try {
            xsz xsz = this.f31848a;
            sek sek = xsz.f53015k;
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                byte[] a = xjl.m43051a(scanRecord, xsz.m43376b());
                if (a != null) {
                    xsz.f53015k.mo25414c("Found EID for standard advertisement: 0x%s", srv.m36164d(a));
                    bqgg = xsz.f53017b.mo30127a(a);
                } else {
                    byte[] b = xjl.m43053b(scanRecord, xsz.m43376b());
                    if (b != null) {
                        xsz.f53015k.mo25414c("Found EID for Mac advertisement: 0x%s", srv.m36164d(b));
                        bqgg = xsz.f53017b.mo30127a(b);
                    } else {
                        byte[] a2 = xjl.m43050a(scanRecord);
                        if (a2 != null) {
                            xsz.f53015k.mo25414c("Found EID for Windows advertisement: 0x%s", srv.m36164d(a2));
                            bqgg = xsz.f53017b.mo30127a(a2);
                        } else {
                            throw new xju("ScanRecord not parsable into client EID for known platform");
                        }
                    }
                }
                bqga.m112781a(bqgg, new xsx(this), bqfb.INSTANCE);
                return;
            }
            throw new xju("ScanResult is missing ScanRecord");
        } catch (xju e) {
            xsz xsz2 = this.f31848a;
            sek sek2 = xsz.f53015k;
            xsz2.f53022g.mo30185a(xsz2.f53016a, e, 50);
        }
    }
}

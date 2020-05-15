package com.google.android.gms.beacon.scan.impl;

import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LBluetoothLeScannerCompat$3 extends aacm {

    /* renamed from: a */
    final /* synthetic */ ngj f29276a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LBluetoothLeScannerCompat$3(ngj ngj, String str, String str2) {
        super(str, str2);
        this.f29276a = ngj;
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        StringBuilder sb = new StringBuilder(29);
        sb.append("'L' onScanFailed(");
        sb.append(i);
        sb.append(")");
        nha.m26245b(sb.toString());
        this.f29276a.f35495b.mo20617a(i);
        this.f29276a.mo20600e();
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        this.f29276a.mo20598a(scanResult, i);
        this.f29276a.mo20599d();
    }

    /* renamed from: a */
    public final void mo16721a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f29276a.mo20598a((ScanResult) it.next(), 1);
        }
        this.f29276a.mo20599d();
    }
}

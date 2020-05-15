package p000;

import android.net.wifi.WifiScanner;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgkw extends bgkr {

    /* renamed from: f */
    public static final /* synthetic */ int f116728f = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WifiScanner.ScanSettings mo62950a(boolean z, int i, int i2, boolean z2) {
        WifiScanner.ScanSettings a = super.mo62950a(z, i, i2, z2);
        a.ignoreLocationSettings = z2;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bfmn mo62942a(List list, long j, Collection collection) {
        bfmn a = super.mo62942a(list, j, collection);
        if (!ceze.f183524a.mo6606a().fiveGMode()) {
            return a;
        }
        CellInfoNr cellInfoNr = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (cellInfo instanceof CellInfoNr) {
                CellInfoNr cellInfoNr2 = (CellInfoNr) cellInfo;
                if (!cellInfoNr2.isRegistered()) {
                    bfnd a2 = bgie.m98991a(j, cellInfoNr2, bfmn.f114411a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    cellInfoNr = cellInfoNr2;
                }
            }
        }
        if (cellInfoNr == null) {
            return (a == null || arrayList.isEmpty()) ? a : super.mo62942a(list, j, arrayList);
        }
        if (a != null) {
            arrayList.addAll(a.f114418h);
            arrayList.add(a);
        }
        return bgie.m98991a(j, cellInfoNr, arrayList);
    }
}

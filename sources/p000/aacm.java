package p000;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.util.List;

/* renamed from: aacm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aacm extends ScanCallback {

    /* renamed from: a */
    private final aabl f27940a;

    public aacm(Context context, String str) {
        this.f27940a = new aabl(context, getClass(), 18, str);
    }

    /* renamed from: a */
    public void mo16719a(int i) {
    }

    /* renamed from: a */
    public void mo16720a(int i, ScanResult scanResult) {
    }

    /* renamed from: a */
    public void mo16721a(List list) {
    }

    public final void onBatchScanResults(List list) {
        blji a = aabl.m21058a(this.f27940a, "onBatchScanResults");
        try {
            mo16721a(list);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onScanFailed(int i) {
        blji a = aabl.m21058a(this.f27940a, "onScanFailed");
        try {
            mo16719a(i);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        blji a = aabl.m21058a(this.f27940a, "onScanResult");
        try {
            mo16720a(i, scanResult);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public aacm(String str, String str2) {
        this.f27940a = new aabl(getClass(), 18, str2, str);
    }
}

package p000;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.rtt.WifiRttManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bgke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgke implements bgkg {

    /* renamed from: c */
    public static final /* synthetic */ int f116692c = 0;

    /* renamed from: a */
    public final bgkg f116693a;

    /* renamed from: b */
    public final bfor f116694b;

    /* renamed from: d */
    private final Context f116695d;

    /* renamed from: e */
    private final Executor f116696e;

    static {
        bgkg.class.getSimpleName();
    }

    public bgke(Context context, bgkg bgkg, bfor bfor, Executor executor) {
        this.f116695d = context;
        this.f116693a = bgkg;
        this.f116694b = bfor;
        this.f116696e = executor;
    }

    /* renamed from: a */
    public final void mo62905a(List list, bfnz[] bfnzArr) {
        int i;
        bgkd bgkd = new bgkd(this, list);
        bgkx bgkx = bgkx.f116729g;
        Context context = this.f116695d;
        bfor bfor = this.f116694b;
        Executor executor = this.f116696e;
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        if (wifiRttManager != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                bgkf[] bgkfArr = (bgkf[]) list.get(i2);
                int length = bgkfArr.length;
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 >= length) {
                        break;
                    }
                    ScanResult scanResult = bgkfArr[i3].f116707k;
                    if (scanResult != null) {
                        arrayList.add(scanResult);
                    }
                    i3++;
                }
                i2 = i;
            }
            ((bgkr) bgkx).mo62957a(wifiRttManager, arrayList, bgkd, bfor, executor);
            return;
        }
        this.f116693a.mo62905a(list, bfnzArr);
    }
}

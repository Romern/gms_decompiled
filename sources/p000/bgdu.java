package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.WifiScan;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bgdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdu {

    /* renamed from: a */
    private final HashMap f116181a = new HashMap(1);

    /* renamed from: a */
    public final synchronized void mo62689a(PendingIntent pendingIntent) {
        this.f116181a.remove(pendingIntent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo62690a(Context context, bfnv bfnv) {
        int length = bfnv.f114514a.length;
        StringBuilder sb = new StringBuilder(42);
        sb.append("reportWifiScan, byte length is ");
        sb.append(length);
        sb.toString();
        WifiScan a = bxbj.m122535a(bfnv);
        Intent intent = new Intent();
        intent.putExtra("location.WIFI_SCAN", sef.m35074a(a));
        Iterator it = this.f116181a.values().iterator();
        while (it.hasNext()) {
            bgcc bgcc = (bgcc) it.next();
            String valueOf = String.valueOf(bgcc);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb2.append("sending wifiScan to ");
            sb2.append(valueOf);
            sb2.toString();
            if (!bgcc.mo62597a(context, intent)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo62691a(bgns bgns, PendingIntent pendingIntent) {
        this.f116181a.put(pendingIntent, new bgcc(pendingIntent, 0, bgns, null, true, false, "tag"));
    }
}

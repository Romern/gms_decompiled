package p000;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqg {

    /* renamed from: a */
    private static final Logger f88118a = ascp.m73787a("D2D", "UI", "QueuedMessageSender");

    /* renamed from: b */
    private final List f88119b = new ArrayList();

    /* renamed from: c */
    private ResultReceiver f88120c;

    /* renamed from: a */
    public final synchronized void mo48745a() {
        this.f88120c = null;
    }

    /* renamed from: a */
    public final synchronized void mo48746a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f88120c;
        if (resultReceiver == null) {
            Logger Logger = f88118a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Queuing message with eventCode: ");
            sb.append(i);
            Logger.logVerbose(sb.toString(), new Object[0]);
            this.f88119b.add(new arqf(i, bundle));
            return;
        }
        resultReceiver.send(i, bundle);
    }

    /* renamed from: a */
    public final synchronized void mo48747a(ResultReceiver resultReceiver) {
        List list = this.f88119b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arqf arqf = (arqf) list.get(i);
            Logger Logger = f88118a;
            int i2 = arqf.f88116a;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Sending queued message with eventCode: ");
            sb.append(i2);
            Logger.logVerbose(sb.toString(), new Object[0]);
            resultReceiver.send(arqf.f88116a, arqf.f88117b);
        }
        this.f88120c = resultReceiver;
        this.f88119b.clear();
    }
}

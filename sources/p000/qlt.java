package p000;

import android.os.ResultReceiver;
import java.util.Iterator;
import java.util.List;

/* renamed from: qlt */
final /* synthetic */ class qlt implements dkr {

    /* renamed from: a */
    private final qly f41671a;

    public qlt(qly qly) {
        this.f41671a = qly;
    }

    /* renamed from: a */
    public final void mo9219a(List list) {
        boolean z;
        qly qly = this.f41671a;
        synchronized (qly.f41682a) {
            Iterator it = list.iterator();
            z = false;
            while (it.hasNext()) {
                z |= qly.f41683b.mo67271d((String) it.next());
            }
        }
        if (z) {
            qmc.m32424a(false);
            synchronized (qly.f41682a) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    List<ResultReceiver> b = qly.f41683b.mo67126b(str);
                    if (!b.isEmpty()) {
                        int size = b.size();
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                        sb.append("Staging ");
                        sb.append(str);
                        sb.append(" completed, notifying ");
                        sb.append(size);
                        sb.append(" receiver(s).");
                        sb.toString();
                        for (ResultReceiver resultReceiver : b) {
                            resultReceiver.send(0, null);
                        }
                    }
                }
                qly.mo24103a(false);
            }
        }
    }
}

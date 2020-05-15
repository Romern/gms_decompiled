package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dho */
final /* synthetic */ class dho implements Runnable {

    /* renamed from: a */
    private final dhq f13155a;

    public dho(dhq dhq) {
        this.f13155a = dhq;
    }

    public final void run() {
        int i;
        boolean z;
        Intent intent;
        dhq dhq = this.f13155a;
        ArrayList<Intent> arrayList = new ArrayList();
        while (true) {
            int size = arrayList.size();
            synchronized (dhq.f13160d) {
                dhq.f13163g = false;
                while (dhq.f13161e.isEmpty()) {
                    try {
                        dhq.f13160d.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                arrayList.addAll(dhq.f13161e);
                dhq.f13161e.clear();
                i = dhq.f13162f;
                z = true;
                dhq.f13163g = true;
            }
            if (dhq.f13159c) {
                Iterator it = arrayList.subList(size, arrayList.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        intent = null;
                        break;
                    }
                    intent = (Intent) it.next();
                    if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(intent.getAction()) && intent.getLongExtra("uniqueid", -1) == dhq.f13158b) {
                        break;
                    }
                }
                if (intent != null) {
                    synchronized (dhq.f13164h) {
                        dhq.mo9021a(intent, arrayList);
                    }
                    dhq.f13159c = false;
                } else {
                    continue;
                }
            } else {
                synchronized (dhq.f13164h) {
                    z = false;
                    for (Intent intent2 : arrayList) {
                        z |= dhq.mo9023a(intent2);
                    }
                }
            }
            arrayList.clear();
            dhq.startService(dhq.mo9020a("com.google.android.chimera.container.IntentOperationService.NO_OP"));
            if (z) {
                dhq.mo9025c();
            }
            dhq.stopSelf(i);
            dhq.mo9024b();
            dhq.mo9022a(false);
        }
        while (true) {
        }
    }
}

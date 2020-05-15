package p000;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: edm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edm extends aixf implements Runnable {

    /* renamed from: a */
    public final ArrayList f14731a;

    /* renamed from: b */
    public final HashSet f14732b = new HashSet();

    /* renamed from: c */
    final /* synthetic */ edn f14733c;

    public edm(edn edn, ArrayList arrayList) {
        this.f14733c = edn;
        this.f14731a = arrayList;
    }

    /* renamed from: a */
    public final void mo9885a(Message message) {
        dwq.m9667k().mo9435a(new edj(this, message), dqy.m9123a("SnapshotOperation_beaconFound"));
    }

    /* renamed from: b */
    public final void mo9886b(Message message) {
        dwq.m9667k().mo9435a(new edk(this, message), dqy.m9123a("SnapshotOperation_beaconLost"));
    }

    public final void run() {
        edn edn;
        ahcb.m55441b(dwq.m9662f()).mo38204a((aixf) this).mo50371a(new dqi("[SnapshotOperation] unsubscribe beacon", new Object[0]));
        Snapshot snapshot = null;
        if (!this.f14732b.isEmpty()) {
            Iterator it = this.f14732b.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                ArrayList arrayList2 = this.f14731a;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    int i2 = i + 1;
                    if (!((BeaconStateImpl.TypeFilterImpl) arrayList2.get(i)).mo8039a(message.f80678d, message.f80677c, message.f80676b)) {
                        i = i2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new BeaconStateImpl.BeaconInfoImpl(message.f80678d, message.f80677c, message.f80676b));
                    }
                }
            }
            edn = this.f14733c;
            if (arrayList != null && !arrayList.isEmpty()) {
                lrx lrx = new lrx();
                BeaconStateImpl beaconStateImpl = new BeaconStateImpl(arrayList);
                if (!lrx.mo15415a(beaconStateImpl)) {
                    lrx.f26657b = beaconStateImpl;
                }
                snapshot = lrx.mo15413a();
            }
        } else {
            edn = this.f14733c;
        }
        edn.mo10003a(0, snapshot);
    }
}

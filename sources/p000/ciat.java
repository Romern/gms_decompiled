package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ciat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciat implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f189681a;

    /* renamed from: b */
    final /* synthetic */ cibi f189682b;

    public ciat(cibi cibi, List list) {
        this.f189682b = cibi;
        this.f189681a = list;
    }

    public final void run() {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.f189681a));
        SocketAddress b = this.f189682b.f189715f.mo85887b();
        cibc cibc = this.f189682b.f189715f;
        cibc.f189699a = unmodifiableList;
        cibc.mo85886a();
        this.f189682b.f189716g = unmodifiableList;
        cidb cidb = null;
        if (this.f189682b.f189723n.f189033a == chrg.READY || this.f189682b.f189723n.f189033a == chrg.CONNECTING) {
            cibc cibc2 = this.f189682b.f189715f;
            int i = 0;
            while (true) {
                if (i < cibc2.f189699a.size()) {
                    int indexOf = ((chrq) cibc2.f189699a.get(i)).f189052b.indexOf(b);
                    if (indexOf != -1) {
                        cibc2.f189700b = i;
                        cibc2.f189701c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.f189682b.f189723n.f189033a == chrg.READY) {
                    cidb cidb2 = this.f189682b.f189722m;
                    this.f189682b.f189722m = null;
                    this.f189682b.f189715f.mo85886a();
                    this.f189682b.mo85896a(chrg.IDLE);
                    cidb = cidb2;
                } else {
                    cibi cibi = this.f189682b;
                    cidb = cibi.f189721l;
                    cibi.f189721l = null;
                    this.f189682b.f189715f.mo85886a();
                    this.f189682b.mo85900c();
                }
            }
        }
        if (cidb != null) {
            cidb.mo85746a(chuv.f189229p.mo85687a("InternalSubchannel closed transport due to address change"));
        }
    }
}

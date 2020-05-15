package p000;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Collections;

/* renamed from: bfqa */
public final /* synthetic */ class bfqa implements Runnable {

    /* renamed from: a */
    private final bfqm f114829a;

    /* renamed from: b */
    private final ClientIdentity f114830b;

    /* renamed from: c */
    private final aejv f114831c;

    public bfqa(bfqm bfqm, ClientIdentity clientIdentity, aejv aejv) {
        this.f114829a = bfqm;
        this.f114830b = clientIdentity;
        this.f114831c = aejv;
    }

    public final void run() {
        bfqm bfqm = this.f114829a;
        ClientIdentity clientIdentity = this.f114830b;
        aejv aejv = this.f114831c;
        bfpj bfpj = bfqm.f114894u;
        bfpj.mo26010a(31, bfpj.f114791k.mo62094a(Collections.singletonList(clientIdentity)));
        bfqm.f114878e.mo62070a(new bfps(aejv));
    }
}

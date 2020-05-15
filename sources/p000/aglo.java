package p000;

import android.content.Intent;

/* renamed from: aglo */
final /* synthetic */ class aglo implements Runnable {

    /* renamed from: a */
    private final agls f65893a;

    /* renamed from: b */
    private final int f65894b;

    /* renamed from: c */
    private final agid f65895c;

    /* renamed from: d */
    private final Intent f65896d;

    public aglo(agls agls, int i, agid agid, Intent intent) {
        this.f65893a = agls;
        this.f65894b = i;
        this.f65895c = agid;
        this.f65896d = intent;
    }

    public final void run() {
        agls agls = this.f65893a;
        int i = this.f65894b;
        agid agid = this.f65895c;
        Intent intent = this.f65896d;
        if (((aglr) agls.f65902a).mo35633a(i)) {
            agid.f65572k.mo35436a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            agls.mo35640c().f65572k.mo35435a("Completed wakeful intent.");
            ((aglr) agls.f65902a).mo35632a(intent);
        }
    }
}

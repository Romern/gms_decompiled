package p000;

import android.content.Context;

/* renamed from: aipb */
final /* synthetic */ class aipb implements Runnable {

    /* renamed from: a */
    private final aipd f69408a;

    /* renamed from: b */
    private final Context f69409b;

    public aipb(aipd aipd, Context context) {
        this.f69408a = aipd;
        this.f69409b = context;
    }

    public final void run() {
        butl.m120434a(new aipc(this.f69408a, this.f69409b), "RestoreDeviceName", new butj(cfnv.f184625a.mo6606a().mo81854v()).mo73110a());
    }
}

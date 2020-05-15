package p000;

import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;

/* renamed from: adnj */
public final /* synthetic */ class adnj implements Runnable {

    /* renamed from: a */
    private final IpaPackageBroadcastIntentOperation f62215a;

    public adnj(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation) {
        this.f62215a = ipaPackageBroadcastIntentOperation;
    }

    public final void run() {
        adnd a = adnd.m50837a(this.f62215a);
        if (a != null) {
            a.mo33672a();
        }
    }
}

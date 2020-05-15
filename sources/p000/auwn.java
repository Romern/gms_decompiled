package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: auwn */
final /* synthetic */ class auwn implements Callable {

    /* renamed from: a */
    private final Context f92663a;

    public auwn(Context context) {
        this.f92663a = context;
    }

    public final Object call() {
        Context context = this.f92663a;
        aunx aunx = auwo.f92664a;
        boolean z = false;
        try {
            Bundle bundle = (Bundle) aucu.m76782a(aula.m77250b(context).mo24675a(3, (Bundle) null));
            if (bundle != null) {
                boolean z2 = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
                auwo.f92664a.mo50711a("isTrustAgentOn: %s", Boolean.valueOf(z2)).mo50708c();
                z = z2;
            }
        } catch (InterruptedException | ExecutionException e) {
            auwo.f92664a.mo50711a("isTrustAgentOn: %s", false).mo50709d();
        }
        return Boolean.valueOf(z);
    }
}

package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: auwm */
final /* synthetic */ class auwm implements Callable {

    /* renamed from: a */
    private final Context f92662a;

    public auwm(Context context) {
        this.f92662a = context;
    }

    public final Object call() {
        rjy rjy = new rjy(this.f92662a);
        rjy.mo24779a(aula.f92019b);
        rkb b = rjy.mo24784b();
        boolean z = false;
        if (b.mo24802f().mo17671b()) {
            rke a = aupy.m77595a(b, 3, null);
            b.mo24803g();
            Bundle bundle = ((aupr) a.mo9455a()).f92287b;
            if (!a.mo9461c() && bundle != null) {
                z = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            }
        }
        return Boolean.valueOf(z);
    }
}

package p000;

import android.os.Build;
import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: avns */
final /* synthetic */ class avns implements Callable {

    /* renamed from: a */
    private final avnt f93545a;

    public avns(avnt avnt) {
        this.f93545a = avnt;
    }

    public final Object call() {
        avnt avnt = this.f93545a;
        try {
            int i = Build.VERSION.SDK_INT;
            RecoverySystem.rebootWipeAb(avnt.f93553h, new File((String) avnt.mo51433a(avnt.f93547f)), "wipePackage");
            return null;
        } catch (IOException e) {
            avnt.f93546e.mo25417e("Failed to execute RecoverySystem.rebootWipeAb().", e, new Object[0]);
            return null;
        }
    }
}

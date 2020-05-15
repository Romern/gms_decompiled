package p000;

import android.os.RecoverySystem;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: avoe */
final /* synthetic */ class avoe implements Callable {

    /* renamed from: a */
    private final avog f93579a;

    public avoe(avog avog) {
        this.f93579a = avog;
    }

    public final Object call() {
        avog avog = this.f93579a;
        try {
            RecoverySystem.installPackage(avog.f93590i, new File((String) avog.mo51433a(avog.f93581e)));
            return null;
        } catch (Exception e) {
            avog.mo51455a(e);
            return null;
        }
    }
}

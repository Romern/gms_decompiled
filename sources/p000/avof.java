package p000;

import android.os.Build;
import android.os.RecoverySystem;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: avof */
final /* synthetic */ class avof implements Callable {

    /* renamed from: a */
    private final avog f93580a;

    public avof(avog avog) {
        this.f93580a = avog;
    }

    public final Object call() {
        avog avog = this.f93580a;
        try {
            int i = Build.VERSION.SDK_INT;
            RecoverySystem.installPackage(avog.f93590i, new File((String) avog.mo51433a(avog.f93581e)), true);
            return null;
        } catch (Exception e) {
            avog.mo51455a(e);
            return null;
        }
    }
}

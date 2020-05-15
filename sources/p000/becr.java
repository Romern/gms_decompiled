package p000;

import android.system.Os;
import java.util.concurrent.Callable;

/* renamed from: becr */
final /* synthetic */ class becr implements Callable {

    /* renamed from: a */
    private final String f106914a;

    public becr(String str) {
        this.f106914a = str;
    }

    public final Object call() {
        return Os.lstat(this.f106914a);
    }
}

package p000;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: becq */
final /* synthetic */ class becq implements Callable {

    /* renamed from: a */
    private final FileDescriptor f106913a;

    public becq(FileDescriptor fileDescriptor) {
        this.f106913a = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.f106913a);
    }
}

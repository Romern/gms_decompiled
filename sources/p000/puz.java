package p000;

import com.google.android.gms.cast_mirroring.JGCastLogger;
import java.io.FileDescriptor;

/* renamed from: puz */
public final /* synthetic */ class puz implements Runnable {

    /* renamed from: a */
    private final pvc f40325a;

    /* renamed from: b */
    private final FileDescriptor f40326b;

    public puz(pvc pvc, FileDescriptor fileDescriptor) {
        this.f40325a = pvc;
        this.f40326b = fileDescriptor;
    }

    public final void run() {
        pvc pvc = this.f40325a;
        FileDescriptor fileDescriptor = this.f40326b;
        JGCastLogger jGCastLogger = pvc.f40274h;
        boolean z = false;
        if (jGCastLogger != null && jGCastLogger.mDidLoadLibrary) {
            z = jGCastLogger.native_collectData(fileDescriptor);
        }
        for (pvb pvb : pvc.f40335m) {
            pvb.mo23726b(pvc.f40381p, !z);
        }
    }
}

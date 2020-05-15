package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbuo */
final /* synthetic */ class bbuo implements Callable {

    /* renamed from: a */
    private final bqgg f103446a;

    public bbuo(bqgg bqgg) {
        this.f103446a = bqgg;
    }

    public final Object call() {
        try {
            Void voidR = (Void) bqga.m112780a((Future) this.f103446a);
            return null;
        } catch (ExecutionException e) {
            bbos.m88292b("LiMsgController", "Failed to update message status", e);
            throw e;
        }
    }
}

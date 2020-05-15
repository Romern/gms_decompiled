package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqk extends rns {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f23060a;

    public jqk(AtomicReference atomicReference) {
        this.f23060a = atomicReference;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        this.f23060a.set(status);
    }
}

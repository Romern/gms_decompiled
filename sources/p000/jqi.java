package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqi extends rns {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f23054a;

    public jqi(AtomicBoolean atomicBoolean) {
        this.f23054a = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        this.f23054a.set(status.mo17710c());
    }
}

package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvg extends avuo {

    /* renamed from: a */
    private final avuv f93966a;

    /* renamed from: b */
    private final rlf f93967b;

    /* renamed from: c */
    private final AtomicReference f93968c;

    /* renamed from: d */
    private final avur f93969d;

    /* renamed from: b */
    public final void mo51624b(Status status) {
        if (!status.mo17710c()) {
            AtomicReference atomicReference = this.f93968c;
            if (atomicReference != null) {
                atomicReference.set(null);
            }
            this.f93967b.mo9482a((Object) status);
            return;
        }
        this.f93967b.mo9482a((Object) Status.f30107a);
    }

    /* renamed from: c */
    public final void mo51625c(Status status) {
        AtomicReference atomicReference = this.f93968c;
        if (atomicReference != null) {
            atomicReference.set(null);
        }
        if (status.mo17710c()) {
            avur avur = this.f93969d;
            if (avur == null) {
                this.f93967b.mo9482a((Object) Status.f30107a);
                return;
            }
            AtomicReference atomicReference2 = this.f93968c;
            if (atomicReference2 != null) {
                atomicReference2.set(avur);
            }
            this.f93966a.mo51629a(this.f93969d, this);
            return;
        }
        this.f93967b.mo9482a((Object) status);
    }

    public avvg(avuv avuv, rlf rlf, AtomicReference atomicReference, avur avur) {
        this.f93966a = avuv;
        this.f93967b = rlf;
        this.f93968c = atomicReference;
        this.f93969d = avur;
    }
}

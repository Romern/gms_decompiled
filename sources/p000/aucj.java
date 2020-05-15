package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aucj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aucj extends LifecycleCallback {

    /* renamed from: a */
    private final List f91392a = new ArrayList();

    private aucj(rnx rnx) {
        super(rnx);
        this.f30135e.mo24871a("TaskOnStopCallback", this);
    }

    /* renamed from: a */
    private static aucj m76728a(rnx rnx) {
        aucj aucj = (aucj) rnx.mo24870a("TaskOnStopCallback", aucj.class);
        return aucj == null ? new aucj(rnx) : aucj;
    }

    /* renamed from: b */
    public static aucj m76729b(Activity activity) {
        return m76728a(LifecycleCallback.m22509a(activity));
    }

    /* renamed from: b */
    public static aucj m76730b(com.google.android.chimera.Activity activity) {
        return m76728a(LifecycleCallback.m22510a(activity));
    }

    /* renamed from: a */
    public final void mo50396a(aucc aucc) {
        synchronized (this.f91392a) {
            this.f91392a.add(new WeakReference(aucc));
        }
    }

    /* renamed from: b */
    public final void mo17726b() {
        synchronized (this.f91392a) {
            for (WeakReference weakReference : this.f91392a) {
                aucc aucc = (aucc) weakReference.get();
                if (aucc != null) {
                    aucc.mo50355a();
                }
            }
            this.f91392a.clear();
        }
    }
}

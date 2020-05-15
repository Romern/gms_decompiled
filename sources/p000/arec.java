package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;

/* renamed from: arec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arec implements areb {

    /* renamed from: a */
    public static final asco f87500a = ascp.m73787a("TargetBootstrapListenerHolder");

    /* renamed from: b */
    public final arjc f87501b;

    /* renamed from: c */
    private final Context f87502c;

    public arec(arjc arjc, Context context) {
        this.f87501b = arjc;
        this.f87502c = context;
    }

    /* renamed from: a */
    public final void mo48462a() {
        try {
            this.f87501b.mo48590a();
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48463a(int i) {
        try {
            this.f87501b.mo48591a(i);
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48464a(BootstrapCompletionResult bootstrapCompletionResult) {
        try {
            if (cgre.f187589a.mo6606a().mo84350a()) {
                sre.m36088h(this.f87502c);
            }
            this.f87501b.mo48592a(bootstrapCompletionResult);
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48465a(TargetConnectionArgs targetConnectionArgs) {
        try {
            this.f87501b.mo48593a(targetConnectionArgs);
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48466a(String str) {
        try {
            this.f87501b.mo48596b(str);
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo48467a(BootstrapProgressResult bootstrapProgressResult) {
        try {
            return this.f87501b.mo48595a(bootstrapProgressResult);
        } catch (RemoteException e) {
            f87500a.mo25410a((Throwable) e);
            return false;
        }
    }
}

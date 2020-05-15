package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;

/* renamed from: aqzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aqzq {

    /* renamed from: a */
    public static final asco f87168a = ascp.m73787a(aqzq.class.getSimpleName());

    /* renamed from: b */
    public final bmxv f87169b;

    /* renamed from: c */
    private final bmxv f87170c;

    public aqzq(aqzq aqzq) {
        this.f87170c = aqzq.f87170c;
        this.f87169b = aqzq.f87169b;
    }

    /* renamed from: a */
    public void mo48306a(int i, String str) {
        try {
            if (this.f87170c.mo66813a()) {
                ((arik) this.f87170c.mo66814b()).mo48558a(i, str);
            } else if (this.f87169b.mo66813a()) {
                ((arij) this.f87169b.mo66814b()).mo48561a(i, str);
            }
        } catch (RemoteException e) {
            f87168a.mo25410a((Throwable) e);
        }
    }

    public aqzq(arij arij) {
        this.f87169b = bmxv.m108567c(arij);
        this.f87170c = bmvz.f131120a;
    }

    public aqzq(arik arik) {
        this.f87170c = bmxv.m108567c(arik);
        this.f87169b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo48307a(PendingIntent pendingIntent) {
        try {
            if (this.f87170c.mo66813a()) {
                ((arik) this.f87170c.mo66814b()).mo48559a(pendingIntent);
            } else if (this.f87169b.mo66813a()) {
                ((arij) this.f87169b.mo66814b()).mo48562a(pendingIntent);
            }
        } catch (RemoteException e) {
            f87168a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo48308a(BootstrapCompletionResult bootstrapCompletionResult) {
        try {
            if (this.f87169b.mo66813a()) {
                ((arij) this.f87169b.mo66814b()).mo48563a(bootstrapCompletionResult);
            }
        } catch (RemoteException e) {
            f87168a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo48309a(AccountTransferResult[] accountTransferResultArr) {
        try {
            if (this.f87170c.mo66813a()) {
                ((arik) this.f87170c.mo66814b()).mo48560a(accountTransferResultArr);
            }
        } catch (RemoteException e) {
            f87168a.mo25410a((Throwable) e);
        }
    }
}

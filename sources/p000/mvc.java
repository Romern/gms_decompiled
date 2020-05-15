package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import java.security.UnrecoverableKeyException;

/* renamed from: mvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvc {

    /* renamed from: a */
    public static final lvn f34791a = new lvn("ShouldSyncSecondaryKeyTask");

    /* renamed from: b */
    public final Context f34792b;

    /* renamed from: c */
    public final lxd f34793c;

    /* renamed from: d */
    private final lwc f34794d;

    /* renamed from: e */
    private final lwr f34795e;

    /* renamed from: f */
    private final mbx f34796f;

    /* renamed from: g */
    private final lxg f34797g;

    public mvc(Context context, lwc lwc, lwr lwr, mbx mbx, sqv sqv, lxd lxd, lxg lxg) {
        sdo.m34959a(context);
        this.f34792b = context;
        sdo.m34959a(lwc);
        this.f34794d = lwc;
        sdo.m34959a(lwr);
        this.f34795e = lwr;
        sdo.m34959a(mbx);
        this.f34796f = mbx;
        sdo.m34959a(sqv);
        sdo.m34959a(lxd);
        this.f34793c = lxd;
        sdo.m34959a(lxg);
        this.f34797g = lxg;
    }

    /* renamed from: b */
    private final void m25653b() {
        f34791a.mo25412b("Generating new next secondary key.", new Object[0]);
        this.f34797g.mo19722a();
        bmxv b = this.f34794d.mo19695b();
        if (b.mo66813a()) {
            try {
                if (this.f34795e.mo19713b((String) b.mo66814b()).mo66813a()) {
                    return;
                }
            } catch (InternalRecoveryServiceException | UnrecoverableKeyException e) {
                throw new mvb((Throwable) e);
            }
        }
        throw new mvb("Failed to generate a new next alias or key.");
    }

    /* renamed from: a */
    public final void mo20266a() {
        f34791a.mo25412b("Active secondary key is destroyed. Checking next secondary key.", new Object[0]);
        bmxv b = this.f34794d.mo19695b();
        if (b.mo66813a()) {
            try {
                bmxv b2 = this.f34795e.mo19713b((String) b.mo66814b());
                if (b2.mo66813a() && ((lwp) b2.mo66814b()).mo19710a(this.f34792b) == 1) {
                    f34791a.mo25412b("The next secondary key needs to be synced. Set last rotation time to present so that a new rotation is not scheduled at backup, after syncing.", new Object[0]);
                    this.f34794d.mo19692a(System.currentTimeMillis());
                    return;
                }
            } catch (InternalRecoveryServiceException | UnrecoverableKeyException e) {
                lvn lvn = f34791a;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
                sb.append("Something went wrong with fetching the next secondary key, generate a new one:");
                sb.append(valueOf);
                lvn.mo25416d(sb.toString(), new Object[0]);
                this.f34796f.mo19822a(24, 4);
                m25653b();
                return;
            }
        }
        m25653b();
    }
}

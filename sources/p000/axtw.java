package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: axtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axtw implements rka {

    /* renamed from: a */
    public final boolean f96341a;

    /* renamed from: b */
    final ScheduledExecutorService f96342b = snp.m35703a(1, 10);

    /* renamed from: c */
    rkb f96343c;

    /* renamed from: d */
    volatile boolean f96344d;

    /* renamed from: e */
    private ScheduledFuture f96345e;

    /* renamed from: f */
    private rjx f96346f;

    public axtw(Context context, boolean z) {
        this.f96341a = z;
        if (z && chnj.m149037m()) {
            if (!chng.f188808a.mo6606a().mo85373b()) {
                rjy rjy = new rjy(context);
                rjy.mo24779a(avtz.f93909a);
                rkb b = rjy.mo24784b();
                this.f96343c = b;
                b.mo24791a((rka) this);
                return;
            }
            this.f96346f = avtz.m79336a(context, new avty());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53538a() {
        if (this.f96341a && chnj.m149037m()) {
            rjx rjx = this.f96346f;
            if (rjx != null) {
                aucb a = rjx.mo24680a((avub) new axtp(this));
                ((sny) this.f96342b).submit(new axtq(this, a));
            } else {
                rkb rkb = this.f96343c;
                if (rkb != null) {
                    rkb.mo24801e();
                    rjo rjo = avtz.f93909a;
                    avva.m79410a(this.f96343c, new axtr(this)).mo9459a(new axts(this), chnj.m149038n(), TimeUnit.MILLISECONDS);
                }
            }
            mo53542c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo53540b(aucb aucb) {
        try {
            aucu.m76783a(aucb, chnj.m149038n(), TimeUnit.MILLISECONDS);
            Log.d("WearableLogger", "Listening to usage opt-in changes");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("failed add listener: ");
            } else {
                "failed add listener: ".concat(valueOf);
            }
            mo53543d();
        } catch (RuntimeException e2) {
            Log.e("WearableLogger", "Unexpected exception from initialize: ", e2);
            throw e2;
        }
    }

    /* renamed from: c */
    public final void mo53542c() {
        if (chnj.m149037m()) {
            rjx rjx = this.f96346f;
            if (rjx == null) {
                rjo rjo = avtz.f93909a;
                avva.m79409a(this.f96343c).mo9459a(new axtu(this), chnj.m149038n(), TimeUnit.MILLISECONDS);
                return;
            }
            aucb E = rjx.mo24673E();
            ((sny) this.f96342b).submit(new axtt(this, E));
        }
    }

    /* renamed from: d */
    public final void mo53543d() {
        if (chnj.m149037m()) {
            synchronized (this) {
                ScheduledFuture scheduledFuture = this.f96345e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f96345e = ((sny) this.f96342b).schedule(new axtv(this), chnj.f188812a.mo6606a().mo85402aa(), TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo53541b() {
        return chnj.m149037m() && this.f96344d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo53539a(aucb aucb) {
        try {
            this.f96344d = ((rkj) aucu.m76783a(aucb, chnj.m149038n(), TimeUnit.MILLISECONDS)).mo24824r();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("getOptInOptions failed; ");
            } else {
                "getOptInOptions failed; ".concat(valueOf);
            }
            mo53543d();
        } catch (RuntimeException e2) {
            Log.e("WearableLogger", "Unexpected exception from getOptInOptions: ", e2);
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        mo53543d();
    }
}

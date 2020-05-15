package p000;

import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSession;
import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: lve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lve extends aaab {

    /* renamed from: a */
    public static final lvn f33023a = new lvn("RequestGmsModuleRestore");

    /* renamed from: b */
    public final rnt f33024b;

    /* renamed from: c */
    public final long f33025c;

    /* renamed from: d */
    public RestoreSession f33026d;

    /* renamed from: e */
    public bqgy f33027e;

    /* renamed from: f */
    public bqgy f33028f;

    /* renamed from: g */
    private final lvp f33029g;

    /* renamed from: h */
    private final String f33030h;

    /* renamed from: i */
    private final RestoreObserver f33031i = new lvd(this);

    public lve(lvp lvp, rnt rnt, long j, String str) {
        super(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, "RequestGmsModuleRestore");
        bmxy.m108581a(rnt);
        this.f33024b = rnt;
        bmxy.m108581a(lvp);
        this.f33029g = lvp;
        this.f33025c = j;
        bmxy.m108581a(str);
        this.f33030h = str;
    }

    /* renamed from: a */
    private final List m24455a() {
        f33023a.mo25409a("Waiting for the restore sets", new Object[0]);
        try {
            return (List) this.f33027e.get(ccmh.f179446a.mo6606a().mo76378g(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            mo6503a(Status.f30108b);
            Thread.currentThread().interrupt();
            return bngx.m109376e();
        } catch (ExecutionException e2) {
            mo6503a(Status.f30109c);
            return bngx.m109376e();
        } catch (TimeoutException e3) {
            mo6503a(Status.f30110d);
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    private final void m24456b() {
        f33023a.mo25409a("Waiting for the restore to finish", new Object[0]);
        try {
            if (!((Boolean) this.f33028f.get(ccmh.f179446a.mo6606a().mo76377f(), TimeUnit.MILLISECONDS)).booleanValue()) {
                mo6503a(Status.f30109c);
            }
        } catch (InterruptedException e) {
            mo6503a(Status.f30108b);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            mo6503a(Status.f30109c);
        } catch (TimeoutException e3) {
            mo6503a(Status.f30110d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f33023a.mo25409a("Requesting restore of a gms module %s.", this.f33030h);
        this.f33028f = bqgy.m112818c();
        this.f33027e = bqgy.m112818c();
        RestoreSession a = this.f33029g.mo19640a();
        this.f33026d = a;
        if (a == null) {
            f33023a.mo25418e("Couldn't start restore session.", new Object[0]);
            mo6503a(Status.f30109c);
        } else if (a.getAvailableRestoreSets(this.f33031i) != 0) {
            f33023a.mo25418e("Error getting restore sets from backup manager.", new Object[0]);
            mo6503a(Status.f30109c);
        } else if (m24455a().stream().anyMatch(new lvc(this))) {
            f33023a.mo25409a("Requesting restore of %s", Long.valueOf(this.f33025c));
            int restorePackages = this.f33026d.restorePackages(this.f33025c, this.f33031i, bnic.m109489a("com.google.android.gms"));
            if (restorePackages == 0) {
                f33023a.mo25409a("Restore is requested successfully.", new Object[0]);
                if (!ccmh.m130653c()) {
                    this.f33024b.mo11797a(Status.f30107a);
                }
            } else {
                f33023a.mo25409a("Restore request failed with code %d", Integer.valueOf(restorePackages));
                mo6503a(new Status(29031));
            }
            m24456b();
        } else {
            f33023a.mo25416d("Restore set is not found among the available restore sets.", new Object[0]);
            mo6503a(Status.f30109c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        f33023a.mo25418e("Failure, status=%s message=%s", Integer.valueOf(status.f30115i), status.mo17711d());
        RestoreSession restoreSession = this.f33026d;
        if (restoreSession != null) {
            restoreSession.endRestoreSession();
        }
        this.f33024b.mo11797a(status);
        if (!this.f33027e.isDone()) {
            this.f33027e.mo69138b((Object) null);
        }
        if (!this.f33028f.isDone()) {
            this.f33028f.mo69138b((Object) false);
        }
    }
}

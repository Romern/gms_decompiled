package p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.car.diagnostics.CrashReporterServiceImpl;
import java.lang.Thread;
import java.util.ArrayList;

/* renamed from: noh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class noh extends npn {

    /* renamed from: a */
    final /* synthetic */ noj f36152a;

    public noh(noj noj) {
        this.f36152a = noj;
    }

    /* renamed from: a */
    private final void m26942a(Thread thread, Throwable th) {
        if (noj.f36154W) {
            bnsi b = noj.f36155b.mo68387b();
            b.mo68432a("noh", "a", 4359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Thread crash called again!");
            return;
        }
        noj.f36154W = true;
        bnsi b2 = noj.f36155b.mo68387b();
        b2.mo68437a(th);
        b2.mo68432a("noh", "a", 4373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68420a("%s", "FATAL EXCEPTION in GmsCore thread: " + thread.getName() + "\nPID: " + Process.myPid());
        npq npq = new npq(th, this.f36152a.mo21346p());
        npq.mo21428a(ssy.m36271a());
        Context context = this.f36152a.f36160E;
        CrashReporterServiceImpl.m22083a(context, context.getPackageName(), npq);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        nwj nwj;
        bnsn bnsn = noj.f36155b;
        try {
            noj noj = this.f36152a;
            nip nip = noj.f36158C;
            if (nip != null) {
                ((nwe) nip).f36789o = false;
                bnkd bnkd = ((nwe) nip).f36783i;
                if (bnkd != null) {
                    ArrayList arrayList = new ArrayList(bnkd.mo67317p());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        nij nij = (nij) arrayList.get(i);
                        nij.mo20771a((nij) null);
                        nij.mo20780f();
                    }
                    bnkd.mo67270d();
                }
                nln nln = ((nwe) nip).f36791q;
                if (nln != null) {
                    nln.mo21047a();
                }
                oqa oqa = ((nwe) nip).f36782h;
                if (oqa != null) {
                    oqa.mo21690h();
                    noj.f36218e.mo17321e();
                    nwj = noj.f36222i;
                    if (nwj != null) {
                        nwj.mo21752b();
                    }
                    noj.mo21312aq();
                    if (!ccsq.f179858a.mo6606a().mo76729c()) {
                        if (!noj.f36154W) {
                            noj.f36154W = true;
                            bnsi b = noj.f36155b.mo68387b();
                            b.mo68437a(th);
                            b.mo68432a("noh", "a", 4373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b.mo68420a("%s", "FATAL EXCEPTION in GmsCore thread: " + thread.getName() + "\nPID: " + Process.myPid());
                            npq npq = new npq(th, this.f36152a.mo21346p());
                            npq.mo21428a(ssy.m36271a());
                            Context context = this.f36152a.f36160E;
                            CrashReporterServiceImpl.m22083a(context, context.getPackageName(), npq);
                        } else {
                            bnsi b2 = noj.f36155b.mo68387b();
                            b2.mo68432a("noh", "a", 4359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b2.mo68405a("Thread crash called again!");
                        }
                    }
                    uncaughtExceptionHandler = this.f36337b;
                    if (uncaughtExceptionHandler == null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                }
            }
            noj.f36218e.mo17321e();
            nwj = noj.f36222i;
            if (nwj != null) {
            }
            noj.mo21312aq();
            if (!ccsq.f179858a.mo6606a().mo76729c()) {
            }
        } catch (Exception e) {
            try {
                bnsi b3 = noj.f36155b.mo68387b();
                b3.mo68437a(e);
                b3.mo68432a("noh", "uncaughtException", 4392, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("Error reporting crash");
            } catch (Exception e2) {
            }
        }
        uncaughtExceptionHandler = this.f36337b;
        if (uncaughtExceptionHandler == null) {
        }
    }
}

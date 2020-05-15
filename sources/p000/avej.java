package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: avej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avej extends AsyncTaskLoader {

    /* renamed from: a */
    private static final srn f93016a = srn.m36124a();

    /* renamed from: b */
    private rkk f93017b;

    /* renamed from: c */
    private long f93018c = -1;

    /* renamed from: d */
    private final rjx f93019d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avej(Context context, Account account) {
        super(context);
        auzx auzx = new auzx();
        auzx.f92843a = account;
        rjx rjx = new rjx(context, auzx.mo51097a());
        this.f93019d = rjx;
    }

    /* renamed from: b */
    private static void m78372b(rkk rkk) {
        if (rkk instanceof rkh) {
            try {
                ((rkh) rkk).mo12460c();
            } catch (RuntimeException e) {
                bnsl bnsl = (bnsl) f93016a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("avej", "b", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Unable to release %s", rkk);
            }
        }
    }

    /* renamed from: a */
    public abstract aucb mo51180a(rjx rjx);

    /* renamed from: a */
    public final rkk loadInBackground() {
        try {
            aucb a = mo51180a(this.f93019d);
            long j = this.f93018c;
            return (rkk) (j >= 0 ? aucu.m76783a(a, j, TimeUnit.MILLISECONDS) : aucu.m76782a(a));
        } catch (TimeoutException e) {
            return mo51181a(Status.f30110d);
        } catch (InterruptedException e2) {
            return mo51181a(Status.f30108b);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof aaaj) {
                return mo51181a(((aaaj) e3.getCause()).f27843a);
            }
            return mo51181a(Status.f30109c);
        }
    }

    /* renamed from: a */
    public abstract rkk mo51181a(Status status);

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mTimeout=");
        printWriter.print(this.f93018c);
        printWriter.println("ms");
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        rkk rkk = this.f93017b;
        if (rkk instanceof rkh) {
            try {
                ((rkh) rkk).mo12460c();
            } catch (RuntimeException e) {
                bnsl bnsl = (bnsl) f93016a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("avej", "b", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Unable to release %s", rkk);
            }
        }
        this.f93017b = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        rkk rkk = this.f93017b;
        if (rkk != null) {
            deliverResult(rkk);
        }
        if (takeContentChanged() || this.f93017b == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo51183a(long j, TimeUnit timeUnit) {
        sdo.m34971a(isReset(), (Object) "Can only setTimeout while loader is reset");
        this.f93018c = timeUnit.toMillis(j);
    }

    /* renamed from: a */
    public final void deliverResult(rkk rkk) {
        this.f93017b = rkk;
        if (isStarted()) {
            super.deliverResult(rkk);
        }
    }
}

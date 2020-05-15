package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: kq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1142kq extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ C1144ks f24778a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1142kq(C1144ks ksVar, Callable callable) {
        super(callable);
        this.f24778a = ksVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        try {
            this.f24778a.mo14855c(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.f24778a.mo14855c(null);
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}

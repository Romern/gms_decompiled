package p000;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: foz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foz extends AsyncTask {

    /* renamed from: a */
    private final Future f17051a;

    /* renamed from: b */
    private final fom f17052b;

    public foz(fom fom, Future future) {
        this.f17052b = fom;
        this.f17051a = future;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Future future = this.f17051a;
        if (future == null) {
            return null;
        }
        try {
            return (Boolean) future.get();
        } catch (InterruptedException e) {
            e.getMessage();
            e.fillInStackTrace();
            bqye.m113758a(e);
            return null;
        } catch (ExecutionException e2) {
            e2.getMessage();
            e2.fillInStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        fom fom;
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && (fom = this.f17052b) != null) {
            fom.mo11067a();
        }
    }
}

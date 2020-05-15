package p000;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: fox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fox extends AsyncTask {

    /* renamed from: a */
    private final Future f17048a;

    /* renamed from: b */
    private final fop f17049b;

    public fox(fop fop, Future future) {
        this.f17049b = fop;
        this.f17048a = future;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Future future = this.f17048a;
        if (future == null) {
            return null;
        }
        try {
            return (Boolean) future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.getMessage();
            e.fillInStackTrace();
            bqye.m113758a(e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        fop fop;
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && (fop = this.f17049b) != null) {
            for (int i = 0; i < ((C1245ok) fop.f17025b).f26809h; i++) {
                foo foo = (foo) fop.f17025b.get(Integer.valueOf(fop.mo11070a(i)));
                fpe fpe = foo.f17022b;
                if (fpe != null) {
                    fpe.f17072a.clear();
                    fpe.f17073d.clear();
                    fpe.f17074e.clear();
                    fpe.mo171aJ();
                    foo.mo11068a();
                    foo.getLoaderManager().restartLoader(0, null, foo.f17022b);
                }
            }
        }
    }
}

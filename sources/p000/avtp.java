package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.concurrent.ExecutionException;

/* renamed from: avtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtp extends AsyncTaskLoader {

    /* renamed from: a */
    private static final sek f93895a = avpq.m79014a("LastConfigUpdateTimeLoader");

    /* renamed from: b */
    private final avlf f93896b;

    public avtp(Context context) {
        super(context);
        this.f93896b = avko.m78681a(context);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            return (Long) aucu.m76782a(this.f93896b.mo51348c());
        } catch (InterruptedException | ExecutionException e) {
            f93895a.mo25417e("Error when getting last successful config update time.", e, new Object[0]);
            return -1L;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        forceLoad();
    }
}

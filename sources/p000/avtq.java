package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.update.ConfigUpdateOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: avtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtq extends AsyncTaskLoader {

    /* renamed from: a */
    private static final sek f93897a = avpq.m79014a("RequestConfigUpdateLoader");

    /* renamed from: b */
    private final boolean f93898b = true;

    /* renamed from: c */
    private final avlf f93899c;

    public avtq(Context context) {
        super(context);
        this.f93899c = avko.m78681a(context);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            aucu.m76782a(this.f93899c.mo24732b(new avkt(new ConfigUpdateOptions(this.f93898b))));
            f93897a.mo25414c("Config update succeeded.", new Object[0]);
            try {
                return (Long) aucu.m76782a(this.f93899c.mo51348c());
            } catch (InterruptedException | ExecutionException e) {
                f93897a.mo25417e("Error when getting last successful config update time.", e, new Object[0]);
                return -1L;
            }
        } catch (InterruptedException | ExecutionException e2) {
            f93897a.mo25417e("Failed to check for config update.", e2, new Object[0]);
            return -1L;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        forceLoad();
    }
}

package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.Executor;

/* renamed from: aerf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aerf extends adzx {

    /* renamed from: a */
    public final C1223np f63660a = new C1223np(1);

    /* renamed from: b */
    private final Context f63661b;

    /* renamed from: c */
    private final aerg f63662c;

    public aerf(Context context, aerg aerg) {
        super("location", "SettingContentObserver", null);
        this.f63661b = context;
        this.f63662c = aerg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34475a(aerh aerh) {
        synchronized (this.f63660a) {
            if (this.f63660a.remove(aerh) != null && this.f63660a.isEmpty()) {
                this.f63661b.getContentResolver().unregisterContentObserver(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34476a(Uri uri, aerh aerh, Executor executor) {
        synchronized (this.f63660a) {
            if (this.f63660a.put(aerh, executor) == null && this.f63660a.f26809h == 1) {
                try {
                    this.f63661b.getContentResolver().registerContentObserver(uri, true, this);
                } catch (SecurityException e) {
                    Log.e("LocationSettings", "Google Play services lost unknown permission!", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        Object a = this.f63662c.mo34472a(this.f63661b);
        synchronized (this.f63660a) {
            int i = 0;
            while (true) {
                C1223np npVar = this.f63660a;
                if (i < npVar.f26809h) {
                    Executor executor = (Executor) this.f63660a.mo15621c(i);
                    executor.execute(new aere(this, (aerh) npVar.mo15620b(i), executor, a));
                    i++;
                }
            }
        }
    }
}

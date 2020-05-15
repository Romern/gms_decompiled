package p000;

import android.database.ContentObserver;
import android.os.AsyncTask;
import android.os.Handler;

/* renamed from: apv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apv extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ apw f1953a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apv(apw apw, Handler handler) {
        super(handler);
        this.f1953a = apw;
    }

    public final void onChange(boolean z) {
        AsyncTask.execute(this.f1953a.f1957d);
    }
}

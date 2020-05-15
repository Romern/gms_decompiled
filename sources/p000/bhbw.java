package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: bhbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbw extends bhbv {
    public bhbw(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63536a(Executor executor) {
        this.f118271a.registerGnssStatusCallback(executor, this.f118276e);
    }
}

package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: zwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zwz implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f56077a;

    public zwz(Context context) {
        this.f56077a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f56077a.getSharedPreferences("google_sdk_flags", 0);
    }
}

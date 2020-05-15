package p000;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: ayc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayc implements Callable {

    /* renamed from: a */
    final /* synthetic */ InputStream f2530a;

    public ayc(InputStream inputStream) {
        this.f2530a = inputStream;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return aye.m2424a(this.f2530a, (String) null);
    }
}

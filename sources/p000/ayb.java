package p000;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: ayb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayb implements Callable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f2527a;

    /* renamed from: b */
    final /* synthetic */ Context f2528b;

    /* renamed from: c */
    final /* synthetic */ int f2529c;

    public ayb(WeakReference weakReference, Context context, int i) {
        this.f2527a = weakReference;
        this.f2528b = context;
        this.f2529c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = (Context) this.f2527a.get();
        if (context == null) {
            context = this.f2528b;
        }
        return aye.m2431b(context, this.f2529c);
    }
}

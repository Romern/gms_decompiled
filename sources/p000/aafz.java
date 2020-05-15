package p000;

import android.content.Context;
import com.google.android.gms.ads.internal.clearcut.C0331f;
import java.util.concurrent.Callable;

/* renamed from: aafz */
public final /* synthetic */ class aafz implements Callable {

    /* renamed from: a */
    private final Context f28049a;

    public aafz(Context context) {
        this.f28049a = context;
    }

    public final Object call() {
        return new C0331f(this.f28049a, "GLAS");
    }
}

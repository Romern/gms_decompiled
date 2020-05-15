package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: auhq */
public final /* synthetic */ class auhq implements Callable {

    /* renamed from: a */
    private final Context f91829a;

    /* renamed from: b */
    private final int f91830b;

    public auhq(Context context, int i) {
        this.f91829a = context;
        this.f91830b = i;
    }

    public final Object call() {
        return new auhs(this.f91829a, this.f91830b);
    }
}

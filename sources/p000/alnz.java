package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: alnz */
final /* synthetic */ class alnz implements Callable {

    /* renamed from: a */
    private final String f73893a;

    /* renamed from: b */
    private final Context f73894b;

    public alnz(String str, Context context) {
        this.f73893a = str;
        this.f73894b = context;
    }

    public final Object call() {
        String str = this.f73893a;
        return new C1240of(str, gie.m13198c(this.f73894b, str));
    }
}

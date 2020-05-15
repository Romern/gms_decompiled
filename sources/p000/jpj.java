package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: jpj */
final /* synthetic */ class jpj implements Callable {

    /* renamed from: a */
    private final jpo f22972a;

    /* renamed from: b */
    private final String f22973b;

    /* renamed from: c */
    private final int f22974c;

    /* renamed from: d */
    private final Context f22975d;

    public jpj(jpo jpo, String str, int i, Context context) {
        this.f22972a = jpo;
        this.f22973b = str;
        this.f22974c = i;
        this.f22975d = context;
    }

    public final Object call() {
        return this.f22972a.mo13979a(this.f22973b, this.f22974c, this.f22975d);
    }
}

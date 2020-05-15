package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: mns */
final /* synthetic */ class mns implements Callable {

    /* renamed from: a */
    private final Context f34060a;

    public mns(Context context) {
        this.f34060a = context;
    }

    public final Object call() {
        return gie.m13193a(this.f34060a, "com.google", new String[]{"googleone"});
    }
}

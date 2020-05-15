package p000;

import android.content.Context;
import java.io.File;

/* renamed from: bicr */
final /* synthetic */ class bicr implements Runnable {

    /* renamed from: a */
    private final Context f120236a;

    public bicr(Context context) {
        this.f120236a = context;
    }

    public final void run() {
        srj.m36120a(new File(this.f120236a.getCacheDir(), "simple_tensorflow_model_weights"));
    }
}

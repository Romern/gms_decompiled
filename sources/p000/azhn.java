package p000;

import android.content.Context;

/* renamed from: azhn */
final /* synthetic */ class azhn implements Runnable {

    /* renamed from: a */
    private final Context f99391a;

    /* renamed from: b */
    private final int f99392b;

    public azhn(Context context, int i) {
        this.f99391a = context;
        this.f99392b = i;
    }

    public final void run() {
        Context context = this.f99391a;
        azpi.m86068a(context, context.getString(this.f99392b));
    }
}

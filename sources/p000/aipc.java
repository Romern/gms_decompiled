package p000;

import android.content.Context;

/* renamed from: aipc */
final /* synthetic */ class aipc implements Runnable {

    /* renamed from: a */
    private final aipd f69410a;

    /* renamed from: b */
    private final Context f69411b;

    public aipc(aipd aipd, Context context) {
        this.f69410a = aipd;
        this.f69411b = context;
    }

    public final void run() {
        this.f69410a.mo37798d(this.f69411b);
    }
}

package p000;

import android.content.Context;
import com.felicanetworks.mfc.FSC;

/* renamed from: atfl */
final /* synthetic */ class atfl implements Runnable {

    /* renamed from: a */
    private final atfn f90240a;

    /* renamed from: b */
    private final Context f90241b;

    /* renamed from: c */
    private final brff f90242c;

    public atfl(atfn atfn, Context context, brff brff) {
        this.f90240a = atfn;
        this.f90241b = context;
        this.f90242c = brff;
    }

    public final void run() {
        atfn atfn = this.f90240a;
        Context context = this.f90241b;
        brff brff = this.f90242c;
        atfo atfo = atfn.f90247b;
        if (atfo.f90251d == null) {
            atfo.f90251d = FSC.getInstance();
        }
        atfn.f90247b.f90249b.post(new atfm(atfn, context, brff));
    }
}

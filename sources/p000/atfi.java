package p000;

import android.content.Context;
import com.felicanetworks.mfc.Felica;

/* renamed from: atfi */
final /* synthetic */ class atfi implements Runnable {

    /* renamed from: a */
    private final atfk f90232a;

    /* renamed from: b */
    private final Context f90233b;

    /* renamed from: c */
    private final brff f90234c;

    public atfi(atfk atfk, Context context, brff brff) {
        this.f90232a = atfk;
        this.f90233b = context;
        this.f90234c = brff;
    }

    public final void run() {
        atfk atfk = this.f90232a;
        Context context = this.f90233b;
        brff brff = this.f90234c;
        atfo atfo = atfk.f90239b;
        if (atfo.f90250c == null) {
            atfo.f90250c = Felica.getInstance();
        }
        atfk.f90239b.f90249b.post(new atfj(atfk, context, brff));
    }
}

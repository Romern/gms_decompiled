package p000;

import android.content.Intent;
import java.util.List;

/* renamed from: jqp */
public final /* synthetic */ class jqp implements Runnable {

    /* renamed from: a */
    private final jqw f23072a;

    /* renamed from: b */
    private final Intent f23073b;

    public jqp(jqw jqw, Intent intent) {
        this.f23072a = jqw;
        this.f23073b = intent;
    }

    public final void run() {
        jqw jqw = this.f23072a;
        Intent intent = this.f23073b;
        if (!jqw.f23089d && rsk.m34336b(intent) == 0) {
            jqw.f23086a.mo25070c(intent);
            jqw.f23089d = true;
            sdo.m34970a(jqw.f23089d);
            List list = jqw.f23088c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jqw.f23087b.post((Runnable) list.get(i));
            }
            jqw.f23088c.clear();
        }
    }
}

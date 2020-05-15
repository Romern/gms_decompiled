package p000;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Level;

/* renamed from: ooo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ooo extends nvt {

    /* renamed from: a */
    private final Queue f38073a = new ArrayDeque();

    public ooo(oop oop) {
        super(oop, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final Object mo22394a() {
        if (this.f38073a.isEmpty()) {
            bnsi c = oop.f38074a.mo68388c();
            c.mo68432a("ooo", "a", 640, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Timeout Queue is empty");
            return null;
        }
        Object remove = this.f38073a.remove();
        removeMessages(1);
        if (!this.f38073a.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000);
        }
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22397b() {
        this.f38073a.clear();
        removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final boolean mo22398c() {
        return this.f38073a.isEmpty();
    }

    public final void handleMessage(Message message) {
        oop oop = (oop) mo21726f();
        if (message.what == 1 && oop != null) {
            bnsi b = oop.f38074a.mo68387b();
            b.mo68432a("ooo", "handleMessage", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s: Possible ANR detected", oop.f38075b);
            try {
                if (!this.f38073a.isEmpty() && oop.f38074a.mo26019b(Level.SEVERE).mo68447l()) {
                    StringBuilder sb = new StringBuilder("Unhandled items:\n");
                    mo22396a(sb);
                    bnsi b2 = oop.f38074a.mo68387b();
                    b2.mo68432a("ooo", "handleMessage", 622, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68420a("%s", sb.toString());
                }
            } finally {
                oop.mo22404g();
            }
        }
    }

    /* renamed from: a */
    public final void mo22395a(Object obj) {
        if (this.f38073a.isEmpty()) {
            sendMessageDelayed(obtainMessage(1), 10000);
        }
        this.f38073a.offer(obj);
    }

    /* renamed from: a */
    public final void mo22396a(StringBuilder sb) {
        for (Object obj : this.f38073a) {
            sb.append(obj);
            sb.append(10);
        }
    }
}

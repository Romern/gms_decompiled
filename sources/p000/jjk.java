package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ jju f22621a;

    public jjk(jju jju) {
        this.f22621a = jju;
    }

    public final void run() {
        jju.f22638a.mo25412b("Stopping all advertisements.", new Object[0]);
        List list = this.f22621a.f22643f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f22621a.f22641d.add(((jjq) list.get(i)).f22631a.f11138b);
        }
        this.f22621a.f22642e.clear();
        this.f22621a.f22647j.removeCallbacksAndMessages(null);
        this.f22621a.f22660w = false;
        this.f22621a.f22659v = false;
        this.f22621a.mo13799a(new ArrayList());
    }
}

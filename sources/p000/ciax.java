package p000;

import java.util.ArrayList;

/* renamed from: ciax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciax implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chuv f189689a;

    /* renamed from: b */
    final /* synthetic */ cibi f189690b;

    public ciax(cibi cibi, chuv chuv) {
        this.f189690b = cibi;
        this.f189689a = chuv;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList(this.f189690b.f189719j);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cidb) arrayList.get(i)).mo85748b(this.f189689a);
        }
    }
}

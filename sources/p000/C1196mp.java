package p000;

import java.util.ArrayList;

/* renamed from: mp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1196mp implements C1206mz {

    /* renamed from: a */
    final /* synthetic */ String f26686a;

    public C1196mp(String str) {
        this.f26686a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        ((p000.C1206mz) r1.get(r0)).mo15475a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 >= r1.size()) goto L_0x002a;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15475a(Object obj) {
        synchronized (C1201mu.f26696b) {
            ArrayList arrayList = (ArrayList) C1201mu.f26697c.get(this.f26686a);
            if (arrayList != null) {
                C1201mu.f26697c.remove(this.f26686a);
            }
        }
    }
}

package p000;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: acpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpf implements Runnable {

    /* renamed from: a */
    final Context f60405a;

    /* renamed from: b */
    final brhj f60406b;

    /* renamed from: c */
    final /* synthetic */ acpg f60407c;

    public acpf(acpg acpg, Context context, brhj brhj) {
        this.f60407c = acpg;
        this.f60405a = context;
        this.f60406b = brhj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        p000.bqye.m113761a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10.f60407c.mo32982a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0017, B:11:0x0040, B:23:0x0059] */
    public final void run() {
        try {
            int a = acpg.m49653a(this.f60405a, this.f60407c.mo32981a());
            boolean z = true;
            if (a == 1 || a == 2) {
                acpa a2 = new acpb(this.f60405a.getContentResolver(), System.currentTimeMillis()).iterator();
                Context context = this.f60405a;
                if (a != 2) {
                    z = false;
                }
                acpe.m49652a(context, a2, z, this.f60406b, acpg.m49654a(context));
                a2.close();
            } else if (a == 3) {
                acpe.m49652a(this.f60405a, Collections.emptyList().iterator(), false, this.f60406b, acpg.m49654a(this.f60405a));
            }
            this.f60407c.mo32982a(this);
            return;
            throw th;
        } catch (Throwable th) {
            acnv.m49544a(th, "Calendar indexing task failed", new Object[0]);
            new abyp(this.f60405a).mo32457a("Calendar indexing task failed", th, this.f60407c.f60409b, cema.m137239f(), abzt.f58943be, TimeUnit.MILLISECONDS);
        }
    }
}

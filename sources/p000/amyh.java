package p000;

import android.os.Process;
import java.util.ArrayList;

/* renamed from: amyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amyh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ anaq f76372a;

    /* renamed from: b */
    final /* synthetic */ anaq f76373b;

    /* renamed from: c */
    final /* synthetic */ amyj f76374c;

    public amyh(amyj amyj, anaq anaq, anaq anaq2) {
        this.f76374c = amyj;
        this.f76372a = anaq;
        this.f76373b = anaq2;
    }

    public final void run() {
        amvm amvm;
        Thread thread;
        anao a;
        Process.setThreadPriority(10);
        try {
            amyj amyj = this.f76374c;
            anaq anaq = this.f76372a;
            anaq anaq2 = this.f76373b;
            ArrayList arrayList = new ArrayList();
            amig.m62939a();
            int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83035l()).intValue();
            while (true) {
                amyj.f76382c.mo41389a();
                a = anaq.mo41603a();
                bngx a2 = a.mo41596a();
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(a2.get(i));
                    if (arrayList.size() >= intValue) {
                        amyj.mo41562a(arrayList, anaq2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    amyj.mo41562a(arrayList, anaq2);
                }
                if (a.mo41598c()) {
                    break;
                }
                anaq2.mo41606a(a.mo41597b());
            }
            anaq2.mo41608b(a.mo41597b());
            amyj amyj2 = this.f76374c;
            amvm = amyj2.f76382c;
            thread = amyj2.f76383d;
        } catch (amyc e) {
            amvm.m63392c(this.f76374c.f76383d);
            this.f76374c.f76382c.mo41390a(e.f76366a);
            amyj amyj3 = this.f76374c;
            amvm = amyj3.f76382c;
            thread = amyj3.f76383d;
        } catch (Exception e2) {
            amvm.m63392c(this.f76374c.f76383d);
            this.f76374c.f76382c.mo41390a(e2);
            amyj amyj4 = this.f76374c;
            amvm = amyj4.f76382c;
            thread = amyj4.f76383d;
        } catch (Throwable th) {
            amyj amyj5 = this.f76374c;
            amyj5.f76382c.mo41392b(amyj5.f76383d);
            this.f76374c.f76383d = null;
            throw th;
        }
        amvm.mo41392b(thread);
        this.f76374c.f76383d = null;
    }
}

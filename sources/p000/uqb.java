package p000;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: uqb */
final /* synthetic */ class uqb implements Runnable {

    /* renamed from: a */
    private final uqe f48509a;

    public uqb(uqe uqe) {
        this.f48509a = uqe;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        uqe uqe = this.f48509a;
        if (uqe.f48522i.mo28343a()) {
            long currentTimeMillis = System.currentTimeMillis();
            uhj uhj = ((ugx) vpu.m41034a().f49757d).f47578a;
            Cursor a = uhj.mo27468a(umk.f48215a.mo27735b(), (String[]) null, umj.NEXT_NOTIFICATION_TIME.f48214g.mo27707b(currentTimeMillis), String.valueOf(umk.f48215a.f48341a.mo27700a()).concat(" ASC"));
            try {
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(umd.m38952a(uhj, a));
                }
                a.close();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uqe.mo27860a((umd) arrayList.get(i));
                }
                if (!arrayList.isEmpty()) {
                    uqe.mo27856a();
                    return;
                }
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        if (!vpu.m41034a().f49757d.mo27415a(umk.f48215a)) {
            uqe.mo27856a();
        }
    }
}

package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvr {

    /* renamed from: a */
    public static final imo f42258a = new qvq();

    /* renamed from: g */
    private static final Logger f42259g = qqu.m32671b("IndexManager");

    /* renamed from: b */
    public final qta f42260b = ((qta) qta.f42084i.mo13145b());

    /* renamed from: c */
    public final qtv f42261c = ((qtv) qtv.f42127e.mo13145b());

    /* renamed from: d */
    public final qtt f42262d = ((qtt) qtt.f42121a.mo13145b());

    /* renamed from: e */
    public final qvn f42263e = ((qvn) qvn.f42243a.mo13145b());

    /* renamed from: f */
    public final Object f42264f = new Object();

    /* renamed from: a */
    public static bngx m32965a(qrj qrj, qrf qrf) {
        bmxv a = qrf.mo24218a();
        if (!a.mo66813a()) {
            return bngx.m109376e();
        }
        bnic a2 = qrj.mo24226a(qrf);
        ArrayList arrayList = new ArrayList(a2.size());
        bnrd a3 = a2.iterator();
        while (a3.hasNext()) {
            ContentValues contentValues = new ContentValues((ContentValues) a.mo66814b());
            contentValues.put("id", (String) a3.next());
            arrayList.add(contentValues);
        }
        return bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: a */
    public final void mo24294a(acyr acyr) {
        synchronized (this.f42264f) {
            bnrd a = qtq.f42112a.iterator();
            while (a.hasNext()) {
                int intValue = ((Integer) a.next()).intValue();
                try {
                    mo24295a(acyr, intValue);
                } catch (qrp e) {
                    f42259g.mo25417e("Index for data type %d failed.", e, Integer.valueOf(intValue));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24295a(acyr acyr, int i) {
        bmxv a = qtm.m32864a(i);
        if (a.mo66813a()) {
            mo24296a((qtm) a.mo66814b(), acyr, i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo24296a(qtm qtm, acyr acyr, int i) {
        bmxv bmxv;
        synchronized (this.f42264f) {
            if (((Long) this.f42260b.mo24253a(acyr, qta.m32828c(i))).longValue() != qtm.mo24266e()) {
                bmxv c = this.f42263e.mo24290c(acyr);
                if (c.mo66813a()) {
                    qtt qtt = this.f42262d;
                    SQLiteDatabase a = qtt.f42122b.mo24263a();
                    a.beginTransaction();
                    try {
                        qtt.f42122b.mo24263a().delete(qtm.mo24256a(), "account=?", new String[]{acyr.f61090d});
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        bsty bsty = (bsty) c.mo66814b();
                        qrj a2 = qrk.m32721a(i);
                        if (a2.f41995a) {
                            bmxv = bmxv.m108566b(this.f42263e.mo24287a(acyr));
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        List<qtq> b = this.f42261c.mo24277b(acyr, i);
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        for (qtq qtq : b) {
                            try {
                                arrayList.addAll(m32965a(a2, a2.mo24227a(qtq, bmxv)));
                            } catch (qrl | qrp e) {
                                i2++;
                            }
                        }
                        if (i2 > 0) {
                            f42259g.mo25414c("Total invalid data ignored: %d.", Integer.valueOf(i2));
                        }
                        this.f42262d.mo24271a(qtm, acyr, arrayList);
                        this.f42260b.mo24254a(acyr, qta.m32828c(i), Long.valueOf(qtm.mo24266e()));
                    } catch (Throwable th) {
                        a.endTransaction();
                        throw th;
                    }
                }
            }
        }
    }
}

package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: qtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtr {

    /* renamed from: a */
    private final qta f42119a = ((qta) qta.f42084i.mo13145b());

    /* renamed from: b */
    private final qtv f42120b = ((qtv) qtv.f42127e.mo13145b());

    private qtr() {
    }

    /* renamed from: a */
    public static qtr m32879a() {
        return new qtr();
    }

    /* renamed from: a */
    public final void mo24269a(acyr acyr) {
        bnrd a = qtq.f42112a.iterator();
        while (a.hasNext()) {
            mo24270a(acyr, ((Integer) a.next()).intValue());
        }
    }

    /* renamed from: a */
    public final void mo24270a(acyr acyr, int i) {
        this.f42119a.mo24255a(acyr, qta.m32828c(i));
        this.f42119a.mo24255a(acyr, qta.m32825a(i));
        this.f42119a.mo24255a(acyr, qta.m32827b(i));
        qtv qtv = this.f42120b;
        SQLiteDatabase a = qtv.f42130g.mo24263a();
        a.beginTransaction();
        try {
            qtv.f42130g.mo24263a().delete("sync_entities", qtv.f42124b, new String[]{acyr.f61090d, String.valueOf(i)});
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}

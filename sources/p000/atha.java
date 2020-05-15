package p000;

import android.database.Cursor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;

/* renamed from: atha */
final /* synthetic */ class atha implements Runnable {

    /* renamed from: a */
    private final athb f90350a;

    /* renamed from: b */
    private final brep f90351b;

    public atha(athb athb, brep brep) {
        this.f90350a = athb;
        this.f90351b = brep;
    }

    public final void run() {
        athb athb = this.f90350a;
        brep brep = this.f90351b;
        srn srn = atgf.f90279a;
        Cursor rawQuery = athb.mo49978a().getReadableDatabase().rawQuery("SELECT * FROM Transactions", new String[0]);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(new bepn(rawQuery.getLong(rawQuery.getColumnIndex("transactionId")), BigDecimal.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("amountMicros"))).movePointLeft(6), Currency.getInstance(rawQuery.getString(rawQuery.getColumnIndex("currencyCode"))), rawQuery.getLong(rawQuery.getColumnIndex("timeMillisSinceEpoch")), rawQuery.getInt(rawQuery.getColumnIndex("type"))));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bepn bepn = (bepn) arrayList.get(i);
                new Object[1][0] = bepn;
                arrayList2.add(bepn);
            }
            brep.mo49932a(arrayList2);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}

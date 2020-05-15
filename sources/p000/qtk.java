package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtk {

    /* renamed from: a */
    public static final imo f42100a = new qtj();

    /* renamed from: c */
    private static final sek f42101c = qqu.m32671b("FacetGroupStore");

    /* renamed from: b */
    public final qth f42102b;

    public qtk(Context context) {
        this.f42102b = qth.m32851a(context);
    }

    /* renamed from: a */
    public final void mo24264a(List list) {
        SQLiteDatabase a = this.f42102b.mo24263a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byty byty = (byty) it.next();
                if (byty.f167734b.isEmpty()) {
                    f42101c.mo25416d("Invalid facet group data.", new Object[0]);
                } else {
                    String str = ((bytw) byty.f167734b.get(0)).f167728b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", str);
                    contentValues.put("value", byty.mo73642k());
                    qto.m32871a(a, "facet_group_data", contentValues);
                    bngs j = bngx.m109377j();
                    for (bytw bytw : byty.f167734b) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("facet_id", bytw.f167728b);
                        contentValues2.put("id", str);
                        j.mo67668c(contentValues2);
                    }
                    for (ContentValues contentValues3 : j.mo67664a()) {
                        qto.m32871a(a, "facet_group_index", contentValues3);
                    }
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: b */
    public final bnic mo24265b(List list) {
        bnic a;
        SQLiteDatabase a2 = this.f42102b.mo24263a();
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        String a3 = bmxr.m108544a(", ").mo66874a((Iterable) Collections.nCopies(list.size(), "?"));
        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 133);
        sb.append("SELECT DISTINCT(A.value) FROM facet_group_data AS A INNER JOIN facet_group_index AS A_IDX ON A.id=A_IDX.id WHERE A_IDX.facet_id IN (");
        sb.append(a3);
        sb.append(")");
        Cursor rawQuery = a2.rawQuery(sb.toString(), strArr);
        try {
            bnia j = bnic.m109500j();
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                j.mo67629b((byty) bxvk.m124014a(byty.f167731d, qto.m32873a(rawQuery, "value")));
                rawQuery.moveToNext();
            }
            a = j.mo67751a();
        } catch (bxwf e) {
            f42101c.mo25415d("Invalid facet group data.", e, new Object[0]);
            a = bnon.f131923a;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return a;
    }
}

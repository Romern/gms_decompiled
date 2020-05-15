package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: qte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qte {

    /* renamed from: a */
    public static final imo f42092a = new qtd();

    /* renamed from: c */
    private static final Logger f42093c = qqu.m32671b("AffiliationStore");

    /* renamed from: b */
    public final qth f42094b;

    public qte(Context context) {
        this.f42094b = qth.m32851a(context);
    }

    /* renamed from: a */
    public final bmxv mo24260a(String str) {
        bmxv bmxv;
        String a = qqt.m32667a(str);
        SQLiteDatabase a2 = this.f42094b.mo24263a();
        StringBuilder sb = new StringBuilder(141);
        sb.append("SELECT A.value FROM affiliation_data AS A INNER JOIN affiliation_index AS A_IDX ON A.id=A_IDX.id WHERE (A_IDX.facet_id=? OR A_IDX.facet_id=?)");
        Cursor rawQuery = a2.rawQuery(sb.toString(), new String[]{a.substring(0, a.length() - 1), a});
        try {
            rawQuery.moveToFirst();
            if (!rawQuery.isAfterLast()) {
                byts byts = (byts) GeneratedMessageLite.m124014a(byts.f167713b, qto.m32873a(rawQuery, "value"));
                bxvd bxvd = (bxvd) byts.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) byts);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((byts) bxvd.f164949b).f167715a = GeneratedMessageLite.m124030de();
                for (bytw bytw : byts.f167715a) {
                    bxvd bxvd2 = (bxvd) bytw.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) bytw);
                    String a3 = qqt.m32667a(bytw.f167728b);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bytw bytw2 = (bytw) bxvd2.f164949b;
                    bytw bytw3 = bytw.f167725e;
                    a3.getClass();
                    bytw2.f167727a |= 1;
                    bytw2.f167728b = a3;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    byts byts2 = (byts) bxvd.f164949b;
                    bytw bytw4 = (bytw) bxvd2.mo74062i();
                    bytw4.getClass();
                    byts2.mo74506c();
                    byts2.f167715a.add(bytw4);
                }
                bmxv = bmxv.m108566b((byts) bxvd.mo74062i());
            } else {
                bmxv = bmvz.f131120a;
            }
        } catch (bxwf e) {
            f42093c.mo25415d("Invalid affiliation data.", e, new Object[0]);
            bmxv = bmvz.f131120a;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return bmxv;
    }

    /* renamed from: a */
    public final void mo24261a(List list) {
        SQLiteDatabase a = this.f42094b.mo24263a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byts byts = (byts) it.next();
                if (byts.f167715a.isEmpty()) {
                    f42093c.mo25416d("Invalid affiliation data.", new Object[0]);
                } else {
                    String str = ((bytw) byts.f167715a.get(0)).f167728b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", str);
                    contentValues.put("value", byts.serializeToBytes());
                    qto.m32871a(a, "affiliation_data", contentValues);
                    bngs j = bngx.m109377j();
                    for (bytw bytw : byts.f167715a) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("facet_id", bytw.f167728b);
                        contentValues2.put("id", str);
                        j.mo67668c(contentValues2);
                    }
                    for (ContentValues contentValues3 : j.mo67664a()) {
                        qto.m32871a(a, "affiliation_index", contentValues3);
                    }
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}

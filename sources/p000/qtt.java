package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: qtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtt {

    /* renamed from: a */
    public static final imo f42121a = new qts();

    /* renamed from: b */
    public final qth f42122b;

    public qtt(Context context) {
        this.f42122b = qth.m32851a(context);
    }

    /* renamed from: a */
    public final void mo24271a(qtm qtm, acyr acyr, List list) {
        SQLiteDatabase a = this.f42122b.mo24263a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                contentValues.put("account", acyr.f61090d);
                qto.m32871a(a, qtm.mo24256a(), contentValues);
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}

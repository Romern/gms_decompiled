package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vhk {
    /* renamed from: a */
    public static final List m40439a(SQLiteDatabase sQLiteDatabase, int i) {
        unp unp;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            viz viz = viz.f49375d;
            cursor = sQLiteDatabase.query(viz.mo27735b(), viz.f49376e, null, null, null, null, String.valueOf(((unt) viz).f48341a.mo27700a()).concat(" DESC"));
            unp = viy.MUTATION.f49374c;
        } else if (i == 1) {
            unp = viv.MUTATION.f49366c;
            viw viw = viw.f49367d;
            cursor = sQLiteDatabase.query(viw.mo27735b(), viw.f49368e, null, null, null, null, String.valueOf(((unt) viw).f48341a.mo27700a()).concat(" DESC"));
        } else {
            unp = viq.MUTATION.f49350b;
            vir vir = vir.f49351d;
            cursor = sQLiteDatabase.query(vir.mo27735b(), vir.f49352e, null, null, null, null, String.valueOf(((unt) vir).f48341a.mo27700a()).concat(" DESC"));
        }
        while (cursor.moveToNext()) {
            try {
                arrayList.add((blhg) vho.m40444a(unp.mo27702a(cursor)));
            } finally {
                cursor.close();
            }
        }
        return arrayList;
    }
}

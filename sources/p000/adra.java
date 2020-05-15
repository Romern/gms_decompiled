package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;

/* renamed from: adra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adra implements aubw {

    /* renamed from: a */
    final /* synthetic */ adqt f62532a;

    /* renamed from: b */
    final /* synthetic */ List f62533b;

    /* renamed from: c */
    final /* synthetic */ bqgy f62534c;

    /* renamed from: d */
    final /* synthetic */ adrf f62535d;

    public adra(adrf adrf, adqt adqt, List list, bqgy bqgy) {
        this.f62535d = adrf;
        this.f62532a = adqt;
        this.f62533b = list;
        this.f62534c = bqgy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        boolean z;
        Void voidR = (Void) obj;
        this.f62532a.mo33728b(this.f62533b.size());
        new Object[1][0] = "Mediastore indexing task succeeded.";
        this.f62534c.mo69138b((Object) true);
        if (this.f62535d.mo33736b()) {
            adsi adsi = this.f62535d.f62546c;
            List<adsh> list = this.f62533b;
            try {
                SQLiteDatabase writableDatabase = adsi.f62622b.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (adsh adsh : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_ID", adsh.f62618a);
                        contentValues.put("MEDIA_TYPE", adsh.f62619b);
                        long insert = writableDatabase.insert("IntermediateStore", null, contentValues);
                        if (insert < 0) {
                            adnt.m50875c("Insert failed for fileId: %s", adsh.f62618a);
                        }
                        if (insert >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Boolean.valueOf(z).booleanValue();
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
            }
        }
    }
}

package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: adrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adrc implements aubw {

    /* renamed from: a */
    final /* synthetic */ bqgy f62538a;

    /* renamed from: b */
    final /* synthetic */ Integer f62539b;

    /* renamed from: c */
    final /* synthetic */ adrf f62540c;

    public adrc(adrf adrf, bqgy bqgy, Integer num) {
        this.f62540c = adrf;
        this.f62538a = bqgy;
        this.f62539b = num;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Void voidR = (Void) obj;
        new Object[1][0] = "Mediastore corpus remove task succeeded.";
        this.f62538a.mo69138b((Object) true);
        if (this.f62540c.mo33736b()) {
            adsi adsi = this.f62540c.f62546c;
            Integer num = this.f62539b;
            try {
                SQLiteDatabase writableDatabase = adsi.f62622b.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.delete("IntermediateStore", "MEDIA_TYPE=?", new String[]{String.valueOf(num)});
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
            }
        }
    }
}

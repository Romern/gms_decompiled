package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;

/* renamed from: adrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adrh implements aubw {

    /* renamed from: a */
    final /* synthetic */ List f62548a;

    /* renamed from: b */
    final /* synthetic */ bqgy f62549b;

    /* renamed from: c */
    final /* synthetic */ adrj f62550c;

    public adrh(adrj adrj, List list, bqgy bqgy) {
        this.f62550c = adrj;
        this.f62548a = list;
        this.f62549b = bqgy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        int i;
        Void voidR = (Void) obj;
        this.f62550c.f62558c.mo33726a(this.f62548a.size());
        this.f62549b.mo69138b((Object) true);
        adsi adsi = this.f62550c.f62557b;
        List list = this.f62548a;
        try {
            SQLiteDatabase writableDatabase = adsi.f62622b.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                if (((long) list.size()) <= ceqm.m137883n()) {
                    String[] strArr = new String[list.size()];
                    StringBuilder sb = new StringBuilder();
                    sb.append("_ID");
                    sb.append(" IN (");
                    int i2 = 0;
                    while (i2 < list.size()) {
                        strArr[i2] = Long.toString(((Long) list.get(i2)).longValue());
                        sb.append(i2 != 0 ? ", ?" : "?");
                        i2++;
                    }
                    sb.append(")");
                    adqu adqu = new adqu(sb.toString(), strArr);
                    i = writableDatabase.delete("IntermediateStore", adqu.f62528a, adqu.f62529b);
                    writableDatabase.setTransactionSuccessful();
                    if (i != this.f62548a.size()) {
                        adnt.m50875c("Intermediate store ids deletion failed: ids deleted: %d, ids should have been deleted: %d", Integer.valueOf(i), Integer.valueOf(this.f62548a.size()));
                        adns.m50862a().mo33690a(18);
                        return;
                    }
                    return;
                }
                long n = ceqm.m137883n();
                int size = list.size();
                StringBuilder sb2 = new StringBuilder(71);
                sb2.append("The ids size exceeds max allowed size ");
                sb2.append(n);
                sb2.append(": ");
                sb2.append(size);
                throw new IllegalArgumentException(sb2.toString());
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            i = 0;
        }
    }
}

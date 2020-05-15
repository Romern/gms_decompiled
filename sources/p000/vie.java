package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: vie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vie {
    /* renamed from: a */
    static void m40476a(SQLiteDatabase sQLiteDatabase, vho vho, bkra bkra, bkrc bkrc) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        vho vho2 = vho;
        bkra bkra2 = bkra;
        Set set = bkra2.f125150c;
        if (set.contains(bkqz.ADD_TO_UNDO)) {
            viz.f49375d.mo28492a(sQLiteDatabase2, vho2.mo28461a(bkra2.f125151d));
        }
        if (set.contains(bkqz.ADD_TO_REDO)) {
            viw.f49367d.mo28491a(sQLiteDatabase2, vho2.mo28461a(bkra2.f125151d));
        }
        if (set.contains(bkqz.ADD_TO_PENDING_BATCH)) {
            vir.f49351d.mo28490a(sQLiteDatabase2, vho2.mo28461a(bkra2.f125151d));
        }
        if (set.contains(bkqz.TRUNCATE_UNDO)) {
            viz viz = viz.f49375d;
            String a = ((unt) viz).f48341a.mo27700a();
            String b = viz.mo27735b();
            String b2 = viz.mo27735b();
            int length = String.valueOf(a).length();
            int length2 = String.valueOf(a).length();
            StringBuilder sb = new StringBuilder(length + 41 + length2 + String.valueOf(b2).length() + String.valueOf(a).length());
            sb.append(a);
            sb.append(" IN (SELECT ");
            sb.append(a);
            sb.append(" FROM ");
            sb.append(b2);
            sb.append(" ORDER BY ");
            sb.append(a);
            sb.append(" ASC LIMIT 1)");
            sQLiteDatabase2.delete(b, sb.toString(), null);
        }
        if (set.contains(bkqz.TRUNCATE_REDO)) {
            viw viw = viw.f49367d;
            String a2 = ((unt) viw).f48341a.mo27700a();
            String b3 = viw.mo27735b();
            String b4 = viw.mo27735b();
            int length3 = String.valueOf(a2).length();
            int length4 = String.valueOf(a2).length();
            StringBuilder sb2 = new StringBuilder(length3 + 41 + length4 + String.valueOf(b4).length() + String.valueOf(a2).length());
            sb2.append(a2);
            sb2.append(" IN (SELECT ");
            sb2.append(a2);
            sb2.append(" FROM ");
            sb2.append(b4);
            sb2.append(" ORDER BY ");
            sb2.append(a2);
            sb2.append(" ASC LIMIT 1)");
            sQLiteDatabase2.delete(b3, sb2.toString(), null);
        }
        if (set.contains(bkqz.POP_UNDO)) {
            viz viz2 = viz.f49375d;
            String a3 = ((unt) viz2).f48341a.mo27700a();
            String b5 = viz2.mo27735b();
            String b6 = viz2.mo27735b();
            int length5 = String.valueOf(a3).length();
            int length6 = String.valueOf(a3).length();
            StringBuilder sb3 = new StringBuilder(length5 + 52 + length6 + String.valueOf(b6).length() + String.valueOf(a3).length());
            sb3.append(a3);
            sb3.append(" IN (SELECT ");
            sb3.append(a3);
            sb3.append(" FROM ");
            sb3.append(b6);
            sb3.append(" ORDER BY ");
            sb3.append(a3);
            sb3.append(" DESC LIMIT 1)");
            sQLiteDatabase2.delete(b5, sb3.toString(), null);
        }
        if (set.contains(bkqz.POP_REDO)) {
            viw viw2 = viw.f49367d;
            String a4 = ((unt) viw2).f48341a.mo27700a();
            String b7 = viw2.mo27735b();
            String b8 = viw2.mo27735b();
            int length7 = String.valueOf(a4).length();
            int length8 = String.valueOf(a4).length();
            StringBuilder sb4 = new StringBuilder(length7 + 52 + length8 + String.valueOf(b8).length() + String.valueOf(a4).length());
            sb4.append(a4);
            sb4.append(" IN (SELECT ");
            sb4.append(a4);
            sb4.append(" FROM ");
            sb4.append(b8);
            sb4.append(" ORDER BY ");
            sb4.append(a4);
            sb4.append(" DESC LIMIT 1)");
            sQLiteDatabase2.delete(b7, sb4.toString(), null);
        }
        if (set.contains(bkqz.REFRESH_UNDO) || set.contains(bkqz.REFRESH_REDO) || set.contains(bkqz.REFRESH_PENDING_BATCH)) {
            bksw bksw = (bksw) bkrc;
            bkrb bkrb = new bkrb(bksw.f125247b, bksw.f125248c, bksw.f125249d);
            if (set.contains(bkqz.REFRESH_UNDO)) {
                sQLiteDatabase2.delete(viz.f49375d.mo27735b(), null, null);
                for (blhg blhg : bkrb.f125153b) {
                    viz.f49375d.mo28492a(sQLiteDatabase2, vho2.mo28461a(blhg));
                }
            }
            if (set.contains(bkqz.REFRESH_REDO)) {
                sQLiteDatabase2.delete(viw.f49367d.mo27735b(), null, null);
                for (blhg blhg2 : bkrb.f125154c) {
                    viw.f49367d.mo28491a(sQLiteDatabase2, vho2.mo28461a(blhg2));
                }
            }
            if (set.contains(bkqz.REFRESH_PENDING_BATCH)) {
                sQLiteDatabase2.delete(vir.f49351d.mo27735b(), null, null);
                for (blhg blhg3 : bkrb.f125155d) {
                    vir.f49351d.mo28490a(sQLiteDatabase2, vho2.mo28461a(blhg3));
                }
            }
        }
    }
}

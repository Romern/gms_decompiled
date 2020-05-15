package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vit extends uha {
    public vit(Context context, String str, String str2) {
        super(context, str, str2, vis.values(), 6, 4);
        setWriteAheadLoggingEnabled(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        super.mo10021b(sQLiteDatabase);
        if (sQLiteDatabase.enableWriteAheadLogging()) {
            sQLiteDatabase.execSQL("PRAGMA synchronous = normal;");
        }
        if (!((Boolean) twy.f46861as.mo58455c()).booleanValue()) {
            viz viz = new viz(sQLiteDatabase.getVersion());
            viw viw = new viw(sQLiteDatabase.getVersion());
            sQLiteDatabase.delete(viz.mo27735b(), null, null);
            sQLiteDatabase.delete(viw.mo27735b(), null, null);
        }
    }

    /* renamed from: c */
    public final void mo27455c(SQLiteDatabase sQLiteDatabase) {
        String a = vih.KEY.f49329c.mo27700a();
        String b = vii.f49330d.mo27735b();
        String a2 = vih.KEY.f49329c.mo27700a();
        String a3 = vih.KEY.f49329c.mo27700a();
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(b).length();
        StringBuilder sb = new StringBuilder(length + 136 + length2 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("CREATE TRIGGER DocumentStoreNameTrigger BEFORE UPDATE OF ");
        sb.append(a);
        sb.append(" ON ");
        sb.append(b);
        sb.append(" WHEN OLD.");
        sb.append(a2);
        sb.append(" != NEW.");
        sb.append(a3);
        sb.append(" BEGIN SELECT RAISE(ROLLBACK, \"Cannot change key.\"); END;");
        sQLiteDatabase.execSQL(sb.toString());
        String a4 = vih.VALUE.f49329c.mo27700a();
        String b2 = vii.f49330d.mo27735b();
        String a5 = vih.KEY.f49329c.mo27700a();
        String a6 = vih.VALUE.f49329c.mo27700a();
        String a7 = vih.VALUE.f49329c.mo27700a();
        int length3 = String.valueOf(a4).length();
        int length4 = String.valueOf(b2).length();
        int length5 = String.valueOf(a5).length();
        StringBuilder sb2 = new StringBuilder(length3 + 171 + length4 + length5 + String.valueOf(a6).length() + String.valueOf(a7).length());
        sb2.append("CREATE TRIGGER RevisionIncrementTrigger BEFORE UPDATE OF ");
        sb2.append(a4);
        sb2.append(" ON ");
        sb2.append(b2);
        sb2.append(" WHEN OLD.");
        sb2.append(a5);
        sb2.append(" = \"revision\" AND OLD.");
        sb2.append(a6);
        sb2.append(" >= NEW.");
        sb2.append(a7);
        sb2.append(" BEGIN SELECT RAISE(ROLLBACK, \"Revision can only be increased.\"); END;");
        sQLiteDatabase.execSQL(sb2.toString());
    }
}

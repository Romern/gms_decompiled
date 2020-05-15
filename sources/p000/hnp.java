package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: hnp */
public final /* synthetic */ class hnp implements hnh {

    /* renamed from: a */
    private final String f20080a;

    /* renamed from: b */
    private final Object f20081b;

    /* renamed from: c */
    private final hnl f20082c;

    public hnp(hnl hnl, String str, Object obj) {
        this.f20082c = hnl;
        this.f20080a = str;
        this.f20081b = obj;
    }

    /* renamed from: a */
    public final boolean mo12633a(SQLiteDatabase sQLiteDatabase) {
        hnl hnl = this.f20082c;
        String str = this.f20080a;
        Object obj = this.f20081b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", "---");
        contentValues.put("app", hds.m14229b(str));
        contentValues.put("key", hnl.f20074a);
        contentValues.put("value", (String) hnl.f20076c.mo66854a().mo66855c(obj));
        return sQLiteDatabase.replace("credential_app_setting", null, contentValues) != -1;
    }
}

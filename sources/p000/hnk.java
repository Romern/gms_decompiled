package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: hnk */
public final /* synthetic */ class hnk implements hnh {

    /* renamed from: a */
    private final String f20071a;

    /* renamed from: b */
    private final Object f20072b;

    /* renamed from: c */
    private final hnl f20073c;

    public hnk(hnl hnl, String str, Object obj) {
        this.f20073c = hnl;
        this.f20071a = str;
        this.f20072b = obj;
    }

    /* renamed from: a */
    public final boolean mo12633a(SQLiteDatabase sQLiteDatabase) {
        hnl hnl = this.f20073c;
        String str = this.f20071a;
        Object obj = this.f20072b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str);
        contentValues.put("key", hnl.f20074a);
        contentValues.put("value", (String) hnl.f20076c.mo66854a().mo66855c(obj));
        return sQLiteDatabase.replace("credential_setting", null, contentValues) != -1;
    }
}

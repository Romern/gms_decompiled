package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: lxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxa {

    /* renamed from: a */
    public final lwx f33135a;

    public lxa(lwx lwx) {
        this.f33135a = lwx;
    }

    /* renamed from: a */
    public final long mo19719a(lwz lwz) {
        SQLiteDatabase a = this.f33135a.mo19716a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("secondary_key_alias", lwz.f33132a);
        contentValues.put("package_name", lwz.f33133b);
        contentValues.put("wrapped_key_bytes", lwz.f33134c);
        return a.replace("tertiary_keys", null, contentValues);
    }
}

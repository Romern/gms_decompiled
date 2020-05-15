package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;

/* renamed from: acne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acne {

    /* renamed from: a */
    public final ContentResolver f60229a;

    /* renamed from: b */
    private final abym f60230b;

    public acne(abym abym, ContentResolver contentResolver) {
        this.f60230b = abym;
        this.f60229a = contentResolver;
    }

    /* renamed from: a */
    public final int mo32906a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return this.f60229a.update(uri, contentValues, str, strArr);
        } catch (SecurityException e) {
            this.f60230b.mo32447a("cr_update_security_exc");
            return 0;
        } catch (SQLiteException e2) {
            this.f60230b.mo32447a("cr_update_sqlite_exc");
            return 0;
        } catch (NullPointerException e3) {
            this.f60230b.mo32447a("cr_update_npe");
            return 0;
        } catch (IllegalArgumentException e4) {
            this.f60230b.mo32447a("cr_update_illegal_arg_exc");
            return 0;
        } catch (NoClassDefFoundError e5) {
            this.f60230b.mo32447a("cr_update_no_class_def_found_err");
            return 0;
        }
    }

    /* renamed from: a */
    public final Cursor mo32907a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return this.f60229a.query(uri, strArr, str, strArr2, str2);
        } catch (SecurityException e) {
            this.f60230b.mo32447a("cr_query_security_exc");
            return null;
        } catch (SQLiteException e2) {
            this.f60230b.mo32447a("cr_query_sqlite_exc");
            return null;
        } catch (NullPointerException e3) {
            this.f60230b.mo32447a("cr_query_npe");
            return null;
        } catch (NoClassDefFoundError e4) {
            this.f60230b.mo32447a("cr_query_no_class_def_found_err");
            return null;
        }
    }
}

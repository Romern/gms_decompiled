package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ftu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftu {
    /* renamed from: a */
    public static String m12368a(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_seqno_table_appdatasearch");
    }

    /* renamed from: b */
    public static String m12370b(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_insert_trigger_appdatasearch");
    }

    /* renamed from: c */
    public static String m12372c(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_delete_trigger_appdatasearch");
    }

    /* renamed from: d */
    public static String m12373d(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_update_trigger_appdatasearch");
    }

    /* renamed from: e */
    public static String m12374e(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_tag_insert_trigger_appdatasearch");
    }

    /* renamed from: f */
    public static String m12375f(ftz ftz) {
        return String.valueOf(ftz.f17242a).concat("_tag_delete_trigger_appdatasearch");
    }

    /* renamed from: g */
    public static Set m12376g(ftz ftz) {
        HashSet hashSet = new HashSet(Arrays.asList(m12370b(ftz), m12372c(ftz), m12373d(ftz)));
        if (ftz.f17246e != null) {
            hashSet.add(m12374e(ftz));
            hashSet.add(m12375f(ftz));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static Set m12369a(SQLiteDatabase sQLiteDatabase) {
        return fua.m12400a(sQLiteDatabase, "_seqno_table_appdatasearch");
    }

    /* renamed from: b */
    public static Set m12371b(SQLiteDatabase sQLiteDatabase) {
        return fua.m12402b(sQLiteDatabase, "_trigger_appdatasearch");
    }
}

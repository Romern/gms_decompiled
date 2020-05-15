package p000;

/* renamed from: ztb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztb {

    /* renamed from: a */
    static final String f55860a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s, %s, %s, %s);", "Sessions", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "app_package TEXT NOT NULL", "start_time INTEGER NOT NULL", "end_time INTEGER NOT NULL DEFAULT 0", "name TEXT NOT NULL", "identifier TEXT", "description TEXT", "activity INTEGER NOT NULL", "active_time_millis INTEGER");
    @Deprecated

    /* renamed from: b */
    static final String f55861b = String.format("DELETE FROM %s WHERE EXISTS (SELECT 1 FROM %s s2 WHERE %s.%s = s2.%s and %s.%s < s2.%s)", "Sessions", "Sessions", "Sessions", "identifier", "identifier", "Sessions", "_id", "_id");

    /* renamed from: c */
    static final String f55862c = String.format("DELETE FROM %s WHERE EXISTS (SELECT 1 FROM %s s2 WHERE %s.%s = s2.%s and %s.%s = s2.%s and %s.%s < s2.%s)", "Sessions", "Sessions", "Sessions", "app_package", "app_package", "Sessions", "identifier", "identifier", "Sessions", "_id", "_id");

    /* renamed from: d */
    static final String f55863d = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", "Sessions", "active_time_millis");
}

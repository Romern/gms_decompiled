package p000;

/* renamed from: ztc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztc {

    /* renamed from: a */
    static final String f55864a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s, %s, %s);", "Subscriptions", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "app_package TEXT NOT NULL", String.format("%s INTEGER REFERENCES %s (%s)", "data_source_id", "DataSources", "_id"), String.format("%s INTEGER REFERENCES %s (%s)", "data_type_id", "DataTypes", "_id"), "sampling_delay INTEGER NOT NULL", "accuracy_mode INTEGER NOT NULL", "timestamp INTEGER NOT NULL", "realm INTEGER NOT NULL");

    /* renamed from: b */
    static final String f55865b = String.format("%s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s", "Subscriptions", "DataSources", "DataSources", "_id", "Subscriptions", "data_source_id", "DataTypes", "DataTypes", "_id", "Subscriptions", "data_type_id");

    /* renamed from: c */
    static final String f55866c = String.format("DELETE FROM %s WHERE %s IN (%s)", "Subscriptions", "data_source_id", zsy.f55848a);
}

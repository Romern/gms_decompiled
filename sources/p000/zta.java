package p000;

/* renamed from: zta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zta {

    /* renamed from: a */
    static final String f55856a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", "DataPointRows", "_id INTEGER PRIMARY KEY AUTOINCREMENT", String.format("%s INTEGER REFERENCES %s(%s)", "data_source_id", "DataSources", "_id"), "start_time INTEGER NOT NULL", "end_time INTEGER NOT NULL", "data_point BLOB NOT NULL", String.format("%s INTEGER REFERENCES %s(%s)", "origin_data_source_id", "DataSources", "_id"));

    /* renamed from: b */
    static final String f55857b = String.format("CREATE INDEX IF NOT EXISTS DataPointMinTimestamps ON %s(%s, %s)", "DataPointRows", "data_source_id", "start_time");

    /* renamed from: c */
    static final String f55858c = String.format("CREATE INDEX IF NOT EXISTS DataPointMaxTimestamps ON %s(%s, %s)", "DataPointRows", "data_source_id", "end_time");

    /* renamed from: d */
    static final String f55859d = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER REFERENCES %s(%s)", "DataPointRows", "origin_data_source_id", "DataSources", "_id");
}

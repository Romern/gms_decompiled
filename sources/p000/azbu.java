package p000;

/* renamed from: azbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbu {

    /* renamed from: a */
    public static final String f98923a;

    /* renamed from: b */
    public static final String f98924b;

    /* renamed from: c */
    public static final String f98925c;

    /* renamed from: d */
    public static final String[] f98926d = {"ALTER TABLE tachystickreachability ADD COLUMN last_sync_package TEXT;", "ALTER TABLE tachystickreachability ADD COLUMN last_sync_millis_from_package INTEGER DEFAULT 0;", "ALTER TABLE tachystickreachability ADD COLUMN capability TEXT;", "ALTER TABLE tachystickreachability ADD COLUMN registration_id TEXT;", "CREATE INDEX index_tachystickreachability_package_sort ON tachystickreachability (last_sync_package);"};

    /* renamed from: e */
    private static final String f98927e = bmxr.m108544a(", ").mo66875a("id TEXT", "id_type INTEGER", "reachable_app TEXT", "last_sync_millis INTEGER DEFAULT 0");

    /* renamed from: f */
    private static final String f98928f = bmxr.m108544a(", ").mo66875a(f98927e, "last_sync_package TEXT", "last_sync_millis_from_package INTEGER DEFAULT 0", "capability TEXT", "registration_id TEXT");

    static {
        String str = f98927e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
        sb.append("CREATE TABLE tachystickreachability(");
        sb.append(str);
        sb.append(");");
        f98923a = sb.toString();
        String str2 = f98928f;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 38);
        sb2.append("CREATE TABLE tachystickreachability(");
        sb2.append(str2);
        sb2.append(");");
        String sb3 = sb2.toString();
        f98924b = sb3;
        f98925c = sb3;
    }
}

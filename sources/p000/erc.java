package p000;

/* renamed from: erc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class erc extends C0961ek {
    public erc() {
        super(7, 8);
    }

    /* renamed from: a */
    public final void mo10221a(C0933dj djVar) {
        djVar.mo9115b("DROP TABLE resource_info");
        djVar.mo9115b("CREATE TABLE resource_info (accountName TEXT NOT NULL, language TEXT NOT NULL,  resourceKey BLOB NOT NULL, resource BLOB, lastUpdatedMs INTEGER, darkModeEnabled INTEGER NOT NULL, PRIMARY KEY (accountName, language, resourceKey, darkModeEnabled))");
    }
}

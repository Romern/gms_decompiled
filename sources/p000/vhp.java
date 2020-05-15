package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: vhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhp extends vhi {

    /* renamed from: b */
    private final vho f49281b;

    /* renamed from: c */
    private final bkpv f49282c;

    /* renamed from: d */
    private final bkra f49283d;

    /* renamed from: e */
    private final bkrc f49284e;

    public vhp(vhs vhs, vho vho, bkpv bkpv, bkra bkra, bkrc bkrc) {
        super("LocalMutationOperation", vhs);
        this.f49281b = vho;
        this.f49282c = bkpv;
        this.f49283d = bkra;
        this.f49284e = bkrc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28457a() {
        this.f49272a.mo28466d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28458a(SQLiteDatabase sQLiteDatabase) {
        umn b = mo28459b();
        if (!b.f48227e) {
            b.f48227e = true;
            b.mo27725t();
        }
        vil.f49336d.mo28488a(sQLiteDatabase, this.f49281b.mo28461a(this.f49282c.f125097b));
        vio.f49344d.mo28489a(sQLiteDatabase, this.f49281b.mo28460a(this.f49282c));
        if (this.f49272a.f49288b) {
            vie.m40476a(sQLiteDatabase, this.f49281b, this.f49283d, this.f49284e);
        }
    }
}

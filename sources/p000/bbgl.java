package p000;

import android.database.sqlite.SQLiteException;
import java.io.File;

/* renamed from: bbgl */
public final /* synthetic */ class bbgl implements bmzi {

    /* renamed from: a */
    private final bemd f102590a;

    /* renamed from: b */
    private final File f102591b;

    /* renamed from: c */
    private final bnsn f102592c;

    public bbgl(bemd bemd, File file, bnsn bnsn) {
        this.f102590a = bemd;
        this.f102591b = file;
        this.f102592c = bnsn;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        bemd bemd = this.f102590a;
        File file = this.f102591b;
        bnsn bnsn = this.f102592c;
        benp benp = new benp();
        benp.mo60824a("SELECT 1");
        return bqdf.m112620a(bqdx.m112673a(bemd.f111814a.mo60807a().mo69186a(bljx.m107267a(new bema(benp.mo60822a())), bqfb.INSTANCE).mo69187a(), new bbgp(bemd), bqfb.INSTANCE), SQLiteException.class, new bbgs(file, bnsn), bqfb.INSTANCE);
    }
}

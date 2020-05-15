package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vid extends vhi {

    /* renamed from: b */
    private final vho f49319b;

    /* renamed from: c */
    private final List f49320c;

    /* renamed from: d */
    private final bkpx f49321d;

    /* renamed from: e */
    private final bkra f49322e;

    /* renamed from: f */
    private final bkrc f49323f;

    /* renamed from: g */
    private final boolean f49324g;

    public vid(vhs vhs, vho vho, List list, bkpx bkpx, bkra bkra, bkrc bkrc, boolean z) {
        super("RemoteMutationOperation", vhs);
        this.f49319b = vho;
        this.f49320c = list;
        this.f49321d = bkpx;
        this.f49322e = bkra;
        this.f49323f = bkrc;
        this.f49324g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28458a(SQLiteDatabase sQLiteDatabase) {
        for (blhg blhg : this.f49320c) {
            vil.f49336d.mo28488a(sQLiteDatabase, this.f49319b.mo28461a(blhg));
        }
        List<bkpv> list = this.f49321d.f125107d;
        vio vio = vio.f49344d;
        vho vho = this.f49319b;
        ArrayList arrayList = new ArrayList(list.size());
        for (bkpv bkpv : list) {
            arrayList.add(vho.mo28460a(bkpv));
        }
        sQLiteDatabase.delete(vio.mo27735b(), "1", null);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vio.mo28489a(sQLiteDatabase, (String) arrayList.get(i));
        }
        mo28459b().f48227e = !list.isEmpty();
        vii.f49330d.mo28483a(sQLiteDatabase, this.f49321d.f125105b);
        sQLiteDatabase.delete(viz.f49375d.mo27735b(), null, null);
        if (this.f49272a.f49288b) {
            vie.m40476a(sQLiteDatabase, this.f49319b, this.f49322e, this.f49323f);
        }
        mo28459b().f48228f = this.f49324g;
        mo28459b().mo27725t();
    }
}

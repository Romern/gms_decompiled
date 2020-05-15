package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;

/* renamed from: vhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhn extends vhi {

    /* renamed from: b */
    private final vho f49277b;

    /* renamed from: c */
    private final bkpw f49278c;

    public vhn(vhs vhs, vho vho, bkpw bkpw) {
        super("InitialSnapshotOperation", vhs);
        this.f49277b = vho;
        this.f49278c = bkpw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28458a(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        vii vii = vii.f49330d;
        vil vil = vil.f49336d;
        bkpw bkpw = this.f49278c;
        vho vho = this.f49277b;
        Iterator it = bkpw.f125102d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bkvo bkvo = (bkvo) it.next();
            if (bkvo.f125339f) {
                vii.mo28484a(sQLiteDatabase, "meSessionId", bkvo.f125334a);
                vii.mo28484a(sQLiteDatabase, "meDisplayName", bkvo.f125336c);
                vii.mo28484a(sQLiteDatabase, "meUserId", bkvo.f125335b);
                vii.mo28484a(sQLiteDatabase, "meColor", bkvo.f125337d);
                vii.mo28484a(sQLiteDatabase, "mePhotoUrl", bkvo.f125340g);
                vii.mo28484a(sQLiteDatabase, "mePermissionId", bkvo.f125341h);
                break;
            }
        }
        if (bkpw.f125100b == bkwz.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        vii.mo28485a(sQLiteDatabase, z);
        for (blhg blhg : bkpw.f125101c) {
            vil.mo28488a(sQLiteDatabase, vho.mo28461a(blhg));
        }
        vii.mo28486b(sQLiteDatabase, vil.mo28487a(sQLiteDatabase));
        vii.mo28483a(sQLiteDatabase, bkpw.f125099a.f125105b);
        mo28459b().f48228f = false;
        mo28459b().mo27725t();
    }
}

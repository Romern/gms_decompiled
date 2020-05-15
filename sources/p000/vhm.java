package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: vhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vhm extends vhi {

    /* renamed from: b */
    private final vho f49276b;

    public vhm(vhs vhs, vho vho) {
        super("CompactSnapshotOperation", vhs);
        this.f49276b = vho;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28458a(SQLiteDatabase sQLiteDatabase) {
        vhs vhs = this.f49272a;
        if (vil.f49336d.mo28487a(sQLiteDatabase) >= ((Integer) twy.f46858ap.mo58455c()).intValue()) {
            try {
                bkpw bkpw = vhs.mo28464b().f124858a;
                bksp bksp = new bksp(Integer.MAX_VALUE, bkrb.f125152a, -1);
                bksp.mo66104a(bkpw.f125101c, bkqw.f125125c);
                sQLiteDatabase.delete(vil.f49336d.mo27735b(), null, null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (String str : bksp.f125231b.mo66332a()) {
                    bksb b = bksp.mo66227a(str);
                    arrayList.add(b.mo66250g());
                    if (b instanceof bkqt) {
                        arrayList3.addAll(b.mo66254k());
                    } else {
                        arrayList2.addAll(b.mo66254k());
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size() + arrayList2.size() + arrayList3.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                arrayList4.addAll(arrayList3);
                int size = arrayList4.size();
                for (int i = 0; i < size; i++) {
                    vil.f49336d.mo28488a(sQLiteDatabase, this.f49276b.mo28461a((blhg) arrayList4.get(i)));
                }
                vii.f49330d.mo28486b(sQLiteDatabase, vil.f49336d.mo28487a(sQLiteDatabase));
                mo28459b().f48229g = 0;
                mo28459b().mo27725t();
            } catch (vht e) {
            }
        }
    }
}

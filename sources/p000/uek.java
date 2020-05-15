package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: uek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uek extends uch {

    /* renamed from: f */
    private final RealtimeDocumentSyncRequest f47357f;

    /* renamed from: g */
    private final vhu f47358g;

    /* renamed from: h */
    private final vic f47359h;

    public uek(ubk ubk, RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, uto uto) {
        super("SyncRealtimeDocumentsOperation", ubk, uto);
        this.f47357f = realtimeDocumentSyncRequest;
        vpu vpu = ubk.f47142c;
        this.f47358g = vkq.m40631a(vpu.f49755b, vpu).f49393a;
        this.f47359h = vpu.f49776w;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo27234d(Context context) {
        uey b = mo27233b();
        vhu vhu = this.f47358g;
        List list = this.f47357f.f30747a;
        ArrayList<DriveId> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(DriveId.m22924a((String) list.get(i)));
        }
        vhu.f49296a.mo27476b();
        try {
            for (DriveId driveId : arrayList) {
                umn b2 = vhu.mo28474b(new vhb(driveId, b));
                b2.f48228f = true;
                b2.mo27725t();
            }
            vhu.f49296a.mo27480f();
            vhu.f49296a.mo27478d();
            vhu vhu2 = this.f47358g;
            List list2 = this.f47357f.f30748b;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(new vhb(DriveId.m22924a((String) list2.get(i2)), b));
            }
            vhu2.mo28472a(arrayList2);
            this.f47359h.mo28480a();
            this.f47238b.mo27971a();
        } catch (Throwable th) {
            vhu.f49296a.mo27478d();
            throw th;
        }
    }
}

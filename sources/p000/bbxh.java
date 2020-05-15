package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbxh */
final /* synthetic */ class bbxh implements Callable {

    /* renamed from: a */
    private final bbxm f103659a;

    /* renamed from: b */
    private final bqgg f103660b;

    /* renamed from: c */
    private final ContactId f103661c;

    /* renamed from: d */
    private final bqgg f103662d;

    public bbxh(bbxm bbxm, bqgg bqgg, ContactId contactId, bqgg bqgg2) {
        this.f103659a = bbxm;
        this.f103660b = bqgg;
        this.f103661c = contactId;
        this.f103662d = bqgg2;
    }

    public final Object call() {
        bbxm bbxm = this.f103659a;
        bqgg bqgg = this.f103660b;
        ContactId contactId = this.f103661c;
        bqgg bqgg2 = this.f103662d;
        try {
            bqga.m112780a((Future) bqgg);
            try {
                bqga.m112780a((Future) bqgg2);
                bbpo b = bbpp.m88355b();
                int a = ((bbys) bqgg.get()).mo56535a();
                if (a == 0) {
                    b.f103038a = 2;
                } else if (a == 1) {
                    b.f103038a = 3;
                } else if (a == 2) {
                    b.f103038a = 4;
                }
                return b.mo56336a();
            } catch (ExecutionException e) {
                bbos.m88292b("TyRegController", "Failed to store registration into registration store", e);
                bcfx bcfx = bbxm.f103677c;
                bcnr q = bcns.m89409q();
                q.mo57011b(8);
                q.mo57012b(contactId);
                bcfx.mo56753a(q.mo57002a());
                bbpo b2 = bbpp.m88355b();
                b2.f103038a = 3;
                return b2.mo56336a();
            }
        } catch (ExecutionException e2) {
            bbos.m88292b("TyRegController", "Failed to register", e2);
            bcfx bcfx2 = bbxm.f103677c;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(8);
            q2.mo57012b(contactId);
            bcfx2.mo56753a(q2.mo57002a());
            bbpo b3 = bbpp.m88355b();
            b3.f103038a = 3;
            return b3.mo56336a();
        }
    }
}

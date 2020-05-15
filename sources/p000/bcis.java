package p000;

import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Future;

/* renamed from: bcis */
final /* synthetic */ class bcis implements bqeg {

    /* renamed from: a */
    private final bcjm f104252a;

    /* renamed from: b */
    private final bqgg f104253b;

    /* renamed from: c */
    private final ContactId f104254c;

    /* renamed from: d */
    private final bcoh f104255d;

    public bcis(bcjm bcjm, bqgg bqgg, ContactId contactId, bcoh bcoh) {
        this.f104252a = bcjm;
        this.f104253b = bqgg;
        this.f104254c = contactId;
        this.f104255d = bcoh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104252a;
        bqgg bqgg = this.f104253b;
        ContactId contactId = this.f104254c;
        bcoh bcoh = this.f104255d;
        try {
            bqga.m112780a((Future) bqgg);
        } catch (Throwable th) {
            if (chuv.m149608a(th).f189233s == chuv.f189223j.f189233s && contactId.mo60494c() == ContactId.ContactType.EMAIL) {
                try {
                    String str = (String) bcjm.f104337f.remove(contactId.mo60492a());
                    if (!TextUtils.isEmpty(str)) {
                        bcjm.f104338g.mo54580a(str);
                        return bqga.m112775a((Object) true);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("Failed to clear OAuth token with Exception: ");
                    sb.append(valueOf);
                    bbos.m88294d("Backend", sb.toString());
                    bcnr q = bcns.m89409q();
                    q.mo57011b(10024);
                    q.mo57012b(contactId);
                    if (bcoh != null) {
                        q.mo57010a(bcoh.mo57059c().mo73781l());
                    }
                    bcjm.f104334c.mo56753a(q.mo57002a());
                }
            }
        }
        return bqga.m112775a((Object) false);
    }
}

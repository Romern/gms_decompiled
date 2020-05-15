package p000;

import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Future;

/* renamed from: bcip */
final /* synthetic */ class bcip implements bqeg {

    /* renamed from: a */
    private final bcjm f104244a;

    /* renamed from: b */
    private final bqgg f104245b;

    /* renamed from: c */
    private final ContactId f104246c;

    /* renamed from: d */
    private final boolean f104247d;

    public bcip(bcjm bcjm, bqgg bqgg, ContactId contactId, boolean z) {
        this.f104244a = bcjm;
        this.f104245b = bqgg;
        this.f104246c = contactId;
        this.f104247d = z;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104244a;
        bqgg bqgg = this.f104245b;
        ContactId contactId = this.f104246c;
        boolean z = this.f104247d;
        try {
            bqga.m112780a((Future) bqgg);
        } catch (Throwable th) {
            if (chuv.m149608a(th).f189233s == chuv.f189223j.f189233s) {
                if (contactId.mo60494c() == ContactId.ContactType.EMAIL && z) {
                    try {
                        String str = (String) bcjm.f104337f.remove(contactId.mo60492a());
                        if (!TextUtils.isEmpty(str)) {
                            bcjm.f104338g.mo54580a(str);
                        }
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                        sb.append("Failed to clear OAuth token with Exception: ");
                        sb.append(valueOf);
                        bbos.m88294d("Backend", sb.toString());
                    }
                }
                return bqga.m112775a((Object) true);
            }
        }
        return bqga.m112775a((Object) false);
    }
}

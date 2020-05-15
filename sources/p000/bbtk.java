package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bbtk */
final /* synthetic */ class bbtk implements bdaq {

    /* renamed from: a */
    private final bbub f103344a;

    /* renamed from: b */
    private final bcic f103345b;

    public bbtk(bbub bbub, bcic bcic) {
        this.f103344a = bbub;
        this.f103345b = bcic;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bbub bbub = this.f103344a;
        bcic bcic = this.f103345b;
        if (!((Boolean) obj).booleanValue()) {
            ConversationId b = bcic.mo56876b();
            ContactId c = bcic.mo56877c();
            bbon.m88284a();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (bbub.f103399t) {
                if (bcic.mo56878d() == 1) {
                    long millis = TimeUnit.MICROSECONDS.toMillis(bcic.mo56879e());
                    bbub.f103386g.mo56346a(b, c, bcic.mo56881f());
                    long j = currentTimeMillis + millis;
                    if (!bbub.f103400u.containsKey(b)) {
                        bbub.f103400u.put(b, new HashMap());
                    }
                    ((Map) bbub.f103400u.get(b)).put(c, Long.valueOf(j));
                    if (millis > 0) {
                        bbub.f103401v.schedule(new bbty(bbub, b, c), millis);
                    }
                    bcfx bcfx = bbub.f103390k;
                    bcnr q = bcns.m89409q();
                    q.mo57011b(47);
                    q.mo57003a(347);
                    q.mo57012b(bbub.f103381b.mo57058b().mo57074e());
                    q.mo57010a(bbub.f103381b.mo57059c().mo73781l());
                    q.mo57013b(bcic.mo56875a());
                    q.mo57008a(bcic.mo56876b());
                    bcfx.mo56753a(q.mo57002a());
                } else if (bcic.mo56878d() == 2) {
                    bbub.f103386g.mo56348b(b, c, bcic.mo56881f());
                    bbub.mo56422a(b, c);
                    bcfx bcfx2 = bbub.f103390k;
                    bcnr q2 = bcns.m89409q();
                    q2.mo57011b(47);
                    q2.mo57003a(348);
                    q2.mo57012b(bbub.f103381b.mo57058b().mo57074e());
                    q2.mo57010a(bbub.f103381b.mo57059c().mo73781l());
                    q2.mo57013b(bcic.mo56875a());
                    q2.mo57008a(bcic.mo56876b());
                    bcfx2.mo56753a(q2.mo57002a());
                } else {
                    bcfx bcfx3 = bbub.f103390k;
                    bcnr q3 = bcns.m89409q();
                    q3.mo57011b(47);
                    q3.mo57003a(341);
                    q3.mo57012b(bbub.f103381b.mo57058b().mo57074e());
                    q3.mo57010a(bbub.f103381b.mo57059c().mo73781l());
                    q3.mo57013b(bcic.mo56875a());
                    q3.mo57008a(bcic.mo56876b());
                    bcfx3.mo56753a(q3.mo57002a());
                }
                bbub.f103398s.post(new bbtl(bbub, bcic));
            }
        }
    }
}

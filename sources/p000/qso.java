package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: qso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qso extends qsi {

    /* renamed from: b */
    private static final sek f42045b = qqu.m32670a("ListAffiliationsOperation");

    /* renamed from: c */
    private final qrx f42046c;

    /* renamed from: d */
    private final List f42047d;

    /* renamed from: e */
    private final qvi f42048e = ((qvi) qvi.f42229b.mo13145b());

    public qso(qrx qrx, Account account, List list) {
        super("ListAffiliations", account);
        this.f42046c = qrx;
        this.f42047d = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            this.f42046c.mo24233a(new qsf(status, bngx.m109376e()).mo24248b());
        } catch (IOException e) {
            f42045b.mo25410a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        bngx a;
        try {
            qrx qrx = this.f42046c;
            Status status = Status.f30107a;
            qvi qvi = this.f42048e;
            List<String> list = this.f42047d;
            synchronized (qvi.f42233f) {
                qvi.mo24284a();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (String str : list) {
                    bmxv a2 = qvi.f42230c.mo24260a(str);
                    if (a2.mo66813a()) {
                        hashSet.add((byts) a2.mo66814b());
                    } else {
                        hashSet2.add(str);
                    }
                }
                if (!hashSet2.isEmpty()) {
                    byuc a3 = qvi.f42232e.mo24282a(bngx.m109368a((Collection) hashSet2));
                    if (!a3.f167760a.isEmpty()) {
                        qvi.f42230c.mo24261a(bngx.m109368a((Collection) a3.f167760a));
                        hashSet.addAll(bngx.m109368a((Collection) a3.f167760a));
                    }
                    if (!a3.f167761b.isEmpty()) {
                        qvi.f42231d.mo24264a(bngx.m109368a((Collection) a3.f167761b));
                    }
                }
                a = bngx.m109368a((Collection) hashSet);
            }
            qrx.mo24233a(new qsf(status, a).mo24248b());
        } catch (IOException e) {
            throw new qrp(1025, "Internal error.", e);
        }
    }
}

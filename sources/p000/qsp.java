package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: qsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsp extends qsi {

    /* renamed from: b */
    private final qrx f42049b;

    /* renamed from: c */
    private final List f42050c;

    /* renamed from: d */
    private final qvi f42051d;

    public qsp(qrx qrx, Account account, List list) {
        super("ListFacetGroups", account);
        this.f42049b = qrx;
        bngs j = bngx.m109377j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j.mo67668c(qqt.m32667a((String) it.next()));
        }
        this.f42050c = j.mo67664a();
        this.f42051d = (qvi) qvi.f42229b.mo13145b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            this.f42049b.mo24233a(new qsf(status, bngx.m109376e()).mo24248b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnpf.a(java.util.Set, java.util.Set):bnpd
     arg types: [java.util.Set, bnic]
     candidates:
      bnpf.a(java.lang.Enum, java.lang.Enum[]):bnic
      bnpf.a(java.util.Set, java.lang.Object):boolean
      bnpf.a(java.util.Set, java.util.Collection):boolean
      bnpf.a(java.util.Set, java.util.Iterator):boolean
      bnpf.a(java.util.Set, java.util.Set):bnpd */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        bngx a;
        qvi qvi = this.f42051d;
        List list = this.f42050c;
        synchronized (qvi.f42233f) {
            qvi.mo24284a();
            Set<byty> b = qvi.f42231d.mo24265b(list);
            HashSet hashSet = new HashSet();
            for (byty byty : b) {
                for (bytw bytw : byty.f167734b) {
                    if ((bytw.f167727a & 1) != 0 && !bytw.f167728b.isEmpty()) {
                        hashSet.add(bytw.f167728b);
                    }
                }
            }
            bnpd c = bnpf.m110057c(bnic.m109495a((Collection) list), hashSet);
            if (!c.isEmpty()) {
                byuc a2 = qvi.f42232e.mo24282a(bngx.m109368a((Collection) c));
                if (!a2.f167760a.isEmpty()) {
                    qvi.f42230c.mo24261a(bngx.m109368a((Collection) a2.f167760a));
                }
                if (!a2.f167761b.isEmpty()) {
                    qvi.f42231d.mo24264a(bngx.m109368a((Collection) a2.f167761b));
                    b = bnpf.m110046a(b, (Set) bnic.m109495a((Collection) a2.f167761b));
                }
            }
            a = bngx.m109368a((Collection) b);
        }
        try {
            this.f42049b.mo24233a(new qsf(Status.f30107a, a).mo24248b());
        } catch (IOException e) {
            throw new qrp(1025, "Error when constructing the result.", e);
        }
    }
}

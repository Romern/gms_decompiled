package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: goa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goa {

    /* renamed from: a */
    public static final imo f18759a = new gnx();

    /* renamed from: b */
    public final adyd f18760b;

    /* renamed from: c */
    private final boolean f18761c;

    /* renamed from: d */
    private final gnw[] f18762d;

    public goa(adyd adyd, boolean z, gnw... gnwArr) {
        this.f18760b = adyd;
        this.f18761c = z;
        this.f18762d = gnwArr;
    }

    /* renamed from: a */
    public final Object mo12090a(Account account, gnz gnz) {
        return gnz.mo12085a(this.f18760b, account);
    }

    /* renamed from: b */
    public final void mo12094b(Account account, gny gny) {
        for (Pair pair : Collections.unmodifiableCollection(gny.f18756a)) {
            mo12095b(account, (gnz) pair.first, pair.second);
        }
    }

    /* renamed from: a */
    public final Object mo12091a(Account account, gnz gnz, Object obj) {
        sdo.m34959a(obj);
        Object a = mo12090a(account, gnz);
        return a != null ? a : obj;
    }

    /* renamed from: a */
    public final void mo12092a() {
        if (!this.f18761c) {
            throw new UnsupportedOperationException("This AccountDataManager cannot write");
        }
    }

    /* renamed from: a */
    public final void mo12093a(Account account, gny gny) {
        mo12092a();
        Bundle b = gny.mo12084b();
        gnz gnz = gqd.f18807a;
        String string = b.getString("password");
        b.remove("password");
        if (gsg.m13820b()) {
            gsg gsg = (gsg) gsg.f18948d.mo13145b();
            List a = ((gsl) gsl.f18953a.mo13145b()).mo12170a();
            sek sek = gsg.f18947a;
            int size = a.size();
            StringBuilder sb = new StringBuilder(60);
            sb.append("Add account explicitly with whitelisted packages ");
            sb.append(size);
            String sb2 = sb.toString();
            sek.mo25414c(sb2, new Object[0]);
            HashMap hashMap = new HashMap();
            int size2 = a.size();
            for (int i = 0; i < size2; i++) {
                hashMap.put((String) a.get(i), 2);
            }
            adyd adyd = gsg.f18949b;
            bljb a2 = blkh.m107281a("AccountManager.addAccountExplicitlyO+");
            try {
                adyd.f62893a.addAccountExplicitly(account, string, b, hashMap);
                if (a2 != null) {
                    a2.close();
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            this.f18760b.mo33915a(account, string, b);
        }
        mo12094b(account, gny);
        return;
        throw th;
    }

    /* renamed from: b */
    public final void mo12095b(Account account, gnz gnz, Object obj) {
        mo12092a();
        gnz.mo12089a(this.f18760b, account, obj);
        gnw[] gnwArr = this.f18762d;
        for (int i = 0; i < 2; i++) {
            gnwArr[i].mo12082a(this, account, gnz, obj);
        }
    }
}

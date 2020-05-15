package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: gkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkz {

    /* renamed from: d */
    private static final Logger f18446d = ght.m13171a("Change", "AccountsChange");

    /* renamed from: e */
    private static final String[] f18447e = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: a */
    public final Set f18448a;

    /* renamed from: b */
    public final Set f18449b;

    /* renamed from: c */
    public final Set f18450c;

    private gkz(Set set, Set set2, Set set3) {
        this.f18448a = set;
        this.f18449b = set2;
        this.f18450c = set3;
    }

    /* renamed from: a */
    public static gkz m13355a(Context context) {
        Map map;
        boolean z;
        gks gks;
        byte[] a;
        gkt gkt = new gkt(adyd.m51363a(context));
        gkv gkv = (gkv) gkv.f18436b.mo13145b();
        glu a2 = glu.m13415a(context.getApplicationContext());
        String[] strArr = f18447e;
        try {
            synchronized (gkv.f18437c) {
                FileInputStream openFileInput = gkv.f18438d.openFileInput(gkv.f18439e);
                try {
                    a = stk.m36297a(openFileInput);
                    openFileInput.close();
                } catch (IOException e) {
                    gkv.f18435a.mo25410a((Throwable) e);
                } catch (Throwable th) {
                    try {
                        openFileInput.close();
                    } catch (IOException e2) {
                        gkv.f18435a.mo25410a((Throwable) e2);
                    }
                    throw th;
                }
            }
            imb imb = (imb) GeneratedMessageLite.m124016a(imb.f21338b, a, bxus.m123744c());
            map = new C1223np(imb.f21340a.size());
            for (ima ima : imb.f21340a) {
                ilz ilz = ima.f21335b;
                if (ilz == null) {
                    ilz = ilz.f21326d;
                }
                String str = ilz.f21329b;
                ilz ilz2 = ima.f21335b;
                if (ilz2 == null) {
                    ilz2 = ilz.f21326d;
                }
                gks gks2 = new gks(new Account(str, ilz2.f21330c), ima.f21336c, ima.f21337d);
                map.put(gks2.f18430a, gks2);
            }
        } catch (FileNotFoundException e3) {
            f18446d.mo25414c("First snapshot", new Object[0]);
            map = Collections.emptyMap();
            gkv.mo12000a(map);
        }
        sdo.checkIfNull(strArr, "accountTypes null");
        int length = strArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "accountTypes empty");
        C1225nr<Account> nrVar = new C1225nr();
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (str2 != null) {
                for (Account account : gkt.f18434b.mo33916a(str2)) {
                    nrVar.add(account);
                }
                i++;
            } else {
                throw new IllegalArgumentException("accountTypes has null element");
            }
        }
        C1223np npVar = new C1223np(nrVar.f26758b);
        for (Account account2 : nrVar) {
            String a3 = gkt.f18434b.mo33908a(account2);
            try {
                gks = new gks(account2, a3, gie.m13198c(context, account2.name));
            } catch (gid | IOException e4) {
                gkt.f18433a.mo25415d("Error while trying to get accountId", e4, new Object[0]);
                gks = new gks(account2, a3, "");
            }
            npVar.put(account2, gks);
        }
        if (f18446d.mo19637a(3)) {
            f18446d.mo25412b("old accounts: %s", new ArrayList(map.keySet()));
            f18446d.mo25412b("new accounts: %s", new ArrayList(npVar.keySet()));
        }
        Set keySet = map.keySet();
        Set keySet2 = npVar.keySet();
        Set<Account> a4 = m13356a(keySet2, keySet);
        C1225nr nrVar2 = new C1225nr(((C1225nr) a4).f26758b);
        for (Account account3 : a4) {
            nrVar2.add((gks) npVar.get(account3));
        }
        Set<Account> a5 = m13356a(keySet, keySet2);
        C1225nr nrVar3 = new C1225nr(((C1225nr) a5).f26758b);
        for (Account account4 : a5) {
            nrVar3.add((gks) map.get(account4));
        }
        for (Account account5 : a5) {
            if (account5.name != null) {
                String a6 = a2.mo12037a();
                try {
                    List a7 = a2.mo12038a(account5.name, 0);
                    if (a7.isEmpty() || ((AccountChangeEvent) a7.get(0)).f9907d != 4) {
                        a2.mo12040a(account5.name, 2, null);
                    }
                } finally {
                    a2.mo12039a(a6);
                }
            }
        }
        C1225nr<Account> nrVar4 = new C1225nr(keySet);
        nrVar4.retainAll(keySet2);
        C1225nr nrVar5 = new C1225nr(nrVar4.f26758b);
        for (Account account6 : nrVar4) {
            if (!sdg.m34949a(map.get(account6), npVar.get(account6))) {
                nrVar5.add((gks) npVar.get(account6));
            }
        }
        gkz gkz = new gkz(Collections.unmodifiableSet(nrVar2), Collections.unmodifiableSet(nrVar3), Collections.unmodifiableSet(nrVar5));
        if (!gkz.f18448a.isEmpty() || !gkz.f18449b.isEmpty() || !gkz.f18450c.isEmpty()) {
            gkv.mo12000a(npVar);
        }
        return gkz;
    }

    /* renamed from: a */
    private static Set m13356a(Set set, Set set2) {
        C1225nr nrVar = new C1225nr(set);
        nrVar.removeAll(set2);
        return nrVar;
    }
}

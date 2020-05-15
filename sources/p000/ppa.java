package p000;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: ppa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ppa {

    /* renamed from: a */
    public final pqb f39963a;

    /* renamed from: b */
    public final ppp f39964b;

    /* renamed from: c */
    OnAccountsUpdateListener f39965c;

    /* renamed from: d */
    private final adyd f39966d;

    /* renamed from: e */
    private final Handler f39967e = new adzt(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23526a() {
        HashSet hashSet = new HashSet();
        for (Account account : this.f39966d.mo33916a("com.google")) {
            hashSet.add(account.name);
        }
        Collection unmodifiableCollection = Collections.unmodifiableCollection(ppz.f40045d.f40047f.keySet());
        ArrayList arrayList = new ArrayList(hashSet);
        ArrayList arrayList2 = new ArrayList(unmodifiableCollection);
        arrayList.removeAll(unmodifiableCollection);
        arrayList2.removeAll(hashSet);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (this.f39963a.mo23551a()) {
                this.f39964b.mo23535a(str);
            }
            ppz.f40045d.mo23545a(new pqd(str));
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = (String) arrayList2.get(i2);
            ppz ppz = ppz.f40045d;
            ppz.f40047f.remove(str2);
            if (ppz.f40048g.containsKey(str2)) {
                ArrayList arrayList3 = new ArrayList((Collection) ppz.f40048g.get(str2));
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ppz.mo23544a((ppu) arrayList3.get(i3));
                }
                ppz.f40048g.remove(str2);
            }
            ppz.mo23539b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void
     arg types: [pox, android.os.Handler, int]
     candidates:
      adyd.a(android.accounts.Account, java.util.ArrayList, java.lang.String[]):android.content.Intent
      adyd.a(android.accounts.Account, java.lang.String[], android.accounts.AccountManagerCallback):android.accounts.AccountManagerFuture
      adyd.a(android.accounts.Account, java.lang.String, int):boolean
      adyd.a(android.accounts.Account, java.lang.String, android.os.Bundle):boolean
      adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void */
    public ppa(Context context, pqb pqb, ppp ppp) {
        this.f39963a = pqb;
        this.f39964b = ppp;
        this.f39966d = adyd.m51363a(context);
        if (this.f39965c == null) {
            pox pox = new pox(this);
            this.f39965c = pox;
            this.f39966d.mo33912a((OnAccountsUpdateListener) pox, this.f39967e, false);
            mo23526a();
            pes.m30266a().scheduleAtFixedRate(new poy(this), 0, cczq.f180312a.mo6606a().mo77106a(), TimeUnit.MILLISECONDS);
        }
    }
}

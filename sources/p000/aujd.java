package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tron.CollectionChimeraService;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aujd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujd {

    /* renamed from: b */
    protected static bdtr f91933b;

    /* renamed from: a */
    public List f91934a = Collections.EMPTY_LIST;

    /* renamed from: c */
    public rjx f91935c;

    /* renamed from: a */
    private final boolean m77148a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (f91933b == null) {
                bdtt bdtt = new bdtt();
                bdtt.mo58364a(context);
                bdtt.mo58366b("gmscoretronfacsid");
                f91933b = bdtt.mo58363a();
            }
            try {
                if (((Boolean) f91933b.mo58362b(account).mo58355a(4).get(15, TimeUnit.SECONDS)).booleanValue()) {
                    arrayList.add(account.name);
                }
            } catch (ExecutionException | TimeoutException e) {
                cgzf.m147724c();
                return false;
            } catch (InterruptedException e2) {
                cgzf.m147724c();
                Thread.currentThread().interrupt();
                return false;
            }
        }
        this.f91934a = arrayList;
        return true;
    }

    /* renamed from: c */
    public static final int m77149c() {
        if (cgyw.f188093a.mo6606a().mo84786a() && auje.m77152a(rpr.m34216b())) {
            return 0;
        }
        try {
            aucb E = avtz.m79338b(rpr.m34216b()).mo24673E();
            rkj rkj = (rkj) aucu.m76783a(E, cgyt.m147704b(), TimeUnit.SECONDS);
            if (!E.mo50384b() || rkj == null) {
                return 1;
            }
            if (rkj.mo24824r()) {
                return 2;
            }
            return 0;
        } catch (ExecutionException | TimeoutException e) {
            if (!cgzf.m147724c()) {
                return 1;
            }
            Log.e("CollectionChimeraSvc", "Unable to get checkbox consent");
            return 1;
        } catch (InterruptedException e2) {
            if (cgzf.m147724c()) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("CollectionChimeraSvc", valueOf.length() == 0 ? new String("InterruptedException: ") : "InterruptedException: ".concat(valueOf));
            }
            Thread.currentThread().interrupt();
            return 1;
        }
    }

    /* renamed from: b */
    public final boolean mo50579b() {
        return !this.f91934a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo50578a() {
        if (!cgyz.f188096a.mo6606a().mo84788a() || !auje.m77152a(rpr.m34216b())) {
            rpr b = rpr.m34216b();
            List<Account> d = soz.m35801d(b, b.getPackageName());
            if (cgzk.f188123a.mo6606a().mo84810a()) {
                return m77148a(b, d);
            }
            ArrayList arrayList = new ArrayList();
            for (Account account : d) {
                try {
                    aucb a = auzz.m78131a(b, new auzy(account)).mo24689a(CollectionChimeraService.f109089b);
                    UdcCacheResponse udcCacheResponse = (UdcCacheResponse) aucu.m76783a(a, cgyt.m147704b(), TimeUnit.SECONDS);
                    if (!a.mo50384b() || udcCacheResponse == null) {
                        return false;
                    }
                    boolean z = false;
                    boolean z2 = false;
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.f109350a) {
                        int i = udcSetting.f109354a;
                        if (i == 8) {
                            z = udcSetting.f109355b == 2;
                        } else if (i == 10) {
                            z2 = udcSetting.f109355b == 2;
                        }
                    }
                    if (z && z2) {
                        arrayList.add(account.name);
                    }
                } catch (ExecutionException | TimeoutException e) {
                    if (cgzf.m147724c()) {
                        Log.e("CollectionChimeraSvc", "Error in getting udc consents");
                    }
                    return false;
                } catch (InterruptedException e2) {
                    if (cgzf.m147724c()) {
                        String valueOf = String.valueOf(e2.getMessage());
                        Log.e("CollectionChimeraSvc", valueOf.length() == 0 ? new String("InterruptedException: ") : "InterruptedException: ".concat(valueOf));
                    }
                    return false;
                }
            }
            this.f91934a = arrayList;
            return true;
        }
        this.f91934a = Collections.EMPTY_LIST;
        return false;
    }
}

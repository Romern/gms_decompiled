package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: buru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buru {

    /* renamed from: a */
    static final byte[] f154790a = "opt-in".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public final Context f154791b;

    /* renamed from: c */
    private final Map f154792c = new HashMap();

    /* renamed from: d */
    private final Map f154793d = new HashMap();

    /* renamed from: e */
    private final baso f154794e;

    public buru(Context context, Handler handler) {
        baso a = bash.m87488a(context, handler, handler);
        this.f154791b = context;
        this.f154794e = a;
    }

    /* renamed from: a */
    public static final ahza m120317a(List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahza ahza = (ahza) it.next();
            if (Arrays.equals(bArr, ahza.f68444b.getKey())) {
                busr busr = busr.f154819a;
                return ahza;
            }
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ List m120321b(Collection collection) {
        ahza ahza;
        ahza ahza2;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ahzb ahzb = (ahzb) ((basd) it.next()).mo55930a();
                    if (ahzb.f68450a == 2) {
                        ahza ahza3 = (ahza) ahzb.f68451b;
                        if ((ahza3.f68443a & 1) == 0 && (ahza3.f68443a & 4) != 0) {
                            if (ahzb.f68450a == 2) {
                                ahza = (ahza) ahzb.f68451b;
                            } else {
                                ahza = ahza.f68441e;
                            }
                            byte[] k = ahza.f68446d.getKey();
                            if (k.length >= 4) {
                                int i = 0;
                                while (true) {
                                    if (i < 4) {
                                        if (k[i] != -16) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        if (ahzb.f68450a == 2) {
                                            ahza2 = (ahza) ahzb.f68451b;
                                        } else {
                                            ahza2 = ahza.f68441e;
                                        }
                                        arrayList.add(ahza2);
                                    }
                                }
                            }
                        }
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buru", "b", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static byte[] m120323c(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        Arrays.fill(bArr, 0, 4, (byte) -16);
        return bArr;
    }

    /* renamed from: d */
    public final ahza mo73067d(byte[] bArr) {
        List a = m120318a(this.f154791b);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) a.get(i);
            try {
                ahza a2 = m120317a((List) mo73055a(account).get(), bArr);
                if (a2 != null) {
                    return a2;
                }
                i++;
            } catch (InterruptedException | ExecutionException e) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("buru", "d", 638, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("FastPair: fail to read footprints from %s.", account);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List m120318a(Context context) {
        Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        ArrayList arrayList = new ArrayList();
        for (Account account : accountsByType) {
            if (!(account.name == null || account.type == null)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final CountDownLatch mo73065c() {
        CountDownLatch countDownLatch;
        synchronized (this.f154793d) {
            busr busr = busr.f154819a;
            this.f154793d.size();
            countDownLatch = new CountDownLatch(this.f154793d.size());
            for (Account account : this.f154793d.keySet()) {
                bqga.m112781a(mo73069d(account).mo55926a((basc) this.f154793d.get(account)), new burr(countDownLatch), bqfb.INSTANCE);
            }
            this.f154793d.clear();
        }
        return countDownLatch;
    }

    /* renamed from: d */
    public final Account mo73068d() {
        List a = m120318a(this.f154791b);
        if (!a.isEmpty()) {
            return (Account) a.get(0);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ List m120319a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ahzb ahzb = (ahzb) ((basd) it.next()).mo55930a();
                    if (ahzb.f68450a == 2) {
                        ahza ahza = (ahza) ahzb.f68451b;
                        if ((ahza.f68443a & 1) != 0) {
                            arrayList.add(ahza);
                        }
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buru", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final basb mo73069d(Account account) {
        basb basb;
        synchronized (this.f154792c) {
            basb = (basb) this.f154792c.get(account);
            if (basb == null) {
                basb = this.f154794e.mo55937a(account, 837, 190536965, ahzb.f68448d);
                azzu c = azzv.m86422c();
                c.mo55526a((int) cfog.f184854a.mo6606a().mo81992aa(), TimeUnit.SECONDS);
                azzv a = c.mo55525a();
                azzr i = azzs.m86408i();
                i.mo55523b(a);
                i.mo55520a(a);
                if (cfoj.f184966a.mo6606a().mo82103aa()) {
                    i.mo55521a(Integer.valueOf((int) cfog.f184854a.mo6606a().mo82011at()));
                }
                basb.mo55929a(i.mo55519a(), basa.f101652c);
                this.f154792c.put(account, basb);
            }
        }
        return basb;
    }

    /* renamed from: a */
    private final void m120320a(Account account, byte[] bArr) {
        try {
            mo73069d(account).mo55928a(bArr, ahzb.f68447c).get();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buru", "a", 397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Error removing footprint.");
        }
    }

    /* renamed from: c */
    public final boolean mo73066c(Account account) {
        int a;
        try {
            busr busr = busr.f154819a;
            basb d = mo73069d(account);
            barz b = basa.m87474b();
            b.mo55924a(f154790a, 1);
            ahzb ahzb = (ahzb) ((basd) bnjd.m109587b((Iterable) d.mo55925a(b.mo55923a()).get())).mo55930a();
            if (ahzb.f68450a == 1) {
                ((Integer) ahzb.f68451b).intValue();
                if (ahzb.f68450a == 1 && (a = ahzd.m56897a(((Integer) ahzb.f68451b).intValue())) != 0 && a == 2) {
                    return true;
                }
                return false;
            }
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("buru", "c", 449, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Returned info has no opt in status.");
            return false;
        } catch (bxwf | InterruptedException | ExecutionException e) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("buru", "c", 452, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Footprints Manager: Error getting opt in status.");
        } catch (IllegalArgumentException | NoSuchElementException e2) {
            bnsl bnsl3 = (bnsl) busr.f154819a.mo68390d();
            bnsl3.mo68432a("buru", "c", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Footprints Manager: Couldn't find a usable opt in status, returning default.");
        }
    }

    /* renamed from: b */
    public static byte[] m120322b(byte[] bArr) {
        return boan.f132472f.mo68794a(bArr).getBytes(Charset.forName("UTF-8"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r0 = (p000.bnsl) p000.busr.f154819a.mo68390d();
        r0.mo68432a("buru", "a", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.mo68420a("FastPair: find the matched device (%s) from footprints.", r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r0 = r11;
     */
    /* renamed from: a */
    public final ahza mo73052a(String str) {
        List a = m120318a(this.f154791b);
        int size = a.size();
        int i = 0;
        while (true) {
            ahza ahza = null;
            if (i >= size) {
                return null;
            }
            Account account = (Account) a.get(i);
            try {
                Iterator it = ((List) mo73055a(account).get()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ahza ahza2 = (ahza) it.next();
                    int i2 = ahza2.f68443a;
                    if ((i2 & 1) != 0 && (i2 & 4) != 0) {
                        byte[] k = ahza2.f68446d.getKey();
                        byte[] k2 = ahza2.f68444b.getKey();
                        if (Arrays.equals(k, bnzi.m110902d().mo68722a(bqce.m112562a(k2, aynj.m84359a(str))).mo68740b())) {
                            break;
                        }
                    }
                }
                if (ahza != null) {
                    return ahza;
                }
                i++;
            } catch (InterruptedException | ExecutionException e) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                bnsl.mo68432a("buru", "a", 622, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("FastPair: fail to read footprints from %s.", account);
                i++;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buru.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      buru.a(java.util.List, byte[]):ahza
      buru.a(android.accounts.Account, byte[]):void
      buru.a(java.util.List, java.lang.String):ahza
      buru.a(basc, android.accounts.Account):java.util.concurrent.CountDownLatch
      buru.a(android.accounts.Account, boolean):void */
    /* renamed from: b */
    public final void mo73062b() {
        Account d = mo73068d();
        if (!mo73066c(d)) {
            mo73059a(d, true);
        }
    }

    /* renamed from: b */
    public final void mo73063b(Account account) {
        try {
            for (ahza ahza : (List) mo73055a(account).get()) {
                try {
                    mo73069d(account).mo55928a(m120322b(ahza.f68444b.getKey()), ahzb.f68447c).get();
                } catch (InterruptedException | ExecutionException e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buru", "a", 397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Footprints Manager: Error removing footprint.");
                }
            }
            busr busr = busr.f154819a;
        } catch (InterruptedException | ExecutionException e2) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("buru", "b", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Footprints Manager: Error removing footprints.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo73064b(Account account, burt burt, long j, Throwable th) {
        int i;
        try {
            i = ((List) mo73055a(account).get()).size();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buru", "b", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Failed to read the footprints for logging device count.");
            i = -1;
        }
        Context context = this.f154791b;
        context.startService(butb.m120416a(context, burt.mo73010a().f68537y, burt.mo73013d(), j, i, th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ahza mo73053a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahza ahza = (ahza) it.next();
            int i = ahza.f68443a;
            if (!((i & 1) == 0 || (i & 4) == 0)) {
                byte[] k = ahza.f68446d.getKey();
                byte[] k2 = ahza.f68444b.getKey();
                if (Arrays.equals(k, bnzi.m110902d().mo68722a(bqce.m112562a(k2, aynj.m84359a(str))).mo68740b())) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
                    bnsl.mo68432a("buru", "a", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("FastPair: find the matched device (%s) from footprints.", str);
                    return ahza;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final bqgg mo73054a() {
        return mo73055a(mo73068d());
    }

    /* renamed from: a */
    public final bqgg mo73055a(Account account) {
        basa basa = basa.f101652c;
        busr busr = busr.f154819a;
        return bqdx.m112673a(mo73069d(account).mo55925a(basa), buro.f154778a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final CountDownLatch mo73056a(basc basc, Account account) {
        synchronized (this.f154793d) {
            if (this.f154793d.containsKey(account)) {
                busr busr = busr.f154819a;
                CountDownLatch countDownLatch = new CountDownLatch(0);
                return countDownLatch;
            }
            busr busr2 = busr.f154819a;
            this.f154793d.put(account, basc);
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            bqga.m112781a(mo73069d(account).mo55927a(basc, basa.f101652c), new burq(countDownLatch2), bqfb.INSTANCE);
            return countDownLatch2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73057a(Account account, burt burt, long j, Throwable th) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (cfoj.m141531L()) {
            newSingleThreadExecutor.execute(new burm(this, account, burt, j, th));
            return;
        }
        Context context = this.f154791b;
        context.startService(butb.m120416a(context, burt.mo73010a().f68537y, burt.mo73013d(), j, -1, th));
    }

    /* renamed from: a */
    public final void mo73058a(Account account, burt burt, bqfp bqfp) {
        byte[] k = burt.mo73010a().serializeToBytes();
        byte[] k2 = burt.mo73011b().getKey();
        if (!cfos.m141988b() || !((bnsl) busr.f154819a.mo68390d()).mo68447l()) {
            busr busr = busr.f154819a;
            int length = k.length;
        } else {
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("buru", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Footprints Manager: Adding device to Footprints with size %d bytes, account key %s, %s", Integer.valueOf(k.length), boan.f132472f.mo68794a(k2), busr.m120395a(burt.mo73010a()));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd da = ahza.f68441e.mo74144da();
        ByteString b = burt.mo73011b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahza ahza = (ahza) da.f164949b;
        b.getClass();
        ahza.f68443a |= 1;
        ahza.f68444b = b;
        ByteString a = ByteString.m123261a(k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahza ahza2 = (ahza) da.f164949b;
        a.getClass();
        ahza2.f68443a |= 2;
        ahza2.f68445c = a;
        ByteString c = burt.mo73012c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahza ahza3 = (ahza) da.f164949b;
        c.getClass();
        ahza3.f68443a |= 4;
        ahza3.f68446d = c;
        basb d = mo73069d(account);
        byte[] b2 = m120322b(k2);
        bxvd da2 = ahzb.f68447c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ahzb ahzb = (ahzb) da2.f164949b;
        ahza ahza4 = (ahza) da.mo74062i();
        ahza4.getClass();
        ahzb.f68451b = ahza4;
        ahzb.f68450a = 2;
        bqga.m112781a(d.mo55928a(b2, (ahzb) da2.mo74062i()), new burp(this, account, burt, elapsedRealtime, bqfp), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo73059a(Account account, boolean z) {
        int i;
        try {
            basb d = mo73069d(account);
            byte[] bArr = f154790a;
            bxvd da = ahzb.f68447c.mo74144da();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahzb ahzb = (ahzb) da.f164949b;
            ahzb.f68451b = Integer.valueOf(i - 1);
            ahzb.f68450a = 1;
            d.mo55928a(bArr, (ahzb) da.mo74062i()).get();
            busr busr = busr.f154819a;
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buru", "a", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Failed to write opt in status.");
        }
    }

    /* renamed from: a */
    public final void mo73060a(Account account, byte[] bArr, byte[] bArr2) {
        try {
            basb d = mo73069d(account);
            byte[] b = m120322b(bArr);
            bxvd da = ahzb.f68447c.mo74144da();
            bxvd da2 = ahza.f68441e.mo74144da();
            ByteString a = ByteString.m123261a(m120323c(bArr2));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ahza ahza = (ahza) da2.f164949b;
            a.getClass();
            ahza.f68443a |= 4;
            ahza.f68446d = a;
            ahza ahza2 = (ahza) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahzb ahzb = (ahzb) da.f164949b;
            ahza2.getClass();
            ahzb.f68451b = ahza2;
            ahzb.f68450a = 2;
            d.mo55928a(b, (ahzb) da.mo74062i()).get();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buru", "a", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Error forgetting footprint.");
        }
    }

    /* renamed from: a */
    public final void mo73061a(byte[] bArr) {
        List a = m120318a(this.f154791b);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) a.get(i);
            try {
                ahza a2 = m120317a((List) mo73055a(account).get(), bArr);
                if (a2 == null) {
                    i++;
                } else if ((a2.f68443a & 4) == 0) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68432a("buru", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("FastPair: fail to forget footprints because device has no sha256.");
                    return;
                } else {
                    mo73060a(account, bArr, a2.f68446d.getKey());
                    return;
                }
            } catch (InterruptedException | ExecutionException e) {
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("buru", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPair: fail to forget footprints.");
            }
        }
    }
}

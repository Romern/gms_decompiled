package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rvj {

    /* renamed from: a */
    public final String f43742a;

    /* renamed from: b */
    public final ruq f43743b;

    /* renamed from: c */
    public final bngx f43744c;

    /* renamed from: d */
    public boolean f43745d;

    /* renamed from: e */
    private final bnic f43746e;

    /* renamed from: f */
    private final double f43747f;

    /* renamed from: g */
    private final Random f43748g;

    public rvj(String str, ruq ruq, bngx bngx, bnic bnic) {
        this(str, ruq, bngx, bnic, false, 1.0d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25193a() {
        String str = this.f43742a;
        return str.substring(0, Math.min(str.length(), 23));
    }

    public rvj(String str, ruq ruq, bngx bngx, bnic bnic, boolean z, double d) {
        this.f43745d = false;
        sdo.m34977c(str);
        this.f43742a = str;
        sdo.m34959a(ruq);
        this.f43743b = ruq;
        sdo.m34959a(bngx);
        this.f43744c = bngx;
        sdo.m34959a(bnic);
        this.f43746e = bnic;
        this.f43745d = z;
        this.f43747f = Math.min(d, cdkp.f181122a.mo6606a().mo77832s());
        Random random = new Random();
        this.f43748g = random;
        random.nextLong();
        this.f43748g.nextLong();
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ed A[SYNTHETIC, Splitter:B:123:0x02ed] */
    /* renamed from: a */
    public final rvh mo25194a(rvl rvl, ruf ruf, Set set) {
        ExecutorService executorService;
        Throwable th;
        bxvd bxvd;
        bpuk bpuk;
        bqgg bqgg;
        bmxv bmxv;
        Log.i(mo25193a(), "Running fixer!");
        bpuk bpuk2 = (bpuk) bput.f139284e.mo74144da();
        rvl rvl2 = rvl;
        bpun bpun = rvl2.f43759a;
        if (bpuk2.f164950c) {
            bpuk2.mo74035c();
            bpuk2.f164950c = false;
        }
        bput bput = (bput) bpuk2.f164949b;
        bput.f139287b = bpun.f139268j;
        bput.f139286a |= 1;
        bput bput2 = (bput) bpuk2.mo74062i();
        int i = 5;
        bxvd bxvd2 = (bxvd) bput2.mo74142c(5);
        bxvd2.mo73625a((bxvk) bput2);
        bpuk bpuk3 = (bpuk) bxvd2;
        ruq ruq = this.f43743b;
        bxvd da = bpul.f139253c.mo74144da();
        String str = ruq.f43715a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpul bpul = (bpul) da.f164949b;
        str.getClass();
        bpul.f139255a |= 1;
        bpul.f139256b = str;
        bpul bpul2 = (bpul) da.mo74062i();
        if (bpuk3.f164950c) {
            bpuk3.mo74035c();
            bpuk3.f164950c = false;
        }
        bput bput3 = (bput) bpuk3.f164949b;
        bpul2.getClass();
        bput3.f139288c = bpul2;
        bput3.f139286a |= 2;
        ArrayList arrayList = new ArrayList();
        bnre i2 = this.f43744c.listIterator();
        while (i2.hasNext()) {
            bxvd da2 = bpus.f139278e.mo74144da();
            String str2 = ((rvd) i2.next()).f43726a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpus bpus = (bpus) da2.f164949b;
            str2.getClass();
            int i3 = bpus.f139280a | 1;
            bpus.f139280a = i3;
            bpus.f139281b = str2;
            bpus.f139282c = 1;
            bpus.f139280a = i3 | 2;
            arrayList.add((bpus) da2.mo74062i());
        }
        try {
            rvk d = rvl.mo25205d();
            for (int i4 = 0; i4 < this.f43744c.size(); i4++) {
                d.mo25201a(new rve(((rvd) this.f43744c.get(i4)).f43726a, 1));
            }
            rvl2 = d.mo25198a();
            try {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                int i5 = 0;
                while (i5 < this.f43744c.size()) {
                    try {
                        rvd rvd = (rvd) this.f43744c.get(i5);
                        bpus bpus2 = (bpus) arrayList.get(i5);
                        bxvd = (bxvd) bpus2.mo74142c(i);
                        bxvd.mo73625a((bxvk) bpus2);
                        try {
                            if (set.contains(rvd)) {
                                bpuk = bpuk3;
                                try {
                                    if (rvd.f43728c > 0) {
                                        bqgg = newSingleThreadExecutor.submit(new rvg(rvd, rvl2));
                                    } else {
                                        bqgg = bqga.m112775a(bmxv.m108566b(rvd.mo25190c(rvl2)));
                                    }
                                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                    bqgg.cancel(true);
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                    sb.append("Fix failed or timed out: ");
                                    sb.append(valueOf);
                                    Log.w("Fixer", sb.toString());
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bpus bpus3 = (bpus) bxvd.f164949b;
                                    bpus bpus4 = bpus.f139278e;
                                    bpus3.f139282c = 4;
                                    bpus3.f139280a |= 2;
                                    rvk d2 = rvl2.mo25205d();
                                    d2.mo25199a(rvd, 5);
                                    bmxv = bmxv.m108566b(d2.mo25198a());
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        arrayList.set(i5, (bpus) bxvd.mo74062i());
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        executorService = newSingleThreadExecutor;
                                        bpuk3 = bpuk;
                                        if (bpuk3.f164950c) {
                                        }
                                        ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
                                        bpuk3.mo68988a(arrayList);
                                        if (executorService != null) {
                                        }
                                        rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
                                        throw th;
                                    }
                                }
                            } else {
                                bpuk = bpuk3;
                                bqgg = bqga.m112775a(bmvz.f131120a);
                            }
                            bmxv = (bmxv) bqgg.get(rvd.f43728c, TimeUnit.MILLISECONDS);
                            if (bmxv.mo66813a()) {
                                rvl2 = mo25195a((rvl) bmxv.mo66814b(), rvd, ruf);
                                try {
                                    rve a = rvl2.mo25203a(rvd.f43726a);
                                    int i6 = a.f43731c;
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bpus bpus5 = (bpus) bxvd.f164949b;
                                    bpus bpus6 = bpus.f139278e;
                                    int i7 = i6 - 1;
                                    if (i6 != 0) {
                                        bpus5.f139282c = i7;
                                        bpus5.f139280a |= 2;
                                        int a2 = bpur.m112304a(i7);
                                        if (a2 != 0) {
                                            if (a2 == 2) {
                                                bpup bpup = a.f43730b;
                                                if (bpup == null) {
                                                    Log.w("Fixer", "Fix has stage PROPOSED but no proposal");
                                                } else {
                                                    if (bxvd.f164950c) {
                                                        bxvd.mo74035c();
                                                        bxvd.f164950c = false;
                                                    }
                                                    bpus bpus7 = (bpus) bxvd.f164949b;
                                                    bpup.getClass();
                                                    bpus7.f139283d = bpup;
                                                    bpus7.f139280a |= 16;
                                                }
                                            }
                                        }
                                    } else {
                                        throw null;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    arrayList.set(i5, (bpus) bxvd.mo74062i());
                                    throw th;
                                }
                            } else {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bpus bpus8 = (bpus) bxvd.f164949b;
                                bpus bpus9 = bpus.f139278e;
                                bpus8.f139282c = 3;
                                bpus8.f139280a |= 2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bpuk = bpuk3;
                            arrayList.set(i5, (bpus) bxvd.mo74062i());
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        executorService = newSingleThreadExecutor;
                        if (bpuk3.f164950c) {
                        }
                        ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
                        bpuk3.mo68988a(arrayList);
                        if (executorService != null) {
                        }
                        rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
                        throw th;
                    }
                    try {
                        arrayList.set(i5, (bpus) bxvd.mo74062i());
                        i5++;
                        bpuk3 = bpuk;
                        i = 5;
                    } catch (Throwable th7) {
                        th = th7;
                        executorService = newSingleThreadExecutor;
                        bpuk3 = bpuk;
                        if (bpuk3.f164950c) {
                        }
                        ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
                        bpuk3.mo68988a(arrayList);
                        if (executorService != null) {
                        }
                        rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
                        throw th;
                    }
                }
                if (bpuk3.f164950c) {
                    bpuk3.mo74035c();
                    bpuk3.f164950c = false;
                }
                ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
                bpuk3.mo68988a(arrayList);
                if (newSingleThreadExecutor != null) {
                    try {
                        newSingleThreadExecutor.shutdownNow();
                    } catch (SecurityException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 56);
                        sb2.append("Exception shutting down executor, we may leak a thread: ");
                        sb2.append(valueOf2);
                        Log.e("Fixer", sb2.toString());
                    }
                }
                if (!cdkp.m133835b() || ((double) this.f43748g.nextFloat()) < this.f43747f) {
                    rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
                }
                return new rvh(rvl2.f43768j);
            } catch (Throwable th8) {
                executorService = null;
                th = th8;
                if (bpuk3.f164950c) {
                }
                ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
                bpuk3.mo68988a(arrayList);
                if (executorService != null) {
                }
                rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
                throw th;
            }
        } catch (Throwable th9) {
            executorService = null;
            th = th9;
            if (bpuk3.f164950c) {
                bpuk3.mo74035c();
                bpuk3.f164950c = false;
            }
            ((bput) bpuk3.f164949b).f139289d = bxvk.m124030de();
            bpuk3.mo68988a(arrayList);
            if (executorService != null) {
                try {
                    executorService.shutdownNow();
                } catch (SecurityException e3) {
                    String valueOf3 = String.valueOf(e3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 56);
                    sb3.append("Exception shutting down executor, we may leak a thread: ");
                    sb3.append(valueOf3);
                    Log.e("Fixer", sb3.toString());
                }
            }
            if (!cdkp.m133835b() || ((double) this.f43748g.nextFloat()) < this.f43747f) {
                rvl2.f43761c.mo25216a((bput) bpuk3.mo74062i());
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public rvl mo25195a(rvl rvl, rvd rvd, ruf ruf) {
        return mo25196a(rvl, rvd, ruf, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rvl mo25196a(rvl rvl, rvd rvd, ruf ruf, byte[] bArr) {
        long j;
        rvl rvl2 = rvl;
        rvd rvd2 = rvd;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        int i = rvl2.mo25203a(rvd2.f43726a).f43731c;
        if (!cdng.f181305a.mo6606a().mo77954b()) {
            j = rvd2.f43727b + seconds;
        } else {
            j = (i != 3 ? cdkp.f181122a.mo6606a().mo77826m() : rvd2.f43727b) + seconds;
        }
        String str = this.f43742a;
        String str2 = this.f43743b.f43715a;
        String str3 = rvd2.f43726a;
        int i2 = i - 1;
        if (i != 0) {
            ruk ruk = new ruk(str, str2, str3, seconds, j, (long) i2, rvl2.f43759a, rvl2.f43761c.mo25217a(), bArr);
            ruf.mo25177a(ruk);
            rvk d = rvl.mo25205d();
            bngs j2 = bngx.m109377j();
            j2.mo67666b((Iterable) d.f43753e);
            j2.mo67668c(ruk);
            d.f43753e = j2.mo67664a();
            return d.mo25198a();
        }
        throw null;
    }

    /* renamed from: a */
    public final boolean mo25197a(rvl rvl) {
        rvk d = rvl.mo25205d();
        d.f43756h = this;
        rvl a = d.mo25198a();
        if (this.f43746e.contains(a.f43759a)) {
            ruq ruq = this.f43743b;
            try {
                if (ruq.mo25185a(a)) {
                    return true;
                }
            } catch (RuntimeException e) {
                rvc.m34511a(e, a, ruq.f43715a);
            }
        }
        return false;
    }
}

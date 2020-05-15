package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: bgcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgcj implements Runnable {

    /* renamed from: a */
    private final Context f116049a;

    /* renamed from: b */
    private final int f116050b;

    public bgcj(Context context, int i) {
        this.f116049a = context;
        this.f116050b = i;
    }

    public final void run() {
        Context context = this.f116049a;
        if (!bgcz.m98589b()) {
            aeat.m51532a(context).mo33986a("LocationNanoAppUpdate", "com.google.android.location.internal.NanoAppUpdaterGcmTaskService");
        } else if (bgcz.m98590c()) {
            NanoAppUpdaterChimeraGcmTaskService.m117276a(context, cezb.f183522a.mo6606a().nanoAppNewVersionCheckPeriodSec());
        } else {
            NanoAppUpdaterChimeraGcmTaskService.m117276a(context, cezb.f183522a.mo6606a().nanoAppNewVersionIdleCheckPeriodSec());
        }
        if (bgcz.m98590c()) {
            Context context2 = this.f116049a;
            bgci bgci = new bgci(context2, afkf.m53198a(context2), new beeu(new soc(1, 10), Arrays.asList(new ahbh(context2))), new bgcb().mo62634a(context2), bgbq.m98540a(context2), bgcz.m98588a());
            int i = this.f116050b;
            try {
                Map a = bgci.mo62639a();
                HashMap hashMap = new HashMap();
                for (Long l : aepp.m52360d(bgci.f116043a)) {
                    long longValue = l.longValue();
                    Uri c = aepp.m52359c(bgci.f116043a, longValue);
                    if (c != null) {
                        hashMap.put(Long.valueOf(longValue), c);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (bgci.f116045c.mo72627a(((Long) entry.getKey()).longValue()) != null) {
                        hashMap2.put((Long) entry.getKey(), (Uri) entry.getValue());
                    }
                }
                ArrayList<bgch> arrayList = new ArrayList();
                for (Map.Entry entry2 : a.entrySet()) {
                    Uri uri = (Uri) hashMap2.get(entry2.getKey());
                    if (i != 1) {
                        if (uri != null && uri.equals(entry2.getValue())) {
                            arrayList.add(new bgch(1, ((Long) entry2.getKey()).longValue(), (Uri) entry2.getValue()));
                        }
                    }
                    arrayList.add(new bgch(2, ((Long) entry2.getKey()).longValue(), (Uri) entry2.getValue()));
                }
                for (Long l2 : rsr.m34361b(hashMap2.keySet(), a.keySet())) {
                    arrayList.add(new bgch(3, l2.longValue(), null));
                }
                for (bgch bgch : arrayList) {
                    int i2 = bgch.f116039a;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            bgci.mo62640a(bgch.f116040b, 2);
                        } else {
                            try {
                                byte[] a2 = boav.m111020a((InputStream) bgci.f116044b.mo60631a(bgch.f116041c, behs.m95063a(), new beer[0]).get());
                                if (a2 != null) {
                                    if (a2.length != 0) {
                                        bgci.mo62640a(bgch.f116040b, 1);
                                        bgci.mo62641a(bgch, a2);
                                    }
                                }
                                Object[] objArr = {"Updater:", Long.valueOf(bgch.f116040b)};
                            } catch (IOException | InterruptedException | ExecutionException e) {
                                Object[] objArr2 = {"Updater:", Long.valueOf(bgch.f116040b), e};
                            }
                        }
                    }
                }
                if (i == 1) {
                    C1225nr nrVar = new C1225nr();
                    for (bugr bugr : bgci.f116045c.mo72635b()) {
                        nrVar.add(Long.valueOf(bugr.mo72639a()));
                    }
                    bugm bugm = bgci.f116046d;
                    ((bgcz) bugm).f116087c.execute(new bgcr((bgcz) bugm, nrVar));
                } else {
                    for (bgch bgch2 : arrayList) {
                        if (bgch2.f116039a == 2) {
                            if (bgch2.f116042d && bgci.f116045c.mo72627a(bgch2.f116040b) != null) {
                                Object[] objArr3 = {"Updater:", Long.valueOf(bgch2.f116040b)};
                                bugm bugm2 = bgci.f116046d;
                                ((bgcz) bugm2).f116087c.execute(new bgct((bgcz) bugm2, bgch2.f116040b));
                            } else {
                                Object[] objArr4 = {"Updater:", Long.valueOf(bgch2.f116040b)};
                                bugm bugm3 = bgci.f116046d;
                                ((bgcz) bugm3).f116087c.execute(new bgcu((bgcz) bugm3, bgch2.f116040b));
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (bgch bgch3 : arrayList) {
                    int i3 = bgch3.f116039a;
                    if (i3 == 1) {
                        arrayList2.add(Long.valueOf(bgch3.f116040b));
                    } else if (i3 != 2) {
                        aepp.m52361d(bgci.f116043a, bgch3.f116040b);
                    } else if (bgch3.f116042d) {
                        arrayList2.add(Long.valueOf(bgch3.f116040b));
                        aepp.m52353a(bgci.f116043a, bgch3.f116040b, bgch3.f116041c);
                    }
                }
                aepp.m52354a(bgci.f116043a, arrayList2);
                if (cezb.m138454c()) {
                    List<bugr> b = bgci.f116045c.mo72635b();
                    int a3 = bgci.f116045c.mo72626a();
                    bgbq bgbq = bgci.f116047e;
                    if (cezb.m138454c()) {
                        bxvd da = bpkm.f137987d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpkm bpkm = (bpkm) da.f164949b;
                        bpkm.f137989a |= 1;
                        bpkm.f137991c = a3;
                        if (b != null) {
                            for (bugr bugr2 : b) {
                                bxvd da2 = bpkj.f137973d.mo74144da();
                                long a4 = bugr2.mo72639a();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpkj bpkj = (bpkj) da2.f164949b;
                                bpkj.f137975a |= 1;
                                bpkj.f137976b = a4;
                                int c2 = bugr2.mo72647c();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpkj bpkj2 = (bpkj) da2.f164949b;
                                bpkj2.f137975a |= 2;
                                bpkj2.f137977c = c2;
                                bpkj bpkj3 = (bpkj) da2.mo74062i();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpkm bpkm2 = (bpkm) da.f164949b;
                                bpkj3.getClass();
                                if (!bpkm2.f137990b.mo73666a()) {
                                    bpkm2.f137990b = bxvk.m124021a(bpkm2.f137990b);
                                }
                                bpkm2.f137990b.add(bpkj3);
                            }
                        }
                        bxvd da3 = bpkl.f137979g.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bpkl bpkl = (bpkl) da3.f164949b;
                        bpkl.f137982b = 1;
                        bpkl.f137981a |= 1;
                        bpkm bpkm3 = (bpkm) da.mo74062i();
                        bpkm3.getClass();
                        bpkl.f137983c = bpkm3;
                        bpkl.f137981a |= 2;
                        bgbq.mo62622a(da3);
                    }
                }
            } catch (IOException e2) {
                Object[] objArr5 = {"Updater:", e2};
            }
        }
    }
}

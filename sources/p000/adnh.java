package p000;

import android.content.ComponentName;
import android.os.SystemClock;
import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: adnh */
public final /* synthetic */ class adnh implements Runnable {

    /* renamed from: a */
    private final IpaPackageBroadcastIntentOperation f62211a;

    /* renamed from: b */
    private final String f62212b;

    public adnh(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation, String str) {
        this.f62211a = ipaPackageBroadcastIntentOperation;
        this.f62212b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e A[SYNTHETIC, Splitter:B:59:0x015e] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e A[SYNTHETIC, Splitter:B:68:0x016e] */
    public final void run() {
        IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation = this.f62211a;
        String str = this.f62212b;
        adnd a = adnd.m50837a(ipaPackageBroadcastIntentOperation);
        if (a != null) {
            bxvd da = boly.f133593k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133595a = bolx.m111324a(3);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bngx b = adne.m50851b(a.f62204d, str);
            if (b == null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((boly) da.f164949b).f133602h = bolw.m111323a(4);
                adns.m50862a().mo33691a((boly) da.mo74062i());
                adns.m50862a().mo33690a(30);
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<ComponentName> arrayList2 = new ArrayList();
            bnre i = b.listIterator();
            while (i.hasNext()) {
                admu admu = (admu) i.next();
                if (admu.mo33669b()) {
                    arrayList2.add(admu.f62181c);
                }
                brhy a2 = adnd.m50840a(admu);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            int size = arrayList.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133596b = size;
            if (arrayList.size() == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((boly) da.f164949b).f133602h = bolw.m111323a(3);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((boly) da.f164949b).f133603i = elapsedRealtime2;
                adns.m50862a().mo33691a((boly) da.mo74062i());
                return;
            }
            aucb a3 = a.f62202b.mo32869a((brhy[]) arrayList.toArray(new brhy[arrayList.size()]));
            a3.mo50373a(adnd.m50839a(elapsedRealtime, (boly) da.mo74062i()));
            a3.mo50372a(adnd.m50838a(elapsedRealtime, (boly) da.mo74062i(), 31));
            adnf adnf = a.f62203c;
            synchronized (adnf.f62206a) {
                PrintWriter printWriter = null;
                try {
                    PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(adnf.f62207b.getFileStreamPath("apps_3p_corpus_component_names.txt"), true)));
                    try {
                        for (ComponentName componentName : arrayList2) {
                            printWriter2.println(componentName.flattenToString());
                        }
                        try {
                            printWriter2.close();
                        } catch (RuntimeException e) {
                            new Object[1][0] = "apps_3p_corpus_component_names.txt";
                        }
                    } catch (IOException e2) {
                        e = e2;
                        printWriter = printWriter2;
                        try {
                            adnt.m50873b(e, "Failed to append to component name file.", new Object[0]);
                            if (printWriter != null) {
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (printWriter != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        printWriter = printWriter2;
                        if (printWriter != null) {
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    adnt.m50873b(e, "Failed to append to component name file.", new Object[0]);
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (RuntimeException e4) {
                            new Object[1][0] = "apps_3p_corpus_component_names.txt";
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (RuntimeException e5) {
                            new Object[1][0] = "apps_3p_corpus_component_names.txt";
                        }
                    }
                    throw th;
                }
            }
            return;
        }
        return;
    }
}

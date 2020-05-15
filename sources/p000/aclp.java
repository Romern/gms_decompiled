package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: aclp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclp {

    /* renamed from: f */
    private static final aplz f60099f;

    /* renamed from: g */
    private static aclp f60100g;

    /* renamed from: a */
    public final Context f60101a;

    /* renamed from: b */
    public final acnn f60102b;

    /* renamed from: c */
    private final abym f60103c = new abym(this.f60101a);

    /* renamed from: d */
    private final apox f60104d;

    /* renamed from: e */
    private final apsn f60105e;

    static {
        aply aply = new aply();
        aply.f84722a = "AppsCorpus";
        f60099f = aply.mo47407a();
    }

    public aclp(Context context, acnn acnn, apox apox, apsn apsn) {
        this.f60101a = context;
        this.f60102b = acnn;
        this.f60104d = apox;
        this.f60105e = apsn;
        SharedPreferences sharedPreferences = this.f60101a.getSharedPreferences("proxy-apps-corpus", 0);
        int i = sharedPreferences.getInt("version", 0);
        if (i < 4) {
            sharedPreferences.edit().putInt("version", 4).commit();
        }
        if (i >= 4) {
            SharedPreferences sharedPreferences2 = this.f60101a.getSharedPreferences("proxy-apps-corpus", 0);
            String string = sharedPreferences2.getString("current-os-build-id", null);
            if (string == null || !Build.ID.equals(string)) {
                sharedPreferences2.edit().putString("current-os-build-id", Build.ID).apply();
            } else if (mo32849e() > 0) {
                return;
            }
            acoe.m49588a().mo32944a(acoe.m49589a("AppsCorpusReconcileCorpusRunnable", new aclo(this)));
            return;
        }
        acoe.m49588a().mo32944a(acoe.m49589a("AppsCorpusRecreateCorpusRunnable", new aclm(this)));
    }

    /* renamed from: a */
    public static aclp m49388a(Context context) {
        if (!m49389a()) {
            return null;
        }
        synchronized (aclp.class) {
            if (f60100g == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (acnn.class) {
                    if (acnn.f60255e == null) {
                        acnn.f60255e = new acnn(applicationContext, "icing_apps_corpus_entries.bin", "icing_apps_corpus_component_names.txt");
                    }
                }
                f60100g = new aclp(applicationContext, acnn.f60255e, aplx.m70651b(applicationContext, f60099f), aplx.m70649a(applicationContext, f60099f));
            }
        }
        return f60100g;
    }

    /* renamed from: b */
    public final boolean mo32846b() {
        acnv.m49541a("AppsCorpus::recreateWholeCorpus");
        bngx a = C1599acls.m49398a(this.f60101a.getPackageManager());
        if (!a.isEmpty()) {
            this.f60102b.mo32921a((Iterable) C1599acls.m49400a(a));
            Set<aclr> a2 = C1599acls.m49401a(this.f60105e, this.f60103c);
            if (a2 != null) {
                long e = mo32849e();
                ArrayList arrayList = new ArrayList(a2.size() + a.size());
                for (aclr aclr : a2) {
                    e++;
                    bxvd da = aclj.f60087e.mo74144da();
                    String str = aclr.f60112a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aclj aclj = (aclj) da.f164949b;
                    str.getClass();
                    int i = aclj.f60089a | 2;
                    aclj.f60089a = i;
                    aclj.f60091c = str;
                    aclj.f60090b = 2;
                    int i2 = i | 1;
                    aclj.f60089a = i2;
                    aclj.f60089a = i2 | 4;
                    aclj.f60092d = e;
                    arrayList.add((aclj) da.mo74062i());
                }
                bnre i3 = a.listIterator();
                while (i3.hasNext()) {
                    e++;
                    bxvd da2 = aclj.f60087e.mo74144da();
                    String str2 = ((aclr) i3.next()).f60112a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aclj aclj2 = (aclj) da2.f164949b;
                    str2.getClass();
                    int i4 = aclj2.f60089a | 2;
                    aclj2.f60089a = i4;
                    aclj2.f60091c = str2;
                    aclj2.f60090b = 1;
                    int i5 = i4 | 1;
                    aclj2.f60089a = i5;
                    aclj2.f60089a = i5 | 4;
                    aclj2.f60092d = e;
                    arrayList.add((aclj) da2.mo74062i());
                }
                this.f60102b.mo32923a((List) arrayList);
                mo32845a(e);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089 A[DONT_GENERATE] */
    /* renamed from: c */
    public final void mo32847c() {
        try {
            CorpusStatus corpusStatus = (CorpusStatus) aucu.m76782a(this.f60104d.mo47488b("com.google.android.gms", "apps"));
            if (corpusStatus.f9523a) {
                acnv.m49553c("Status for corpus %s, lastCommittedSeqno:%d lastIndexedSeqno:%d", "apps", Long.valueOf(corpusStatus.f9525c), Long.valueOf(corpusStatus.f9524b));
                acnn acnn = this.f60102b;
                long j = corpusStatus.f9525c;
                acnv.m49542a("removeCommittedEntries for lastCommittedSeqno %d", Long.valueOf(j));
                synchronized (acnn.f60254a) {
                    List a = acnn.mo32920a();
                    int i = -1;
                    while (true) {
                        int i2 = i + 1;
                        if (i2 < a.size() && j >= ((aclj) a.get(i2)).f60092d) {
                            i = i2;
                        } else if (i < 0) {
                            acnv.m49543a("Remove committed entries from %d to %d", Long.valueOf(((aclj) a.get(0)).f60092d), Long.valueOf(((aclj) a.get(i)).f60092d));
                            a.subList(0, i2).clear();
                            acnn.mo32923a(a);
                        }
                    }
                    if (i < 0) {
                    }
                }
                acnv.m49543a("Requesting indexing of %s with lastSeqno %d", "apps", Long.valueOf(mo32849e()));
                try {
                    if (!((Boolean) aucu.m76782a(this.f60104d.mo47487a("com.google.android.gms", "apps", mo32849e()))).booleanValue()) {
                        acnv.m49556e("Failed to request indexing");
                    }
                } catch (InterruptedException | ExecutionException e) {
                    if (e instanceof rjp) {
                        acnv.m49557e("Failed to request indexing. Status Code: %d", Integer.valueOf(((rjp) e).mo24655a()));
                    }
                }
            } else {
                acnv.m49557e("Couldn't find corpus %s", "apps");
            }
        } catch (InterruptedException | ExecutionException e2) {
            acnv.m49557e("Couldn't fetch status for corpus %s", "apps");
        }
    }

    /* renamed from: d */
    public final void mo32848d() {
        acnv.m49541a("AppsCorpus.onMaintenance starts");
        long currentTimeMillis = System.currentTimeMillis();
        bngx a = C1599acls.m49398a(this.f60101a.getPackageManager());
        if (!a.isEmpty()) {
            this.f60102b.mo32921a((Iterable) C1599acls.m49400a(a));
            Set<aclr> a2 = C1599acls.m49401a(this.f60105e, this.f60103c);
            if (a2 != null) {
                HashSet<aclr> hashSet = new HashSet(a);
                if (a2.equals(hashSet)) {
                    acnv.m49542a("AppsCorpus has %d ComponentNames.", Integer.valueOf(hashSet.size()));
                } else {
                    HashSet hashSet2 = new HashSet(a2);
                    hashSet2.retainAll(hashSet);
                    a2.removeAll(hashSet2);
                    hashSet.removeAll(hashSet2);
                    long e = mo32849e();
                    ArrayList arrayList = new ArrayList(a2.size() + hashSet.size());
                    for (aclr aclr : a2) {
                        e++;
                        bxvd da = aclj.f60087e.mo74144da();
                        String str = aclr.f60112a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aclj aclj = (aclj) da.f164949b;
                        str.getClass();
                        int i = aclj.f60089a | 2;
                        aclj.f60089a = i;
                        aclj.f60091c = str;
                        aclj.f60090b = 2;
                        int i2 = i | 1;
                        aclj.f60089a = i2;
                        aclj.f60089a = i2 | 4;
                        aclj.f60092d = e;
                        arrayList.add((aclj) da.mo74062i());
                    }
                    for (aclr aclr2 : hashSet) {
                        e++;
                        bxvd da2 = aclj.f60087e.mo74144da();
                        String str2 = aclr2.f60112a;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aclj aclj2 = (aclj) da2.f164949b;
                        str2.getClass();
                        int i3 = aclj2.f60089a | 2;
                        aclj2.f60089a = i3;
                        aclj2.f60091c = str2;
                        aclj2.f60090b = 1;
                        int i4 = i3 | 1;
                        aclj2.f60089a = i4;
                        aclj2.f60089a = i4 | 4;
                        aclj2.f60092d = e;
                        arrayList.add((aclj) da2.mo74062i());
                    }
                    this.f60102b.mo32923a((List) arrayList);
                    mo32845a(e);
                    mo32847c();
                }
            }
        }
        bxvd da3 = bpwp.f139543d.mo74144da();
        int a3 = (int) ((mo32844a("icing_apps_corpus_entries.bin") + mo32844a("icing_apps_corpus_component_names.txt")) >> 10);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpwp bpwp = (bpwp) da3.f164949b;
        bpwp.f139545a = 1 | bpwp.f139545a;
        bpwp.f139546b = a3;
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpwp bpwp2 = (bpwp) da3.f164949b;
        bpwp2.f139545a |= 2;
        bpwp2.f139547c = currentTimeMillis2;
        bpwp bpwp3 = (bpwp) da3.mo74062i();
        abym abym = this.f60103c;
        long d = cema.m137237d();
        if (abym.mo32452a(d)) {
            bxvd da4 = bpxb.f139606R.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpxb bpxb = (bpxb) da4.f164949b;
            bpwp3.getClass();
            bpxb.f139639o = bpwp3;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            abym.mo32438a(2004, da4, d);
        }
        acnv.m49541a("AppsCorpus.onMaintenance ends");
    }

    /* renamed from: e */
    public final long mo32849e() {
        return this.f60101a.getSharedPreferences("proxy-apps-corpus", 0).getLong("last-seqno", -1);
    }

    /* renamed from: a */
    public static boolean m49389a() {
        if (!((Boolean) abzt.f58886aa.mo58455c()).booleanValue()) {
            return true;
        }
        acnv.m49554d("AppsCorpus is disabled by Gservices flag");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo32844a(String str) {
        try {
            File fileStreamPath = this.f60101a.getFileStreamPath(str);
            if (fileStreamPath != null) {
                return fileStreamPath.length();
            }
            return 0;
        } catch (SecurityException e) {
            acnv.m49557e("Failed to get file size for %s", str);
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo32845a(long j) {
        this.f60101a.getSharedPreferences("proxy-apps-corpus", 0).edit().putLong("last-seqno", j).commit();
    }
}

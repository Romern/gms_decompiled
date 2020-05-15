package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: adnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnd {

    /* renamed from: e */
    private static adnd f62199e;

    /* renamed from: f */
    private static final adnk f62200f = new adnk();

    /* renamed from: a */
    public final Context f62201a;

    /* renamed from: b */
    public final brhj f62202b;

    /* renamed from: c */
    public final adnf f62203c;

    /* renamed from: d */
    public final PackageManager f62204d;

    public adnd(Context context, brhj brhj, adnf adnf, PackageManager packageManager) {
        this.f62201a = context;
        this.f62202b = brhj;
        this.f62203c = adnf;
        this.f62204d = packageManager;
    }

    /* renamed from: a */
    public static adnd m50837a(Context context) {
        synchronized (adnd.class) {
            if (!ceqm.m137873d()) {
                f62199e = null;
                brhj.m114016a(context).mo32873b("MobileApplication");
                adnd adnd = f62199e;
                return adnd;
            }
            if (f62199e == null) {
                adnd adnd2 = new adnd(context, brhj.m114016a(context), new adnf(context), context.getPackageManager());
                f62199e = adnd2;
                SharedPreferences sharedPreferences = adnd2.f62201a.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                int i = sharedPreferences.getInt("Version", 0);
                if (i != 1) {
                    sharedPreferences.edit().putInt("Version", 1).commit();
                    if (i != 1) {
                        adnv.m50879a().mo33695a(new admz(adnd2));
                    }
                }
                SharedPreferences sharedPreferences2 = adnd2.f62201a.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                String string = sharedPreferences2.getString("CurrentOsBuildId", null);
                if (string != null) {
                    if (Build.ID.equals(string)) {
                    }
                }
                sharedPreferences2.edit().putString("CurrentOsBuildId", Build.ID).apply();
                adnv.m50879a().mo33695a(new adna(adnd2));
            }
            adnd adnd3 = f62199e;
            return adnd3;
        }
    }

    /* renamed from: b */
    public final void mo33673b() {
        Set set;
        long j;
        brhy a;
        bxvd da = boly.f133593k.mo74144da();
        int i = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boly) da.f164949b).f133595a = bolx.m111324a(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aply aply = new aply();
        aply.f84722a = "IpaAppsCorpus";
        Set a2 = adne.m50848a(aplx.m70649a(this.f62201a, aply.mo47407a()));
        if (a2 == null) {
            if (!ceqm.f183265a.mo6606a().mo79620e() || !this.f62203c.mo33674a().isEmpty()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((boly) da.f164949b).f133602h = bolw.m111323a(4);
                adns.m50862a().mo33691a((boly) da.mo74062i());
                return;
            }
            a2 = bnon.f131923a;
        }
        bngx b = adne.m50850b(this.f62204d);
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
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        int size = b.size();
        int i2 = 0;
        while (i2 < size) {
            admu admu = (admu) b.get(i2);
            hashMap.put(admu.f62182d, admu);
            hashSet.add(admu.f62181c);
            i2++;
            elapsedRealtime = elapsedRealtime;
            i = 0;
        }
        Set keySet = hashMap.keySet();
        long j2 = elapsedRealtime;
        if (System.currentTimeMillis() - TimeUnit.DAYS.toMillis(ceqm.f183265a.mo6606a().mo79624i()) < this.f62201a.getSharedPreferences("AppsIndexerSharedPrefs", i).getLong("AppsIndexerAppsRefreshed", 0)) {
            set = bnpf.m110057c(keySet, a2);
        } else {
            this.f62201a.getSharedPreferences("AppsIndexerSharedPrefs", 0).edit().putLong("AppsIndexerAppsRefreshed", System.currentTimeMillis()).apply();
            set = keySet;
        }
        bnpd c = bnpf.m110057c(a2, keySet);
        bnic<String> a3 = bnic.m109495a((Collection) set);
        ArrayList arrayList = new ArrayList();
        for (String str : a3) {
            admu admu2 = (admu) hashMap.get(str);
            if (!(admu2 == null || (a = m50840a(admu2)) == null)) {
                arrayList.add(a);
            }
        }
        int size2 = arrayList.size();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boly boly = (boly) da.f164949b;
        boly.f133596b = size2;
        boly.f133604j = bxvk.m124030de();
        if (arrayList.size() > 0) {
            aucb a4 = this.f62202b.mo32869a((brhy[]) arrayList.toArray(new brhy[arrayList.size()]));
            j = j2;
            a4.mo50372a(m50838a(j, (boly) da.mo74062i(), 31));
            a4.mo50373a(m50839a(j, (boly) da.mo74062i()));
        } else {
            j = j2;
        }
        bxvd e = da.clone();
        int size3 = c.size();
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        ((boly) e.f164949b).f133598d = size3;
        boly boly2 = (boly) e.mo74062i();
        if (c.size() > 0) {
            aucb a5 = this.f62202b.mo32870a((String[]) c.toArray(new String[c.size()]));
            a5.mo50372a(m50838a(j, boly2, 32));
            a5.mo50373a(m50839a(j, boly2));
        }
        this.f62203c.mo33675a(hashSet);
    }

    /* renamed from: a */
    public static aubt m50838a(long j, boly boly, int i) {
        return new adnc(i, boly, j);
    }

    /* renamed from: a */
    public static aubw m50839a(long j, boly boly) {
        return new adnb(boly, j);
    }

    /* renamed from: a */
    public static final brhy m50840a(admu admu) {
        bric bric = new bric("MobileApplication");
        if (admu.mo33668a()) {
            bric.mo69558c(admu.f62179a);
            if (!TextUtils.isEmpty(admu.f62182d)) {
                String str = admu.f62182d;
                int i = 0;
                if (str.length() > 256) {
                    adns.m50862a().mo33690a(36);
                    adnt.m50872b("Can't build MobileApplication indexable: URL too long %s", str);
                    return null;
                }
                bric.mo69557b(str);
                if (!TextUtils.isEmpty(admu.f62180b)) {
                    bric.mo69550a(admu.f62180b);
                }
                Long l = admu.f62183e;
                if (l != null) {
                    Date date = new Date(l.longValue());
                    sdo.m34959a(date);
                    bric.mo69551a("dateModified", date.getTime());
                }
                bnic bnic = admu.f62184f;
                if (admu.mo33669b()) {
                    String flattenToShortString = admu.f62181c.flattenToShortString();
                    sdo.m34959a((Object) flattenToShortString);
                    bric.mo69553a("identifier", flattenToShortString);
                    adnk adnk = f62200f;
                    String packageName = admu.f62181c.getPackageName();
                    MessageDigest messageDigest = adnk.f62217b;
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(packageName.getBytes());
                        long j = 0;
                        for (int i2 = 0; i2 < 8; i2++) {
                            j = (j << 8) | ((long) (digest[i2] & 255));
                        }
                        while (true) {
                            long[][] jArr = adnk.f62218c;
                            if (i < jArr.length) {
                                if (Arrays.binarySearch(jArr[i], j) >= 0) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }
                    i = -1;
                    if (i == -1) {
                        i = adnk.f62218c.length;
                    }
                    Long valueOf = Long.valueOf(adnk.f62216a[i]);
                    brhx brhx = new brhx();
                    brhx.mo69541a(valueOf.intValue());
                    brhx.mo69542b();
                    bric.mo69548a(brhx);
                } else {
                    brhx brhx2 = new brhx();
                    brhx2.mo69542b();
                    bric.mo69548a(brhx2);
                }
                return bric.mo69547a();
            }
            adnt.m50871b("Cant build MobileApplication indexable. URL missing");
            return null;
        }
        adnt.m50871b("Cant build MobileApplication indexable. Name missing.");
        return null;
    }

    /* renamed from: a */
    public final void mo33672a() {
        bxvd da = boly.f133593k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boly) da.f164949b).f133595a = bolx.m111324a(5);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bngx b = adne.m50850b(this.f62204d);
        if (b != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                admu admu = (admu) b.get(i);
                if (admu.mo33669b()) {
                    arrayList2.add(admu.f62181c);
                }
                brhy a = m50840a(admu);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            int size2 = arrayList.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133596b = size2;
            aucb a2 = this.f62202b.mo32869a((brhy[]) arrayList.toArray(new brhy[arrayList.size()]));
            a2.mo50373a(m50839a(elapsedRealtime, (boly) da.mo74062i()));
            a2.mo50372a(m50838a(elapsedRealtime, (boly) da.mo74062i(), 31));
            this.f62203c.mo33675a(arrayList2);
        }
    }
}

package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrv implements abqv {

    /* renamed from: a */
    public static long f58061a;

    /* renamed from: A */
    public String f58062A;

    /* renamed from: B */
    public abpm f58063B;

    /* renamed from: C */
    public final abri f58064C = new abri(this);

    /* renamed from: D */
    public final abrl f58065D = new abrl(this);

    /* renamed from: b */
    public final Context f58066b;

    /* renamed from: c */
    public final acpl f58067c;

    /* renamed from: d */
    public final String f58068d;

    /* renamed from: e */
    public final acqb f58069e;

    /* renamed from: f */
    public final Semaphore f58070f = new Semaphore(1);

    /* renamed from: g */
    public acrl f58071g;

    /* renamed from: h */
    public absi f58072h;

    /* renamed from: i */
    public abvc f58073i;

    /* renamed from: j */
    abze f58074j;

    /* renamed from: k */
    public acxo f58075k;

    /* renamed from: l */
    acxs f58076l;

    /* renamed from: m */
    public abyx f58077m;

    /* renamed from: n */
    public NativeIndex f58078n;

    /* renamed from: o */
    public acaf f58079o;

    /* renamed from: p */
    abph f58080p;

    /* renamed from: q */
    public abvx f58081q;

    /* renamed from: r */
    public abyh f58082r;

    /* renamed from: s */
    public final abym f58083s;

    /* renamed from: t */
    public final abyl f58084t;

    /* renamed from: u */
    public final acao f58085u;

    /* renamed from: v */
    public final bdwt f58086v;

    /* renamed from: w */
    public final bdsg f58087w;

    /* renamed from: x */
    public final boolean f58088x;

    /* renamed from: y */
    public final List f58089y = new ArrayList();

    /* renamed from: z */
    public acxk f58090z = null;

    public abrv(Context context, acpl acpl, String str) {
        int i;
        this.f58066b = context;
        this.f58067c = acpl;
        abym abym = new abym(context);
        this.f58083s = abym;
        this.f58084t = new abyl(abym.f58737a);
        this.f58085u = new acap(context);
        this.f58068d = str;
        this.f58086v = new bdwt(new abry(), new aytg(), bqfb.INSTANCE, bmzn.m108681a((bmzi) new abrw(context)), new bdrl(context));
        this.f58087w = new bdsg(new abrz(), bmzn.m108681a((bmzi) new abrx(context)), new bdrl(context), new aytg(), bqfb.INSTANCE);
        this.f58088x = true;
        abqw abqw = new abqw(this);
        synchronized (acpl.f60418a) {
            acpl.f60420c.add(abqw);
            synchronized (acpl.f60418a) {
                acpl.mo32988a();
                i = acpl.f60421d;
            }
            if (i > 0) {
                acpl.f60419b.add(abqw);
            }
        }
        this.f58069e = new acqa(context);
    }

    /* renamed from: a */
    private final absr m48114a(acak acak, abzr abzr) {
        this.f58067c.mo32992b(2);
        abzm b = mo32314b();
        b.mo32530a(acak, abzr, new abrp(this));
        absr d = b.mo32543d(acak);
        if (abzm.m48653a(d)) {
            this.f58079o.mo32578a(acak);
            abvx abvx = this.f58081q;
            if (abvx != null) {
                abvx.mo32375b();
            }
        }
        return d;
    }

    /* renamed from: b */
    public static abtg m48116b(boolean z) {
        if (!z) {
            return abtg.f58218f;
        }
        bxvd da = abtg.f58218f.mo74144da();
        int seconds = (int) TimeUnit.DAYS.toSeconds(14);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtg abtg = (abtg) da.f164949b;
        int i = abtg.f58220a | 1;
        abtg.f58220a = i;
        abtg.f58221b = seconds;
        int i2 = i | 2;
        abtg.f58220a = i2;
        abtg.f58222c = 1;
        int i3 = i2 | 4;
        abtg.f58220a = i3;
        abtg.f58223d = 20;
        abtg.f58220a = i3 | 8;
        abtg.f58224e = 20;
        return (abtg) da.mo74062i();
    }

    /* renamed from: e */
    private final void m48117e(String str) {
        abuw h;
        mo32322e();
        absg.m48197c("doRemovePackageData %s", str);
        abyv d = this.f58077m.mo32506d(str);
        if (d != null) {
            if (mo32312a(d) && (h = this.f58078n.mo43413h()) != null && abvc.m48308a(h)) {
                mo32302a(3);
            }
            mo32310a(str);
            return;
        }
        absg.m48202d("doRemovePackageData %s: not a known client", str);
    }

    /* renamed from: a */
    public final abzo mo32298a() {
        return this.f58074j.f58793b;
    }

    /* renamed from: c */
    public final void mo32318c(String str) {
        this.f58067c.mo32992b(2);
        new abzq(this.f58077m, this.f58064C, this.f58071g.mo33034h()).mo32551a(str);
    }

    /* renamed from: d */
    public final boolean mo32320d() {
        if (this.f58067c.mo32991a(2)) {
            return mo32319c();
        }
        this.f58070f.acquireUninterruptibly();
        try {
            return mo32319c();
        } finally {
            this.f58070f.release();
        }
    }

    /* renamed from: f */
    public final void mo32323f() {
        mo32322e();
        acpl acpl = this.f58067c;
        abra abra = new abra(this, bqbd.COMMIT_INDEX);
        acpl.mo32995d(abra);
        abra.mo32295h();
    }

    /* renamed from: g */
    public final acpw mo32324g() {
        mo32322e();
        acpl acpl = this.f58067c;
        abrd abrd = new abrd(this, bqbd.COMPACT_INDEX);
        acpl.mo32995d(abrd);
        return abrd;
    }

    /* renamed from: h */
    public final acpw mo32325h() {
        acpl acpl = this.f58067c;
        abrf abrf = new abrf(this, bqbd.INDEX_MAINTENANCE);
        acpl.mo32995d(abrf);
        return abrf;
    }

    /* renamed from: i */
    public final abtm mo32326i() {
        abpm b;
        abpm b2;
        abpm b3;
        bxvd da = abtm.f58259k.mo74144da();
        String language = Locale.getDefault().getLanguage();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm = (abtm) da.f164949b;
        language.getClass();
        abtm.f58261a |= 2;
        abtm.f58262b = language;
        abpm abpm = this.f58063B;
        if (abpm != null) {
            da.mo73973a(abpm);
        }
        int intValue = ((Integer) abzt.f58855W.mo58455c()).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm2 = (abtm) da.f164949b;
        abtm2.f58261a |= 4;
        abtm2.f58264d = intValue;
        if (((Boolean) abzt.f58856X.mo58455c()).booleanValue() && (b3 = this.f58072h.mo32340b("saft-segmenter-model")) != null) {
            da.mo73973a(b3);
        }
        if (acaw.m48797n() && (b2 = this.f58072h.mo32340b("nicknames")) != null) {
            da.mo73973a(b2);
        }
        if (((Boolean) abzt.f58857Y.mo58455c()).booleanValue() && (b = this.f58072h.mo32340b("address_data")) != null) {
            da.mo73973a(b);
        }
        bxvd da2 = abtl.f58251g.mo74144da();
        boolean booleanValue = ((Boolean) acaw.f59388h.mo58455c()).booleanValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abtl abtl = (abtl) da2.f164949b;
        abtl.f58253a |= 1;
        abtl.f58254b = booleanValue;
        boolean i = acaw.m48792i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abtl abtl2 = (abtl) da2.f164949b;
        abtl2.f58253a |= 2;
        abtl2.f58255c = i;
        boolean booleanValue2 = ((Boolean) acaw.f59384d.mo58455c()).booleanValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abtl abtl3 = (abtl) da2.f164949b;
        abtl3.f58253a |= 8;
        abtl3.f58256d = booleanValue2;
        boolean p = cemw.f183016a.mo6606a().mo79386p();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abtl abtl4 = (abtl) da2.f164949b;
        abtl4.f58253a |= 16;
        abtl4.f58257e = p;
        boolean h = cemw.f183016a.mo6606a().mo79378h();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abtl abtl5 = (abtl) da2.f164949b;
        abtl5.f58253a |= 32;
        abtl5.f58258f = h;
        abtl abtl6 = (abtl) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm3 = (abtm) da.f164949b;
        abtl6.getClass();
        abtm3.f58265e = abtl6;
        abtm3.f58261a |= 8;
        String absolutePath = this.f58066b.getFilesDir().getAbsolutePath();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm4 = (abtm) da.f164949b;
        absolutePath.getClass();
        abtm4.f58261a |= 16;
        abtm4.f58266f = absolutePath;
        String packageName = this.f58066b.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm5 = (abtm) da.f164949b;
        packageName.getClass();
        abtm5.f58261a |= 32;
        abtm5.f58267g = packageName;
        byte[] bArr = (byte[]) abzt.f58915bC.mo58455c();
        if (bArr != null && bArr.length > 0) {
            try {
                abpr abpr = (abpr) bxvk.m124016a(abpr.f57891d, bArr, bxus.m123744c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abtm abtm6 = (abtm) da.f164949b;
                abpr.getClass();
                abtm6.f58268h = abpr;
                abtm6.f58261a |= 64;
            } catch (bxwf e) {
                absg.m48191b("Failed to parse pushed acl");
            }
        } else {
            abpr a = acxb.m49918a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abtm abtm7 = (abtm) da.f164949b;
            a.getClass();
            abtm7.f58268h = a;
            abtm7.f58261a |= 64;
        }
        long longValue = ((Long) abzt.f58979cn.mo58455c()).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm8 = (abtm) da.f164949b;
        abtm8.f58261a |= 128;
        abtm8.f58269i = longValue;
        int a2 = absg.m48183a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtm abtm9 = (abtm) da.f164949b;
        abtm9.f58261a |= 512;
        abtm9.f58270j = a2;
        return (abtm) da.mo74062i();
    }

    /* renamed from: j */
    public final void mo32327j() {
        this.f58067c.mo32992b(2);
        NativeIndex nativeIndex = this.f58078n;
        if (nativeIndex != null) {
            nativeIndex.mo43406b();
            this.f58078n = null;
        }
        this.f58071g = null;
        this.f58090z = null;
        this.f58073i = null;
        this.f58074j = null;
        this.f58077m = null;
        this.f58076l = null;
        acxo acxo = this.f58075k;
        if (acxo != null) {
            acxo.mo33214b();
            this.f58075k = null;
        }
        this.f58079o = null;
        abph abph = this.f58080p;
        if (abph != null) {
            adyd adyd = abph.f57849g;
            bljb a = blkh.m107281a("AccountManager.removeOnAccountsUpdatedListener");
            try {
                adyd.f62893a.removeOnAccountsUpdatedListener(abph);
                if (a != null) {
                    a.close();
                }
                this.f58080p = null;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        abvx abvx = this.f58081q;
        if (abvx != null) {
            abvx.f58585b.mo33986a("com.google.android.gms.icing.service.IcingGcmTaskService", "drain-request-queue");
            try {
                abvx.f58584a.close();
            } catch (IOException e) {
                absg.m48189a(e, "Failed to close request queue");
            }
            this.f58081q = null;
            return;
        }
        return;
        throw th;
    }

    /* renamed from: k */
    public final void mo32328k() {
        this.f58067c.mo32992b(2);
        if (!this.f58078n.mo43403a(abzu.m48730a())) {
            absg.m48196c("Failed to rebuild index.");
        }
        this.f58083s.mo32447a("index_rebuilt");
    }

    /* renamed from: l */
    public final void mo32329l() {
        this.f58067c.mo32992b(2);
        NativeIndex.nativeFlush(this.f58078n.f79071b);
        abzm b = mo32314b();
        synchronized (b.mo32525a()) {
            acam acam = b.f58813b;
            Collection<abss> values = b.f58817f.values();
            SharedPreferences.Editor edit = ((acan) acam).f59109a.edit();
            for (abss abss : values) {
                String valueOf = String.valueOf(((acan) acam).mo32590a(new acak(abss)));
                edit.putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), acky.m49362a(abss));
            }
            if (!edit.commit()) {
                b.f58816e.mo32447a("metadata_union_writeMetadataBatch_err");
            } else if (((acan) acam).f59110b.mo33197b() && !((acan) acam).f59110b.mo33196a()) {
                absg.m48191b("Failed to delete stale scratch file.");
            }
            b.f58818g = false;
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean], assign insn: PHI: (r15v0 ?) = (r15v5 ?), (r15v6 ?) binds: [B:72:0x01de, B:73:0x01f8] */
    /* JADX WARN: Type inference failed for: r15v5, assign insn: 0x01ed: CONST  (r15v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r15v6, assign insn: 0x01f9: CONST  (r15v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abzq.a(android.content.pm.PackageInfo, boolean):void
     arg types: [android.content.pm.PackageInfo, int]
     candidates:
      abzq.a(abyv, java.lang.String):void
      abzq.a(java.lang.String, boolean):boolean
      abzq.a(android.content.pm.PackageInfo, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x031d A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x031e A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0336 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0337 A[ADDED_TO_REGION, Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x034b A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0351 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0355 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0356 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x036c A[SYNTHETIC, Splitter:B:143:0x036c] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0381 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0392 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0394 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0458 A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x045c A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021b A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021d A[Catch:{ bxwf -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0242  */
    /* renamed from: m */
    public final void mo32330m() {
        ? r15;
        long c;
        long d;
        double d2;
        double d3;
        boolean z;
        double d4;
        boolean z2;
        boolean z3;
        boolean z4;
        abtm i;
        abpr abpr;
        byte[] nativeGetStorageState;
        bpxe bpxe;
        boolean a;
        int i2;
        ArrayList arrayList;
        boolean z5;
        bxvd bxvd;
        Boolean bool;
        int i3;
        String str;
        this.f58083s.mo32453b(6003);
        absg.m48196c("Performing maintenance.");
        this.f58067c.mo32992b(2);
        abzo a2 = mo32298a();
        synchronized (a2.mo32525a()) {
            synchronized (this.f58071g.f60625g) {
                acrl acrl = this.f58071g;
                synchronized (acrl.f60625g) {
                    acrl.f60620b.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
                }
                String a3 = this.f58085u.mo32592a();
                this.f58067c.mo32992b(2);
                int i4 = 8;
                if (!TextUtils.isEmpty(a3)) {
                    bxvd da = acqu.f60543c.mo74144da();
                    int i5 = 7;
                    int[] iArr = {8, 7};
                    int i6 = 0;
                    while (i6 < 2) {
                        acqb acqb = this.f58069e;
                        int i7 = iArr[i6];
                        if (a3 == null) {
                            bool = null;
                        } else {
                            if (i7 == i5) {
                                str = ((acqa) acqb).mo33011a(a3, "lookup", Pair.create("client", "device"));
                            } else if (i7 == i4) {
                                str = ((acqa) acqb).mo33011a(a3, "lookup", Pair.create("client", "web_app"));
                            } else {
                                StringBuilder sb = new StringBuilder(26);
                                sb.append("Bad setting id ");
                                sb.append(i7);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (str != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("history_recording_enabled")) {
                                        bool = Boolean.valueOf(jSONObject.getBoolean("history_recording_enabled"));
                                    }
                                } catch (JSONException e) {
                                    bool = null;
                                }
                            }
                            bool = null;
                        }
                        if (bool != null) {
                            bxvd da2 = bxsi.f164681e.mo74144da();
                            int i8 = iArr[i6];
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxsi bxsi = (bxsi) da2.f164949b;
                            bxsi.f164683a |= 1;
                            bxsi.f164684b = i8;
                            if (!bool.booleanValue()) {
                                i3 = 4;
                            } else {
                                i3 = 3;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxsi bxsi2 = (bxsi) da2.f164949b;
                            bxsi2.f164685c = i3 - 1;
                            bxsi2.f164683a |= 2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            acqu acqu = (acqu) da.f164949b;
                            bxsi bxsi3 = (bxsi) da2.mo74062i();
                            bxsi3.getClass();
                            if (!acqu.f60546b.mo73666a()) {
                                acqu.f60546b = bxvk.m124021a(acqu.f60546b);
                            }
                            acqu.f60546b.add(bxsi3);
                        }
                        i6++;
                        i5 = 7;
                        i4 = 8;
                    }
                    mo32309a(a3, (acqu) da.mo74062i());
                }
                this.f58067c.mo32992b(2);
                abzq abzq = new abzq(this.f58077m, this.f58064C, this.f58071g.mo33034h());
                List<PackageInfo> installedPackages = abzq.f58824a.f58772a.f58769c.getInstalledPackages(128);
                int size = installedPackages.size();
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("updateResources: found ");
                sb2.append(size);
                sb2.append(" total apps");
                absg.m48201d(sb2.toString());
                Set<String> b = abzq.f58824a.mo32501b();
                for (PackageInfo packageInfo : installedPackages) {
                    if (packageInfo.applicationInfo.enabled) {
                        b.remove(packageInfo.packageName);
                        abzq.mo32549a(packageInfo, false);
                    } else {
                        absg.m48202d("Package %s is disabled", packageInfo.packageName);
                    }
                }
                absg.m48203d("Apps that are now uninstalled (%d): %s", Integer.valueOf(b.size()), b);
                for (String str2 : b) {
                    abzq.f58826c.mo32292a(str2);
                }
                boolean a4 = this.f58085u.mo32593a(a3);
                if (!this.f58071g.mo33029e()) {
                    if (!a4) {
                        r15 = 0;
                        boolean z6 = System.currentTimeMillis() <= (this.f58078n.mo43408d().f133670a * 1000) + ((Long) abzt.f58986f.mo58455c()).longValue();
                        abvc abvc = this.f58073i;
                        double g = this.f58078n.mo43412g();
                        c = abvc.mo32353c();
                        d = abvc.mo32354d();
                        if (c > d) {
                            double d5 = (double) (d - c);
                            d2 = g;
                            double d6 = (double) d;
                            Double.isNaN(d5);
                            Double.isNaN(d6);
                            d3 = d5 / d6;
                        } else {
                            d2 = g;
                            d3 = 0.0d;
                        }
                        long j = Long.MAX_VALUE;
                        j = Long.MAX_VALUE;
                        if (d2 >= 0.0d && d2 < 1.0d) {
                            double d7 = (double) c;
                            Double.isNaN(d7);
                            j = (long) (d7 / (1.0d - d2));
                        }
                        if (d2 > 0.05d || d3 <= 0.05d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        double min = (double) Math.min(d, j);
                        Double.isNaN(min);
                        long j2 = (long) (min * 0.7d);
                        Object[] objArr = new Object[6];
                        objArr[r15] = Long.valueOf(c);
                        objArr[1] = Long.valueOf(d);
                        objArr[2] = Double.valueOf(d3 * 100.0d);
                        objArr[3] = Double.valueOf(100.0d * d2);
                        objArr[4] = Boolean.valueOf(z);
                        objArr[5] = Long.valueOf(j2);
                        absg.m48204d("Performing maintenance usage %s budget %s free %.3f%% index free %.3f%% purge? %s target %s", objArr);
                        if (z || j2 >= c) {
                            d4 = 0.0d;
                        } else {
                            double d8 = (double) c;
                            double d9 = (double) j2;
                            Double.isNaN(d8);
                            Double.isNaN(d9);
                            Double.isNaN(d8);
                            d4 = (d8 - d9) / d8;
                        }
                        if (((Boolean) abzt.f58856X.mo58455c()).booleanValue() || !mo32321d("saft-segmenter-model")) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (((Boolean) abzt.f58857Y.mo58455c()).booleanValue() || !mo32321d("address_data")) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (acaw.m48797n() || !mo32321d("nicknames")) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        i = mo32326i();
                        bnzc b2 = bnzi.m110900b();
                        abpr = i.f58268h;
                        if (abpr != null) {
                            abpr = abpr.f57891d;
                        }
                        String bnzb = b2.mo68722a(abpr.mo73642k()).toString();
                        boolean z7 = !this.f58062A.equals(bnzb);
                        if (z2) {
                            if (!z3 && !z4 && !z7) {
                                absg.m48184a("Not attempting to update native config as no configuration changed.");
                                NativeIndex.nativeOnMaintenance(this.f58078n.f79071b, z6);
                                abvc abvc2 = this.f58073i;
                                nativeGetStorageState = NativeIndex.nativeGetStorageState(this.f58078n.f79071b);
                                if (nativeGetStorageState != null) {
                                    try {
                                        bpxe = (bpxe) bxvk.m124016a(bpxe.f139685g, nativeGetStorageState, bxus.m123744c());
                                    } catch (bxwf e2) {
                                        absg.m48189a(e2, "Failed parsing storage state");
                                        bpxe = null;
                                    }
                                } else {
                                    bpxe = null;
                                }
                                abym abym = this.f58083s;
                                double g2 = this.f58078n.mo43412g();
                                a = abym.mo32451a();
                                i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                if (a) {
                                    if (bpxe != null) {
                                        bxvd = (bxvd) bpxe.mo74142c(5);
                                        bxvd.mo73625a((bxvk) bpxe);
                                    } else {
                                        bxvd = bpxe.f139685g.mo74144da();
                                    }
                                    int a5 = abvc2.mo32350a(g2);
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = r15;
                                    }
                                    bpxe bpxe2 = (bpxe) bxvd.f164949b;
                                    bpxe2.f139688b = bpzk.m112432a(a5);
                                    bpxe2.f139687a |= 1;
                                    long f = abvc2.mo32356f();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = r15;
                                    }
                                    bpxe bpxe3 = (bpxe) bxvd.f164949b;
                                    bpxe3.f139687a |= 2;
                                    bpxe3.f139689c = f;
                                    long e3 = abvc2.mo32355e();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = r15;
                                    }
                                    bpxe bpxe4 = (bpxe) bxvd.f164949b;
                                    int i9 = bpxe4.f139687a | 4;
                                    bpxe4.f139687a = i9;
                                    bpxe4.f139690d = e3;
                                    long j3 = abvc2.f58512b;
                                    bpxe4.f139687a = i9 | 8;
                                    bpxe4.f139691e = j3;
                                    boolean a6 = abvc2.mo32351a();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = r15;
                                    }
                                    bpxe bpxe5 = (bpxe) bxvd.f164949b;
                                    bpxe5.f139687a |= 16;
                                    bpxe5.f139692f = a6;
                                    bpxe bpxe6 = (bpxe) bxvd.mo74062i();
                                    bxvd da3 = bpxb.f139606R.mo74144da();
                                    long c2 = cema.m137236c();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = r15;
                                    }
                                    bpxb bpxb = (bpxb) da3.f164949b;
                                    int i10 = bpxb.f139625a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                    bpxb.f139625a = i10;
                                    bpxb.f139643s = c2;
                                    bpxe6.getClass();
                                    bpxb.f139628d = bpxe6;
                                    bpxb.f139625a = i10 | 2;
                                    abym.mo32450a("sstate", da3);
                                }
                                if (d4 != 0.0d) {
                                    mo32301a(d4, 5);
                                } else if (z6) {
                                    mo32302a(4);
                                } else {
                                    mo32329l();
                                }
                            }
                        }
                        if (this.f58078n.mo43404a(i)) {
                            absg.m48196c("Failed to update native config.");
                        } else {
                            this.f58062A = bnzb;
                        }
                        if (!z2) {
                            mo32328k();
                        }
                        NativeIndex.nativeOnMaintenance(this.f58078n.f79071b, z6);
                        abvc abvc22 = this.f58073i;
                        nativeGetStorageState = NativeIndex.nativeGetStorageState(this.f58078n.f79071b);
                        if (nativeGetStorageState != null) {
                        }
                        abym abym2 = this.f58083s;
                        double g22 = this.f58078n.mo43412g();
                        a = abym2.mo32451a();
                        i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        if (a) {
                        }
                        if (d4 != 0.0d) {
                        }
                    }
                }
                r15 = 0;
                this.f58067c.mo32995d(new apsu(this.f58066b, this.f58071g, a2, this.f58077m, this.f58085u, this.f58069e));
                if (System.currentTimeMillis() <= (this.f58078n.mo43408d().f133670a * 1000) + ((Long) abzt.f58986f.mo58455c()).longValue()) {
                }
                abvc abvc3 = this.f58073i;
                double g3 = this.f58078n.mo43412g();
                c = abvc3.mo32353c();
                d = abvc3.mo32354d();
                if (c > d) {
                }
                long j4 = Long.MAX_VALUE;
                j4 = Long.MAX_VALUE;
                double d72 = (double) c;
                Double.isNaN(d72);
                j4 = (long) (d72 / (1.0d - d2));
                if (d2 > 0.05d) {
                }
                z = true;
                double min2 = (double) Math.min(d, j4);
                Double.isNaN(min2);
                long j22 = (long) (min2 * 0.7d);
                Object[] objArr2 = new Object[6];
                objArr2[r15] = Long.valueOf(c);
                objArr2[1] = Long.valueOf(d);
                objArr2[2] = Double.valueOf(d3 * 100.0d);
                objArr2[3] = Double.valueOf(100.0d * d2);
                objArr2[4] = Boolean.valueOf(z);
                objArr2[5] = Long.valueOf(j22);
                absg.m48204d("Performing maintenance usage %s budget %s free %.3f%% index free %.3f%% purge? %s target %s", objArr2);
                if (z) {
                }
                d4 = 0.0d;
                if (((Boolean) abzt.f58856X.mo58455c()).booleanValue()) {
                }
                z2 = false;
                if (((Boolean) abzt.f58857Y.mo58455c()).booleanValue()) {
                }
                z3 = false;
                if (acaw.m48797n()) {
                }
                z4 = false;
                i = mo32326i();
                bnzc b22 = bnzi.m110900b();
                abpr = i.f58268h;
                if (abpr != null) {
                }
                String bnzb2 = b22.mo68722a(abpr.mo73642k()).toString();
                boolean z72 = !this.f58062A.equals(bnzb2);
                if (z2) {
                }
                if (this.f58078n.mo43404a(i)) {
                }
                if (!z2) {
                }
                NativeIndex.nativeOnMaintenance(this.f58078n.f79071b, z6);
                abvc abvc222 = this.f58073i;
                nativeGetStorageState = NativeIndex.nativeGetStorageState(this.f58078n.f79071b);
                if (nativeGetStorageState != null) {
                }
                abym abym22 = this.f58083s;
                double g222 = this.f58078n.mo43412g();
                a = abym22.mo32451a();
                i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                if (a) {
                }
                if (d4 != 0.0d) {
                }
            }
        }
        try {
            if (((Boolean) abzt.f58904as.mo58455c()).booleanValue() || ((Boolean) abzt.f58907av.mo58455c()).booleanValue()) {
                abxp a7 = abxp.m48475a(this.f58066b);
                if (((Boolean) abzt.f58904as.mo58455c()).booleanValue()) {
                    a7.mo32414a("errors", 2592000);
                }
                if (((Boolean) abzt.f58907av.mo58455c()).booleanValue()) {
                    a7.mo32414a("user_actions", 7776000);
                }
                abym abym3 = this.f58083s;
                if (((Boolean) abzt.f58992l.mo58455c()).booleanValue() && abym3.mo32452a(cema.m137236c())) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    abuw h = this.f58078n.mo43413h();
                    if (h != null) {
                        SparseArray sparseArray = new SparseArray();
                        bxwc bxwc = h.f58493a;
                        int size2 = bxwc.size();
                        int i11 = 0;
                        boolean z8 = r15;
                        while (i11 < size2) {
                            abuv abuv = (abuv) bxwc.get(i11);
                            sparseArray.put(abuv.f58485a, abuv);
                            i11++;
                            i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                            z8 = false;
                        }
                        bpwv bpwv = (bpwv) bpww.f139580b.mo74144da();
                        abzo a8 = mo32298a();
                        synchronized (((abzm) a8).mo32525a()) {
                            arrayList = new ArrayList(((abzm) a8).f58817f.size());
                            for (abss abss : ((abzm) a8).f58817f.values()) {
                                arrayList.add(abss);
                            }
                        }
                        int size3 = arrayList.size();
                        int i12 = 0;
                        boolean z9 = z8;
                        while (i12 < size3) {
                            abss abss2 = (abss) arrayList.get(i12);
                            absy absy = abss2.f58158c;
                            if (absy == null) {
                                absy = absy.f58176h;
                            }
                            int a9 = absx.m48236a(absy.f58180c);
                            if (a9 == 0) {
                                z5 = false;
                            } else {
                                z5 = a9 != 1;
                            }
                            absr absr = abss2.f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            abuv abuv2 = (abuv) sparseArray.get(absr.f58137b);
                            if (!((Boolean) acaw.f59395o.mo58455c()).booleanValue()) {
                                if (abuv2 != null) {
                                    if (z5) {
                                    }
                                }
                                i12++;
                                i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                z9 = false;
                            }
                            bxvd da4 = bpyl.f139877i.mo74144da();
                            absr absr2 = abss2.f58157b;
                            if (absr2 == null) {
                                absr2 = absr.f58134s;
                            }
                            String str3 = absr2.f58140e;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = z9;
                            }
                            bpyl bpyl = (bpyl) da4.f164949b;
                            str3.getClass();
                            int i13 = bpyl.f139879a | 16;
                            bpyl.f139879a = i13;
                            bpyl.f139884f = str3;
                            int i14 = i13 | 64;
                            bpyl.f139879a = i14;
                            bpyl.f139886h = z5;
                            if (abuv2 != null) {
                                int i15 = abuv2.f58486b;
                                int i16 = i14 | 1;
                                bpyl.f139879a = i16;
                                bpyl.f139880b = i15;
                                int i17 = abuv2.f58487c;
                                int i18 = i16 | 4;
                                bpyl.f139879a = i18;
                                bpyl.f139882d = i17;
                                long j5 = abuv2.f58488d;
                                int i19 = i18 | 2;
                                bpyl.f139879a = i19;
                                bpyl.f139881c = j5;
                                long j6 = abuv2.f58489e;
                                bpyl.f139879a = i19 | 8;
                                bpyl.f139883e = j6;
                            }
                            absr absr3 = abss2.f58157b;
                            if (absr3 == null) {
                                absr3 = absr.f58134s;
                            }
                            String a10 = acww.m49914a(absr3);
                            if (a10 != null) {
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bpyl bpyl2 = (bpyl) da4.f164949b;
                                a10.getClass();
                                bpyl2.f139879a |= 32;
                                bpyl2.f139885g = a10;
                            }
                            bpwv.mo68991a(da4);
                            i12++;
                            i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                            z9 = false;
                        }
                        abym abym4 = this.f58083s;
                        bpww bpww = (bpww) bpwv.mo74062i();
                        bxvd da5 = bpxb.f139606R.mo74144da();
                        long c3 = cema.m137236c();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = z9;
                        }
                        bpxb bpxb2 = (bpxb) da5.f164949b;
                        int i20 = bpxb2.f139625a | i2;
                        bpxb2.f139625a = i20;
                        bpxb2.f139643s = c3;
                        bpww.getClass();
                        bpxb2.f139633i = bpww;
                        bpxb2.f139625a = i20 | 64;
                        abym4.mo32450a("cstats", da5);
                    } else {
                        absg.m48191b("Failed to get usage stats for logging.");
                    }
                    mo32307a(bpzm.CORPUS_STATS_CALCULATION, elapsedRealtime);
                    return;
                }
            }
            abym abym32 = this.f58083s;
            if (((Boolean) abzt.f58992l.mo58455c()).booleanValue()) {
            }
        } catch (SQLiteException e4) {
            mo32331n().mo32456a("IndexManager doMaintenanceInternal", e4, cema.m137239f());
        }
    }

    /* renamed from: n */
    public final abyp mo32331n() {
        return new abyp(this.f58066b);
    }

    /* renamed from: o */
    public final void mo32332o() {
        this.f58070f.acquireUninterruptibly();
        acpl acpl = this.f58067c;
        synchronized (acpl.f60418a) {
            acpl.mo32988a();
            acpl.f60423f++;
        }
        acpl.f60422e.block();
        synchronized (acpl.f60418a) {
            acpl.f60423f--;
            acpl.mo32988a();
        }
        this.f58067c.mo32995d(new abro(this, bqbd.DESTROY_INDEX_MANAGER));
    }

    /* renamed from: c */
    public final boolean mo32319c() {
        boolean z;
        if (this.f58067c.mo32991a(2) || this.f58070f.availablePermits() == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        return this.f58078n != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32321d(String str) {
        absg.m48184a(str.length() == 0 ? new String("Checking if upgrade is available for mdd group = ") : "Checking if upgrade is available for mdd group = ".concat(str));
        return this.f58072h.mo32339a(str);
    }

    /* renamed from: e */
    public final void mo32322e() {
        if (!mo32320d()) {
            throw new acas("Not initialized");
        }
    }

    /* renamed from: a */
    private final void m48115a(bomn bomn) {
        HashSet<abyv> hashSet;
        char c = 2;
        this.f58067c.mo32992b(2);
        switch (bomn.f133676b) {
            case 0:
                break;
            case 1:
                c = 3;
                break;
            case 2:
                c = 4;
                break;
            case 3:
                c = 5;
                break;
            case 4:
                c = 6;
                break;
            case 5:
                c = 7;
                break;
            case 6:
                c = 8;
                break;
            case 7:
                c = 9;
                break;
            case 8:
                c = 10;
                break;
            case 9:
                c = 11;
                break;
            case 10:
                c = 12;
                break;
            case 11:
                c = 13;
                break;
            case 12:
                c = 14;
                break;
            case 13:
                c = 15;
                break;
            case 14:
                c = 16;
                break;
            case 15:
                c = 17;
                break;
            case 16:
                c = 18;
                break;
            case 17:
                c = 19;
                break;
            case 18:
                c = 20;
                break;
            case 19:
                c = 21;
                break;
            default:
                c = 0;
                break;
        }
        if (c != 0 && c == 3) {
            abzm b = mo32314b();
            synchronized (b.mo32525a()) {
                acam acam = b.f58813b;
                HashSet<String> hashSet2 = new HashSet();
                for (Map.Entry<String, ?> entry : ((acan) acam).f59109a.getAll().entrySet()) {
                    if (entry.getKey().startsWith("corpuskey:")) {
                        absy absy = ((abss) acky.m49358a((String) entry.getValue(), (bxxk) abss.f58154d.mo74142c(7))).f58158c;
                        if (absy == null) {
                            absy = absy.f58176h;
                        }
                        int a = absx.m48236a(absy.f58180c);
                        if (a != 0 && a == 3) {
                            hashSet2.add(entry.getKey());
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    SharedPreferences.Editor edit = ((acan) acam).f59109a.edit();
                    for (String str : hashSet2) {
                        edit.remove(str);
                    }
                    if (!edit.commit()) {
                        b.f58816e.mo32447a("metadata_union_compact_err");
                    }
                }
                b.f58817f.clear();
                for (abyv abyv : b.f58814c.mo32500a()) {
                    for (acak acak : abyv.mo32462a()) {
                        abyv.mo32464a(acak);
                    }
                }
                for (abss abss : b.f58813b.mo32588a()) {
                    b.mo32538b(b.mo32521a(abss));
                }
                b.f58818g = false;
            }
            Set a2 = this.f58077m.mo32500a();
            abyx abyx = this.f58077m;
            synchronized (abyx.f58773b) {
                hashSet = new HashSet(abyx.f58774c.values());
            }
            hashSet.removeAll(a2);
            for (abyv abyv2 : hashSet) {
                abyv2.mo32482k();
            }
            if (bomn.f133677c > 0) {
                this.f58083s.mo32447a("compaction_with_errors");
            }
            this.f58083s.mo32439a(bomn);
            return;
        }
        absg.m48191b("Compaction failed");
        this.f58083s.mo32447a("compaction_failed");
        this.f58083s.mo32439a(bomn);
    }

    /* renamed from: b */
    public final abzm mo32314b() {
        return this.f58074j.mo32517a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long
     arg types: [int, int]
     candidates:
      com.google.android.gms.icing.nativeindex.NativeIndex.a(java.lang.String[], abud):abuh
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, long):bqaw
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long */
    /* renamed from: b */
    public final CorpusStatus mo32315b(abyy abyy, String str, String str2) {
        abzo a = mo32298a();
        synchronized (a.mo32525a()) {
            Set a2 = a.mo32528a(abyy, new String[]{str}, false, str2);
            if (!a2.isEmpty()) {
                abss b = a.mo32534b((acak) a2.iterator().next());
                Bundle bundle = new Bundle();
                absy absy = b.f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                for (absu absu : absy.f58179b) {
                    bundle.putInt(absu.f58168b, absu.f58169c);
                }
                NativeIndex nativeIndex = this.f58078n;
                absr absr = b.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                long a3 = nativeIndex.mo43391a(absr.f58137b, false);
                NativeIndex nativeIndex2 = this.f58078n;
                absr absr2 = b.f58157b;
                if (absr2 == null) {
                    absr2 = absr.f58134s;
                }
                long a4 = nativeIndex2.mo43391a(absr2.f58137b, true);
                absr absr3 = b.f58157b;
                if (absr3 == null) {
                    absr3 = absr.f58134s;
                }
                String str3 = absr3.f58139d;
                absy absy2 = b.f58158c;
                if (absy2 == null) {
                    absy2 = absy.f58176h;
                }
                CorpusStatus corpusStatus = new CorpusStatus(true, a3, a4, 0, bundle, str3, absy2.f58184g);
                return corpusStatus;
            }
            CorpusStatus corpusStatus2 = new CorpusStatus(false, 0, 0, 0, null, null, null);
            return corpusStatus2;
        }
    }

    /* renamed from: b */
    public final String mo32316b(String str, String str2) {
        absg.m48186a("handleCorpusDataCleared package:%s, corpus:%s", str, str2);
        abyv d = this.f58077m.mo32506d(str);
        if (d != null) {
            try {
                mo32305a(d, str2);
                return null;
            } catch (acaq | acat e) {
                return String.format("handleCorpusDataCleared failed: %s", e);
            }
        } else {
            return String.format("handleCorpusDataCleared %s: not a known client.", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0515, code lost:
        if (r7 != false) goto L_0x0517;
     */
    /* renamed from: a */
    public final absr mo32296a(abyy abyy, abyv abyv, boolean z, abzr abzr) {
        int a;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        abrv abrv = this;
        abyy abyy2 = abyy;
        abyv abyv2 = abyv;
        abzr abzr2 = abzr;
        abrv.f58067c.mo32992b(2);
        if (!abyv.mo32474c()) {
            if (!((absr) abzr.mo32560c()).f58141f.isEmpty()) {
                Context context = abrv.f58066b;
                Uri parse = Uri.parse(((absr) abzr.mo32560c()).f58141f);
                String authority = parse.getAuthority();
                if (authority != null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
                    if (resolveContentProvider == null) {
                        String valueOf = String.valueOf(parse);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb.append("ContentProvider ");
                        sb.append(valueOf);
                        sb.append(" does not exist");
                        throw new acaq(sb.toString());
                    } else if (!"com.google.android.gms.icing.indexapi".equals(parse.getAuthority()) || !"com.google.android.gms".equals(resolveContentProvider.applicationInfo.packageName)) {
                        if (!abyy2.f58776b && abyy2.f58775a != resolveContentProvider.applicationInfo.uid) {
                            String valueOf2 = String.valueOf(parse);
                            String authority2 = parse.getAuthority();
                            int i = resolveContentProvider.applicationInfo.uid;
                            int i2 = abyy2.f58775a;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 82 + String.valueOf(authority2).length());
                            sb2.append("ContentProvider ");
                            sb2.append(valueOf2);
                            sb2.append(" authority ");
                            sb2.append(authority2);
                            sb2.append(" uid ");
                            sb2.append(i);
                            sb2.append(" does not match calling uid ");
                            sb2.append(i2);
                            throw new SecurityException(sb2.toString());
                        } else if (!abyy2.f58776b) {
                            String str = resolveContentProvider.applicationInfo.packageName;
                            if (!rfy.m33545a(context, abyy2.f58775a, str)) {
                                String valueOf3 = String.valueOf(parse);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 66 + String.valueOf(str).length());
                                sb3.append("ContentProvider ");
                                sb3.append(valueOf3);
                                sb3.append(" package name ");
                                sb3.append(str);
                                sb3.append(" does not match client package names");
                                throw new SecurityException(sb3.toString());
                            }
                        }
                    }
                } else {
                    throw new acaq("Content Provider uri authority is empty");
                }
            }
            int b = abyv.mo32471b(z);
            if (b == 2) {
                absg.m48197c("App %s registering with different sigs, clearing old corpora", abyv2.f58761b);
                abrv.mo32312a(abyv2);
                abrv.mo32310a(abyv2.f58761b);
                b = abyv.mo32471b(z);
            }
            if (b == 0) {
                abzm b2 = mo32314b();
                if (abzr.mo32553a() == 2) {
                    bnre i3 = b2.mo32524a(abyv2).listIterator();
                    while (i3.hasNext()) {
                        acak acak = (acak) i3.next();
                        abzr c = b2.mo32540c(acak);
                        if (c != null && c.mo32553a() == 1) {
                            absr absr = ((abss) c.mo32560c()).f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            if (!abzm.m48658f(absr)) {
                                absr absr2 = ((abss) c.mo32560c()).f58157b;
                                if (absr2 == null) {
                                    absr2 = absr.f58134s;
                                }
                                if (!abzm.m48657e(absr2)) {
                                    absg.m48198c("Removing api-based corpus %s for %s", acak.mo32584b(), abyv2.f58761b);
                                    abrv.mo32313a(acak, abyv2);
                                }
                            }
                        }
                    }
                }
                acak acak2 = new acak(abyv2.f58761b, ((absr) abzr.mo32560c()).f58138c);
                abzr e = b2.mo32545e(acak2);
                if (e == null) {
                    String str2 = ((absr) abzr.mo32560c()).f58138c;
                    synchronized (b2.mo32525a()) {
                        for (abyv abyv3 : b2.f58814c.mo32502b(abyy2)) {
                            bngx a2 = b2.mo32524a(abyv3);
                            if (!a2.isEmpty()) {
                                if (a2.contains(new acak(abyv3.f58761b, str2))) {
                                    String str3 = ((absr) abzr.mo32560c()).f58138c;
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 59);
                                    sb4.append("Corpus ");
                                    sb4.append(str3);
                                    sb4.append(" already exists in a different package from this uid");
                                    throw new acaq(sb4.toString());
                                }
                            }
                        }
                    }
                } else if (e.mo32558a(abzr2)) {
                    absy f = b2.mo32547f(acak2);
                    if (f != null && ((a = absx.m48236a(f.f58180c)) == 0 || a == 1)) {
                        absr absr3 = (absr) e.mo32560c();
                        absr absr4 = (absr) abzr.mo32560c();
                        int i4 = 5;
                        bxvd bxvd = (bxvd) absr3.mo74142c(5);
                        bxvd.mo73625a((bxvk) absr3);
                        if (e.mo32553a() != abzr.mo32553a()) {
                            int a3 = abzr.mo32553a();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            absr absr5 = (absr) bxvd.f164949b;
                            absr absr6 = absr.f58134s;
                            absr5.f58136a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            absr5.f58147l = a3;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (absr3.f58138c.equals(absr4.f58138c) && absr3.f58139d.equals(absr4.f58139d) && absr3.f58140e.equals(absr4.f58140e) && absr3.f58141f.equals(absr4.f58141f)) {
                            boolean z6 = absr3.f58142g;
                            boolean z7 = absr4.f58142g;
                            if (z6 != z7) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                absr absr7 = (absr) bxvd.f164949b;
                                absr absr8 = absr.f58134s;
                                absr7.f58136a |= 32;
                                absr7.f58142g = z7;
                                z2 = true;
                            }
                            if (absr3.f58145j.size() == absr4.f58145j.size()) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < absr3.f58145j.size()) {
                                        abqo abqo = (abqo) absr3.f58145j.get(i5);
                                        abqo abqo2 = (abqo) absr4.f58145j.get(i5);
                                        bxvd bxvd2 = (bxvd) abqo.mo74142c(i4);
                                        bxvd2.mo73625a((bxvk) abqo);
                                        if (!abqo.f57978b.equals(abqo2.f57978b) || abqo.f57979c != abqo2.f57979c) {
                                            break;
                                        }
                                        abql a4 = abql.m48076a(abqo.f57980d);
                                        if (a4 == null) {
                                            a4 = abql.TOKENIZER_TEXT;
                                        }
                                        abql a5 = abql.m48076a(abqo2.f57980d);
                                        if (a5 == null) {
                                            a5 = abql.TOKENIZER_TEXT;
                                        }
                                        if (a4 != a5 || abqo.f57982f != abqo2.f57982f) {
                                            break;
                                        }
                                        boolean z8 = z2;
                                        if (!abzm.m48651a(new bxvv(abqo.f57984h, abqo.f57974i)).equals(abzm.m48651a(new bxvv(abqo2.f57984h, abqo.f57974i))) || abqo.f57986k != abqo2.f57986k || abqo.f57987l != abqo2.f57987l) {
                                            break;
                                        }
                                        int a6 = abqh.m48072a(abqo.f57990o);
                                        if (a6 == 0) {
                                            a6 = 1;
                                        }
                                        int a7 = abqh.m48072a(abqo2.f57990o);
                                        if (a7 == 0) {
                                            a7 = 1;
                                        }
                                        if (a6 == a7) {
                                            int a8 = abqj.m48074a(abqo.f57991p);
                                            if (a8 == 0) {
                                                a8 = 1;
                                            }
                                            int a9 = abqj.m48074a(abqo2.f57991p);
                                            if (a9 == 0) {
                                                a9 = 1;
                                            }
                                            if (a8 != a9 || abqo.f57992q != abqo2.f57992q) {
                                                break;
                                            }
                                            if (new bxvv(abqo.f57984h, abqo.f57974i).equals(new bxvv(abqo2.f57984h, abqo.f57974i))) {
                                                z5 = z8;
                                            } else {
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                ((abqo) bxvd2.f164949b).f57984h = bxvk.m124028dc();
                                                bxvd2.mo73948K(new bxvv(abqo2.f57984h, abqo.f57974i));
                                                z5 = true;
                                            }
                                            if (!abqo.f57985j.equals(abqo2.f57985j)) {
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                ((abqo) bxvd2.f164949b).f57985j = bxvk.m124030de();
                                                bxvd2.mo73947J(abqo2.f57985j);
                                                z5 = true;
                                            }
                                            if (!abqo.f57983g.equals(abqo2.f57983g)) {
                                                String str4 = abqo2.f57983g;
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                abqo abqo3 = (abqo) bxvd2.f164949b;
                                                str4.getClass();
                                                abqo3.f57977a |= 32;
                                                abqo3.f57983g = str4;
                                                z5 = true;
                                            }
                                            int i6 = abqo.f57981e;
                                            int i7 = abqo2.f57981e;
                                            if (i6 != i7) {
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                abqo abqo4 = (abqo) bxvd2.f164949b;
                                                abqo4.f57977a |= 8;
                                                abqo4.f57981e = i7;
                                                z5 = true;
                                            }
                                            if (!abqo.f57988m.equals(abqo2.f57988m)) {
                                                String str5 = abqo2.f57988m;
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                abqo abqo5 = (abqo) bxvd2.f164949b;
                                                str5.getClass();
                                                abqo5.f57977a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                abqo5.f57988m = str5;
                                                z5 = true;
                                            }
                                            int i8 = abqo.f57989n;
                                            int i9 = abqo2.f57989n;
                                            if (i8 != i9) {
                                                if (bxvd2.f164950c) {
                                                    bxvd2.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                abqo abqo6 = (abqo) bxvd2.f164949b;
                                                abqo6.f57977a |= 512;
                                                abqo6.f57989n = i9;
                                                z5 = true;
                                            }
                                            if (z2) {
                                                if (bxvd.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd.f164950c = false;
                                                }
                                                absr absr9 = (absr) bxvd.f164949b;
                                                abqo abqo7 = (abqo) bxvd2.mo74062i();
                                                absr absr10 = absr.f58134s;
                                                abqo7.getClass();
                                                absr9.mo32341a();
                                                absr9.f58145j.set(i5, abqo7);
                                            }
                                            i5++;
                                            i4 = 5;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        boolean z9 = z2;
                                        if (absr3.f58146k.equals(absr4.f58146k)) {
                                            z3 = z9;
                                        } else {
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            absr absr11 = absr.f58134s;
                                            ((absr) bxvd.f164949b).f58146k = bxvk.m124030de();
                                            bxvd.mo73949L(absr4.f58146k);
                                            z3 = true;
                                        }
                                        boolean z10 = absr3.f58148m;
                                        boolean z11 = absr4.f58148m;
                                        if (z10 != z11) {
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            absr absr12 = (absr) bxvd.f164949b;
                                            absr absr13 = absr.f58134s;
                                            absr12.f58136a |= 512;
                                            absr12.f58148m = z11;
                                            z3 = true;
                                        }
                                        long j = absr3.f58149n;
                                        long j2 = absr4.f58149n;
                                        if (j != j2) {
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            absr absr14 = (absr) bxvd.f164949b;
                                            absr absr15 = absr.f58134s;
                                            absr14.f58136a |= 1024;
                                            absr14.f58149n = j2;
                                            z3 = true;
                                        }
                                        if (absr3.f58150o.equals(absr4.f58150o) && absr3.f58151p.equals(absr4.f58151p)) {
                                            if (!absr3.f58152q.equals(absr4.f58152q)) {
                                                String str6 = absr4.f58152q;
                                                if (bxvd.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd.f164950c = false;
                                                }
                                                absr absr16 = (absr) bxvd.f164949b;
                                                absr absr17 = absr.f58134s;
                                                str6.getClass();
                                                absr16.f58136a |= 8192;
                                                absr16.f58152q = str6;
                                                z4 = true;
                                            } else {
                                                z4 = z3;
                                            }
                                            int i10 = absr3.f58153r;
                                            int i11 = absr4.f58153r;
                                            if (i10 != i11) {
                                                if (bxvd.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd.f164950c = false;
                                                }
                                                absr absr18 = (absr) bxvd.f164949b;
                                                absr absr19 = absr.f58134s;
                                                absr18.f58136a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                absr18.f58153r = i11;
                                            }
                                            b2.mo32529a(acak2, abzr2.mo32554a((absr) bxvd.mo74062i()));
                                            return (absr) e.mo32560c();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    absg.m48184a("Corpus registration info changed, replacing corpus");
                    abrv = this;
                    if (!abrv.mo32313a(acak2, abyv2)) {
                        throw new acat("Could not unregister old corpus");
                    }
                } else {
                    String d = abzr.mo32561d();
                    String d2 = e.mo32561d();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(d).length() + 38 + String.valueOf(d2).length());
                    sb5.append("CorpusConfig: cannot ");
                    sb5.append(d);
                    sb5.append(" when previously ");
                    sb5.append(d2);
                    throw new acaq(sb5.toString());
                }
                return abrv.m48114a(acak2, abzr2);
            }
            abrv.f58083s.mo32447a("register_auth_fail");
            String str7 = abyv2.f58761b;
            String a10 = abyv.m48584a(b);
            StringBuilder sb6 = new StringBuilder(String.valueOf(str7).length() + 26 + a10.length());
            sb6.append("Package ");
            sb6.append(str7);
            sb6.append(" cannot register: ");
            sb6.append(a10);
            throw new acat(sb6.toString());
        }
        String str8 = abyv2.f58761b;
        StringBuilder sb7 = new StringBuilder(String.valueOf(str8).length() + 20);
        sb7.append("Package ");
        sb7.append(str8);
        sb7.append(" is blocked.");
        throw new acat(sb7.toString());
    }

    /* renamed from: b */
    public final void mo32317b(String str) {
        this.f58067c.mo32992b(2);
        m48117e(str);
        this.f58077m.mo32505c(str).mo32475d();
        mo32318c(str);
    }

    /* renamed from: a */
    public final absr mo32297a(abyy abyy, String str, String str2) {
        abzo a = mo32298a();
        synchronized (a.mo32525a()) {
            Set a2 = a.mo32528a(abyy, new String[]{str}, false, str2);
            if (a2.isEmpty()) {
                return null;
            }
            absr d = a.mo32543d((acak) a2.iterator().next());
            return d;
        }
    }

    /* renamed from: a */
    public final acpw mo32299a(boolean z) {
        abrm abrm = new abrm(this, bqbd.INIT_INDEX_MANAGER, z);
        this.f58070f.acquireUninterruptibly();
        try {
            this.f58067c.mo32995d(abrm);
            return abrm;
        } catch (IllegalStateException e) {
            absg.m48195b(e, "Unable to initialize index manager due to start service failure: %s", e.getMessage());
            this.f58083s.mo32447a("init_index_manager_svc_failed");
            this.f58070f.release();
            return new abrn();
        }
    }

    /* renamed from: a */
    public final List mo32300a(abyy abyy, GlobalSearchQuerySpecification globalSearchQuerySpecification, boolean z) {
        List<absr> a = mo32298a().mo32527a(abyy, globalSearchQuerySpecification, z);
        if (abyy.mo32512a()) {
            return a;
        }
        Set<abyv> b = this.f58077m.mo32502b(abyy);
        HashSet hashSet = new HashSet(b.size());
        for (abyv abyv : b) {
            hashSet.add(abyv.f58761b);
        }
        ArrayList arrayList = new ArrayList();
        for (absr absr : a) {
            if (hashSet.contains(absr.f58140e)) {
                arrayList.add(absr);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo32301a(double d, int i) {
        long[] jArr;
        int[] iArr;
        this.f58067c.mo32992b(2);
        absg.m48204d("Starting purge with target free %.3f%% min disk %.3f%% min index %.3f%%", Double.valueOf(d * 100.0d), Double.valueOf(this.f58073i.mo32352b() * 100.0d), Double.valueOf(this.f58078n.mo43412g() * 100.0d));
        NativeIndex nativeIndex = this.f58078n;
        int i2 = abzm.f58810a;
        abtj a = abzu.m48730a();
        abzm b = mo32314b();
        synchronized (b.mo32525a()) {
            sdo.m34974b(Thread.holdsLock(b.mo32525a()));
            int i3 = -1;
            for (abss abss : b.f58817f.values()) {
                absr absr = abss.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                int i4 = absr.f58137b;
                if (i4 > i3) {
                    i3 = i4;
                }
            }
            jArr = new long[(i3 + 1)];
            CRC32 crc32 = new CRC32();
            for (abss abss2 : b.f58817f.values()) {
                crc32.reset();
                try {
                    absr absr2 = abss2.f58157b;
                    if (absr2 == null) {
                        absr2 = absr.f58134s;
                    }
                    crc32.update(absr2.f58140e.getBytes("UTF-8"));
                    absr absr3 = abss2.f58157b;
                    if (absr3 == null) {
                        absr3 = absr.f58134s;
                    }
                    jArr[absr3.f58137b] = crc32.getValue();
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException("CannotHappenException");
                }
            }
        }
        abzm b2 = mo32314b();
        synchronized (b2.mo32525a()) {
            Collection<abss> values = b2.f58817f.values();
            int i5 = 0;
            for (abss abss3 : values) {
                absr absr4 = abss3.f58157b;
                if (absr4 == null) {
                    absr4 = absr.f58134s;
                }
                if (!absr4.f58142g) {
                    i5++;
                }
            }
            iArr = new int[i5];
            int i6 = 0;
            for (abss abss4 : values) {
                absr absr5 = abss4.f58157b;
                if (absr5 == null) {
                    absr5 = absr.f58134s;
                }
                if (!absr5.f58142g) {
                    iArr[i6] = absr5.f58137b;
                    i6++;
                }
            }
        }
        bomn a2 = nativeIndex.mo43396a(d, i2, a, jArr, iArr, mo32314b().mo32546e());
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bomn bomn = bomn.f133673d;
        ((bomn) bxvd.f164949b).f133675a = bomm.m111339a(i);
        m48115a((bomn) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo32302a(int i) {
        this.f58067c.mo32992b(2);
        absg.m48198c("Starting compaction min disk %.3f%% min index %.3f%%", Double.valueOf(this.f58073i.mo32352b() * 100.0d), Double.valueOf(this.f58078n.mo43412g() * 100.0d));
        bomn a = this.f58078n.mo43396a(0.0d, abzm.f58810a, abzu.m48730a(), null, null, mo32314b().mo32546e());
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bomn bomn = bomn.f133673d;
        ((bomn) bxvd.f164949b).f133675a = bomm.m111339a(i);
        m48115a((bomn) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo32303a(abru abru, abtk abtk) {
        if (abtk.f58249b) {
            this.f58083s.mo32447a("init_docstore_recovery");
            abru.f58059b = true;
        }
    }

    /* renamed from: a */
    public final void mo32304a(abtk abtk) {
        if ((abtk.f58248a & 2) != 0) {
            bpxl bpxl = abtk.f58250c;
            if (bpxl == null) {
                bpxl = bpxl.f139729c;
            }
            int a = bpzw.m112454a(bpxl.f139731a);
            if (a == 0 || a != 3) {
                this.f58083s.mo32447a("init_full_lost");
            }
            bpxl bpxl2 = abtk.f58250c;
            if (bpxl2 == null) {
                bpxl2 = bpxl.f139729c;
            }
            int a2 = bpzw.m112454a(bpxl2.f139732b);
            if (a2 == 0 || a2 != 3) {
                this.f58083s.mo32447a("init_lite_lost");
            }
            abym abym = this.f58083s;
            bpxl bpxl3 = abtk.f58250c;
            if (bpxl3 == null) {
                bpxl3 = bpxl.f139729c;
            }
            long j = cema.f182934a.mo6606a().mo79308j();
            if (abym.mo32452a(j)) {
                bxvd da = bpxb.f139606R.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxb bpxb = (bpxb) da.f164949b;
                bpxl3.getClass();
                bpxb.f139650z = bpxl3;
                bpxb.f139625a |= 268435456;
                abym.mo32438a(6007, da, j);
            }
        }
    }

    /* renamed from: a */
    public final void mo32305a(abyv abyv, String str) {
        abzm b = mo32314b();
        acak acak = new acak(abyv.f58761b, str);
        abzr e = b.mo32545e(acak);
        if (e != null) {
            mo32313a(acak, abyv);
            if (!NativeIndex.nativeClearUsageReportDataForIdAndUri(this.f58078n.f79071b, ((absr) e.mo32560c()).f58144i, NativeIndex.m66681a(""))) {
                String valueOf = String.valueOf(str);
                throw new acat(valueOf.length() == 0 ? new String("Failed to clear usage report data for corpus ") : "Failed to clear usage report data for corpus ".concat(valueOf));
            } else {
                m48114a(acak, e);
            }
        } else {
            String str2 = abyv.f58761b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(str2).length());
            sb.append("No CorpusConfig for ");
            sb.append(str);
            sb.append(" of ");
            sb.append(str2);
            throw new acaq(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo32306a(acqv acqv) {
        if (!mo32320d()) {
            absg.m48191b("Couldn't handle gcm msg due to initialization failure");
        } else {
            this.f58067c.mo32995d(new abqz(this, bqbd.HANDLE_GCM_MESSAGE, acqv));
        }
    }

    /* renamed from: a */
    public final void mo32307a(bpzm bpzm, long j) {
        this.f58083s.mo32445a(bpzm, (int) (SystemClock.elapsedRealtime() - j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32308a(String str) {
        this.f58067c.mo32992b(2);
        m48117e(str);
    }

    /* renamed from: a */
    public final void mo32309a(String str, acqu acqu) {
        String str2;
        if (rfy.m33543a()) {
            str2 = "<redacted>";
        } else {
            str2 = str;
        }
        if (!((Boolean) abzt.f58959bu.mo58455c()).booleanValue() && acqu.f60546b.size() > 0) {
            absg.m48185a("Notifying GSA of setting change for account:%s changed.", str2);
            int[] iArr = new int[acqu.f60546b.size()];
            for (int i = 0; i < acqu.f60546b.size(); i++) {
                iArr[i] = ((bxsi) acqu.f60546b.get(i)).f164684b;
            }
            sbv.m34875a(this.f58066b, str, iArr);
        }
    }

    /* renamed from: a */
    public final void mo32286a(String str, String str2) {
        String b = mo32316b(str, str2);
        if (b != null) {
            absg.m48191b(b);
        }
    }

    /* renamed from: a */
    public final void mo32287a(Account[] accountArr) {
        boolean z;
        this.f58067c.mo32992b(2);
        abzq abzq = new abzq(this.f58077m, this.f58064C, accountArr);
        if (accountArr != null) {
            Set h = this.f58071g.mo33034h();
            boolean z2 = false;
            for (Account account : accountArr) {
                if (!h.remove(account)) {
                    z2 = true;
                }
            }
            z = z2 || !h.isEmpty();
            abzq.f58825b = z;
        } else {
            z = false;
        }
        abzq.mo32550a(false);
        if (z) {
            acrl acrl = this.f58071g;
            bxvd da = abpe.f57836b.mo74144da();
            for (Account account2 : accountArr) {
                bxvd da2 = abpd.f57831d.mo74144da();
                String str = account2.name;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                abpd abpd = (abpd) da2.f164949b;
                str.getClass();
                abpd.f57833a |= 1;
                abpd.f57834b = str;
                String str2 = account2.type;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                abpd abpd2 = (abpd) da2.f164949b;
                str2.getClass();
                abpd2.f57833a |= 2;
                abpd2.f57835c = str2;
                abpd abpd3 = (abpd) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abpe abpe = (abpe) da.f164949b;
                abpd3.getClass();
                if (!abpe.f57838a.mo73666a()) {
                    abpe.f57838a = bxvk.m124021a(abpe.f57838a);
                }
                abpe.f57838a.add(abpd3);
            }
            acrl.f60620b.edit().putString("known-accounts", Base64.encodeToString(((abpe) da.mo74062i()).mo73642k(), 0)).apply();
        }
    }

    /* renamed from: a */
    public final void mo32310a(String... strArr) {
        acpl acpl = this.f58067c;
        abrr abrr = new abrr(this, bqbd.APP_INDEXING_HANDLE_PACKAGE_REMOVAL, strArr);
        abrr.f58050a = this;
        acpl.mo32995d(abrr);
    }

    /* renamed from: a */
    public final boolean mo32311a(absr absr, String str) {
        if (!abzm.m48658f(absr)) {
            return false;
        }
        return NativeIndex.nativeClearUsageReportDataForIdAndUri(this.f58078n.f79071b, absr.f58144i, NativeIndex.m66681a(str)) && this.f58078n.mo43400a(0, absr.f58137b, str) == bqaw.f140179a;
    }

    /* renamed from: a */
    public final boolean mo32312a(abyv abyv) {
        this.f58067c.mo32992b(2);
        boolean z = true;
        if (this.f58077m.mo32503b(abyv.f58761b)) {
            if (((Boolean) abzt.f58957bs.mo58455c()).booleanValue() && acth.m49837a()) {
                try {
                    this.f58066b.getPackageManager().getApplicationInfo("com.google.android.gms.apitest", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    absg.m48195b(e, "Could not get app info for %s", "com.google.android.gms.apitest");
                }
            }
            this.f58085u.mo32594b();
        }
        bngx a = mo32314b().mo32524a(abyv);
        int size = a.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 = mo32313a((acak) a.get(i), abyv) || z2;
        }
        try {
            if (((Boolean) abzt.f58905at.mo58455c()).booleanValue() || ((Boolean) abzt.f58908aw.mo58455c()).booleanValue()) {
                abxp.m48475a(this.f58066b).mo32413a(abyv.f58761b);
            }
        } catch (SQLiteException e2) {
            mo32331n().mo32456a("IndexManager", e2, cema.m137239f());
        }
        abyx abyx = this.f58077m;
        synchronized (abyx.f58773b) {
            if (abyv != null) {
                if (abyv != abyx.f58774c.get(abyv.f58761b)) {
                    z = false;
                }
                sdo.m34970a(z);
                synchronized (abyv.f58764e) {
                    abyv.f58765f.clear();
                }
                try {
                    abyv.mo32463a(abzr.f58828a);
                    abyv.mo32482k();
                } catch (acaq e3) {
                    throw new acas(e3);
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final boolean mo32288a(abyy abyy, abzr abzr) {
        this.f58067c.mo32992b(2);
        boolean a = abww.m48413a(((RegisterCorpusInfo) abzr.mo32560c()).f9635a);
        abyv a2 = this.f58077m.mo32495a(abyy);
        if (a) {
            absg.m48185a("Set global search info for package %s.", a2.f58761b);
            a2.mo32475d();
            a2.mo32466a(System.currentTimeMillis());
        }
        acbf acbf = new acbf(a2.f58761b, (RegisterCorpusInfo) abzr.mo32560c(), a ? this.f58066b.getResources() : a2.mo32483l());
        acbf.mo32603a();
        absr a3 = abzm.m48649a(a2, (RegisterCorpusInfo) abzr.mo32560c());
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((bxvk) a3);
        List b = acbf.mo32604b();
        if (b != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            absr absr = absr.f58134s;
            ((absr) bxvd.f164949b).f58146k = bxvk.m124030de();
            bxvd.mo73949L(b);
        }
        absr d = mo32314b().mo32543d(new acak(a2.f58761b, ((RegisterCorpusInfo) abzr.mo32560c()).f9635a));
        absr a4 = mo32296a(abyy, a2, !a, abzr.mo32554a((absr) bxvd.mo74062i()));
        if (d == null || d.f58137b == a4.f58137b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo32313a(acak acak, abyv abyv) {
        boolean z;
        boolean z2;
        this.f58067c.mo32992b(2);
        absg.m48198c("Removing corpus key %s for package %s", acak.mo32584b(), abyv.f58761b);
        abzm b = mo32314b();
        abss b2 = b.mo32534b(acak);
        if (b2 == null || !abyv.mo32473b(acak)) {
            return true;
        }
        abyh abyh = this.f58082r;
        String str = abyv.f58761b;
        absr absr = b2.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        String str2 = absr.f58138c;
        if (cemw.m137395c() && !abyh.mo32432a()) {
            synchronized (abyh.f58728b) {
                bxvd da = abqb.f57936c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abqb abqb = (abqb) da.f164949b;
                str.getClass();
                abqb.f57938a = str;
                str2.getClass();
                abqb.f57939b = str2;
                abqb abqb2 = (abqb) da.mo74062i();
                if (abyh.f58730d.mo67271d(abqb2)) {
                    bndu r = bndu.m109109r();
                    for (abqa abqa : ((bnci) abyh.f58730d).mo67127c(abqb2)) {
                        r.mo67268a(abqa.f57933b, abqa);
                    }
                    for (abqa abqa2 : r.mo67317p()) {
                        abyh.mo32435b(abqa2.f57933b, abqa2.f57932a);
                        abyh.mo32430a(abqa2);
                    }
                }
            }
        }
        synchronized (b.mo32525a()) {
            abss abss = (abss) b.f58817f.get(acak);
            if (abss != null) {
                absy absy = abss.f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                int a = absx.m48236a(absy.f58180c);
                if (a != 0) {
                    if (a != 1) {
                        z = true;
                    }
                }
                bxvd bxvd = (bxvd) abss.mo74142c(5);
                bxvd.mo73625a((bxvk) abss);
                absy absy2 = abss.f58158c;
                if (absy2 == null) {
                    absy2 = absy.f58176h;
                }
                bxvd bxvd2 = (bxvd) absy2.mo74142c(5);
                bxvd2.mo73625a((bxvk) absy2);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                absy absy3 = (absy) bxvd2.f164949b;
                absy3.f58180c = 1;
                absy3.f58178a |= 4;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abss abss2 = (abss) bxvd.f164949b;
                absy absy4 = (absy) bxvd2.mo74062i();
                absy4.getClass();
                abss2.f58158c = absy4;
                abss2.f58156a |= 2;
                abss abss3 = (abss) bxvd.mo74062i();
                b.f58817f.put(acak, abss3);
                z = b.f58813b.mo32589a(abss3);
            } else {
                z = true;
            }
        }
        if (!z) {
            absg.m48192b("Failed to start deactivating corpus key %s", acak.mo32584b());
            this.f58083s.mo32447a("start_deactivate_corpus_failed");
            return false;
        }
        NativeIndex nativeIndex = this.f58078n;
        absr absr2 = b2.f58157b;
        if (absr2 == null) {
            absr2 = absr.f58134s;
        }
        if (NativeIndex.nativeDeleteCorpus(nativeIndex.f79071b, absr2.f58137b)) {
            synchronized (b.mo32525a()) {
                if (abyv.mo32473b(acak)) {
                    abss abss4 = (abss) b.f58817f.get(acak);
                    if (abss4 != null) {
                        absy absy5 = abss4.f58158c;
                        if (absy5 == null) {
                            absy5 = absy.f58176h;
                        }
                        int a2 = absx.m48236a(absy5.f58180c);
                        if (a2 == 0) {
                            z2 = false;
                        } else if (a2 == 2) {
                            abss abss5 = (abss) b.f58817f.remove(acak);
                            if (abss5 == null) {
                                absg.m48192b("Can't find corpus with key %s", acak.mo32584b());
                            } else {
                                absr absr3 = abss5.f58157b;
                                if (absr3 == null) {
                                    absr3 = absr.f58134s;
                                }
                                String str3 = absr3.f58138c;
                                absy absy6 = abss5.f58158c;
                                if (absy6 == null) {
                                    absy6 = absy.f58176h;
                                }
                                int a3 = absx.m48236a(absy6.f58180c);
                                if (a3 != 0) {
                                    if (a3 == 2) {
                                        absg.m48185a("Removing inactive corpus %s", str3);
                                        b.f58818g = true;
                                        abyx abyx = b.f58814c;
                                        absr absr4 = abss5.f58157b;
                                        if (absr4 == null) {
                                            absr4 = absr.f58134s;
                                        }
                                        abyv c = abyx.mo32505c(absr4.f58140e);
                                        c.mo32464a(acak);
                                        c.mo32470b();
                                    }
                                }
                                Object[] objArr = new Object[3];
                                objArr[0] = str3;
                                objArr[1] = 1;
                                absy absy7 = abss5.f58158c;
                                if (absy7 == null) {
                                    absy7 = absy.f58176h;
                                }
                                int a4 = absx.m48236a(absy7.f58180c);
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                objArr[2] = Integer.valueOf(a4 - 1);
                                absg.m48199c("Can't remove corpus %s, not in expected state %s, actual state=%s", objArr);
                            }
                            bxvd bxvd3 = (bxvd) abss4.mo74142c(5);
                            bxvd3.mo73625a((bxvk) abss4);
                            absy absy8 = abss4.f58158c;
                            if (absy8 == null) {
                                absy8 = absy.f58176h;
                            }
                            bxvd bxvd4 = (bxvd) absy8.mo74142c(5);
                            bxvd4.mo73625a((bxvk) absy8);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            absy absy9 = (absy) bxvd4.f164949b;
                            absy9.f58180c = 2;
                            absy9.f58178a |= 4;
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            abss abss6 = (abss) bxvd3.f164949b;
                            absy absy10 = (absy) bxvd4.mo74062i();
                            absy10.getClass();
                            abss6.f58158c = absy10;
                            abss6.f58156a = 2 | abss6.f58156a;
                            abss a5 = b.mo32521a((abss) bxvd3.mo74062i());
                            b.mo32538b(a5);
                            acam acam = b.f58813b;
                            SharedPreferences.Editor edit = ((acan) acam).f59109a.edit();
                            String valueOf = String.valueOf(((acan) acam).mo32590a(acak));
                            edit.remove(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf));
                            String valueOf2 = String.valueOf(((acan) acam).mo32590a(new acak(a5)));
                            edit.putString(valueOf2.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf2), acky.m49362a(a5));
                            z2 = edit.commit();
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    String a6 = acak.mo32583a();
                    String str4 = abyv.f58761b;
                    StringBuilder sb = new StringBuilder(String.valueOf(a6).length() + 27 + String.valueOf(str4).length());
                    sb.append("Key ");
                    sb.append(a6);
                    sb.append(" doesn't exist for pkg ");
                    sb.append(str4);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (z2) {
                return true;
            }
            absg.m48192b("Failed to finish deactivating corpus key %s", acak.mo32584b());
            this.f58083s.mo32447a("finish_deactivate_corpus_failed");
            return false;
        }
        absg.m48192b("Failed to delete corpus key %s", acak.mo32584b());
        this.f58083s.mo32447a("delete_corpus_failed");
        return false;
    }
}

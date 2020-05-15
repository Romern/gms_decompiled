package p000;

import android.accounts.Account;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: aqfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqfs {

    /* renamed from: a */
    static final bnic f85999a = bnic.m109494a("done", "default_packages", "su_files", "settings", "locale", "connection_info", "proxy", "setuid_files", "selinux_status", "sd_card_test", "apps", "logcat", "system_ca_cert_store", "attest", "gmscore", "event_log", "device_state", "carrier_info", "mount_options", "app_dir_wr", "phonesky", "internal_logs", "app_ops", "snet_network_watchlist", "snet_verify_apps_api_usage");

    /* renamed from: b */
    private static final String f86000b = aqfs.class.getSimpleName();

    /* renamed from: c */
    private final Context f86001c;

    /* renamed from: d */
    private final aqfa f86002d;

    /* renamed from: e */
    private final aqfv f86003e;

    private aqfs(Context context, aqfa aqfa) {
        aqfv aqfv = new aqfv(context, aqfa, new aqef(context, aqfa));
        this.f86001c = context;
        this.f86002d = aqfa;
        this.f86003e = aqfv;
    }

    /* renamed from: b */
    public static void m71511b(Context context, Bundle bundle) {
        asfb asfb = new asfb(context, 1, String.valueOf(aqfs.class.getCanonicalName()).concat(":SnetNormal"));
        aqfa aqfa = new aqfa(bundle);
        aqfs aqfs = new aqfs(context, aqfa);
        try {
            asfb.mo49111a(aqfa.f85935b.mo47805a("watchdog_timeout_ms", 120000));
            aqfs.m71513d();
            if (asfb.mo49124e()) {
                asfb.mo49120c();
            }
        } catch (Throwable th) {
            if (asfb.mo49124e()) {
                asfb.mo49120c();
            }
            throw th;
        }
    }

    /* renamed from: d */
    private final void m71513d() {
        if (!cgkt.m145944p()) {
            aqfw aqfw = new aqfw(this.f86001c);
            aqer a = new aqev(this.f86001c, this.f86002d, this.f86003e).mo47802a(aqfw.mo47848a());
            aqeo.m71448a(this.f86001c).mo47797a(a.f85897b);
            aqfw.mo47849a(a.f85896a);
            if (cgkt.m145931c() && aqfw.mo47857c()) {
                new aqev(this.f86001c, this.f86002d, this.f86003e);
                aqeq b = aqev.m71459b(aqfw.f86016a.getLong("snet_event_log_bal_last_timestamp", -1));
                aqei.m71432a(this.f86001c).mo47787a(b.f85895b);
                aqfw.mo47851a("snet_event_log_bal_last_timestamp", b.f85894a);
                return;
            }
            return;
        }
        aqeo a2 = aqeo.m71448a(this.f86001c);
        if (a2.mo47798c()) {
            aqer a3 = new aqev(this.f86001c, this.f86002d, this.f86003e).mo47802a(a2.mo47795a());
            a2.mo47797a(a3.f85897b);
            a2.mo47796a(a3.f85896a);
            a2.mo47799d();
        }
        if (cgkt.m145931c()) {
            aqei a4 = aqei.m71432a(this.f86001c);
            if (!a4.mo47791d()) {
                return;
            }
            if (!a4.mo47789a()) {
                a4.mo47792e();
                return;
            }
            long c = a4.mo47790c();
            new aqev(this.f86001c, this.f86002d, this.f86003e);
            aqeq b2 = aqev.m71459b(c);
            a4.mo47787a(b2.f85895b);
            a4.mo47786a(b2.f85894a);
            a4.mo47792e();
        }
    }

    /* renamed from: e */
    private final void m71514e() {
        if (aqfy.m71555a() || m71522m()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(aqfj.m71485a());
            if (aqfy.m71555a()) {
                aqfa aqfa = this.f86002d;
                ArrayList arrayList2 = new ArrayList();
                String a = aqfa.f85935b.mo47806a("selected_files");
                if (!TextUtils.isEmpty(a)) {
                    arrayList2.addAll(Arrays.asList(a.split(",")));
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    aqff aqff = new aqff();
                    ArrayDeque arrayDeque = new ArrayDeque(arrayList2);
                    while (!arrayDeque.isEmpty()) {
                        String str = (String) arrayDeque.poll();
                        File file = new File(str);
                        if (file.exists()) {
                            aqex aqex = new aqex();
                            aqex.f85917a = str;
                            aqex.f85919c = file.exists();
                            if (file.isFile()) {
                                aqex.f85923g = aqfy.m71560a(file);
                                try {
                                    aqex.f85924h = aqff.mo47816a(str);
                                } catch (aqfe e) {
                                }
                            }
                            try {
                                aqex.f85925i = aqff.mo47815a(file);
                                if (file.isFile()) {
                                    boolean b = aqff.mo47817b(file);
                                    aqex.f85921e = b;
                                    if (b) {
                                        aqex.f85922f = aqff.mo47818c(file);
                                        if (!TextUtils.isEmpty(aqex.f85922f) && !arrayList2.contains(aqex.f85922f)) {
                                            arrayList2.add(aqex.f85922f);
                                            arrayDeque.offer(aqex.f85922f);
                                        }
                                    }
                                }
                            } catch (aqfe e2) {
                            }
                            arrayList3.add(aqex);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
            }
            aqfv aqfv = this.f86003e;
            aqfv.mo47843a();
            if (arrayList.size() != 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aqex aqex2 = (aqex) arrayList.get(i);
                    bxvd da = apzx.f85326m.mo74144da();
                    String str2 = aqex2.f85917a;
                    if (str2 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzx apzx = (apzx) da.f164949b;
                        str2.getClass();
                        apzx.f85328a |= 1;
                        apzx.f85329b = str2;
                    }
                    boolean z = aqex2.f85919c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apzx apzx2 = (apzx) da.f164949b;
                    apzx2.f85328a |= 2;
                    apzx2.f85330c = z;
                    byte[] bArr = aqex2.f85923g;
                    if (bArr != null) {
                        bxtx a2 = bxtx.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzx apzx3 = (apzx) da.f164949b;
                        a2.getClass();
                        apzx3.f85328a |= 4;
                        apzx3.f85331d = a2;
                    }
                    boolean z2 = aqex2.f85924h;
                    apzx apzx4 = (apzx) da.f164949b;
                    int i2 = apzx4.f85328a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    apzx4.f85328a = i2;
                    apzx4.f85337j = z2;
                    aqfd aqfd = aqex2.f85925i;
                    if (aqfd != null) {
                        long j = aqfd.f85943d;
                        int i3 = i2 | 8;
                        apzx4.f85328a = i3;
                        apzx4.f85332e = j;
                        int i4 = aqfd.f85942c;
                        int i5 = i3 | 16;
                        apzx4.f85328a = i5;
                        apzx4.f85333f = i4;
                        int i6 = aqfd.f85941b;
                        int i7 = i5 | 32;
                        apzx4.f85328a = i7;
                        apzx4.f85334g = i6;
                        int i8 = aqfd.f85940a;
                        i2 = i7 | 64;
                        apzx4.f85328a = i2;
                        apzx4.f85335h = i8;
                        String str3 = aqfd.f85944e;
                        if (str3 != null) {
                            str3.getClass();
                            i2 |= 128;
                            apzx4.f85328a = i2;
                            apzx4.f85336i = str3;
                        }
                    }
                    boolean z3 = aqex2.f85921e;
                    int i9 = i2 | 512;
                    apzx4.f85328a = i9;
                    apzx4.f85338k = z3;
                    String str4 = aqex2.f85922f;
                    if (str4 != null) {
                        str4.getClass();
                        apzx4.f85328a = i9 | 1024;
                        apzx4.f85339l = str4;
                    }
                    aqap aqap = aqfv.f86009a;
                    if (aqap.f164950c) {
                        aqap.mo74035c();
                        aqap.f164950c = false;
                    }
                    aqaq aqaq = (aqaq) aqap.f164949b;
                    apzx apzx5 = (apzx) da.mo74062i();
                    aqaq aqaq2 = aqaq.f85424P;
                    apzx5.getClass();
                    if (!aqaq.f85464x.mo73666a()) {
                        aqaq.f85464x = bxvk.m124021a(aqaq.f85464x);
                    }
                    aqaq.f85464x.add(apzx5);
                }
            }
        }
    }

    /* renamed from: f */
    private final void m71515f() {
        aqfc aqfc = new aqfc(this.f86001c);
        aqfv aqfv = this.f86003e;
        ConnectivityManager connectivityManager = (ConnectivityManager) aqfc.f85939a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        aqfb aqfb = new aqfb();
        if (activeNetworkInfo != null) {
            aqfb.f85936a = activeNetworkInfo.getType();
        }
        if (aqfb.f85936a == 0) {
            aqfb.f85938c = ((TelephonyManager) aqfc.f85939a.getSystemService("phone")).getNetworkOperatorName();
        }
        int i = 0;
        for (NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
            int type = networkInfo.getType();
            if (type <= 30) {
                i |= 1 << type;
            }
        }
        aqfb.f85937b = i;
        aqfv.mo47843a();
        bxvd da = apzp.f85276e.mo74144da();
        int a = apzo.m71230a(aqfb.f85936a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        apzp apzp = (apzp) da.f164949b;
        int i2 = a - 1;
        if (a != 0) {
            apzp.f85279b = i2;
            int i3 = apzp.f85278a | 1;
            apzp.f85278a = i3;
            int i4 = aqfb.f85937b;
            int i5 = i3 | 2;
            apzp.f85278a = i5;
            apzp.f85280c = i4;
            String str = aqfb.f85938c;
            if (str != null) {
                str.getClass();
                apzp.f85278a = i5 | 4;
                apzp.f85281d = str;
            }
            aqap aqap = aqfv.f86009a;
            if (aqap.f164950c) {
                aqap.mo74035c();
                aqap.f164950c = false;
            }
            aqaq aqaq = (aqaq) aqap.f164949b;
            apzp apzp2 = (apzp) da.mo74062i();
            aqaq aqaq2 = aqaq.f85424P;
            apzp2.getClass();
            aqaq.f85429D = apzp2;
            aqaq.f85441a |= 134217728;
            return;
        }
        throw null;
    }

    /* renamed from: g */
    private final void m71516g() {
        int i;
        aqed a;
        boolean z;
        aqef aqef = new aqef(this.f86001c, this.f86002d);
        ArrayList arrayList = new ArrayList();
        boolean b = aqef.f85861a.mo47810b();
        boolean c = aqef.f85861a.mo47811c();
        if (b || c) {
            for (ApplicationInfo applicationInfo : aqef.f85862b.getInstalledApplications(128)) {
                int i2 = applicationInfo.flags & 1;
                if (((i2 != 0 && c) || (i2 == 0 && b)) && (a = aqef.mo47769a(applicationInfo.packageName)) != null) {
                    if (i2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a.f85850d = z;
                    arrayList.add(a);
                }
            }
        }
        aqfv aqfv = this.f86003e;
        aqfv.mo47843a();
        if (!arrayList.isEmpty()) {
            bxvd da = apzj.f85255f.mo74144da();
            boolean b2 = aqfv.f86010b.f85935b.mo47807b("report_more_app_info");
            if (!b2) {
                i = aqfv.f86007d;
            } else {
                i = aqfv.f86008e;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzj apzj = (apzj) da.f164949b;
            int i3 = i - 1;
            if (i != 0) {
                apzj.f85260d = i3;
                apzj.f85257a |= 4;
                boolean c2 = aqfv.f86010b.mo47811c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apzj apzj2 = (apzj) da.f164949b;
                apzj2.f85257a = 1 | apzj2.f85257a;
                apzj2.f85258b = c2;
                boolean b3 = aqfv.f86010b.mo47810b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apzj apzj3 = (apzj) da.f164949b;
                apzj3.f85257a |= 2;
                apzj3.f85259c = b3;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    aqed aqed = (aqed) arrayList.get(i4);
                    if (aqed != null) {
                        apzg a2 = aqfv.m71533a(aqed, b2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzj apzj4 = (apzj) da.f164949b;
                        a2.getClass();
                        if (!apzj4.f85261e.mo73666a()) {
                            apzj4.f85261e = bxvk.m124021a(apzj4.f85261e);
                        }
                        apzj4.f85261e.add(a2);
                    }
                }
                aqap aqap = aqfv.f86009a;
                if (aqap.f164950c) {
                    aqap.mo74035c();
                    aqap.f164950c = false;
                }
                aqaq aqaq = (aqaq) aqap.f164949b;
                apzj apzj5 = (apzj) da.mo74062i();
                aqaq aqaq2 = aqaq.f85424P;
                apzj5.getClass();
                aqaq.f85427B = apzj5;
                aqaq.f85441a |= 67108864;
                return;
            }
            throw null;
        }
    }

    /* renamed from: h */
    private final boolean m71517h() {
        for (Account account : adyd.m51363a(this.f86001c).mo33916a("com.google")) {
            if (account.name.endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m71518i() {
        if (((long) new SecureRandom().nextInt(1000)) < cgkt.f187180a.mo6606a().mo84027b()) {
            return true;
        }
        cgkr.m145927c();
        return false;
    }

    /* renamed from: j */
    private final void m71519j() {
        aqek a = aqen.m71446a(this.f86001c, this.f86002d);
        aqfv aqfv = this.f86003e;
        aqfv.mo47843a();
        bxvd da = apzv.f85303n.mo74144da();
        String str = a.f85875a;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzv apzv = (apzv) da.f164949b;
            str.getClass();
            apzv.f85305a |= 1;
            apzv.f85306b = str;
        }
        String str2 = a.f85876b;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzv apzv2 = (apzv) da.f164949b;
            str2.getClass();
            apzv2.f85305a |= 2;
            apzv2.f85307c = str2;
        }
        int i = a.f85878d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        apzv apzv3 = (apzv) da.f164949b;
        int i2 = apzv3.f85305a | 4;
        apzv3.f85305a = i2;
        apzv3.f85308d = i;
        int i3 = a.f85879e;
        int i4 = i2 | 8;
        apzv3.f85305a = i4;
        apzv3.f85309e = i3;
        String str3 = a.f85877c;
        if (str3 != null) {
            str3.getClass();
            i4 |= 16;
            apzv3.f85305a = i4;
            apzv3.f85310f = str3;
        }
        String str4 = a.f85880f;
        if (str4 != null) {
            str4.getClass();
            i4 |= 32;
            apzv3.f85305a = i4;
            apzv3.f85312h = str4;
        }
        String str5 = a.f85881g;
        if (str5 != null) {
            str5.getClass();
            i4 |= 64;
            apzv3.f85305a = i4;
            apzv3.f85313i = str5;
        }
        String str6 = a.f85882h;
        if (str6 != null) {
            str6.getClass();
            apzv3.f85305a = i4 | 128;
            apzv3.f85314j = str6;
        }
        List list = a.f85883i;
        if (list != null && !list.isEmpty()) {
            List list2 = a.f85883i;
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                aqem aqem = (aqem) list2.get(i5);
                bxvd da2 = aqar.f85467d.mo74144da();
                String str7 = aqem.f85888a;
                if (str7 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aqar aqar = (aqar) da2.f164949b;
                    str7.getClass();
                    aqar.f85469a |= 1;
                    aqar.f85470b = str7;
                }
                String str8 = aqem.f85889b;
                if (str8 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aqar aqar2 = (aqar) da2.f164949b;
                    str8.getClass();
                    aqar2.f85469a |= 2;
                    aqar2.f85471c = str8;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apzv apzv4 = (apzv) da.f164949b;
                aqar aqar3 = (aqar) da2.mo74062i();
                aqar3.getClass();
                if (!apzv4.f85315k.mo73666a()) {
                    apzv4.f85315k = bxvk.m124021a(apzv4.f85315k);
                }
                apzv4.f85315k.add(aqar3);
            }
        }
        if (a.f85884j != null) {
            bxvd da3 = aqab.f85345d.mo74144da();
            int i6 = a.f85884j.f85887b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            aqab aqab = (aqab) da3.f164949b;
            int i7 = i6 - 1;
            if (i6 != 0) {
                aqab.f85348b = i7;
                int i8 = aqab.f85347a | 1;
                aqab.f85347a = i8;
                int i9 = a.f85884j.f85886a;
                aqab.f85347a = i8 | 2;
                aqab.f85349c = i9;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apzv apzv5 = (apzv) da.f164949b;
                aqab aqab2 = (aqab) da3.mo74062i();
                aqab2.getClass();
                apzv5.f85316l = aqab2;
                apzv5.f85305a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                throw null;
            }
        }
        aqal[] aqalArr = a.f85885k;
        if (aqalArr != null) {
            List asList = Arrays.asList(aqalArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzv apzv6 = (apzv) da.f164949b;
            if (!apzv6.f85317m.mo73666a()) {
                apzv6.f85317m = bxvk.m124021a(apzv6.f85317m);
            }
            bxsy.m123078a(asList, apzv6.f85317m);
        }
        aqap aqap = aqfv.f86009a;
        if (aqap.f164950c) {
            aqap.mo74035c();
            aqap.f164950c = false;
        }
        aqaq aqaq = (aqaq) aqap.f164949b;
        apzv apzv7 = (apzv) da.mo74062i();
        aqaq aqaq2 = aqaq.f85424P;
        apzv7.getClass();
        aqaq.f85455o = apzv7;
        aqaq.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        if (!cgkt.f187180a.mo6606a().mo84007J()) {
            int i10 = Build.VERSION.SDK_INT;
            aqfv aqfv2 = this.f86003e;
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder(25);
                sb.append("/sys/block/dm-");
                sb.append(i11);
                File file = new File(sb.toString());
                if (!file.exists()) {
                    break;
                }
                if (new File(file, "fec").exists()) {
                    File file2 = new File(file, "dm/name");
                    File file3 = new File(file, "fec/corrected");
                    if (file2.exists() && file3.exists()) {
                        aqew aqew = new aqew();
                        try {
                            aqew.f85915a = aqfy.m71565c(file2);
                            String c = aqfy.m71565c(file3);
                            if (!TextUtils.isEmpty(c)) {
                                aqew.f85916b = Integer.parseInt(c, 10);
                            }
                            arrayList.add(aqew);
                        } catch (NumberFormatException e) {
                        }
                    }
                }
                i11++;
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    aqew aqew2 = (aqew) arrayList.get(i12);
                    bxvd da4 = apzq.f85282d.mo74144da();
                    String str9 = aqew2.f85915a;
                    if (str9 != null) {
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        apzq apzq = (apzq) da4.f164949b;
                        str9.getClass();
                        apzq.f85284a |= 1;
                        apzq.f85285b = str9;
                    }
                    int i13 = aqew2.f85916b;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    apzq apzq2 = (apzq) da4.f164949b;
                    apzq2.f85284a |= 2;
                    apzq2.f85286c = i13;
                    arrayList2.add((apzq) da4.mo74062i());
                }
                if (!arrayList2.isEmpty()) {
                    apzv apzv8 = ((aqaq) aqfv2.f86009a.f164949b).f85455o;
                    if (apzv8 == null) {
                        apzv8 = apzv.f85303n;
                    }
                    bxvd bxvd = (bxvd) apzv8.mo74142c(5);
                    bxvd.mo73625a((bxvk) apzv8);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    apzv apzv9 = (apzv) bxvd.f164949b;
                    if (!apzv9.f85311g.mo73666a()) {
                        apzv9.f85311g = bxvk.m124021a(apzv9.f85311g);
                    }
                    bxsy.m123078a(arrayList2, apzv9.f85311g);
                    aqap aqap2 = aqfv2.f86009a;
                    if (aqap2.f164950c) {
                        aqap2.mo74035c();
                        aqap2.f164950c = false;
                    }
                    aqaq aqaq3 = (aqaq) aqap2.f164949b;
                    apzv apzv10 = (apzv) bxvd.mo74062i();
                    apzv10.getClass();
                    aqaq3.f85455o = apzv10;
                    aqaq3.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                }
            }
        }
    }

    /* renamed from: k */
    private final void m71520k() {
        String networkOperatorName = ((TelephonyManager) this.f86001c.getSystemService("phone")).getNetworkOperatorName();
        aqfv aqfv = this.f86003e;
        aqfv.mo47843a();
        bxvd da = apzm.f85271c.mo74144da();
        if (networkOperatorName != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzm apzm = (apzm) da.f164949b;
            networkOperatorName.getClass();
            apzm.f85273a |= 1;
            apzm.f85274b = networkOperatorName;
        }
        aqap aqap = aqfv.f86009a;
        if (aqap.f164950c) {
            aqap.mo74035c();
            aqap.f164950c = false;
        }
        aqaq aqaq = (aqaq) aqap.f164949b;
        apzm apzm2 = (apzm) da.mo74062i();
        aqaq aqaq2 = aqaq.f85424P;
        apzm2.getClass();
        aqaq.f85434I = apzm2;
        aqaq.f85442b |= 16;
    }

    /* renamed from: l */
    private final void m71521l() {
        if (aqfy.m71555a()) {
            aqfv aqfv = this.f86003e;
            Context context = this.f86001c;
            HashMap hashMap = new HashMap();
            List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
            aqff aqff = new aqff();
            for (ApplicationInfo applicationInfo : installedApplications) {
                String str = applicationInfo.packageName;
                File file = new File(String.format("/data/data/%s", str));
                if (file.exists() && file.isDirectory()) {
                    try {
                        aqfd a = aqff.mo47815a(file);
                        if ((a.f85942c & 4) != 0) {
                            hashMap.put(str, a);
                        }
                    } catch (aqfe e) {
                    }
                }
            }
            aqfv.mo47843a();
            if (!hashMap.isEmpty()) {
                apzz apzz = ((aqaq) aqfv.f86009a.f164949b).f85436K;
                if (apzz == null) {
                    apzz = apzz.f85340c;
                }
                bxvd bxvd = (bxvd) apzz.mo74142c(5);
                bxvd.mo73625a((bxvk) apzz);
                apzy apzy = (apzy) bxvd;
                for (String str2 : hashMap.keySet()) {
                    bxvd da = apzf.f85227e.mo74144da();
                    if (str2 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzf apzf = (apzf) da.f164949b;
                        str2.getClass();
                        apzf.f85229a |= 1;
                        apzf.f85230b = str2;
                    }
                    aqfd aqfd = (aqfd) hashMap.get(str2);
                    int i = aqfd.f85942c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apzf apzf2 = (apzf) da.f164949b;
                    int i2 = apzf2.f85229a | 2;
                    apzf2.f85229a = i2;
                    apzf2.f85231c = i;
                    long j = aqfd.f85943d;
                    apzf2.f85229a = i2 | 4;
                    apzf2.f85232d = j;
                    if (apzy.f164950c) {
                        apzy.mo74035c();
                        apzy.f164950c = false;
                    }
                    apzz apzz2 = (apzz) apzy.f164949b;
                    apzf apzf3 = (apzf) da.mo74062i();
                    apzf3.getClass();
                    if (!apzz2.f85343b.mo73666a()) {
                        apzz2.f85343b = bxvk.m124021a(apzz2.f85343b);
                    }
                    apzz2.f85343b.add(apzf3);
                }
                aqap aqap = aqfv.f86009a;
                if (aqap.f164950c) {
                    aqap.mo74035c();
                    aqap.f164950c = false;
                }
                aqaq aqaq = (aqaq) aqap.f164949b;
                apzz apzz3 = (apzz) apzy.mo74062i();
                aqaq aqaq2 = aqaq.f85424P;
                apzz3.getClass();
                aqaq.f85436K = apzz3;
                aqaq.f85442b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
    }

    /* renamed from: m */
    private final boolean m71522m() {
        return m71509a(this.f86002d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47835c() {
        SparseIntArray sparseIntArray;
        ArrayList arrayList;
        int i;
        SparseIntArray sparseIntArray2;
        aqed aqed;
        aqev aqev = new aqev(this.f86001c, this.f86002d, this.f86003e);
        aqet aqet = null;
        if (cgkt.m145941m()) {
            m71513d();
            aqeo a = aqeo.m71448a(this.f86001c);
            if (cgkt.m145944p()) {
                a.mo47798c();
            }
            List e = a.mo47800e();
            a.mo47801f();
            if (cgkt.m145944p()) {
                a.mo47799d();
            }
            aqef aqef = new aqef(aqev.f85909a, aqev.f85910b);
            PackageManager packageManager = aqev.f85909a.getPackageManager();
            ArrayList arrayList2 = new ArrayList();
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                apyn apyn = (apyn) e.get(i2);
                int i3 = apyn.f85162e;
                if (!(i3 == -1 || !aqfy.m71556a(Process.myUid(), i3) || Process.myUid() == i3)) {
                    aqes aqes = new aqes();
                    aqes.f85902e = apyn.f85161d;
                    aqes.f85898a = apyn.f85159b;
                    aqes.f85899b = apyn.f85160c;
                    aqes.f85900c = apyn.f85163f;
                    String[] packagesForUid = packageManager.getPackagesForUid(i3);
                    if (packagesForUid != null) {
                        List a2 = aqev.m71456a(packagesForUid, aqef);
                        if (!aqev.m71460b(a2)) {
                            if (!a2.isEmpty()) {
                                aqes.f85901d = a2;
                            }
                        }
                    }
                    arrayList2.add(aqes);
                }
            }
            aqet = new aqet();
            aqet.f85903a = arrayList2;
            aqfw aqfw = new aqfw(this.f86001c);
            if (cgkt.m145931c()) {
                if (cgkt.m145944p()) {
                    aqei a3 = aqei.m71432a(this.f86001c);
                    if (a3.mo47791d()) {
                        if (a3.mo47789a()) {
                            this.f86003e.mo47847a(aqev.mo47803a(a3.mo47793f()));
                        }
                        a3.mo47794g();
                        a3.mo47788a(m71518i());
                        a3.mo47792e();
                    }
                } else {
                    if (aqfw.mo47857c()) {
                        aqei a4 = aqei.m71432a(this.f86001c);
                        List f = a4.mo47793f();
                        a4.mo47794g();
                        this.f86003e.mo47847a(aqev.mo47803a(f));
                    }
                    aqfw.mo47852a("is_blocked_bal_collection_enabled_for_device", m71518i());
                }
            }
        } else {
            int[] iArr = aqev.f85914f;
            if (!(iArr == null || iArr.length == 0)) {
                ArrayList arrayList3 = new ArrayList();
                try {
                    EventLog.readEvents(aqev.f85914f, arrayList3);
                    aqef aqef2 = new aqef(aqev.f85909a, aqev.f85910b);
                    SparseIntArray a5 = aqef2.mo47768a();
                    ArrayList arrayList4 = new ArrayList();
                    aqfw aqfw2 = new aqfw(aqev.f85909a);
                    long a6 = aqfw2.mo47848a();
                    PackageManager packageManager2 = aqev.f85909a.getPackageManager();
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    long j = -1;
                    while (i4 < size2) {
                        EventLog.Event event = (EventLog.Event) arrayList3.get(i4);
                        j = event.getTimeNanos();
                        if (j > a6) {
                            aqes aqes2 = new aqes();
                            aqes2.f85898a = event.getTag();
                            aqes2.f85902e = event.getTimeNanos();
                            int i5 = aqev.f85912d.get(event.getTag());
                            if (i5 == 1) {
                                if (event.getData() instanceof String) {
                                    aqes2.f85900c = (String) event.getData();
                                }
                                i = a5.get(event.getProcessId());
                            } else if (i5 != 2) {
                                if (i5 != 3) {
                                    arrayList = arrayList3;
                                    sparseIntArray = a5;
                                } else {
                                    try {
                                        Object[] objArr = (Object[]) event.getData();
                                        if (objArr == null || objArr.length != 3) {
                                            arrayList = arrayList3;
                                            sparseIntArray = a5;
                                        } else {
                                            Object obj = objArr[0];
                                            if (obj instanceof String) {
                                                String str = (String) obj;
                                                if (str.startsWith("do-not-log-")) {
                                                    arrayList = arrayList3;
                                                    sparseIntArray = a5;
                                                } else if (!cgkt.m145952x() || aqev.f85913e.contains(str)) {
                                                    aqes2.f85899b = str;
                                                    Object obj2 = objArr[1];
                                                    i = obj2 instanceof Integer ? ((Integer) obj2).intValue() : -1;
                                                    Object obj3 = objArr[2];
                                                    if (obj3 instanceof String) {
                                                        aqes2.f85900c = (String) obj3;
                                                    }
                                                } else {
                                                    arrayList = arrayList3;
                                                    sparseIntArray = a5;
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                                sparseIntArray = a5;
                                            }
                                        }
                                    } catch (ClassCastException e2) {
                                        arrayList = arrayList3;
                                        sparseIntArray = a5;
                                    }
                                }
                            } else if (event.getData() instanceof Integer) {
                                i = ((Integer) event.getData()).intValue();
                            } else {
                                arrayList = arrayList3;
                                sparseIntArray = a5;
                            }
                            if (i == -1) {
                                arrayList = arrayList3;
                                sparseIntArray2 = a5;
                            } else if (!aqfy.m71556a(Process.myUid(), i)) {
                                arrayList = arrayList3;
                                sparseIntArray = a5;
                            } else if (Process.myUid() != i) {
                                String[] packagesForUid2 = packageManager2.getPackagesForUid(i);
                                if (packagesForUid2 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    int length = packagesForUid2.length;
                                    arrayList = arrayList3;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            int i7 = length;
                                            String str2 = packagesForUid2[i6];
                                            if (cgkt.m145942n()) {
                                                sparseIntArray = a5;
                                                aqed = aqef2.mo47770a(str2, true);
                                            } else {
                                                sparseIntArray = a5;
                                                aqed = aqef2.mo47770a(str2, false);
                                            }
                                            if (aqed != null) {
                                                if (aqev.m71458a(aqed)) {
                                                    break;
                                                }
                                                arrayList5.add(aqed);
                                            }
                                            i6++;
                                            length = i7;
                                            a5 = sparseIntArray;
                                        } else {
                                            sparseIntArray2 = a5;
                                            if (!arrayList5.isEmpty()) {
                                                aqes2.f85901d = arrayList5;
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                    sparseIntArray2 = a5;
                                }
                            } else {
                                arrayList = arrayList3;
                                sparseIntArray = a5;
                            }
                            arrayList4.add(aqes2);
                        } else {
                            arrayList = arrayList3;
                            sparseIntArray = a5;
                        }
                        i4++;
                        arrayList3 = arrayList;
                        a5 = sparseIntArray;
                    }
                    long j2 = j;
                    if (j2 != -1) {
                        aqfw2.mo47849a(j2);
                    }
                    aqet = new aqet();
                    aqet.f85903a = arrayList4;
                } catch (IOException e3) {
                    aqev.f85911c.mo47846a((Throwable) e3);
                }
            }
        }
        if (aqet != null) {
            aqfv aqfv = this.f86003e;
            aqfv.mo47843a();
            List list = aqet.f85903a;
            if (list != null && !list.isEmpty()) {
                int size3 = list.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    aqes aqes3 = (aqes) list.get(i8);
                    bxvd da = apzw.f85318g.mo74144da();
                    if (aqes3 != null) {
                        int i9 = aqes3.f85898a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzw apzw = (apzw) da.f164949b;
                        int i10 = apzw.f85320a | 1;
                        apzw.f85320a = i10;
                        apzw.f85321b = i9;
                        String str3 = aqes3.f85899b;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = str4;
                        }
                        str3.getClass();
                        int i11 = i10 | 2;
                        apzw.f85320a = i11;
                        apzw.f85322c = str3;
                        String str5 = aqes3.f85900c;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        str4.getClass();
                        int i12 = i11 | 8;
                        apzw.f85320a = i12;
                        apzw.f85325f = str4;
                        long j3 = aqes3.f85902e;
                        apzw.f85320a = i12 | 4;
                        apzw.f85323d = j3;
                        List list2 = aqes3.f85901d;
                        if (list2 != null && !list2.isEmpty()) {
                            List list3 = aqes3.f85901d;
                            int size4 = list3.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                aqed aqed2 = (aqed) list3.get(i13);
                                if (aqed2 != null) {
                                    apzg a7 = aqfv.m71533a(aqed2, false);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    apzw apzw2 = (apzw) da.f164949b;
                                    a7.getClass();
                                    if (!apzw2.f85324e.mo73666a()) {
                                        apzw2.f85324e = bxvk.m124021a(apzw2.f85324e);
                                    }
                                    apzw2.f85324e.add(a7);
                                }
                            }
                        }
                        aqap aqap = aqfv.f86009a;
                        if (aqap.f164950c) {
                            aqap.mo74035c();
                            aqap.f164950c = false;
                        }
                        aqaq aqaq = (aqaq) aqap.f164949b;
                        apzw apzw3 = (apzw) da.mo74062i();
                        aqaq aqaq2 = aqaq.f85424P;
                        apzw3.getClass();
                        if (!aqaq.f85432G.mo73666a()) {
                            aqaq.f85432G = bxvk.m124021a(aqaq.f85432G);
                        }
                        aqaq.f85432G.add(apzw3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m71508a(Context context, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        aqfa aqfa = new aqfa(bundle);
        if (m71509a(aqfa)) {
            try {
                byte[] f = aqfa.mo47814f();
                if (f != null) {
                    Iterator it = ((apyq) bxvk.m124014a(apyq.f85174b, f)).f85176a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        apyp apyp = ((apyo) it.next()).f85167b;
                        if (apyp == null) {
                            apyp = apyp.f85168e;
                        }
                        if ("network_watchlist_report".equals(apyp.f85172c)) {
                            byte[] f2 = aqfa.mo47814f();
                            if (f2 != null) {
                                aqfy.m71554a(context, f2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (Log.isLoggable(f86000b, 6)) {
                    Log.e(f86000b, "Error while getting watchlist report", th);
                }
            }
        }
        long b = new aqfw(context).mo47854b();
        if (b == -1 || b + bundle.getLong("snet_idle_mode_wake_interval_ms") < System.currentTimeMillis()) {
            asfb asfb = new asfb(context, 1, String.valueOf(aqfs.class.getCanonicalName()).concat(":SnetIdle"));
            aqfs aqfs = new aqfs(context, aqfa);
            try {
                asfb.mo49111a(aqfs.f86002d.f85935b.mo47805a("watchdog_idle_mode_timeout_ms", 600000));
                aqfs.mo47833a();
                try {
                    asfb.mo49120c();
                } catch (RuntimeException e) {
                    aqfs.f86003e.mo47846a((Throwable) e);
                }
            } catch (Throwable th2) {
                try {
                    asfb.mo49120c();
                } catch (RuntimeException e2) {
                    aqfs.f86003e.mo47846a((Throwable) e2);
                }
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private final void m71512b(String str) {
        if (this.f86002d.f85935b.mo47807b("log_execution_points")) {
            aqev.m71457a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47834b() {
        aqed a = new aqef(this.f86001c, this.f86002d).mo47769a("com.google.android.gms");
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            a.f85855i = aqfy.m71552a(this.f86001c, "com.google.android.gms");
            aqfv aqfv = this.f86003e;
            aqfv.mo47843a();
            if (a.f85847a != null) {
                aqap aqap = aqfv.f86009a;
                apzg a2 = aqfv.m71533a(a, false);
                if (aqap.f164950c) {
                    aqap.mo74035c();
                    aqap.f164950c = false;
                }
                aqaq aqaq = (aqaq) aqap.f164949b;
                aqaq aqaq2 = aqaq.f85424P;
                a2.getClass();
                aqaq.f85466z = a2;
                aqaq.f85441a |= 16777216;
            }
        }
    }

    /* renamed from: a */
    private static boolean m71509a(aqfa aqfa) {
        return "googler".equals(aqfa.mo47812d());
    }

    /* renamed from: a */
    private static String[] m71510a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108643a(",").mo66918a((CharSequence) str)) {
            if (f85999a.contains(str2)) {
                arrayList.add(str2);
            } else if (Log.isLoggable(f86000b, 6)) {
                Log.e(f86000b, String.format("Unknown tag: %s", str2));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0add, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0adf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0ae0, code lost:
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ae4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0ae5, code lost:
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0c5b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0c5e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0c62, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0d9b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0d9f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0e0c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:?, code lost:
        r1.f86003e.mo47846a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0e13, code lost:
        r1.f86003e.mo47844a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x0e1c, code lost:
        if (m71522m() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x09ef A[SYNTHETIC, Splitter:B:486:0x09ef] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x09fb A[SYNTHETIC, Splitter:B:494:0x09fb] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0a0a A[Catch:{ Exception -> 0x0c62, IncompatibleClassChangeError | NoClassDefFoundError -> 0x0c5b, all -> 0x0e0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0ada A[Catch:{ Exception -> 0x0c62, IncompatibleClassChangeError | NoClassDefFoundError -> 0x0c5b, all -> 0x0e0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:699:0x0ddd A[Catch:{ Exception -> 0x0e22, all -> 0x0e0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:712:0x0e0c A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:295:0x05f2] */
    /* JADX WARNING: Removed duplicated region for block: B:730:0x0e43  */
    /* JADX WARNING: Removed duplicated region for block: B:733:0x0def A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:735:0x0df3 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo47833a() {
        Throwable th;
        Exception exc;
        String str;
        int i;
        String str2;
        aqfw aqfw;
        int intExtra;
        Exception exc2;
        Throwable th2;
        char c;
        int i2;
        Iterator it;
        BufferedReader bufferedReader;
        Throwable th3;
        boolean z;
        aqed a;
        byte[] bArr;
        long currentTimeMillis = System.currentTimeMillis();
        aqfw aqfw2 = new aqfw(this.f86001c);
        try {
            if (this.f86002d.f85935b.mo47807b("is_targeted_by_gservices")) {
                str = this.f86002d.f85935b.mo47806a("idle_tags_whitelist");
            } else {
                str = "system_ca_cert_store,setuid_files,gmscore,phonesky,device_state,locale,selinux_status,event_log,mount_options,app_dir_wr,internal_logs,default_packages,su_files,settings,ssl_proxy,sd_card_test,attest,carrier_info,logcat,connection_info,snet_verify_apps_api_usage,app_ops,snet_network_watchlist";
            }
            aqfv aqfv = this.f86003e;
            aqfv.mo47843a();
            if (str != null) {
                aqap aqap = aqfv.f86009a;
                if (aqap.f164950c) {
                    aqap.mo74035c();
                    aqap.f164950c = false;
                }
                aqaq aqaq = (aqaq) aqap.f164949b;
                aqaq aqaq2 = aqaq.f85424P;
                str.getClass();
                aqaq.f85441a |= 128;
                aqaq.f85450j = str;
            }
            if (str != null) {
                String[] a2 = m71510a(str);
                int length = a2.length;
                i = 0;
                while (i < length) {
                    String str3 = a2[i];
                    int i3 = 1;
                    try {
                        m71512b(str3);
                        switch (str3.hashCode()) {
                            case -1798604890:
                                if (str3.equals("setuid_files")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1280089869:
                                if (str3.equals("phonesky")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1179491089:
                                if (str3.equals("selinux_status")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1097462182:
                                if (str3.equals("locale")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -793616492:
                                if (str3.equals("app_ops")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -585388696:
                                if (str3.equals("device_state")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -353763328:
                                if (str3.equals("snet_verify_apps_api_usage")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3000946:
                                if (str3.equals("apps")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 31746079:
                                if (str3.equals("event_log")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106941038:
                                if (str3.equals("proxy")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 153440620:
                                if (str3.equals("gmscore")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 648620331:
                                if (str3.equals("default_packages")) {
                                    c = 10;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 731527535:
                                if (str3.equals("connection_info")) {
                                    c = 13;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 844731307:
                                if (str3.equals("app_dir_wr")) {
                                    c = 8;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 919143411:
                                if (str3.equals("sd_card_test")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1434631203:
                                if (str3.equals("settings")) {
                                    c = 12;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1492992120:
                                if (str3.equals("mount_options")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1696564327:
                                if (str3.equals("snet_network_watchlist")) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1826448881:
                                if (str3.equals("internal_logs")) {
                                    c = 9;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1974327701:
                                if (str3.equals("carrier_info")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2135644762:
                                if (str3.equals("su_files")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                str2 = str3;
                                aqfw = aqfw2;
                                if (!aqfy.m71555a()) {
                                    break;
                                } else {
                                    aqey aqey = new aqey(this.f86001c, new aqff(), currentTimeMillis, this.f86003e);
                                    aqfv aqfv2 = this.f86003e;
                                    List a3 = aqey.mo47804a();
                                    aqfv2.mo47843a();
                                    int a4 = aqfv2.f86010b.mo47809a();
                                    aqam aqam = (aqam) aqao.f85418e.mo74144da();
                                    if (a3 == null) {
                                        if (aqam.f164950c) {
                                            aqam.mo74035c();
                                            aqam.f164950c = false;
                                        }
                                        aqao aqao = (aqao) aqam.f164949b;
                                        aqao.f85420a |= 1;
                                        aqao.f85421b = true;
                                        aqap aqap2 = aqfv2.f86009a;
                                        if (aqap2.f164950c) {
                                            aqap2.mo74035c();
                                            aqap2.f164950c = false;
                                        }
                                        aqaq aqaq3 = (aqaq) aqap2.f164949b;
                                        aqao aqao2 = (aqao) aqam.mo74062i();
                                        aqaq aqaq4 = aqaq.f85424P;
                                        aqao2.getClass();
                                        aqaq3.f85454n = aqao2;
                                        aqaq3.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                        break;
                                    } else {
                                        Iterator it2 = a3.iterator();
                                        int i4 = 0;
                                        int i5 = 0;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                aqex aqex = (aqex) it2.next();
                                                if (aqex.f85919c) {
                                                    String str4 = aqex.f85917a;
                                                    if (str4 != null) {
                                                        i4 += str4.length();
                                                        if (i4 > a4) {
                                                        }
                                                    }
                                                    i5++;
                                                    bxvd da = aqan.f85413d.mo74144da();
                                                    String str5 = aqex.f85917a;
                                                    if (str5 != null) {
                                                        it = it2;
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        aqan aqan = (aqan) da.f164949b;
                                                        str5.getClass();
                                                        i2 = a4;
                                                        aqan.f85415a |= 1;
                                                        aqan.f85416b = str5;
                                                    } else {
                                                        it = it2;
                                                        i2 = a4;
                                                    }
                                                    byte[] bArr2 = aqex.f85923g;
                                                    if (bArr2 != null) {
                                                        bxtx a5 = bxtx.m123261a(bArr2);
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        aqan aqan2 = (aqan) da.f164949b;
                                                        a5.getClass();
                                                        aqan2.f85415a |= 2;
                                                        aqan2.f85417c = a5;
                                                    }
                                                    aqam.mo47717a(da);
                                                    it2 = it;
                                                    a4 = i2;
                                                }
                                            }
                                        }
                                        long j = (long) i5;
                                        if (aqam.f164950c) {
                                            aqam.mo74035c();
                                            aqam.f164950c = false;
                                        }
                                        aqao aqao3 = (aqao) aqam.f164949b;
                                        aqao3.f85420a |= 2;
                                        aqao3.f85422c = j;
                                        aqap aqap3 = aqfv2.f86009a;
                                        if (aqap3.f164950c) {
                                            aqap3.mo74035c();
                                            aqap3.f164950c = false;
                                        }
                                        aqaq aqaq5 = (aqaq) aqap3.f164949b;
                                        aqao aqao4 = (aqao) aqam.mo74062i();
                                        aqaq aqaq6 = aqaq.f85424P;
                                        aqao4.getClass();
                                        aqaq5.f85454n = aqao4;
                                        aqaq5.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                        break;
                                    }
                                }
                            case 1:
                                str2 = str3;
                                aqfw = aqfw2;
                                mo47835c();
                                break;
                            case 2:
                                str2 = str3;
                                aqfw = aqfw2;
                                m71519j();
                                break;
                            case 3:
                                str2 = str3;
                                aqfw = aqfw2;
                                Resources resources = this.f86001c.getResources();
                                if (resources != null) {
                                    String locale = resources.getConfiguration().locale.toString();
                                    aqfv aqfv3 = this.f86003e;
                                    aqfv3.mo47843a();
                                    if (locale != null) {
                                        aqap aqap4 = aqfv3.f86009a;
                                        if (aqap4.f164950c) {
                                            aqap4.mo74035c();
                                            aqap4.f164950c = false;
                                        }
                                        aqaq aqaq7 = (aqaq) aqap4.f164949b;
                                        aqaq aqaq8 = aqaq.f85424P;
                                        locale.getClass();
                                        aqaq7.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                        aqaq7.f85456p = locale;
                                    }
                                }
                                aqfv aqfv4 = this.f86003e;
                                String a6 = this.f86002d.f85935b.mo47806a("device_country");
                                aqfv4.mo47843a();
                                if (a6 == null) {
                                    break;
                                } else {
                                    aqap aqap5 = aqfv4.f86009a;
                                    if (aqap5.f164950c) {
                                        aqap5.mo74035c();
                                        aqap5.f164950c = false;
                                    }
                                    aqaq aqaq9 = (aqaq) aqap5.f164949b;
                                    aqaq aqaq10 = aqaq.f85424P;
                                    a6.getClass();
                                    aqaq9.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    aqaq9.f85457q = a6;
                                    break;
                                }
                            case 4:
                                str2 = str3;
                                aqfw = aqfw2;
                                aqfv aqfv5 = this.f86003e;
                                aqfn a7 = aqfo.m71503a();
                                aqfv5.mo47843a();
                                bxvd da2 = aqak.f85401f.mo74144da();
                                boolean z2 = a7.f85977a;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                aqak aqak = (aqak) da2.f164949b;
                                int i6 = aqak.f85403a | 1;
                                aqak.f85403a = i6;
                                aqak.f85404b = z2;
                                boolean z3 = a7.f85978b;
                                int i7 = i6 | 2;
                                aqak.f85403a = i7;
                                aqak.f85405c = z3;
                                String str6 = a7.f85979c;
                                if (str6 != null) {
                                    str6.getClass();
                                    aqak.f85403a = i7 | 4;
                                    aqak.f85406d = str6;
                                }
                                byte[] bArr3 = a7.f85980d;
                                if (bArr3 != null) {
                                    bxtx a8 = bxtx.m123261a(bArr3);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    aqak aqak2 = (aqak) da2.f164949b;
                                    a8.getClass();
                                    aqak2.f85403a |= 8;
                                    aqak2.f85407e = a8;
                                }
                                aqap aqap6 = aqfv5.f86009a;
                                if (aqap6.f164950c) {
                                    aqap6.mo74035c();
                                    aqap6.f164950c = false;
                                }
                                aqaq aqaq11 = (aqaq) aqap6.f164949b;
                                aqak aqak3 = (aqak) da2.mo74062i();
                                aqaq aqaq12 = aqaq.f85424P;
                                aqak3.getClass();
                                aqaq11.f85458r = aqak3;
                                aqaq11.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                break;
                            case 5:
                                str2 = str3;
                                aqfw = aqfw2;
                                mo47834b();
                                break;
                            case 6:
                                str2 = str3;
                                aqfw = aqfw2;
                                aqed a9 = new aqef(this.f86001c, this.f86002d).mo47769a("com.android.vending");
                                if (a9 == null) {
                                    break;
                                } else {
                                    int i8 = Build.VERSION.SDK_INT;
                                    a9.f85855i = aqfy.m71552a(this.f86001c, "com.android.vending");
                                    aqfv aqfv6 = this.f86003e;
                                    aqfv6.mo47843a();
                                    if (a9.f85847a == null) {
                                        break;
                                    } else {
                                        aqap aqap7 = aqfv6.f86009a;
                                        apzg a10 = aqfv.m71533a(a9, false);
                                        if (aqap7.f164950c) {
                                            aqap7.mo74035c();
                                            aqap7.f164950c = false;
                                        }
                                        aqaq aqaq13 = (aqaq) aqap7.f164949b;
                                        aqaq aqaq14 = aqaq.f85424P;
                                        a10.getClass();
                                        aqaq13.f85426A = a10;
                                        aqaq13.f85441a |= 33554432;
                                        break;
                                    }
                                }
                            case 7:
                                str2 = str3;
                                char c2 = 5;
                                bngx a11 = bngx.m109356a("/system");
                                aqfv aqfv7 = this.f86003e;
                                HashMap hashMap = new HashMap();
                                if (a11 != null && !a11.isEmpty()) {
                                    File file = new File("/proc/self/mountinfo");
                                    if (file.exists()) {
                                        try {
                                            bufferedReader = new BufferedReader(new FileReader(file));
                                            while (true) {
                                                try {
                                                    String readLine = bufferedReader.readLine();
                                                    if (readLine != null) {
                                                        String[] split = readLine.split("\\s+");
                                                        if (split.length < 10) {
                                                            c2 = 5;
                                                        } else if (TextUtils.isEmpty(split[4])) {
                                                            c2 = 5;
                                                        } else if (TextUtils.isEmpty(split[c2])) {
                                                            c2 = 5;
                                                        } else if (a11.contains(split[4])) {
                                                            String str7 = split[4];
                                                            String str8 = split[c2];
                                                            String[] split2 = str8.split(",");
                                                            int length2 = split2.length;
                                                            bngx bngx = a11;
                                                            int i9 = 0;
                                                            while (true) {
                                                                if (i9 < length2) {
                                                                    int i10 = length2;
                                                                    aqfw = aqfw2;
                                                                    try {
                                                                        if (!split2[i9].equalsIgnoreCase("rw")) {
                                                                            i9++;
                                                                            length2 = i10;
                                                                            aqfw2 = aqfw;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                    } catch (IOException e) {
                                                                        if (bufferedReader != null) {
                                                                        }
                                                                        hashMap = null;
                                                                        aqfv7.mo47843a();
                                                                        if (hashMap != null) {
                                                                        }
                                                                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                                                        if (intExtra != 1) {
                                                                        }
                                                                        i++;
                                                                        aqfw2 = aqfw;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        th3 = th;
                                                                        if (bufferedReader != null) {
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } else {
                                                                    aqfw = aqfw2;
                                                                    z = false;
                                                                }
                                                            }
                                                            hashMap.put(str7, Pair.create(str8, Boolean.valueOf(z)));
                                                            a11 = bngx;
                                                            aqfw2 = aqfw;
                                                            c2 = 5;
                                                        } else {
                                                            c2 = 5;
                                                        }
                                                    } else {
                                                        aqfw = aqfw2;
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (IOException e2) {
                                                        }
                                                        aqfv7.mo47843a();
                                                        if (hashMap != null) {
                                                            if (!hashMap.isEmpty()) {
                                                                apzz apzz = ((aqaq) aqfv7.f86009a.f164949b).f85436K;
                                                                if (apzz == null) {
                                                                    apzz = apzz.f85340c;
                                                                }
                                                                bxvd bxvd = (bxvd) apzz.mo74142c(5);
                                                                bxvd.mo73625a((bxvk) apzz);
                                                                apzy apzy = (apzy) bxvd;
                                                                for (String str9 : hashMap.keySet()) {
                                                                    bxvd da3 = aqaf.f85366e.mo74144da();
                                                                    if (str9 != null) {
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        aqaf aqaf = (aqaf) da3.f164949b;
                                                                        str9.getClass();
                                                                        aqaf.f85368a |= 1;
                                                                        aqaf.f85369b = str9;
                                                                    }
                                                                    Pair pair = (Pair) hashMap.get(str9);
                                                                    if (pair.first != null) {
                                                                        String str10 = (String) pair.first;
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        aqaf aqaf2 = (aqaf) da3.f164949b;
                                                                        str10.getClass();
                                                                        aqaf2.f85368a |= 2;
                                                                        aqaf2.f85370c = str10;
                                                                    }
                                                                    boolean booleanValue = ((Boolean) pair.second).booleanValue();
                                                                    if (da3.f164950c) {
                                                                        da3.mo74035c();
                                                                        da3.f164950c = false;
                                                                    }
                                                                    aqaf aqaf3 = (aqaf) da3.f164949b;
                                                                    aqaf3.f85368a |= 4;
                                                                    aqaf3.f85371d = booleanValue;
                                                                    apzy.mo47716a(da3);
                                                                }
                                                                aqap aqap8 = aqfv7.f86009a;
                                                                if (aqap8.f164950c) {
                                                                    aqap8.mo74035c();
                                                                    aqap8.f164950c = false;
                                                                }
                                                                aqaq aqaq15 = (aqaq) aqap8.f164949b;
                                                                apzz apzz2 = (apzz) apzy.mo74062i();
                                                                aqaq aqaq16 = aqaq.f85424P;
                                                                apzz2.getClass();
                                                                aqaq15.f85436K = apzz2;
                                                                aqaq15.f85442b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                            }
                                                        }
                                                    }
                                                } catch (IOException e3) {
                                                    aqfw = aqfw2;
                                                    if (bufferedReader != null) {
                                                    }
                                                    hashMap = null;
                                                    aqfv7.mo47843a();
                                                    if (hashMap != null) {
                                                    }
                                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                                    if (intExtra != 1) {
                                                    }
                                                    i++;
                                                    aqfw2 = aqfw;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    aqfw = aqfw2;
                                                    th3 = th;
                                                    if (bufferedReader != null) {
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        } catch (IOException e4) {
                                            aqfw = aqfw2;
                                            bufferedReader = null;
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                    hashMap = null;
                                                } catch (IOException e5) {
                                                    hashMap = null;
                                                    aqfv7.mo47843a();
                                                    if (hashMap != null) {
                                                    }
                                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                                    if (intExtra != 1) {
                                                    }
                                                    i++;
                                                    aqfw2 = aqfw;
                                                }
                                                aqfv7.mo47843a();
                                                if (hashMap != null) {
                                                }
                                                intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                                if (intExtra != 1) {
                                                }
                                                i++;
                                                aqfw2 = aqfw;
                                            }
                                            hashMap = null;
                                            aqfv7.mo47843a();
                                            if (hashMap != null) {
                                            }
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (Throwable th6) {
                                            aqfw = aqfw2;
                                            th3 = th6;
                                            bufferedReader = null;
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException e6) {
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                }
                                aqfw = aqfw2;
                                aqfv7.mo47843a();
                                if (hashMap != null) {
                                }
                                break;
                            case 8:
                                str2 = str3;
                                m71521l();
                                aqfw = aqfw2;
                                break;
                            case 9:
                                str2 = str3;
                                aqez aqez = this.f86002d.f85935b;
                                Bundle bundle = aqez.f85933a.getBundle("snet_internal_security_logs");
                                if (bundle == null) {
                                    bundle = aqez.f85933a.getBundle("internal_security_logs");
                                }
                                if (bundle == null) {
                                    aqfw = aqfw2;
                                    break;
                                } else {
                                    aqfv aqfv8 = this.f86003e;
                                    aqfv8.mo47843a();
                                    int i11 = bundle.getInt("snet_offline_scan_usage");
                                    bxvd da4 = aqac.f85350c.mo74144da();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    aqac aqac = (aqac) da4.f164949b;
                                    aqac.f85352a |= 1;
                                    aqac.f85353b = i11;
                                    aqac aqac2 = (aqac) da4.mo74062i();
                                    aqap aqap9 = aqfv8.f86009a;
                                    if (aqap9.f164950c) {
                                        aqap9.mo74035c();
                                        aqap9.f164950c = false;
                                    }
                                    aqaq aqaq17 = (aqaq) aqap9.f164949b;
                                    aqaq aqaq18 = aqaq.f85424P;
                                    aqac2.getClass();
                                    aqaq17.f85437L = aqac2;
                                    aqaq17.f85442b |= 512;
                                    aqfw = aqfw2;
                                    break;
                                }
                            case 10:
                                str2 = str3;
                                aqfg aqfg = new aqfg(this.f86001c);
                                aqfv aqfv9 = this.f86003e;
                                PackageInfo a12 = aqfg.mo47819a();
                                aqfv9.mo47843a();
                                if (a12 != null) {
                                    bxvd da5 = aqae.f85359e.mo74144da();
                                    if (a12.packageName != null) {
                                        String str11 = a12.packageName;
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        aqae aqae = (aqae) da5.f164949b;
                                        str11.getClass();
                                        aqae.f85361a |= 1;
                                        aqae.f85362b = str11;
                                    }
                                    int i12 = a12.versionCode;
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    aqae aqae2 = (aqae) da5.f164949b;
                                    aqae2.f85361a |= 2;
                                    aqae2.f85363c = i12;
                                    if (a12.versionName != null) {
                                        String str12 = a12.versionName;
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        aqae aqae3 = (aqae) da5.f164949b;
                                        str12.getClass();
                                        aqae3.f85361a |= 4;
                                        aqae3.f85364d = str12;
                                    }
                                    if ("android".equalsIgnoreCase(a12.packageName)) {
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        aqae.m71248a((aqae) da5.f164949b);
                                    }
                                    aqap aqap10 = aqfv9.f86009a;
                                    if (aqap10.f164950c) {
                                        aqap10.mo74035c();
                                        aqap10.f164950c = false;
                                    }
                                    aqaq aqaq19 = (aqaq) aqap10.f164949b;
                                    aqae aqae4 = (aqae) da5.mo74062i();
                                    aqaq aqaq20 = aqaq.f85424P;
                                    aqae4.getClass();
                                    aqaq19.f85459s = aqae4;
                                    aqaq19.f85441a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                }
                                aqfv aqfv10 = this.f86003e;
                                PackageInfo b = aqfg.mo47820b();
                                if (b != null) {
                                    bxvd da6 = aqae.f85359e.mo74144da();
                                    if (b.packageName != null) {
                                        String str13 = b.packageName;
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        aqae aqae5 = (aqae) da6.f164949b;
                                        str13.getClass();
                                        aqae5.f85361a |= 1;
                                        aqae5.f85362b = str13;
                                    }
                                    int i13 = b.versionCode;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    aqae aqae6 = (aqae) da6.f164949b;
                                    aqae6.f85361a |= 2;
                                    aqae6.f85363c = i13;
                                    if (b.versionName != null) {
                                        String str14 = b.versionName;
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        aqae aqae7 = (aqae) da6.f164949b;
                                        str14.getClass();
                                        aqae7.f85361a |= 4;
                                        aqae7.f85364d = str14;
                                    }
                                    if ("android".equalsIgnoreCase(b.packageName)) {
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        aqae.m71248a((aqae) da6.f164949b);
                                    }
                                    aqap aqap11 = aqfv10.f86009a;
                                    if (aqap11.f164950c) {
                                        aqap11.mo74035c();
                                        aqap11.f164950c = false;
                                    }
                                    aqaq aqaq21 = (aqaq) aqap11.f164949b;
                                    aqae aqae8 = (aqae) da6.mo74062i();
                                    aqaq aqaq22 = aqaq.f85424P;
                                    aqae8.getClass();
                                    aqaq21.f85460t = aqae8;
                                    aqaq21.f85441a |= 1048576;
                                }
                                aqfv aqfv11 = this.f86003e;
                                List<PackageInfo> d = aqfg.mo47822d();
                                aqfv11.mo47843a();
                                if (d.size() != 0) {
                                    for (PackageInfo packageInfo : d) {
                                        bxvd da7 = aqae.f85359e.mo74144da();
                                        if (packageInfo.packageName != null) {
                                            String str15 = packageInfo.packageName;
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            aqae aqae9 = (aqae) da7.f164949b;
                                            str15.getClass();
                                            aqae9.f85361a |= 1;
                                            aqae9.f85362b = str15;
                                        }
                                        int i14 = packageInfo.versionCode;
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        aqae aqae10 = (aqae) da7.f164949b;
                                        aqae10.f85361a |= 2;
                                        aqae10.f85363c = i14;
                                        if (packageInfo.versionName != null) {
                                            String str16 = packageInfo.versionName;
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            aqae aqae11 = (aqae) da7.f164949b;
                                            str16.getClass();
                                            aqae11.f85361a |= 4;
                                            aqae11.f85364d = str16;
                                        }
                                        aqfv11.f86009a.mo47718a(da7);
                                    }
                                }
                                aqfv aqfv12 = this.f86003e;
                                String c3 = aqfg.mo47821c();
                                aqfv12.mo47843a();
                                if (!(c3 == null || (a = aqfv12.f86011c.mo47769a(c3)) == null)) {
                                    aqap aqap12 = aqfv12.f86009a;
                                    apzg a13 = aqfv.m71533a(a, false);
                                    if (aqap12.f164950c) {
                                        aqap12.mo74035c();
                                        aqap12.f164950c = false;
                                    }
                                    aqaq aqaq23 = (aqaq) aqap12.f164949b;
                                    aqaq aqaq24 = aqaq.f85424P;
                                    a13.getClass();
                                    aqaq23.f85462v = a13;
                                    aqaq23.f85441a |= 2097152;
                                }
                                aqfv aqfv13 = this.f86003e;
                                int i15 = Build.VERSION.SDK_INT;
                                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(aqfg.f85958a);
                                aqfv13.mo47843a();
                                if (defaultSmsPackage == null) {
                                    aqfw = aqfw2;
                                    break;
                                } else {
                                    aqed a14 = aqfv13.f86011c.mo47769a(defaultSmsPackage);
                                    if (a14 == null) {
                                        aqfw = aqfw2;
                                        break;
                                    } else {
                                        aqap aqap13 = aqfv13.f86009a;
                                        apzg a15 = aqfv.m71533a(a14, false);
                                        if (aqap13.f164950c) {
                                            aqap13.mo74035c();
                                            aqap13.f164950c = false;
                                        }
                                        aqaq aqaq25 = (aqaq) aqap13.f164949b;
                                        aqaq aqaq26 = aqaq.f85424P;
                                        a15.getClass();
                                        aqaq25.f85463w = a15;
                                        aqaq25.f85441a |= 4194304;
                                        aqfw = aqfw2;
                                        break;
                                    }
                                }
                            case 11:
                                str2 = str3;
                                m71514e();
                                aqfw = aqfw2;
                                break;
                            case 12:
                                str2 = str3;
                                aqfr aqfr = new aqfr(this.f86001c);
                                aqfv aqfv14 = this.f86003e;
                                aqfq a16 = aqfr.mo47832a();
                                aqfv14.mo47843a();
                                if (a16 != null) {
                                    bxvd da8 = apzu.f85290j.mo74144da();
                                    boolean z4 = a16.f85985a;
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    apzu apzu = (apzu) da8.f164949b;
                                    int i16 = apzu.f85292a | 1;
                                    apzu.f85292a = i16;
                                    apzu.f85293b = z4;
                                    boolean z5 = a16.f85986b;
                                    int i17 = i16 | 2;
                                    apzu.f85292a = i17;
                                    apzu.f85294c = z5;
                                    int i18 = a16.f85987c;
                                    apzu.f85292a = i17 | 8;
                                    apzu.f85296e = i18;
                                    apzu.m71236a(apzu);
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    apzu.m71237b((apzu) da8.f164949b);
                                    int i19 = a16.f85988d;
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    apzu apzu2 = (apzu) da8.f164949b;
                                    int i20 = apzu2.f85292a | 128;
                                    apzu2.f85292a = i20;
                                    apzu2.f85298g = i19;
                                    boolean z6 = a16.f85989e;
                                    int i21 = i20 | 512;
                                    apzu2.f85292a = i21;
                                    apzu2.f85300i = z6;
                                    int i22 = a16.f85990f;
                                    if (i22 != 0) {
                                        apzu2.f85295d = i22 - 1;
                                        i21 |= 4;
                                        apzu2.f85292a = i21;
                                    }
                                    int i23 = a16.f85991g;
                                    if (i23 != 0) {
                                        apzu2.f85297f = i23 - 1;
                                        i21 |= 16;
                                        apzu2.f85292a = i21;
                                    }
                                    int i24 = a16.f85992h;
                                    if (i24 != 0) {
                                        apzu2.f85299h = i24 - 1;
                                        apzu2.f85292a = i21 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    }
                                    aqap aqap14 = aqfv14.f86009a;
                                    if (aqap14.f164950c) {
                                        aqap14.mo74035c();
                                        aqap14.f164950c = false;
                                    }
                                    try {
                                        aqaq aqaq27 = (aqaq) aqap14.f164949b;
                                        apzu apzu3 = (apzu) da8.mo74062i();
                                        aqaq aqaq28 = aqaq.f85424P;
                                        apzu3.getClass();
                                        aqaq27.f85465y = apzu3;
                                        aqaq27.f85441a |= 8388608;
                                        aqfw = aqfw2;
                                    } catch (Exception e7) {
                                        e = e7;
                                        exc2 = e;
                                        this.f86003e.mo47845a(exc2);
                                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                        if (intExtra != 1) {
                                        }
                                        i++;
                                        aqfw2 = aqfw;
                                    } catch (IncompatibleClassChangeError | NoClassDefFoundError e8) {
                                        e = e8;
                                        th2 = e;
                                        this.f86003e.mo47846a(th2);
                                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                        if (intExtra != 1) {
                                        }
                                        i++;
                                        aqfw2 = aqfw;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        this.f86003e.mo47844a(currentTimeMillis);
                                        if (m71522m()) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    aqfw = aqfw2;
                                }
                                break;
                            case 13:
                                str2 = str3;
                                m71515f();
                                aqfw = aqfw2;
                                break;
                            case 14:
                                str2 = str3;
                                aqfh a17 = aqfi.m71484a();
                                a17.f85962c = null;
                                aqfv aqfv15 = this.f86003e;
                                aqfv15.mo47843a();
                                bxvd da9 = aqag.f85372e.mo74144da();
                                boolean z7 = a17.f85960a;
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                aqag aqag = (aqag) da9.f164949b;
                                int i25 = aqag.f85374a | 1;
                                aqag.f85374a = i25;
                                aqag.f85375b = z7;
                                boolean z8 = a17.f85961b;
                                int i26 = i25 | 2;
                                aqag.f85374a = i26;
                                aqag.f85376c = z8;
                                String str17 = a17.f85962c;
                                if (str17 != null) {
                                    str17.getClass();
                                    aqag.f85374a = i26 | 4;
                                    aqag.f85377d = str17;
                                }
                                aqap aqap15 = aqfv15.f86009a;
                                if (aqap15.f164950c) {
                                    aqap15.mo74035c();
                                    aqap15.f164950c = false;
                                }
                                aqaq aqaq29 = (aqaq) aqap15.f164949b;
                                aqag aqag2 = (aqag) da9.mo74062i();
                                aqaq aqaq30 = aqaq.f85424P;
                                aqag2.getClass();
                                aqaq29.f85430E = aqag2;
                                aqaq29.f85442b |= 2;
                                aqfw = aqfw2;
                                break;
                            case 15:
                                str2 = str3;
                                aqfl a18 = new aqfm(this.f86001c, this.f86002d).mo47830a();
                                aqfv aqfv16 = this.f86003e;
                                aqfv16.mo47843a();
                                if (a18 != null) {
                                    bxvd da10 = aqaj.f85391i.mo74144da();
                                    boolean a19 = a18.mo47776a();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj = (aqaj) da10.f164949b;
                                    aqaj.f85393a |= 1;
                                    aqaj.f85394b = a19;
                                    boolean b2 = a18.mo47777b();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj2 = (aqaj) da10.f164949b;
                                    aqaj2.f85393a |= 2;
                                    aqaj2.f85395c = b2;
                                    long c4 = a18.mo47778c();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj3 = (aqaj) da10.f164949b;
                                    aqaj3.f85393a |= 4;
                                    aqaj3.f85396d = c4;
                                    int d2 = a18.mo47779d();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj4 = (aqaj) da10.f164949b;
                                    aqaj4.f85393a |= 8;
                                    aqaj4.f85397e = d2;
                                    boolean e9 = a18.mo47780e();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj5 = (aqaj) da10.f164949b;
                                    aqaj5.f85393a |= 16;
                                    aqaj5.f85398f = e9;
                                    long g = a18.mo47783g();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    aqaj aqaj6 = (aqaj) da10.f164949b;
                                    aqaj6.f85393a |= 64;
                                    aqaj6.f85400h = g;
                                    if (a18.mo47782f() != null) {
                                        String f = a18.mo47782f();
                                        if (da10.f164950c) {
                                            da10.mo74035c();
                                            da10.f164950c = false;
                                        }
                                        aqaj aqaj7 = (aqaj) da10.f164949b;
                                        f.getClass();
                                        aqaj7.f85393a |= 32;
                                        aqaj7.f85399g = f;
                                    }
                                    aqap aqap16 = aqfv16.f86009a;
                                    if (aqap16.f164950c) {
                                        aqap16.mo74035c();
                                        try {
                                            aqap16.f164950c = false;
                                        } catch (Exception e10) {
                                            exc2 = e10;
                                            aqfw = aqfw2;
                                            this.f86003e.mo47845a(exc2);
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (NoClassDefFoundError e11) {
                                            e = e11;
                                            th2 = e;
                                            aqfw = aqfw2;
                                            this.f86003e.mo47846a(th2);
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (IncompatibleClassChangeError e12) {
                                            e = e12;
                                            th2 = e;
                                            aqfw = aqfw2;
                                            this.f86003e.mo47846a(th2);
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (Throwable th8) {
                                        }
                                    }
                                    aqaq aqaq31 = (aqaq) aqap16.f164949b;
                                    aqaj aqaj8 = (aqaj) da10.mo74062i();
                                    aqaq aqaq32 = aqaq.f85424P;
                                    aqaj8.getClass();
                                    aqaq31.f85435J = aqaj8;
                                    aqaq31.f85442b |= 64;
                                    aqfw = aqfw2;
                                } else {
                                    aqfw = aqfw2;
                                }
                                break;
                            case 16:
                                str2 = str3;
                                if (!m71517h()) {
                                    aqfw = aqfw2;
                                    break;
                                } else {
                                    m71516g();
                                    aqfw = aqfw2;
                                    break;
                                }
                            case 17:
                                str2 = str3;
                                m71520k();
                                aqfw = aqfw2;
                                break;
                            case 18:
                                try {
                                    int i27 = Build.VERSION.SDK_INT;
                                    new aqec(AppOpsManager.class);
                                    str2 = str3;
                                    try {
                                        new aqeb(this.f86001c, this.f86003e, new aqea(this.f86001c), aqfw2, m71517h()).mo47767a(currentTimeMillis);
                                        aqfw = aqfw2;
                                    } catch (Exception e13) {
                                        e = e13;
                                        exc2 = e;
                                        aqfw = aqfw2;
                                        this.f86003e.mo47845a(exc2);
                                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                        if (intExtra != 1) {
                                        }
                                        i++;
                                        aqfw2 = aqfw;
                                    } catch (IncompatibleClassChangeError | NoClassDefFoundError e14) {
                                        e = e14;
                                        th2 = e;
                                        aqfw = aqfw2;
                                        this.f86003e.mo47846a(th2);
                                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                        if (intExtra != 1) {
                                        }
                                        i++;
                                        aqfw2 = aqfw;
                                    } catch (Throwable th82) {
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    str2 = str3;
                                    exc2 = e;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47845a(exc2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (NoClassDefFoundError e16) {
                                    e = e16;
                                    str2 = str3;
                                    th2 = e;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47846a(th2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (IncompatibleClassChangeError e17) {
                                    e = e17;
                                    str2 = str3;
                                    th2 = e;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47846a(th2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (Throwable th822) {
                                }
                                break;
                            case 19:
                                aqfv aqfv17 = this.f86003e;
                                List<String> e18 = this.f86002d.mo47813e();
                                if (e18 == null) {
                                    str2 = str3;
                                    aqfw = aqfw2;
                                    break;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str18 : e18) {
                                        if (str18 != null) {
                                            arrayList.add(str18);
                                        }
                                    }
                                    aqfv17.f86009a.mo47719a(arrayList);
                                    str2 = str3;
                                    aqfw = aqfw2;
                                    break;
                                }
                            case 20:
                                try {
                                    if (!m71522m()) {
                                        try {
                                            bArr = this.f86002d.mo47814f();
                                        } catch (Exception e19) {
                                            e = e19;
                                            exc2 = e;
                                            str2 = str3;
                                            aqfw = aqfw2;
                                            this.f86003e.mo47845a(exc2);
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (IncompatibleClassChangeError | NoClassDefFoundError e20) {
                                            e = e20;
                                            th2 = e;
                                            str2 = str3;
                                            aqfw = aqfw2;
                                            this.f86003e.mo47846a(th2);
                                            intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                            if (intExtra != 1) {
                                            }
                                            i++;
                                            aqfw2 = aqfw;
                                        } catch (Throwable th8222) {
                                        }
                                    } else {
                                        bArr = aqfy.m71559a(this.f86001c);
                                    }
                                    if (bArr != null) {
                                        Iterator it3 = ((apyq) bxvk.m124014a(apyq.f85174b, bArr)).f85176a.iterator();
                                        while (it3.hasNext()) {
                                            apyo apyo = (apyo) it3.next();
                                            if ((apyo.f85166a & i3) != 0) {
                                                apyp apyp = apyo.f85167b;
                                                if (apyp == null) {
                                                    apyp = apyp.f85168e;
                                                }
                                                if (apyp.f85172c.equals("network_watchlist_report")) {
                                                    apyp apyp2 = apyo.f85167b;
                                                    if (apyp2 == null) {
                                                        apyp2 = apyp.f85168e;
                                                    }
                                                    byci byci = (byci) bxvk.m124016a(byci.f165652d, apyp2.f85173d.mo73780k(), bxus.m123744c());
                                                    int i28 = byci.f165654a;
                                                    byte[] a20 = aqfy.m71561a(byci.f165655b);
                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                    for (bych bych : byci.f165656c) {
                                                        identityHashMap.put(aqfy.m71561a(bych.f165649a), Boolean.valueOf(bych.f165650b));
                                                    }
                                                    aqfv aqfv18 = this.f86003e;
                                                    aqfv18.mo47843a();
                                                    bxvd da11 = aqad.f85354d.mo74144da();
                                                    if (da11.f164950c) {
                                                        da11.mo74035c();
                                                        da11.f164950c = false;
                                                    }
                                                    aqad aqad = (aqad) da11.f164949b;
                                                    Iterator it4 = it3;
                                                    aqad.f85356a |= 1;
                                                    aqad.f85357b = i28;
                                                    if (a20.length > 0) {
                                                        bxtx a21 = bxtx.m123261a(a20);
                                                        if (da11.f164950c) {
                                                            da11.mo74035c();
                                                            da11.f164950c = false;
                                                        }
                                                        aqad aqad2 = (aqad) da11.f164949b;
                                                        a21.getClass();
                                                        aqad2.f85356a |= 2;
                                                        aqad2.f85358c = a21;
                                                    }
                                                    aqap aqap17 = aqfv18.f86009a;
                                                    if (aqap17.f164950c) {
                                                        aqap17.mo74035c();
                                                        aqap17.f164950c = false;
                                                    }
                                                    aqaq aqaq33 = (aqaq) aqap17.f164949b;
                                                    aqad aqad3 = (aqad) da11.mo74062i();
                                                    aqaq aqaq34 = aqaq.f85424P;
                                                    aqad3.getClass();
                                                    aqaq33.f85431F = aqad3;
                                                    aqaq33.f85442b |= 4;
                                                    if (!identityHashMap.isEmpty()) {
                                                        for (byte[] bArr4 : identityHashMap.keySet()) {
                                                            int i29 = !((Boolean) identityHashMap.get(bArr4)).booleanValue() ? 2 : 3;
                                                            bxvd a22 = aqfv18.mo47842a(bxtx.m123261a(bArr4));
                                                            if (a22.f164950c) {
                                                                a22.mo74035c();
                                                                a22.f164950c = false;
                                                            }
                                                            apze apze = (apze) a22.f164949b;
                                                            apze apze2 = apze.f85221e;
                                                            apze.f85226d = i29 - 1;
                                                            apze.f85223a |= 2;
                                                        }
                                                        it3 = it4;
                                                        i3 = 1;
                                                    } else {
                                                        it3 = it4;
                                                        i3 = 1;
                                                    }
                                                } else {
                                                    i3 = 1;
                                                }
                                            } else {
                                                i3 = 1;
                                            }
                                        }
                                        str2 = str3;
                                        aqfw = aqfw2;
                                    } else {
                                        str2 = str3;
                                        aqfw = aqfw2;
                                    }
                                } catch (Exception e21) {
                                    e = e21;
                                    exc2 = e;
                                    str2 = str3;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47845a(exc2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                        if (str2.equals(a2[a2.length - 1])) {
                                        }
                                        break;
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (NoClassDefFoundError e22) {
                                    e = e22;
                                    th2 = e;
                                    str2 = str3;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47846a(th2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (IncompatibleClassChangeError e23) {
                                    e = e23;
                                    th2 = e;
                                    str2 = str3;
                                    aqfw = aqfw2;
                                    this.f86003e.mo47846a(th2);
                                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                                    if (intExtra != 1) {
                                    }
                                    i++;
                                    aqfw2 = aqfw;
                                } catch (Throwable th82222) {
                                }
                                break;
                            default:
                                str2 = str3;
                                aqfw = aqfw2;
                                break;
                        }
                    } catch (Exception e24) {
                        e = e24;
                        str2 = str3;
                        aqfw = aqfw2;
                        exc2 = e;
                        this.f86003e.mo47845a(exc2);
                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                        if (intExtra != 1) {
                        }
                        i++;
                        aqfw2 = aqfw;
                    } catch (IncompatibleClassChangeError | NoClassDefFoundError e25) {
                        e = e25;
                        str2 = str3;
                        aqfw = aqfw2;
                        th2 = e;
                        this.f86003e.mo47846a(th2);
                        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                        if (intExtra != 1) {
                        }
                        i++;
                        aqfw2 = aqfw;
                    } catch (Throwable th822222) {
                    }
                    intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                    if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                        if (str2.equals(a2[a2.length - 1])) {
                            cgkr.m145927c();
                            return;
                        }
                    }
                    i++;
                    aqfw2 = aqfw;
                }
                m71512b("done");
            }
            this.f86003e.mo47844a(currentTimeMillis);
            if (!m71522m()) {
                return;
            }
        } catch (Exception e26) {
            exc = e26;
        } catch (Throwable th8222222) {
        }
        aqfy.m71554a(this.f86001c, (byte[]) null);
        exc2 = e;
        this.f86003e.mo47845a(exc2);
        intExtra = this.f86001c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        if (intExtra != 1) {
        }
        i++;
        aqfw2 = aqfw;
        try {
            this.f86003e.mo47845a(exc);
            this.f86003e.mo47844a(currentTimeMillis);
            if (!m71522m()) {
                return;
            }
            aqfy.m71554a(this.f86001c, (byte[]) null);
        } catch (Throwable th9) {
            th = th9;
            this.f86003e.mo47844a(currentTimeMillis);
            if (m71522m()) {
                aqfy.m71554a(this.f86001c, (byte[]) null);
            }
            throw th;
        }
    }
}

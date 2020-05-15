package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: ajfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajfd implements ajet {

    /* renamed from: a */
    private final ajev f70497a = new ajev(this);

    /* renamed from: b */
    private final ajfc f70498b = new ajfc(this);

    /* renamed from: c */
    private final ConnectivityManager f70499c;

    /* renamed from: d */
    private final String f70500d;

    /* renamed from: e */
    final Context f70501e;

    /* renamed from: f */
    public final ClientAppIdentifier f70502f;

    /* renamed from: g */
    public final buqh f70503g;

    /* renamed from: h */
    public final ajeu f70504h;

    /* renamed from: i */
    public final ajat f70505i;

    /* renamed from: j */
    public final aiyx f70506j;

    /* renamed from: k */
    public final ajfe f70507k;

    /* renamed from: l */
    public volatile int f70508l;

    /* renamed from: m */
    public bxxc f70509m;

    /* renamed from: n */
    public bxxc f70510n;

    /* renamed from: o */
    private final aiwt f70511o;

    public ajfd(Context context, ClientAppIdentifier clientAppIdentifier, buqh buqh, bxxc bxxc, String str, ajeu ajeu) {
        aiwt aiwt = ((aiws) ahgz.m55754a(context, aiws.class)).f69959b;
        this.f70501e = context;
        this.f70505i = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70502f = clientAppIdentifier;
        this.f70503g = buqh;
        this.f70510n = bxxc;
        this.f70504h = ajeu;
        this.f70500d = str.toLowerCase(Locale.US);
        this.f70499c = (ConnectivityManager) context.getSystemService("connectivity");
        this.f70506j = (aiyx) ahgz.m55754a(context, aiyx.class);
        byyl byyl = this.f70505i.f70278f.f168921d;
        this.f70508l = (byyl == null ? byyl.f168949v : byyl).f168959i;
        this.f70511o = aiwt;
        this.f70507k = new ajfe(this.f70501e, this.f70500d);
    }

    /* renamed from: a */
    public static int m58624a(int i) {
        if (i >= 500) {
            return 7;
        }
        if (i != 401) {
            return i != 403 ? 13 : 2806;
        }
        return 2805;
    }

    /* renamed from: c */
    private final byyu m58626c() {
        try {
            ModuleManager moduleManager = ModuleManager.get(this.f70501e);
            ModuleManager.ModuleInfo currentModule = moduleManager.getCurrentModule();
            ModuleManager.ModuleApkInfo currentModuleApk = moduleManager.getCurrentModuleApk();
            bxvf bxvf = (bxvf) byyu.f169014f.mo74144da();
            String str = currentModuleApk.apkPackageName;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byyu byyu = (byyu) bxvf.f164949b;
            str.getClass();
            int i = byyu.f169016a | 1;
            byyu.f169016a = i;
            byyu.f169017b = str;
            int i2 = currentModule.moduleVersion;
            byyu.f169016a = i | 4;
            byyu.f169019d = (long) i2;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = !"com.google.android.gms".equals(currentModuleApk.apkPackageName) ? Integer.valueOf(currentModuleApk.apkVersionCode) : "9999999";
            String format = String.format("%s.%s", objArr);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byyu byyu2 = (byyu) bxvf.f164949b;
            format.getClass();
            byyu2.f169016a |= 2;
            byyu2.f169018c = format;
            return (byyu) bxvf.mo74062i();
        } catch (IllegalStateException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajfd", "c", 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get nearby module version");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxxc mo38551a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bzcm mo38552a(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo38553a(bxxc bxxc, bxxc bxxc2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bzcl mo38567b(String str) {
        byyu byyu;
        String a;
        String str2 = str;
        bxvf bxvf = (bxvf) bzcl.f169356k.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcl bzcl = (bzcl) bxvf.f164949b;
        bzcl.f169358a |= 4;
        bzcl.f169361d = currentTimeMillis;
        if (!this.f70502f.mo44295c("0p:discoverer") && (a = this.f70511o.mo38180a()) != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcl bzcl2 = (bzcl) bxvf.f164949b;
            a.getClass();
            bzcl2.f169358a |= 8;
            bzcl2.f169362e = a;
        }
        bxvf bxvf2 = (bxvf) byyu.f169014f.mo74144da();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        byyu byyu2 = (byyu) bxvf2.f164949b;
        "com.google.android.gms".getClass();
        byyu2.f169016a |= 1;
        byyu2.f169017b = "com.google.android.gms";
        long b = (long) stu.m36316b();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        byyu byyu3 = (byyu) bxvf2.f164949b;
        byyu3.f169016a |= 4;
        byyu3.f169019d = b;
        String a2 = stu.m36315a();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        byyu byyu4 = (byyu) bxvf2.f164949b;
        a2.getClass();
        byyu4.f169016a |= 2;
        byyu4.f169018c = a2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcl bzcl3 = (bzcl) bxvf.f164949b;
        byyu byyu5 = (byyu) bxvf2.mo74062i();
        byyu5.getClass();
        bzcl3.f169360c = byyu5;
        bzcl3.f169358a |= 2;
        String str3 = null;
        try {
            ModuleManager moduleManager = ModuleManager.get(this.f70501e);
            ModuleManager.ModuleInfo currentModule = moduleManager.getCurrentModule();
            ModuleManager.ModuleApkInfo currentModuleApk = moduleManager.getCurrentModuleApk();
            bxvf bxvf3 = (bxvf) byyu.f169014f.mo74144da();
            String str4 = currentModuleApk.apkPackageName;
            if (bxvf3.f164950c) {
                bxvf3.mo74035c();
                bxvf3.f164950c = false;
            }
            byyu byyu6 = (byyu) bxvf3.f164949b;
            str4.getClass();
            int i = byyu6.f169016a | 1;
            byyu6.f169016a = i;
            byyu6.f169017b = str4;
            int i2 = currentModule.moduleVersion;
            bxvf bxvf4 = bxvf3;
            byyu6.f169016a = i | 4;
            byyu6.f169019d = (long) i2;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = !"com.google.android.gms".equals(currentModuleApk.apkPackageName) ? Integer.valueOf(currentModuleApk.apkVersionCode) : "9999999";
            String format = String.format("%s.%s", objArr);
            bxvf bxvf5 = bxvf4;
            if (bxvf5.f164950c) {
                bxvf5.mo74035c();
                bxvf5.f164950c = false;
            }
            byyu byyu7 = (byyu) bxvf5.f164949b;
            format.getClass();
            byyu7.f169016a |= 2;
            byyu7.f169018c = format;
            byyu = (byyu) bxvf5.mo74062i();
        } catch (IllegalStateException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajfd", "c", 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get nearby module version");
            byyu = null;
        }
        if (byyu != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcl bzcl4 = (bzcl) bxvf.f164949b;
            byyu.getClass();
            bzcl4.f169366i = byyu;
            bzcl4.f169358a |= 512;
        }
        if (str2 != null) {
            bxvf bxvf6 = (bxvf) byyu.f169014f.mo74144da();
            if (bxvf6.f164950c) {
                bxvf6.mo74035c();
                bxvf6.f164950c = false;
            }
            byyu byyu8 = (byyu) bxvf6.f164949b;
            str.getClass();
            byyu8.f169016a |= 1;
            byyu8.f169017b = str2;
            try {
                PackageInfo packageInfo = this.f70501e.getPackageManager().getPackageInfo(str2, 64);
                long j = (long) packageInfo.versionCode;
                if (bxvf6.f164950c) {
                    bxvf6.mo74035c();
                    bxvf6.f164950c = false;
                }
                byyu byyu9 = (byyu) bxvf6.f164949b;
                byyu9.f169016a |= 4;
                byyu9.f169019d = j;
                if (packageInfo.versionName != null) {
                    String str5 = packageInfo.versionName;
                    if (bxvf6.f164950c) {
                        bxvf6.mo74035c();
                        bxvf6.f164950c = false;
                    }
                    byyu byyu10 = (byyu) bxvf6.f164949b;
                    str5.getClass();
                    byyu10.f169016a |= 2;
                    byyu10.f169018c = str5;
                }
                String a3 = spn.m35850a(packageInfo);
                if (a3 != null) {
                    if (bxvf6.f164950c) {
                        bxvf6.mo74035c();
                        bxvf6.f164950c = false;
                    }
                    byyu byyu11 = (byyu) bxvf6.f164949b;
                    a3.getClass();
                    byyu11.f169016a |= 8;
                    byyu11.f169020e = a3;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68388c();
                bnsl2.mo68432a("ajfd", "a", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("%s Failed to find package for %s", "ServerTask: ", str2);
            }
            byyu byyu12 = (byyu) bxvf6.mo74062i();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcl bzcl5 = (bzcl) bxvf.f164949b;
            byyu12.getClass();
            bzcl5.f169359b = byyu12;
            bzcl5.f169358a |= 1;
        }
        byyl byyl = this.f70505i.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        String str6 = byyl.f168962l;
        if (!TextUtils.isEmpty(str6)) {
            bmxr a4 = bmxr.m108544a(",");
            ArrayList arrayList = new ArrayList();
            for (String str7 : str6.split(",")) {
                String trim = str7.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
            if (!arrayList.isEmpty()) {
                str3 = a4.mo66874a((Iterable) arrayList);
            }
        }
        if (str3 != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcl bzcl6 = (bzcl) bxvf.f164949b;
            str3.getClass();
            bzcl6.f169358a |= 64;
            bzcl6.f169365h = str3;
        }
        bxvf bxvf7 = (bxvf) byyv.f169022h.mo74144da();
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv = (byyv) bxvf7.f164949b;
        byyv.f169027d = 6;
        byyv.f169024a |= 4;
        String str8 = Build.MANUFACTURER;
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv2 = (byyv) bxvf7.f164949b;
        str8.getClass();
        byyv2.f169024a |= 1;
        byyv2.f169025b = str8;
        String str9 = Build.MODEL;
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv3 = (byyv) bxvf7.f164949b;
        str9.getClass();
        byyv3.f169024a |= 2;
        byyv3.f169026c = str9;
        String str10 = Build.VERSION.RELEASE;
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv4 = (byyv) bxvf7.f164949b;
        str10.getClass();
        byyv4.f169024a |= 8;
        byyv4.f169028e = str10;
        int i3 = Build.VERSION.SDK_INT;
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv5 = (byyv) bxvf7.f164949b;
        byyv5.f169024a |= 16;
        byyv5.f169029f = i3;
        float f = this.f70501e.getResources().getDisplayMetrics().density;
        if (bxvf7.f164950c) {
            bxvf7.mo74035c();
            bxvf7.f164950c = false;
        }
        byyv byyv6 = (byyv) bxvf7.f164949b;
        byyv6.f169024a |= 32;
        byyv6.f169030g = f;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcl bzcl7 = (bzcl) bxvf.f164949b;
        byyv byyv7 = (byyv) bxvf7.mo74062i();
        byyv7.getClass();
        bzcl7.f169363f = byyv7;
        bzcl7.f169358a |= 16;
        String str11 = this.f70505i.f70275c.f168919b;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcl bzcl8 = (bzcl) bxvf.f164949b;
        str11.getClass();
        bzcl8.f169358a |= 32;
        bzcl8.f169364g = str11;
        String U = cfop.f185115a.mo6606a().mo82217U();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcl bzcl9 = (bzcl) bxvf.f164949b;
        U.getClass();
        bzcl9.f169358a |= 1024;
        bzcl9.f169367j = U;
        return (bzcl) bxvf.mo74062i();
    }

    /* renamed from: a */
    private final byyu m58625a(String str) {
        bxvf bxvf = (bxvf) byyu.f169014f.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byyu byyu = (byyu) bxvf.f164949b;
        str.getClass();
        byyu.f169016a |= 1;
        byyu.f169017b = str;
        try {
            PackageInfo packageInfo = this.f70501e.getPackageManager().getPackageInfo(str, 64);
            long j = (long) packageInfo.versionCode;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byyu byyu2 = (byyu) bxvf.f164949b;
            byyu2.f169016a |= 4;
            byyu2.f169019d = j;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                byyu byyu3 = (byyu) bxvf.f164949b;
                str2.getClass();
                byyu3.f169016a |= 2;
                byyu3.f169018c = str2;
            }
            String a = spn.m35850a(packageInfo);
            if (a != null) {
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                byyu byyu4 = (byyu) bxvf.f164949b;
                a.getClass();
                byyu4.f169016a |= 8;
                byyu4.f169020e = a;
            }
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("ajfd", "a", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s Failed to find package for %s", "ServerTask: ", str);
        }
        return (byyu) bxvf.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ajec mo38550a(String str, int i) {
        return new ajec(this.f70501e, str, i);
    }

    /* renamed from: b */
    public final void mo38568b() {
        String str;
        int i;
        String str2;
        int i2;
        this.f70503g.mo72984b();
        if (this.f70509m == null) {
            bxxc a = mo38551a();
            this.f70509m = a;
            if (a == null) {
                throw new IllegalStateException("getRequest() cannot return null.");
            }
        }
        String str3 = null;
        try {
            NetworkInfo activeNetworkInfo = this.f70499c.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                throw new IOException("Not connected");
            }
            if (!this.f70502f.equals(ClientAppIdentifier.f80666a)) {
                ClientAppIdentifier clientAppIdentifier = this.f70502f;
                String str4 = clientAppIdentifier.f80668c.f80723b;
                if (!clientAppIdentifier.mo44293b()) {
                    str2 = null;
                } else if ("0p:discoverer".equals(this.f70502f.f80668c.f80724c)) {
                    str2 = cfop.f185115a.mo6606a().mo82236o();
                    str4 = "com.google.android.gms";
                } else {
                    ClientAppContext clientAppContext = this.f70502f.f80668c;
                    if (clientAppContext.f80725d || clientAppContext.f80727f != null) {
                        str2 = clientAppContext.f80727f;
                    } else {
                        str2 = "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk";
                        str4 = "com.google.android.gms";
                    }
                }
                if (str2 == null) {
                    str2 = spn.m35849a(this.f70501e, str4, "com.google.android.nearby.messages.API_KEY");
                }
                i = 9729;
                str = str4;
            } else {
                str2 = cfop.f185115a.mo6606a().mo82224c();
                String packageName = this.f70501e.getPackageName();
                String Y = cfop.f185115a.mo6606a().mo82221Y();
                if (!TextUtils.isEmpty(Y)) {
                    packageName = Y;
                }
                i = 9730;
                str = packageName;
            }
            ClientAppIdentifier clientAppIdentifier2 = this.f70502f;
            if (clientAppIdentifier2 == null || "com.google.android.gms".equals(clientAppIdentifier2.mo44291a())) {
                Set b = ajgw.m58696b(this.f70501e);
                if (!b.isEmpty()) {
                    clientAppIdentifier2 = (ClientAppIdentifier) bnjd.m109588b(b, new Random().nextInt(b.size()));
                } else {
                    clientAppIdentifier2 = null;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            }
            ajec a2 = mo38550a(str3, i);
            Context context = this.f70501e;
            if (clientAppIdentifier2 != null) {
                String a3 = clientAppIdentifier2.mo44291a();
                if (TextUtils.isEmpty(a3)) {
                    i2 = spn.f44932a;
                } else {
                    int i3 = spn.m35897i(context, a3);
                    if (i3 == -1) {
                        i3 = spn.f44932a;
                    }
                    i2 = i3;
                }
            } else {
                i2 = spn.f44932a;
            }
            ClientContext clientContext = new ClientContext(i2, (Account) null, (Account) null, str, str);
            this.f70507k.mo38571a(a2.mo38542a(this.f70500d), this.f70509m, a2.mo25519a(a2.f44453i, clientContext));
            String str5 = this.f70500d;
            byte[] k = this.f70509m.serializeToBytes();
            bxxc bxxc = this.f70510n;
            ajfc ajfc = this.f70498b;
            a2.mo25522a(clientContext, str5, k, bxxc, ajfc, ajfc);
        } catch (IOException e) {
            srn srn = ahfq.f67120a;
            this.f70506j.mo38318a(this.f70502f, this.f70509m, -1);
            mo38569b(7);
            this.f70507k.mo38571a((String) null, this.f70509m, (Map) null);
            this.f70507k.mo38570a((bxxc) null, -1, (Map) null);
        }
    }

    /* renamed from: b */
    public final void mo38569b(int i) {
        srn srn = ahfq.f67120a;
        ajev ajev = this.f70497a;
        ajev.f70485a = i;
        this.f70503g.mo72987c(ajev);
    }
}

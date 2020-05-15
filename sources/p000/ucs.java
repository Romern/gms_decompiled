package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.api.ApiChimeraService;
import java.io.File;
import java.util.Collections;

/* renamed from: ucs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucs extends aaab {

    /* renamed from: a */
    private static final sbw f47253a = new sbw("ClientConnectOperation", "");

    /* renamed from: b */
    private final ApiChimeraService f47254b;

    /* renamed from: c */
    private final aaag f47255c;

    /* renamed from: d */
    private final ubm f47256d;

    /* renamed from: e */
    private final int f47257e;

    /* renamed from: f */
    private final String f47258f;

    /* renamed from: g */
    private final String f47259g;

    /* renamed from: h */
    private final Account f47260h;

    /* renamed from: i */
    private final Account f47261i;

    /* renamed from: j */
    private final String[] f47262j;

    /* renamed from: k */
    private final aaac f47263k;

    /* renamed from: l */
    private final int f47264l;

    /* renamed from: o */
    private final vcy f47265o;

    /* renamed from: p */
    private final int f47266p;

    /* renamed from: q */
    private final boolean f47267q;

    /* renamed from: r */
    private final String f47268r;

    /* renamed from: s */
    private final long f47269s = SystemClock.uptimeMillis();

    /* renamed from: t */
    private final uoo f47270t;

    /* renamed from: u */
    private final boolean f47271u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucs(ApiChimeraService apiChimeraService, aaag aaag, ubm ubm, int i, String str, String str2, Account account, Account account2, String[] strArr, aaac aaac, int i2, vcy vcy, int i3, boolean z, String str3) {
        super(11, "ClientConnectOperation");
        boolean z2;
        int i4;
        aaac aaac2 = aaac;
        int i5 = i3;
        this.f47254b = apiChimeraService;
        this.f47255c = aaag;
        this.f47256d = ubm;
        sdo.m34977c(str);
        this.f47258f = str;
        this.f47259g = str2;
        this.f47260h = account;
        this.f47261i = account2;
        this.f47262j = strArr;
        this.f47263k = aaac2;
        this.f47264l = i2;
        this.f47265o = vcy;
        this.f47266p = i5;
        this.f47267q = z;
        this.f47268r = str3;
        this.f47270t = new uoo();
        if (!rfz.m33557a(vpu.m41034a().f49755b).mo24610b(this.f47258f) || TextUtils.isEmpty(this.f47259g) || this.f47258f.equals(this.f47259g)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f47271u = z2;
        if (z2) {
            try {
                i4 = svr.m36484b(vpu.m41034a().f49755b).mo26176b(str2, 0).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e) {
                aaac2.mo16650a(8, (Bundle) null);
                String valueOf = String.valueOf(str2);
                throw new ucr(valueOf.length() == 0 ? new String("Bad package name: ") : "Bad package name: ".concat(valueOf), e);
            }
        } else {
            i4 = i;
        }
        this.f47257e = i4;
        if (!this.f47271u) {
            if (i5 != 0) {
                this.f47263k.mo16650a(10, (Bundle) null);
                StringBuilder sb = new StringBuilder(76);
                sb.append("Proxied package name has not been provided but proxyType is set: ");
                sb.append(i5);
                throw new ucr(sb.toString());
            }
        } else if (i5 == 0) {
            this.f47263k.mo16650a(10, (Bundle) null);
            String valueOf2 = String.valueOf(str2);
            throw new ucr(valueOf2.length() == 0 ? new String("ProxyType is NO_PROXY but proxied package name has been provided: ") : "ProxyType is NO_PROXY but proxied package name has been provided: ".concat(valueOf2));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent
     arg types: [java.lang.String, com.google.android.gms.common.api.Scope[], int]
     candidates:
      sbv.a(android.content.Context, java.lang.String, java.lang.String):void
      sbv.a(android.content.Context, java.lang.String, int[]):void
      sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0405, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x040e, code lost:
        throw new p000.ues("See https://developers.google.com/drive/android/auth for details on authorizing an application.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x040f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x041a, code lost:
        throw new p000.ues(r0, r0.mo7366a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x041b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x041d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x041e, code lost:
        r16 = "pendingIntent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0420, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0423, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0424, code lost:
        r16 = "pendingIntent";
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        p000.ucs.f47253a.mo25377c("ClientConnectOperation", "Interrupted while awaiting initialization");
        r1.f47263k.mo16650a(8, (android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r4.mo28249a(true);
        r4.mo28250b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0444, code lost:
        throw new p000.ucr("Unable to initialize Drive API.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0445, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x045a, code lost:
        r2 = new android.os.Bundle();
        r2.putParcelable(r16, android.app.PendingIntent.getActivity(r6, 0, r7, r7.getFlags()));
        r1.f47263k.mo16650a(4, r2);
        r8 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0479, code lost:
        if (r2.getCause() == null) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x048b, code lost:
        r1.f47263k.mo16650a(7, (android.os.Bundle) null);
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0494, code lost:
        r1.f47263k.mo16650a(8, (android.os.Bundle) null);
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (p000.cdqm.f181559a.mo6606a().mo78180c() != false) goto L_0x0060;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x029b A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x029c A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032b A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x032c A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034c A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x034f A[Catch:{ ues -> 0x041d, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x044c A[ExcHandler: ucr (e ucr), Splitter:B:67:0x01ac] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x045a A[Catch:{ all -> 0x0449 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0475 A[Catch:{ all -> 0x0449 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f A[Catch:{ ues -> 0x004b, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[Catch:{ ues -> 0x004b, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012a A[Catch:{ ues -> 0x004b, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015a A[Catch:{ ues -> 0x004b, ucr -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4 A[SYNTHETIC, Splitter:B:71:0x01b4] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0202 A[SYNTHETIC, Splitter:B:93:0x0202] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        ues ues;
        Intent intent;
        int i;
        boolean z;
        Account account;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        String a;
        String str4;
        String str5;
        boolean z5;
        String str6;
        String str7;
        Context context2 = context;
        vcu d = this.f47265o.mo28301d();
        vcr b = this.f47265o.mo28294b();
        b.mo28227a(this.f47266p);
        if (!this.f47271u) {
            str = this.f47258f;
        } else {
            str = this.f47259g;
        }
        b.mo28228a(str);
        try {
            uoo uoo = this.f47270t;
            String str8 = this.f47258f;
            String str9 = this.f47259g;
            int i2 = 16;
            if (!"com.google.android.gms".equals(str8)) {
                try {
                    uon a2 = uoo.mo27774a(str8);
                    if (a2 == null ? cdqm.f181559a.mo6606a().mo78184g() : a2.f48412a) {
                    }
                } catch (ues e) {
                    ues = e;
                    str2 = "pendingIntent";
                } catch (ucr e2) {
                }
                try {
                    if (sre.m36080a(context)) {
                        Account account2 = this.f47261i;
                        if (account2 != null && "cn.google".equals(account2.type)) {
                            if (sqc.m35958a(this.f47262j, "https://www.googleapis.com/auth/drive.appdata")) {
                                int i3 = 0;
                                while (true) {
                                    String[] strArr = this.f47262j;
                                    if (i3 < strArr.length) {
                                        String str10 = strArr[i3];
                                        if ("https://www.googleapis.com/auth/drive.apps".equalsIgnoreCase(str10) || "https://www.googleapis.com/auth/drive.file".equalsIgnoreCase(str10) || "https://www.googleapis.com/auth/drive".equalsIgnoreCase(str10)) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            f47253a.mo25377c("ClientConnectOperation", "Blocking Sidewinder in Drive connection");
                            this.f47263k.mo16650a(16, (Bundle) null);
                            d.mo28245a();
                            b.mo28226a();
                            vcy vcy = this.f47265o;
                            vcy.mo28307h();
                            vcy.mo28274a();
                        }
                    }
                    if (this.f47268r != null) {
                        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                        sb.append(valueOf);
                        sb.append("/traces");
                        File file = new File(sb.toString());
                        if (!file.exists()) {
                            if (!file.mkdir()) {
                                f47253a.mo25374b("ClientConnectOperation", "Tried to start method trace but was unable to create file: %s", file.getAbsolutePath());
                            }
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        String absolutePath = file.getAbsolutePath();
                        String str11 = this.f47268r;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str11).length());
                        sb2.append(absolutePath);
                        sb2.append("/");
                        sb2.append(str11);
                        Debug.startMethodTracingSampling(sb2.toString(), 67108864, 1000);
                        z = true;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        d.mo28249a(tws.m37569b(this.f47254b));
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        account = this.f47261i;
                        if (account == null) {
                            String str12 = !this.f47271u ? this.f47258f : this.f47259g;
                            Account a3 = soz.m35782a(vpu.m41034a().f49755b, this.f47260h, str12);
                            if (a3 == null) {
                                Account account3 = this.f47260h;
                                if (account3 != null) {
                                    str3 = account3.name;
                                } else {
                                    str3 = null;
                                }
                                if ("<<default account>>".equals(str3)) {
                                    PendingIntent activity = PendingIntent.getActivity(this.f47254b.getApplicationContext(), 0, sbv.m34873a(str12, (Scope[]) stc.m36282a(this.f47262j).toArray(new Scope[this.f47262j.length]), true), 134217728);
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("pendingIntent", activity);
                                    this.f47263k.mo16650a(4, bundle);
                                    d.mo28250b(4);
                                } else {
                                    this.f47263k.mo16650a(5, (Bundle) null);
                                    d.mo28250b(2);
                                }
                                throw new ucr("Unable to resolve account name.");
                            }
                            account = a3;
                        }
                        vcy vcy2 = this.f47265o;
                        vcy2.mo28284a(account.name);
                        vcy2.mo28275a(this.f47264l);
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        ClientContext clientContext = new ClientContext();
                        clientContext.f30212b = this.f47257e;
                        String str13 = this.f47258f;
                        clientContext.f30215e = str13;
                        if (this.f47271u) {
                            str13 = this.f47259g;
                        }
                        clientContext.f30216f = str13;
                        clientContext.f30214d = this.f47260h;
                        clientContext.f30213c = account;
                        clientContext.mo17799a(this.f47262j);
                        ubk ubk = new ubk(clientContext, this.f47264l, this.f47266p, vpu.m41034a());
                        if (this.f47267q) {
                            str2 = "pendingIntent";
                        } else {
                            uhn uhn = vpu.m41034a().f49757d;
                            vcg vcg = vpu.m41034a().f49763j;
                            uey uey = ubk.f47143d;
                            str2 = "pendingIntent";
                            int i5 = 101;
                            if (uey.f47398e.contains(twt.f46773b)) {
                                ujl c = uhn.mo27429c(uey);
                                sdo.m34966a(c, "Connected App does not exist");
                                if (c.f47796e.booleanValue()) {
                                    i5 = 102;
                                }
                            }
                            vcg.mo28218a(uey.f47394a.f47682a, i5, 2, Collections.singletonList(uey.f47396c.f30764b));
                        }
                        ubm ubm = this.f47256d;
                        ApiChimeraService apiChimeraService = this.f47254b;
                        aaag aaag = this.f47255c;
                        aaac aaac = this.f47263k;
                        long j = uptimeMillis3;
                        ubn ubn = new ubn(apiChimeraService, aaag, ubk, ubm.f47165a, ubm.f47166b, aaac, z);
                        aaac.mo16654a((IBinder.DeathRecipient) ubn);
                        aaac aaac2 = this.f47263k;
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("com.google.android.gms.drive.root_id", ubk.mo27087b());
                        bundle2.putParcelable("com.google.android.gms.drive.appdata_id", ubk.mo27090c());
                        aaac2.mo16653a(ubn, bundle2);
                        uey uey2 = ubk.f47143d;
                        b.mo28229b(uey2.f47395b);
                        long uptimeMillis4 = SystemClock.uptimeMillis();
                        d.mo28247a(uey2.f47398e);
                        d.mo28248a(ubk.f47158s);
                        d.mo28253e((int) (uptimeMillis - this.f47269s));
                        d.mo28252d((int) (uptimeMillis2 - uptimeMillis));
                        d.mo28246a((int) (j - uptimeMillis2));
                        d.mo28251c((int) (uptimeMillis4 - j));
                        d.mo28250b(5);
                        d.mo28245a();
                        b.mo28226a();
                        vcy vcy3 = this.f47265o;
                        vcy3.mo28307h();
                        vcy3.mo28274a();
                    }
                    z = false;
                    long uptimeMillis5 = SystemClock.uptimeMillis();
                    d.mo28249a(tws.m37569b(this.f47254b));
                    long uptimeMillis22 = SystemClock.uptimeMillis();
                    account = this.f47261i;
                    if (account == null) {
                    }
                    vcy vcy22 = this.f47265o;
                    vcy22.mo28284a(account.name);
                    vcy22.mo28275a(this.f47264l);
                    long uptimeMillis32 = SystemClock.uptimeMillis();
                    ClientContext clientContext2 = new ClientContext();
                    clientContext2.f30212b = this.f47257e;
                    String str132 = this.f47258f;
                    clientContext2.f30215e = str132;
                    if (this.f47271u) {
                    }
                    clientContext2.f30216f = str132;
                    clientContext2.f30214d = this.f47260h;
                    clientContext2.f30213c = account;
                    clientContext2.mo17799a(this.f47262j);
                    ubk ubk2 = new ubk(clientContext2, this.f47264l, this.f47266p, vpu.m41034a());
                    if (this.f47267q) {
                    }
                    ubm ubm2 = this.f47256d;
                    ApiChimeraService apiChimeraService2 = this.f47254b;
                    aaag aaag2 = this.f47255c;
                    aaac aaac3 = this.f47263k;
                    long j2 = uptimeMillis32;
                    ubn ubn2 = new ubn(apiChimeraService2, aaag2, ubk2, ubm2.f47165a, ubm2.f47166b, aaac3, z);
                    aaac3.mo16654a((IBinder.DeathRecipient) ubn2);
                    aaac aaac22 = this.f47263k;
                    Bundle bundle22 = new Bundle();
                    bundle22.putParcelable("com.google.android.gms.drive.root_id", ubk2.mo27087b());
                    bundle22.putParcelable("com.google.android.gms.drive.appdata_id", ubk2.mo27090c());
                    aaac22.mo16653a(ubn2, bundle22);
                    uey uey22 = ubk2.f47143d;
                    b.mo28229b(uey22.f47395b);
                    long uptimeMillis42 = SystemClock.uptimeMillis();
                    d.mo28247a(uey22.f47398e);
                    d.mo28248a(ubk2.f47158s);
                    d.mo28253e((int) (uptimeMillis5 - this.f47269s));
                    d.mo28252d((int) (uptimeMillis22 - uptimeMillis5));
                    d.mo28246a((int) (j2 - uptimeMillis22));
                    d.mo28251c((int) (uptimeMillis42 - j2));
                    d.mo28250b(5);
                } catch (ues e3) {
                    e = e3;
                    ues = e;
                    try {
                        ApiChimeraService apiChimeraService3 = this.f47254b;
                        intent = ues.f47368a;
                        if (intent != null) {
                        }
                        d.mo28250b(i);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        d.mo28245a();
                        b.mo28226a();
                        vcy vcy4 = this.f47265o;
                        vcy4.mo28307h();
                        vcy4.mo28274a();
                        throw th2;
                    }
                } catch (ucr e22) {
                }
                d.mo28245a();
                b.mo28226a();
                vcy vcy32 = this.f47265o;
                vcy32.mo28307h();
                vcy32.mo28274a();
            }
            if (str9 != null) {
            }
            if (sre.m36080a(context)) {
            }
            if (this.f47268r != null) {
            }
            z = false;
            long uptimeMillis52 = SystemClock.uptimeMillis();
            d.mo28249a(tws.m37569b(this.f47254b));
            long uptimeMillis222 = SystemClock.uptimeMillis();
            account = this.f47261i;
            if (account == null) {
            }
            vcy vcy222 = this.f47265o;
            vcy222.mo28284a(account.name);
            vcy222.mo28275a(this.f47264l);
            long uptimeMillis322 = SystemClock.uptimeMillis();
            ClientContext clientContext22 = new ClientContext();
            clientContext22.f30212b = this.f47257e;
            String str1322 = this.f47258f;
            clientContext22.f30215e = str1322;
            if (this.f47271u) {
            }
            clientContext22.f30216f = str1322;
            clientContext22.f30214d = this.f47260h;
            clientContext22.f30213c = account;
            clientContext22.mo17799a(this.f47262j);
            ubk ubk22 = new ubk(clientContext22, this.f47264l, this.f47266p, vpu.m41034a());
            if (this.f47267q) {
            }
            ubm ubm22 = this.f47256d;
            ApiChimeraService apiChimeraService22 = this.f47254b;
            aaag aaag22 = this.f47255c;
            aaac aaac32 = this.f47263k;
            long j22 = uptimeMillis322;
            ubn ubn22 = new ubn(apiChimeraService22, aaag22, ubk22, ubm22.f47165a, ubm22.f47166b, aaac32, z);
            aaac32.mo16654a((IBinder.DeathRecipient) ubn22);
            aaac aaac222 = this.f47263k;
            Bundle bundle222 = new Bundle();
            bundle222.putParcelable("com.google.android.gms.drive.root_id", ubk22.mo27087b());
            bundle222.putParcelable("com.google.android.gms.drive.appdata_id", ubk22.mo27090c());
            aaac222.mo16653a(ubn22, bundle222);
            uey uey222 = ubk22.f47143d;
            b.mo28229b(uey222.f47395b);
            long uptimeMillis422 = SystemClock.uptimeMillis();
            d.mo28247a(uey222.f47398e);
            d.mo28248a(ubk22.f47158s);
            d.mo28253e((int) (uptimeMillis52 - this.f47269s));
            d.mo28252d((int) (uptimeMillis222 - uptimeMillis52));
            d.mo28246a((int) (j22 - uptimeMillis222));
            d.mo28251c((int) (uptimeMillis422 - j22));
            d.mo28250b(5);
            d.mo28245a();
            b.mo28226a();
            vcy vcy322 = this.f47265o;
            vcy322.mo28307h();
            vcy322.mo28274a();
            uoo uoo2 = this.f47270t;
            aaac aaac4 = this.f47263k;
            String str14 = this.f47258f;
            uon a4 = uoo2.mo27774a(str14);
            if (a4 != null) {
                if (a4.f48413b) {
                    if (a4.f48415d) {
                        z2 = true;
                    } else if (uoo.f48417a.add(str14)) {
                        z2 = true;
                    }
                    if (z2 || !a4.f48414c) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2) {
                        z4 = z3;
                    } else if (!z3) {
                        String a5 = uoo.m39099a(str14, context2);
                        if (a5 != null) {
                            Resources resources = context.getResources();
                            String string = resources.getString(C0126R.string.drive_deprecation_update_1p_dialog_title, a5);
                            if (a4.f48416e) {
                                str7 = resources.getString(C0126R.string.drive_deprecation_update_1p_dialog_message_filepicker, a5);
                            } else {
                                str7 = resources.getString(C0126R.string.drive_deprecation_update_1p_dialog_message, a5);
                            }
                            String string2 = resources.getString(C0126R.string.drive_deprecation_update_1p_dialog_positive_button_text);
                            PendingIntent activity2 = PendingIntent.getActivity(context2, 0, sbv.m34879b(str14), 0);
                            sex a6 = sex.m35104a(context);
                            if (a6 != null) {
                                z4 = z3;
                                C1102je jeVar = new C1102je(context2, "updateDialogNotificationChannelId");
                                jeVar.mo13640e(string);
                                jeVar.mo13632b(str7);
                                C1101jd jdVar = new C1101jd();
                                jdVar.mo13593a(str7);
                                jeVar.mo13626a(jdVar);
                                jeVar.mo13630b(qkj.m32287a(context2, C0126R.C0127drawable.quantum_ic_warning_grey600_24));
                                jeVar.mo13618a((int) C0126R.C0127drawable.quantum_ic_update_grey600_24, string2, activity2);
                                jeVar.f22254f = activity2;
                                jeVar.mo13627a(true);
                                jeVar.f22268t = true;
                                jeVar.f22258j = 0;
                                a6.mo25441a(str14.hashCode(), jeVar.mo13629b());
                            } else {
                                z4 = z3;
                            }
                        } else {
                            z4 = z3;
                        }
                    } else {
                        z4 = z3;
                    }
                    a = uoo.m39099a(str14, context2);
                    Resources resources2 = context.getResources();
                    if (a == null) {
                        str4 = resources2.getString(C0126R.string.drive_deprecation_update_1p_dialog_title, a);
                        if (a4.f48416e) {
                            str6 = resources2.getString(C0126R.string.drive_deprecation_update_1p_dialog_message_filepicker, a);
                        } else {
                            str6 = resources2.getString(C0126R.string.drive_deprecation_update_1p_dialog_message, a);
                        }
                        str5 = str6;
                        z5 = z4;
                    } else {
                        z5 = false;
                        str5 = null;
                        str4 = null;
                    }
                    PendingIntent activity3 = PendingIntent.getActivity(context2, 0, new Intent().setClassName(context2, "com.google.android.gms.drive.deprecation.UpgradeDialogActivity").putExtra("callingPackage", str14).putExtra("dialogTitle", str4).putExtra("dialogMessage", str5).putExtra("showDialog", z5), 134217728);
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("pendingIntent", activity3);
                    aaac4.mo16650a(6, bundle3);
                    i2 = 6;
                }
                z2 = false;
                if (z2) {
                }
                z3 = false;
                if (z2) {
                }
                a = uoo.m39099a(str14, context2);
                Resources resources22 = context.getResources();
                if (a == null) {
                }
                PendingIntent activity32 = PendingIntent.getActivity(context2, 0, new Intent().setClassName(context2, "com.google.android.gms.drive.deprecation.UpgradeDialogActivity").putExtra("callingPackage", str14).putExtra("dialogTitle", str4).putExtra("dialogMessage", str5).putExtra("showDialog", z5), 134217728);
                Bundle bundle32 = new Bundle();
                bundle32.putParcelable("pendingIntent", activity32);
                aaac4.mo16650a(6, bundle32);
                i2 = 6;
            } else {
                aaac4.mo16650a(16, (Bundle) null);
            }
            d.mo28250b(i2);
        } catch (ues e4) {
            e = e4;
            String str15 = "pendingIntent";
            ues = e;
            ApiChimeraService apiChimeraService32 = this.f47254b;
            intent = ues.f47368a;
            if (intent != null) {
            }
            d.mo28250b(i);
        } catch (ucr e222) {
        }
        d.mo28245a();
        b.mo28226a();
        vcy vcy3222 = this.f47265o;
        vcy3222.mo28307h();
        vcy3222.mo28274a();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        f47253a.mo25377c("ClientConnectOperation", "Handling failure");
        this.f47263k.mo16650a(status.f30115i, (Bundle) null);
    }
}

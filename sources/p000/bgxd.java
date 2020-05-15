package p000;

import android.accounts.Account;
import android.os.Parcel;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.location.reporting.service.InternalPreferenceChimeraServiceDoNotUse;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiUserSettings;
import com.google.android.ulr.SetApiRemoteDeviceSettingsReply;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bgxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxd extends dck implements bgxe {

    /* renamed from: a */
    final /* synthetic */ InternalPreferenceChimeraServiceDoNotUse f117887a;

    public bgxd() {
        super("com.google.android.location.reporting.service.IPreferenceService");
    }

    /* renamed from: a */
    public final AccountConfig mo63304a(Account account) {
        return this.f117887a.f150878a.mo63353a(account);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:8:0x0025 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:70:0x017d */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.String} */
    /* JADX WARN: Type inference failed for: r2v9, assign insn: PHI: (r2v9 ?) = (r2v0 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0025, B:70:0x017d] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwd.a(java.lang.String, boolean):bxvd
     arg types: [java.lang.String, int]
     candidates:
      bgwd.a(android.content.Context, android.accounts.Account):com.google.android.gms.common.internal.ClientContext
      bgwd.a(java.lang.String, boolean):bxvd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0253, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0256, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        p000.bgux.m100116e(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x025b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x025f, code lost:
        r2 = r1;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0261, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r1.mo63300a(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0266, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0267, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0269, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ac, code lost:
        r3 = r0;
        r1 = r23;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b2, code lost:
        r2 = r1;
        r3 = r0;
        r1 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0267 A[ExcHandler: IOException | NullPointerException (e java.lang.Throwable), Splitter:B:1:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0269 A[ExcHandler: chuw (e chuw), Splitter:B:1:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[Catch:{ gid -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018b A[Catch:{ gid -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019f A[Catch:{ gid -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a4 A[Catch:{ gid -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* renamed from: b */
    public final List mo63307b(Account account) {
        Account account2;
        bgwx bgwx;
        bgwu bgwu;
        bgwx bgwx2;
        Account account3;
        String str;
        Formatter formatter;
        ClientContext clientContext;
        ApiUserSettings apiUserSettings;
        Account account4;
        Account account5 = account;
        String str2 = "Cannot call from UI thread.";
        sdo.m34973b(str2);
        try {
            bgwx bgwx3 = this.f117887a.f150879b;
            int b = bgwx3.f117871a.mo63359b(account5);
            String a = bgwx3.mo63298a(account5);
            if (!chcp.m148196e()) {
                bgwl bgwl = bgwx3.f117872b;
                bgwr a2 = bgwk.m100163a(bgwl.f117827i);
                try {
                    bjcy bjcy = new bjcy(a2);
                    ClientContext a3 = bgwl.m100164a(bgwl.f117827i, account5);
                    a2.f117860m = bgwg.f117820a;
                    Integer valueOf = Integer.valueOf(b);
                    String str3 = bgwl.f117809f;
                    String str4 = bgwl.f117807d;
                    String str5 = bgwl.f117806c;
                    Integer valueOf2 = Integer.valueOf(bgwl.f117828j);
                    Boolean bool = bgwl.f117832n;
                    String str6 = bgwl.f117811h;
                    String str7 = bgwl.f117810g;
                    Integer valueOf3 = Integer.valueOf(bgwl.f117830l);
                    Integer valueOf4 = Integer.valueOf(bgwl.f117804a);
                    Integer valueOf5 = Integer.valueOf(bgwl.f117829k);
                    String str8 = bgwl.f117805b;
                    if (chcj.m148167e()) {
                        str = "android";
                    } else {
                        str = null;
                    }
                    String str9 = bgwl.f117808e;
                    StringBuilder sb = new StringBuilder();
                    bgwx2 = bgwx3;
                    try {
                        formatter = new Formatter(sb);
                        clientContext = a3;
                    } catch (gid e) {
                        e = e;
                        gid gid = e;
                        if (chcy.m148488d()) {
                        }
                        throw gid;
                    } catch (VolleyError e2) {
                        e = e2;
                        str2 = account5;
                        VolleyError volleyError = e;
                        bgwl.m100165a(volleyError);
                        if (chcy.m148488d()) {
                        }
                        throw new IOException(volleyError);
                    } catch (Throwable th) {
                        th = th;
                        account3 = account5;
                        throw th;
                    }
                    try {
                        formatter.format("userSettings/%1$s", String.valueOf(valueOf));
                        if (a != null) {
                            shd.m35269a(sb, "androidGcmRegistrationId", shd.m35267a(a));
                        }
                        if (str3 != null) {
                            shd.m35269a(sb, "brand", shd.m35267a(str3));
                        }
                        if (str4 != null) {
                            shd.m35269a(sb, "device", shd.m35267a(str4));
                        }
                        if (str5 != null) {
                            shd.m35269a(sb, "devicePrettyName", shd.m35267a(str5));
                        }
                        shd.m35269a(sb, "deviceRestriction", shd.m35267a("noRestriction"));
                        shd.m35269a(sb, "gmsVersion", String.valueOf(valueOf2));
                        if (bool != null) {
                            shd.m35269a(sb, "isLowRam", String.valueOf(bool));
                        }
                        if (str6 != null) {
                            shd.m35269a(sb, "manufacturer", shd.m35267a(str6));
                        }
                        if (str7 != null) {
                            shd.m35269a(sb, "model", shd.m35267a(str7));
                        }
                        shd.m35269a(sb, "moduleVersion", String.valueOf(valueOf3));
                        shd.m35269a(sb, "nlpVersion", String.valueOf((Object) 2023));
                        shd.m35269a(sb, "osLevel", String.valueOf(valueOf4));
                        shd.m35269a(sb, "packageVersion", String.valueOf(valueOf5));
                        if (str8 != null) {
                            shd.m35269a(sb, "platform", shd.m35267a(str8));
                        }
                        if (str != null) {
                            shd.m35269a(sb, "platformType", shd.m35267a(str));
                        }
                        if (str9 != null) {
                            shd.m35269a(sb, BuildConfig.FLAVOR_mode, shd.m35267a(str9));
                        }
                        apiUserSettings = (ApiUserSettings) bjcy.f122528a.mo25536a(clientContext, 0, sb.toString(), (Object) null, ApiUserSettings.class);
                        bgux.m100116e(true);
                        account4 = account;
                    } catch (gid e3) {
                        e = e3;
                        gid gid2 = e;
                        if (chcy.m148488d()) {
                        }
                        throw gid2;
                    } catch (VolleyError e4) {
                        e = e4;
                        str2 = account;
                        VolleyError volleyError2 = e;
                        bgwl.m100165a(volleyError2);
                        if (chcy.m148488d()) {
                        }
                        throw new IOException(volleyError2);
                    } catch (Throwable th2) {
                        th = th2;
                        account3 = account;
                        throw th;
                    }
                    try {
                        bgwu = bgwu.m100186a(account4, apiUserSettings);
                        bgwx = bgwx2;
                        account2 = account4;
                    } catch (gid e5) {
                        e = e5;
                        gid gid22 = e;
                        if (chcy.m148488d()) {
                            bgux.m100116e(false);
                        } else {
                            bgux.m100105c(gid22);
                        }
                        throw gid22;
                    } catch (VolleyError e6) {
                        e = e6;
                        str2 = account4;
                        VolleyError volleyError22 = e;
                        bgwl.m100165a(volleyError22);
                        if (chcy.m148488d()) {
                            bgux.m100116e(false);
                        } else {
                            bgux.m100105c(volleyError22);
                        }
                        throw new IOException(volleyError22);
                    }
                } catch (gid e7) {
                    e = e7;
                    gid gid222 = e;
                    if (chcy.m148488d()) {
                    }
                    throw gid222;
                } catch (VolleyError e8) {
                    e = e8;
                    str2 = account5;
                    bgwx2 = bgwx3;
                    VolleyError volleyError222 = e;
                    bgwl.m100165a(volleyError222);
                    if (chcy.m148488d()) {
                    }
                    throw new IOException(volleyError222);
                } catch (Throwable th3) {
                    th = th3;
                    account3 = str2;
                    throw th;
                }
            } else {
                account2 = account5;
                bgwx = bgwx3;
                bgwd bgwd = bgwx.f117873c;
                bvwb bvwb = (bvwb) bgwd.mo63278a(a, true).mo74062i();
                bxvd da = bvyf.f158147d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyf bvyf = (bvyf) da.f164949b;
                int i = bvyf.f158149a | 1;
                bvyf.f158149a = i;
                bvyf.f158150b = b;
                bvwb.getClass();
                bvyf.f158151c = bvwb;
                bvyf.f158149a = i | 2;
                bvyf bvyf2 = (bvyf) da.mo74062i();
                bgux.m100108d(0);
                bgwz bgwz = bgwd.f117812j;
                ClientContext a4 = bgwd.m100154a(bgwd.f117813i, account2);
                if (bgwz.f117877c == null) {
                    bgwz.f117877c = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/GetApiUserSettings", ciie.m150370a(bvyf.f158147d), ciie.m150370a(bvye.f158143b));
                }
                bgux.m100116e(true);
                bvxs bvxs = ((bvye) bgwz.f117882a.mo25553a(bgwz.f117877c, a4, bvyf2, 10000, TimeUnit.MILLISECONDS)).f158145a;
                if (bvxs == null) {
                    bvxs = bvxs.f158094c;
                }
                bgwu = bgwu.m100185a(account2, bvxs);
            }
            if (bgwx.m100191b(bgwu.f117867a)) {
                bgwx.mo63299a(account2, a);
                bgwx.mo63301a(bgwu.f117867a);
            }
            bgwx.mo63300a(account2, true);
            return bgwu.f117868b;
        } catch (gid e9) {
            e = e9;
            bgur.m100021b("GCoreUlr", "Couldn't get remote devices", e);
            return null;
        } catch (chuw e10) {
        } catch (IOException | NullPointerException e11) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgxd(InternalPreferenceChimeraServiceDoNotUse internalPreferenceChimeraServiceDoNotUse) {
        super("com.google.android.location.reporting.service.IPreferenceService");
        this.f117887a = internalPreferenceChimeraServiceDoNotUse;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:114:0x0238 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r2v10, assign insn: PHI: (r2v10 ?) = (r2v0 java.lang.String), (r2v12 ?) binds: [B:9:0x0029, B:114:0x0238] */
    /* JADX WARN: Type inference failed for: r2v12, assign insn: PHI: (r2v12 ?) = (r2v54 ?), (r2v59 ?) binds: [B:28:0x00c3, B:113:0x0237] */
    /* JADX WARN: Type inference failed for: r2v54, assign insn: 0x00c3: MOVE  (r2v54 ? I:?[OBJECT, ARRAY]) = (r30v0 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r2v59, assign insn: ?: MOVE  (r2v59 ?) = (r2v13 android.accounts.Account) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwd.a(java.lang.String, boolean):bxvd
     arg types: [java.lang.String, int]
     candidates:
      bgwd.a(android.content.Context, android.accounts.Account):com.google.android.gms.common.internal.ClientContext
      bgwd.a(java.lang.String, boolean):bxvd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x026e, code lost:
        r3 = r2;
        r2 = r1;
        r4 = r0;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b4, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        p000.bgux.m100118f(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b9, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d5, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03d6, code lost:
        p000.bgur.m100021b(r3, "Couldn't set remote device reporting enabled", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03dd, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:131:0x0266, B:138:0x027a, B:140:0x027c] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0241 A[Catch:{ gid -> 0x024f, VolleyError -> 0x0232, all -> 0x022b, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0246 A[Catch:{ gid -> 0x024f, VolleyError -> 0x0232, all -> 0x022b, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b A[Catch:{ gid -> 0x024f, VolleyError -> 0x0232, all -> 0x022b, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0260 A[Catch:{ gid -> 0x024f, VolleyError -> 0x0232, all -> 0x022b, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03ba A[ExcHandler: chuw | gid | IOException | NullPointerException (e java.lang.Throwable), PHI: r3 10  PHI: (r3v6 java.lang.String) = (r3v3 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String), (r3v11 java.lang.String), (r3v11 java.lang.String) binds: [B:193:0x03c8, B:174:0x0399, B:179:0x03ae, B:180:?, B:138:0x027a, B:139:?, B:140:0x027c, B:184:0x03b6, B:131:0x0266, B:132:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:131:0x0266] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ce A[ExcHandler: chuw | IOException | NullPointerException (e java.lang.Throwable), Splitter:B:1:0x000b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:131:0x0266=Splitter:B:131:0x0266, B:174:0x0399=Splitter:B:174:0x0399} */
    /* renamed from: a */
    public final List mo63305a(Account account, int i, boolean z, String str) {
        bgwx bgwx;
        gid gid;
        Account account2;
        bgwx bgwx2;
        bgwu bgwu;
        bgwx bgwx3;
        Account account3;
        Throwable th;
        gid gid2;
        VolleyError volleyError;
        Account account4;
        String str2;
        Account account5;
        String str3;
        String str4;
        SetApiRemoteDeviceSettingsReply setApiRemoteDeviceSettingsReply;
        Account account6;
        Account account7 = account;
        String str5 = "GCoreUlr";
        String str6 = "Cannot call from UI thread.";
        sdo.m34973b(str6);
        try {
            bgwx = this.f117887a.f150879b;
            int b = bgwx.f117871a.mo63359b(account7);
            String a = bgwx.mo63298a(account7);
            if (!chcp.m148196e()) {
                bgwl bgwl = bgwx.f117872b;
                bgwr a2 = bgwk.m100163a(bgwl.f117827i);
                try {
                    bjcy bjcy = new bjcy(a2);
                    ClientContext a3 = bgwl.m100164a(bgwl.f117827i, account7);
                    a2.f117860m = bgwh.f117821a;
                    Integer valueOf = Integer.valueOf(b);
                    Boolean valueOf2 = Boolean.valueOf(z);
                    Integer valueOf3 = Integer.valueOf(i);
                    String str7 = bgwl.f117809f;
                    String str8 = bgwl.f117807d;
                    String str9 = bgwl.f117806c;
                    Integer valueOf4 = Integer.valueOf(bgwl.f117828j);
                    Boolean bool = bgwl.f117832n;
                    String str10 = bgwl.f117811h;
                    String str11 = bgwl.f117810g;
                    Integer valueOf5 = Integer.valueOf(bgwl.f117830l);
                    Integer valueOf6 = Integer.valueOf(bgwl.f117804a);
                    Integer valueOf7 = Integer.valueOf(bgwl.f117829k);
                    String str12 = bgwl.f117805b;
                    if (chcj.m148167e()) {
                        str4 = "android";
                    } else {
                        str4 = null;
                    }
                    String str13 = bgwl.f117808e;
                    StringBuilder sb = new StringBuilder();
                    bgwx3 = bgwx;
                    try {
                        String str14 = str5;
                        try {
                            new Formatter(sb).format("userSettings/%1$s", String.valueOf(valueOf));
                            shd.m35269a(sb, "reportingEnabled", String.valueOf(valueOf2));
                            shd.m35269a(sb, "targetDeviceTag", String.valueOf(valueOf3));
                            if (a != null) {
                                try {
                                    shd.m35269a(sb, "androidGcmRegistrationId", shd.m35267a(a));
                                } catch (gid e) {
                                    gid2 = e;
                                    if (!chcy.m148488d()) {
                                    }
                                    throw gid2;
                                } catch (VolleyError e2) {
                                    str5 = account;
                                    volleyError = e2;
                                    str6 = str14;
                                    bgwl.m100165a(volleyError);
                                    if (!chcy.m148488d()) {
                                    }
                                    throw new IOException(volleyError);
                                } catch (Throwable th2) {
                                    account3 = account;
                                    th = th2;
                                    str6 = str14;
                                    try {
                                        throw th;
                                    } catch (gid e3) {
                                        gid = e3;
                                        bgwx2 = bgwx3;
                                        account2 = account3;
                                    } catch (chuw | gid | IOException | NullPointerException e4) {
                                    }
                                }
                            }
                            if (str != null) {
                                shd.m35269a(sb, "auditToken", shd.m35267a(str));
                            }
                            if (str7 != null) {
                                shd.m35269a(sb, "brand", shd.m35267a(str7));
                            }
                            if (str8 != null) {
                                shd.m35269a(sb, "device", shd.m35267a(str8));
                            }
                            if (str9 != null) {
                                shd.m35269a(sb, "devicePrettyName", shd.m35267a(str9));
                            }
                            shd.m35269a(sb, "deviceRestriction", shd.m35267a("noRestriction"));
                            shd.m35269a(sb, "gmsVersion", String.valueOf(valueOf4));
                            shd.m35269a(sb, "historySource", shd.m35267a("com.google.android.gms+remote"));
                            if (bool != null) {
                                shd.m35269a(sb, "isLowRam", String.valueOf(bool));
                            }
                            if (str10 != null) {
                                shd.m35269a(sb, "manufacturer", shd.m35267a(str10));
                            }
                            if (str11 != null) {
                                shd.m35269a(sb, "model", shd.m35267a(str11));
                            }
                            shd.m35269a(sb, "moduleVersion", String.valueOf(valueOf5));
                            shd.m35269a(sb, "nlpVersion", String.valueOf((Object) 2023));
                            shd.m35269a(sb, "osLevel", String.valueOf(valueOf6));
                            shd.m35269a(sb, "packageVersion", String.valueOf(valueOf7));
                            if (str12 != null) {
                                shd.m35269a(sb, "platform", shd.m35267a(str12));
                            }
                            if (str4 != null) {
                                shd.m35269a(sb, "platformType", shd.m35267a(str4));
                            }
                            if (str13 != null) {
                                shd.m35269a(sb, BuildConfig.FLAVOR_mode, shd.m35267a(str13));
                            }
                            shd.m35269a(sb, "reportingSource", shd.m35267a("com.google.android.gms+remote"));
                            setApiRemoteDeviceSettingsReply = (SetApiRemoteDeviceSettingsReply) bjcy.f122528a.mo25536a(a3, 1, sb.toString(), (Object) null, SetApiRemoteDeviceSettingsReply.class);
                            bgux.m100118f(true);
                            String str15 = (String) setApiRemoteDeviceSettingsReply.f44540b.get("remoteDeviceInfoSource");
                            if (str15 != null) {
                                str6 = "success";
                                try {
                                    if (!str6.equals(str15)) {
                                        String valueOf8 = String.valueOf(setApiRemoteDeviceSettingsReply);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf8).length() + 47);
                                        sb2.append("setRemoteDeviceReportingEnabled failed with: '");
                                        sb2.append(valueOf8);
                                        sb2.append("'");
                                        str6 = str14;
                                        try {
                                            bgur.m100025c(str6, sb2.toString());
                                        } catch (gid e5) {
                                            e = e5;
                                            gid2 = e;
                                            if (!chcy.m148488d()) {
                                                bgux.m100118f(false);
                                            } else {
                                                bgux.m100115e(gid2);
                                            }
                                            throw gid2;
                                        } catch (VolleyError e6) {
                                            e = e6;
                                            account4 = account;
                                            volleyError = e;
                                            str5 = account4;
                                            bgwl.m100165a(volleyError);
                                            if (!chcy.m148488d()) {
                                                bgux.m100118f(false);
                                            } else {
                                                bgux.m100115e(volleyError);
                                            }
                                            throw new IOException(volleyError);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            account5 = account;
                                            th = th;
                                            account3 = account5;
                                            throw th;
                                        }
                                    } else {
                                        str6 = str14;
                                    }
                                } catch (gid e7) {
                                    e = e7;
                                    gid2 = e;
                                    if (!chcy.m148488d()) {
                                    }
                                    throw gid2;
                                } catch (VolleyError e8) {
                                    e = e8;
                                    str6 = str14;
                                    account4 = account;
                                    volleyError = e;
                                    str5 = account4;
                                    bgwl.m100165a(volleyError);
                                    if (!chcy.m148488d()) {
                                    }
                                    throw new IOException(volleyError);
                                } catch (Throwable th4) {
                                    th = th4;
                                    str6 = str14;
                                    account5 = account;
                                    th = th;
                                    account3 = account5;
                                    throw th;
                                }
                            } else {
                                str6 = str14;
                            }
                            account6 = account;
                        } catch (gid e9) {
                            e = e9;
                            gid2 = e;
                            if (!chcy.m148488d()) {
                            }
                            throw gid2;
                        } catch (VolleyError e10) {
                            e = e10;
                            account4 = account;
                            str6 = str14;
                            volleyError = e;
                            str5 = account4;
                            bgwl.m100165a(volleyError);
                            if (!chcy.m148488d()) {
                            }
                            throw new IOException(volleyError);
                        } catch (Throwable th5) {
                            th = th5;
                            account5 = account;
                            str6 = str14;
                            th = th;
                            account3 = account5;
                            throw th;
                        }
                        try {
                            bgwu = bgwu.m100186a(account6, setApiRemoteDeviceSettingsReply.getUserSettings());
                            bgwx2 = bgwx3;
                            account2 = account6;
                        } catch (gid e11) {
                            e = e11;
                            gid2 = e;
                            if (!chcy.m148488d()) {
                            }
                            throw gid2;
                        } catch (VolleyError e12) {
                            e = e12;
                            account4 = account6;
                            volleyError = e;
                            str5 = account4;
                            bgwl.m100165a(volleyError);
                            if (!chcy.m148488d()) {
                            }
                            throw new IOException(volleyError);
                        }
                    } catch (gid e13) {
                        e = e13;
                        gid2 = e;
                        if (!chcy.m148488d()) {
                        }
                        throw gid2;
                    } catch (VolleyError e14) {
                        e = e14;
                        str2 = str5;
                        account4 = account7;
                        volleyError = e;
                        str5 = account4;
                        bgwl.m100165a(volleyError);
                        if (!chcy.m148488d()) {
                        }
                        throw new IOException(volleyError);
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = str5;
                        account5 = account7;
                        th = th;
                        account3 = account5;
                        throw th;
                    }
                } catch (gid e15) {
                    e = e15;
                    gid2 = e;
                    if (!chcy.m148488d()) {
                    }
                    throw gid2;
                } catch (VolleyError e16) {
                    e = e16;
                    str2 = str5;
                    bgwx3 = bgwx;
                    account4 = account7;
                    volleyError = e;
                    str5 = account4;
                    bgwl.m100165a(volleyError);
                    if (!chcy.m148488d()) {
                    }
                    throw new IOException(volleyError);
                } catch (Throwable th7) {
                    th = th7;
                    account5 = str5;
                    th = th;
                    account3 = account5;
                    throw th;
                }
            } else {
                str6 = str5;
                account2 = account7;
                bgwx2 = bgwx;
                bgwd bgwd = bgwx2.f117873c;
                bxvd da = bvyk.f158178g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyk bvyk = (bvyk) da.f164949b;
                bvyk.f158180a |= 1;
                bvyk.f158181b = b;
                bvwb bvwb = (bvwb) bgwd.mo63278a(a, true).mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyk bvyk2 = (bvyk) da.f164949b;
                bvwb.getClass();
                bvyk2.f158183d = bvwb;
                int i2 = bvyk2.f158180a | 4;
                bvyk2.f158180a = i2;
                int i3 = i2 | 2;
                bvyk2.f158180a = i3;
                bvyk2.f158182c = i;
                bvyk2.f158180a = i3 | 8;
                bvyk2.f158184e = z;
                bxvd da2 = bvxo.f158075e.mo74144da();
                String a4 = stm.m36299a(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvxo bvxo = (bvxo) da2.f164949b;
                a4.getClass();
                bvxo.f158077a |= 4;
                bvxo.f158080d = a4;
                String a5 = stm.m36299a("com.google.android.gms+remote");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvxo bvxo2 = (bvxo) da2.f164949b;
                a5.getClass();
                bvxo2.f158077a |= 1;
                bvxo2.f158078b = a5;
                String a6 = stm.m36299a("com.google.android.gms+remote");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvxo bvxo3 = (bvxo) da2.f164949b;
                a6.getClass();
                bvxo3.f158077a |= 2;
                bvxo3.f158079c = a6;
                bvxo bvxo4 = (bvxo) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyk bvyk3 = (bvyk) da.f164949b;
                bvxo4.getClass();
                bvyk3.f158185f = bvxo4;
                bvyk3.f158180a |= 16;
                bvyk bvyk4 = (bvyk) da.mo74062i();
                bgux.m100113e(0);
                bgwz bgwz = bgwd.f117812j;
                ClientContext a7 = bgwd.m100154a(bgwd.f117813i, account2);
                if (bgwz.f117879e == null) {
                    bgwz.f117879e = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/SetApiRemoteDeviceSettings", ciie.m150370a(bvyk.f158178g), ciie.m150370a(bvyj.f158174b));
                }
                bgux.m100118f(true);
                bvxs bvxs = ((bvyj) bgwz.f117882a.mo25553a(bgwz.f117879e, a7, bvyk4, 10000, TimeUnit.MILLISECONDS)).f158176a;
                if (bvxs == null) {
                    bvxs = bvxs.f158094c;
                }
                bgwu = bgwu.m100185a(account2, bvxs);
            }
            if (bgwx.m100191b(bgwu.f117867a)) {
                bgwx2.mo63299a(account2, a);
                bgwx2.mo63301a(bgwu.f117867a);
            }
            bgwx2.mo63300a(account2, true);
            return bgwu.f117868b;
        } catch (gid e17) {
            e = e17;
            str6 = str5;
            account2 = account7;
            bgwx2 = bgwx;
            gid = e;
            bgwx2.mo63300a(account2, false);
            throw gid;
        } catch (chuw | IOException | NullPointerException e18) {
        }
    }

    /* renamed from: b */
    public final void mo63308b(Account account, String str, boolean z, String str2) {
        String valueOf = String.valueOf(str);
        bgyr a = bgys.m100417a(account, valueOf.length() == 0 ? new String("com.google.android.gms+settings+") : "com.google.android.gms+settings+".concat(valueOf));
        a.mo63440e();
        Boolean valueOf2 = Boolean.valueOf(z);
        a.f118100h = valueOf2;
        a.f118099g = valueOf2;
        a.mo63439d();
        a.f118109q = str2;
        this.f117887a.f150878a.mo63357a("PrefService.setHistoryEnabled", a.mo63432a(), "ui_update");
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logLocationHistoryEnabled(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (bgux.m100096a()) {
            bgux.f117614a.mo63263i(z);
        }
    }

    /* renamed from: a */
    public final void mo63306a(Account account, String str, boolean z, String str2) {
        String valueOf = String.valueOf(str);
        bgyr a = bgys.m100417a(account, valueOf.length() == 0 ? new String("com.google.android.gms+settings+") : "com.google.android.gms+settings+".concat(valueOf));
        a.mo63440e();
        a.f118099g = Boolean.valueOf(z);
        a.mo63439d();
        a.f118109q = str2;
        this.f117887a.f150878a.mo63357a("PrefService.setReportingEnabled", a.mo63432a(), "ui_update");
        StringBuilder sb = new StringBuilder(52);
        sb.append("UlrClearcutEvents.logLocationReportingEnabled(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (bgux.m100096a()) {
            bgux.f117614a.mo63262h(z);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                ReportingConfig a = this.f117887a.f150878a.mo63354a();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 2:
                AccountConfig a2 = mo63304a((Account) dcl.m8163a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            case 3:
                mo63306a((Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                mo63308b((Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                List b = mo63307b((Account) dcl.m8163a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(b);
                return true;
            case 6:
                List a3 = mo63305a((Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                return true;
            default:
                return false;
        }
    }
}

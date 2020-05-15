package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ApiDeviceSetting;
import com.google.android.ulr.ApiSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

/* renamed from: bgwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwx {

    /* renamed from: a */
    public final bgye f117871a;

    /* renamed from: b */
    public final bgwl f117872b;

    /* renamed from: c */
    public final bgwd f117873c;

    /* renamed from: d */
    private final Context f117874d;

    /* renamed from: e */
    private final bgyc f117875e;

    private bgwx(Context context, bgye bgye, bgwl bgwl, bgwd bgwd, bgyc bgyc) {
        this.f117874d = context;
        this.f117871a = bgye;
        this.f117872b = bgwl;
        this.f117873c = bgwd;
        this.f117875e = bgyc;
    }

    /* renamed from: a */
    public static bgwx m100189a(Context context) {
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        bgwz bgwz;
        bgzo.m100459a(context);
        bgzt.m100497a(context);
        bgye a = bgye.m100307a(context);
        int i = bgwl.f117826o;
        bgzo.m100459a(context);
        int a2 = spo.m35902a(context);
        Integer num4 = 0;
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
            num = Integer.valueOf(currentModule.moduleVersion);
            try {
                num2 = Integer.valueOf(currentModule.moduleApk.apkVersionCode);
            } catch (IllegalStateException e) {
                num2 = num4;
            }
        } catch (IllegalStateException e2) {
            num2 = num4;
            num = num2;
        }
        bgwl bgwl = new bgwl(context, a2, num2.intValue(), num.intValue(), bgzo.m100472b(context), chcs.m148253y() ? Boolean.valueOf(bgzo.m100476c(context)) : null);
        bgzo.m100459a(context);
        int a3 = spo.m35902a(context);
        try {
            ModuleManager.ModuleInfo currentModule2 = ModuleManager.get(context).getCurrentModule();
            Integer valueOf = Integer.valueOf(currentModule2.moduleVersion);
            try {
                num3 = Integer.valueOf(currentModule2.moduleApk.apkVersionCode);
                num4 = valueOf;
            } catch (IllegalStateException e3) {
                num3 = num4;
                num4 = valueOf;
            }
        } catch (IllegalStateException e4) {
            num3 = num4;
        }
        if (chcs.m148253y()) {
            bool = Boolean.valueOf(bgzo.m100476c(context));
        } else {
            bool = null;
        }
        bgzo.m100472b(context);
        if (bgwd.f117812j == null) {
            shl shl = new shl(context, chcp.f188340a.mo6606a().mo85009k(), (int) chcp.f188340a.mo6606a().mo85010l(), context.getApplicationInfo().uid, 8704);
            if (chcp.f188340a.mo6606a().mo85002d()) {
                String valueOf2 = String.valueOf(chcp.m148198g());
                bgur.m100011a("GCoreUlr", valueOf2.length() == 0 ? new String("Grpc compression enabled: ") : "Grpc compression enabled: ".concat(valueOf2));
                shl.f44484f = chcp.m148198g();
            }
            bgwz = new bgwz(shl);
        } else {
            bgwz = bgwd.f117812j;
        }
        return new bgwx(context, a, bgwl, new bgwd(context, bgwz, a3, num3.intValue(), num4.intValue(), bool), new bgyc(context));
    }

    /* renamed from: b */
    public static final boolean m100191b(bgwb bgwb) {
        if (bgwb == null) {
            return false;
        }
        int i = bgwb.f117799g;
        return i == 0 || (i == 3 && bgwb.f117800h != 2);
    }

    /* renamed from: a */
    public static final boolean m100190a(bgwb bgwb, long j) {
        if (bgwb != null) {
            boolean z = bgwb.f117799g == 2 && bgwb.f117798f == 0;
            int i = bgwb.f117802j;
            boolean z2 = i == 1 ? true : i == 2;
            Long l = bgwb.f117793a;
            return z && z2 && (l != null && (l.longValue() > j ? 1 : (l.longValue() == j ? 0 : -1)) <= 0);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:264:0x07d4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:268:0x082c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:247:0x074e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:254:0x0798 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:46:0x0234 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:100:0x03a0 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bgwx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: android.accounts.Account} */
    /* JADX WARN: Type inference failed for: r4v6, assign insn: PHI: (r4v6 ?) = (r4v7 ?), (r4v12 ?), (r4v25 ?) binds: [B:264:0x07d4, B:268:0x082c, B:247:0x074e] */
    /* JADX WARN: Type inference failed for: r3v4, assign insn: PHI: (r3v4 ?) = (r3v5 ?), (r3v5 ?), (r3v8 ?), (r3v11 ?) binds: [B:264:0x07d4, B:268:0x082c, B:247:0x074e, B:254:0x0798] */
    /* JADX WARN: Type inference failed for: r4v7, assign insn: PHI: (r4v7 ?) = (r4v30 ?), (r4v105 ?) binds: [B:263:0x07d0, B:91:0x038e] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.accounts.Account], assign insn: PHI: (r3v5 ?) = (r3v11 ?), (r3v73 ?) binds: [B:263:0x07d0, B:91:0x038e] */
    /* JADX WARN: Type inference failed for: r4v12, types: [bgwx], assign insn: 0x082a: MOVE  (r4v12 ? I:?[OBJECT, ARRAY]) = (r37v0 'this' bgwx A[THIS]) */
    /* JADX WARN: Type inference failed for: r3v7, assign insn: 0x085f: MOVE  (r3v7 ? I:?[OBJECT, ARRAY]) = (r9v6 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r3v8, types: [bgwb], assign insn: 0x0657: MOVE  (r3v8 ? I:?[OBJECT, ARRAY]) = (r39v0 bgwb) */
    /* JADX WARN: Type inference failed for: r4v25, types: [bgwd], assign insn: 0x06d7: MOVE  (r4v25 ? I:?[OBJECT, ARRAY]) = (r19v1 bgwd) */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.accounts.Account], assign insn: 0x0796: MOVE  (r3v11 ? I:?[OBJECT, ARRAY]) = (r38v0 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r4v30, assign insn: 0x07c5: CONST  (r4v30 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v58, assign insn: 0x03d7: MOVE  (r3v58 ? I:?[OBJECT, ARRAY]) = (r38v0 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r3v73, assign insn: 0x038e: MOVE  (r3v73 ? I:?[OBJECT, ARRAY]) = (r9v29 android.accounts.Account) */
    /* JADX WARN: Type inference failed for: r3v95, assign insn: ?: MOVE  (r3v95 ?) = (r3v4 ?) */
    /* JADX WARN: Type inference failed for: r4v105, assign insn: ?: MOVE  (r4v105 ?) = (r4v81 com.google.android.gms.common.internal.ClientContext) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [?, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03a9 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ae A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03c1 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03c6 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x066a A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x066b A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0683 A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0688 A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x068d A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x068e A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06b1 A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x06b2 A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x06c6 A[Catch:{ gid -> 0x03d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0852 A[Catch:{ gid -> 0x0857 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0280 A[Catch:{ gid -> 0x0395, VolleyError -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02a9 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02b4 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02bf A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ca A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02d5 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d6 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02f3 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02fe A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0309 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0314 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0315 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0344 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x034f A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x035a A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0365 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0366 A[Catch:{ gid -> 0x03b7, VolleyError -> 0x039c, all -> 0x0397, all -> 0x03ca }] */
    /* renamed from: a */
    public final bgwb mo63297a(Account account, bgwb bgwb, String str, String str2) {
        bgwx bgwx;
        Account account2;
        gid gid;
        Account account3;
        ? r4;
        String str3;
        bgwb bgwb2;
        bvwg bvwg;
        bxvd da;
        Long l;
        long j;
        Context context;
        Boolean bool;
        Boolean bool2;
        String str4;
        Account account4;
        ApiDeviceSetting apiDeviceSetting;
        ApiSettings apiSettings;
        bgwb bgwb3;
        bgwl bgwl;
        bgwr a;
        Account account5;
        Account account6;
        Account account7;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool3;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Context context2;
        Boolean bool4;
        String str14;
        Boolean bool5;
        Account account8 = account;
        bgwb bgwb4 = bgwb;
        int b = this.f117871a.mo63359b(account8);
        String a2 = mo63298a(account);
        if (chcs.m148254z() && (((bool5 = bgwb4.f117796d) != null && bgwb4.f117797e == null) || (bgwb4.f117794b != null && bgwb4.f117795c == null))) {
            String valueOf = String.valueOf(bool5);
            String str15 = bgwb4.f117797e;
            String valueOf2 = String.valueOf(bgwb4.f117794b);
            String str16 = bgwb4.f117795c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(str15).length() + String.valueOf(valueOf2).length() + String.valueOf(str16).length());
            sb.append("null source:  historyEnabled=");
            sb.append(valueOf);
            sb.append(" historySource=");
            sb.append(str15);
            sb.append(" reportingEnabled");
            sb.append(valueOf2);
            sb.append(" reportingSource=");
            sb.append(str16);
            bguz.m100120a(new RuntimeException(sb.toString()));
        }
        try {
            String str17 = a2;
            int i = b;
            String str18 = null;
            if (!chcp.m148196e()) {
                try {
                    bgwl bgwl2 = this.f117872b;
                    Context context3 = bgwl2.f117827i;
                    String[] strArr = bgzp.f118165a;
                    PackageManager packageManager = context3.getPackageManager();
                    bgwl bgwl3 = bgwl2;
                    Boolean bool6 = bgwb4.f117796d;
                    if (bool6 == null) {
                        context2 = context3;
                    } else if (!bool6.booleanValue() || (bool4 = bgwb4.f117794b) == null) {
                        context2 = context3;
                    } else if (bool4.booleanValue()) {
                        int i2 = Build.VERSION.SDK_INT;
                        Boolean a3 = (packageManager == null || !packageManager.hasSystemFeature("android.hardware.wifi")) ? null : bgzp.m100481a(context3);
                        int i3 = Build.VERSION.SDK_INT;
                        Boolean a4 = (packageManager == null || !packageManager.hasSystemFeature("android.hardware.bluetooth_le")) ? null : bgzp.m100479a();
                        int c = aeri.m52438c(context3);
                        if (c < bgzp.f118165a.length) {
                            str14 = bgzp.f118165a[c];
                        } else {
                            str14 = null;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        ContentResolver contentResolver = context3.getContentResolver();
                        Boolean a5 = bgzp.m100480a(contentResolver);
                        Integer valueOf3 = Integer.valueOf(bgzp.m100482b(contentResolver));
                        String valueOf4 = String.valueOf(a5);
                        String valueOf5 = String.valueOf(valueOf3);
                        boolean b2 = chbr.m148128b();
                        boolean b3 = aeri.m52437b(context3);
                        boolean a6 = srs.m36149a(context3);
                        boolean f = soz.m35807f(context3);
                        boolean a7 = sse.m36205a(context3);
                        String valueOf6 = String.valueOf(a4);
                        String valueOf7 = String.valueOf(a3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 267 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(str14).length() + String.valueOf(valueOf7).length());
                        sb2.append("sendSettings with batterySaverEnabled:");
                        sb2.append(valueOf4);
                        sb2.append(" batterySaverModeThreshold:");
                        sb2.append(valueOf5);
                        sb2.append(" isGeoSupported:");
                        sb2.append(b2);
                        sb2.append(" isLocationEnabled:");
                        sb2.append(b3);
                        sb2.append(" isAllowedToUseLocation:");
                        sb2.append(a6);
                        sb2.append(" isRestrictedUserProfile:");
                        sb2.append(f);
                        sb2.append(" isUlrSupportedFormFactor:");
                        sb2.append(a7);
                        sb2.append(" isLocationBleScanEnabled:");
                        sb2.append(valueOf6);
                        sb2.append(" locationMode:");
                        sb2.append(str14);
                        sb2.append(" isLocationWifiScanEnabled:");
                        sb2.append(valueOf7);
                        sb2.toString();
                        apiDeviceSetting = new ApiDeviceSetting(a5, valueOf3, Boolean.valueOf(chbr.m148128b()), Boolean.valueOf(aeri.m52437b(context3)), Boolean.valueOf(srs.m36149a(context3)), Boolean.valueOf(soz.m35807f(context3)), Boolean.valueOf(sse.m36205a(context3)), a4, str14, a3);
                        account4 = f;
                        bgwb3 = bgwb;
                        apiSettings = new ApiSettings(bgwb3.f117796d, bgwb3.f117793a, bgwb3.f117794b, apiDeviceSetting);
                        bgwl = bgwl3;
                        a = bgwk.m100163a(bgwl.f117827i);
                        bjcx bjcx = new bjcx(a);
                        account7 = account;
                        try {
                            ClientContext a8 = bgwl.m100164a(bgwl.f117827i, account7);
                            a.f117860m = bgwf.f117819a;
                            Integer valueOf8 = Integer.valueOf(i);
                            str5 = bgwl.f117809f;
                            str6 = bgwl.f117807d;
                            str7 = bgwl.f117806c;
                            Integer valueOf9 = Integer.valueOf(bgwl.f117828j);
                            str8 = bgwb3.f117797e;
                            bool3 = bgwl.f117832n;
                            str9 = bgwl.f117811h;
                            str10 = bgwl.f117810g;
                            Integer valueOf10 = Integer.valueOf(bgwl.f117830l);
                            Integer valueOf11 = Integer.valueOf(bgwl.f117804a);
                            Integer valueOf12 = Integer.valueOf(bgwl.f117829k);
                            str11 = bgwl.f117805b;
                            if (chcj.m148167e()) {
                                str18 = "android";
                            }
                            str12 = bgwl.f117808e;
                            str13 = bgwb3.f117795c;
                            StringBuilder sb3 = new StringBuilder();
                            ApiSettings apiSettings2 = apiSettings;
                            bjcx bjcx2 = bjcx;
                            ClientContext clientContext = a8;
                            new Formatter(sb3).format("settings/%1$s", String.valueOf(valueOf8));
                            if (str17 != null) {
                                shd.m35269a(sb3, "androidGcmRegistrationId", shd.m35267a(str17));
                            }
                            if (str2 != null) {
                                shd.m35269a(sb3, "auditToken", shd.m35267a(str2));
                            }
                            if (str5 != null) {
                                shd.m35269a(sb3, "brand", shd.m35267a(str5));
                            }
                            if (str6 != null) {
                                shd.m35269a(sb3, "device", shd.m35267a(str6));
                            }
                            if (str7 == null) {
                                shd.m35269a(sb3, "devicePrettyName", shd.m35267a(str7));
                            }
                            shd.m35269a(sb3, "deviceRestriction", shd.m35267a("noRestriction"));
                            shd.m35269a(sb3, "gmsVersion", String.valueOf(valueOf9));
                            if (str8 != null) {
                                shd.m35269a(sb3, "historySource", shd.m35267a(str8));
                            }
                            if (bool3 != null) {
                                shd.m35269a(sb3, "isLowRam", String.valueOf(bool3));
                            }
                            if (str9 != null) {
                                shd.m35269a(sb3, "manufacturer", shd.m35267a(str9));
                            }
                            if (str10 == null) {
                                shd.m35269a(sb3, "model", shd.m35267a(str10));
                            }
                            shd.m35269a(sb3, "moduleVersion", String.valueOf(valueOf10));
                            shd.m35269a(sb3, "nlpVersion", String.valueOf((Object) 2023));
                            shd.m35269a(sb3, "osLevel", String.valueOf(valueOf11));
                            shd.m35269a(sb3, "packageVersion", String.valueOf(valueOf12));
                            if (str11 != null) {
                                shd.m35269a(sb3, "platform", shd.m35267a(str11));
                            }
                            if (str18 != null) {
                                shd.m35269a(sb3, "platformType", shd.m35267a(str18));
                            }
                            if (str12 != null) {
                                shd.m35269a(sb3, BuildConfig.FLAVOR_mode, shd.m35267a(str12));
                            }
                            if (str13 == null) {
                                shd.m35269a(sb3, "reportingSource", shd.m35267a(str13));
                            }
                            ClientContext clientContext2 = clientContext;
                            ApiSettings apiSettings3 = (ApiSettings) bjcx2.f122527a.mo25536a(clientContext2, 2, sb3.toString(), apiSettings2, ApiSettings.class);
                            bgux.m100111d(true);
                            account7 = account;
                            bgwb2 = bgwb.m100151a(account7, apiSettings3);
                            account3 = account7;
                            str3 = str17;
                            r4 = clientContext2;
                        } catch (gid e) {
                            e = e;
                            gid gid2 = e;
                            if (chcy.m148488d()) {
                                bgux.m100111d(false);
                            } else {
                                bgux.m100117f(gid2);
                            }
                            throw gid2;
                        } catch (VolleyError e2) {
                            e = e2;
                            account5 = account7;
                            VolleyError volleyError = e;
                            bgwl.m100165a(volleyError);
                            if (chcy.m148488d()) {
                                bgux.m100111d(false);
                            } else {
                                bgux.m100117f(volleyError);
                            }
                            throw new IOException(volleyError);
                        }
                    } else {
                        context2 = context3;
                    }
                    account4 = null;
                    apiDeviceSetting = new ApiDeviceSetting(null, null, null, Boolean.valueOf(aeri.m52437b(context2)), null, null, null, null, null, null);
                    bgwb3 = bgwb;
                    apiSettings = new ApiSettings(bgwb3.f117796d, bgwb3.f117793a, bgwb3.f117794b, apiDeviceSetting);
                    bgwl = bgwl3;
                    a = bgwk.m100163a(bgwl.f117827i);
                    try {
                        bjcx bjcx3 = new bjcx(a);
                        account7 = account;
                        ClientContext a82 = bgwl.m100164a(bgwl.f117827i, account7);
                        a.f117860m = bgwf.f117819a;
                        Integer valueOf82 = Integer.valueOf(i);
                        str5 = bgwl.f117809f;
                        str6 = bgwl.f117807d;
                        str7 = bgwl.f117806c;
                        Integer valueOf92 = Integer.valueOf(bgwl.f117828j);
                        str8 = bgwb3.f117797e;
                        bool3 = bgwl.f117832n;
                        str9 = bgwl.f117811h;
                        str10 = bgwl.f117810g;
                        Integer valueOf102 = Integer.valueOf(bgwl.f117830l);
                        Integer valueOf112 = Integer.valueOf(bgwl.f117804a);
                        Integer valueOf122 = Integer.valueOf(bgwl.f117829k);
                        str11 = bgwl.f117805b;
                        if (chcj.m148167e()) {
                        }
                        str12 = bgwl.f117808e;
                        str13 = bgwb3.f117795c;
                        StringBuilder sb32 = new StringBuilder();
                        ApiSettings apiSettings22 = apiSettings;
                        bjcx bjcx22 = bjcx3;
                        ClientContext clientContext3 = a82;
                        new Formatter(sb32).format("settings/%1$s", String.valueOf(valueOf82));
                        if (str17 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (str5 != null) {
                        }
                        if (str6 != null) {
                        }
                        if (str7 == null) {
                        }
                        shd.m35269a(sb32, "deviceRestriction", shd.m35267a("noRestriction"));
                        shd.m35269a(sb32, "gmsVersion", String.valueOf(valueOf92));
                        if (str8 != null) {
                        }
                        if (bool3 != null) {
                        }
                        if (str9 != null) {
                        }
                        if (str10 == null) {
                        }
                        shd.m35269a(sb32, "moduleVersion", String.valueOf(valueOf102));
                        shd.m35269a(sb32, "nlpVersion", String.valueOf((Object) 2023));
                        shd.m35269a(sb32, "osLevel", String.valueOf(valueOf112));
                        shd.m35269a(sb32, "packageVersion", String.valueOf(valueOf122));
                        if (str11 != null) {
                        }
                        if (str18 != null) {
                        }
                        if (str12 != null) {
                        }
                        if (str13 == null) {
                        }
                        ClientContext clientContext22 = clientContext3;
                        ApiSettings apiSettings32 = (ApiSettings) bjcx22.f122527a.mo25536a(clientContext22, 2, sb32.toString(), apiSettings22, ApiSettings.class);
                        bgux.m100111d(true);
                        account7 = account;
                        bgwb2 = bgwb.m100151a(account7, apiSettings32);
                        account3 = account7;
                        str3 = str17;
                        r4 = clientContext22;
                    } catch (gid e3) {
                        e = e3;
                        gid gid22 = e;
                        if (chcy.m148488d()) {
                        }
                        throw gid22;
                    } catch (VolleyError e4) {
                        e = e4;
                        account5 = account;
                        VolleyError volleyError2 = e;
                        bgwl.m100165a(volleyError2);
                        if (chcy.m148488d()) {
                        }
                        throw new IOException(volleyError2);
                    } catch (Throwable th) {
                        th = th;
                        account6 = account4;
                        throw th;
                    }
                } catch (gid e5) {
                    e = e5;
                    bgwx = this;
                    account3 = account;
                    gid = e;
                    account2 = account3;
                    bgwx.mo63300a(account2, false);
                    throw gid;
                }
            } else {
                String str19 = " locationMode:";
                String str20 = " isLocationBleScanEnabled:";
                String str21 = " isUlrSupportedFormFactor:";
                Account account9 = account;
                try {
                    bgwd bgwd = this.f117873c;
                    Context context4 = bgwd.f117813i;
                    String[] strArr2 = bgzp.f118165a;
                    try {
                        PackageManager packageManager2 = context4.getPackageManager();
                        bgwb bgwb5 = bgwb;
                        bgwd bgwd2 = bgwd;
                        Boolean bool7 = bgwb5.f117796d;
                        if (bool7 == null) {
                            context = context4;
                        } else if (!bool7.booleanValue() || (bool = bgwb5.f117794b) == null) {
                            context = context4;
                        } else if (bool.booleanValue()) {
                            int i5 = Build.VERSION.SDK_INT;
                            Boolean a9 = (packageManager2 == null || !packageManager2.hasSystemFeature("android.hardware.wifi")) ? null : bgzp.m100481a(context4);
                            int i6 = Build.VERSION.SDK_INT;
                            if (packageManager2 == null || !packageManager2.hasSystemFeature("android.hardware.bluetooth_le")) {
                                bool2 = null;
                            } else {
                                bool2 = bgzp.m100479a();
                            }
                            int i7 = Build.VERSION.SDK_INT;
                            ContentResolver contentResolver2 = context4.getContentResolver();
                            Boolean a10 = bgzp.m100480a(contentResolver2);
                            Integer valueOf13 = Integer.valueOf(bgzp.m100482b(contentResolver2));
                            int a11 = bvwf.m121530a(aeri.m52438c(context4));
                            String valueOf14 = String.valueOf(a10);
                            Boolean bool8 = a10;
                            String valueOf15 = String.valueOf(valueOf13);
                            Integer num = valueOf13;
                            boolean b4 = chbr.m148128b();
                            String str22 = " isLocationWifiScanEnabled:";
                            boolean b5 = aeri.m52437b(context4);
                            String str23 = str19;
                            boolean a12 = srs.m36149a(context4);
                            String str24 = str20;
                            boolean f2 = soz.m35807f(context4);
                            String str25 = str21;
                            boolean a13 = sse.m36205a(context4);
                            Context context5 = context4;
                            String valueOf16 = String.valueOf(bool2);
                            if (a11 == 0) {
                                str4 = "null";
                            } else {
                                str4 = Integer.toString(a11 - 1);
                            }
                            Boolean bool9 = bool2;
                            String valueOf17 = String.valueOf(str4);
                            String valueOf18 = String.valueOf(a9);
                            Boolean bool10 = a9;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf14).length() + 273 + String.valueOf(valueOf15).length() + String.valueOf(valueOf16).length() + String.valueOf(valueOf17).length() + String.valueOf(valueOf18).length());
                            sb4.append("sendSettings(gRPC) with batterySaverEnabled:");
                            sb4.append(valueOf14);
                            sb4.append(" batterySaverModeThreshold:");
                            sb4.append(valueOf15);
                            sb4.append(" isGeoSupported:");
                            sb4.append(b4);
                            sb4.append(" isLocationEnabled:");
                            sb4.append(b5);
                            sb4.append(" isAllowedToUseLocation:");
                            sb4.append(a12);
                            sb4.append(" isRestrictedUserProfile:");
                            sb4.append(f2);
                            sb4.append(str25);
                            sb4.append(a13);
                            sb4.append(str24);
                            sb4.append(valueOf16);
                            sb4.append(str23);
                            sb4.append(valueOf17);
                            sb4.append(str22);
                            sb4.append(valueOf18);
                            sb4.toString();
                            bxvd da2 = bvwg.f157917l.mo74144da();
                            boolean b6 = aeri.m52437b(context5);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg2 = (bvwg) da2.f164949b;
                            bvwg2.f157919a |= 4;
                            bvwg2.f157922d = b6;
                            boolean a14 = srs.m36149a(context5);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg3 = (bvwg) da2.f164949b;
                            bvwg3.f157919a |= 2;
                            bvwg3.f157921c = a14;
                            boolean f3 = soz.m35807f(context5);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg4 = (bvwg) da2.f164949b;
                            bvwg4.f157919a |= 8;
                            bvwg4.f157923e = f3;
                            boolean a15 = sse.m36205a(context5);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg5 = (bvwg) da2.f164949b;
                            bvwg5.f157919a |= 16;
                            bvwg5.f157924f = a15;
                            boolean b7 = chbr.m148128b();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg6 = (bvwg) da2.f164949b;
                            bvwg6.f157919a |= 1;
                            bvwg6.f157920b = b7;
                            boolean booleanValue = bool8.booleanValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg7 = (bvwg) da2.f164949b;
                            bvwg7.f157919a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bvwg7.f157928j = booleanValue;
                            int intValue = num.intValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvwg bvwg8 = (bvwg) da2.f164949b;
                            bvwg8.f157919a |= 512;
                            bvwg8.f157929k = intValue;
                            if (bool9 != null) {
                                boolean booleanValue2 = bool9.booleanValue();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvwg bvwg9 = (bvwg) da2.f164949b;
                                bvwg9.f157919a |= 128;
                                bvwg9.f157927i = booleanValue2;
                            }
                            if (bool10 != null) {
                                boolean booleanValue3 = bool10.booleanValue();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvwg bvwg10 = (bvwg) da2.f164949b;
                                bvwg10.f157919a |= 64;
                                bvwg10.f157926h = booleanValue3;
                            }
                            if (a11 != 0) {
                                bvwg bvwg11 = (bvwg) da2.f164949b;
                                bvwg11.f157925g = a11 - 1;
                                bvwg11.f157919a |= 32;
                            }
                            bvwg = (bvwg) da2.mo74062i();
                            da = bvxn.f158064j.mo74144da();
                            account3 = bgwb;
                            Boolean bool11 = account3.f117796d;
                            boolean z = bool11 == null && bool11.booleanValue();
                            if (!da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvxn bvxn = (bvxn) da.f164949b;
                            bvxn.f158066a |= 2;
                            bvxn.f158068c = z;
                            l = account3.f117793a;
                            if (l == null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            if (!da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvxn bvxn2 = (bvxn) da.f164949b;
                            bvxn2.f158066a |= 1;
                            bvxn2.f158067b = j;
                            Boolean bool12 = account3.f117794b;
                            boolean z2 = bool12 == null && bool12.booleanValue();
                            if (!da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bvxn bvxn3 = (bvxn) da.f164949b;
                            int i8 = bvxn3.f158066a | 4;
                            bvxn3.f158066a = i8;
                            bvxn3.f158069d = z2;
                            if (bvwg == null) {
                                bvwg.getClass();
                                bvxn3.f158074i = bvwg;
                                bvxn3.f158066a = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bvxn bvxn4 = (bvxn) da.mo74062i();
                                str3 = str17;
                                r4 = bgwd2;
                                bvwb bvwb = (bvwb) r4.mo63278a(str3, true).mo74062i();
                                bxvd da3 = bvxo.f158075e.mo74144da();
                                String a16 = stm.m36299a(account3.f117797e);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvxo bvxo = (bvxo) da3.f164949b;
                                a16.getClass();
                                bvxo.f158077a |= 1;
                                bvxo.f158078b = a16;
                                String a17 = stm.m36299a(account3.f117795c);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvxo bvxo2 = (bvxo) da3.f164949b;
                                a17.getClass();
                                bvxo2.f158077a |= 2;
                                bvxo2.f158079c = a17;
                                String a18 = stm.m36299a(str2);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvxo bvxo3 = (bvxo) da3.f164949b;
                                a18.getClass();
                                bvxo3.f158077a |= 4;
                                bvxo3.f158080d = a18;
                                bvxo bvxo4 = (bvxo) da3.mo74062i();
                                try {
                                    bxvd da4 = bvym.f158190f.mo74144da();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bvym bvym = (bvym) da4.f164949b;
                                    int i9 = bvym.f158192a | 1;
                                    bvym.f158192a = i9;
                                    bvym.f158193b = i;
                                    bvwb.getClass();
                                    bvym.f158194c = bvwb;
                                    int i10 = i9 | 2;
                                    bvym.f158192a = i10;
                                    bvxn4.getClass();
                                    bvym.f158195d = bvxn4;
                                    int i11 = i10 | 4;
                                    bvym.f158192a = i11;
                                    bvxo4.getClass();
                                    bvym.f158196e = bvxo4;
                                    bvym.f158192a = i11 | 8;
                                    bvym bvym2 = (bvym) da4.mo74062i();
                                    bgux.m100103c(0);
                                    bgwz bgwz = bgwd.f117812j;
                                    account3 = account;
                                    try {
                                        ClientContext a19 = bgwd.m100154a(r4.f117813i, (Account) account3);
                                        if (bgwz.f117878d == null) {
                                            bgwz.f117878d = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/SetApiSettings", ciie.m150370a(bvym.f158190f), ciie.m150370a(bvyl.f158186b));
                                        }
                                        r4 = 1;
                                        bgux.m100111d(true);
                                        bvxn bvxn5 = ((bvyl) bgwz.f117882a.mo25553a(bgwz.f117878d, a19, bvym2, 10000, TimeUnit.MILLISECONDS)).f158188a;
                                        if (bvxn5 == null) {
                                            bvxn5 = bvxn.f158064j;
                                        }
                                        bgwb2 = bgwb.m100150a((Account) account3, bvxn5);
                                    } catch (chuw e6) {
                                        e = e6;
                                        Throwable th2 = e;
                                        bgux.m100111d(false);
                                        throw th2;
                                    } catch (gid e7) {
                                        e = e7;
                                        Throwable th22 = e;
                                        bgux.m100111d(false);
                                        throw th22;
                                    }
                                } catch (chuw e8) {
                                    e = e8;
                                    Throwable th222 = e;
                                    bgux.m100111d(false);
                                    throw th222;
                                } catch (gid e9) {
                                    e = e9;
                                    Throwable th2222 = e;
                                    bgux.m100111d(false);
                                    throw th2222;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            context = context4;
                        }
                        bxvd da5 = bvwg.f157917l.mo74144da();
                        boolean b8 = aeri.m52437b(context);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bvwg bvwg12 = (bvwg) da5.f164949b;
                        bvwg12.f157919a |= 4;
                        bvwg12.f157922d = b8;
                        bvwg = (bvwg) da5.mo74062i();
                        da = bvxn.f158064j.mo74144da();
                        account3 = bgwb;
                        Boolean bool112 = account3.f117796d;
                        if (bool112 == null) {
                        }
                        if (!da.f164950c) {
                        }
                        bvxn bvxn6 = (bvxn) da.f164949b;
                        bvxn6.f158066a |= 2;
                        bvxn6.f158068c = z;
                        l = account3.f117793a;
                        if (l == null) {
                        }
                        if (!da.f164950c) {
                        }
                        bvxn bvxn22 = (bvxn) da.f164949b;
                        bvxn22.f158066a |= 1;
                        bvxn22.f158067b = j;
                        Boolean bool122 = account3.f117794b;
                        if (bool122 == null) {
                        }
                        if (!da.f164950c) {
                        }
                        bvxn bvxn32 = (bvxn) da.f164949b;
                        int i82 = bvxn32.f158066a | 4;
                        bvxn32.f158066a = i82;
                        bvxn32.f158069d = z2;
                        if (bvwg == null) {
                        }
                    } catch (gid e10) {
                        e = e10;
                        bgwx = this;
                        account3 = account9;
                        gid = e;
                        account2 = account3;
                        bgwx.mo63300a(account2, false);
                        throw gid;
                    }
                } catch (gid e11) {
                    e = e11;
                    bgwx = this;
                    account3 = account9;
                    gid = e;
                    account2 = account3;
                    bgwx.mo63300a(account2, false);
                    throw gid;
                }
            }
            try {
                boolean b9 = m100191b(bgwb2);
                String valueOf19 = String.valueOf(bgwb);
                String valueOf20 = String.valueOf(bgwb2);
                StringBuilder sb5 = new StringBuilder(str.length() + 48 + String.valueOf(valueOf19).length() + String.valueOf(valueOf20).length());
                sb5.append("sendSettings(");
                sb5.append(str);
                sb5.append("): sent ");
                sb5.append(valueOf19);
                sb5.append(", got back ");
                sb5.append(valueOf20);
                sb5.append("; success: ");
                sb5.append(b9);
                bgur.m100011a("GCoreUlrLong", sb5.toString());
                if (b9) {
                    r4 = this;
                    try {
                        r4.mo63299a(account3, str3);
                        r4.mo63301a(bgwb2);
                    } catch (gid e12) {
                        e = e12;
                        bgwx = r4;
                        account3 = account3;
                        gid = e;
                        account2 = account3;
                        bgwx.mo63300a(account2, false);
                        throw gid;
                    }
                } else {
                    r4 = this;
                }
                r4.mo63300a((Account) account3, true);
                return bgwb2;
            } catch (gid e13) {
                e = e13;
                bgwx = this;
                gid = e;
                account2 = account3;
                bgwx.mo63300a(account2, false);
                throw gid;
            }
        } catch (gid e14) {
            e = e14;
            bgwx = this;
            account3 = account8;
            gid = e;
            account2 = account3;
            bgwx.mo63300a(account2, false);
            throw gid;
        }
    }

    /* renamed from: a */
    public final String mo63298a(Account account) {
        String str;
        Context context = this.f117874d;
        if (chcs.m148228D()) {
            str = aaks.m21407a(context);
            if (str == null) {
                bgur.m100011a("GCoreUlr", "No GCM registration ID");
            }
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Long l = this.f117871a.mo63353a(account).f150905p;
        if (l != null && System.currentTimeMillis() - l.longValue() <= TimeUnit.DAYS.toMillis(7)) {
            return null;
        }
        String valueOf = String.valueOf(aeqm.m52397a(account));
        if (valueOf.length() == 0) {
            new String("Uploading GCM registration ID for ");
        } else {
            "Uploading GCM registration ID for ".concat(valueOf);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo63299a(Account account, String str) {
        bgye bgye = this.f117871a;
        bgye.mo63367d(account);
        synchronized (bgye.f117997f) {
            SharedPreferences.Editor edit = bgye.f118000b.f118032a.edit();
            if (str != null) {
                String valueOf = String.valueOf(aeqm.m52397a(account));
                if (valueOf.length() == 0) {
                    new String("GCM ID uploaded for ");
                } else {
                    "GCM ID uploaded for ".concat(valueOf);
                }
                edit.putLong(bgyh.m100368e(account), System.currentTimeMillis());
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public final void mo63300a(Account account, boolean z) {
        bgye bgye = this.f117871a;
        bgye.mo63367d(account);
        synchronized (bgye.f117997f) {
            bgyh bgyh = bgye.f118000b;
            if (account != null) {
                Long valueOf = Long.valueOf(bgyh.f118032a.getLong(bgyh.m100371h(account), -1));
                SharedPreferences.Editor edit = bgyh.f118032a.edit();
                edit.putBoolean(bgyh.m100370g(account), z);
                if (!z) {
                    Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                    if (valueOf.longValue() == -1) {
                        edit.putLong(bgyh.m100371h(account), valueOf2.longValue());
                        valueOf = valueOf2;
                    }
                    bguv.m100052b("UlrAccountAuthenticationFailureDuration", TimeUnit.MILLISECONDS.toMinutes(valueOf2.longValue() - valueOf.longValue()));
                    String valueOf3 = String.valueOf(account);
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(valueOf2.longValue() - valueOf.longValue());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 73);
                    sb.append("The ");
                    sb.append(valueOf3);
                    sb.append(" has been under authentication error for ");
                    sb.append(minutes);
                    sb.append(" minutes");
                    bgur.m100025c("GCoreUlr", sb.toString());
                } else {
                    edit.putLong(bgyh.m100371h(account), -1);
                }
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public final void mo63301a(bgwb bgwb) {
        if (!bgwb.mo63273b().isEmpty()) {
            ArrayList arrayList = new ArrayList(bgwb.mo63273b());
            bgyc bgyc = this.f117875e;
            Intent a = spn.m35845a(new Intent("com.google.android.gms.location.reporting.DELETE_OPERATION"));
            a.putParcelableArrayListExtra("deletions", arrayList);
            bgyc.f117992a.sendBroadcast(a);
            Context context = this.f117874d;
            Intent a2 = bgxx.m100271a(context, "com.google.android.gms.location.reporting.DELETE_OPERATION");
            a2.putExtra("deletions", arrayList);
            bgzo.m100465a(context, a2);
        }
    }
}

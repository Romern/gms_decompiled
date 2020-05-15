package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.ChimeraGetToken;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.uiflows.common.FilteringRedirectChimeraActivity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: ddx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddx extends dck implements ddy {

    /* renamed from: a */
    private final ily f12958a;

    /* renamed from: b */
    private final Context f12959b;

    /* renamed from: c */
    private final gjy f12960c;

    /* renamed from: d */
    private final gkp f12961d;

    /* renamed from: e */
    private final jyj f12962e;

    /* renamed from: f */
    private final adyd f12963f;

    /* renamed from: g */
    private final gko f12964g;

    /* renamed from: h */
    private final gls f12965h;

    /* renamed from: i */
    private final ilq f12966i;

    public ddx() {
        super("com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: a */
    private static Bundle m8215a(Account account, TokenData tokenData) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        if (tokenData != null) {
            bundle.putString("authtoken", tokenData.f9944b);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("TokenData", tokenData);
            bundle.putBundle("tokenDetails", bundle2);
        }
        return bundle;
    }

    /* renamed from: b */
    private final String m8219b(Account account) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return this.f12965h.mo12033b(account);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddx(Context context) {
        super("com.google.android.auth.IAuthManagerService");
        gjy gjy = new gjy(context);
        gkp gkp = new gkp(context);
        jyj jyj = new jyj(context);
        adyd a = adyd.m51363a(context);
        gls gls = new gls(new ilq(context));
        this.f12959b = context;
        this.f12966i = new ilq(context);
        this.f12960c = gjy;
        this.f12961d = gkp;
        this.f12962e = jyj;
        this.f12963f = a;
        this.f12958a = (ily) ily.f21320d.mo13145b();
        this.f12964g = (gko) gko.f18416b.mo13145b();
        this.f12965h = gls;
    }

    /* renamed from: a */
    private final void m8216a(bocl bocl) {
        if (ccao.m129151b()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 43;
            boct.f132610a |= 1;
            bocl.getClass();
            boct.f132604C = bocl;
            boct.f132611b |= 512;
            this.f12962e.mo14225b((boct) da.mo74062i());
        }
    }

    /* renamed from: a */
    private final void m8217a(boet boet) {
        Random random = new Random();
        long a = spn.m35843a(this.f12959b);
        if (a != 0) {
            random.setSeed(a);
        }
        if (random.nextDouble() < gnv.m13575t() || ccao.m129151b()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 1;
            int i = 1 | boct.f132610a;
            boct.f132610a = i;
            boet.getClass();
            boct.f132613d = boet;
            boct.f132610a = i | 2;
            this.f12962e.mo14225b((boct) da.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m8218a(RuntimeException runtimeException, bxvd bxvd) {
        ChimeraGetToken.f9926a.mo25415d("RuntimeException thrown during getToken()!", runtimeException, new Object[0]);
        bxvd da = boev.f132855d.mo74144da();
        if (runtimeException.getMessage() != null) {
            String message = runtimeException.getMessage();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boev boev = (boev) da.f164949b;
            message.getClass();
            boev.f132857a |= 2;
            boev.f132859c = message;
        }
        if (runtimeException instanceof ghz) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boev boev2 = (boev) da.f164949b;
            boev2.f132858b = 3;
            boev2.f132857a |= 1;
        } else if (runtimeException instanceof gin) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boev boev3 = (boev) da.f164949b;
            boev3.f132858b = 2;
            boev3.f132857a |= 1;
        } else if (runtimeException instanceof SecurityException) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boev boev4 = (boev) da.f164949b;
            boev4.f132858b = 1;
            boev4.f132857a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boev boev5 = (boev) da.f164949b;
            boev5.f132858b = 0;
            boev5.f132857a |= 1;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boet boet = (boet) bxvd.f164949b;
        boev boev6 = (boev) da.mo74062i();
        boet boet2 = boet.f132836q;
        boev6.getClass();
        boet.f132853p = boev6;
        boet.f132838a |= 4096;
    }

    /* renamed from: a */
    public final Bundle mo8550a(Account account) {
        try {
            int callingUid = Binder.getCallingUid();
            if (!this.f12958a.mo13133b(callingUid)) {
                rfz.m33557a(this.f12959b).mo24604a(Binder.getCallingUid());
            }
            ChimeraGetToken.f9926a.mo25416d("Removing account by uid: %d", Integer.valueOf(callingUid));
            try {
                return (Bundle) this.f12963f.mo33923c(account).getResult(5, TimeUnit.SECONDS);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                ChimeraGetToken.f9926a.mo25415d("Failed to remove %s account", e, account);
                return null;
            }
        } catch (RuntimeException e2) {
            ChimeraGetToken.f9926a.mo25415d("RuntimeException thrown in removeAccount()!", e2, new Object[0]);
            throw e2;
        }
    }

    /* renamed from: a */
    public final Bundle mo8551a(Account account, Bundle bundle, AppDescription appDescription, boolean z, bxvd bxvd) {
        String b = m8219b(account);
        if (!TextUtils.isEmpty(b)) {
            giq giq = new giq();
            giq.f18307a = b;
            return m8215a(account, giq.mo11915a());
        }
        TokenResponse a = mo8553a(account, "^^_account_id_^^", bundle, appDescription, z, bxvd);
        String b2 = m8219b(account);
        if (!TextUtils.isEmpty(b2)) {
            giq giq2 = new giq();
            giq2.f18307a = b2;
            return m8215a(account, giq2.mo11915a());
        }
        ChimeraGetToken.f9926a.mo25416d("Failed to get account ID", new Object[0]);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boet boet = (boet) bxvd.f164949b;
        boet boet2 = boet.f132836q;
        "GET_ACCOUNT_ID_FAILED".getClass();
        boet.f132838a |= 1024;
        boet.f132849l = "GET_ACCOUNT_ID_FAILED";
        Bundle bundle2 = new Bundle();
        if (a != null) {
            bundle2.putString("Error", a.mo7647b().f22000ac);
        }
        return bundle2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: boolean} */
    /* JADX WARN: Type inference failed for: r8v3, assign insn: 0x0407: CONST  (r8v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v5, assign insn: 0x03f2: CONST  (r8v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v16, assign insn: ?: MOVE  (r8v16 ?) = (r8v7 boolean) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r8v2, types: [boolean, int], assign insn: PHI: (r8v2 int) = (r8v3 ?), (r8v5 ?), (r8v16 ?) binds: [B:152:0x0401, B:148:0x03f0, B:144:0x03e5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0418 A[Catch:{ all -> 0x04ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0430 A[Catch:{ all -> 0x04ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x057e  */
    /* renamed from: a */
    public final Bundle mo8546a(Account account, String str, Bundle bundle) {
        Bundle bundle2;
        long j;
        bogf bogf;
        boolean z;
        ddx ddx;
        ? r8;
        String string;
        String str2;
        boolean z2;
        boolean z3;
        String[] a;
        String str3 = str;
        sdo.m34969a(str3, (Object) "service cannot be null");
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        long j2 = bundle2.getLong("service_connection_start_time_millis", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd da = boet.f132836q.mo74144da();
        bogf bogf2 = (bogf) bogg.f132977f.mo74144da();
        if (j2 >= 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet = (boet) da.f164949b;
            boet.f132838a |= 64;
            boet.f132845h = elapsedRealtime2;
        }
        try {
            int callingUid = Binder.getCallingUid();
            string = bundle2.getString(gie.f18286b);
            if (string == null && (a = svr.m36484b(this.f12959b).mo26175a(callingUid)) != null && a.length == 1) {
                string = a[0];
            }
            int i = bundle2.getInt(gie.f18285a, 0);
            if (i == 0) {
                i = this.f12966i.mo13122a(string);
            }
            gic a2 = gic.m13182a(bundle2);
            bsoa bsoa = (bsoa) bmxv.m108567c(a2.mo11902a()).mo66812a(bsoa.f146351k);
            ApplicationInformation b = a2.mo11903b();
            if (b == null) {
                str2 = this.f12964g.mo11990a(string).f18411b;
            } else {
                string = b.f10844b;
                str2 = b.f10845c;
            }
            bxvd bxvd = (bxvd) bsoa.mo74142c(5);
            bxvd.mo73625a((bxvk) bsoa);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsoa bsoa2 = (bsoa) bxvd.f164949b;
            j = elapsedRealtime;
            try {
                bsoa2.f146361i = 1;
                bsoa2.f146353a |= 512;
                gib gib = new gib(bundle2);
                gib.mo11901a((bsoa) bxvd.mo74062i());
                Bundle bundle3 = gib.mo11900a().f18284a;
                if (str2 != null) {
                    try {
                        if (bogf2.f164950c) {
                            bogf2.mo74035c();
                            bogf2.f164950c = false;
                        }
                        bogg bogg = (bogg) bogf2.f164949b;
                        str2.getClass();
                        bogg.f132979a |= 4;
                        bogg.f132982d = str2;
                    } catch (RuntimeException e) {
                        e = e;
                        bogf = bogf2;
                        ddx = this;
                        z2 = false;
                        bundle2 = bundle3;
                        r8 = z2;
                        try {
                            m8218a(e, da);
                            Bundle bundle4 = new Bundle();
                            if (e.getCause() instanceof InterruptedException) {
                            }
                            bundle4.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
                            if (bogf.f164950c) {
                            }
                            bogg bogg2 = (bogg) bogf.f164949b;
                            str.getClass();
                            bogg2.f132979a |= 2;
                            bogg2.f132981c = str3;
                            if (da.f164950c) {
                            }
                            boet boet2 = (boet) da.f164949b;
                            bogg bogg3 = (bogg) bogf.mo74062i();
                            bogg3.getClass();
                            boet2.f132844g = bogg3;
                            boet2.f132838a |= 32;
                            boolean z4 = bundle2.getBoolean("handle_notification");
                            if (da.f164950c) {
                            }
                            boet boet3 = (boet) da.f164949b;
                            boet3.f132838a |= 2;
                            boet3.f132840c = z4;
                            boolean containsKey = bundle2.containsKey("callback_intent");
                            if (da.f164950c) {
                            }
                            boet boet4 = (boet) da.f164949b;
                            boet4.f132838a |= 4;
                            boet4.f132841d = containsKey;
                            boolean containsKey2 = bundle2.containsKey("sync_extras");
                            if (da.f164950c) {
                            }
                            boet boet5 = (boet) da.f164949b;
                            boet5.f132838a |= 8;
                            boet5.f132842e = containsKey2;
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                            if (da.f164950c) {
                            }
                            boet boet6 = (boet) da.f164949b;
                            boet6.f132838a |= 1;
                            boet6.f132839b = elapsedRealtime3;
                            ddx.m8217a((boet) da.mo74062i());
                            return bundle4;
                        } catch (Throwable th) {
                            th = th;
                            z = r8;
                            if (bogf.f164950c) {
                            }
                            bogg bogg4 = (bogg) bogf.f164949b;
                            str.getClass();
                            bogg4.f132979a |= 2;
                            bogg4.f132981c = str3;
                            if (da.f164950c) {
                            }
                            boet boet7 = (boet) da.f164949b;
                            bogg bogg5 = (bogg) bogf.mo74062i();
                            bogg5.getClass();
                            boet7.f132844g = bogg5;
                            boet7.f132838a |= 32;
                            boolean z5 = bundle2.getBoolean("handle_notification");
                            if (da.f164950c) {
                            }
                            boet boet8 = (boet) da.f164949b;
                            boet8.f132838a |= 2;
                            boet8.f132840c = z5;
                            boolean containsKey3 = bundle2.containsKey("callback_intent");
                            if (da.f164950c) {
                            }
                            boet boet9 = (boet) da.f164949b;
                            boet9.f132838a |= 4;
                            boet9.f132841d = containsKey3;
                            boolean containsKey4 = bundle2.containsKey("sync_extras");
                            if (da.f164950c) {
                            }
                            boet boet10 = (boet) da.f164949b;
                            boet10.f132838a |= 8;
                            boet10.f132842e = containsKey4;
                            long elapsedRealtime4 = SystemClock.elapsedRealtime() - j;
                            if (da.f164950c) {
                            }
                            boet boet11 = (boet) da.f164949b;
                            boet11.f132838a |= 1;
                            boet11.f132839b = elapsedRealtime4;
                            ddx.m8217a((boet) da.mo74062i());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bogf = bogf2;
                        ddx = this;
                        z3 = false;
                        bundle2 = bundle3;
                        z = z3;
                        if (bogf.f164950c) {
                        }
                        bogg bogg42 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg42.f132979a |= 2;
                        bogg42.f132981c = str3;
                        if (da.f164950c) {
                        }
                        boet boet72 = (boet) da.f164949b;
                        bogg bogg52 = (bogg) bogf.mo74062i();
                        bogg52.getClass();
                        boet72.f132844g = bogg52;
                        boet72.f132838a |= 32;
                        boolean z52 = bundle2.getBoolean("handle_notification");
                        if (da.f164950c) {
                        }
                        boet boet82 = (boet) da.f164949b;
                        boet82.f132838a |= 2;
                        boet82.f132840c = z52;
                        boolean containsKey32 = bundle2.containsKey("callback_intent");
                        if (da.f164950c) {
                        }
                        boet boet92 = (boet) da.f164949b;
                        boet92.f132838a |= 4;
                        boet92.f132841d = containsKey32;
                        boolean containsKey42 = bundle2.containsKey("sync_extras");
                        if (da.f164950c) {
                        }
                        boet boet102 = (boet) da.f164949b;
                        boet102.f132838a |= 8;
                        boet102.f132842e = containsKey42;
                        long elapsedRealtime42 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                        }
                        boet boet112 = (boet) da.f164949b;
                        boet112.f132838a |= 1;
                        boet112.f132839b = elapsedRealtime42;
                        ddx.m8217a((boet) da.mo74062i());
                        throw th;
                    }
                }
                if (string != null) {
                    if (bogf2.f164950c) {
                        bogf2.mo74035c();
                        bogf2.f164950c = false;
                    }
                    bogg bogg6 = (bogg) bogf2.f164949b;
                    string.getClass();
                    bogg6.f132979a |= 1;
                    bogg6.f132980b = string;
                }
                svq b2 = svr.m36484b(this.f12959b);
                if (i != callingUid) {
                    String[] a3 = b2.mo26175a(callingUid);
                    if (a3 != null) {
                        bogf2.mo68907a(Arrays.asList(a3));
                    }
                }
                ilo ilo = (ilo) ilo.f21297a.mo13145b();
                ilq ilq = this.f12966i;
                AppDescription a4 = ilo.mo13121a(ilq.f21311f, callingUid, string, i, ilq);
                boolean b3 = rfz.m33557a(this.f12959b).mo24608b(Binder.getCallingUid());
                if (!"^^_account_id_^^".equals(str3)) {
                    z2 = false;
                    z3 = false;
                    boolean z6 = b3;
                    bogf = bogf2;
                    try {
                        TokenResponse a5 = mo8553a(account, str, bundle3, a4, z6, da);
                        if (a5 != null) {
                            Bundle a6 = mo8552a(account, str, bundle3, a4, a5, da);
                            if (bogf.f164950c) {
                                bogf.mo74035c();
                                bogf.f164950c = false;
                            }
                            bogg bogg7 = (bogg) bogf.f164949b;
                            str.getClass();
                            bogg7.f132979a |= 2;
                            bogg7.f132981c = str3;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet12 = (boet) da.f164949b;
                            bogg bogg8 = (bogg) bogf.mo74062i();
                            bogg8.getClass();
                            boet12.f132844g = bogg8;
                            boet12.f132838a |= 32;
                            boolean z7 = bundle3.getBoolean("handle_notification");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet13 = (boet) da.f164949b;
                            boet13.f132838a |= 2;
                            boet13.f132840c = z7;
                            boolean containsKey5 = bundle3.containsKey("callback_intent");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet14 = (boet) da.f164949b;
                            boet14.f132838a |= 4;
                            boet14.f132841d = containsKey5;
                            boolean containsKey6 = bundle3.containsKey("sync_extras");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet15 = (boet) da.f164949b;
                            boet15.f132838a |= 8;
                            boet15.f132842e = containsKey6;
                            long elapsedRealtime5 = SystemClock.elapsedRealtime() - j;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet16 = (boet) da.f164949b;
                            boet16.f132838a |= 1;
                            boet16.f132839b = elapsedRealtime5;
                            m8217a((boet) da.mo74062i());
                            return a6;
                        }
                        if (bogf.f164950c) {
                            bogf.mo74035c();
                            bogf.f164950c = false;
                        }
                        bogg bogg9 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg9.f132979a |= 2;
                        bogg9.f132981c = str3;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet17 = (boet) da.f164949b;
                        bogg bogg10 = (bogg) bogf.mo74062i();
                        bogg10.getClass();
                        boet17.f132844g = bogg10;
                        boet17.f132838a |= 32;
                        boolean z8 = bundle3.getBoolean("handle_notification");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet18 = (boet) da.f164949b;
                        boet18.f132838a |= 2;
                        boet18.f132840c = z8;
                        boolean containsKey7 = bundle3.containsKey("callback_intent");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet19 = (boet) da.f164949b;
                        boet19.f132838a |= 4;
                        boet19.f132841d = containsKey7;
                        boolean containsKey8 = bundle3.containsKey("sync_extras");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet20 = (boet) da.f164949b;
                        boet20.f132838a |= 8;
                        boet20.f132842e = containsKey8;
                        long elapsedRealtime6 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet21 = (boet) da.f164949b;
                        boet21.f132838a |= 1;
                        boet21.f132839b = elapsedRealtime6;
                        m8217a((boet) da.mo74062i());
                        return null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        ddx = this;
                        bundle2 = bundle3;
                        r8 = z2;
                        m8218a(e, da);
                        Bundle bundle42 = new Bundle();
                        if (e.getCause() instanceof InterruptedException) {
                        }
                        bundle42.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
                        if (bogf.f164950c) {
                        }
                        bogg bogg22 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg22.f132979a |= 2;
                        bogg22.f132981c = str3;
                        if (da.f164950c) {
                        }
                        boet boet22 = (boet) da.f164949b;
                        bogg bogg32 = (bogg) bogf.mo74062i();
                        bogg32.getClass();
                        boet22.f132844g = bogg32;
                        boet22.f132838a |= 32;
                        boolean z42 = bundle2.getBoolean("handle_notification");
                        if (da.f164950c) {
                        }
                        boet boet32 = (boet) da.f164949b;
                        boet32.f132838a |= 2;
                        boet32.f132840c = z42;
                        boolean containsKey9 = bundle2.containsKey("callback_intent");
                        if (da.f164950c) {
                        }
                        boet boet42 = (boet) da.f164949b;
                        boet42.f132838a |= 4;
                        boet42.f132841d = containsKey9;
                        boolean containsKey22 = bundle2.containsKey("sync_extras");
                        if (da.f164950c) {
                        }
                        boet boet52 = (boet) da.f164949b;
                        boet52.f132838a |= 8;
                        boet52.f132842e = containsKey22;
                        long elapsedRealtime32 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                        }
                        boet boet62 = (boet) da.f164949b;
                        boet62.f132838a |= 1;
                        boet62.f132839b = elapsedRealtime32;
                        ddx.m8217a((boet) da.mo74062i());
                        return bundle42;
                    } catch (Throwable th3) {
                        th = th3;
                        ddx = this;
                        bundle2 = bundle3;
                        z = z3;
                        if (bogf.f164950c) {
                        }
                        bogg bogg422 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg422.f132979a |= 2;
                        bogg422.f132981c = str3;
                        if (da.f164950c) {
                        }
                        boet boet722 = (boet) da.f164949b;
                        bogg bogg522 = (bogg) bogf.mo74062i();
                        bogg522.getClass();
                        boet722.f132844g = bogg522;
                        boet722.f132838a |= 32;
                        boolean z522 = bundle2.getBoolean("handle_notification");
                        if (da.f164950c) {
                        }
                        boet boet822 = (boet) da.f164949b;
                        boet822.f132838a |= 2;
                        boet822.f132840c = z522;
                        boolean containsKey322 = bundle2.containsKey("callback_intent");
                        if (da.f164950c) {
                        }
                        boet boet922 = (boet) da.f164949b;
                        boet922.f132838a |= 4;
                        boet922.f132841d = containsKey322;
                        boolean containsKey422 = bundle2.containsKey("sync_extras");
                        if (da.f164950c) {
                        }
                        boet boet1022 = (boet) da.f164949b;
                        boet1022.f132838a |= 8;
                        boet1022.f132842e = containsKey422;
                        long elapsedRealtime422 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                        }
                        boet boet1122 = (boet) da.f164949b;
                        boet1122.f132838a |= 1;
                        boet1122.f132839b = elapsedRealtime422;
                        ddx.m8217a((boet) da.mo74062i());
                        throw th;
                    }
                } else {
                    ddx = this;
                    z2 = false;
                    z3 = false;
                    boolean z9 = b3;
                    bogf = bogf2;
                    try {
                        Bundle a7 = mo8551a(account, bundle3, a4, z9, da);
                        if (bogf.f164950c) {
                            bogf.mo74035c();
                            bogf.f164950c = false;
                        }
                        bogg bogg11 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg11.f132979a |= 2;
                        bogg11.f132981c = str3;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet23 = (boet) da.f164949b;
                        bogg bogg12 = (bogg) bogf.mo74062i();
                        bogg12.getClass();
                        boet23.f132844g = bogg12;
                        boet23.f132838a |= 32;
                        boolean z10 = bundle3.getBoolean("handle_notification");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet24 = (boet) da.f164949b;
                        boet24.f132838a |= 2;
                        boet24.f132840c = z10;
                        boolean containsKey10 = bundle3.containsKey("callback_intent");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet25 = (boet) da.f164949b;
                        boet25.f132838a |= 4;
                        boet25.f132841d = containsKey10;
                        boolean containsKey11 = bundle3.containsKey("sync_extras");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet26 = (boet) da.f164949b;
                        boet26.f132838a |= 8;
                        boet26.f132842e = containsKey11;
                        long elapsedRealtime7 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet27 = (boet) da.f164949b;
                        boet27.f132838a |= 1;
                        boet27.f132839b = elapsedRealtime7;
                        ddx.m8217a((boet) da.mo74062i());
                        return a7;
                    } catch (RuntimeException e3) {
                        e = e3;
                        bundle2 = bundle3;
                        r8 = z2;
                        m8218a(e, da);
                        Bundle bundle422 = new Bundle();
                        if (e.getCause() instanceof InterruptedException) {
                        }
                        bundle422.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
                        if (bogf.f164950c) {
                        }
                        bogg bogg222 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg222.f132979a |= 2;
                        bogg222.f132981c = str3;
                        if (da.f164950c) {
                        }
                        boet boet222 = (boet) da.f164949b;
                        bogg bogg322 = (bogg) bogf.mo74062i();
                        bogg322.getClass();
                        boet222.f132844g = bogg322;
                        boet222.f132838a |= 32;
                        boolean z422 = bundle2.getBoolean("handle_notification");
                        if (da.f164950c) {
                        }
                        boet boet322 = (boet) da.f164949b;
                        boet322.f132838a |= 2;
                        boet322.f132840c = z422;
                        boolean containsKey92 = bundle2.containsKey("callback_intent");
                        if (da.f164950c) {
                        }
                        boet boet422 = (boet) da.f164949b;
                        boet422.f132838a |= 4;
                        boet422.f132841d = containsKey92;
                        boolean containsKey222 = bundle2.containsKey("sync_extras");
                        if (da.f164950c) {
                        }
                        boet boet522 = (boet) da.f164949b;
                        boet522.f132838a |= 8;
                        boet522.f132842e = containsKey222;
                        long elapsedRealtime322 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                        }
                        boet boet622 = (boet) da.f164949b;
                        boet622.f132838a |= 1;
                        boet622.f132839b = elapsedRealtime322;
                        ddx.m8217a((boet) da.mo74062i());
                        return bundle422;
                    } catch (Throwable th4) {
                        th = th4;
                        bundle2 = bundle3;
                        z = z3;
                        if (bogf.f164950c) {
                        }
                        bogg bogg4222 = (bogg) bogf.f164949b;
                        str.getClass();
                        bogg4222.f132979a |= 2;
                        bogg4222.f132981c = str3;
                        if (da.f164950c) {
                        }
                        boet boet7222 = (boet) da.f164949b;
                        bogg bogg5222 = (bogg) bogf.mo74062i();
                        bogg5222.getClass();
                        boet7222.f132844g = bogg5222;
                        boet7222.f132838a |= 32;
                        boolean z5222 = bundle2.getBoolean("handle_notification");
                        if (da.f164950c) {
                        }
                        boet boet8222 = (boet) da.f164949b;
                        boet8222.f132838a |= 2;
                        boet8222.f132840c = z5222;
                        boolean containsKey3222 = bundle2.containsKey("callback_intent");
                        if (da.f164950c) {
                        }
                        boet boet9222 = (boet) da.f164949b;
                        boet9222.f132838a |= 4;
                        boet9222.f132841d = containsKey3222;
                        boolean containsKey4222 = bundle2.containsKey("sync_extras");
                        if (da.f164950c) {
                        }
                        boet boet10222 = (boet) da.f164949b;
                        boet10222.f132838a |= 8;
                        boet10222.f132842e = containsKey4222;
                        long elapsedRealtime4222 = SystemClock.elapsedRealtime() - j;
                        if (da.f164950c) {
                        }
                        boet boet11222 = (boet) da.f164949b;
                        boet11222.f132838a |= 1;
                        boet11222.f132839b = elapsedRealtime4222;
                        ddx.m8217a((boet) da.mo74062i());
                        throw th;
                    }
                }
            } catch (RuntimeException e4) {
                e = e4;
                bogf = bogf2;
                ddx = this;
                r8 = 0;
                m8218a(e, da);
                Bundle bundle4222 = new Bundle();
                if (e.getCause() instanceof InterruptedException) {
                }
                bundle4222.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
                if (bogf.f164950c) {
                }
                bogg bogg2222 = (bogg) bogf.f164949b;
                str.getClass();
                bogg2222.f132979a |= 2;
                bogg2222.f132981c = str3;
                if (da.f164950c) {
                }
                boet boet2222 = (boet) da.f164949b;
                bogg bogg3222 = (bogg) bogf.mo74062i();
                bogg3222.getClass();
                boet2222.f132844g = bogg3222;
                boet2222.f132838a |= 32;
                boolean z4222 = bundle2.getBoolean("handle_notification");
                if (da.f164950c) {
                }
                boet boet3222 = (boet) da.f164949b;
                boet3222.f132838a |= 2;
                boet3222.f132840c = z4222;
                boolean containsKey922 = bundle2.containsKey("callback_intent");
                if (da.f164950c) {
                }
                boet boet4222 = (boet) da.f164949b;
                boet4222.f132838a |= 4;
                boet4222.f132841d = containsKey922;
                boolean containsKey2222 = bundle2.containsKey("sync_extras");
                if (da.f164950c) {
                }
                boet boet5222 = (boet) da.f164949b;
                boet5222.f132838a |= 8;
                boet5222.f132842e = containsKey2222;
                long elapsedRealtime3222 = SystemClock.elapsedRealtime() - j;
                if (da.f164950c) {
                }
                boet boet6222 = (boet) da.f164949b;
                boet6222.f132838a |= 1;
                boet6222.f132839b = elapsedRealtime3222;
                ddx.m8217a((boet) da.mo74062i());
                return bundle4222;
            } catch (Throwable th5) {
                th = th5;
                bogf = bogf2;
                ddx = this;
                z = false;
                if (bogf.f164950c) {
                }
                bogg bogg42222 = (bogg) bogf.f164949b;
                str.getClass();
                bogg42222.f132979a |= 2;
                bogg42222.f132981c = str3;
                if (da.f164950c) {
                }
                boet boet72222 = (boet) da.f164949b;
                bogg bogg52222 = (bogg) bogf.mo74062i();
                bogg52222.getClass();
                boet72222.f132844g = bogg52222;
                boet72222.f132838a |= 32;
                boolean z52222 = bundle2.getBoolean("handle_notification");
                if (da.f164950c) {
                }
                boet boet82222 = (boet) da.f164949b;
                boet82222.f132838a |= 2;
                boet82222.f132840c = z52222;
                boolean containsKey32222 = bundle2.containsKey("callback_intent");
                if (da.f164950c) {
                }
                boet boet92222 = (boet) da.f164949b;
                boet92222.f132838a |= 4;
                boet92222.f132841d = containsKey32222;
                boolean containsKey42222 = bundle2.containsKey("sync_extras");
                if (da.f164950c) {
                }
                boet boet102222 = (boet) da.f164949b;
                boet102222.f132838a |= 8;
                boet102222.f132842e = containsKey42222;
                long elapsedRealtime42222 = SystemClock.elapsedRealtime() - j;
                if (da.f164950c) {
                }
                boet boet112222 = (boet) da.f164949b;
                boet112222.f132838a |= 1;
                boet112222.f132839b = elapsedRealtime42222;
                ddx.m8217a((boet) da.mo74062i());
                throw th;
            }
        } catch (gkn e5) {
            String valueOf = String.valueOf(string);
            throw new SecurityException(valueOf.length() == 0 ? new String("Invalid consumer package: ") : "Invalid consumer package: ".concat(valueOf));
        } catch (RuntimeException e6) {
            e = e6;
            j = elapsedRealtime;
            bogf = bogf2;
            ddx = this;
            r8 = 0;
            m8218a(e, da);
            Bundle bundle42222 = new Bundle();
            if (e.getCause() instanceof InterruptedException) {
                ChimeraGetToken.f9926a.mo25416d("Failed to get token or recovery information. Likely due to BlockingServiceConnection interruption.", new Object[r8]);
            } else if (!(e instanceof SecurityException)) {
                ChimeraGetToken.f9926a.mo25417e("Exception while trying to get token.", e, new Object[r8]);
            } else {
                ChimeraGetToken.f9926a.mo25417e("Exception while trying to get token for security reasons.", e, new Object[r8]);
                throw e;
            }
            bundle42222.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
            if (bogf.f164950c) {
                bogf.mo74035c();
                bogf.f164950c = r8;
            }
            bogg bogg22222 = (bogg) bogf.f164949b;
            str.getClass();
            bogg22222.f132979a |= 2;
            bogg22222.f132981c = str3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r8;
            }
            boet boet22222 = (boet) da.f164949b;
            bogg bogg32222 = (bogg) bogf.mo74062i();
            bogg32222.getClass();
            boet22222.f132844g = bogg32222;
            boet22222.f132838a |= 32;
            boolean z42222 = bundle2.getBoolean("handle_notification");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r8;
            }
            boet boet32222 = (boet) da.f164949b;
            boet32222.f132838a |= 2;
            boet32222.f132840c = z42222;
            boolean containsKey9222 = bundle2.containsKey("callback_intent");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r8;
            }
            boet boet42222 = (boet) da.f164949b;
            boet42222.f132838a |= 4;
            boet42222.f132841d = containsKey9222;
            boolean containsKey22222 = bundle2.containsKey("sync_extras");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r8;
            }
            boet boet52222 = (boet) da.f164949b;
            boet52222.f132838a |= 8;
            boet52222.f132842e = containsKey22222;
            long elapsedRealtime32222 = SystemClock.elapsedRealtime() - j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r8;
            }
            boet boet62222 = (boet) da.f164949b;
            boet62222.f132838a |= 1;
            boet62222.f132839b = elapsedRealtime32222;
            ddx.m8217a((boet) da.mo74062i());
            return bundle42222;
        } catch (Throwable th6) {
            th = th6;
            j = elapsedRealtime;
            bogf = bogf2;
            ddx = this;
            z = false;
            if (bogf.f164950c) {
                bogf.mo74035c();
                bogf.f164950c = z;
            }
            bogg bogg422222 = (bogg) bogf.f164949b;
            str.getClass();
            bogg422222.f132979a |= 2;
            bogg422222.f132981c = str3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            boet boet722222 = (boet) da.f164949b;
            bogg bogg522222 = (bogg) bogf.mo74062i();
            bogg522222.getClass();
            boet722222.f132844g = bogg522222;
            boet722222.f132838a |= 32;
            boolean z522222 = bundle2.getBoolean("handle_notification");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            boet boet822222 = (boet) da.f164949b;
            boet822222.f132838a |= 2;
            boet822222.f132840c = z522222;
            boolean containsKey322222 = bundle2.containsKey("callback_intent");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            boet boet922222 = (boet) da.f164949b;
            boet922222.f132838a |= 4;
            boet922222.f132841d = containsKey322222;
            boolean containsKey422222 = bundle2.containsKey("sync_extras");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            boet boet1022222 = (boet) da.f164949b;
            boet1022222.f132838a |= 8;
            boet1022222.f132842e = containsKey422222;
            long elapsedRealtime422222 = SystemClock.elapsedRealtime() - j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            boet boet1122222 = (boet) da.f164949b;
            boet1122222.f132838a |= 1;
            boet1122222.f132839b = elapsedRealtime422222;
            ddx.m8217a((boet) da.mo74062i());
            throw th;
        }
    }

    /* renamed from: a */
    public final Bundle mo8552a(Account account, String str, Bundle bundle, AppDescription appDescription, TokenResponse tokenResponse, bxvd bxvd) {
        PACLConfig pACLConfig;
        Bitmap bitmap;
        Account account2 = account;
        Bundle bundle2 = bundle;
        AppDescription appDescription2 = appDescription;
        TokenResponse tokenResponse2 = tokenResponse;
        bxvd bxvd2 = bxvd;
        String str2 = tokenResponse.mo7647b().f22000ac;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        boet boet = (boet) bxvd2.f164949b;
        boet boet2 = boet.f132836q;
        str2.getClass();
        boet.f132838a |= 1024;
        boet.f132849l = str2;
        long j = tokenResponse2.f10747x.getLong("logging.gads_connection_latency_millis", -1);
        if (j >= 0) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            boet boet3 = (boet) bxvd2.f164949b;
            boet3.f132838a |= 128;
            boet3.f132846i = j;
        }
        long j2 = tokenResponse2.f10747x.getLong("logging.internal_service_latency_millis", -1);
        if (j2 >= 0) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            boet boet4 = (boet) bxvd2.f164949b;
            boet4.f132838a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            boet4.f132847j = j2;
        }
        long j3 = tokenResponse2.f10747x.getLong("logging.network_latency_millis", -1);
        if (j3 >= 0) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            boet boet5 = (boet) bxvd2.f164949b;
            boet5.f132838a |= 512;
            boet5.f132848k = j3;
        }
        TokenData tokenData = tokenResponse2.f10746w;
        if (tokenData == null) {
            Bundle bundle3 = new Bundle();
            boolean equals = izj.NEED_PERMISSION.equals(tokenResponse.mo7647b());
            if (ccbs.f178728a.mo6606a().mo75751a()) {
                equals = izj.NEED_PERMISSION.equals(tokenResponse.mo7647b()) || izj.NEED_REMOTE_CONSENT.equals(tokenResponse.mo7647b());
            }
            if (equals && soz.m35807f(this.f12959b)) {
                bundle3.putString("Error", izj.PERMISSION_DENIED.f22000ac);
                return bundle3;
            }
            bundle3.putString("Error", tokenResponse.mo7647b().f22000ac);
            sek sek = ChimeraGetToken.f9926a;
            String valueOf = String.valueOf(tokenResponse.mo7647b().f22000ac);
            sek.mo25416d(valueOf.length() == 0 ? new String("GetToken failed with status code: ") : "GetToken failed with status code: ".concat(valueOf), new Object[0]);
            if (izj.m16367a(tokenResponse.mo7647b())) {
                AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) bundle2.getParcelable("accountManagerResponse");
                String string = bundle2.getString("request_visible_actions");
                Bitmap bitmap2 = null;
                if (string != null) {
                    pACLConfig = new PACLConfig(string, null);
                } else {
                    pACLConfig = null;
                }
                TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
                tokenWorkflowRequest.f10820j = accountAuthenticatorResponse;
                tokenWorkflowRequest.mo7666a(account2);
                tokenWorkflowRequest.f10812b = str;
                tokenWorkflowRequest.mo7667a(bundle2);
                tokenWorkflowRequest.f10816f = pACLConfig;
                tokenWorkflowRequest.f10818h = appDescription2;
                tokenWorkflowRequest.f10817g = bundle2.getBoolean("suppressProgressScreen", false);
                Intent a = imt.m15732a(FilteringRedirectChimeraActivity.m7013a(this.f12959b, this.f12960c.mo11950a(tokenWorkflowRequest), ChimeraGetToken.f9927b, accountAuthenticatorResponse));
                bundle3.putParcelable("userRecoveryIntent", a);
                if (bundle2.getBoolean("handle_notification", false) && equals) {
                    gkp gkp = this.f12961d;
                    String str3 = appDescription2.f10841e;
                    if (gkp.mo11994c(account2)) {
                        String string2 = gkp.f18421a.getString(C0126R.string.app_level_title);
                        Drawable b = gkp.f18422b.mo13152b(str3);
                        if (b != null) {
                            if (b instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) b).getBitmap();
                                gkp.mo11992a(String.format("%s:%s:%s:%s", "com.google.android.gms.auth.TokenNotificationManager", account2.name, account2.type, str3), PendingIntent.getActivity(gkp.f18421a, 0, a, 134217728), account, string2, bitmap, false);
                            } else {
                                bitmap2 = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap2);
                                b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                b.draw(canvas);
                            }
                        }
                        bitmap = bitmap2;
                        gkp.mo11992a(String.format("%s:%s:%s:%s", "com.google.android.gms.auth.TokenNotificationManager", account2.name, account2.type, str3), PendingIntent.getActivity(gkp.f18421a, 0, a, 134217728), account, string2, bitmap, false);
                    }
                }
            }
            return bundle3;
        }
        boolean z = tokenData.f9946d;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        boet boet6 = (boet) bxvd2.f164949b;
        boet6.f132838a |= 16;
        boet6.f132843f = z;
        return m8215a(account2, tokenData);
    }

    /* renamed from: a */
    public final Bundle mo8547a(Bundle bundle) {
        Account[] accountArr;
        try {
            if (rfz.m33557a(this.f12959b).mo24608b(Binder.getCallingUid())) {
                String[] stringArray = bundle.getStringArray("account_features");
                String string = bundle.getString("accountType");
                if (stringArray == null) {
                    accountArr = this.f12963f.mo33916a(string);
                } else {
                    try {
                        accountArr = (Account[]) this.f12963f.mo33907a(string, stringArray).getResult(5, TimeUnit.SECONDS);
                    } catch (OperationCanceledException e) {
                        e = e;
                        ChimeraGetToken.f9926a.mo25415d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    } catch (AuthenticatorException e2) {
                        e = e2;
                        ChimeraGetToken.f9926a.mo25415d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    } catch (IOException e3) {
                        e = e3;
                        ChimeraGetToken.f9926a.mo25415d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("accounts", accountArr);
                return bundle2;
            }
            throw new SecurityException("Caller isn't signed with recognized keys!");
        } catch (RuntimeException e4) {
            ChimeraGetToken.f9926a.mo25415d("RuntimeException thrown in getAccounts()!", e4, new Object[0]);
            throw e4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Bundle mo8548a(String str, Bundle bundle) {
        ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
        clearTokenRequest.f10609b = str;
        Bundle bundle2 = new Bundle();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ClearTokenResponse a = this.f12965h.mo12027a(clearTokenRequest);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bxvd da = bocl.f132567d.mo74144da();
            boolean equals = izj.m16369c(a.f10611b).equals(izj.SUCCESS);
            bundle2.putBoolean("booleanResult", equals);
            boolean z = !equals;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocl bocl = (bocl) da.f164949b;
            int i = bocl.f132569a | 1;
            bocl.f132569a = i;
            bocl.f132570b = z;
            bocl.f132571c = 1;
            bocl.f132569a = i | 2;
            m8216a((bocl) da.mo74062i());
            return bundle2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final AccountChangeEventsResponse mo8549a(AccountChangeEventsRequest accountChangeEventsRequest) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            AccountChangeEventsResponse a = this.f12965h.mo12025a(accountChangeEventsRequest);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bxvd da = bocl.f132567d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocl bocl = (bocl) da.f164949b;
            int i = bocl.f132569a | 1;
            bocl.f132569a = i;
            bocl.f132570b = false;
            bocl.f132571c = 2;
            bocl.f132569a = 2 | i;
            m8216a((bocl) da.mo74062i());
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public final TokenResponse mo8553a(Account account, String str, Bundle bundle, AppDescription appDescription, boolean z, bxvd bxvd) {
        TokenRequest tokenRequest = new TokenRequest(account, str);
        boolean startsWith = str.startsWith("audience:server:client_id:");
        String str2 = "1";
        if (startsWith && cbyw.f178570a.mo6606a().mo75618a() && !bundle.containsKey("oauth2_include_email")) {
            bundle.putString("oauth2_include_email", str2);
        }
        String string = bundle.getString("request_visible_actions");
        if (string != null) {
            tokenRequest.f10710f = new PACLConfig(string, null);
        }
        if (z) {
            tokenRequest.f10717m = bundle.getBoolean("UseCache", true);
        }
        bundle.remove("UseCache");
        if (cbzh.f178585a.mo6606a().mo75629a()) {
            if (!(!bundle.getBoolean("handle_notification"))) {
                str2 = "0";
            }
            bundle.putString("oauth2_foreground", str2);
        }
        for (String str3 : bundle.keySet()) {
            if (str3 != null) {
                if (!str3.startsWith("_opt_")) {
                    if (str3.startsWith("oauth2_")) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        boet boet = (boet) bxvd.f164949b;
                        boet boet2 = boet.f132836q;
                        str3.getClass();
                        if (!boet.f132851n.mo73666a()) {
                            boet.f132851n = bxvk.m124021a(boet.f132851n);
                        }
                        boet.f132851n.add(str3);
                    }
                } else if (z) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    boet boet3 = (boet) bxvd.f164949b;
                    boet boet4 = boet.f132836q;
                    str3.getClass();
                    if (!boet3.f132850m.mo73666a()) {
                        boet3.f132850m = bxvk.m124021a(boet3.f132850m);
                    }
                    boet3.f132850m.add(str3);
                } else {
                    bundle.remove(str3);
                }
            }
        }
        int i = bundle.getInt("delegation_type", 0);
        String string2 = bundle.getString("delegatee_user_id");
        if (!(!z || i == 0 || string2 == null)) {
            tokenRequest.f10719o = i;
            sdo.m34977c(string2);
            tokenRequest.f10720p = string2;
        }
        bundle.remove("delegation_type");
        bundle.remove("delegatee_user_id");
        tokenRequest.f10714j = appDescription;
        tokenRequest.mo7638a(bundle);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            TokenResponse a = this.f12965h.mo12030a(tokenRequest.f10714j, tokenRequest);
            if (a == null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boet boet5 = (boet) bxvd.f164949b;
                boet boet6 = boet.f132836q;
                boet5.f132838a |= 2048;
                boet5.f132852o = true;
                ChimeraGetToken.f9926a.mo25416d("Getting token failed and returned null!", new Object[0]);
            }
            return a;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        switch (i) {
            case 1:
                Bundle a = mo8546a(new Account(parcel.readString(), "com.google"), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 2:
                Bundle a2 = mo8548a(parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                break;
            case 3:
                AccountChangeEventsResponse a3 = mo8549a((AccountChangeEventsRequest) dcl.m8163a(parcel, AccountChangeEventsRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                break;
            case 4:
            default:
                return false;
            case 5:
                Bundle a4 = mo8546a((Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a4);
                break;
            case 6:
                Bundle a5 = mo8547a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a5);
                break;
            case 7:
                Bundle a6 = mo8550a((Account) dcl.m8163a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a6);
                break;
            case 8:
                String readString = parcel.readString();
                if (!gsg.m13820b()) {
                    ChimeraGetToken.f9926a.mo25416d("requestGoogleAccountsAccess API is disabled", new Object[0]);
                    bundle = gsh.m13824a();
                } else {
                    int callingUid = Binder.getCallingUid();
                    gsg gsg = (gsg) gsg.f18948d.mo13145b();
                    String[] a7 = svr.m36484b(this.f12959b).mo26175a(callingUid);
                    if (a7 != null) {
                        boolean z = false;
                        for (String str : a7) {
                            if (str.equals(readString)) {
                                z = true;
                            }
                        }
                        if (z) {
                            bundle = gsg.mo12164a(readString, rfz.m33557a(this.f12959b).mo24608b(callingUid));
                        }
                    }
                    sek sek = ChimeraGetToken.f9926a;
                    StringBuilder sb = new StringBuilder(String.valueOf(readString).length() + 44);
                    sb.append("Package ");
                    sb.append(readString);
                    sb.append(" does not belong to (uid=");
                    sb.append(callingUid);
                    sek.mo25416d(sb.toString(), new Object[0]);
                    bundle = gsh.m13824a();
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle);
                break;
        }
        return true;
    }
}

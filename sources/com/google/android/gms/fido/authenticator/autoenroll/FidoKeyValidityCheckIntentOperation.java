package com.google.android.gms.fido.authenticator.autoenroll;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FidoKeyValidityCheckIntentOperation extends IntentOperation {

    /* renamed from: i */
    private static final sek f31646i = new sek(new String[]{"FidoKeyValidityCheckIntentOperation"}, (short[]) null);

    /* renamed from: a */
    private final Context f31647a;

    /* renamed from: b */
    private final xwj f31648b;

    /* renamed from: c */
    private final xbo f31649c;

    /* renamed from: d */
    private final xbk f31650d;

    /* renamed from: e */
    private final xdx f31651e;

    /* renamed from: f */
    private final xbx f31652f;

    /* renamed from: g */
    private final SharedPreferences f31653g;

    /* renamed from: h */
    private final xwn f31654h;

    public FidoKeyValidityCheckIntentOperation() {
        this.f31647a = this;
        this.f31648b = xwj.m43507a(xwi.FIDO_KEY_VALIDITY_CHECK_V2);
        this.f31649c = (xbo) xbo.f51879a.mo33309a();
        this.f31650d = new xbk(this.f31647a);
        this.f31651e = new xdx();
        this.f31652f = new xbx(this.f31647a);
        this.f31653g = rpr.m34216b().getSharedPreferences("com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheck", 0);
        this.f31654h = xwm.m43525a();
    }

    /* renamed from: a */
    public static void m23419a(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoKeyValidityCheckIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK_DELAY_COMPLETE"), 0, 134217728);
        skc skc = new skc(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) xmn.f52763m.mo58455c()).longValue();
        long j = longValue / 2;
        double random = Math.random();
        double d = (double) longValue;
        Double.isNaN(d);
        skc.mo25675a("FidoKeyValidityCheckIntentOperation", 2, elapsedRealtime + j + ((long) (random * d)), pendingIntent, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db A[Catch:{ xbn -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee A[Catch:{ xbn -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b3 A[SYNTHETIC, Splitter:B:61:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b1 A[SYNTHETIC, Splitter:B:98:0x02b1] */
    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4 = true;
        f31646i.mo25412b("Received %s event", intent.getAction());
        if (!intent.getAction().equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK_DELAY_COMPLETE")) {
            f31646i.mo25418e("Intent action %s is not FIDO check key validity", intent.getAction());
            return;
        }
        Context context = this.f31647a;
        m23419a(context, context.getPackageName());
        if (!((Boolean) xmn.f52762l.mo58455c()).booleanValue()) {
            f31646i.mo25418e("Fido auto enrollment is disabled", new Object[0]);
            return;
        }
        if (!((KeyguardManager) this.f31647a.getSystemService("keyguard")).isDeviceSecure()) {
            try {
                List<xjx> a = this.f31649c.mo29612a();
                f31646i.mo25412b("Screen lock is not enabled on device, thus mark all KeyStore keys as invalid and delete all the KeyStore credentials", new Object[0]);
                z2 = !a.isEmpty();
                try {
                    for (xjx xjx : a) {
                        this.f31649c.mo29616a(xjx);
                        this.f31651e.mo29672a(xjx);
                    }
                    z = false;
                } catch (xbn e) {
                    e = e;
                    f31646i.mo25417e("Error accessing account enroll status store for all valid keystore keys", e, new Object[0]);
                    m23420a(e);
                    z = true;
                    f31646i.mo25412b("Screen lock is disabled. Invalidate all the KeyStore keys.", new Object[0]);
                    try {
                        List<String> b = this.f31649c.mo29617b();
                        if (!z2) {
                        }
                        try {
                            while (r3.hasNext()) {
                            }
                        } catch (xbn e2) {
                            e = e2;
                            f31646i.mo25417e("Error accessing account enroll status store for all the enrolled accounts", e, new Object[0]);
                            m23420a(e);
                            z = true;
                            this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                            if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                            }
                            this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                            if (!this.f31649c.mo29612a().isEmpty()) {
                            }
                        }
                    } catch (xbn e3) {
                        e = e3;
                        f31646i.mo25417e("Error accessing account enroll status store for all the enrolled accounts", e, new Object[0]);
                        m23420a(e);
                        z = true;
                        this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                        if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                        }
                        this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                        if (!this.f31649c.mo29612a().isEmpty()) {
                        }
                    }
                    this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                    if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                    }
                    this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                    if (!this.f31649c.mo29612a().isEmpty()) {
                    }
                } catch (xma e4) {
                    e = e4;
                    f31646i.mo25418e("Error deleting the credential", new Object[0]);
                    m23420a(e);
                    z = true;
                    f31646i.mo25412b("Screen lock is disabled. Invalidate all the KeyStore keys.", new Object[0]);
                    List<String> b2 = this.f31649c.mo29617b();
                    if (!z2) {
                    }
                    while (r3.hasNext()) {
                    }
                    this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                    if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                    }
                    this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                    if (!this.f31649c.mo29612a().isEmpty()) {
                    }
                }
            } catch (xbn e5) {
                e = e5;
                z2 = false;
                f31646i.mo25417e("Error accessing account enroll status store for all valid keystore keys", e, new Object[0]);
                m23420a(e);
                z = true;
                f31646i.mo25412b("Screen lock is disabled. Invalidate all the KeyStore keys.", new Object[0]);
                List<String> b22 = this.f31649c.mo29617b();
                if (!z2) {
                }
                while (r3.hasNext()) {
                }
                this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                }
                this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                if (!this.f31649c.mo29612a().isEmpty()) {
                }
            } catch (xma e6) {
                e = e6;
                z2 = false;
                f31646i.mo25418e("Error deleting the credential", new Object[0]);
                m23420a(e);
                z = true;
                f31646i.mo25412b("Screen lock is disabled. Invalidate all the KeyStore keys.", new Object[0]);
                List<String> b222 = this.f31649c.mo29617b();
                if (!z2) {
                }
                while (r3.hasNext()) {
                }
                this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
                if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
                }
                this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                if (!this.f31649c.mo29612a().isEmpty()) {
                }
            }
            if (((Boolean) xmn.f52764n.mo58455c()).booleanValue() && !this.f31653g.getBoolean("screenlockDisabledAndKeysInvalidated", false)) {
                f31646i.mo25412b("Screen lock is disabled. Invalidate all the KeyStore keys.", new Object[0]);
                List<String> b2222 = this.f31649c.mo29617b();
                z2 = !z2 || !b2222.isEmpty();
                for (String str2 : b2222) {
                    xbx xbx = this.f31652f;
                    xka xka = xka.ANDROID_KEYSTORE;
                    sek sek = xbx.f51896c;
                    String str3 = xka.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 49 + String.valueOf(str3).length());
                    sb.append("Invalidate custom keys for account ");
                    sb.append(str2);
                    sb.append(" and key type ");
                    sb.append(str3);
                    sek.mo25412b(sb.toString(), new Object[0]);
                    ios a2 = inl.m15759a(xbx.f51897a);
                    int ordinal = xka.ordinal();
                    if (ordinal == 0) {
                        str = "fido:hardware_protected_uv";
                    } else if (ordinal == 1) {
                        str = "fido:software_optional_uv";
                    } else if (ordinal == 2) {
                        str = "fido:strongbox_protected_up";
                    } else {
                        throw new RuntimeException("This should never happen. The key type doesn't exist.");
                    }
                    aucb b3 = a2.mo24732b(new ioc(str, new Account(str2, "com.google"), bnkn.m109661a()));
                    b3.mo50373a(new xbu(b3));
                    b3.mo50372a(new xbv());
                }
                this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", true).apply();
            }
        } else {
            this.f31653g.edit().putBoolean("screenlockDisabledAndKeysInvalidated", false).apply();
            z = false;
            z2 = false;
        }
        if (((Boolean) xmn.f52765o.mo58455c()).booleanValue()) {
            try {
                xbk xbk = this.f31650d;
                Set a3 = xbk.mo29609a();
                HashSet a4 = bnpf.m110047a();
                for (xka xka2 : xka.values()) {
                    a4.addAll(xbk.f51876a.mo29614a(xka2));
                }
                bnpd c = bnpf.m110057c(a4, a3);
                if (z2 || !c.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    bnrd a5 = ((bnoz) c).iterator();
                    while (a5.hasNext()) {
                        String str4 = (String) a5.next();
                        for (xjx xjx2 : this.f31649c.mo29613a(str4)) {
                            sek sek2 = f31646i;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 66);
                            sb2.append("Remove credential identifier for account ");
                            sb2.append(str4);
                            sb2.append(" from credential database");
                            sek2.mo25412b(sb2.toString(), new Object[0]);
                            this.f31651e.mo29672a(xjx2);
                        }
                        sek sek3 = f31646i;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 66);
                        sb3.append("Remove credential identifier for account ");
                        sb3.append(str4);
                        sb3.append(" from enrollment database");
                        sek3.mo25412b(sb3.toString(), new Object[0]);
                        this.f31649c.mo29618b(str4);
                    }
                    z4 = z;
                } catch (xbn e7) {
                    e = e7;
                    f31646i.mo25418e("Error fetching all active enrollments", new Object[0]);
                    m23420a(e);
                    this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                    if (!this.f31649c.mo29612a().isEmpty()) {
                    }
                } catch (xma e8) {
                    e = e8;
                    f31646i.mo25418e("Error removing the credential identifier from credential store", new Object[0]);
                    m23420a(e);
                    this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                    if (!this.f31649c.mo29612a().isEmpty()) {
                    }
                }
            } catch (xbn e9) {
                e = e9;
                f31646i.mo25418e("Error fetching all active enrollments", new Object[0]);
                m23420a(e);
                this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                if (!this.f31649c.mo29612a().isEmpty()) {
                }
            } catch (xma e10) {
                e = e10;
                f31646i.mo25418e("Error removing the credential identifier from credential store", new Object[0]);
                m23420a(e);
                this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                if (!this.f31649c.mo29612a().isEmpty()) {
                }
            }
        } else {
            z4 = z;
        }
        if (z2 && !z4) {
            this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
        }
        try {
            if (!this.f31649c.mo29612a().isEmpty()) {
                Context context2 = this.f31647a;
                context2.startService(IntentOperation.getStartIntent(context2, FidoKeyValidityCheckPersistentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK"));
                return;
            }
            f31646i.mo25412b("No valid KeyStore key in database. No need to start service.", new Object[0]);
        } catch (xbn e11) {
            f31646i.mo25417e("Error fetching all valid KeyStore keys from database", e11, new Object[0]);
        }
    }

    FidoKeyValidityCheckIntentOperation(Context context, xwj xwj, xbo xbo, xbk xbk, xdx xdx, xbx xbx, SharedPreferences sharedPreferences, xwn xwn) {
        this.f31647a = context;
        this.f31648b = xwj;
        this.f31649c = xbo;
        this.f31650d = xbk;
        this.f31651e = xdx;
        this.f31652f = xbx;
        this.f31653g = sharedPreferences;
        this.f31654h = xwn;
    }

    /* renamed from: a */
    private final void m23420a(Throwable th) {
        this.f31654h.mo30193a(this.f31648b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR, wzu.KEY_TYPE_KEYSTORE, 2, th);
    }
}

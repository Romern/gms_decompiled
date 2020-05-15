package com.google.android.gms.locationsharing.ovenfresh;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends rpx {

    /* renamed from: b */
    public static final srn f79670b = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: f */
    private static final int f79671f = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: g */
    private static final long f79672g = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: h */
    private static final long f79673h = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: i */
    private static final long f79674i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    public ReportingState f79675c;

    /* renamed from: d */
    public int f79676d;

    /* renamed from: e */
    public rjx f79677e;

    /* renamed from: j */
    private long f79678j;

    /* renamed from: k */
    private String f79679k;

    /* renamed from: l */
    private rjx f79680l;

    /* renamed from: m */
    private rjx f79681m;

    public GcmReceiverChimeraService() {
        super("GcmReceiverService", "GCM", 9);
    }

    /* renamed from: a */
    private static int m67036a(Intent intent, String str, int i) {
        if (intent.hasExtra(str)) {
            try {
                return Integer.parseInt(intent.getStringExtra(str));
            } catch (NumberFormatException e) {
                bnsl bnsl = (bnsl) f79670b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to format:%s;", str);
            }
        }
        return i;
    }

    /* renamed from: b */
    private final int m67043b() {
        try {
            return Settings.Secure.getInt(getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: b */
    private final int m67044b(Intent intent) {
        Account account;
        if (m67036a(intent, "version", 1) > 1) {
            bnsl bnsl = (bnsl) f79670b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("GCM version incompatible");
            return 10;
        } else if (!intent.hasExtra("gaia_id") && !intent.hasExtra("account_name")) {
            bnsl bnsl2 = (bnsl) f79670b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No id!");
            return 5;
        } else if (!intent.hasExtra("gaia_id") || !intent.hasExtra("account_name")) {
            String a = m67039a(intent, "gaia_id", "");
            aeup aeup = null;
            String a2 = m67039a(intent, "account_name", (String) null);
            Iterator it = soz.m35801d(this, getPackageName()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    account = null;
                    break;
                }
                account = (Account) it.next();
                if (a2 != null) {
                    try {
                        if (a2.equals(account.name)) {
                            break;
                        }
                    } catch (gid | IOException e) {
                        bnsl bnsl3 = (bnsl) f79670b.mo68388c();
                        bnsl3.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to get account ID. %s", e.getMessage());
                    }
                }
                String c = gie.m13198c(this, account.name);
                if (a != null && a.equals(c)) {
                    break;
                }
            }
            if (account != null) {
                String a3 = m67039a(intent, "gcm_metrics", "-1L");
                aeuo aeuo = new aeuo();
                aeuo.f63850a = account;
                aeuo.f63851b = Boolean.valueOf(m67042a(intent, "enable_location_fix"));
                aeuo.f63852c = Boolean.valueOf(m67042a(intent, "enable_activity_fix"));
                aeuo.f63853d = Long.valueOf(m67037a(intent, "burst_duration_millis", f79674i));
                if (a3 != null) {
                    aeuo.f63856g = a3;
                    String format = String.format("%s {%s}", m67039a(intent, "burst_reason", "GmsCore ovenfresh requested"), a3);
                    if (format != null) {
                        aeuo.f63854e = format;
                        aeuo.f63855f = Boolean.valueOf(m67042a(intent, "enable_preburst"));
                        aeup = aeuo.mo34581a();
                    } else {
                        throw new NullPointerException("Null burstReason");
                    }
                } else {
                    throw new NullPointerException("Null gcmMetrics");
                }
            }
            if (aeup != null) {
                aeug aeug = (aeug) aeup;
                this.f79679k = aeug.f63829g;
                bnsl bnsl4 = (bnsl) f79670b.mo68390d();
                bnsl4.mo68432a("aeup", "h", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68427a("input values:%b %b %d %s %s", Boolean.valueOf(aeug.f63824b), Boolean.valueOf(aeug.f63825c), aeug.f63826d, aeug.f63827e, aeug.f63823a.name);
                mo43797a().mo24736c(aeug.f63823a).mo50371a(new aeuh(this, intent, aeup));
                return 1;
            }
            bnsl bnsl5 = (bnsl) f79670b.mo68388c();
            bnsl5.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("No account for passed in id!");
            return 6;
        } else {
            bnsl bnsl6 = (bnsl) f79670b.mo68388c();
            bnsl6.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Too many ids");
            return 10;
        }
    }

    /* renamed from: a */
    private static long m67037a(Intent intent, String str, long j) {
        if (intent.hasExtra(str)) {
            try {
                return Long.parseLong(intent.getStringExtra(str));
            } catch (NumberFormatException e) {
                bnsl bnsl = (bnsl) f79670b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to format:%s;", str);
            }
        }
        return j;
    }

    /* renamed from: a */
    private static Account m67038a(Context context, String str, String str2) {
        for (Account account : soz.m35801d(context, context.getPackageName())) {
            if (str2 != null) {
                try {
                    if (str2.equals(account.name)) {
                        return account;
                    }
                } catch (gid | IOException e) {
                    bnsl bnsl = (bnsl) f79670b.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to get account ID. %s", e.getMessage());
                }
            }
            String c = gie.m13198c(context, account.name);
            if (str != null && str.equals(c)) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m67039a(Intent intent, String str, String str2) {
        return intent.hasExtra(str) ? intent.getStringExtra(str) : str2;
    }

    /* renamed from: a */
    private static void m67040a(boolean z, long j, long j2, int i) {
        bnsl bnsl = (bnsl) f79670b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 619, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("%s activity update with top confidence of %d, it took %ds, and the activity is %ds old", !z ? "Removed " : "Received ", Integer.valueOf(i), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j2)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* renamed from: a */
    public static void m67041a(boolean z, long j, long j2, long j3, float f) {
        bnsl bnsl = (bnsl) f79670b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 609, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("%s activity update with accuracy of %f, it took %ds, and the activity is %ds old", !z ? "Removed " : "Received ", Float.valueOf(f), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j2 - j3)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* renamed from: a */
    private static boolean m67042a(Intent intent, String str) {
        return m67039a(intent, str, "false").equals("true");
    }

    /* renamed from: a */
    public final rjx mo43797a() {
        if (this.f79680l == null) {
            this.f79680l = aeqc.m52384a(getBaseContext());
        }
        return this.f79680l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        Account account;
        int i = 10;
        if (m67036a(intent, "version", 1) > 1) {
            bnsl bnsl = (bnsl) f79670b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("GCM version incompatible");
        } else if (!intent.hasExtra("gaia_id") && !intent.hasExtra("account_name")) {
            bnsl bnsl2 = (bnsl) f79670b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No id!");
            i = 5;
        } else if (!intent.hasExtra("gaia_id") || !intent.hasExtra("account_name")) {
            String a = m67039a(intent, "gaia_id", "");
            aeup aeup = null;
            String a2 = m67039a(intent, "account_name", (String) null);
            Iterator it = soz.m35801d(this, getPackageName()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    account = null;
                    break;
                }
                account = (Account) it.next();
                if (a2 != null) {
                    try {
                        if (a2.equals(account.name)) {
                            break;
                        }
                    } catch (gid | IOException e) {
                        bnsl bnsl3 = (bnsl) f79670b.mo68388c();
                        bnsl3.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to get account ID. %s", e.getMessage());
                    }
                }
                String c = gie.m13198c(this, account.name);
                if (a != null && a.equals(c)) {
                    break;
                }
            }
            if (account != null) {
                String a3 = m67039a(intent, "gcm_metrics", "-1L");
                aeuo aeuo = new aeuo();
                aeuo.f63850a = account;
                aeuo.f63851b = Boolean.valueOf(m67042a(intent, "enable_location_fix"));
                aeuo.f63852c = Boolean.valueOf(m67042a(intent, "enable_activity_fix"));
                aeuo.f63853d = Long.valueOf(m67037a(intent, "burst_duration_millis", f79674i));
                if (a3 != null) {
                    aeuo.f63856g = a3;
                    String format = String.format("%s {%s}", m67039a(intent, "burst_reason", "GmsCore ovenfresh requested"), a3);
                    if (format != null) {
                        aeuo.f63854e = format;
                        aeuo.f63855f = Boolean.valueOf(m67042a(intent, "enable_preburst"));
                        aeup = aeuo.mo34581a();
                    } else {
                        throw new NullPointerException("Null burstReason");
                    }
                } else {
                    throw new NullPointerException("Null gcmMetrics");
                }
            }
            if (aeup != null) {
                aeug aeug = (aeug) aeup;
                this.f79679k = aeug.f63829g;
                bnsl bnsl4 = (bnsl) f79670b.mo68390d();
                bnsl4.mo68432a("aeup", "h", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68427a("input values:%b %b %d %s %s", Boolean.valueOf(aeug.f63824b), Boolean.valueOf(aeug.f63825c), aeug.f63826d, aeug.f63827e, aeug.f63823a.name);
                mo43797a().mo24736c(aeug.f63823a).mo50371a(new aeuh(this, intent, aeup));
                i = 1;
            } else {
                bnsl bnsl5 = (bnsl) f79670b.mo68388c();
                bnsl5.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("No account for passed in id!");
                i = 6;
            }
        } else {
            bnsl bnsl6 = (bnsl) f79670b.mo68388c();
            bnsl6.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "b", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Too many ids");
        }
        if (i != 1) {
            mo43798a(intent, i);
        }
    }

    /* renamed from: a */
    public final void mo43798a(Intent intent, int i) {
        byte[] bArr;
        boolean z;
        Intent intent2 = intent;
        boolean isScreenOn = ((PowerManager) getSystemService("power")).isScreenOn();
        if (intent2.hasExtra("experiment_bytes")) {
            bArr = boan.f132470d.mo68796b(intent2.getStringExtra("experiment_bytes"));
        } else {
            bArr = new byte[0];
        }
        aetk aetk = new aetk(this);
        String str = this.f79679k;
        long j = this.f79678j;
        ReportingState reportingState = this.f79675c;
        int b = m67043b();
        if (checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f79676d;
        if (str == null) {
            str = "";
        }
        bxvd da = caja.f174791j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caja caja = (caja) da.f164949b;
        caja.f174794b = i - 1;
        int i3 = caja.f174793a | 1;
        caja.f174793a = i3;
        str.getClass();
        caja.f174793a = i3 | 64;
        caja.f174797e = str;
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caja caja2 = (caja) da.f164949b;
        a.getClass();
        caja2.f174793a |= 16;
        caja2.f174795c = a;
        bxvd da2 = cair.f174760d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cair cair = (cair) da2.f164949b;
        int i4 = cair.f174762a | 1;
        cair.f174762a = i4;
        cair.f174763b = j;
        cair.f174762a = i4 | 2;
        cair.f174764c = isScreenOn;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caja caja3 = (caja) da.f164949b;
        cair cair2 = (cair) da2.mo74062i();
        cair2.getClass();
        caja3.f174796d = cair2;
        caja3.f174793a |= 32;
        int i5 = 3;
        if (b == 1) {
            i5 = 4;
        } else if (b != 2) {
            i5 = b != 3 ? 1 : 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caja caja4 = (caja) da.f164949b;
        caja4.f174798f = i5 - 1;
        int i6 = caja4.f174793a | 128;
        caja4.f174793a = i6;
        caja4.f174793a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        caja4.f174799g = z;
        if (reportingState != null) {
            bxvd da3 = cajo.f174843h.mo74144da();
            boolean a2 = aetk.m52538a(reportingState.mo43730a());
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cajo cajo = (cajo) da3.f164949b;
            cajo.f174845a |= 1;
            cajo.f174846b = a2;
            boolean a3 = aetk.m52538a(reportingState.mo43731b());
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cajo cajo2 = (cajo) da3.f164949b;
            int i7 = 2 | cajo2.f174845a;
            cajo2.f174845a = i7;
            cajo2.f174847c = a3;
            boolean z2 = reportingState.f79600a;
            int i8 = 4 | i7;
            cajo2.f174845a = i8;
            cajo2.f174848d = z2;
            boolean z3 = reportingState.f79601b;
            cajo2.f174845a = i8 | 8;
            cajo2.f174849e = z3;
            boolean c = reportingState.mo43732c();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cajo cajo3 = (cajo) da3.f164949b;
            cajo3.f174845a |= 16;
            cajo3.f174850f = c;
            boolean e = reportingState.mo43734e();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cajo cajo4 = (cajo) da3.f164949b;
            cajo4.f174845a |= 32;
            cajo4.f174851g = e;
            cajo cajo5 = (cajo) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caja caja5 = (caja) da.f164949b;
            cajo5.getClass();
            caja5.f174800h = cajo5;
            caja5.f174793a |= 1024;
        }
        caja caja6 = (caja) da.f164949b;
        caja6.f174793a |= 2048;
        caja6.f174801i = i2;
        bxvd d = aetk.m52539d(16);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caja caja7 = (caja) da.mo74062i();
        caix caix2 = caix.f174776l;
        caja7.getClass();
        caix.f174784g = caja7;
        caix.f174778a |= 1024;
        aetk.mo34552a((caix) d.mo74062i());
        aseo.m73884b(this, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo43799a(Intent intent, aeup aeup) {
        boolean z;
        aeuk aeuk;
        aeuk aeuk2;
        int i;
        String str;
        aeuj aeuj;
        final CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        Intent intent2 = intent;
        if (aeup.mo34570b() || aeup.mo34571c()) {
            Account a = aeup.mo34569a();
            boolean b = aeup.mo34570b();
            boolean c = aeup.mo34571c();
            if (b) {
                z = true;
            } else {
                z = c;
            }
            sdo.m34974b(z);
            boolean a2 = m67042a(intent2, "enable_notification");
            int a3 = b ? m67036a(intent2, "location_fix_num_updates", 1) : 0;
            int a4 = c ? m67036a(intent2, "activity_fix_num_updates", 1) : 0;
            CountDownLatch countDownLatch3 = new CountDownLatch(a3);
            CountDownLatch countDownLatch4 = new CountDownLatch(a4);
            aeuj aeuj2 = null;
            if (!b) {
                i = a3;
                str = "location_fix_acceptable_age_ms";
                countDownLatch2 = countDownLatch3;
                countDownLatch = countDownLatch4;
                aeuj = null;
            } else {
                if (a2) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        sex a5 = sex.m35104a(this);
                        if (a5.mo25437a("com.google.android.gms.locationsharing.OVENFRESH") == null) {
                            a5.mo25442a(new NotificationChannel("com.google.android.gms.locationsharing.OVENFRESH", getString(C0126R.string.location_sharing_settings_title), 1));
                        }
                        String str2 = a.name;
                        String str3 = a.name;
                        Bundle bundle = new Bundle();
                        bundle.putString("android.substName", getString(C0126R.string.location_sharing_google_location_sharing));
                        C1102je jeVar = new C1102je(this);
                        jeVar.mo13623a(bundle);
                        jeVar.f22259k = false;
                        jeVar.mo13630b((int) C0126R.C0127drawable.quantum_ic_person_pin_white_24);
                        jeVar.mo13640e(getString(C0126R.string.location_sharing_ovenfresh_notification_text));
                        jeVar.mo13632b(getString(C0126R.string.location_sharing_ovenfresh_notification_subtext));
                        jeVar.f22258j = -1;
                        int i3 = Build.VERSION.SDK_INT;
                        int i4 = Build.VERSION.SDK_INT;
                        jeVar.f22244B = "com.google.android.gms.locationsharing.OVENFRESH";
                        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingSettingsActivity");
                        className.putExtra("account_name", str3);
                        C1129ke a6 = C1129ke.m17707a(this);
                        a6.mo14421a(new ComponentName(this, "com.google.android.gms.locationsharing.activity.LocationSharingSettingsActivity"));
                        a6.mo14422a(className);
                        jeVar.f22254f = a6.mo14423b();
                        startForeground(1298, jeVar.mo13629b());
                    } catch (InterruptedException e) {
                        aeuk = null;
                        if (aeuj2 != null) {
                        }
                        if (aeuk != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        aeuk2 = null;
                        if (aeuj2 != null) {
                        }
                        if (aeuk2 != null) {
                        }
                        throw th;
                    }
                }
                int a7 = m67036a(intent2, "location_fix_interval_ms", 100);
                int a8 = m67036a(intent2, "location_fix_max_interval_ms", f79671f);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.mo43554c((long) a7);
                locationRequest.mo43549a((long) a8);
                locationRequest.mo43553c(100);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a9 = m67036a(intent2, "location_fix_acceptable_accuracy_meters", 2000);
                countDownLatch2 = countDownLatch3;
                countDownLatch = countDownLatch4;
                long a10 = m67037a(intent2, "location_fix_acceptable_age_ms", f79673h);
                if (this.f79681m == null) {
                    this.f79681m = aeie.m51878c(this);
                }
                rjx rjx = this.f79681m;
                i = a3;
                str = "location_fix_acceptable_age_ms";
                rjx.mo24724a(locationRequest, new aeui(elapsedRealtime, a10, a9, countDownLatch2));
                aeuj = new aeuj(rjx, elapsedRealtime);
            }
            if (c) {
                try {
                    int a11 = m67036a(intent2, "activity_fix_interval_ms", 100);
                    final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    final long a12 = m67037a(intent2, str, f79673h);
                    final int a13 = m67036a(intent2, "activity_fix_acceptable_confidence", 0);
                    PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("activity_detected"), 0);
                    C16041 r8 = new aacn("locationsharing") {
                        /* class com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService.C16041 */

                        /* renamed from: a */
                        public final void mo6253a(Context context, Intent intent) {
                            ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
                            if (!b.f79300a.isEmpty()) {
                                int i = ((DetectedActivity) b.f79300a.get(0)).f79320e;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                long j = elapsedRealtime - b.f79302c;
                                long j2 = elapsedRealtime2;
                                bnsl bnsl = (bnsl) GcmReceiverChimeraService.f79670b.mo68390d();
                                bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 619, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68426a("%s activity update with top confidence of %d, it took %ds, and the activity is %ds old", "Received ", Integer.valueOf(i), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime - j2)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
                                if (j <= a12 && i > a13) {
                                    countDownLatch.countDown();
                                }
                            }
                        }
                    };
                    registerReceiver(r8, new IntentFilter("activity_detected"));
                    if (this.f79677e == null) {
                        this.f79677e = aefo.m51797a(this);
                    }
                    rjx rjx2 = this.f79677e;
                    long j = (long) a11;
                    roz b2 = rpa.m34196b();
                    b2.f43472a = new aefp(j, broadcast);
                    rjx2.mo24732b(b2.mo24977a());
                    aeuj2 = new aeuk(this, broadcast, r8);
                } catch (InterruptedException e2) {
                    aeuk = null;
                    aeuj2 = aeuj;
                    if (aeuj2 != null) {
                        aeuj2.run();
                    }
                    if (aeuk != null) {
                        aeuk.run();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    aeuk2 = null;
                    aeuj2 = aeuj;
                    if (aeuj2 != null) {
                        aeuj2.run();
                    }
                    if (aeuk2 != null) {
                        aeuk2.run();
                    }
                    throw th;
                }
            }
            try {
                long a14 = m67037a(intent2, "location_fix_await_interval_ms", f79672g);
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                countDownLatch2.await(a14, TimeUnit.MILLISECONDS);
                this.f79678j = SystemClock.elapsedRealtime() - elapsedRealtime3;
                countDownLatch.await(a14 - (SystemClock.elapsedRealtime() - elapsedRealtime3), TimeUnit.MILLISECONDS);
                if (i + a4 == 0) {
                    TimeUnit.MILLISECONDS.sleep(a14);
                    this.f79678j = a14;
                }
                if (aeuj != null) {
                    aeuj.run();
                }
                if (aeuj2 != null) {
                    aeuj2.run();
                }
            } catch (InterruptedException e3) {
                aeuk = aeuj2;
                aeuj2 = aeuj;
                if (aeuj2 != null) {
                }
                if (aeuk != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                aeuk2 = aeuj2;
                aeuj2 = aeuj;
                if (aeuj2 != null) {
                }
                if (aeuk2 != null) {
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo43800a(Intent intent, aeup aeup, aucb aucb) {
        int i;
        if (aucb.mo50384b()) {
            ReportingState reportingState = (ReportingState) aucb.mo50386d();
            this.f79675c = reportingState;
            if (!reportingState.f79600a) {
                i = 3;
            } else if (reportingState.f79601b) {
                boolean f = aeup.mo34575f();
                if (!f) {
                    mo43799a(intent, aeup);
                }
                aeqg a = UploadRequest.m66980a(aeup.mo34569a(), aeup.mo34573e(), aeup.mo34572d().longValue());
                a.f63626d = 0;
                a.f63627e = 0;
                UploadRequest a2 = a.mo34454a();
                rjx a3 = mo43797a();
                roz b = rpa.m34196b();
                b.f43472a = new aepz(a2);
                aucb b2 = a3.mo24732b(b.mo24977a());
                b2.mo50371a(new aeul(this, f, intent, aeup));
                b2.mo50372a(new aeum(this, b2, intent));
                i = 1;
            } else {
                i = 4;
            }
            if (i != 1) {
                mo43798a(intent, i);
                return;
            }
            return;
        }
        Exception e = aucb.mo50387e();
        bnsl bnsl = (bnsl) f79670b.mo68388c();
        bnsl.mo68437a(e);
        bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 355, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failure performingOvenfresh");
        mo43798a(intent, 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43801a(Exception exc, aucb aucb, Intent intent) {
        int i;
        if (exc != null) {
            bnsl bnsl = (bnsl) f79670b.mo68388c();
            bnsl.mo68437a(exc);
            bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 734, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("startBurst failed with exception");
        }
        try {
            this.f79676d = ((aeqp) aucb.mo50386d()).f63635a.f30115i;
        } catch (IllegalStateException e) {
            i = 14;
        } catch (aubz e2) {
            i = 13;
        }
        mo43798a(intent, 9);
        this.f79676d = i;
        mo43798a(intent, 9);
    }
}

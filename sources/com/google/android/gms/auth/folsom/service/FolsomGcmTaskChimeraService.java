package com.google.android.gms.auth.folsom.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.KeyChainSnapshot;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FolsomGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    public static final sek f10915a = jdh.m16547a("RecoverableKeyStoreGmsGcmTaskChimeraService");

    /* renamed from: b */
    public static final aebo f10916b;

    /* renamed from: c */
    private static Boolean f10917c = null;

    /* renamed from: d */
    private static Long f10918d = null;

    /* renamed from: e */
    private static Long f10919e = null;

    /* renamed from: g */
    private static Long f10920g = null;

    /* renamed from: h */
    private static Long f10921h = null;

    /* renamed from: i */
    private static Long f10922i = null;

    static {
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = (int) ccfy.f178890a.mo6606a().mo75878D();
        aebn.f63076c = (int) ccfy.f178890a.mo6606a().mo75879E();
        f10916b = aebn.mo34011a();
    }

    /* renamed from: a */
    private static int m6610a(Context context, int i) {
        String str;
        int a = izr.f22008a.mo13536a(context, false, i);
        sek sek = f10915a;
        Object[] objArr = new Object[1];
        if (a != 1) {
            str = a != 2 ? a != 3 ? a != 4 ? "null" : "INIT_RECOVERY_SERVICE_SUCCESS" : "INIT_RECOVERY_SERVICE_FAILED" : "SIG_DOWNLOAD_FAILED";
        } else {
            str = "CERT_DOWNLOAD_FAILED";
        }
        if (a != 0) {
            objArr[0] = str;
            sek.mo25414c("Cert download and update status=[%s]", objArr);
            int i2 = a - 1;
            if (a != 0) {
                return i2 != 3 ? 1 : 0;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    private static int m6616b() {
        return !ccfy.f178890a.mo6606a().mo75883I() ? 1 : 2;
    }

    /* renamed from: c */
    public static void m6620c(Context context) {
        aeat.m51532a(context).mo33986a("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
    }

    /* renamed from: d */
    public static void m6621d(Context context) {
        aeat.m51532a(context).mo33986a("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
    }

    /* renamed from: e */
    public static void m6622e(Context context) {
        m6612a(context, ccfy.m129504p(), ccfy.m129503o());
    }

    /* renamed from: f */
    private static void m6623f(Context context) {
        if (ccfy.m129496h()) {
            jbv.m16478a(context).mo13567a(System.currentTimeMillis());
        }
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        aebl.f63099k = "com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED";
        aebl.mo34023a(0);
        aebl.f63102n = true;
        aebl.mo34027b(m6616b());
        aebl.f63106r = f10916b;
        long m = ccfy.m129501m();
        long l = ccfy.m129500l();
        if (!cdny.m134344i()) {
            aebl.f63070a = m;
            aebl.f63071b = l;
        } else {
            aebl.mo34009a(aebh.m51568a(m));
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: g */
    private static void m6624g(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        aebl.f63099k = "com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE";
        aebl.mo34028b(0, cdny.f181385a.mo6606a().mo78038i() ? 1 : 0);
        aebl.mo34024a(0, cdny.f181385a.mo6606a().mo78034e() ? 1 : 0);
        aebl.f63102n = true;
        aebl.mo34027b(m6616b());
        aebl.f63106r = aebo.f63077a;
        long k = ccfy.m129499k();
        long j = ccfy.m129498j();
        if (!cdny.m134344i()) {
            aebl.f63070a = k;
            aebl.f63071b = j;
        } else {
            aebl.mo34009a(aebh.m51568a(k));
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        if (ccfy.m129496h()) {
            f10915a.mo25412b("onInitializeTasks", new Object[0]);
            Context baseContext = getBaseContext();
            jbv.m16478a(baseContext).mo13567a(-1);
            m6611a(baseContext);
            m6618b(baseContext);
        }
    }

    /* renamed from: b */
    private static int m6617b(Context context, Account account) {
        return KeySyncIntentOperation.m6604a(context, account, 9) != 2 ? 1 : 0;
    }

    /* renamed from: a */
    public static void m6611a(Context context) {
        f10915a.mo25412b("initializePeriodicKeySyncCheck", new Object[0]);
        jbv a = ccfy.m129496h() ? jbv.m16478a(context) : null;
        if (ccfy.m129490b()) {
            f10915a.mo25412b("Check if the flags for the periodic key sync task have changed.", new Object[0]);
            if (a != null) {
                f10915a.mo25412b("Reading periodic key sync task parameters from the file.", new Object[0]);
                if (f10921h == null) {
                    long j = a.f22127a.getLong("syncTaskFlexSeconds", -1);
                    if (j == -1) {
                        f10921h = Long.valueOf(j);
                    }
                }
                if (f10921h == null) {
                    long j2 = a.f22127a.getLong("syncTaskPeriodSeconds", -1);
                    if (j2 != -1) {
                        f10922i = Long.valueOf(j2);
                    }
                }
            }
            if (!Long.valueOf(ccfy.m129500l()).equals(f10921h) || !Long.valueOf(ccfy.m129501m()).equals(f10922i)) {
                m6620c(context);
                m6623f(context);
                long m = ccfy.m129501m();
                long l = ccfy.m129500l();
                f10922i = Long.valueOf(m);
                f10921h = Long.valueOf(l);
                if (a != null) {
                    a.f22127a.edit().putLong("syncTaskPeriodSeconds", m).commit();
                    a.f22127a.edit().putLong("syncTaskFlexSeconds", l).commit();
                    return;
                }
                return;
            }
            f10915a.mo25412b("Keep using existing periodic key sync task", new Object[0]);
        } else if (a == null) {
            aeat.m51532a(context).mo33986a("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
            m6623f(context);
        } else if (a.f22127a.getLong("syncTaskCreationTime", -1) == -1) {
            aeat.m51532a(context).mo33986a("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
            m6623f(context);
        }
    }

    /* renamed from: b */
    public static void m6618b(Context context) {
        f10915a.mo25412b("initializePeriodicCertUpdate", new Object[0]);
        if (ccfy.m129490b()) {
            f10915a.mo25412b("Check if the flags for periodic cert update task have changed.", new Object[0]);
            if (!Boolean.valueOf(ccfy.m129492d()).equals(f10917c) || !Long.valueOf(ccfy.m129497i()).equals(f10918d) || !Long.valueOf(ccfy.m129498j()).equals(f10919e) || !Long.valueOf(ccfy.m129499k()).equals(f10920g)) {
                f10915a.mo25412b("The flags for periodic cert update task have changed, so reschedul the task.", new Object[0]);
                m6621d(context);
                m6624g(context);
                f10917c = Boolean.valueOf(ccfy.m129492d());
                f10918d = Long.valueOf(ccfy.m129497i());
                f10919e = Long.valueOf(ccfy.m129498j());
                f10920g = Long.valueOf(ccfy.m129499k());
                return;
            }
            return;
        }
        aeat.m51532a(context).mo33986a("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
        m6624g(context);
    }

    /* renamed from: b */
    public static void m6619b(Context context, String str) {
        m6614a(context, str, ccfy.m129504p(), ccfy.m129503o());
    }

    /* renamed from: a */
    private static void m6612a(Context context, long j, long j2) {
        f10915a.mo25412b("scheduleKeySyncForBackupAccount to happen in %d~%d s.", Long.valueOf(j), Long.valueOf(j2));
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        aebi.f63099k = "com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_BACKUP_ACCOUNT";
        aebi.f63102n = true;
        aebi.mo34004a(j, j2);
        aebi.f63106r = f10916b;
        aebi.mo34023a(0);
        aebi.mo34027b(1);
        aebi.f63107s = new Bundle();
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m6613a(Context context, String str) {
        m6614a(context, str, 1, 2);
    }

    /* renamed from: a */
    private static void m6614a(Context context, String str, long j, long j2) {
        f10915a.mo25412b("scheduleKeySync to happen in %d~%d s.", Long.valueOf(j), Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", str);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        String a = srv.m36160a(spn.m35862a(str, "SHA-256"));
        String str2 = a.length() == 0 ? new String("com.google.android.gms.auth.folsom.SYNC_") : "com.google.android.gms.auth.folsom.SYNC_".concat(a);
        if (str2.length() > 90) {
            str2 = str2.substring(0, 90);
        }
        aebi.f63099k = str2;
        aebi.f63102n = true;
        aebi.mo34004a(j, j2);
        aebi.f63106r = f10916b;
        aebi.mo34023a(0);
        aebi.mo34027b(2);
        aebi.f63107s = bundle;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    private static boolean m6615a(Context context, Account account) {
        if (account != null) {
            try {
                jcs a = jcs.m16520a(context, account);
                if (bnfi.m109235a(a.f22187c.getAliases()).mo67506b(new jcr(a))) {
                    return true;
                }
                if (ccfy.m129506r()) {
                    try {
                        int c = ((jcf) jcf.f22150a.mo13145b()).mo13576c(a.f22186b.name);
                        if (c != 0) {
                            KeyChainSnapshot keyChainSnapshot = a.f22188d;
                            if (keyChainSnapshot == null) {
                                jcs.f22185a.mo25414c("Snapshot is null", new Object[0]);
                            } else if (keyChainSnapshot.getSnapshotVersion() != c) {
                                return true;
                            }
                        }
                    } catch (gid | IOException e) {
                        sek sek = jcs.f22185a;
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("Failed to get snapshot version: ");
                        sb.append(valueOf);
                        sek.mo25414c(sb.toString(), new Object[0]);
                    }
                }
            } catch (InternalRecoveryServiceException e2) {
                f10915a.mo25417e("Error when checking if key sync is needed for backup account.", e2, new Object[0]);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        f10915a.mo25412b("onRunTask. tag: %s", str);
        if (!jde.f22216b) {
            f10915a.mo25416d("GCMTask scheduled on build < P. This should never happen. Tag=[%s]", str);
            return 2;
        } else if (!ccfv.m129485b()) {
            f10915a.mo25418e("The flag for the RecoverableKeyStoreGms module is false. Stop running task.", new Object[0]);
            return 2;
        } else {
            Context applicationContext = getApplicationContext();
            if (ccfy.m129491c() && str.startsWith("com.google.android.gms.auth.folsom.DELETE_VAULT_")) {
                Bundle bundle = aecc.f63129b;
                if (bundle != null) {
                    String string = bundle.getString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
                    Account account = new Account(string, bundle.getString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_TYPE"));
                    long j = bundle.getLong("com.google.android.gms.auth.folsom.EXTRA_INSTANCE_ID");
                    if (string == null) {
                        f10915a.mo25418e("Null account is not allowed.", new Object[0]);
                        return 2;
                    }
                    izq izq = new izq(applicationContext);
                    if (!ccfy.f178890a.mo6606a().mo75898m() || !ccfy.m129491c()) {
                        izq.f22006a.mo25416d("delete_vault_on_opt_out is disabled.", new Object[0]);
                        return 0;
                    } else if (j != 0) {
                        jbu a = jbu.m16476a(izq.f22007b, account);
                        bxvd da = bqmo.f141243b.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqmo bqmo = (bqmo) da.f164949b;
                        if (!bqmo.f141245a.mo73666a()) {
                            bqmo.f141245a = GeneratedMessageLite.m124020a(bqmo.f141245a);
                        }
                        bqmo.f141245a.mo74161a(j);
                        try {
                            bxuo bxuo = (bxuo) a.mo13566a(new jbq((bqmo) da.mo74062i()));
                            return 0;
                        } catch (eic e) {
                            int i = e.f15030a;
                            if (i == 0) {
                                throw null;
                            } else if (i != 2) {
                                return 1;
                            } else {
                                izq.f22006a.mo25412b("Permanent network error - don't try to delete vault it again", new Object[0]);
                                return 0;
                            }
                        }
                    } else {
                        izq.f22006a.mo25418e("instanceId cannot be 0", new Object[0]);
                        return 0;
                    }
                } else {
                    f10915a.mo25418e("Null extras is not allowed.", new Object[0]);
                    return 2;
                }
            } else if (!ccgb.m129584c() || !str.startsWith("com.google.android.gms.auth.folsom.SYNC_")) {
                switch (str.hashCode()) {
                    case -1864921327:
                        if (str.equals("com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_BACKUP_ACCOUNT")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -566702174:
                        if (str.equals("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 603771005:
                        if (str.equals("com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_CERTIFICATES")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1353437280:
                        if (str.equals("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    if (ccgb.m129584c()) {
                        Account[] b = adyd.m51363a(applicationContext).mo33922b();
                        for (Account account2 : b) {
                            jcn jcn = new jcn();
                            jcn.f22164a = account2;
                            jcn.f22165b = jco.SYNC_PERIODIC;
                            if (((jcm) jcm.f22159a.mo13145b()).mo13584c(jcn.mo13585a())) {
                                m6613a(applicationContext, account2.name);
                            }
                        }
                    } else if (m6615a(applicationContext, KeySyncIntentOperation.m6606a(applicationContext))) {
                        f10915a.mo25414c("Found un-synced keys for backup account. Scheduling an immediate key sync.", new Object[0]);
                        m6612a(applicationContext, 1, 2);
                    }
                    return 0;
                } else if (c == 1) {
                    Bundle bundle2 = aecc.f63129b;
                    if (bundle2 == null) {
                        f10915a.mo25418e("Null extras is not allowed.", new Object[0]);
                        return 2;
                    }
                    for (String str2 : bundle2.keySet()) {
                        f10915a.mo25412b("extras. key: %s, value: %s", str2, bundle2.get(str2));
                    }
                    return m6617b(applicationContext, KeySyncIntentOperation.m6606a(applicationContext));
                } else if (c == 2) {
                    return m6610a(applicationContext, 8);
                } else {
                    if (c != 3) {
                        return 0;
                    }
                    return m6610a(applicationContext, 11);
                }
            } else {
                Bundle bundle3 = aecc.f63129b;
                if (bundle3 == null) {
                    f10915a.mo25418e("Null extras is not allowed.", new Object[0]);
                    return 2;
                }
                for (String str3 : bundle3.keySet()) {
                    f10915a.mo25412b("extras. key: %s, value: %s", str3, bundle3.get(str3));
                }
                String string2 = bundle3.getString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
                if (string2 != null) {
                    return m6617b(applicationContext, new Account(string2, "com.google"));
                }
                f10915a.mo25418e("Cannot have null account name.", new Object[0]);
                return 2;
            }
        }
    }
}

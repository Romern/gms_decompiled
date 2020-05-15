package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: jar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jar {

    /* renamed from: a */
    static final String[] f22030a = {"com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService", "com.google.android.gms.auth.folsom.service.GcmReceiverService"};

    /* renamed from: b */
    private static final sek f22031b = jdh.m16547a("RecoverableKeyStoreGmsInitOperation");

    /* renamed from: a */
    public static void m16427a(Context context) {
        try {
            Account[] b = adyd.m51363a(context).mo33922b();
            ArrayList<String> arrayList = new ArrayList();
            for (Account account : b) {
                arrayList.add(account.name);
            }
            jcf jcf = (jcf) jcf.f22150a.mo13145b();
            jbb jbb = (jbb) bqfy.m112768a(jcf.f22152c.mo60776a(), IOException.class);
            HashMap hashMap = new HashMap();
            for (String str : arrayList) {
                String a = jcf.f22151b.mo13599a(str);
                jbd jbd = jbd.f22078d;
                a.getClass();
                bxww bxww = jbb.f22076a;
                if (bxww.containsKey(a)) {
                    jbd = (jbd) bxww.get(a);
                }
                hashMap.put(a, jbd);
            }
            bqfy.m112768a(jcf.f22152c.mo60777a(new jcd(hashMap), bqfb.INSTANCE), IOException.class);
        } catch (gid | IOException e) {
            f22031b.mo25411b("Error in retaining keys.", e, new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: b */
    public static void m16431b(Context context) {
        rfi rfi = rfi.f42868a;
        int j = rfy.m33553j(context);
        String[] strArr = f22030a;
        for (String str : strArr) {
            if (!TextUtils.equals(str, "com.google.android.gms.auth.folsom.service.GcmReceiverService") || (ccfy.m129495g() && j >= 12656023)) {
                try {
                    if (!m16430a(context, str)) {
                        f22031b.mo25412b(String.valueOf(str).concat(" is already disabled. Ignore."), new Object[0]);
                    } else {
                        sek sek = f22031b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
                        sb.append("Disabling ");
                        sb.append(str);
                        sb.append(".");
                        sek.mo25412b(sb.toString(), new Object[0]);
                        spn.m35856a(context, str, false);
                    }
                } catch (IllegalArgumentException e) {
                    sek sek2 = f22031b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb2.append("Component ");
                    sb2.append(str);
                    sb2.append(" is not included in the container");
                    sek2.mo25412b(sb2.toString(), new Object[0]);
                }
            } else {
                f22031b.mo25414c(String.valueOf(str).concat(" is not supported. Ignore."), new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private static void m16432b(Context context, int i) {
        f22031b.mo25409a("Initializing RecoveryController", new Object[0]);
        RecoveryController instance = RecoveryController.getInstance(context);
        try {
            instance.setRecoverySecretTypes(new int[]{100});
        } catch (InternalRecoveryServiceException e) {
            f22031b.mo25417e("Error setting recovery secret types", e, new Object[0]);
        }
        m16429a(context, instance);
        int a = izr.f22008a.mo13536a(context, true, i);
        PendingIntent pendingIntent = null;
        if (a == 0) {
            throw null;
        } else if (a == 4) {
            Intent startIntent = IntentOperation.getStartIntent(context, KeySyncIntentOperation.class, "android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT");
            if (startIntent == null) {
                f22031b.mo25418e("Could not get start intent for KeySyncIntentOperation", new Object[0]);
            } else {
                pendingIntent = PendingIntent.getService(context, 0, startIntent, 134217728);
            }
            if (pendingIntent == null) {
                f22031b.mo25418e("Could not create PendingIntent to start KeySyncIntentOperation", new Object[0]);
                return;
            }
            try {
                instance.setSnapshotCreatedPendingIntent(pendingIntent);
            } catch (InternalRecoveryServiceException e2) {
                f22031b.mo25417e("Error registering key sync intent", e2, new Object[0]);
            }
        } else {
            f22031b.mo25418e("Failed to initialize recovery service.", new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m16428a(Context context, int i) {
        if (Long.parseLong(ryv.m34679a(context), 16) != 0) {
            f22031b.mo25414c("Initializing auth_folsom", new Object[0]);
            rfi rfi = rfi.f42868a;
            int j = rfy.m33553j(context);
            String[] strArr = f22030a;
            for (String str : strArr) {
                if (!TextUtils.equals(str, "com.google.android.gms.auth.folsom.service.GcmReceiverService") || (ccfy.m129495g() && j >= 12656023)) {
                    try {
                        if (m16430a(context, str)) {
                            f22031b.mo25414c(String.valueOf(str).concat(" is already enabled. Ignore."), new Object[0]);
                        } else {
                            sek sek = f22031b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10);
                            sb.append("Enabling ");
                            sb.append(str);
                            sb.append(".");
                            sek.mo25414c(sb.toString(), new Object[0]);
                            spn.m35856a(context, str, true);
                        }
                    } catch (IllegalArgumentException e) {
                        sek sek2 = f22031b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Component ");
                        sb2.append(str);
                        sb2.append(" is not included in the container");
                        sek2.mo25412b(sb2.toString(), new Object[0]);
                    }
                } else {
                    f22031b.mo25414c(String.valueOf(str).concat(" is not supported. Ignore."), new Object[0]);
                }
            }
            if (!jde.f22216b) {
                f22031b.mo25412b("Not initializing RecoveryController below P", new Object[0]);
                return;
            }
            m16432b(context, i);
            if (ccgb.m129583b()) {
                ((jcj) jcj.f22155a.mo13145b()).mo13580b();
            }
            if (ccgb.m129584c()) {
                m16427a(context);
            }
            if (m16430a(context, "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService")) {
                if (ccfy.f178890a.mo6606a().mo75901p()) {
                    FolsomGcmTaskChimeraService.m6611a(context);
                } else if (ccfy.m129494f()) {
                    FolsomGcmTaskChimeraService.m6620c(context);
                }
                if (ccfy.f178890a.mo6606a().mo75900o()) {
                    FolsomGcmTaskChimeraService.m6618b(context);
                } else if (ccfy.m129494f()) {
                    FolsomGcmTaskChimeraService.m6621d(context);
                }
            }
        } else {
            f22031b.mo25416d("Cannot initialize the RecoverableKeyStoreGms module - Android ID has not yet been set!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m16429a(Context context, RecoveryController recoveryController) {
        try {
            byte[] k = jaz.m16446a(context).mo73780k();
            f22031b.mo25414c("Setting vault handle", new Object[0]);
            recoveryController.setServerParams(k);
        } catch (InternalRecoveryServiceException e) {
            f22031b.mo25417e("Error setting device ID", e, new Object[0]);
        }
    }

    /* renamed from: a */
    private static boolean m16430a(Context context, String str) {
        return spn.m35876d(context, str) == 1;
    }
}

package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final sek f11131b = jsy.m17256a("GcmBroadcastReceiver");

    /* renamed from: a */
    private static final int m6762a(Intent intent) {
        try {
            return Integer.parseInt(intent.getStringExtra("sn"));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    public final void onReceive(Context context, Intent intent) {
        char c;
        String str;
        String a;
        String a2;
        String stringExtra;
        String a3;
        String a4;
        f11131b.mo25414c("Received a GCM intent", new Object[0]);
        String stringExtra2 = intent.getStringExtra("mt");
        if (stringExtra2 != null) {
            int hashCode = stringExtra2.hashCode();
            if (hashCode != 3124) {
                if (hashCode != 3199) {
                    if (hashCode != 3322) {
                        if (hashCode != 3365) {
                            if (hashCode != 3635) {
                                if (hashCode == 3666 && stringExtra2.equals("se")) {
                                    c = 3;
                                    if (c == 0) {
                                        String stringExtra3 = intent.getStringExtra("di");
                                        if (stringExtra3 == null) {
                                            f11131b.mo25418e("Initiator short device ID missing, unable to handle initiate message type", new Object[0]);
                                            return;
                                        }
                                        String a5 = m6763a(stringExtra3);
                                        if (a5 == null) {
                                            f11131b.mo25416d("No registered device found for short ID %s", stringExtra3);
                                            return;
                                        }
                                        for (Role role : jnj.m16961a().mo13902a(a5)) {
                                            if (Role.m6777g(role.f11147c)) {
                                                String stringExtra4 = intent.getStringExtra("al");
                                                if (stringExtra4 == null) {
                                                    f11131b.mo25418e("Accounts list missing.", new Object[0]);
                                                    return;
                                                }
                                                Account[] a6 = adyd.m51363a(context).mo33916a("com.google");
                                                HashSet hashSet = new HashSet(Arrays.asList(stringExtra4.split("\\|")));
                                                int length = a6.length;
                                                int i = 0;
                                                while (true) {
                                                    if (i >= length) {
                                                        str = null;
                                                        break;
                                                    }
                                                    Account account = a6[i];
                                                    if (hashSet.contains(account.name)) {
                                                        str = account.name;
                                                        break;
                                                    }
                                                    i++;
                                                }
                                                if (str != null) {
                                                    jnj a7 = jnj.m16961a();
                                                    synchronized (a7.f22879c) {
                                                        jni jni = (jni) a7.f22878b.get(a5);
                                                        if (jni != null) {
                                                            boolean z = jni.f22875d.get(4);
                                                            if (z) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    jkh.m16839a().mo13829a(a5, 4);
                                                    f11131b.mo25414c("Sending response to %s", stringExtra3);
                                                    context.startService(GcmResponderIntentOperation.m6765a(context, a5, str));
                                                    return;
                                                }
                                                f11131b.mo25418e("Could not find a common account with remote device.", new Object[0]);
                                                return;
                                            }
                                        }
                                        return;
                                    } else if (c == 1) {
                                        String stringExtra5 = intent.getStringExtra("aDi");
                                        String stringExtra6 = intent.getStringExtra("rDi");
                                        String a8 = m6763a(stringExtra6);
                                        String stringExtra7 = intent.getStringExtra("ran");
                                        if (stringExtra5 == null || a8 == null) {
                                            f11131b.mo25418e("No registered device found for short ID %s", stringExtra6);
                                            return;
                                        }
                                        for (Role role2 : jnj.m16961a().mo13902a(a8)) {
                                            if (Role.m6776f(role2.f11147c)) {
                                                String stringExtra8 = intent.getStringExtra("rpt");
                                                if (stringExtra8 == null) {
                                                    f11131b.mo25418e("Public topic name missing", new Object[0]);
                                                    return;
                                                }
                                                f11131b.mo25414c("Starting GcmSecureChannel for initiator", new Object[0]);
                                                context.startService(StartGcmSecureChannelIntentOperation.m6779a(context, stringExtra5, a8, true, stringExtra8, stringExtra7));
                                                return;
                                            }
                                        }
                                        return;
                                    } else if (c == 2) {
                                        String stringExtra9 = intent.getStringExtra("fDi");
                                        if (stringExtra9 != null && (a = m6763a(stringExtra9)) != null) {
                                            String stringExtra10 = intent.getStringExtra("sp");
                                            String stringExtra11 = intent.getStringExtra("at");
                                            if (stringExtra10 != null && stringExtra11 != null) {
                                                String stringExtra12 = intent.getStringExtra("ptn");
                                                int a9 = m6762a(intent);
                                                int parseInt = Integer.parseInt(stringExtra11);
                                                try {
                                                    jnz a10 = jnz.m17005a(stringExtra10);
                                                    for (jlj jlj : jlk.m16878a().mo13860a(a, stringExtra12)) {
                                                        jlj.mo13857a(parseInt, a10, a9);
                                                    }
                                                    return;
                                                } catch (JSONException e) {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if (c == 3) {
                                        String stringExtra13 = intent.getStringExtra("fDi");
                                        if (stringExtra13 != null && (a2 = m6763a(stringExtra13)) != null && (stringExtra = intent.getStringExtra("sp")) != null) {
                                            String stringExtra14 = intent.getStringExtra("ptn");
                                            int a11 = m6762a(intent);
                                            try {
                                                jnz a12 = jnz.m17005a(stringExtra);
                                                for (jlj jlj2 : jlk.m16878a().mo13860a(a2, stringExtra14)) {
                                                    jlj2.mo13858a(a12, a11);
                                                }
                                                return;
                                            } catch (JSONException e2) {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if (c == 4) {
                                        String stringExtra15 = intent.getStringExtra("fDi");
                                        if (stringExtra15 != null && (a3 = m6763a(stringExtra15)) != null) {
                                            for (jlj jlj3 : jlk.m16878a().mo13860a(a3, intent.getStringExtra("ptn"))) {
                                                jlj3.mo13856a();
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (c != 5) {
                                        f11131b.mo25418e("Unknown message type %s", stringExtra2);
                                        return;
                                    } else {
                                        String stringExtra16 = intent.getStringExtra("fDi");
                                        if (stringExtra16 != null && (a4 = m6763a(stringExtra16)) != null) {
                                            for (jlj jlj4 : jlk.m16878a().mo13860a(a4, intent.getStringExtra("ptn"))) {
                                                jlj4.mo13859b();
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } else if (stringExtra2.equals("re")) {
                                c = 1;
                                if (c == 0) {
                                }
                            }
                        } else if (stringExtra2.equals("in")) {
                            c = 0;
                            if (c == 0) {
                            }
                        }
                    } else if (stringExtra2.equals("hb")) {
                        c = 4;
                        if (c == 0) {
                        }
                    }
                } else if (stringExtra2.equals("dc")) {
                    c = 5;
                    if (c == 0) {
                    }
                }
            } else if (stringExtra2.equals("au")) {
                c = 2;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }

    /* renamed from: a */
    private static final String m6763a(String str) {
        for (String str2 : jnj.m16961a().f22878b.keySet()) {
            if (jkr.m16853a(str2).equals(str)) {
                return str2;
            }
        }
        return null;
    }
}

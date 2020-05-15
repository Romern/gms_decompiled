package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartGcmSecureChannelIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11148a = jsy.m17256a("StartGcmSecureChannelIntentOperation");

    /* renamed from: a */
    static Intent m6779a(Context context, String str, String str2, boolean z, String str3, String str4) {
        Intent startIntent = IntentOperation.getStartIntent(context, StartGcmSecureChannelIntentOperation.class, "com.google.android.gms.auth.proximity.START_GCM");
        startIntent.putExtra("my_short_device_id", str);
        startIntent.putExtra("other_device_id", str2);
        startIntent.putExtra("is_initiator", z);
        startIntent.putExtra("public_topic_name", str3);
        startIntent.putExtra("common_account_name", str4);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("my_short_device_id");
            String stringExtra2 = intent.getStringExtra("other_device_id");
            String stringExtra3 = intent.getStringExtra("common_account_name");
            if (stringExtra != null && stringExtra2 != null) {
                f11148a.mo25414c(String.format("Starting a GcmSecureChannel for %s and %s", stringExtra, stringExtra2), new Object[0]);
                byte[] b = jpt.m17081b(rpr.m34216b());
                if (b == null || !jkr.m16853a(RemoteDevice.m6768a(b)).equals(stringExtra)) {
                    m6780a(stringExtra2);
                    return;
                }
                jnj a = jnj.m16961a();
                if (!a.mo13908b(stringExtra2, 4)) {
                    RemoteDevice b2 = a.mo13906b(stringExtra2);
                    if (b2 == null) {
                        m6780a(stringExtra2);
                        return;
                    }
                    String stringExtra4 = intent.getStringExtra("public_topic_name");
                    String str = stringExtra3 != null ? stringExtra3 : b2.f11140d;
                    f11148a.mo25414c("Registering to public topic name %s associated with %s", stringExtra4, str);
                    try {
                        f11148a.mo25414c("Registered %s to the private topic %s", str, (String) jlp.m16887a(rpr.m34216b(), str, stringExtra4).get((long) (((int) cchx.m129770b()) * DefaultRetryPolicy.DEFAULT_TIMEOUT_MS), TimeUnit.MILLISECONDS));
                        boolean booleanExtra = intent.getBooleanExtra("is_initiator", false);
                        jma jma = new jma(stringExtra, stringExtra2, stringExtra4, str, booleanExtra);
                        jkh a2 = jkh.m16839a();
                        synchronized (jma.f22789c) {
                            jma.f22796j.add(a2);
                        }
                        if (!booleanExtra) {
                            jnl jnl = new jnl(rpr.m34216b(), a.mo13907b());
                            synchronized (jma.f22789c) {
                                if (jma.mo13825e() != 1) {
                                    String a3 = ConnectionInfo.m6759a(jma.mo13825e());
                                    throw new IllegalStateException(a3.length() == 0 ? new String("Expected CONNECTED state, got ") : "Expected CONNECTED state, got ".concat(a3));
                                } else if (!jma.f22794h) {
                                    jlk.m16878a().mo13861a(jma.f22790d, jma.m16891a(jma.f22792f), jma);
                                    jma.mo13871a(2);
                                    jma.f22797k = false;
                                    jma.f22799m = jnl;
                                    jma.f22800n = jnl;
                                } else {
                                    throw new IllegalStateException("Cannot authenticate as responder if this device is an initiator.");
                                }
                            }
                            return;
                        }
                        rpr.m34216b();
                        jmc b3 = jmb.m16908b(b2);
                        synchronized (jma.f22789c) {
                            if (jma.mo13825e() != 1) {
                                String a4 = ConnectionInfo.m6759a(jma.mo13825e());
                                throw new IllegalStateException(a4.length() == 0 ? new String("Expected CONNECTED state, got ") : "Expected CONNECTED state, got ".concat(a4));
                            } else if (jma.f22794h) {
                                jlk.m16878a().mo13861a(jma.f22790d, jma.m16891a(jma.f22792f), jma);
                                jma.mo13871a(2);
                                jma.f22798l = b3;
                                jma.f22800n = b3;
                                try {
                                    jma.mo13872a(1, b3.mo13875c());
                                } catch (jmm e) {
                                    jma.f22787a.mo25418e("Unable to generate initiator hello", new Object[0]);
                                    jma.mo13827g();
                                }
                            } else {
                                throw new IllegalStateException("Cannot authenticate as an initiator if this device is a responder.");
                            }
                        }
                    } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                        f11148a.mo25417e("Could not subscribe to GCM private topic for account %s because", e2, str);
                        m6780a(stringExtra2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static final void m6780a(String str) {
        jkh.m16839a().mo13832b(str, 4);
    }
}

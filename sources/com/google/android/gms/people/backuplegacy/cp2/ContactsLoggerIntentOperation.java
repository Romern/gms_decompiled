package com.google.android.gms.people.backuplegacy.cp2;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsLoggerIntentOperation extends IntentOperation {
    /* renamed from: a */
    private final void m67796a(Context context, boolean z) {
        boolean z2;
        boolean z3;
        Account a;
        alqx alqx = new alqx();
        alqx.f74143c = System.currentTimeMillis();
        new amsa(getApplicationContext());
        new anbz();
        lsp lsp = new lsp(context);
        amig.m62939a();
        if (((Boolean) amhr.f74920a.mo41191a()).booleanValue() || ((Boolean) amhu.f74923a.mo41191a()).booleanValue()) {
            amig.m62939a();
            boolean z4 = false;
            if (((Boolean) amhr.f74920a.mo41191a()).booleanValue()) {
                z2 = Settings.Secure.getInt(context.getContentResolver(), "user_full_data_backup_aware", 0) != 0;
            } else {
                z2 = false;
            }
            if (!((Boolean) amhu.f74923a.mo41191a()).booleanValue()) {
                z3 = false;
            } else if (Settings.Secure.getInt(context.getContentResolver(), "backup_enabled:com.android.calllogbackup", 0) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            almk a2 = almk.m61263a();
            boolean booleanValue = ((Boolean) amhu.f74923a.mo41191a()).booleanValue();
            bxvd da = amku.f75091n.mo74144da();
            bxvd da2 = amkt.f75085e.mo74144da();
            bxvd da3 = amkv.f75106m.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amkt amkt = (amkt) da2.f164949b;
            int i = amkt.f75087a | 1;
            amkt.f75087a = i;
            amkt.f75088b = z2;
            int i2 = i | 2;
            amkt.f75087a = i2;
            amkt.f75089c = z3;
            amkt.f75087a = i2 | 4;
            amkt.f75090d = booleanValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amku amku = (amku) da.f164949b;
            amkt amkt2 = (amkt) da2.mo74062i();
            amkt2.getClass();
            amku.f75104l = amkt2;
            amku.f75093a |= 1024;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            amkv amkv = (amkv) da3.f164949b;
            amku amku2 = (amku) da.mo74062i();
            amku2.getClass();
            amkv.f75119l = amku2;
            amkv.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            a2.mo40514a((amkv) da3.mo74062i());
            if (z2 || z3) {
                int i3 = Build.VERSION.SDK_INT;
                try {
                    if (new BackupManager(context).isBackupEnabled() && (a = lsp.mo19591a()) != null && !TextUtils.isEmpty(a.name)) {
                        alqx.f74141a = a.name;
                        amig.m62939a();
                        long j = alqx.f74143c - alqn.m61522a(context).getLong("contacts-logger-full-upload-timestamp", 0);
                        long longValue = Long.valueOf(cgbe.f186279a.mo6606a().mo83318av()).longValue();
                        if (j < 0 || j > TimeUnit.DAYS.toMillis(longValue)) {
                            int i4 = alqy.f74145a;
                        } else {
                            int i5 = alqy.f74145a;
                            long j2 = alqx.f74143c - alqn.m61522a(context).getLong("contacts-logger-incremental-upload-timestamp", 0);
                            amig.m62939a();
                            long longValue2 = Long.valueOf(cgbe.f186279a.mo6606a().mo83349bZ()).longValue();
                            if (j2 <= 0 || j2 >= TimeUnit.MINUTES.toMillis(longValue2)) {
                                SharedPreferences a3 = alqn.m61522a(context);
                                boolean z5 = a3.getBoolean("contacts-logger-pending-significant-update", false);
                                if (z && !z5) {
                                    a3.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                                }
                                if (z || z5) {
                                    z4 = true;
                                }
                                alqx.f74144d = true;
                                if (!z4) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        alrf.m61546a().mo40670a(new alrb(alqn.m61522a(context), alqx, new alqv(context, alqx), new andd(context)));
                        return;
                    }
                } catch (SecurityException e) {
                    Log.e("ContactsLoggerDecision", "SecurityException: Unable to verify if backup is enabled.");
                    amig.m62939a();
                    ande.f76660a.mo41719a(context).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
                }
            }
            almk a4 = almk.m61263a();
            bxvd da4 = amkv.f75106m.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            amkv amkv2 = (amkv) da4.f164949b;
            amkv2.f75108a |= 32;
            amkv2.f75111d = true;
            a4.mo40514a((amkv) da4.mo74062i());
        }
    }

    public final void onHandleIntent(Intent intent) {
        try {
            amig.m62939a();
            if (((Boolean) amgk.f74887a.mo41191a()).booleanValue()) {
                String action = intent.getAction();
                if (!"com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                    if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
                        return;
                    }
                    if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        amdk.m62658a("ContactsLoggerIntentOperation", "Received unexpected broadcast: %s", action);
                    } else if (!m67797a()) {
                        Context applicationContext = getApplicationContext();
                        almk a = almk.m61263a();
                        if (almk.f73722a.nextDouble() < 1.0E-4d) {
                            bxvd da = amkv.f75106m.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amkv amkv = (amkv) da.f164949b;
                            amkv.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                            amkv.f75117j = true;
                            a.mo40514a((amkv) da.mo74062i());
                        }
                        if (!m67798a(intent)) {
                            m67799b();
                            almk a2 = almk.m61263a();
                            bxvd da2 = amkv.f75106m.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amkv amkv2 = (amkv) da2.f164949b;
                            amkv2.f75108a |= 4096;
                            amkv2.f75115h = true;
                            a2.mo40514a((amkv) da2.mo74062i());
                            m67796a(applicationContext, true);
                        }
                    }
                } else if (!m67797a()) {
                    Context applicationContext2 = getApplicationContext();
                    almk a3 = almk.m61263a();
                    if (almk.f73722a.nextDouble() < 1.0E-4d) {
                        bxvd da3 = amkv.f75106m.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        amkv amkv3 = (amkv) da3.f164949b;
                        amkv3.f75108a |= 8192;
                        amkv3.f75116i = true;
                        a3.mo40514a((amkv) da3.mo74062i());
                    }
                    boolean z = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                    if (m67798a(intent)) {
                        SharedPreferences a4 = alqn.m61522a(applicationContext2);
                        boolean z2 = a4.getBoolean("contacts-logger-pending-significant-update", false);
                        if (z && !z2) {
                            a4.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                            return;
                        }
                        return;
                    }
                    m67799b();
                    almk a5 = almk.m61263a();
                    bxvd da4 = amkv.f75106m.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    amkv amkv4 = (amkv) da4.f164949b;
                    int i = amkv4.f75108a | 8;
                    amkv4.f75108a = i;
                    amkv4.f75109b = true;
                    if (z) {
                        amkv4.f75108a = i | 16;
                        amkv4.f75110c = true;
                    }
                    a5.mo40514a((amkv) da4.mo74062i());
                    m67796a(applicationContext2, z);
                }
            }
        } catch (Exception e) {
            Context applicationContext3 = getApplicationContext();
            almk a6 = almk.m61263a();
            bxvd da5 = amku.f75091n.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            amku amku = (amku) da5.f164949b;
            amku.f75093a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            amku.f75102j = true;
            amku amku2 = (amku) da5.mo74062i();
            bxvd da6 = amkv.f75106m.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            amkv amkv5 = (amkv) da6.f164949b;
            amku2.getClass();
            amkv5.f75119l = amku2;
            amkv5.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            a6.mo40514a((amkv) da6.mo74062i());
            ande.f76660a.mo41719a(applicationContext3).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
        }
    }

    /* renamed from: b */
    private final void m67799b() {
        alqn.m61522a(getApplicationContext()).edit().putLong("intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    /* renamed from: a */
    private static boolean m67797a() {
        return !((Boolean) amhr.f74920a.mo41191a()).booleanValue() && !((Boolean) amhu.f74923a.mo41191a()).booleanValue();
    }

    /* renamed from: a */
    private final boolean m67798a(Intent intent) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - alqn.m61522a(getApplicationContext()).getLong("intent-received-timestamp", 0);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(Long.valueOf(cgbe.f186279a.mo6606a().mo83348bY()).longValue());
        } else if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(Long.valueOf(cgbe.f186279a.mo6606a().mo83404cb()).longValue());
        } else {
            j = "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(Long.valueOf(cgbe.f186279a.mo6606a().mo83403ca()).longValue()) : 0;
        }
        if (currentTimeMillis <= 0 || currentTimeMillis >= j) {
            return false;
        }
        TimeUnit.MILLISECONDS.toMinutes(j);
        return true;
    }
}

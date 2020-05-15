package com.google.android.gms.romanesco.contactsupload.triggers;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsLoggerIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final aoyh f107226a = aoyh.m69805a("ContactsLoggerIntent");

    /* renamed from: b */
    private final long f107227b = System.currentTimeMillis();

    /* renamed from: a */
    static final lsp m92258a(Context context) {
        return new lsp(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation.a(android.content.Context, boolean, bzer):void
     arg types: [android.content.Context, int, bzer]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation.a(android.content.Context, boolean, bzer):void */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0102 A[Catch:{ InterruptedException | ExecutionException -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103 A[Catch:{ InterruptedException | ExecutionException -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A[Catch:{ InterruptedException | ExecutionException -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127 A[Catch:{ InterruptedException | ExecutionException -> 0x012c }] */
    public final void onHandleIntent(Intent intent) {
        bqgg bqgg;
        bzer bzer;
        cdlq.m133991c();
        try {
            String action = intent.getAction();
            new Object[1][0] = action;
            if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                Context applicationContext = getApplicationContext();
                int i = Build.VERSION.SDK_INT;
                if (cgjy.m145759f() && m92258a(applicationContext).mo19591a() != null) {
                    f107226a.mo46981b("Nofity BackupManager.dateChanged()");
                    BackupManager.dataChanged(applicationContext.getPackageName());
                }
                if (!m92259a()) {
                    aoyj.m69819a().mo47004e(3);
                    boolean z = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                    if (m92260a(intent)) {
                        SharedPreferences a = aozj.m69902a(applicationContext);
                        boolean z2 = a.getBoolean("romanesco-contacts-logger-pending-significant-update", false);
                        if (z && !z2) {
                            a.edit().putBoolean("romanesco-contacts-logger-pending-significant-update", true).apply();
                            return;
                        }
                        return;
                    }
                    m92262b();
                    if (z) {
                        aoyj.m69819a().mo47003d(4);
                    } else {
                        aoyj.m69819a().mo47003d(3);
                    }
                    if (z) {
                        bzer = bzer.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT;
                    } else {
                        bzer = bzer.SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT;
                    }
                    mo58799a(applicationContext, z, bzer);
                }
            } else if ((cgjh.m145699b() || cgjh.m145700c()) && m92263b(action)) {
                Context applicationContext2 = getApplicationContext();
                aoyj.m69819a().mo47004e(4);
                if (!m92260a(intent)) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.udc.extra.facsCacheAccountName");
                    if (TextUtils.isEmpty(stringExtra)) {
                        f107226a.mo46983c("handleFacsCacheUpdatedIntent: account name is null or empty. Ignore it.");
                        return;
                    }
                    m92262b();
                    try {
                        bdtu bdtu = new bdtu(apbg.m69995a(applicationContext2));
                        if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(intent.getAction())) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.gms.udc.extra.facsCacheAccountName");
                            if (!bmzg.m108671a(stringExtra2)) {
                                bqgg = bdtu.f106428a.mo58362b(new Account(stringExtra2, "com.google")).mo58359a(intent);
                                if (bqgg != null) {
                                    bqgg = bqga.m112775a((Object) null);
                                }
                                bqgg.get();
                                if (!new apbf(applicationContext2).mo47077a(stringExtra)) {
                                    new Object[1][0] = stringExtra;
                                    aoyj.m69819a().mo47003d(5);
                                    mo58799a(applicationContext2, true, bzer.SYNC_REASON_FACS_CACHE_UPDATED);
                                    return;
                                }
                                new Object[1][0] = stringExtra;
                                return;
                            }
                        }
                        bqgg = null;
                        if (bqgg != null) {
                        }
                        bqgg.get();
                        if (!new apbf(applicationContext2).mo47077a(stringExtra)) {
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        f107226a.mo46980a(e, "Failed to handleFacsIntent.");
                    }
                }
            } else {
                if (cgjh.m145699b() || !cgjh.m145700c()) {
                    if (m92261a(action)) {
                        if (cgij.m145558p()) {
                            f107226a.mo46981b("handleUdcSettingChanged: Udc flag is enabled");
                            Context applicationContext3 = getApplicationContext();
                            aoyj.m69819a().mo47004e(4);
                            if (!m92260a(intent)) {
                                m92262b();
                                String string = intent.getExtras().getString("com.google.android.gms.udc.extra.accountName");
                                int[] intArrayExtra = intent.getIntArrayExtra("com.google.android.gms.udc.extra.settingIdList");
                                int length = intArrayExtra.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    if (intArrayExtra[i2] != 7) {
                                        i2++;
                                    } else if (new apbf(applicationContext3).mo47077a(string)) {
                                        new Object[1][0] = string;
                                        aoyj.m69819a().mo47003d(5);
                                        mo58799a(applicationContext3, true, bzer.SYNC_REASON_UDC_SETTING_CHANGED);
                                        return;
                                    } else {
                                        new Object[1][0] = string;
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                    f107226a.mo46982b("Received unexpected broadcast: %s", action);
                } else if (!m92259a()) {
                    Context applicationContext4 = getApplicationContext();
                    aoyj.m69819a().mo47004e(5);
                    if (!m92260a(intent)) {
                        m92262b();
                        aoyj.m69819a().mo47003d(6);
                        mo58799a(applicationContext4, true, bzer.SYNC_REASON_POWER_CONNECTED);
                    }
                }
            }
        } catch (Exception e2) {
            f107226a.mo46980a(e2, "Unable to start contactsLogger process");
            Context applicationContext5 = getApplicationContext();
            aoyj a2 = aoyj.m69819a();
            bxvd da = bzdx.f169595q.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzdx) da.f164949b).f169605i = true;
            bzdx bzdx = (bzdx) da.mo74062i();
            bxvd da2 = bzel.f169667p.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzdx.getClass();
            ((bzel) da2.f164949b).f169675g = bzdx;
            a2.mo46992a(da2);
            aoyp.m69851a(applicationContext5).mo47009a(e2, cgjy.m145765l());
        }
    }

    /* renamed from: a */
    private static boolean m92259a() {
        return !cgij.m145544b() && !cgij.m145545c() && !cgij.m145558p();
    }

    /* renamed from: b */
    private final void m92262b() {
        aozj.m69902a(getApplicationContext()).edit().putLong("romanesco-intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    /* renamed from: a */
    private final boolean m92260a(Intent intent) {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - aozj.m69902a(getApplicationContext()).getLong("romanesco-intent-received-timestamp", 0);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            j = TimeUnit.MINUTES.toMillis(cgij.f186992a.mo6606a().mo83855F());
        } else {
            if (cgjh.m145700c()) {
                z = m92263b(action);
            } else {
                z = m92261a(action);
            }
            if (z) {
                j = TimeUnit.MINUTES.toMillis(cgij.f186992a.mo6606a().mo83858I());
            } else {
                j = "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(cgij.f186992a.mo6606a().mo83857H()) : 0;
            }
        }
        if (currentTimeMillis <= 0 || currentTimeMillis >= j) {
            return false;
        }
        new Object[1][0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j));
        return true;
    }

    /* renamed from: b */
    private static boolean m92263b(String str) {
        return "com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(str);
    }

    /* renamed from: a */
    private static boolean m92261a(String str) {
        return "com.google.android.gms.udc.action.SETTING_CHANGED".equals(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo58799a(Context context, boolean z, bzer bzer) {
        Context context2 = context;
        long j = this.f107227b;
        lsp a = m92258a(context);
        apal apal = new apal();
        apal.f84032c = j;
        boolean z2 = false;
        if (apam.m69967a(context2, new apbf(context2), a, apal)) {
            String str = "romanesco-contacts-grpc-full-upload-timestamp";
            long j2 = apal.f84032c - aozj.m69902a(context).getLong(!cgjk.m145711d() ? str : "romanesco-contacts-logger-full-upload-timestamp", 0);
            long C = cgij.f186992a.mo6606a().mo83852C();
            if (j2 < 0 || j2 > TimeUnit.DAYS.toMillis(C)) {
                new Object[1][0] = Long.valueOf(C);
                apam.m69966a(apal);
                if (!apal.f84033d) {
                    if (cgjk.m145711d()) {
                        apbd.m69986a().mo47075a(new apap(context2, apal));
                    }
                    if (cgjk.m145710c() && cgjk.f187071a.mo6606a().mo83908f()) {
                        bzep bzep = ((apal.f84034e || cgjk.f187071a.mo6606a().mo83911i()) && apam.f84036a) ? bzep.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL : bzep.SYNC_ID_UPLOAD_CONTACTS_BATCH;
                        aecs a2 = aozh.m69900a(this);
                        try {
                            bqdx.m112673a(bqdx.m112674a(bqdf.m112619a(bqdx.m112674a(bqfl.m112747c(a2.mo34083c(bzep)), new apbh(bzer), bqfb.INSTANCE), Exception.class, apbi.f84102a, bqfb.INSTANCE), new apbj(a2, bzep), bqfb.INSTANCE), new apbk(bzep), bqfb.INSTANCE).get();
                            return;
                        } catch (ExecutionException e) {
                            f107226a.mo46980a(e, "Scheduling sync failed.");
                            return;
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            f107226a.mo46980a(e2, "Thread interrupted unexpectedly!");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (apam.f84036a) {
                    long j3 = apal.f84032c - aozj.m69902a(context).getLong(!cgjk.m145711d() ? "romanesco-contacts-grpc-incremental-upload-timestamp" : "romanesco-contacts-logger-incremental-upload-timestamp", 0);
                    long G = cgij.f186992a.mo6606a().mo83856G();
                    if (j3 <= 0 || j3 >= TimeUnit.MINUTES.toMillis(G)) {
                        SharedPreferences a3 = aozj.m69902a(context);
                        boolean z3 = a3.getBoolean("romanesco-contacts-logger-pending-significant-update", false);
                        if (z && !z3) {
                            a3.edit().putBoolean("romanesco-contacts-logger-pending-significant-update", true).apply();
                        }
                        if (z || z3) {
                            z2 = true;
                        }
                        apal.f84033d = z2;
                        apal.f84034e = true;
                        if (!apal.f84033d) {
                        }
                    } else {
                        new Object[1][0] = Long.valueOf(G);
                    }
                }
                if (!apam.f84036a) {
                    SharedPreferences a4 = aozj.m69902a(context);
                    if (cgjk.m145711d()) {
                        str = "romanesco-contacts-logger-full-upload-timestamp";
                    }
                    long j4 = apal.f84032c - a4.getLong(str, 0);
                    long E = cgij.f186992a.mo6606a().mo83854E();
                    if (j4 <= 0 || j4 >= TimeUnit.HOURS.toMillis(E)) {
                        apam.m69966a(apal);
                        if (!apal.f84033d) {
                        }
                    } else {
                        new Object[1][0] = Long.valueOf(E);
                    }
                }
            }
        }
        apal.f84033d = false;
        if (!apal.f84033d) {
        }
    }
}

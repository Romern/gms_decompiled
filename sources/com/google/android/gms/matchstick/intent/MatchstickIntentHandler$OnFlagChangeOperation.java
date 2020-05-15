package com.google.android.gms.matchstick.intent;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$OnFlagChangeOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0172, code lost:
        if (r3 == null) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0176, code lost:
        if (r3 != null) goto L_0x0178;
     */
    public final void onHandleIntent(Intent intent) {
        char c;
        Intent intent2 = intent;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (intent2 != null) {
            String action = intent.getAction();
            if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || afiw.f64259a.equals(action)) && "com.google.android.gms.matchstick".equals(intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                afiw.m53138a("FlagChangeOp", getBaseContext());
                Context applicationContext = getBaseContext().getApplicationContext();
                if (cffa.m139280b() > 0) {
                    ScheduledTaskService.m94660a(applicationContext, "gms:matchstick:renotification", TimeUnit.MILLISECONDS.toSeconds(azpi.m86059a((int) cffa.m139280b())), TimeUnit.MINUTES.toSeconds(10));
                } else {
                    ScheduledTaskService.m94663b(applicationContext, "gms:matchstick:renotification");
                }
                Context baseContext = getBaseContext();
                if (!cfeo.f183719a.mo6606a().mo80974ah()) {
                    azcm a = azcm.m85300a(baseContext.getApplicationContext());
                    if (!a.mo54651a()) {
                        a.f98996b = azcl.m85289a(a.f98995a).getReadableDatabase();
                    }
                    a.f98996b.beginTransaction();
                    try {
                        Cursor query = a.f98996b.query("sharedPreference", null, null, null, null, null, null);
                        a.f98996b.setTransactionSuccessful();
                        try {
                            if (query.moveToFirst()) {
                                azdl a2 = azdl.m85412a(baseContext.getApplicationContext());
                                if (query.moveToFirst()) {
                                    do {
                                        String string = query.getString(query.getColumnIndexOrThrow("key"));
                                        String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                                        switch (query.getInt(query.getColumnIndexOrThrow("type"))) {
                                            case 1:
                                                SharedPreferences.Editor edit = a2.f99088a.edit();
                                                edit.putBoolean(string, Boolean.parseBoolean(string2));
                                                edit.apply();
                                                break;
                                            case 2:
                                                SharedPreferences.Editor edit2 = a2.f99088a.edit();
                                                edit2.putInt(string, Integer.parseInt(string2));
                                                edit2.apply();
                                                break;
                                            case 3:
                                                SharedPreferences.Editor edit3 = a2.f99088a.edit();
                                                edit3.putLong(string, Long.parseLong(string2));
                                                edit3.apply();
                                                break;
                                            case 4:
                                                SharedPreferences.Editor edit4 = a2.f99088a.edit();
                                                edit4.putFloat(string, Float.parseFloat(string2));
                                                edit4.apply();
                                                break;
                                            case 5:
                                                SharedPreferences.Editor edit5 = a2.f99088a.edit();
                                                edit5.putString(string, string2);
                                                edit5.apply();
                                                break;
                                            case 6:
                                                SharedPreferences.Editor edit6 = a2.f99088a.edit();
                                                edit6.putStringSet(string, (Set) bmyx.m108643a(",").mo66918a((CharSequence) string2));
                                                edit6.apply();
                                                break;
                                        }
                                    } while (query.moveToNext());
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            String valueOf = String.valueOf(e.getMessage());
                            if (valueOf.length() == 0) {
                                new String("Exception in SP migration revert: ");
                            } else {
                                "Exception in SP migration revert: ".concat(valueOf);
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (Throwable th3) {
                                    bqye.m113761a(th2, th3);
                                }
                            }
                            throw th2;
                        }
                        query.close();
                    } finally {
                        a.f98996b.endTransaction();
                    }
                } else {
                    azdl a3 = azdl.m85412a(baseContext.getApplicationContext());
                    for (Map.Entry entry : a3.f99088a.getAll().entrySet()) {
                        String str = (String) entry.getKey();
                        try {
                            a3.f99088a.getBoolean(str, false);
                            c = 1;
                        } catch (ClassCastException e2) {
                            try {
                                a3.f99088a.getInt(str, 0);
                                c = 2;
                            } catch (ClassCastException e3) {
                                try {
                                    a3.f99088a.getLong(str, 0);
                                    c = 3;
                                } catch (ClassCastException e4) {
                                    try {
                                        a3.f99088a.getFloat(str, 0.0f);
                                        c = 4;
                                    } catch (ClassCastException e5) {
                                        try {
                                            a3.f99088a.getString(str, "");
                                            c = 5;
                                        } catch (ClassCastException e6) {
                                            try {
                                                a3.f99088a.getStringSet(str, null);
                                                c = 6;
                                            } catch (ClassCastException e7) {
                                                c = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (c == 1) {
                            azcw.m85379a(a3.f99089b).mo54708a((String) entry.getKey(), Boolean.toString(a3.f99088a.getBoolean((String) entry.getKey(), false)), 1);
                        } else if (c == 2) {
                            azcw.m85379a(a3.f99089b).mo54708a((String) entry.getKey(), Integer.toString(a3.f99088a.getInt((String) entry.getKey(), 0)), 2);
                        } else if (c == 3) {
                            azcw.m85379a(a3.f99089b).mo54708a((String) entry.getKey(), Long.toString(a3.f99088a.getLong((String) entry.getKey(), 0)), 3);
                        } else if (c == 4) {
                            azcw.m85379a(a3.f99089b).mo54708a((String) entry.getKey(), Float.toString(a3.f99088a.getFloat((String) entry.getKey(), 0.0f)), 4);
                        } else if (c == 5) {
                            azcw.m85379a(a3.f99089b).mo54708a((String) entry.getKey(), a3.f99088a.getString((String) entry.getKey(), ""), 5);
                        }
                    }
                }
                Context baseContext2 = getBaseContext();
                if (cffd.m139295b() && !azdl.m85412a(baseContext2).mo54803y()) {
                    ScheduledTaskService.m94657a(baseContext2.getApplicationContext());
                    azdl.m85412a(baseContext2).mo54758c(true);
                }
                if (!cffd.m139295b() && azdl.m85412a(baseContext2).mo54803y()) {
                    ScheduledTaskService.m94663b(baseContext2.getApplicationContext(), "gms:matchstick:clientStatusReport");
                    azdl.m85412a(baseContext2).mo54758c(false);
                }
                if (cffs.f183946a.mo6606a().mo81130b()) {
                    Context baseContext3 = getBaseContext();
                    azeg.m85519a();
                    int[] b = azeg.m85520b(baseContext3);
                    azdl a4 = azdl.m85412a(baseContext3);
                    String a5 = azpi.m86067a(b);
                    azcv a6 = azcv.m85357a(baseContext3);
                    List e8 = a6.mo54704e();
                    int size = e8.size();
                    while (true) {
                        if (i2 < size) {
                            azct c2 = a6.mo54699c((LocalEntityId) e8.get(i2));
                            if (c2 == null || TextUtils.equals(azpi.m86067a(c2.f99009f), a5)) {
                                i2++;
                            } else {
                                a4.mo54747a(c2.f99009f);
                                Intent intent3 = new Intent(baseContext3, SilentRegisterIntentOperation.class);
                                intent3.setAction("com.google.android.gms.matchstick.force_register_refresh_request_action");
                                SilentRegisterIntentOperation.m94594b(intent3, baseContext3);
                            }
                        }
                    }
                }
                azqf.m86130a(getBaseContext());
                if (azqf.m86149c() && cfgs.m139391K()) {
                    afiw.m53140c(getBaseContext());
                }
                if (!azdl.m85412a(getBaseContext()).mo54735I()) {
                    return;
                }
                if (!cfgs.m139391K() || !cfgs.m139409o()) {
                    afiw.m53141d(getBaseContext());
                    return;
                }
                return;
            }
            return;
        }
        azoj.m85933c("IntentHandler", "Intent is null", new Object[0]);
    }
}

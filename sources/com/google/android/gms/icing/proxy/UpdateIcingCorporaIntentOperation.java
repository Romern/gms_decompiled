package com.google.android.gms.icing.proxy;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.google.android.chimera.IntentOperation;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateIcingCorporaIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final ContentValues f79084a = new ContentValues();

    /* renamed from: a */
    private final acne m66723a() {
        return new acne(new abym(this), getContentResolver());
    }

    /* renamed from: b */
    public static Intent m66730b(Context context) {
        return m66724a(context, "MAYBE");
    }

    /* renamed from: c */
    public static Intent m66731c(Context context) {
        return m66724a(context, "DELTA");
    }

    /* JADX INFO: finally extract failed */
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            acnv.m49556e("Received null intent.");
        } else if (!acni.m49502a()) {
            acnv.m49556e("Contacts corpus disabled.");
        } else {
            String action = intent.getAction();
            if ("com.google.android.gms.icing.proxy.ACTION_UPDATE".equals(action)) {
                m66728a(intent.getStringExtra("KEY_CONTACTS_UPDATE_MODE"), intent.getStringArrayExtra("KEY_CONTACTS_ARGS"));
            } else if ("com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    acnv.m49541a("maybeUpdateContacts extras is null.");
                    return;
                }
                int i = extras.getInt("EXTRA_LAST_RAW_CONTACT_COUNT", -1);
                int i2 = extras.getInt("EXTRA_ATTEMPT", 0);
                StringBuilder sb = new StringBuilder(39);
                sb.append("maybeUpdateContacts attempt ");
                sb.append(i2);
                acnv.m49541a(sb.toString());
                Cursor a = m66723a().mo32907a(ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
                if (a != null) {
                    try {
                        int count = a.getCount();
                        a.close();
                        int intValue = ((Integer) abzt.f58893ah.mo58455c()).intValue();
                        acnv.m49543a("Curr/Prev: %d/%d", Integer.valueOf(count), Integer.valueOf(i));
                        if (count == i || i2 >= intValue) {
                            if (count != i) {
                                StringBuilder sb2 = new StringBuilder(62);
                                sb2.append("Number of contacts did not stabilize after attempt ");
                                sb2.append(i2);
                                acnv.m49556e(sb2.toString());
                            }
                            m66728a("FORCE_ALL", (String[]) null);
                            return;
                        }
                        int i3 = i2 + 1;
                        long longValue = ((Long) abzt.f58892ag.mo58455c()).longValue();
                        if (longValue < 0) {
                            acnv.m49550c("Not rescheduling contacts sync");
                        } else {
                            m66726a(this, i3, count, longValue);
                        }
                    } catch (Throwable th) {
                        a.close();
                        throw th;
                    }
                } else {
                    acnv.m49556e("Could not fetch contact count - no contacts provider present?");
                }
            } else {
                String action2 = intent.getAction();
                String valueOf = String.valueOf(intent);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb3.append("Received ");
                sb3.append(valueOf);
                acnv.m49554d(sb3.toString());
                if ("android.intent.action.PACKAGE_CHANGED".equals(action2)) {
                    if (m66729a(intent)) {
                        m66728a("FORCE_ALL", (String[]) null);
                    }
                } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action2)) {
                    if (m66729a(intent)) {
                        int i4 = Build.VERSION.SDK_INT;
                        m66728a("FORCE_ALL", (String[]) null);
                    }
                } else if ("android.provider.Contacts.DATABASE_CREATED".equals(action2)) {
                    m66725a(this);
                } else if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
                    m66728a("FORCE_ALL", (String[]) null);
                } else {
                    acnv.m49556e("Received unrecognized action.");
                }
            }
        }
    }

    /* renamed from: a */
    public static Intent m66724a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_UPDATE");
        if (startIntent != null) {
            startIntent.putExtra("KEY_CONTACTS_UPDATE_MODE", str);
        }
        return startIntent;
    }

    /* renamed from: a */
    static void m66725a(Context context) {
        long longValue = ((Long) abzt.f58891af.mo58455c()).longValue();
        if (longValue < 0) {
            acnv.m49550c("Not scheduling contacts sync");
        } else {
            m66726a(context, 0, -1, longValue);
        }
    }

    /* renamed from: a */
    private static void m66726a(Context context, int i, int i2, long j) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
        if (startIntent != null) {
            startIntent.putExtra("EXTRA_ATTEMPT", i);
            startIntent.putExtra("EXTRA_LAST_RAW_CONTACT_COUNT", i2);
            PendingIntent service = PendingIntent.getService(context, 0, startIntent, 134217728);
            acnv.m49543a("Scheduling alarm in %d s: %s", Long.valueOf(j / 1000), startIntent);
            new skc(context).mo25675a("Icing:CorporaIntent", 3, SystemClock.elapsedRealtime() + j, service, (String) null);
        }
    }

    /* renamed from: a */
    public static void m66727a(Context context, String str, PrintWriter printWriter) {
        boolean z = false;
        acng.m49500a(printWriter, str, "Alarm status: ");
        Object[] objArr = new Object[3];
        objArr[0] = str.concat("  ");
        objArr[1] = "Contacts pending: ";
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
        if (!(startIntent == null || PendingIntent.getService(context, 0, startIntent, 536870912) == null)) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        acng.m49500a(printWriter, objArr);
    }

    /* renamed from: a */
    private final void m66728a(String str, String[] strArr) {
        acnv.m49542a("Updating corpora: CONTACTS=%s", str);
        new acou(getSharedPreferences("icing_internal_corpora_prefs", 0), m66723a(), str, strArr).mo32967a();
    }

    /* renamed from: a */
    private static final boolean m66729a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return "com.android.providers.contacts".equals(data.getSchemeSpecificPart());
        }
        return false;
    }
}

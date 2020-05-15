package com.google.android.gms.icing.proxy;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IcingInternalCorporaUpdateChimeraService extends aeah {

    /* renamed from: a */
    static final aeab f79074a = new aeab(acok.f60338c, 1);

    /* renamed from: b */
    static final aeab f79075b = new aeab(ContactsContract.AUTHORITY_URI, 1);

    /* renamed from: c */
    static final aeab f79076c = new aeab(CalendarContract.CONTENT_URI, 1);

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m66708a(Context context) {
        if (((Boolean) acaw.f59321ay.mo58455c()).booleanValue()) {
            m66709b(context);
        }
    }

    /* renamed from: b */
    public static void m66709b(Context context) {
        acnv.m49554d("Calling IcingInternalCorporaUpdateChimeraService.schedule");
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) abzt.f58897al.mo58455c()).booleanValue()) {
            if (acok.m49601a(context) && f79074a != null) {
                acnv.m49554d("SMS Corpus is enabled. Adding its uri trigger to list");
                arrayList.add(f79074a);
            }
            if (((Long) abzt.f58894ai.mo58455c()).longValue() >= 0 && acni.m49502a() && f79075b != null) {
                acnv.m49554d("Contacts Corpus is enabled. Adding its uri trigger to list");
                arrayList.add(f79075b);
            }
        }
        if (cemq.m137366c() && ((Boolean) abzt.f58878aS.mo58455c()).booleanValue()) {
            acnv.m49554d("Calendar Corpus is enabled. Adding its uri trigger to list");
            arrayList.add(f79076c);
        }
        if (!arrayList.isEmpty()) {
            acnv.m49554d("Scheduling ContentUriTriggeredTask");
            aeat a = aeat.m51532a(rpr.m34216b());
            aeac aeac = new aeac();
            aeac.f63099k = "internal-corpora-update";
            aeac.f63097i = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            aeac.mo34027b(1);
            aeac.mo33973a(arrayList);
            aeac.mo34032e();
            a.mo33984a(aeac.mo33974b());
            acnv.m49554d("ContentUriTriggeredTask is scheduled");
            return;
        }
        acnv.m49554d("Not schedule ContentUriTriggeredTask because the uri trigger list is empty.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0103 A[Catch:{ all -> 0x00e2, all -> 0x00e8, all -> 0x0153 }] */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        Cursor a;
        SharedPreferences sharedPreferences;
        Throwable th;
        aecc aecc2 = aecc;
        String str = aecc2.f63128a;
        acnv.m49542a("Running gcm task %s", str);
        if ("internal-corpora-update".equals(str)) {
            try {
                List<Uri> list = aecc2.f63130c;
                acnv.m49554d("Processing triggered uris");
                if (list != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (f79074a == null || f79075b == null) {
                        acnv.m49541a("Not process triggered uri because platform version is lower than N.");
                    } else {
                        String uri = f79074a.f62977a.toString();
                        String uri2 = ContactsContract.ProviderStatus.CONTENT_URI.toString();
                        String uri3 = f79075b.f62977a.toString();
                        String uri4 = f79076c.f62977a.toString();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        for (Uri uri5 : list) {
                            if (uri5 != null) {
                                String uri6 = uri5.toString();
                                if (!z && uri6.startsWith(uri)) {
                                    z = true;
                                } else if (!z2 && uri2.equals(uri6)) {
                                    int i2 = Build.VERSION.SDK_INT;
                                    z2 = true;
                                } else if (!z3 && uri6.startsWith(uri3)) {
                                    z3 = true;
                                } else if (!z4) {
                                    if (uri6.startsWith(uri4)) {
                                        z4 = true;
                                    }
                                }
                            }
                        }
                        if (z) {
                            acnv.m49554d("SMS provider changed");
                            acof.m49596c(this);
                        }
                        if (z2) {
                            a = new acne(new abym(this), getContentResolver()).mo32907a(ContactsContract.ProviderStatus.CONTENT_URI, new String[]{"database_creation_timestamp"}, null, null, null);
                            long j = -1;
                            if (a != null) {
                                if (a.moveToNext()) {
                                    Long l = -1L;
                                    Long a2 = sra.m36062a(a, 0, l);
                                    if (a2 != null) {
                                        l = a2;
                                    }
                                    j = l.longValue();
                                    a.close();
                                    sharedPreferences = getSharedPreferences("icing_internal_corpora_prefs", 0);
                                    if (sharedPreferences.getLong("contacts_db_creation_time_ms", 0) < j) {
                                        acnv.m49554d("Contacts database created");
                                        sharedPreferences.edit().putLong("contacts_db_creation_time_ms", j).apply();
                                        UpdateIcingCorporaIntentOperation.m66725a(this);
                                    }
                                }
                            }
                            if (a != null) {
                                a.close();
                            }
                            sharedPreferences = getSharedPreferences("icing_internal_corpora_prefs", 0);
                            if (sharedPreferences.getLong("contacts_db_creation_time_ms", 0) < j) {
                            }
                        }
                        if (z3) {
                            acnv.m49554d("Contacts provider changed");
                            aclx.m49425a(this);
                            synchronized (aclx.class) {
                                if (aclx.f60141a != null) {
                                    aclx.f60141a.onChange(false);
                                }
                            }
                        }
                        if (z4) {
                            acnv.m49554d("Calendar provider changed");
                            acpg.f60408a.mo32983a(getApplicationContext(), 1, 1);
                        }
                    }
                } else {
                    acnv.m49556e("Triggered uri list is null");
                }
                m66709b(this);
            } catch (Throwable th2) {
                m66709b(this);
                throw th2;
            }
        } else if ("InternalCorporaMaintenance".equals(str)) {
            acni.m49505c(this);
        }
        return 0;
        throw th;
    }
}

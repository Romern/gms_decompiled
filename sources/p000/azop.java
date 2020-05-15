package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azop {

    /* renamed from: a */
    public static final /* synthetic */ int f99797a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static Notification.Action m85941a(int i, String str, PendingIntent pendingIntent) {
        int i2 = Build.VERSION.SDK_INT;
        return new Notification.Action.Builder(i, str, pendingIntent).build();
    }

    /* renamed from: a */
    static Notification.Action m85942a(Context context, cbhz cbhz, String str) {
        int i;
        try {
            i = qkj.m32287a(context, (int) cbhz.f177223c);
        } catch (Resources.NotFoundException e) {
            azoj.m85931a("NotificationUtils", e, "Unable to find icon resource ID %d", Long.valueOf(cbhz.f177223c));
            azph.m85998a(context).mo55130a(1423, 6, str);
            i = -1;
        }
        cbhj cbhj = cbhz.f177222b;
        if (cbhj == null) {
            cbhj = cbhj.f177133d;
        }
        Intent a = azoi.m85922a(cbhj);
        if (a == null) {
            azph.m85998a(context).mo55130a(1424, 6, str);
            return null;
        }
        a.putExtra("message_activity_conv_id", str);
        return m85941a(i, cbhz.f177221a, PendingIntent.getActivity(context, a.hashCode(), a, 134217728));
    }

    /* renamed from: a */
    private static Bundle m85943a(Context context, LocalEntityId localEntityId) {
        String str;
        String str2;
        azdi b = azdj.m85399a(context).mo54722b(localEntityId);
        if (b != null) {
            str = b.f99080f;
            str2 = b.f99079e;
        } else {
            new Object[1][0] = localEntityId;
            str = localEntityId.f111075b == 1 ? azot.m85964a(localEntityId.f111074a, (TelephonyManager) context.getSystemService("phone")) : localEntityId.f111074a;
            str2 = str;
        }
        String c = azny.m85888c(context, localEntityId);
        boolean isEmpty = TextUtils.isEmpty(c);
        boolean z = !isEmpty;
        String str3 = localEntityId.f111074a;
        int i = localEntityId.f111075b;
        if (!isEmpty) {
            str = c;
        }
        return m85944a(str3, i, str2, z, str);
    }

    /* renamed from: a */
    private static Bundle m85944a(String str, int i, String str2, boolean z, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("message_activity_sender_id", str);
        bundle.putInt("message_activity_sender_type", i);
        bundle.putString("message_activity_sender_id_display", str2);
        bundle.putBoolean("sender_in_contacts", z);
        bundle.putString("message_activity_sender_name", str3);
        return bundle;
    }

    /* renamed from: a */
    public static azam m85945a(Context context, aznz aznz, Bitmap bitmap, String str, String str2) {
        Long l;
        Bundle bundle;
        Context context2 = context;
        aznz aznz2 = aznz;
        azam azam = new azam();
        SQLiteDatabase readableDatabase = azcl.m85289a(context).getReadableDatabase();
        azph.m85998a(context).mo55137a(55, aznz2);
        List a = m85952a(context2, readableDatabase, aznz2);
        Cursor query = context.getContentResolver().query(DatabaseProvider.m94544h("messages"), new String[]{"_id"}, "conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39)", new String[]{aznz2.f99774a}, "_id DESC");
        if (query == null || !query.moveToFirst()) {
            query = null;
        }
        if (query != null) {
            Long valueOf = Long.valueOf(query.getLong(0));
            query.close();
            l = valueOf;
        } else {
            l = null;
        }
        PendingIntent a2 = azoi.m85919a(context, aznz, l, true, false, false);
        if (!a.isEmpty()) {
            bundle = m85943a(context2, (LocalEntityId) a.get(0));
        } else {
            bundle = null;
        }
        PendingIntent a3 = azoi.m85920a(context, aznz, false, bundle, null, m85948a(context2, aznz2, m85953a(a)), str, false, true, false);
        String a4 = azcd.m85252a(context).mo54600a(aznz2.f99775b, 19);
        if (TextUtils.isEmpty(a4)) {
            azph.m85998a(context).mo55125a((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
            a4 = context2.getString(C0126R.string.reply_again_notification_text_fallback);
        }
        azam.f98844h = context2.getString(C0126R.string.reply_again_notification_title, str);
        azam.f98845i = a4;
        azam.f98847k = a3;
        azam.f98846j = a2;
        azam.f98837a = bitmap;
        m85955a(context2, azam, str2, 0, aznz2);
        return azam;
    }

    /* renamed from: a */
    public static azam m85946a(Context context, aznz aznz, String str, Bitmap bitmap, String str2, String str3) {
        Bundle bundle;
        Context context2 = context;
        aznz aznz2 = aznz;
        String str4 = str3;
        SQLiteDatabase readableDatabase = azcl.m85289a(context).getReadableDatabase();
        azdd a = azcm.m85300a(context).mo54643a(str, aznz2.f99774a);
        if (a == null || a.f99056l != 32) {
            return null;
        }
        azam azam = new azam();
        List a2 = m85952a(context2, readableDatabase, aznz2);
        if (!a2.isEmpty()) {
            bundle = m85943a(context2, (LocalEntityId) a2.get(0));
        } else {
            bundle = null;
        }
        azam.f98847k = azoi.m85920a(context, aznz, false, bundle, null, m85948a(context2, aznz2, m85953a(a2)), str2, false, true, false);
        azam.f98845i = context2.getString(C0126R.string.message_send_failure_notification_text);
        azam.f98843g = azcd.m85252a(context).mo54600a(aznz2.f99775b, 18);
        azam.f98844h = context2.getString(C0126R.string.message_send_failure_notification_title, str2);
        azam.f98837a = bitmap;
        azam.f98838b = azcd.m85252a(context).mo54613e(str4);
        azam.f98840d = azcd.m85252a(context).mo54615g(str4);
        azam.f98839c = C0126R.C0127drawable.quantum_ic_chat_white_24;
        azam.f98841e = azcd.m85252a(context).mo54614f(str4);
        azam.f98846j = null;
        azam.f98842f = context2.getString(C0126R.string.message_send_failure_notification_text);
        return azam;
    }

    /* renamed from: a */
    public static azam m85947a(Context context, aznz aznz, List list, SQLiteDatabase sQLiteDatabase, boolean z, String str, Bitmap bitmap, String str2, String str3) {
        boolean z2;
        String str4;
        azdd azdd;
        boolean z3;
        long j;
        String str5;
        Intent intent;
        azdd azdd2;
        Uri uri;
        String str6;
        List list2;
        String str7;
        Context context2 = context;
        aznz aznz2 = aznz;
        List list3 = list;
        String str8 = str;
        String str9 = str2;
        int i = 1;
        if (str8 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        azdd azdd3 = (azdd) list3.get(list.size() - 1);
        int i2 = 3;
        Uri uri2 = null;
        if (!z && !aznz.mo55107e() && azdd3.f99048d == 3 && !azpi.m86079b(azdd3.f99047c)) {
            return null;
        }
        azam azam = new azam();
        if (!aznz.mo55107e()) {
            azdd azdd4 = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                azdd4 = (azdd) list3.get(size);
                int i3 = azdd4.f99048d;
                if (i3 == 1 || i3 == 7 || i3 == 4) {
                    break;
                }
            }
            if (azdd4 == null) {
                if (z2) {
                    return null;
                }
                azdd4 = azdd3;
            }
            Pair a = azny.m85883a(context2, azdd4);
            z3 = ((Boolean) a.second).booleanValue();
            str4 = (String) a.first;
            azdd = azdd4;
        } else {
            str4 = azdd3.f99058n;
            azdd = azdd3;
            z3 = true;
        }
        int size2 = list.size();
        long j2 = 0;
        long j3 = -1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < size2) {
            boolean z5 = z3;
            String str10 = str4;
            azam azam2 = azam;
            azdd azdd5 = azdd;
            String str11 = str9;
            azdd azdd6 = azdd3;
            azdd azdd7 = (azdd) list.get(i4);
            long millis = TimeUnit.MICROSECONDS.toMillis(azdd7.f99054j);
            if (millis > j2) {
                j2 = millis;
            }
            long j4 = azdd7.f99045a;
            if (j3 < j4) {
                j3 = j4;
            }
            if (azdd.m85389b(azdd7.f99056l)) {
                z4 = true;
            }
            i4++;
            str8 = str;
            str4 = str10;
            str9 = str11;
            azdd = azdd5;
            z3 = z5;
            azam = azam2;
            azdd3 = azdd6;
            i2 = 3;
            i = 1;
        }
        Pair create = Pair.create(Long.valueOf(j2), Pair.create(Long.valueOf(j3), Boolean.valueOf(z4)));
        boolean booleanValue = ((Boolean) ((Pair) create.second).second).booleanValue();
        if (!z2 || TextUtils.equals(str8, "$lastUnreadMessage")) {
            long longValue = ((Long) create.first).longValue();
            str5 = m85949a(context2, azdd3, aznz2);
            j = longValue;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (azdd3.f99048d == i2) {
                String str12 = azdd3.f99047c;
                String str13 = azdd3.f99058n;
                if (!TextUtils.isEmpty(str13)) {
                    str12 = str13;
                }
                str7 = azpi.m86083c(str12);
            } else {
                str7 = azpi.m86083c((String) azny.m85883a(context2, azdd3).first);
            }
            String[] strArr = new String[i];
            strArr[0] = "$senderName";
            String[] strArr2 = new String[i];
            strArr2[0] = str7;
            j = currentTimeMillis;
            str5 = TextUtils.replace(str8, strArr, strArr2).toString();
        }
        if (cfgj.m139365b()) {
            Intent a2 = azoi.m85921a(context2, azdd);
            if (a2 != null) {
                azph.m85998a(context).mo55137a(47, aznz2);
            }
            intent = a2;
        } else {
            intent = null;
        }
        List a3 = m85952a(context2, sQLiteDatabase, aznz2);
        if (cffa.f183914a.mo6606a().mo81104b() && (azdd.f99047c == null || azdd.f99048d == 0)) {
            azph.m85998a(context).mo55125a(68);
            return null;
        }
        boolean z6 = z3;
        azam azam3 = azam;
        azdd azdd8 = azdd;
        PendingIntent a4 = azoi.m85920a(context, aznz, false, m85944a(azdd.f99047c, azdd.f99048d, azdd.f99049e, z3, str4), intent, m85948a(context2, aznz2, m85953a(a3)), str2, booleanValue, false, z2);
        bmxv b = bmxv.m108566b(azoi.m85920a(context, aznz, true, m85944a(azdd.f99047c, azdd.f99048d, azdd.f99049e, z6, str4), intent, m85948a(context2, aznz2, m85953a(a3)), str2, booleanValue, false, z2));
        PendingIntent a5 = azoi.m85919a(context, aznz, Long.valueOf(azdd3.f99045a), false, booleanValue, z2);
        if (z2) {
            azdd2 = azdd8;
            azph.m85998a(context).mo55138a(58, aznz2, azdd2.f99046b, Boolean.valueOf(z6));
        } else {
            azdd2 = azdd8;
            if (!z) {
                azph.m85998a(context).mo55138a(52, aznz2, azdd2.f99046b, Boolean.valueOf(z6));
            } else {
                azph.m85998a(context).mo55138a(54, aznz2, azdd2.f99046b, Boolean.valueOf(z6));
            }
        }
        long d = azny.m85889d(context2, azdd2.f99062r);
        if (d != -1) {
            uri = ContactsContract.Contacts.getLookupUri(context.getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, d));
        } else {
            uri = null;
        }
        if (aznz.mo55105c() && !z6 && !azcm.m85300a(context).mo54668f(aznz2.f99774a) && !z2 && aznz.mo55108f()) {
            String quantityString = context.getResources().getQuantityString(C0126R.plurals.notification_new_messages, 1);
            list2 = new ArrayList();
            str6 = quantityString;
        } else {
            uri2 = uri;
            str6 = str5;
            list2 = list;
        }
        azam azam4 = azam3;
        m85955a(context2, azam4, str3, list2.size(), aznz2);
        azam4.f98847k = a4;
        azam4.f98849m = b;
        azam4.f98846j = a5;
        String str14 = str2;
        azam4.f98844h = str14;
        azam4.f98845i = str6;
        azam4.f98837a = bitmap;
        if (j > 0) {
            azam4.f98851o = bmxv.m108566b(Long.valueOf(j));
        }
        if (str14 != null) {
            azam4.f98850n = bmxv.m108566b(str2);
        }
        if (uri2 != null) {
            azam4.f98852p = bmxv.m108566b(uri2);
        }
        return azam4;
    }

    /* renamed from: a */
    private static bnhe m85948a(Context context, aznz aznz, List list) {
        bnha h = bnhe.m109414h();
        if (!aznz.mo55109g()) {
            return h.mo67618b();
        }
        if (list.isEmpty()) {
            return h.mo67618b();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalEntityId localEntityId = (LocalEntityId) it.next();
            if (localEntityId.f111075b == 1) {
                String str = localEntityId.f111074a;
                h.mo67695b(str, azot.m85964a(str, (TelephonyManager) context.getSystemService("phone")));
            }
        }
        return h.mo67618b();
    }

    /* renamed from: a */
    public static String m85949a(Context context, azdd azdd, aznz aznz) {
        cbil cbil;
        String a;
        String str;
        int i;
        cbih cbih;
        String str2 = "";
        String str3 = null;
        if (!(azdd == null || !azoy.m85996l(azdd.mo54713b()) || (cbil = (cbil) azol.m85935a((bxxk) cbil.f177257h.mo74142c(7), azdd.mo54712a())) == null)) {
            if (cbil.f177264f != 0 && (a = azcd.m85252a(context).mo54601a(aznz.f99775b, cbil.f177264f)) != null) {
                if (TextUtils.equals(aznz.f99775b, "1004514487972")) {
                    if (cbil.f177259a == 6) {
                        azoo azoo = new azoo(context);
                        if (cbil.f177259a == 6) {
                            cbih = (cbih) cbil.f177260b;
                        } else {
                            cbih = cbih.f177242h;
                        }
                        bxte bxte = cbih.f177250g;
                        if (bxte == null) {
                            azph.m85998a(context).mo55126a(504, 6);
                            i = 0;
                        } else {
                            cbay b = azoo.mo26261a(bxte.f164766b.mo73780k());
                            if (b == null) {
                                azph.m85998a(context).mo55126a(504, 6);
                                i = 0;
                            } else {
                                i = b.f176517a;
                            }
                        }
                        str = cbih.f177246c;
                    } else {
                        str = str2;
                        i = 0;
                    }
                    a = azov.m85980a(a, bnhe.m109409a("photoNumber", String.valueOf(i), "albumName", str));
                }
                str3 = azov.m85980a(a, bnhe.m109408a("senderName", (String) azny.m85883a(context, azdd).first));
            } else if (!cbil.f177263e.isEmpty()) {
                str3 = cbil.f177263e;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        String str4 = azdd.f99052h;
        if (azdd.f99048d == 3 && !aznz.mo55107e()) {
            String str5 = azdd.f99047c;
            String str6 = azdd.f99058n;
            if (!TextUtils.isEmpty(str6)) {
                str5 = str6;
            }
            str2 = azpi.m86083c(str5);
        } else if (aznz.mo55104b() && !TextUtils.equals("BMMerchant", aznz.f99775b)) {
            str2 = azpi.m86083c((String) azny.m85883a(context, azdd).first);
        }
        if (azoy.m85984a(str4) && azoy.m85997m(azdd.mo54713b())) {
            String c = azpi.m86083c(azpi.m86066a(azdd.mo54712a()));
            if (TextUtils.isEmpty(str2)) {
                return c;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(c).length());
            sb.append(str2);
            sb.append(": ");
            sb.append(c);
            return sb.toString();
        } else if (!TextUtils.isEmpty(str2)) {
            return context.getResources().getString(C0126R.string.fallback_message_text_with_sender_name, str2);
        } else {
            return context.getResources().getString(C0126R.string.fallback_message_text_without_sender_name);
        }
    }

    /* renamed from: a */
    public static String m85950a(Context context, aznz aznz) {
        azdi b = azdj.m85399a(context).mo54722b(aznz.f99781h);
        if (b == null) {
            return null;
        }
        String str = b.f99080f;
        new Object[1][0] = str;
        return str;
    }

    /* renamed from: a */
    public static String m85951a(Context context, List list, aznz aznz) {
        if (!aznz.mo55104b()) {
            return azpi.m86065a(context, aznz, (LocalEntityId) list.get(0));
        }
        String a = m85950a(context, aznz);
        return a == null ? azpi.m86064a(context, aznz, list.size(), (LocalEntityId) list.get(0)) : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: a */
    public static List m85952a(Context context, SQLiteDatabase sQLiteDatabase, aznz aznz) {
        azox.m85982b();
        ArrayList arrayList = new ArrayList();
        if (aznz.mo55104b()) {
            SQLiteDatabase sQLiteDatabase2 = azcm.m85300a(context).f98996b;
            Cursor cursor = null;
            Object obj = null;
            if (!aznz.mo55104b()) {
                new Object[1][0] = aznz;
            } else {
                ArrayList arrayList2 = new ArrayList();
                try {
                    sQLiteDatabase2.beginTransaction();
                    cursor = azcm.m85307b(sQLiteDatabase2, aznz.f99774a);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                do {
                                    arrayList2.add(new LocalEntityId(cursor.getString(0), cursor.getInt(1), aznz.f99775b));
                                } while (cursor.moveToNext());
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabase2.endTransaction();
                            throw th;
                        }
                    }
                    sQLiteDatabase2.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.endTransaction();
                    obj = arrayList2;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    sQLiteDatabase2.endTransaction();
                    throw th;
                }
            }
            arrayList.addAll(obj);
        } else {
            arrayList.add(azcm.m85302a(sQLiteDatabase, aznz));
        }
        Object[] objArr = {aznz, arrayList};
        return arrayList;
    }

    /* renamed from: a */
    private static List m85953a(List list) {
        return list.subList(0, Math.min((int) cfeo.f183719a.mo6606a().mo80965aY(), list.size()));
    }

    /* renamed from: a */
    public static void m85954a(Context context, azam azam, String str) {
        azam.f98838b = azcd.m85252a(context).mo54613e(str);
        azam.f98840d = azcd.m85252a(context).mo54615g(str);
        azam.f98839c = C0126R.C0127drawable.quantum_ic_chat_white_24;
        azam.f98841e = azcd.m85252a(context).mo54614f(str);
        azam.f98843g = azcd.m85252a(context).mo54600a(str, 18);
    }

    /* renamed from: a */
    public static void m85955a(Context context, azam azam, String str, int i, aznz aznz) {
        m85954a(context, azam, str);
        azam.f98842f = context.getResources().getQuantityString(C0126R.plurals.notification_new_messages, i);
        if (cfgs.m139403i()) {
            azam.f98848l.clear();
            cbhz[] h = azcd.m85252a(context).mo54616h(str);
            if (h == null || (r1 = h.length) == 0) {
                azoj.m85933c("NotificationUtils", "No notification actions found for app %s", str);
                return;
            }
            for (cbhz cbhz : h) {
                Notification.Action a = m85942a(context, cbhz, aznz.f99774a);
                if (a != null) {
                    azam.f98848l.add(a);
                }
            }
        }
    }
}

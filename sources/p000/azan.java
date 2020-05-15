package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: azan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azan {

    /* renamed from: c */
    private static final Map f98855c = new ConcurrentHashMap();

    /* renamed from: d */
    private static WeakReference f98856d = new WeakReference(null);

    /* renamed from: a */
    public final Context f98857a;

    /* renamed from: b */
    public final sey f98858b;

    public azan(Context context) {
        this.f98857a = context.getApplicationContext();
        this.f98858b = sey.m35126a(context);
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel("matchstick_notification_channel_new", context.getString(C0126R.string.phone_number_settings_label), 4);
        NotificationChannel notificationChannel2 = new NotificationChannel("matchstick_notification_channel", context.getString(C0126R.string.phone_number_settings_label), 2);
        sex.m35104a(context).mo25442a(notificationChannel);
        sex.m35104a(context).mo25442a(notificationChannel2);
    }

    /* renamed from: a */
    public static Notification.Builder m85140a(Context context, azam azam) {
        String str;
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(azam.f98840d)) {
            str = azam.f98840d;
        } else {
            str = context.getString(C0126R.string.phone_number_settings_label);
        }
        bundle.putString("android.substName", str);
        Notification.Builder contentTitle = new Notification.Builder(context).setContentTitle(azam.f98844h);
        String str2 = azam.f98844h;
        String str3 = azam.f98845i;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        Notification.Builder deleteIntent = contentTitle.setTicker(sb.toString()).setContentText(azam.f98845i).setContentIntent(azam.f98847k).setAutoCancel(true).setDeleteIntent(azam.f98846j);
        int a = qkj.m32287a(context, azam.f98839c);
        azam.f98839c = a;
        m85142a(deleteIntent, azam.f98838b, a);
        int i2 = Build.VERSION.SDK_INT;
        deleteIntent.addExtras(bundle);
        int i3 = Build.VERSION.SDK_INT;
        deleteIntent.setColor(azam.f98841e);
        if (TextUtils.isEmpty(azam.f98843g)) {
            azph.m85998a(context).mo55125a((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
            azam.f98843g = context.getResources().getString(C0126R.string.redacted_notification_text_fallback);
        }
        Notification.Builder addExtras = new Notification.Builder(context).setColor(azam.f98841e).setContentTitle(azam.f98842f).setContentText(azam.f98843g).addExtras(bundle);
        m85142a(addExtras, azam.f98838b, azam.f98839c);
        deleteIntent.setPublicVersion(addExtras.build());
        deleteIntent.setCategory("msg");
        int i4 = Build.VERSION.SDK_INT;
        deleteIntent.setGroup(context.getResources().getString(C0126R.string.phone_number_settings_label));
        deleteIntent.setSortKey(context.getResources().getString(C0126R.string.phone_number_settings_label));
        deleteIntent.setGroupSummary(true);
        Bitmap bitmap = azam.f98837a;
        if (bitmap != null) {
            deleteIntent.setLargeIcon(bitmap);
        }
        int i5 = Build.VERSION.SDK_INT;
        deleteIntent.setChannelId("matchstick_notification_channel");
        return deleteIntent;
    }

    /* renamed from: b */
    public final void mo54541b(String str) {
        sey sey = this.f98858b;
        int i = azpi.f99824a;
        sey.mo25458a(str, 0);
        this.f98858b.mo25458a(str, 1);
    }

    /* renamed from: c */
    public final void mo54543c(String str) {
        sey sey = this.f98858b;
        int i = azpi.f99824a;
        sey.mo25458a(str, 0);
    }

    /* renamed from: d */
    public final void mo54544d(String str) {
        this.f98858b.mo25458a(str, 0);
    }

    /* renamed from: b */
    public final boolean mo54542b() {
        return this.f98858b.mo25460a();
    }

    /* renamed from: a */
    public static synchronized azan m85141a(Context context) {
        azan azan;
        synchronized (azan.class) {
            azan = (azan) f98856d.get();
            if (azan == null) {
                azan = new azan(context);
                f98856d = new WeakReference(azan);
            }
        }
        return azan;
    }

    /* renamed from: a */
    private static void m85142a(Notification.Builder builder, Bitmap bitmap, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (bitmap != null) {
            builder.setSmallIcon(Icon.createWithBitmap(bitmap));
        } else if (i != 0) {
            builder.setSmallIcon(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ef  */
    /* renamed from: a */
    private final void m85143a(Context context, azam azam, aznz aznz, List list, boolean z, boolean z2) {
        String str;
        Cursor cursor;
        Notification.Builder a = m85140a(context, azam);
        int i = Build.VERSION.SDK_INT;
        if (azam.f98851o.mo66813a() && ((Long) azam.f98851o.mo66814b()).longValue() <= System.currentTimeMillis()) {
            a.setShowWhen(true).setWhen(((Long) azam.f98851o.mo66814b()).longValue());
            new Object[1][0] = azam.f98851o.mo66814b();
        }
        if (z) {
            if (!cfgs.m139403i() || azam.f98848l.isEmpty()) {
                azcd a2 = azcd.m85252a(context);
                String str2 = aznz.f99775b;
                if (!"FB".equals(str2)) {
                    try {
                        cursor = a2.mo54598a(str2, new String[]{"app_ui_config"});
                        if (cursor != null) {
                            try {
                                if (cursor.moveToNext()) {
                                    cbht cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), cursor.getBlob(0));
                                    boolean z3 = cbht == null || !cbht.f177180b;
                                    cursor.close();
                                    if (!z3) {
                                        str = context.getResources().getString(C0126R.string.common_view);
                                        a.addAction(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_reply_grey600_24), str, azam.f98847k);
                                        if (azam.f98849m.mo66813a()) {
                                            a.addAction(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_close_grey600_24), context.getResources().getString(C0126R.string.common_block), (PendingIntent) azam.f98849m.mo66814b());
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                str = context.getResources().getString(C0126R.string.common_reply);
                a.addAction(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_reply_grey600_24), str, azam.f98847k);
                if (azam.f98849m.mo66813a()) {
                }
            } else {
                azph.m85998a(context).mo55137a(1426, aznz);
                List list2 = azam.f98848l;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = Build.VERSION.SDK_INT;
                    a.addAction((Notification.Action) list2.get(i2));
                }
            }
        }
        if (!list.isEmpty()) {
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle(a);
            if (azam.f98850n.mo66813a()) {
                inboxStyle.setBigContentTitle((CharSequence) azam.f98850n.mo66814b());
            }
            int size2 = list.size();
            for (azdd azdd : list.subList(Math.max(size2 - 5, 0), size2)) {
                inboxStyle.addLine(azop.m85949a(context, azdd, aznz));
            }
            a.setStyle(inboxStyle);
        }
        if (!z2) {
            long bC = cfeo.f183719a.mo6606a().mo80996bC();
            long uptimeMillis = SystemClock.uptimeMillis();
            Long l = (Long) f98855c.get(aznz.f99774a);
            if (l == null || uptimeMillis - l.longValue() > bC) {
                f98855c.put(aznz.f99774a, Long.valueOf(uptimeMillis));
                a.setSound(RingtoneManager.getDefaultUri(2));
                int i4 = Build.VERSION.SDK_INT;
                a.setChannelId("matchstick_notification_channel_new");
                a.setDefaults(4);
            } else {
                Object[] objArr = {Long.valueOf(uptimeMillis), l};
            }
        } else {
            int i5 = Build.VERSION.SDK_INT;
            a.setChannelId("matchstick_notification_channel");
        }
        int i6 = Build.VERSION.SDK_INT;
        if (azam.f98852p.mo66813a()) {
            a.addPerson(((Uri) azam.f98852p.mo66814b()).toString());
            Object[] objArr2 = {azam.f98852p.mo66814b(), aznz};
        }
        Notification build = a.build();
        sey sey = this.f98858b;
        String str3 = aznz.f99774a;
        int i7 = azpi.f99824a;
        sey.mo25459a(str3, 0, build);
        if (!mo54542b()) {
            azph.m85998a(context).mo55137a(56, aznz);
        }
    }

    /* renamed from: a */
    public final void mo54535a() {
        azox.m85982b();
        List a = DatabaseProvider.m94524a(this.f98857a.getContentResolver());
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                mo54541b((String) a.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo54536a(aznz aznz, boolean z, String str) {
        boolean z2;
        ArrayList arrayList;
        aznz aznz2 = aznz;
        String str2 = "last_notified";
        azox.m85982b();
        char c = 0;
        try {
            SQLiteDatabase writableDatabase = azcl.m85289a(this.f98857a).getWritableDatabase();
            List e = azcm.m85300a(this.f98857a).mo54666e(aznz2.f99774a);
            int i = 1;
            if (!e.isEmpty()) {
                azdd azdd = (azdd) e.get(e.size() - 1);
                int size = e.size();
                long j = 0;
                long j2 = -1;
                long j3 = -1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 < size) {
                    List list = e;
                    String str3 = str2;
                    azdd azdd2 = (azdd) list.get(i2);
                    azdd azdd3 = azdd;
                    int i3 = size;
                    long millis = TimeUnit.MICROSECONDS.toMillis(azdd2.f99054j);
                    if (millis > j) {
                        j = millis;
                    }
                    long j4 = azdd2.f99045a;
                    if (j3 < j4) {
                        j3 = j4;
                    }
                    if (azdd.m85389b(azdd2.f99056l)) {
                        z3 = true;
                    }
                    i2++;
                    str2 = str3;
                    size = i3;
                    azdd = azdd3;
                    c = 0;
                    e = list;
                    i = 1;
                }
                long longValue = ((Long) ((Pair) Pair.create(Long.valueOf(j), Pair.create(Long.valueOf(j3), Boolean.valueOf(z3))).second).first).longValue();
                if (!aznz.mo55107e()) {
                    azdd azdd4 = null;
                    for (int size2 = e.size() - 1; size2 >= 0; size2--) {
                        azdd4 = (azdd) e.get(size2);
                        int i4 = azdd4.f99048d;
                        if (i4 == i || i4 == 7 || i4 == 4) {
                            break;
                        }
                    }
                    if (azdd4 != null) {
                        azdd = azdd4;
                    } else if (str != null) {
                        return;
                    }
                    z2 = ((Boolean) azny.m85883a(this.f98857a, azdd).second).booleanValue();
                } else {
                    z2 = true;
                }
                boolean a = mo54540a(aznz);
                List a2 = azop.m85952a(this.f98857a, writableDatabase, aznz2);
                if (a2.isEmpty()) {
                    Object[] objArr = new Object[i];
                    objArr[c] = aznz2.f99774a;
                    azoj.m85933c("NotificationManager", "Group participants table is not initialized properly for conversation:%s", objArr);
                    azph.m85998a(this.f98857a).mo55128a(1408, 47, aznz2);
                    return;
                }
                azam a3 = azop.m85947a(this.f98857a, aznz, e, writableDatabase, z, str, azcj.m85279a(this.f98857a).mo54626a(a2, aznz2), azop.m85951a(this.f98857a, a2, aznz2), (cfeo.m138892w() && a) ? "businessmessaging" : aznz2.f99775b);
                if (a3 != null) {
                    if (aznz.mo55105c() && !z2 && !azcm.m85300a(this.f98857a).mo54668f(aznz2.f99774a) && str == null && aznz.mo55108f()) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = e;
                    }
                    List list2 = e;
                    String str4 = str2;
                    m85143a(this.f98857a, a3, aznz, arrayList, true, z);
                    if (str == null) {
                        azcm a4 = azcm.m85300a(this.f98857a);
                        String str5 = aznz2.f99774a;
                        if (a4.mo54658b()) {
                            a4.f98996b.beginTransaction();
                            try {
                                Cursor query = a4.f98996b.query("conversations", new String[]{str4}, "conversation_id =? ", new String[]{str5}, null, null, null, null);
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        j2 = query.getLong(0);
                                    }
                                    query.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(str4, Long.valueOf(longValue));
                                a4.f98996b.update("conversations", contentValues, "conversation_id = ? AND last_notified < ? ", new String[]{str5, Long.toString(longValue)});
                                a4.f98996b.setTransactionSuccessful();
                            } finally {
                                a4.f98996b.endTransaction();
                            }
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        int size3 = list2.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            azdd azdd5 = (azdd) list2.get(i5);
                            int i6 = azdd5.f99056l;
                            if (!(i6 == 3 || i6 == 4 || azdd5.f99045a <= j2)) {
                                azph.m85998a(this.f98857a).mo55161a("Matchstick.Message.ReceiveToNotify.Time", currentTimeMillis - azdd5.f99053i);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            new Object[1][0] = aznz2;
        } catch (SQLiteException e2) {
            azoj.m85932b("NotificationManager", "Database cannot be opened.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo54537a(LocalEntityId localEntityId) {
        LocalEntityId localEntityId2;
        azox.m85982b();
        List a = DatabaseProvider.m94524a(this.f98857a.getContentResolver());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) a.get(i);
            if (aznz.m85891a(str) != null) {
                localEntityId2 = aznz.m85891a(str).f99780g;
            } else {
                localEntityId2 = null;
            }
            if (localEntityId2 != null && localEntityId2.equals(localEntityId)) {
                mo54541b(str);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azan.a(aznz, boolean, java.lang.String):void
     arg types: [aznz, int, ?[OBJECT, ARRAY]]
     candidates:
      azan.a(android.app.Notification$Builder, android.graphics.Bitmap, int):void
      azan.a(java.lang.String, boolean, boolean):void
      azan.a(aznz, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo54538a(String str) {
        aznz a = aznz.m85891a(str);
        if (a == null) {
            azoj.m85933c("NotificationManager", "Invalid conversation id format:%s", str);
            return;
        }
        mo54536a(a, false, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azan.a(aznz, boolean, java.lang.String):void
     arg types: [aznz, int, ?[OBJECT, ARRAY]]
     candidates:
      azan.a(android.app.Notification$Builder, android.graphics.Bitmap, int):void
      azan.a(java.lang.String, boolean, boolean):void
      azan.a(aznz, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo54539a(String str, boolean z, boolean z2) {
        String str2;
        azox.m85982b();
        aznz a = aznz.m85891a(str);
        if (a == null) {
            azoj.m85933c("NotificationManager", "Invalid conversation id format:%s", str);
        } else if (azcm.m85300a(this.f98857a).mo54666e(str).isEmpty() && z) {
            azox.m85982b();
            boolean a2 = mo54540a(a);
            List a3 = azop.m85952a(this.f98857a, azcl.m85289a(this.f98857a).getReadableDatabase(), a);
            Bitmap a4 = azcj.m85279a(this.f98857a).mo54626a(a3, a);
            String a5 = azop.m85951a(this.f98857a, a3, a);
            Context context = this.f98857a;
            if (cfeo.m138892w() && a2) {
                str2 = "businessmessaging";
            } else {
                str2 = a.f99775b;
            }
            m85143a(this.f98857a, azop.m85945a(context, a, a4, a5, str2), a, new ArrayList(), false, !z2);
        } else {
            mo54536a(a, true, (String) null);
        }
    }

    /* renamed from: a */
    public final boolean mo54540a(aznz aznz) {
        azdi b;
        cbgn cbgn;
        int b2;
        return aznz.mo55107e() && (b = azdj.m85399a(this.f98857a).mo54722b(aznz.f99781h)) != null && (cbgn = b.f99083i) != null && cbgn.f177052a == 5 && (b2 = cbgl.m127833b(((cbgm) cbgn.f177053b).f177048a)) != 0 && b2 == 3;
    }
}

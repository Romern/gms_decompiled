package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;

/* renamed from: azho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azho {
    /* renamed from: b */
    static synchronized void m85730b(Context context, MessagingService messagingService, String str) {
        synchronized (azho.class) {
            m85731c(context, messagingService, str);
        }
    }

    /* renamed from: c */
    static void m85731c(Context context, MessagingService messagingService, String str) {
        boolean z;
        String str2 = str;
        azcm a = azcm.m85300a(context);
        azox.m85982b();
        if (!a.mo54651a()) {
            a.f98996b = azcl.m85289a(a.f98995a).getReadableDatabase();
        }
        a.f98996b.beginTransaction();
        try {
            Cursor query = a.f98996b.query("conversations", new String[]{"last_notified"}, "conversation_id = ? ", new String[]{str2}, null, null, null);
            long j = -1;
            if (query != null) {
                if (query.moveToFirst()) {
                    j = query.getLong(0);
                }
                query.close();
            }
            Object[] objArr = {str2, Long.valueOf(j)};
            Cursor query2 = a.f98996b.query("messages", new String[]{"_id"}, "conversation_id = ? AND message_type != 'application/business-chat-prompt'  AND (status BETWEEN 1 AND 19) AND error_code = 0 AND _id > ? ", new String[]{str2, Long.toString(j)}, null, null, null, " 1 ");
            if (query2 != null) {
                z = query2.moveToFirst();
                query2.close();
            } else {
                z = false;
            }
            a.f98996b.setTransactionSuccessful();
            if (!z) {
                return;
            }
            if (messagingService == null || !messagingService.mo60380b(str)) {
                azan a2 = azan.m85141a(context);
                aznz a3 = aznz.m85891a(str);
                if (a3 == null || azcd.m85252a(a2.f98857a).mo54619k(a3.f99775b)) {
                    new Object[1][0] = str2;
                    a2.mo54538a(str2);
                }
            }
        } finally {
            a.f98996b.endTransaction();
        }
    }

    /* renamed from: a */
    static bxvd m85725a(String str, SQLiteDatabase sQLiteDatabase, byte[] bArr, aznz aznz, String str2, cbij cbij) {
        azox.m85982b();
        bxvd da = cbgt.f177082e.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        String str3 = "FB";
        if (!aznz.mo55108f()) {
            if (!TextUtils.equals(aznz.f99775b, "BMMerchant")) {
                str3 = null;
            }
        } else if (aznz.f99776c == 3) {
            str3 = cfeo.m138878i();
        }
        if (str3 == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbmo cbmo = cbmo.f177654h;
            ((cbmo) bxvd.f164949b).f177661f = cbmo.f177654h.f177661f;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbmo cbmo2 = cbmo.f177654h;
            str3.getClass();
            ((cbmo) bxvd.f164949b).f177661f = str3;
        }
        bxvd da2 = cbma.f177591f.mo74144da();
        String str4 = aznz.f99779f;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str4.getClass();
        ((cbma) da2.f164949b).f177594b = str4;
        int b = LocalEntityId.m94550b(aznz.f99778e);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbma) da2.f164949b).f177593a = cipg.m150690a(b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        "MS".getClass();
        ((cbma) da2.f164949b).f177595c = "MS";
        cbma cbma = (cbma) da2.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbma.getClass();
        ((cbmo) bxvd.f164949b).f177662g = cbma;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo3 = (cbmo) bxvd.mo74062i();
        cbmo3.getClass();
        ((cbgt) da.f164949b).f177084a = cbmo3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((cbgt) da.f164949b).f177085b = str2;
        if (aznz.mo55105c()) {
            LocalEntityId a2 = azcm.m85302a(sQLiteDatabase, aznz);
            if (a2 == null) {
                azoj.m85933c(str, "Failed to get other participant for %s", aznz);
            } else {
                cbhu a3 = a2.mo60370a();
                if (a3 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a3.getClass();
                    ((cbgt) da.f164949b).f177086c = a3;
                }
            }
        } else {
            bxvd da3 = cbhu.f177185d.mo74144da();
            String str5 = aznz.f99775b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cbhu cbhu = (cbhu) da3.f164949b;
            str5.getClass();
            cbhu.f177189c = str5;
            String str6 = aznz.f99777d;
            str6.getClass();
            cbhu.f177187a = 5;
            cbhu.f177188b = str6;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu2 = (cbhu) da3.mo74062i();
            cbhu2.getClass();
            ((cbgt) da.f164949b).f177086c = cbhu2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbij.getClass();
        ((cbgt) da.f164949b).f177087d = cbij;
        return da;
    }

    /* renamed from: a */
    static void m85726a(Context context, int i) {
        new adzt(context.getMainLooper()).post(new azhn(context, i));
    }

    /* renamed from: a */
    public static void m85727a(Context context, azfo azfo, Exception exc, Intent intent, LocalEntityId localEntityId, azcs azcs) {
        if (m85729a(azfo, exc, azcs, localEntityId)) {
            return;
        }
        if (!azfn.m85585b(context.getApplicationContext())) {
            ScheduledTaskService.m94658a(azfo.f99237a, "gms:matchstick:syncWithoutBind");
        } else if (azfn.m85581a(exc) && intent != null) {
            azfo.mo54875a(intent);
        }
    }

    /* renamed from: a */
    static void m85728a(Context context, MessagingService messagingService, String str) {
        if (!cfeo.f183719a.mo6606a().mo80989aw()) {
            m85731c(context, messagingService, str);
        } else {
            m85730b(context, messagingService, str);
        }
    }

    /* renamed from: a */
    public static boolean m85729a(azfo azfo, Throwable th, azcs azcs, LocalEntityId localEntityId) {
        if (!azfn.m85588c(th)) {
            return false;
        }
        azfo.mo54876a(azcs, localEntityId);
        return true;
    }
}

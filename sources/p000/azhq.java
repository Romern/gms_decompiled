package p000;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhq extends azhc {

    /* renamed from: b */
    private final String f99403b;

    /* renamed from: c */
    private SQLiteDatabase f99404c;

    /* renamed from: d */
    private final aznz f99405d;

    /* renamed from: e */
    private final long f99406e;

    /* renamed from: f */
    private final boolean f99407f;

    /* renamed from: g */
    private final MessagingService f99408g;

    /* renamed from: h */
    private final long f99409h;

    /* renamed from: i */
    private final azfo f99410i;

    /* renamed from: j */
    private final boolean f99411j;

    /* renamed from: k */
    private final LocalEntityId f99412k;

    /* renamed from: l */
    private azcs f99413l;

    public azhq(Context context, azfx azfx, String str, String str2, long j, MessagingService messagingService, azcl azcl, azfo azfo, long j2, boolean z, boolean z2) {
        super(context, azfx, "Send message");
        this.f99403b = str;
        this.f99405d = aznz.m85891a(str2);
        try {
            this.f99404c = azcl.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f99404c = null;
        }
        this.f99409h = j;
        this.f99408g = messagingService;
        this.f99410i = azfo;
        this.f99406e = j2;
        this.f99407f = z;
        this.f99411j = z2;
        this.f99412k = this.f99405d.f99780g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        azph a = azph.m85998a(this.f99339a);
        String str = this.f99403b;
        aznz aznz = this.f99405d;
        a.mo55149a(131, str, aznz.f99781h, aznz, this.f99412k);
        return ((afja) azht.m85748a(this.f99339a).mo54933a(4)).mo34895a(azht.m85748a(this.f99339a).mo54932a(4, this.f99412k), (cbgt) obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04ee  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        cbij cbij;
        Cursor cursor;
        cbim cbim;
        byte[] bArr;
        Cursor cursor2;
        cbip cbip;
        if (this.f99404c == null || this.f99405d == null) {
            return null;
        }
        if (this.f99407f) {
            azcm.m85300a(this.f99339a).mo54647a(this.f99405d, Arrays.asList(this.f99403b), 32, 30, null);
        }
        azdd a = azcm.m85300a(this.f99339a).mo54643a(this.f99403b, this.f99405d.f99774a);
        if (a != null && a.f99056l == 30) {
            LocalEntityId localEntityId = this.f99412k;
            if (!azoy.m85984a(a.f99052h) || !azoy.m85997m(a.f99051g)) {
                cbii cbii = (cbii) cbij.f177251e.mo74144da();
                try {
                    cbil cbil = (cbil) GeneratedMessageLite.m124016a(cbil.f177257h, a.f99050f, bxus.m123744c());
                    if (cbii.f164950c) {
                        cbii.mo74035c();
                        cbii.f164950c = false;
                    }
                    cbij cbij2 = (cbij) cbii.f164949b;
                    cbil.getClass();
                    cbij2.mo75235c();
                    cbij2.f177253a.add(cbil);
                    if (a.f99057m == -2) {
                        bxvd da = cbip.f177281c.mo74144da();
                        cbhu a2 = localEntityId.mo60370a();
                        if (a2 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            a2.getClass();
                            ((cbip) da.f164949b).f177283a = a2;
                        }
                        if (cbii.f164950c) {
                            cbii.mo74035c();
                            cbii.f164950c = false;
                        }
                        cbip cbip2 = (cbip) da.mo74062i();
                        cbip2.getClass();
                        ((cbij) cbii.f164949b).f177255c = cbip2;
                        int i = a.f99055k.f99776c;
                        if (i == 5) {
                            bxvd da2 = cbie.f177232b.mo74144da();
                            bxvd da3 = cbid.f177228c.mo74144da();
                            String str = a.f99055k.f99777d;
                            if (str != null) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                cbid cbid = (cbid) da3.f164949b;
                                str.getClass();
                                cbid.f177230a = 2;
                                cbid.f177231b = str;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cbid cbid2 = (cbid) da3.mo74062i();
                            cbid2.getClass();
                            ((cbie) da2.f164949b).f177234a = cbid2;
                            if (cbii.f164950c) {
                                cbii.mo74035c();
                                cbii.f164950c = false;
                            }
                            cbie cbie = (cbie) da2.mo74062i();
                            cbie.getClass();
                            ((cbij) cbii.f164949b).f177254b = cbie;
                        } else if (i == 6) {
                            bxvd da4 = cbie.f177232b.mo74144da();
                            bxvd da5 = cbid.f177228c.mo74144da();
                            String str2 = a.f99055k.f99777d;
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            cbid cbid3 = (cbid) da5.f164949b;
                            str2.getClass();
                            cbid3.f177230a = 1;
                            cbid3.f177231b = str2;
                            cbid cbid4 = (cbid) da5.mo74062i();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            cbid4.getClass();
                            ((cbie) da4.f164949b).f177234a = cbid4;
                            if (cbii.f164950c) {
                                cbii.mo74035c();
                                cbii.f164950c = false;
                            }
                            cbie cbie2 = (cbie) da4.mo74062i();
                            cbie2.getClass();
                            ((cbij) cbii.f164949b).f177254b = cbie2;
                        }
                        cbij = (cbij) cbii.mo74062i();
                    } else {
                        azoj.m85933c("Message", "Not support converting incoming messages", new Object[0]);
                        cbij = null;
                    }
                } catch (bxwf e) {
                    azoj.m85931a("Message", e, "Failed to parse content to MatchstickMessageContent.", new Object[0]);
                    cbij = null;
                }
            } else {
                cbii cbii2 = (cbii) cbij.f177251e.mo74144da();
                bxvd da6 = cbil.f177257h.mo74144da();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                ((cbil) da6.f164949b).f177261c = cbik.m127887a(3);
                bxvd da7 = cbiv.f177303b.mo74144da();
                String a3 = azpi.m86066a(a.f99050f);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                a3.getClass();
                ((cbiv) da7.f164949b).f177305a = a3;
                cbiv cbiv = (cbiv) da7.mo74062i();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                cbil cbil2 = (cbil) da6.f164949b;
                cbiv.getClass();
                cbil2.f177260b = cbiv;
                cbil2.f177259a = 1;
                if (cbii2.f164950c) {
                    cbii2.mo74035c();
                    cbii2.f164950c = false;
                }
                cbij cbij3 = (cbij) cbii2.f164949b;
                cbil cbil3 = (cbil) da6.mo74062i();
                cbil3.getClass();
                cbij3.mo75235c();
                cbij3.f177253a.add(cbil3);
                if (a.f99057m != -2) {
                    azoj.m85933c("Message", "Not support converting incoming messages", new Object[0]);
                    cbij = null;
                } else {
                    bxvd da8 = cbip.f177281c.mo74144da();
                    cbhu a4 = localEntityId.mo60370a();
                    if (a4 != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        a4.getClass();
                        ((cbip) da8.f164949b).f177283a = a4;
                    }
                    if (cbii2.f164950c) {
                        cbii2.mo74035c();
                        cbii2.f164950c = false;
                    }
                    cbip cbip3 = (cbip) da8.mo74062i();
                    cbip3.getClass();
                    ((cbij) cbii2.f164949b).f177255c = cbip3;
                    int i2 = a.f99055k.f99776c;
                    if (i2 == 5) {
                        bxvd da9 = cbie.f177232b.mo74144da();
                        bxvd da10 = cbid.f177228c.mo74144da();
                        String str3 = a.f99055k.f99777d;
                        if (da10.f164950c) {
                            da10.mo74035c();
                            da10.f164950c = false;
                        }
                        cbid cbid5 = (cbid) da10.f164949b;
                        str3.getClass();
                        cbid5.f177230a = 2;
                        cbid5.f177231b = str3;
                        cbid cbid6 = (cbid) da10.mo74062i();
                        if (da9.f164950c) {
                            da9.mo74035c();
                            da9.f164950c = false;
                        }
                        cbid6.getClass();
                        ((cbie) da9.f164949b).f177234a = cbid6;
                        if (cbii2.f164950c) {
                            cbii2.mo74035c();
                            cbii2.f164950c = false;
                        }
                        cbie cbie3 = (cbie) da9.mo74062i();
                        cbie3.getClass();
                        ((cbij) cbii2.f164949b).f177254b = cbie3;
                    } else if (i2 == 6) {
                        bxvd da11 = cbie.f177232b.mo74144da();
                        bxvd da12 = cbid.f177228c.mo74144da();
                        String str4 = a.f99055k.f99777d;
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        cbid cbid7 = (cbid) da12.f164949b;
                        str4.getClass();
                        cbid7.f177230a = 1;
                        cbid7.f177231b = str4;
                        cbid cbid8 = (cbid) da12.mo74062i();
                        if (da11.f164950c) {
                            da11.mo74035c();
                            da11.f164950c = false;
                        }
                        cbid8.getClass();
                        ((cbie) da11.f164949b).f177234a = cbid8;
                        if (cbii2.f164950c) {
                            cbii2.mo74035c();
                            cbii2.f164950c = false;
                        }
                        cbie cbie4 = (cbie) da11.mo74062i();
                        cbie4.getClass();
                        ((cbij) cbii2.f164949b).f177254b = cbie4;
                    }
                    cbij = (cbij) cbii2.mo74062i();
                }
            }
            bxvd bxvd = (bxvd) cbij.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cbij);
            cbii cbii3 = (cbii) bxvd;
            azcm a5 = azcm.m85300a(this.f99339a);
            aznz aznz = this.f99405d;
            azox.m85982b();
            if (!a5.mo54651a()) {
                a5.f98996b = azcl.m85289a(a5.f98995a).getReadableDatabase();
            }
            a5.f98996b.beginTransaction();
            try {
                Cursor query = a5.f98996b.query("conversations", new String[]{"outgoing_message_properties"}, "conversation_id = ?", new String[]{aznz.f99774a}, null, null, null);
                try {
                    if (query.moveToFirst()) {
                        cbim = (cbim) azol.m85935a((bxxk) cbim.f177266c.mo74142c(7), query.getBlob(0));
                        if (query != null) {
                            query.close();
                        }
                        a5.f98996b.setTransactionSuccessful();
                        a5.f98996b.endTransaction();
                    } else {
                        if (query != null) {
                            query.close();
                        }
                        a5.f98996b.setTransactionSuccessful();
                        a5.f98996b.endTransaction();
                        cbim = null;
                    }
                    if (cbim != null) {
                        if (cbii3.f164950c) {
                            cbii3.mo74035c();
                            cbii3.f164950c = false;
                        }
                        cbim.getClass();
                        ((cbij) cbii3.f164949b).f177256d = cbim;
                    }
                    azcs a6 = azcv.m85357a(this.f99339a).mo54689a(this.f99412k);
                    this.f99413l = a6;
                    SQLiteDatabase sQLiteDatabase = this.f99404c;
                    if (a6 != null) {
                        bArr = a6.f99002a;
                    } else {
                        bArr = null;
                    }
                    bxvd a7 = azho.m85725a("SendMatchstickMH", sQLiteDatabase, bArr, this.f99405d, a.f99046b, (cbij) cbii3.mo74062i());
                    azcs azcs = this.f99413l;
                    if (azcs != null && azcs.mo54687a()) {
                        azcm a8 = azcm.m85300a(this.f99339a);
                        aznz aznz2 = this.f99405d;
                        azox.m85982b();
                        if (!a8.mo54651a()) {
                            a8.f98996b = azcl.m85289a(a8.f98995a).getReadableDatabase();
                        }
                        a8.f98996b.beginTransaction();
                        try {
                            Cursor query2 = a8.f98996b.query("conversations", new String[]{"sender_properties"}, "conversation_id = ? ", new String[]{aznz2.f99774a}, null, null, null);
                            try {
                                if (query2.moveToFirst()) {
                                    cbip cbip4 = (cbip) azol.m85935a((bxxk) cbip.f177281c.mo74142c(7), query2.getBlob(0));
                                    if (query2 != null) {
                                        query2.close();
                                    }
                                    a8.f98996b.setTransactionSuccessful();
                                    a8.f98996b.endTransaction();
                                    cbip = cbip4;
                                } else {
                                    if (query2 != null) {
                                        query2.close();
                                    }
                                    a8.f98996b.setTransactionSuccessful();
                                    a8.f98996b.endTransaction();
                                    cbip = null;
                                }
                                if (cbip != null) {
                                    cbij cbij4 = ((cbgt) a7.f164949b).f177087d;
                                    if (cbij4 == null) {
                                        cbij4 = cbij.f177251e;
                                    }
                                    bxvd bxvd2 = (bxvd) cbij4.mo74142c(5);
                                    bxvd2.mo73625a((GeneratedMessageLite) cbij4);
                                    cbii cbii4 = (cbii) bxvd2;
                                    if (cbii4.f164950c) {
                                        cbii4.mo74035c();
                                        cbii4.f164950c = false;
                                    }
                                    cbip.getClass();
                                    ((cbij) cbii4.f164949b).f177255c = cbip;
                                    if (a7.f164950c) {
                                        a7.mo74035c();
                                        a7.f164950c = false;
                                    }
                                    cbij cbij5 = (cbij) cbii4.mo74062i();
                                    cbgt cbgt = cbgt.f177082e;
                                    cbij5.getClass();
                                    ((cbgt) a7.f164949b).f177087d = cbij5;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query2;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                a8.f98996b.setTransactionSuccessful();
                                a8.f98996b.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = null;
                            if (cursor2 != null) {
                            }
                            a8.f98996b.setTransactionSuccessful();
                            a8.f98996b.endTransaction();
                            throw th;
                        }
                    }
                    cbgt cbgt2 = (cbgt) a7.mo74062i();
                    new Object[1][0] = cbgt2;
                    return cbgt2;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    a5.f98996b.setTransactionSuccessful();
                    a5.f98996b.endTransaction();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                if (cursor != null) {
                }
                a5.f98996b.setTransactionSuccessful();
                a5.f98996b.endTransaction();
                throw th;
            }
        } else {
            azoj.m85932b("SendMatchstickMH", "No message found to send", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgt cbgt = (cbgt) obj;
        azoj.m85931a("SendMatchstickMH", exc, "Error sending rpc", new Object[0]);
        azph.m85998a(this.f99339a).mo55155a(123, exc, this.f99405d);
        azho.m85727a(this.f99339a, this.f99410i, exc, (Intent) null, this.f99412k, this.f99413l);
        if (SystemClock.elapsedRealtime() > this.f99406e) {
            azcm.m85300a(this.f99339a).mo54647a(this.f99405d, Collections.singletonList(this.f99403b), 30, 32, azph.m85998a(this.f99339a));
            if (!this.f99408g.mo60380b(this.f99405d.f99774a)) {
                azan a = azan.m85141a(this.f99339a);
                String str = this.f99405d.f99774a;
                String str2 = this.f99403b;
                azox.m85982b();
                aznz a2 = aznz.m85891a(str);
                if (a2 == null) {
                    azoj.m85933c("NotificationManager", "Invalid conversation id format:%s", str);
                    return;
                }
                boolean a3 = a.mo54540a(a2);
                List a4 = azop.m85952a(a.f98857a, azcl.m85289a(a.f98857a).getReadableDatabase(), a2);
                azam a5 = azop.m85946a(a.f98857a, a2, str2, azcj.m85279a(a.f98857a).mo54626a(a4, a2), azop.m85951a(a.f98857a, a4, a2), (cfeo.m138892w() && a3) ? "businessmessaging" : a2.f99775b);
                if (a5 != null) {
                    Notification build = azan.m85140a(a.f98857a, a5).build();
                    sey sey = a.f98858b;
                    String str3 = a2.f99774a;
                    int i = azpi.f99824a;
                    sey.mo25459a(str3, 1, build);
                    return;
                }
                return;
            }
            return;
        }
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.send_matchstick_msg");
        intent.setClassName(this.f99339a, "com.google.android.gms.matchstick.net.MessagingService");
        intent.putExtra("inbox_msg_id", this.f99403b);
        intent.putExtra("conversation_id", this.f99405d.f99774a);
        intent.putExtra("retry_deadline", this.f99406e);
        this.f99410i.mo54874a(this.f99403b.hashCode(), intent, this.f99409h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        azcm a;
        cbgt cbgt = (cbgt) obj;
        cbgu cbgu = (cbgu) obj2;
        try {
            a = azcm.m85300a(this.f99339a);
            aznz aznz = this.f99405d;
            String str = this.f99403b;
            long j = cbgu.f177090a;
            a.f98996b.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 31);
            if (j <= 0) {
                j = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                azph.m85998a(a.f98995a).mo55131a(27, 3, str, aznz);
            }
            contentValues.put("server_timestamp_ms", Long.valueOf(j));
            Object[] objArr = {Integer.valueOf(a.f98996b.update("messages", contentValues, "message_id == ? AND status == ?", new String[]{str, Integer.toString(30)})), 31};
            int a2 = azcm.m85299a(31);
            if (a2 != 2) {
                azph.m85998a(a.f98995a).mo55131a(a2, 3, str, aznz);
            }
            a.f98996b.setTransactionSuccessful();
            a.f98996b.endTransaction();
            this.f99339a.getContentResolver().notifyChange(DatabaseProvider.m94534b(this.f99405d.f99774a), null);
        } catch (SQLiteException e) {
        } catch (Throwable th) {
            a.f98996b.setTransactionSuccessful();
            a.f98996b.endTransaction();
            throw th;
        }
        if (this.f99411j) {
            azho.m85726a(this.f99339a, C0126R.string.message_sent_text);
        }
        if (this.f99405d.f99776c == 3) {
            azph a3 = azph.m85998a(this.f99339a);
            String str2 = this.f99403b;
            aznz aznz2 = this.f99405d;
            a3.mo55132a(356, 3, str2, aznz2.f99781h, aznz2);
        }
    }
}

package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhi extends azhc {

    /* renamed from: b */
    private final long f99370b;

    /* renamed from: c */
    private final String f99371c;

    /* renamed from: d */
    private final int f99372d;

    /* renamed from: e */
    private final String f99373e;

    /* renamed from: f */
    private final boolean f99374f;

    /* renamed from: g */
    private final azfo f99375g;

    /* renamed from: h */
    private final MessagingService f99376h;

    /* renamed from: i */
    private SQLiteDatabase f99377i;

    /* renamed from: j */
    private cbgq f99378j;

    /* renamed from: k */
    private LocalEntityId f99379k;

    /* renamed from: l */
    private azcs f99380l;

    public azhi(Context context, LocalEntityId localEntityId, azfx azfx, azfo azfo, long j, String str, MessagingService messagingService, azcl azcl, int i, String str2, boolean z) {
        super(context, azfx, "get profile");
        this.f99370b = j;
        this.f99371c = str;
        this.f99372d = i;
        this.f99373e = str2;
        this.f99374f = z;
        this.f99376h = messagingService;
        try {
            this.f99377i = azcl.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f99377i = null;
        }
        this.f99375g = azfo;
        this.f99379k = localEntityId;
    }

    /* renamed from: a */
    private final void m85702a(boolean z, String str) {
        aznz a = aznz.m85891a(str);
        if (a != null) {
            if (a.mo55105c() || z) {
                this.f99339a.getContentResolver().notifyChange(DatabaseProvider.m94517a(a), null);
            }
            if (a.mo55104b() && !z) {
                this.f99339a.getContentResolver().notifyChange(DatabaseProvider.m94532b(a), null);
            }
        }
        azho.m85728a(this.f99339a, this.f99376h, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azhi.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      azhi.a(java.lang.Object, java.lang.Exception):void
      azhi.a(java.lang.Object, java.lang.Object):void
      azhc.a(java.lang.Object, java.lang.Exception):void
      azhc.a(java.lang.Object, java.lang.Object):void
      azhi.a(boolean, java.lang.String):void */
    /* renamed from: c */
    private final void m85703c() {
        if (this.f99370b != -1) {
            this.f99339a.getContentResolver().notifyChange(DatabaseProvider.m94516a(this.f99370b), null);
            azcj a = azcj.m85279a(this.f99339a);
            LocalEntityId localEntityId = new LocalEntityId(this.f99371c, this.f99372d, this.f99373e);
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.avatar_update_notified");
            intent.setPackage(a.f98977b.getPackageName());
            intent.putExtra("local_entity_id_extra", localEntityId);
            a.f98977b.sendBroadcast(intent);
            if (this.f99374f) {
                int i = this.f99372d;
                if (i == 1 || i == 3 || i == 7 || i == 4) {
                    List b = azdj.m85399a(this.f99339a).mo54723b(this.f99370b);
                    int size = b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = (String) b.get(i2);
                        new Object[1][0] = str;
                        m85702a(false, str);
                    }
                } else if (i == 2 || i == 6) {
                    new Object[1][0] = this.f99371c;
                    List c = azdj.m85399a(this.f99339a).mo54724c(new LocalEntityId(this.f99371c, this.f99372d, this.f99373e));
                    int size2 = c.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        m85702a(true, (String) c.get(i3));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        boolean z;
        int i;
        if (this.f99377i == null) {
            return null;
        }
        bxvd da = cbgq.f177072c.mo74144da();
        if ("FB".equals(this.f99373e) || this.f99372d != 6) {
            z = false;
        } else {
            z = true;
        }
        String str = this.f99371c;
        if (!z) {
            i = this.f99372d;
        } else {
            i = 2;
        }
        cbhu a = LocalEntityId.m94548a(str, i, this.f99373e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbgq) da.f164949b).f177075b = a;
        if (this.f99379k == null) {
            if (this.f99372d != 2 && !z) {
                this.f99379k = azcv.m85357a(this.f99339a).mo54700c();
            } else {
                List c = azdj.m85399a(this.f99339a).mo54724c(new LocalEntityId(this.f99371c, this.f99372d, this.f99373e));
                int size = c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    LocalEntityId localEntityId = aznz.m85891a((String) c.get(i2)).f99780g;
                    i2++;
                    if (azcv.m85357a(this.f99339a).mo54689a(localEntityId) != null) {
                        this.f99379k = localEntityId;
                        break;
                    }
                }
                Object[] objArr = {this.f99379k, this.f99371c};
            }
        }
        this.f99380l = azcv.m85357a(this.f99339a).mo54689a(this.f99379k);
        bxvd a2 = azfn.m85571a(this.f99339a, this.f99379k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) a2.mo74062i();
        cbmo.getClass();
        ((cbgq) da.f164949b).f177074a = cbmo;
        cbgq cbgq = (cbgq) da.mo74062i();
        this.f99378j = cbgq;
        new Object[1][0] = cbgq.toString();
        azph.m85998a(this.f99339a).mo55143a(140, this.f99379k, this.f99373e);
        return this.f99378j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final cbhu mo54925a(List list) {
        String str;
        String a = azdl.m85412a(this.f99339a).mo54738a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cbhu cbhu = (cbhu) list.get(i);
            if (cbhu.f177187a == 2) {
                str = (String) cbhu.f177188b;
            } else {
                str = "";
            }
            if ((TextUtils.isEmpty(str) || !str.equals(a)) && azny.m85887b(this.f99339a, LocalEntityId.m94549a(cbhu))) {
                return cbhu;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgq cbgq = (cbgq) obj;
        afja afja = (afja) azht.m85748a(this.f99339a).mo54933a(4);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(4, this.f99379k);
        if (afja.f64280d == null) {
            afja.f64280d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Matchstick/GetEntityProfile", ciie.m150370a(cbgq.f177072c), ciie.m150370a(cbgr.f177076b));
        }
        return (cbgr) afja.f64284a.mo25553a(afja.f64280d, a, cbgq, (long) afja.f64278b, TimeUnit.MILLISECONDS);
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
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgq cbgq = (cbgq) obj;
        azph.m85998a(this.f99339a).mo55156a(141, exc, this.f99373e);
        ContentValues contentValues = new ContentValues();
        if (!(exc instanceof chuw) || ((chuw) exc).f189236a.f189233s != chus.NOT_FOUND) {
            azoj.m85931a("GetEntityProfileH", exc, "GetProfile error", new Object[0]);
            contentValues.put("status", (Integer) 0);
        } else {
            contentValues.put("last_sync_timestamp", Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
            contentValues.put("status", (Integer) 2);
            azoj.m85932b("GetEntityProfileH", "Profile not found", new Object[0]);
        }
        azdj.m85399a(this.f99339a).mo54718a(this.f99370b, contentValues);
        azho.m85727a(this.f99339a, this.f99375g, exc, (Intent) null, this.f99379k, this.f99380l);
        m85703c();
    }

    /* JADX INFO: finally extract failed */
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
        cbgm cbgm;
        int i;
        List list;
        LocalEntityId localEntityId;
        cbgs cbgs;
        LocalEntityId localEntityId2;
        cbgs cbgs2;
        cbgs cbgs3;
        cbgs cbgs4;
        cbgs cbgs5;
        String str;
        cbgq cbgq = (cbgq) obj;
        cbgr cbgr = (cbgr) obj2;
        int i2 = 1;
        int i3 = 0;
        new Object[1][0] = cbgr;
        ContentValues contentValues = new ContentValues();
        cbgn cbgn = cbgr.f177078a;
        if (cbgn == null) {
            Object[] objArr = {this.f99371c, this.f99373e};
        } else {
            contentValues.put("data", cbgn.serializeToBytes());
            cbgn cbgn2 = cbgr.f177078a;
            if (cbgn2 == null) {
                cbgn2 = cbgn.f177050e;
            }
            if (!cbgn2.f177054c.isEmpty()) {
                cbgn cbgn3 = cbgr.f177078a;
                if (cbgn3 == null) {
                    cbgn3 = cbgn.f177050e;
                }
                contentValues.put("profile_name", cbgn3.f177054c);
            }
            cbgn cbgn4 = cbgr.f177078a;
            if (cbgn4 == null) {
                cbgn4 = cbgn.f177050e;
            }
            int i4 = 4;
            if (cbgn4.f177052a == 4 && ((i = this.f99372d) == 2 || i == 6)) {
                List c = azdj.m85399a(this.f99339a).mo54724c(new LocalEntityId(this.f99371c, this.f99372d, this.f99373e));
                int size = c.size();
                int i5 = 0;
                while (i5 < size) {
                    aznz a = aznz.m85891a((String) c.get(i5));
                    cbgn cbgn5 = cbgr.f177078a;
                    if (cbgn5 == null) {
                        cbgn5 = cbgn.f177050e;
                    }
                    if (cbgn5.f177052a != i4) {
                        list = c;
                    } else {
                        SQLiteDatabase sQLiteDatabase = this.f99377i;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.beginTransaction();
                            try {
                                HashSet hashSet = new HashSet();
                                Cursor b = azcm.m85307b(this.f99377i, a.f99774a);
                                if (b == null) {
                                    this.f99377i.setTransactionSuccessful();
                                    this.f99377i.endTransaction();
                                    list = c;
                                } else {
                                    if (b.moveToFirst()) {
                                        if (b.getInt(i2) == i2 || b.getInt(i2) == 7) {
                                            localEntityId = new LocalEntityId(b.getString(i3), b.getInt(i2), a.f99775b);
                                        } else {
                                            localEntityId = null;
                                        }
                                        while (true) {
                                            hashSet.add(new LocalEntityId(b.getString(i3), b.getInt(i2), a.f99775b));
                                            if (!b.moveToNext()) {
                                                break;
                                            }
                                            i2 = 1;
                                        }
                                    } else {
                                        localEntityId = null;
                                    }
                                    b.close();
                                    if (hashSet.isEmpty()) {
                                        if (cbgn5.f177052a == 4) {
                                            cbgs3 = (cbgs) cbgn5.f177053b;
                                        } else {
                                            cbgs3 = cbgs.f177079b;
                                        }
                                        cbhu a2 = mo54925a((List) cbgs3.f177081a);
                                        String str2 = "";
                                        if (a2 == null) {
                                            if (cbgn5.f177052a == 4) {
                                                cbgs5 = (cbgs) cbgn5.f177053b;
                                            } else {
                                                cbgs5 = cbgs.f177079b;
                                            }
                                            bxwc bxwc = cbgs5.f177081a;
                                            String a3 = azdl.m85412a(this.f99339a).mo54738a();
                                            Iterator it = bxwc.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    list = c;
                                                    a2 = (cbhu) bxwc.get(0);
                                                    break;
                                                }
                                                cbhu cbhu = (cbhu) it.next();
                                                list = c;
                                                if (cbhu.f177187a == 2) {
                                                    str = (String) cbhu.f177188b;
                                                } else {
                                                    str = str2;
                                                }
                                                if (!TextUtils.isEmpty(str) && !str.equals(a3)) {
                                                    a2 = cbhu;
                                                    break;
                                                }
                                                c = list;
                                            }
                                        } else {
                                            list = c;
                                        }
                                        Object[] objArr2 = new Object[1];
                                        if (a2.f177187a == 2) {
                                            str2 = (String) a2.f177188b;
                                        }
                                        objArr2[0] = str2;
                                        LocalEntityId a4 = LocalEntityId.m94549a(a2);
                                        azcm.m85304a(this.f99377i, a.f99774a, a4.f111074a, a4.f111075b);
                                        hashSet.add(a4);
                                        azph a5 = azph.m85998a(this.f99339a);
                                        if (cbgn5.f177052a == 4) {
                                            cbgs4 = (cbgs) cbgn5.f177053b;
                                        } else {
                                            cbgs4 = cbgs.f177079b;
                                        }
                                        a5.mo55160a("Matchstick.Conversation.GroupSize", cbgs4.f177081a.size());
                                    } else {
                                        list = c;
                                    }
                                    if (cbgn5.f177052a == 4) {
                                        cbgs = (cbgs) cbgn5.f177053b;
                                    } else {
                                        cbgs = cbgs.f177079b;
                                    }
                                    for (cbhu cbhu2 : cbgs.f177081a) {
                                        LocalEntityId a6 = LocalEntityId.m94549a(cbhu2);
                                        if (!hashSet.contains(a6)) {
                                            azcm.m85304a(this.f99377i, a.f99774a, a6.f111074a, a6.f111075b);
                                            new Object[1][0] = a6;
                                        }
                                        hashSet.remove(a6);
                                    }
                                    if (localEntityId == null || !hashSet.contains(localEntityId)) {
                                        localEntityId2 = null;
                                    } else {
                                        if (cbgn5.f177052a == 4) {
                                            cbgs2 = (cbgs) cbgn5.f177053b;
                                        } else {
                                            cbgs2 = cbgs.f177079b;
                                        }
                                        cbhu a7 = mo54925a((List) cbgs2.f177081a);
                                        if (a7 != null) {
                                            hashSet.remove(localEntityId);
                                            localEntityId2 = LocalEntityId.m94549a(a7);
                                            hashSet.add(localEntityId2);
                                        } else {
                                            localEntityId2 = null;
                                        }
                                    }
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        LocalEntityId localEntityId3 = (LocalEntityId) it2.next();
                                        this.f99377i.delete("conversationParticipants", "conv_id = ? AND participant_id= ? AND participant_type = ? ", new String[]{a.f99774a, localEntityId3.f111074a, Integer.toString(localEntityId3.f111075b)});
                                        new Object[1][0] = localEntityId3;
                                    }
                                    if (localEntityId2 != null) {
                                        if (localEntityId != null) {
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("participant_id", localEntityId2.f111074a);
                                            this.f99377i.update("conversationParticipants", contentValues2, "conv_id = ? AND participant_id = ? AND participant_type = ? ", new String[]{a.f99774a, localEntityId.f111074a, Integer.toString(localEntityId.f111075b)});
                                        }
                                    }
                                    this.f99377i.setTransactionSuccessful();
                                    this.f99377i.endTransaction();
                                }
                            } catch (Throwable th) {
                                this.f99377i.setTransactionSuccessful();
                                this.f99377i.endTransaction();
                                throw th;
                            }
                        } else {
                            list = c;
                        }
                    }
                    i5++;
                    c = list;
                    i2 = 1;
                    i3 = 0;
                    i4 = 4;
                }
            }
            cbgn cbgn6 = cbgr.f177078a;
            if (cbgn6 == null) {
                cbgn6 = cbgn.f177050e;
            }
            if (cbgn6.f177052a == 5) {
                cbgn cbgn7 = cbgr.f177078a;
                if (cbgn7 == null) {
                    cbgn7 = cbgn.f177050e;
                }
                if (cbgn7.f177052a == 5) {
                    cbgm = (cbgm) cbgn7.f177053b;
                } else {
                    cbgm = cbgm.f177046c;
                }
                int b2 = cbgl.m127833b(cbgm.f177048a);
                if (b2 != 0 && b2 == 3) {
                    Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.GET_OR_SYNC_APP_METADATA");
                    intent.putExtra("server_app_id", "businessmessaging");
                    MessagingService.m94557b(intent, this.f99339a);
                }
            }
        }
        contentValues.put("status", (Integer) 2);
        contentValues.put("last_sync_timestamp", Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
        new Object[1][0] = contentValues;
        azdj.m85399a(this.f99339a).mo54718a(this.f99370b, contentValues);
        azph.m85998a(this.f99339a).mo55143a(139, this.f99379k, this.f99373e);
        m85703c();
    }
}

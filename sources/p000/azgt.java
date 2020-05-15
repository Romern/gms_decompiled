package p000;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: azgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgt extends azgx {

    /* renamed from: a */
    private final azdj f99306a;

    /* renamed from: g */
    private final Context f99307g;

    /* renamed from: h */
    private final String f99308h;

    /* renamed from: i */
    private boolean f99309i;

    /* renamed from: j */
    private final azet f99310j;

    /* renamed from: k */
    private final azcd f99311k;

    /* renamed from: l */
    private final int f99312l;

    public azgt(cbkj cbkj, Context context, azdj azdj, azet azet, azcd azcd) {
        super(cbkj);
        this.f99306a = azdj;
        this.f99307g = context;
        cbma cbma = cbkj.f177414h;
        this.f99308h = (cbma == null ? cbma.f177591f : cbma).f177594b;
        cbma cbma2 = cbkj.f177414h;
        int b = cipg.m150691b((cbma2 == null ? cbma.f177591f : cbma2).f177593a);
        this.f99312l = b == 0 ? 1 : b;
        this.f99310j = azet;
        this.f99311k = azcd;
    }

    /* renamed from: a */
    static byte[] m85626a(List list, String str) {
        bxvd da = cbgs.f177079b.mo74144da();
        aznz a = aznz.m85891a(str);
        ArrayList arrayList = new ArrayList();
        String str2 = a.f99775b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cbma cbma = (cbma) list.get(i);
                bxvd da2 = cbhu.f177185d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str2.getClass();
                ((cbhu) da2.f164949b).f177189c = str2;
                int b = cipg.m150691b(cbma.f177593a);
                if (b != 0 && b == 3) {
                    String str3 = cbma.f177594b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cbhu cbhu = (cbhu) da2.f164949b;
                    str3.getClass();
                    cbhu.f177187a = 2;
                    cbhu.f177188b = str3;
                    arrayList.add((cbhu) da2.mo74062i());
                } else {
                    int b2 = cipg.m150691b(cbma.f177593a);
                    if (b2 != 0 && b2 == 18) {
                        String str4 = cbma.f177594b;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cbhu cbhu2 = (cbhu) da2.f164949b;
                        str4.getClass();
                        cbhu2.f177187a = 6;
                        cbhu2.f177188b = str4;
                        arrayList.add((cbhu) da2.mo74062i());
                    } else {
                        Object[] objArr = new Object[2];
                        int b3 = cipg.m150691b(cbma.f177593a);
                        if (b3 == 0) {
                            b3 = 1;
                        }
                        objArr[0] = Integer.valueOf(cipg.m150690a(b3));
                        objArr[1] = cbma.f177594b;
                        azoj.m85932b("GroupMsgHandler", "Unsupported entity added to group entityType: %s, entityId: %s", objArr);
                    }
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbgs cbgs = (cbgs) da.f164949b;
            if (!cbgs.f177081a.mo73666a()) {
                cbgs.f177081a = bxvk.m124021a(cbgs.f177081a);
            }
            bxsy.m123078a(arrayList, cbgs.f177081a);
        }
        return ((cbgs) da.mo74062i()).mo73642k();
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
    /* renamed from: b */
    public final azdd mo54862b() {
        String str;
        byte[] bArr;
        long j;
        int i;
        cbmw cbmw;
        cbmt cbmt;
        cbmz cbmz;
        boolean z;
        int b;
        int b2;
        cbkg cbkg = (cbkg) this.f99326c;
        if (cbkg != null) {
            String str2 = this.f99325b;
            if (!this.f99311k.mo54605a(this.f99328e.f99775b)) {
                azoj.m85933c("GroupMsgHandler", "Message from unsupported app %s", this.f99328e.f99775b);
                this.f99310j.mo54843a(Collections.singletonList(str2));
                return null;
            } else if (this.f99311k.mo54608b(this.f99328e.f99775b) == -1) {
                azoj.m85933c("GroupMsgHandler", "Failed to get app data %s", this.f99328e.f99775b);
                this.f99310j.mo54843a(Collections.singletonList(str2));
                return null;
            } else {
                this.f99309i = false;
                if (cbkg.f177402a == 107) {
                    bxwc bxwc = ((cbmz) cbkg.f177403b).f177705c;
                    int size = bxwc.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        cbma cbma = (cbma) bxwc.get(i2);
                        if (TextUtils.isEmpty(this.f99308h) || (((b = cipg.m150691b(cbma.f177593a)) == 0 || b != 3) && ((b2 = cipg.m150691b(cbma.f177593a)) == 0 || b2 != 18))) {
                            z = false;
                        } else {
                            z = this.f99308h.equals(cbma.f177594b);
                        }
                        i2++;
                        if (z) {
                            this.f99309i = true;
                            break;
                        }
                    }
                }
                LocalEntityId localEntityId = this.f99328e.f99781h;
                if (!this.f99309i) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", (Integer) 0);
                    this.f99306a.mo54720a(localEntityId, contentValues);
                    this.f99306a.mo54716a(localEntityId, this.f99328e.f99780g);
                }
                int a = cbkf.m127933a(cbkg.f177404c);
                if (a == 0) {
                    a = 1;
                }
                int i3 = a - 2;
                if (i3 == 5) {
                    if (cbkg.f177402a == 105) {
                        cbmw = (cbmw) cbkg.f177403b;
                    } else {
                        cbmw = cbmw.f177688c;
                    }
                    cbmx cbmx = cbmw.f177691b;
                    if (cbmx == null) {
                        cbmx = cbmx.f177692e;
                    }
                    bArr = m85626a(cbmx.f177696c, this.f99328e.f99774a);
                    str = "group/create-group";
                } else if (i3 == 6) {
                    if (cbkg.f177402a == 106) {
                        cbmt = (cbmt) cbkg.f177403b;
                    } else {
                        cbmt = cbmt.f177676d;
                    }
                    bArr = m85626a(cbmt.f177680c, this.f99328e.f99774a);
                    str = "group/add-group-users";
                } else if (i3 != 7) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f99310j.mo54843a(Collections.singletonList(str2));
                    }
                    return null;
                } else {
                    if (cbkg.f177402a == 107) {
                        cbmz = (cbmz) cbkg.f177403b;
                    } else {
                        cbmz = cbmz.f177701d;
                    }
                    bArr = m85626a(cbmz.f177705c, this.f99328e.f99774a);
                    str = "group/kick-group-users";
                }
                LocalEntityId localEntityId2 = this.f99327d;
                if (!TextUtils.isEmpty(this.f99308h) && (((i = localEntityId2.f111075b) == 1 || i == 7) && this.f99308h.equals(localEntityId2.f111074a))) {
                    j = -2;
                } else {
                    j = this.f99306a.mo54716a(this.f99327d, this.f99328e.f99780g);
                }
                azdb azdb = new azdb();
                azdb.f99027a = this.f99325b;
                azdb.f99036j = this.f99328e.f99774a;
                azdb.f99031e = j;
                LocalEntityId localEntityId3 = this.f99327d;
                azdb.f99028b = localEntityId3.f111074a;
                azdb.f99029c = localEntityId3.f111075b;
                azdb.f99034h = str;
                azdb.f99032f = bArr;
                azdb.f99033g = "proto/GroupProfileInfo";
                long j2 = this.f99329f;
                azdb.f99030d = j2;
                azdb.f99037k = 20;
                azdb.f99035i = j2;
                return azdb.mo54711a();
            }
        } else {
            azoj.m85932b("GroupMsgHandler", "GroupMessage trying to be added to DB was null", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo54863c() {
        azoj.m85933c("GroupMsgHandler", "Failed to save group Message", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        cbmv cbmv;
        cbmv cbmv2;
        cbmx cbmx;
        cbmx cbmx2;
        cbmx cbmx3;
        cbkg cbkg = (cbkg) bxxc;
        int a = cbkf.m127933a(cbkg.f177404c);
        if (a != 0 && a == 8 && cbkg.f177402a == 106 && (cbmx3 = ((cbmt) cbkg.f177403b).f177679b) != null) {
            cbma cbma = cbmx3.f177694a;
            if (cbma == null) {
                cbma = cbma.f177591f;
            }
            cbma cbma2 = cbkj.f177414h;
            if (cbma2 == null) {
                cbma2 = cbma.f177591f;
            }
            return aznz.m85890a(cbma, cbma2);
        }
        int a2 = cbkf.m127933a(cbkg.f177404c);
        if (a2 != 0 && a2 == 7 && cbkg.f177402a == 105 && (cbmx2 = ((cbmw) cbkg.f177403b).f177691b) != null) {
            cbma cbma3 = cbmx2.f177694a;
            if (cbma3 == null) {
                cbma3 = cbma.f177591f;
            }
            cbma cbma4 = cbkj.f177414h;
            if (cbma4 == null) {
                cbma4 = cbma.f177591f;
            }
            return aznz.m85890a(cbma3, cbma4);
        }
        int a3 = cbkf.m127933a(cbkg.f177404c);
        if (a3 != 0 && a3 == 9 && cbkg.f177402a == 107 && (cbmx = ((cbmz) cbkg.f177403b).f177704b) != null) {
            cbma cbma5 = cbmx.f177694a;
            if (cbma5 == null) {
                cbma5 = cbma.f177591f;
            }
            cbma cbma6 = cbkj.f177414h;
            if (cbma6 == null) {
                cbma6 = cbma.f177591f;
            }
            return aznz.m85890a(cbma5, cbma6);
        }
        if (cbkg.f177402a == 108) {
            cbmv = (cbmv) cbkg.f177403b;
        } else {
            cbmv = cbmv.f177683d;
        }
        if (cbmv.f177686b == null) {
            return null;
        }
        if (cbkg.f177402a == 108) {
            cbmv2 = (cbmv) cbkg.f177403b;
        } else {
            cbmv2 = cbmv.f177683d;
        }
        cbmx cbmx4 = cbmv2.f177686b;
        if (cbmx4 == null) {
            cbmx4 = cbmx.f177692e;
        }
        cbma cbma7 = cbmx4.f177694a;
        if (cbma7 == null) {
            cbma7 = cbma.f177591f;
        }
        cbma cbma8 = cbkj.f177414h;
        if (cbma8 == null) {
            cbma8 = cbma.f177591f;
        }
        return aznz.m85890a(cbma7, cbma8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        return (cbkg) azol.m85935a((bxxk) cbkg.f177400d.mo74142c(7), cbkj.f177411e.mo73780k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cbmw cbmw;
        cbmt cbmt;
        cbmz cbmz;
        cbmv cbmv;
        cbkg cbkg = (cbkg) bxxc;
        int a = cbkf.m127933a(cbkg.f177404c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 5) {
            if (cbkg.f177402a == 105) {
                cbmw = (cbmw) cbkg.f177403b;
            } else {
                cbmw = cbmw.f177688c;
            }
            cbma cbma = cbmw.f177690a;
            if (cbma == null) {
                cbma = cbma.f177591f;
            }
            return LocalEntityId.m94551b(cbma);
        } else if (i == 6) {
            if (cbkg.f177402a == 106) {
                cbmt = (cbmt) cbkg.f177403b;
            } else {
                cbmt = cbmt.f177676d;
            }
            cbma cbma2 = cbmt.f177678a;
            if (cbma2 == null) {
                cbma2 = cbma.f177591f;
            }
            return LocalEntityId.m94551b(cbma2);
        } else if (i == 7) {
            if (cbkg.f177402a == 107) {
                cbmz = (cbmz) cbkg.f177403b;
            } else {
                cbmz = cbmz.f177701d;
            }
            cbma cbma3 = cbmz.f177703a;
            if (cbma3 == null) {
                cbma3 = cbma.f177591f;
            }
            return LocalEntityId.m94551b(cbma3);
        } else if (i != 8) {
            return null;
        } else {
            if (cbkg.f177402a == 108) {
                cbmv = (cbmv) cbkg.f177403b;
            } else {
                cbmv = cbmv.f177683d;
            }
            cbma cbma4 = cbmv.f177685a;
            if (cbma4 == null) {
                cbma4 = cbma.f177591f;
            }
            return LocalEntityId.m94551b(cbma4);
        }
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
    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
        this.f99307g.getContentResolver().notifyChange(DatabaseProvider.m94534b(this.f99328e.f99774a), null);
        if (this.f99309i) {
            azcm a = azcm.m85300a(this.f99307g);
            aznz aznz = this.f99328e;
            String str = aznz.f99774a;
            cbma[] cbmaArr = {azfn.m85573a(this.f99308h, this.f99312l, aznz.f99775b)};
            if (!a.mo54658b()) {
                azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            } else {
                a.f98996b.beginTransaction();
                try {
                    cbma cbma = cbmaArr[0];
                    a.f98996b.delete("conversationParticipants", "conv_id = ? AND participant_id = ? AND participant_type = ?", new String[]{str, cbma.f177594b, Integer.toString(LocalEntityId.m94547a(cbma))});
                    a.f98996b.setTransactionSuccessful();
                } finally {
                    a.f98996b.endTransaction();
                }
            }
            azcm.m85300a(this.f99307g).mo54673j(this.f99328e.f99774a);
            azan.m85141a(this.f99307g).mo54543c(this.f99328e.f99774a);
        }
        this.f99310j.mo54843a(Collections.singletonList(this.f99325b));
        azcm a2 = azcm.m85300a(this.f99307g);
        String str2 = this.f99328e.f99774a;
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        if (!a2.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        a2.f98996b.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 21);
            Object[] objArr = {Integer.valueOf(a2.f98996b.update("messages", contentValues, "conversation_id= ? AND status = ? AND server_timestamp_ms <= ? ", new String[]{str2, Integer.toString(20), Long.toString(currentTimeMillis)})), Long.valueOf(currentTimeMillis)};
            a2.f98996b.setTransactionSuccessful();
        } finally {
            a2.f98996b.endTransaction();
        }
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        aznz aznz;
        int i = ((cbkg) this.f99326c).f177402a;
        return (i == 105 || i == 106 || i == 107 || i == 108) && (aznz = this.f99328e) != null && aznz.mo55108f();
    }
}

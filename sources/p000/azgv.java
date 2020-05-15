package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: azgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgv extends azgx implements azea {

    /* renamed from: a */
    protected final Set f99314a;

    /* renamed from: g */
    private final Context f99315g;

    /* renamed from: h */
    private final azet f99316h;

    /* renamed from: i */
    private final azcl f99317i;

    /* renamed from: j */
    private final azcd f99318j;

    /* renamed from: k */
    private final azdj f99319k;

    /* renamed from: l */
    private final azph f99320l;

    /* renamed from: m */
    private final azbx f99321m;

    /* renamed from: n */
    private long f99322n;

    /* renamed from: o */
    private long f99323o;

    /* renamed from: p */
    private int f99324p = 3;

    public azgv(cbkj cbkj, Context context, azet azet, azcl azcl, azcd azcd, azdj azdj, azbx azbx, azph azph) {
        super(cbkj);
        this.f99315g = context;
        this.f99316h = azet;
        this.f99317i = azcl;
        this.f99318j = azcd;
        this.f99319k = azdj;
        this.f99321m = azbx;
        this.f99320l = azph;
        this.f99314a = new HashSet();
        Object[] objArr = {this.f99326c, this.f99328e, this.f99327d};
    }

    /* renamed from: a */
    public static aznz m85634a(cbij cbij, LocalEntityId localEntityId, LocalEntityId localEntityId2) {
        boolean z;
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        int i3;
        String str4;
        cbie cbie = cbij.f177254b;
        if (cbie == null) {
            cbie = cbie.f177232b;
        }
        if (cbie.f177234a == null || localEntityId == null) {
            return null;
        }
        if (cbij.f177253a.size() > 0) {
            z = ((cbil) cbij.f177253a.get(0)).f177259a == 11;
        } else {
            z = false;
        }
        boolean equals = "FB".equals(localEntityId.f111076c);
        cbie cbie2 = cbij.f177254b;
        if (cbie2 == null) {
            cbie2 = cbie.f177232b;
        }
        cbid cbid = cbie2.f177234a;
        if (cbid == null) {
            cbid = cbid.f177228c;
        }
        String str5 = "";
        if (cbid.f177230a == 2) {
            str = (String) cbid.f177231b;
        } else {
            str = str5;
        }
        if (str.isEmpty()) {
            if (cbid.f177230a == 1) {
                str3 = (String) cbid.f177231b;
            } else {
                str3 = str5;
            }
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            cbip cbip = cbij.f177255c;
            if (cbip == null) {
                cbip = cbip.f177281c;
            }
            cbhu cbhu = cbip.f177283a;
            if (cbhu == null) {
                cbhu = cbhu.f177185d;
            }
            String str6 = cbhu.f177189c;
            if (!z) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (!equals) {
                i3 = 6;
            } else {
                i3 = 2;
            }
            if (cbid.f177230a == 1) {
                str4 = (String) cbid.f177231b;
            } else {
                str4 = str5;
            }
            return new aznz(str6, i2, i3, str4, localEntityId2.f111075b, localEntityId2.f111074a, z);
        }
        if (!z) {
            i = 1;
        } else {
            i = 3;
        }
        if (!equals) {
            cbip cbip2 = cbij.f177255c;
            if (cbip2 == null) {
                cbip2 = cbip.f177281c;
            }
            cbhu cbhu2 = cbip2.f177283a;
            if (cbhu2 == null) {
                cbhu2 = cbhu.f177185d;
            }
            String str7 = cbhu2.f177189c;
            if (cbid.f177230a != 2) {
                str2 = str5;
            } else {
                str2 = (String) cbid.f177231b;
            }
            return new aznz(str7, i, 5, str2, localEntityId2.f111075b, localEntityId2.f111074a, z);
        }
        if (cbid.f177230a == 2) {
            str5 = (String) cbid.f177231b;
        }
        cbma cbma = (cbma) azol.m85935a((bxxk) cbma.f177591f.mo74142c(7), Base64.decode(str5, 2));
        if (cbma == null) {
            return null;
        }
        LocalEntityId b = LocalEntityId.m94551b(cbma);
        cbip cbip3 = cbij.f177255c;
        if (cbip3 == null) {
            cbip3 = cbip.f177281c;
        }
        cbhu cbhu3 = cbip3.f177283a;
        if (cbhu3 == null) {
            cbhu3 = cbhu.f177185d;
        }
        return new aznz(cbhu3.f177189c, i, b.f111075b, b.f111074a, localEntityId2.f111075b, localEntityId2.f111074a, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0213 A[Catch:{ all -> 0x0210, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022a A[SYNTHETIC, Splitter:B:94:0x022a] */
    /* renamed from: b */
    public final azdd mo54862b() {
        int i;
        azph azph;
        int i2;
        cbij cbij;
        cbij cbij2;
        long j;
        azbx azbx;
        azdj azdj;
        int i3;
        Cursor cursor;
        Long l;
        LocalEntityId localEntityId;
        long j2;
        azdj azdj2;
        byte[] bArr;
        String str;
        cbin cbin;
        cbin cbin2;
        Cursor cursor2;
        boolean z;
        Cursor cursor3;
        azdf azdf;
        Context context = this.f99315g;
        LocalEntityId localEntityId2 = this.f99327d;
        aznz aznz = this.f99328e;
        String str2 = this.f99325b;
        azcd azcd = this.f99318j;
        azdj azdj3 = this.f99319k;
        bxxc bxxc = this.f99326c;
        cbij cbij3 = (cbij) bxxc;
        long j3 = this.f99329f;
        azbx azbx2 = this.f99321m;
        if (bxxc != null && cbij3.f177253a.size() > 0) {
            int b = cbik.m127888b(((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177261c);
            if (b != 0 && b == 13) {
                i = 63;
                this.f99324p = i;
                azph = this.f99320l;
                qws qws = azph.f99815a;
                i2 = aznz.f99776c;
                cbij = cbij3;
                if (i2 != 2 || i2 == 6) {
                    azbx = azbx2;
                    j = j3;
                    azdj = azdj3;
                    cbij2 = cbij;
                    i3 = 0;
                    azph.mo55133a(43, 3, str2, localEntityId2, aznz.f99775b, aznz, 0);
                } else {
                    azdj = azdj3;
                    i3 = 0;
                    azbx = azbx2;
                    j = j3;
                    cbij2 = cbij;
                    azph.mo55133a(44, 3, str2, localEntityId2, aznz.f99775b, aznz, 0);
                }
                m85635a(33, i3);
                if (!azcd.mo54605a(aznz.f99775b)) {
                    Object[] objArr = new Object[1];
                    objArr[i3] = aznz.f99775b;
                    azoj.m85933c("MSProtoHandler", "Message from unsupported app %s", objArr);
                    m85635a(40, 41);
                    return null;
                }
                cbij cbij4 = cbij2;
                cbil cbil = cbij4.f177253a.size() > 0 ? (cbil) cbij4.f177253a.get(i3) : null;
                if (cbil != null) {
                    String str3 = aznz.f99775b;
                    if (cfeo.f183719a.mo6606a().mo80978al() && cbil.f177259a == 15) {
                        bxwc bxwc = ((cbiy) cbil.f177260b).f177314a;
                        if (!bxwc.isEmpty()) {
                            m85636a(this, 1479);
                            int size = bxwc.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                String str4 = (String) bxwc.get(i4);
                                if (!cfeo.m138870aa()) {
                                    azdf = azcm.m85300a(context).mo54657b(str4);
                                } else {
                                    azdf = null;
                                }
                                if (azdf != null) {
                                    if (azdf.f99021c == 2) {
                                    }
                                }
                                new Object[1][0] = str4;
                                this.f99314a.add(str4);
                                azeb a = azeb.m85504a(context.getApplicationContext());
                                if (!azpj.m86088a(str4)) {
                                    azoj.m85933c("DownloadManager", "Cannot preload unsecured URL %s", str4);
                                } else {
                                    new Object[1][0] = str4;
                                    new azdt(a, str4, this, str3).start();
                                }
                                m85636a(this, 1480);
                            }
                        }
                    }
                    if (azcd.mo54608b(aznz.f99775b) == -1) {
                        azoj.m85933c("MSProtoHandler", "Failed to get app data %s", aznz.f99775b);
                        m85635a(40, 42);
                        return null;
                    }
                    long j4 = cbil.f177264f;
                    if (j4 != 0) {
                        String str5 = aznz.f99775b;
                        try {
                            SQLiteDatabase writableDatabase = azcd.f98961a.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                cursor3 = azcd.mo54598a(str5, new String[]{"status"});
                                if (cursor3 != null) {
                                    try {
                                        if (!cursor3.moveToFirst() || (15 & cursor3.getInt(0)) != 2) {
                                            try {
                                                cursor3.close();
                                                cursor3 = writableDatabase.query("appString", new String[]{"_id"}, "app_id = ? AND string_id = ? ", new String[]{str5, Long.toString(j4)}, null, null, null);
                                                if (cursor3 != null) {
                                                    try {
                                                        if (!cursor3.moveToFirst()) {
                                                            new Object[1][0] = Long.valueOf(j4);
                                                            azcd.mo54611c(str5);
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (cursor3 != null) {
                                                            cursor3.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                writableDatabase.setTransactionSuccessful();
                                                writableDatabase.endTransaction();
                                            } catch (Throwable th2) {
                                                writableDatabase.setTransactionSuccessful();
                                                writableDatabase.endTransaction();
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (cursor3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (cursor3 != null) {
                                    cursor3.close();
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } catch (Throwable th4) {
                                th = th4;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e) {
                        }
                    }
                    try {
                        Cursor a2 = azcd.mo54598a(aznz.f99775b, new String[]{"blocked"});
                        if (a2 != null) {
                            try {
                                if (a2.moveToFirst()) {
                                    l = Long.valueOf(a2.getLong(0));
                                    a2.close();
                                    if (l.longValue() == 0) {
                                        m85635a(40, 27);
                                        m85635a(45, 27);
                                        this.f99316h.mo54843a(Collections.singletonList(str2));
                                        if (!cfeo.m138866W()) {
                                            return null;
                                        }
                                        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP");
                                        intent.putExtra("server_app_id", this.f99328e.f99775b);
                                        intent.putExtra("sync_app_block_state_with_server", true);
                                        MessagingService.m94557b(intent, this.f99315g);
                                        return null;
                                    }
                                    if (localEntityId2.f111075b == 3) {
                                        if (!azpi.m86069a(context, localEntityId2)) {
                                            m85635a(40, 30);
                                            this.f99316h.mo54843a(Collections.singletonList(str2));
                                            return null;
                                        } else if (aznz.mo55107e() && azpi.m86071a(localEntityId2)) {
                                            azcm a3 = azcm.m85300a(context);
                                            String str6 = aznz.f99774a;
                                            if (!a3.mo54651a()) {
                                                a3.f98996b = azcl.m85289a(a3.f98995a).getReadableDatabase();
                                            }
                                            a3.f98996b.beginTransaction();
                                            try {
                                                if (!azcm.m85306a(a3.f98996b, str6)) {
                                                    m85635a(40, 31);
                                                    this.f99316h.mo54843a(Collections.singletonList(str2));
                                                    return null;
                                                }
                                            } finally {
                                                a3.f98996b.endTransaction();
                                            }
                                        }
                                    }
                                    try {
                                        SQLiteDatabase writableDatabase2 = this.f99319k.f99085a.getWritableDatabase();
                                        try {
                                            writableDatabase2.beginTransaction();
                                            Cursor a4 = azdj.m85397a(writableDatabase2, localEntityId2, new String[]{"blocked"});
                                            if (a4 != null) {
                                                try {
                                                    if (a4.moveToFirst()) {
                                                        if (a4.getInt(0) == 2 || a4.getInt(0) == 1) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        a4.close();
                                                        writableDatabase2.setTransactionSuccessful();
                                                        writableDatabase2.endTransaction();
                                                        if (z) {
                                                            this.f99316h.mo54843a(Collections.singletonList(str2));
                                                            m85635a(40, 28);
                                                            m85635a(37, 28);
                                                            return null;
                                                        }
                                                        localEntityId = aznz.f99780g;
                                                        if (TextUtils.equals(localEntityId.f111074a, localEntityId2.f111074a) || localEntityId.f111075b != localEntityId2.f111075b) {
                                                            azdj2 = azdj;
                                                            j2 = azdj2.mo54716a(localEntityId2, localEntityId);
                                                        } else {
                                                            j2 = -2;
                                                            azdj2 = azdj;
                                                        }
                                                        this.f99322n = j2;
                                                        if (j2 != -1) {
                                                            azoj.m85933c("MSProtoHandler", "Failed to get sender profile %s", localEntityId2);
                                                            m85635a(40, 44);
                                                            return null;
                                                        }
                                                        this.f99323o = -1;
                                                        if (aznz.mo55104b()) {
                                                            long a5 = azdj2.mo54716a(aznz.f99781h, localEntityId);
                                                            this.f99323o = a5;
                                                            if (a5 == -1) {
                                                                azoj.m85933c("MSProtoHandler", "Failed to get group profile %s", aznz.f99781h);
                                                                m85635a(40, 45);
                                                                return null;
                                                            }
                                                        }
                                                        cbim cbim = cbij4.f177256d;
                                                        if (cbim != null) {
                                                            bArr = cbim.mo73642k();
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        azdb azdb = new azdb();
                                                        azdb.f99027a = str2;
                                                        azdb.f99036j = aznz.f99774a;
                                                        azdb.f99028b = localEntityId2.f111074a;
                                                        azdb.f99029c = localEntityId2.f111075b;
                                                        azdb.f99035i = j;
                                                        azdb.f99037k = 1;
                                                        azdb.f99040n = bArr;
                                                        azdb.f99031e = j2;
                                                        if (cbil.f177259a == 11 && (cbil = azbx.mo54583a(localEntityId2, aznz, cbil)) == null) {
                                                            m85635a(40, 33);
                                                            azdb.f99034h = "application/secure";
                                                            azdb.f99039m = 1;
                                                            return azdb.mo54711a();
                                                        }
                                                        bxte bxte = cbil.f177262d;
                                                        if (bxte != null) {
                                                            azdb.f99038l = bxte.mo73642k();
                                                        }
                                                        int i5 = cbil.f177259a;
                                                        if (i5 == 1) {
                                                            azdb.f99034h = "text/plain";
                                                            azdb.f99032f = azpi.m86073a(((cbiv) cbil.f177260b).f177305a);
                                                            azdb.f99033g = "text/plain";
                                                            return azdb.mo54711a();
                                                        } else if (i5 == 2) {
                                                            if (azoy.m85987c(((cbin) cbil.f177260b).f177274c)) {
                                                                this.f99320l.mo55137a((int) ErrorInfo.TYPE_SDU_FAILED, aznz);
                                                            }
                                                            if (cbil.f177259a == 2) {
                                                                cbin2 = (cbin) cbil.f177260b;
                                                            } else {
                                                                cbin2 = cbin.f177270f;
                                                            }
                                                            azdb.f99034h = cbin2.f177274c;
                                                            azdb.f99033g = "proto/MatchstickMessageContent";
                                                            azdb.f99032f = cbil.mo73642k();
                                                            return azdb.mo54711a();
                                                        } else if (i5 == 5) {
                                                            azdb.f99034h = "application/sticker";
                                                            azdb.f99033g = "proto/MatchstickMessageContent";
                                                            azdb.f99032f = cbil.mo73642k();
                                                            return azdb.mo54711a();
                                                        } else if (i5 == 6) {
                                                            azdb.f99034h = "application/link";
                                                            azdb.f99033g = "proto/MatchstickMessageContent";
                                                            azdb.f99032f = cbil.mo73642k();
                                                            return azdb.mo54711a();
                                                        } else if (i5 == 13) {
                                                            cbiu cbiu = (cbiu) cbil.f177260b;
                                                            byte[] k = cbiu.mo73642k();
                                                            if (!azcm.m85300a(context).mo54662c(cbiu.f177301a)) {
                                                                azet azet = this.f99316h;
                                                                String str7 = cbiu.f177301a;
                                                                Pair create = Pair.create(str2, k);
                                                                synchronized (azet.f99199o) {
                                                                    if (azet.f99199o.get(str7) == null) {
                                                                        azet.f99199o.put(str7, create);
                                                                    }
                                                                }
                                                                return null;
                                                            } else if (!azcm.m85300a(context).mo54658b()) {
                                                                m85635a(40, 47);
                                                                return null;
                                                            } else if (!azcm.m85300a(context).mo54652a(aznz.f99774a, cbiu.f177301a, k)) {
                                                                return null;
                                                            } else {
                                                                context.getContentResolver().notifyChange(DatabaseProvider.m94543g(aznz.f99774a), null);
                                                                this.f99316h.mo54843a(Collections.singletonList(str2));
                                                                return null;
                                                            }
                                                        } else if (i5 == 4 || i5 == 3) {
                                                            azoj.m85933c("MSProtoHandler", "senderstatus or message receipt shouldn't be saved", new Object[0]);
                                                            m85635a(40, 46);
                                                            return null;
                                                        } else {
                                                            int b2 = cbik.m127888b(cbil.f177261c);
                                                            int i6 = (b2 != 0 ? b2 : 1) - 2;
                                                            if (i6 != 2) {
                                                                if (i6 == 7) {
                                                                    str = "application/location";
                                                                } else if (i6 == 9) {
                                                                    str = "application/sticker";
                                                                }
                                                                azdb.f99034h = str;
                                                                azdb.f99033g = "proto/MatchstickMessageContent";
                                                                azdb.f99032f = cbil.mo73642k();
                                                                return azdb.mo54711a();
                                                            } else if (cbil.f177259a == 2 && !((cbin) cbil.f177260b).f177274c.isEmpty()) {
                                                                if (cbil.f177259a == 2) {
                                                                    cbin = (cbin) cbil.f177260b;
                                                                } else {
                                                                    cbin = cbin.f177270f;
                                                                }
                                                                str = cbin.f177274c;
                                                                azdb.f99034h = str;
                                                                azdb.f99033g = "proto/MatchstickMessageContent";
                                                                azdb.f99032f = cbil.mo73642k();
                                                                return azdb.mo54711a();
                                                            }
                                                            str = localEntityId2.f111075b != 3 ? "application/unkown" : "application/botresponse-unsupported";
                                                            azdb.f99034h = str;
                                                            azdb.f99033g = "proto/MatchstickMessageContent";
                                                            azdb.f99032f = cbil.mo73642k();
                                                            return azdb.mo54711a();
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    cursor2 = a4;
                                                    if (cursor2 != null) {
                                                    }
                                                    writableDatabase2.setTransactionSuccessful();
                                                    writableDatabase2.endTransaction();
                                                    throw th;
                                                }
                                            }
                                            if (a4 != null) {
                                                a4.close();
                                            }
                                            writableDatabase2.setTransactionSuccessful();
                                            writableDatabase2.endTransaction();
                                            localEntityId = aznz.f99780g;
                                            if (TextUtils.equals(localEntityId.f111074a, localEntityId2.f111074a)) {
                                            }
                                            azdj2 = azdj;
                                            j2 = azdj2.mo54716a(localEntityId2, localEntityId);
                                            this.f99322n = j2;
                                            if (j2 != -1) {
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cursor2 = null;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            writableDatabase2.setTransactionSuccessful();
                                            writableDatabase2.endTransaction();
                                            throw th;
                                        }
                                    } catch (SQLiteException e2) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = a2;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        }
                        if (a2 != null) {
                            a2.close();
                        }
                        l = 0L;
                        if (l.longValue() == 0) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    m85635a(40, 43);
                    return null;
                }
            } else {
                int b3 = cbik.m127888b(((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177261c);
                if (b3 != 0) {
                    i = b3 != 12 ? 3 : 62;
                    this.f99324p = i;
                    azph = this.f99320l;
                    qws qws2 = azph.f99815a;
                    i2 = aznz.f99776c;
                    cbij = cbij3;
                    if (i2 != 2) {
                    }
                    azbx = azbx2;
                    j = j3;
                    azdj = azdj3;
                    cbij2 = cbij;
                    i3 = 0;
                    azph.mo55133a(43, 3, str2, localEntityId2, aznz.f99775b, aznz, 0);
                    m85635a(33, i3);
                    if (!azcd.mo54605a(aznz.f99775b)) {
                    }
                }
            }
        }
        i = 3;
        this.f99324p = i;
        azph = this.f99320l;
        qws qws22 = azph.f99815a;
        i2 = aznz.f99776c;
        cbij = cbij3;
        if (i2 != 2) {
        }
        azbx = azbx2;
        j = j3;
        azdj = azdj3;
        cbij2 = cbij;
        i3 = 0;
        azph.mo55133a(43, 3, str2, localEntityId2, aznz.f99775b, aznz, 0);
        m85635a(33, i3);
        if (!azcd.mo54605a(aznz.f99775b)) {
        }
    }

    /* renamed from: c */
    public final void mo54863c() {
        new Object[1][0] = this.f99325b;
    }

    /* renamed from: d */
    public final void mo54817d() {
        azoj.m85933c("MSProtoHandler", "Webview preload file failed", new Object[0]);
        m85635a(1483, 51);
    }

    /* renamed from: a */
    private final void m85635a(int i, int i2) {
        if (i2 != 0) {
            azph azph = this.f99320l;
            aznz aznz = this.f99328e;
            azph.mo55162a(aznz.f99775b, this.f99327d, aznz, this.f99325b, this.f99324p, i, i2);
            return;
        }
        this.f99320l.mo55132a(i, this.f99324p, this.f99325b, this.f99327d, this.f99328e);
    }

    /* renamed from: a */
    private static void m85636a(azgv azgv, int i) {
        azgv.m85635a(i, 0);
    }

    /* renamed from: a */
    public static void m85637a(azgv azgv, aznz aznz) {
        new Object[1][0] = aznz;
        long j = azgv.f99322n;
        long j2 = azgv.f99323o;
        if (j != -1 && !azgv.f99319k.mo54721a(j) && !azny.m85887b(azgv.f99315g, azgv.f99327d)) {
            return;
        }
        if ((j2 == -1 || !azgv.f99328e.mo55104b() || azgv.f99319k.mo54721a(j2)) && azgv.f99318j.mo54619k(azgv.f99328e.f99775b)) {
            if (!azgv.f99314a.isEmpty()) {
                azgv.m85635a(1481, 0);
                return;
            }
            azet azet = azgv.f99316h;
            String str = aznz.f99774a;
            MessagingService messagingService = azet.f99193i;
            if (messagingService == null || !messagingService.mo60380b(str)) {
                azet.f99192h.mo54538a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        cbij cbij = (cbij) bxxc;
        cbma cbma = cbkj.f177414h;
        if (cbma == null) {
            cbma = cbma.f177591f;
        }
        return m85634a(cbij, localEntityId, LocalEntityId.m94551b(cbma));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        return (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.mo73780k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cbip cbip = ((cbij) bxxc).f177255c;
        if (cbip == null) {
            return null;
        }
        cbhu cbhu = cbip.f177283a;
        if (cbhu == null) {
            cbhu = cbhu.f177185d;
        }
        return LocalEntityId.m94549a(cbhu);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
        Pair pair;
        int i;
        boolean z;
        azcl azcl = this.f99317i;
        Context context = this.f99315g;
        aznz aznz = this.f99328e;
        String str = this.f99325b;
        LocalEntityId localEntityId = this.f99327d;
        try {
            SQLiteDatabase writableDatabase = azcl.getWritableDatabase();
            azet azet = this.f99316h;
            synchronized (azet.f99199o) {
                pair = (Pair) azet.f99199o.remove(str);
            }
            if (pair != null && azcm.m85300a(context).mo54652a(aznz.f99774a, str, (byte[]) pair.second)) {
                this.f99316h.mo54843a(Collections.singletonList((String) pair.first));
            }
            writableDatabase.beginTransaction();
            try {
                aznz aznz2 = azbz.f98936a;
                if (aznz2 != null) {
                    if (azbz.f98939d && aznz2.f99776c == 5) {
                        azcm.m85304a(writableDatabase, aznz2.f99774a, localEntityId.f111074a, localEntityId.f111075b);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.f99316h.mo54843a(Collections.singletonList(str));
                if (!azbz.f98938c) {
                    String str2 = aznz.f99774a;
                    Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.SEND_DELIVERY_RECEIPT_MESSAGE");
                    intent.setClassName(this.f99315g, "com.google.android.gms.matchstick.net.MessagingService");
                    intent.putExtra("conversation_id", str2);
                    this.f99315g.startService(intent);
                    if (!aznz.mo55104b() && azbz.f98937b) {
                        azet azet2 = this.f99316h;
                        if (azet2.f99194j && localEntityId != null && ((i = localEntityId.f111075b) == 1 || i == 7)) {
                            if (azet2.f99198n.containsKey(localEntityId.f111074a)) {
                                z = ((Boolean) azet2.f99198n.get(localEntityId.f111074a)).booleanValue();
                            } else {
                                z = azny.m85887b(azet2.f99187c, localEntityId);
                                if (!z) {
                                    if (azcm.m85300a(azet2.f99187c).mo54663d(aznz.f99774a) > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    azet2.f99191g.mo55132a(90, 3, str, localEntityId, aznz);
                                }
                                azet2.f99198n.put(localEntityId.f111074a, Boolean.valueOf(z));
                            }
                            if (!z) {
                                azet2.f99191g.mo55137a(407, aznz);
                                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.TRIGGER_SPAM_SIGNAL");
                                azoi.m85926a(intent2, azet2.f99207w);
                                intent2.setClassName(azet2.f99187c, "com.google.android.gms.matchstick.net.MessagingService");
                                intent2.putExtra("entity_id", localEntityId.f111074a);
                                intent2.putExtra("entity_type", localEntityId.f111075b);
                                intent2.putExtra("server_app_id", localEntityId.f111076c);
                                intent2.putExtra("inbox_msg_id", str);
                                intent2.putExtra("spam_signal", 1);
                                azet2.f99187c.startService(intent2);
                            }
                        }
                    }
                    m85637a(this, aznz);
                    return;
                }
                m85635a(40, 26);
            } catch (Throwable th) {
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54816a(azcx azcx) {
        String str = ((azdf) azcx).f99064d;
        if (str != null) {
            this.f99314a.remove(str);
            m85635a(1482, 0);
            new Object[1][0] = str;
        }
        if (this.f99314a.isEmpty()) {
            new Object[1][0] = this.f99328e;
            new azgu(this).start();
        }
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        int b;
        bxxc bxxc = this.f99326c;
        if (!(bxxc == null || this.f99328e == null || this.f99327d == null)) {
            bxwc bxwc = ((cbij) bxxc).f177253a;
            if (bxwc.isEmpty() || ((b = cbik.m127888b(((cbil) bxwc.get(0)).f177261c)) != 0 && b == 10)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

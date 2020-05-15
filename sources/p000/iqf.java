package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: iqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqf {

    /* renamed from: a */
    private static final sek f21549a = new sek(new String[]{"DeviceSyncController"}, (byte[]) null);

    /* renamed from: b */
    private final Context f21550b;

    /* renamed from: c */
    private final isq f21551c;

    /* renamed from: d */
    private final ism f21552d;

    /* renamed from: e */
    private final iqb f21553e;

    /* renamed from: f */
    private final ehw f21554f;

    /* renamed from: g */
    private final ipw f21555g;

    /* renamed from: h */
    private final ipo f21556h;

    /* renamed from: i */
    private final iql f21557i;

    /* renamed from: j */
    private final iqo f21558j;

    /* renamed from: k */
    private final iqj f21559k;

    /* renamed from: l */
    private final isx f21560l;

    public iqf(Context context, isq isq, ism ism, iqb iqb, ipo ipo, ehw ehw, ipw ipw, iql iql, isx isx, iqo iqo, iqj iqj) {
        this.f21550b = context;
        this.f21551c = isq;
        this.f21552d = ism;
        this.f21553e = iqb;
        this.f21554f = ehw;
        this.f21555g = ipw;
        this.f21557i = iql;
        this.f21560l = isx;
        this.f21556h = ipo;
        this.f21558j = iqo;
        this.f21559k = iqj;
    }

    /* renamed from: a */
    private final bqlm m15893a(Account account, String str, bxtx bxtx, PrivateKey privateKey, bqlq bqlq, byte[] bArr, String str2, int i) {
        chtv chtv;
        try {
            bxvd da = bqlr.f141155c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqlr) da.f164949b).f141157a = bqlq.mo3214a();
            if (str2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str2.getClass();
                ((bqlr) da.f164949b).f141158b = str2;
            }
            bqli a = this.f21557i.mo13262a(str, (bqlr) da.mo74062i());
            bxvd da2 = bqll.f141110e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bqll bqll = (bqll) da2.f164949b;
            a.getClass();
            bqll.f141112a = a;
            bxtx.getClass();
            bqll.f141113b = bxtx;
            bqll.f141115d = privateKey == null;
            if (bArr != null) {
                try {
                    ipy ipy = new ipy(this.f21550b, account.name);
                    byte[] bArr2 = null;
                    String string = ipy.f21539b.getString(ipy.mo13244a("SYNCED_ENCRYPTED_METADATA", str), null);
                    if (string != null) {
                        try {
                            bArr2 = sqd.m35971c(string);
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    if (bArr2 == null) {
                        bArr2 = this.f21560l.mo13326a(ehv.m10473c(bxtx.mo73780k()), bArr).f10555c;
                    }
                    bxtx a2 = bxtx.m123261a(bArr2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a2.getClass();
                    ((bqll) da2.f164949b).f141114c = a2;
                    synchronized (ipy.f21538a) {
                        ipy.f21539b.edit().putString(ipy.mo13244a("SYNCED_ENCRYPTED_METADATA", str), sqd.m35972d(bArr2)).commit();
                    }
                } catch (iqs | InvalidKeySpecException e2) {
                    m15895a(16, str2, i);
                    throw new iqq("Couldn't encrypt metadata", e2);
                }
            }
            try {
                iqb iqb = this.f21553e;
                bqll bqll2 = (bqll) da2.mo74062i();
                try {
                    bqlf c = iqb.f21543a.mo13266c();
                    try {
                        chqp chqp = c.f190402a;
                        chtv chtv2 = bqlg.f141088a;
                        if (chtv2 == null) {
                            synchronized (bqlg.class) {
                                chtv = bqlg.f141088a;
                                if (chtv == null) {
                                    chts a3 = chtv.m149565a();
                                    a3.f189140c = chtu.UNARY;
                                    a3.f189141d = chtv.m149567a("google.cryptauth.devicesync.v1.DeviceSync", "SyncMetadata");
                                    a3.mo85659b();
                                    a3.f189138a = ciie.m150370a(bqll.f141110e);
                                    a3.f189139b = ciie.m150370a(bqlm.f141116d);
                                    chtv = a3.mo85658a();
                                    bqlg.f141088a = chtv;
                                }
                            }
                            chtv2 = chtv;
                        }
                        return (bqlm) ciiq.m150394a(chqp, chtv2, c.f190403b, bqll2);
                    } catch (chux e3) {
                        throw new egw("Failed to make SyncMetadataRequest", e3, iqb.m15887a(e3.f189238a.f189233s));
                    }
                } catch (gid e4) {
                    e = e4;
                    throw new egw("failed to create stub", e, 5);
                } catch (IOException e5) {
                    e = e5;
                    throw new egw("failed to create stub", e, 5);
                }
            } catch (egw e6) {
                m15895a(e6.f14892a, str2, i);
                throw new iqq("Failed to make sync metadata request", e6);
            }
        } catch (iqr e7) {
            m15895a(11, str2, i);
            throw new iqq("Failed to generate request context", e7);
        }
    }

    /* renamed from: a */
    private static final ehx m15894a(Account account, String str) {
        KeyPair a = bysu.m125292a();
        return new ehx(str, account.name, a.getPublic(), a.getPrivate());
    }

    /* renamed from: a */
    private final void m15895a(int i, String str, int i2) {
        isq isq = this.f21551c;
        iso iso = new iso(3, i);
        iso.f21615a = str;
        iso.f21616b = i2;
        isq.mo13320a(iso.mo13318a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        m15895a(13, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        throw new p000.iqq("Failed to decrypt group private key", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        r9 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0031 A[Catch:{ iqs -> 0x0031, InvalidKeySpecException -> 0x0043 }, ExcHandler: iqs (e iqs), Splitter:B:2:0x0007] */
    /* renamed from: a */
    private final void m15896a(bqlm bqlm, Account account, ehx ehx, boolean z, String str, int i) {
        boolean z2;
        ipp a;
        SQLiteDatabase writableDatabase;
        String str2 = ehx.f15024a;
        bqlh bqlh = bqlm.f141120c;
        int i2 = 1;
        if (bqlh != null) {
            try {
                ehx = new ehx(str2, account.name, ehx.f15026c, ehv.m10474d(this.f21560l.mo13324a(ehv.m10474d(this.f21556h.mo13221b(str2, account).f21638c), account, bqlh.f141096c.mo73780k()).f10551c));
                z = true;
            } catch (isu e) {
                e = e;
                m15895a(12, str, i);
                throw new iqq("Couldn't retrieve device public key", e);
            } catch (InvalidKeySpecException e2) {
                e = e2;
                m15895a(12, str, i);
                throw new iqq("Couldn't retrieve device public key", e);
            } catch (iqs e3) {
            }
        }
        if (z) {
            try {
                a = ipp.m15839a(((ipq) this.f21554f).f21527a);
                writableDatabase = a.getWritableDatabase();
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("account", ehx.f15025b);
                contentValues.put("key_name", ehx.f15024a);
                contentValues.put("public_key", sqd.m35972d(ehv.m10472b(ehx.f15026c)));
                PrivateKey privateKey = ehx.f15027d;
                if (privateKey != null) {
                    contentValues.put("private_key", sqd.m35972d(ehv.m10464a(privateKey)));
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("key_name = ? AND account = ? AND key_state = ");
                    sb.append(2);
                    writableDatabase.delete("group_keys", sb.toString(), new String[]{ehx.f15024a, ehx.f15025b});
                } else {
                    i2 = 2;
                }
                contentValues.put("key_state", Integer.valueOf(i2));
                if (writableDatabase.insertWithOnConflict("group_keys", null, contentValues, 5) >= 0) {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    a.close();
                } else {
                    String str3 = ehx.f15024a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 35);
                    sb2.append("Failed to add key=");
                    sb2.append(str3);
                    sb2.append(" to the database.");
                    throw new ehz(sb2.toString());
                }
            } catch (SQLiteException e4) {
                throw new ehz(e4);
            } catch (ehz e5) {
                m15895a(8, str, i);
                throw new iqq("Failed to save group key", e5);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                a.close();
                throw th;
            }
        }
        if (ehx.f15027d != null) {
            ArrayList<bqld> arrayList = new ArrayList();
            bxwc bxwc = bqlm.f141118a;
            int size = bxwc.size();
            for (int i3 = 0; i3 < size; i3++) {
                bqld bqld = (bqld) bxwc.get(i3);
                if (!bqld.f141084b.mo73779j()) {
                    arrayList.add(bqld);
                }
            }
            ipv a2 = this.f21555g.mo13238a();
            try {
                synchronized (ipt.class) {
                    if (((ipt) a2).mo13233a()) {
                        List<bqld> a3 = ((ipt) a2).mo13231a(str2, account);
                        if (a3 != null) {
                            HashMap hashMap = new HashMap();
                            for (bqld bqld2 : a3) {
                                hashMap.put(bqld2.f141083a, bqld2);
                            }
                            for (bqld bqld3 : arrayList) {
                                hashMap.put(bqld3.f141083a, bqld3);
                            }
                            z2 = ((ipt) a2).mo13234a(str2, account, bnkn.m109663a(hashMap.values()));
                        } else {
                            z2 = ((ipt) a2).mo13234a(str2, account, arrayList);
                        }
                        if (z2) {
                            a2.close();
                            ArrayList a4 = bnkn.m109661a();
                            bxwc bxwc2 = bqlm.f141118a;
                            int size2 = bxwc2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                bqld bqld4 = (bqld) bxwc2.get(i4);
                                if (bqld4.f141085c) {
                                    a4.add(bqld4);
                                }
                            }
                            if (!a4.isEmpty()) {
                                try {
                                    this.f21558j.mo13263a(account, str2, a4, i);
                                    return;
                                } catch (iqp e6) {
                                    throw new iqq("Couldn't share group key", e6);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                m15895a(9, str, i);
                throw new iqq("Failed to persist device metadata");
            } catch (Throwable th2) {
                try {
                    a2.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:27:0x00d3 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:130:0x0248 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:36:0x00fd */
    /* JADX WARN: Type inference failed for: r6v1, assign insn: 0x0253: CONST  (r6v1 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String], assign insn: 0x00c6: MOVE  (r6v3 ? I:?[OBJECT, ARRAY]) = (r24v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r6v4, assign insn: PHI: (r6v4 ?) = (r6v5 ?), (r6v10 int), (r6v10 int) binds: [B:130:0x0248, B:81:0x01ad, B:82:?] */
    /* JADX WARN: Type inference failed for: r6v5, assign insn: PHI: (r6v5 ?) = (r6v6 ?), (r6v18 ?) binds: [B:129:0x0247, B:127:0x0244] */
    /* JADX WARN: Type inference failed for: r6v6, assign insn: 0x0247: CONST  (r6v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v7, assign insn: PHI: (r6v7 ?) = (r6v3 ?), (r6v10 int), (r6v10 int), (r6v10 int), (r6v10 int), (r6v10 int), (r6v10 int), (r6v11 ?) binds: [B:27:0x00d3, B:36:0x00fd, B:118:0x0226, B:65:0x0181, B:105:0x0204, B:79:0x01a7, B:80:?, B:33:0x00e7] */
    /* JADX WARN: Type inference failed for: r6v11, assign insn: 0x00e6: CONST  (r6v11 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v12, assign insn: 0x00e1: CONST  (r6v12 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v16, assign insn: 0x00e6: CONST  (r6v16 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v17, assign insn: ?: MOVE  (r6v17 ?) = (r6v4 ?) */
    /* JADX WARN: Type inference failed for: r6v18, assign insn: ?: MOVE  (r6v18 ?) = (r6v7 ?) */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v0, types: [boolean, int], assign insn: PHI: (r6v0 int) = (r6v1 ?), (r6v17 ?) binds: [B:135:0x0253, B:133:0x0250] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v10, types: [boolean, int], assign insn: PHI: (r6v10 int) = (r6v12 ?), (r6v16 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:30:0x00e1, B:34:?] */
    /* renamed from: a */
    public final boolean mo13258a(Account account, String str, byte[] bArr, List list, int i, String str2) {
        ? r6;
        boolean z;
        ehx ehx;
        boolean z2;
        ehx ehx2;
        bqlm bqlm;
        ? r62;
        Throwable th;
        chtv chtv;
        ehx ehx3;
        Account account2 = account;
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        bmxy.m108600b(!this.f21553e.mo13255b());
        try {
            ehx b = this.f21554f.mo10154b(str3, account2.name);
            if (b == null) {
                ehx = m15894a(account, str);
                z = true;
            } else {
                ehx = b;
                z = false;
            }
            bxtx a = bxtx.m123261a(ehv.m10472b(ehx.f15026c));
            ehx ehx4 = ehx;
            bqlm a2 = m15893a(account, str, a, ehx.f15027d, !z ? bqlq.SERVER_INITIATED : bqlq.INITIALIZATION, bArr, str2, i);
            if (a.equals(a2.f141119b)) {
                bqlm = a2;
                z2 = z;
                ehx2 = ehx4;
            } else {
                if (!a2.f141119b.mo73779j()) {
                    ehx ehx5 = new ehx(str3, account2.name, ehv.m10473c(a2.f141119b.mo73780k()), null);
                    m15895a(3, str4, i2);
                    ehx3 = ehx5;
                } else {
                    ehx a3 = m15894a(account, str);
                    m15895a(17, str4, i2);
                    ehx3 = a3;
                }
                new ipy(this.f21550b, account2.name).mo13246b(str3);
                bqlm = m15893a(account, str, bxtx.m123261a(ehv.m10472b(ehx3.f15026c)), ehx3.f15027d, bqlq.SERVER_INITIATED, bArr, str2, i);
                ehx2 = ehx3;
                z2 = true;
            }
            ? r63 = str2;
            m15896a(bqlm, account, ehx2, z2, (String) r63, i);
            m15895a(2, str4, i2);
            try {
                iqj iqj = this.f21559k;
                try {
                    iql iql = iqj.f21566b;
                    bxvd da = bqlr.f141155c.mo74144da();
                    bqlq bqlq = bqlq.SERVER_INITIATED;
                    if (!da.f164950c) {
                        r63 = 0;
                    } else {
                        da.mo74035c();
                        r63 = 0;
                        r63 = 0;
                        try {
                            da.f164950c = false;
                        } catch (iqr e) {
                            e = e;
                            iqj.mo13261a(11, i2);
                            throw new iqk("Failed to generate request context", e);
                        }
                    }
                    ((bqlr) da.f164949b).f141157a = bqlq.mo3214a();
                    bqli a4 = iql.mo13262a(str3, (bqlr) da.mo74062i());
                    try {
                        bxvd da2 = bqkx.f141059c.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = r63;
                        }
                        bqkx bqkx = (bqkx) da2.f164949b;
                        a4.getClass();
                        bqkx.f141061a = a4;
                        if (!bqkx.f141062b.mo73666a()) {
                            bqkx.f141062b = bxvk.m124021a(bqkx.f141062b);
                        }
                        bxsy.m123078a(list, bqkx.f141062b);
                        bqkx bqkx2 = (bqkx) da2.mo74062i();
                        try {
                            try {
                                bqlf c = iqj.f21565a.f21543a.mo13266c();
                                try {
                                    chqp chqp = c.f190402a;
                                    chtv chtv2 = bqlg.f141090c;
                                    if (chtv2 == null) {
                                        synchronized (bqlg.class) {
                                            chtv = bqlg.f141090c;
                                            if (chtv == null) {
                                                chts a5 = chtv.m149565a();
                                                a5.f189140c = chtu.UNARY;
                                                a5.f189141d = chtv.m149567a("google.cryptauth.devicesync.v1.DeviceSync", "BatchGetFeatureStatuses");
                                                a5.mo85659b();
                                                a5.f189138a = ciie.m150370a(bqkx.f141059c);
                                                a5.f189139b = ciie.m150370a(bqky.f141063b);
                                                chtv = a5.mo85658a();
                                                bqlg.f141090c = chtv;
                                            }
                                        }
                                        chtv2 = chtv;
                                    }
                                    bqky bqky = (bqky) ciiq.m150394a(chqp, chtv2, c.f190403b, bqkx2);
                                    ipv a6 = iqj.f21567c.mo13238a();
                                    try {
                                        bxwc bxwc = bqky.f141065a;
                                        synchronized (ipt.class) {
                                            if (((ipt) a6).mo13233a()) {
                                                try {
                                                    boolean a7 = ((ipt) a6).mo13235a(ipt.m15856c(str3, account2), ips.m15855a(bxwc));
                                                    if (a7) {
                                                        a6.close();
                                                        iqj.mo13261a(2, i2);
                                                        try {
                                                            f21549a.mo25414c("Device sync completed, sending broadcast", new Object[r63]);
                                                            this.f21552d.mo13316a(2);
                                                            String str5 = account2.name;
                                                            Intent intent = new Intent("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED");
                                                            intent.setPackage("com.google.android.gms");
                                                            intent.putExtra("account_name", str5);
                                                            intent.putExtra("key_name", str3);
                                                            this.f21550b.sendBroadcast(intent);
                                                            this.f21551c.mo13319a(2);
                                                            return true;
                                                        } catch (iqq e2) {
                                                            e = e2;
                                                            r6 = r63;
                                                            this.f21551c.mo13319a(3);
                                                            f21549a.mo25415d("Error in syncing metadata", e, new Object[r6]);
                                                            return r6;
                                                        }
                                                    }
                                                } catch (IOException e3) {
                                                    ipt.f21530a.mo25417e("Error serializing feature status list", e3, new Object[r63]);
                                                }
                                            }
                                        }
                                        iqj.mo13261a(10, i2);
                                        throw new iqk("Failed to persist device feature statuses");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        a6.close();
                                        throw th;
                                    }
                                } catch (chux e4) {
                                    throw new egw("Failed to make BatchGetFeatureStatusesRequest", e4, iqb.m15887a(e4.f189238a.f189233s));
                                }
                            } catch (gid e5) {
                                e = e5;
                                throw new egw("failed to create stub", e, 5);
                            } catch (IOException e6) {
                                e = e6;
                                throw new egw("failed to create stub", e, 5);
                            }
                        } catch (egw e7) {
                            iqj.mo13261a(e7.f14892a, i2);
                            throw new iqk("Failed to make get feature statuses request", e7);
                        }
                    } catch (iqk e8) {
                        e = e8;
                        r62 = r63;
                        throw new iqq("Error in getting feature statuses", e);
                    } catch (Throwable th3) {
                        bqye.m113761a(th, th3);
                    }
                } catch (iqr e9) {
                    e = e9;
                    iqj.mo13261a(11, i2);
                    throw new iqk("Failed to generate request context", e);
                }
            } catch (iqk e10) {
                e = e10;
                r62 = 0;
                throw new iqq("Error in getting feature statuses", e);
            }
        } catch (InvalidKeySpecException e11) {
            throw new iqq("Couldn't parse returned group public key", e11);
        } catch (iqq e12) {
            e = e12;
            r6 = 0;
            this.f21551c.mo13319a(3);
            f21549a.mo25415d("Error in syncing metadata", e, new Object[r6]);
            return r6;
        }
    }
}

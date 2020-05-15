package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: apaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apaj extends aozz {

    /* renamed from: e */
    public static final aoyh f84014e = aoyh.m69805a("ContactsLogger");

    /* renamed from: f */
    public static final String[] f84015f = {"contact_id", "times_contacted", "last_time_contacted"};

    /* renamed from: k */
    private static final String[] f84016k = {"contact_id", "lookup"};

    /* renamed from: l */
    private static final String[] f84017l = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};

    /* renamed from: m */
    private static final String[] f84018m = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: n */
    private static final bnhe f84019n;

    /* renamed from: g */
    public final aozk f84020g;

    /* renamed from: h */
    public final boolean f84021h;

    /* renamed from: i */
    public final bmxv f84022i;

    /* renamed from: j */
    public aoyq f84023j;

    /* renamed from: o */
    private final bnhe f84024o;

    /* renamed from: p */
    private final bmzi f84025p;

    /* renamed from: q */
    private final aozk f84026q;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b("data1", bzcz.DATA1);
        bnha.mo67695b("data2", bzcz.DATA2);
        bnha.mo67695b("data3", bzcz.DATA3);
        bnha.mo67695b("data4", bzcz.DATA4);
        bnha.mo67695b("data5", bzcz.DATA5);
        bnha.mo67695b("data6", bzcz.DATA6);
        bnha.mo67695b("data7", bzcz.DATA7);
        bnha.mo67695b("data8", bzcz.DATA8);
        bnha.mo67695b("data9", bzcz.DATA9);
        bnha.mo67695b("data10", bzcz.DATA10);
        bnha.mo67695b("data11", bzcz.DATA11);
        bnha.mo67695b("data12", bzcz.DATA12);
        bnha.mo67695b("data13", bzcz.DATA13);
        bnha.mo67695b("data14", bzcz.DATA14);
        f84019n = bnha.mo67618b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apaj(Context context, apal apal) {
        super(context, new apbf(context), new aoyd(context), cgij.m145548f() ? aozl.m69904a(context, "CL_C") : new aozk(context, "CL_C"));
        bnha bnha = new bnha();
        bxwc bxwc = cgjb.f187055a.mo6606a().mo83895d().f169697a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bzen bzen = (bzen) bxwc.get(i);
            String str = bzen.f169692a;
            bzcq a = bzcq.m125652a(bzen.f169693b);
            if (a == null) {
                a = bzcq.UNKNOWN;
            }
            bnha.mo67695b(str, a);
        }
        this.f84024o = bnha.mo67618b();
        this.f84025p = new apah(context, apal);
        if (cgij.m145548f()) {
            this.f84026q = aozl.m69904a(context, "CL_DM");
            this.f84020g = aozl.m69904a(context, "LB_C");
        } else {
            this.f84026q = new aozk(context, "CL_DM");
            this.f84020g = new aozk(context, "LB_C");
        }
        boolean g = cgij.m145549g();
        this.f84021h = g;
        if (g) {
            this.f84023j = new aoyq(5);
        }
        this.f84022i = cgiq.m145572b() ? bmxv.m108566b(new aozi(context)) : bmvz.f131120a;
    }

    /* renamed from: a */
    static final String m69943a(Cursor cursor, String str) {
        if (cgiq.m145573c()) {
            return cursor.getString(cursor.getColumnIndex(str));
        }
        return null;
    }

    /* renamed from: b */
    public static final int m69953b(apal apal) {
        return apal.f84034e ? 3 : 2;
    }

    /* renamed from: c */
    private static final String m69959c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m69944a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
        sb.append(str);
        sb.append(" = '");
        sb.append(str2);
        sb.append('\'');
        return sb.toString();
    }

    /* renamed from: b */
    private static int m69954b(String str, String str2) {
        if (cgij.f186992a.mo6606a().mo83879o()) {
            return ContentResolver.getSyncAutomatically(new Account(str, "com.google"), str2) ? 2 : 3;
        }
        return 1;
    }

    /* renamed from: a */
    private static final String m69945a(String str, Collection collection) {
        return String.format(str.concat(" IN (%s)"), TextUtils.join(",", collection));
    }

    /* renamed from: a */
    private static String m69946a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(" AND ");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static final Integer m69955b(Cursor cursor, String str) {
        return Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str)));
    }

    /* renamed from: b */
    private static final Set m69956b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c2, code lost:
        if (r14 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00df, code lost:
        if (r14 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0 A[SYNTHETIC, Splitter:B:27:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8  */
    /* renamed from: a */
    private final Map m69947a(List list) {
        int i = apaa.f83970a;
        String[] strArr = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};
        HashMap a = bnmt.m109794a();
        Cursor cursor = null;
        try {
            cursor = this.f83966a.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, strArr, m69945a("contact_id", list), null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id")));
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        String string = cursor.getString(cursor.getColumnIndex("data1"));
                        if (!a.containsKey(valueOf)) {
                            a.put(valueOf, new HashMap());
                        }
                        Map map = (Map) a.get(valueOf);
                        if (map != null) {
                            if (!map.containsKey(string)) {
                                map.put(string, new apag(Long.valueOf(cursor.getLong(cursor.getColumnIndex("times_used"))), Long.valueOf((cursor.getLong(cursor.getColumnIndex("last_time_used")) / 86400000) * 86400000)));
                            }
                        }
                        ((apag) map.get(string)).mo47054a(valueOf2);
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            if (cgjy.m145760g()) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                f84014e.mo46983c("CP2 failed to fetch Email info.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            if (cgjy.m145760g()) {
                f84014e.mo46987e("CP2 Query Exception when fetching email info", e);
            } else {
                f84014e.mo46980a(e, "CP2 Query Exception when fetching email info");
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static void m69957b(String str, bzcv bzcv) {
        bzdh bzdh = ((bzcx) bzcv.f164949b).f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        bxvd bxvd = (bxvd) bzdh.mo74142c(5);
        bxvd.mo73625a((bxvk) bzdh);
        bzdb bzdb = (bzdb) bxvd;
        int b = m69954b(str, "com.google.android.gms.people");
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh2 = (bzdh) bzdb.f164949b;
        bzdh2.f169488t = b - 1;
        bzdh2.f169469a |= 4194304;
        if (bzcv.f164950c) {
            bzcv.mo74035c();
            bzcv.f164950c = false;
        }
        bzcx bzcx = (bzcx) bzcv.f164949b;
        bzdh bzdh3 = (bzdh) bzdb.mo74062i();
        bzcx bzcx2 = bzcx.f169429h;
        bzdh3.getClass();
        bzcx.f169436f = bzdh3;
        bzcx.f169431a |= 16;
    }

    /* renamed from: b */
    public static void m69958b(Set set, bzcv bzcv) {
        if (!set.isEmpty()) {
            if (bzcv.f164950c) {
                bzcv.mo74035c();
                bzcv.f164950c = false;
            }
            bzcx bzcx = bzcx.f169429h;
            ((bzcx) bzcv.f164949b).f169434d = bxvk.m124029dd();
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:247:0x05f2 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:135:0x03e2 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:146:0x043c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:229:0x059e */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v19, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v20, resolved type: java.util.List} */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.String], assign insn: PHI: (r1v28 ?) = (r1v4 java.lang.String), (r1v38 ?) binds: [B:134:0x03e0, B:230:?] */
    /* JADX WARN: Type inference failed for: r1v30, assign insn: PHI: (r1v30 ?) = (r1v28 ?), (r1v28 ?), (r1v28 ?), (r1v35 ?), (r1v37 ?) binds: [B:135:0x03e2, B:140:0x0428, B:143:0x0432, B:146:0x043c, B:229:0x059e] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.String], assign insn: 0x043a: CONST_STR  (r1v35 ? I:java.lang.String) =  "data11" */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.Map], assign insn: 0x059c: MOVE  (r1v37 ? I:?[OBJECT, ARRAY]) = (r18v5 java.util.HashMap) */
    /* JADX WARN: Type inference failed for: r1v38, assign insn: 0x05b5: MOVE  (r1v38 ? I:?[OBJECT, ARRAY]) = (r40v20 java.util.List) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ae, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r2 = r12.f83966a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{r1, "data14", "data15"}, m69946a(m69945a(r1, r4.keySet()), m69944a(r11, "vnd.android.cursor.item/photo")), null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ed, code lost:
        if (r2 == null) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f3, code lost:
        if (r2.moveToNext() == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f5, code lost:
        r5 = r2.getLong(r2.getColumnIndex(r1));
        r7 = r2.getLong(r2.getColumnIndex("data14"));
        r9 = r2.getBlob(r2.getColumnIndex("data15"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0315, code lost:
        if (r7 == 0) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0317, code lost:
        ((p000.apai) r4.get(java.lang.Long.valueOf(r5))).f84013q = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0325, code lost:
        if (r9 == null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0327, code lost:
        ((p000.apai) r4.get(java.lang.Long.valueOf(r5))).f84013q = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0335, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0336, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0339, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033a, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033c, code lost:
        p000.apaj.f84014e.mo46983c("CP2 failed to fetch photo info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0344, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0345, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0349, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034a, code lost:
        r5 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0350, code lost:
        if (p000.cgjy.m145760g() != false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0352, code lost:
        p000.apaj.f84014e.mo46987e("CP2 Query Exception when fetching photo info", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0360, code lost:
        p000.apaj.f84014e.mo46980a(r5, "CP2 Query Exception when fetching photo info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0367, code lost:
        if (r2 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0369, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0370, code lost:
        if (p000.cgij.m145554l() == false) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0372, code lost:
        r7 = new java.lang.String[]{r1, "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r2 = r12.f83966a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, r7, m69946a(m69945a(r1, r4.keySet()), m69944a(r11, "vnd.android.cursor.item/name")), null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e0, code lost:
        if (r2 == null) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e6, code lost:
        if (r2.moveToNext() == false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e8, code lost:
        r5 = java.lang.Long.valueOf(r2.getLong(r2.getColumnIndex(r1)));
        r6 = m69959c(r2, "data1");
        r7 = m69959c(r2, "data2");
        r8 = m69959c(r2, "data3");
        r9 = m69959c(r2, "data4");
        r10 = m69959c(r2, "data5");
        r13 = m69959c(r2, "data6");
        r14 = m69959c(r2, "data7");
        r15 = m69959c(r2, "data8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0424, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r3 = m69959c(r2, "data9");
        r17 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042e, code lost:
        r22 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r11 = m69955b(r2, "data10");
        r17 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0438, code lost:
        r40 = r1;
        r1 = "data11";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r1 = m69955b(r2, (java.lang.String) r1);
        r12 = p000.bzdr.f169556m.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0446, code lost:
        if (r6 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0448, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x044c, code lost:
        if (r12.f164950c != false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x044f, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0455, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x045c, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r2.f169558a |= 1;
        r2.f169559b = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x046c, code lost:
        r17 = r2;
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0470, code lost:
        if (r7 == null) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0474, code lost:
        if (r12.f164950c != false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0477, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x047d, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r7.getClass();
        r2.f169558a |= 2;
        r2.f169560c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x048e, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0492, code lost:
        if (r8 == null) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0496, code lost:
        if (r12.f164950c != false) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0499, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x049f, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r8.getClass();
        r2.f169558a |= 4;
        r2.f169561d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b0, code lost:
        if (r9 == null) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04b4, code lost:
        if (r12.f164950c != false) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04b7, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04bd, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r9.getClass();
        r2.f169558a |= 8;
        r2.f169562e = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04cc, code lost:
        if (r10 == null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04d0, code lost:
        if (r12.f164950c != false) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04d3, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04d9, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r10.getClass();
        r2.f169558a |= 16;
        r2.f169563f = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04e8, code lost:
        if (r13 == null) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ec, code lost:
        if (r12.f164950c != false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04ef, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04f5, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r13.getClass();
        r2.f169558a |= 32;
        r2.f169564g = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0504, code lost:
        if (r14 == null) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0508, code lost:
        if (r12.f164950c != false) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x050b, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0511, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r14.getClass();
        r2.f169558a |= 64;
        r2.f169565h = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0520, code lost:
        if (r15 == null) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0524, code lost:
        if (r12.f164950c != false) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0527, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x052d, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r15.getClass();
        r2.f169558a |= 128;
        r2.f169566i = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x053c, code lost:
        if (r3 == null) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0540, code lost:
        if (r12.f164950c != false) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0543, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x054a, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r3.getClass();
        r2.f169558a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r2.f169567j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x055d, code lost:
        if (r11.intValue() == 0) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x055f, code lost:
        r2 = r11.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0565, code lost:
        if (r12.f164950c != false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0568, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x056e, code lost:
        r3 = (p000.bzdr) r12.f164949b;
        r3.f169558a |= 512;
        r3.f169568k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x057e, code lost:
        if (r1.intValue() != 0) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0581, code lost:
        r1 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0587, code lost:
        if (r12.f164950c != false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x058a, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0590, code lost:
        r2 = (p000.bzdr) r12.f164949b;
        r2.f169558a |= 1024;
        r2.f169569l = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x059c, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        ((p000.apai) r1.get(r5)).f84011o = (p000.bzdr) r12.mo74062i();
        r4 = r1;
        r3 = r16;
        r2 = r17;
        r11 = r22;
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05bc, code lost:
        r40 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05be, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05c0, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05c3, code lost:
        r40 = r1;
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05c8, code lost:
        r40 = r1;
        r17 = r2;
        r16 = r3;
        r1 = r4;
        r22 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05d3, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05d5, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05d8, code lost:
        r40 = r1;
        r17 = r2;
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05de, code lost:
        r1 = r4;
        r22 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05e2, code lost:
        r40 = r1;
        r17 = r2;
        r16 = r3;
        r1 = r4;
        r22 = r11;
        p000.apaj.f84014e.mo46983c("CP2 failed to fetch Note info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05f2, code lost:
        if (r17 != null) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05f5, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05fb, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05fe, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05ff, code lost:
        r2 = r17;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0602, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0603, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0607, code lost:
        r40 = r1;
        r16 = r3;
        r1 = r4;
        r22 = r11;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0613, code lost:
        if (p000.cgjy.m145760g() != false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0615, code lost:
        p000.apaj.f84014e.mo46987e("ReadContacts", "ContentResolver.query threw an exception when fetching structured name info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0625, code lost:
        p000.apaj.f84014e.mo46985d("ContentResolver.query threw an exception when fetching structured name info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x062c, code lost:
        if (r2 != null) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x062e, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0632, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0633, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0634, code lost:
        if (r2 != null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0636, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0639, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x063a, code lost:
        r40 = r1;
        r16 = r3;
        r1 = r4;
        r22 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0645, code lost:
        if (p000.cgjb.m145681b() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0647, code lost:
        r3 = r39;
        r2 = p000.aozj.m69902a(r3.f83966a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0654, code lost:
        if (m69953b(r41) == 2) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0656, code lost:
        r2.edit().putInt("romanesco-contacts-logger-combined-3p-app-contact-count", 0).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0664, code lost:
        r2 = p000.bngx.m109368a((java.util.Collection) p000.cgjb.f187055a.mo83891c().mo83896e().f165797a);
        r4 = new java.util.ArrayList(r2);
        r5 = r40;
        r4.add(r5);
        r6 = r22;
        r4.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r4 = r3.f83966a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, (java.lang.String[]) r4.toArray(new java.lang.String[0]), m69945a(r5, r1.keySet()), null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06a3, code lost:
        if (r4 != null) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        r7 = p000.aozj.m69902a(r3.f83966a);
        r9 = (int) p000.cgjb.f187055a.mo83891c().mo83894c();
        r8 = r7.getInt("romanesco-contacts-logger-combined-3p-app-contact-count", 0);
        r10 = new java.util.HashSet();
        r11 = p000.cgjb.f187055a.mo83891c().mo83893b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06d0, code lost:
        if (r4.moveToNext() != false) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06d2, code lost:
        r12 = r4.getLong(r4.getColumnIndex(r5));
        r14 = r4.getString(r4.getColumnIndex(r6));
        r15 = (p000.bzcq) r3.f84024o.get(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06ea, code lost:
        if (r11 == false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06fe, code lost:
        p000.apaj.f84014e.mo46983c("Reached contact limit for 3p contacts - will not upload remaining contacts.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0717, code lost:
        if (p000.cgjb.f187055a.mo83891c().mo83897f().f165797a.contains(r14) == false) goto L_0x0840;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x071b, code lost:
        r3 = p000.bzcr.f169402d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0723, code lost:
        if (r3.f164950c == false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0726, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x072c, code lost:
        r14 = (p000.bzcr) r3.f164949b;
        r14.f169405b = r15.f169401f;
        r14.f169404a |= 1;
        r14 = r2.listIterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0744, code lost:
        if (r14.hasNext() != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0746, code lost:
        r15 = (java.lang.String) r14.next();
        r40 = r2;
        r2 = r4.getString(r4.getColumnIndex(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x075a, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x075c, code lost:
        r18 = r5;
        r5 = p000.bzda.f169458d.mo74144da();
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0768, code lost:
        if (r5.f164950c == false) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x076b, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0771, code lost:
        r6 = (p000.bzda) r5.f164949b;
        r2.getClass();
        r17 = r9;
        r6.f169460a |= 2;
        r6.f169462c = r2;
        r2 = (p000.bzcz) p000.apaj.f84019n.get(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x078e, code lost:
        if (r5.f164950c == false) goto L_0x0790;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0791, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0797, code lost:
        r6 = (p000.bzda) r5.f164949b;
        r6.f169461b = r2.f169457p;
        r6.f169460a |= 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07a7, code lost:
        if (r3.f164950c == false) goto L_0x07a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x07aa, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07b0, code lost:
        r2 = (p000.bzcr) r3.f164949b;
        r5 = (p000.bzda) r5.mo74062i();
        r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07c3, code lost:
        if (r2.f169406c.mo73666a() == false) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07c5, code lost:
        r2.f169406c = p000.bxvk.m124021a(r2.f169406c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07cd, code lost:
        r2.f169406c.add(r5);
        r2 = r40;
        r9 = r17;
        r5 = r18;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07dc, code lost:
        r2 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07e8, code lost:
        r40 = r2;
        r18 = r5;
        r22 = r6;
        r17 = r9;
        r2 = java.lang.Long.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07fe, code lost:
        if (((p000.apai) r1.get(r2)).f84012p != null) goto L_0x0800;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0801, code lost:
        ((p000.apai) r1.get(r2)).f84012p = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x080e, code lost:
        ((p000.apai) r1.get(r2)).f84012p.add((p000.bzcr) r3.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0823, code lost:
        if (r10.contains(r2) == false) goto L_0x0825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0825, code lost:
        r10.add(r2);
        r3 = r39;
        r2 = r40;
        r9 = r17;
        r5 = r18;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0834, code lost:
        r3 = r39;
        r2 = r40;
        r9 = r17;
        r5 = r18;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0840, code lost:
        r3 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x084e, code lost:
        r7.edit().putInt("romanesco-contacts-logger-combined-3p-app-contact-count", r8 + r10.size()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0861, code lost:
        p000.apaj.f84014e.mo46983c("CP2 failed to fetch RawContacts.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0868, code lost:
        if (r4 != null) goto L_0x086a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x086a, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x086e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x086f, code lost:
        r1 = r0;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0872, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0873, code lost:
        r1 = r0;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0876, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0877, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x087a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x087b, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0881, code lost:
        if (p000.cgjy.m145760g() != false) goto L_0x0891;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0883, code lost:
        p000.apaj.f84014e.mo46987e("CP2 Query Exception when fetching email info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0891, code lost:
        p000.apaj.f84014e.mo46980a(r1, "CP2 Query Exception when fetching email info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0898, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x089a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x089e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x089f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x08a0, code lost:
        if (r2 != null) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x08a2, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08a5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08a7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08a8, code lost:
        if (r2 != null) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08aa, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08ad, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08af, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08b0, code lost:
        if (r2 != null) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08b2, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08b5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ba, code lost:
        if (r8 == null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e8, code lost:
        if (r8 == null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ea, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f1, code lost:
        if (r4.isEmpty() != false) goto L_0x08b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f3, code lost:
        r1 = "raw_contact_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020a, code lost:
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0210, code lost:
        r12 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2 = r12.f83966a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{r1, "data1"}, m69946a(m69945a(r1, r4.keySet()), m69944a(r11, "vnd.android.cursor.item/note")), null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0230, code lost:
        if (r2 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0236, code lost:
        if (r2.moveToNext() == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0238, code lost:
        r5 = r2.getLong(r2.getColumnIndex(r1));
        r7 = r2.getColumnIndex("data1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024a, code lost:
        if (r2.isNull(r7) != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x024c, code lost:
        r7 = r2.getString(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025b, code lost:
        if (((long) r7.length()) > p000.cgij.m145546d()) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x025d, code lost:
        ((p000.apai) r4.get(java.lang.Long.valueOf(r5))).f84010n = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x026b, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026f, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0271, code lost:
        p000.apaj.f84014e.mo46983c("CP2 failed to fetch Note info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0278, code lost:
        if (r2 != null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0280, code lost:
        r12 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0283, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0286, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028b, code lost:
        r12 = r39;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028f, code lost:
        r5 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0295, code lost:
        if (p000.cgjy.m145760g() != false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0297, code lost:
        p000.apaj.f84014e.mo46987e("CP2 Query Exception when fetching note info", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a5, code lost:
        p000.apaj.f84014e.mo46980a(r5, "CP2 Query Exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ac, code lost:
        if (r2 == null) goto L_0x02b1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.lang.String, for r40v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0352 A[Catch:{ all -> 0x08a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0360 A[Catch:{ all -> 0x08a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05d2 A[Catch:{ SQLiteException -> 0x05fe, all -> 0x05f9 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:135:0x03e2] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05f9 A[ExcHandler: all (th java.lang.Throwable), PHI: r17 10  PHI: (r17v12 android.database.Cursor) = (r17v24 android.database.Cursor), (r17v24 android.database.Cursor), (r17v24 android.database.Cursor), (r17v26 android.database.Cursor), (r17v26 android.database.Cursor) binds: [B:135:0x03e2, B:140:0x0428, B:229:0x059e, B:150:0x044a, B:157:0x045e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:150:0x044a] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0615 A[Catch:{ all -> 0x0632 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0625 A[Catch:{ all -> 0x0632 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0883 A[Catch:{ all -> 0x089e }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0891 A[Catch:{ all -> 0x089e }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x089a  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08a2  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d3 A[Catch:{ all -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e1 A[Catch:{ all -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0283 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:61:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0297 A[Catch:{ all -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a5 A[Catch:{ all -> 0x08ae }] */
    /* renamed from: a */
    private final Map m69948a(String str, apal apal) {
        String[] strArr;
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        SQLiteException sQLiteException;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i = apae.f83989b;
        HashMap a = bnmt.m109794a();
        HashMap a2 = bnmt.m109794a();
        boolean z3 = cgiq.m145573c() && cgit.m145580b();
        String str2 = "mimetype";
        if (!cgiq.m145573c()) {
            strArr = new String[]{"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "starred"};
        } else {
            strArr = z3 ? new String[]{"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "starred", "sync1", "sync2", "sync3", "sync4", "dirty"} : new String[]{"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "starred", "sync1", "sync2", "sync3", "sync4"};
        }
        try {
            cursor2 = this.f83966a.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, strArr, m69945a("contact_id", str), null, null);
            if (cursor2 == null) {
                try {
                    f84014e.mo46983c("CP2 failed to fetch RawContacts.");
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    try {
                        if (cgjy.m145760g()) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } else {
                boolean e2 = cgij.m145547e();
                while (cursor2.moveToNext()) {
                    Long valueOf = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("_id")));
                    String string = cursor2.getString(cursor2.getColumnIndex("sourceid"));
                    String string2 = cursor2.getString(cursor2.getColumnIndex("account_type"));
                    String string3 = cursor2.getString(cursor2.getColumnIndex("account_name"));
                    String string4 = cursor2.getString(cursor2.getColumnIndex("data_set"));
                    if (!e2) {
                        j = cursor2.getLong(cursor2.getColumnIndex("times_contacted"));
                    } else {
                        j = 0;
                    }
                    Long valueOf2 = Long.valueOf(j);
                    if (!e2) {
                        j2 = cursor2.getLong(cursor2.getColumnIndex("last_time_contacted"));
                    } else {
                        j2 = 0;
                    }
                    Long valueOf3 = Long.valueOf(j2);
                    int i2 = cursor2.getInt(cursor2.getColumnIndex("starred"));
                    String a3 = m69943a(cursor2, "sync1");
                    String a4 = m69943a(cursor2, "sync2");
                    String a5 = m69943a(cursor2, "sync3");
                    String a6 = m69943a(cursor2, "sync4");
                    if (z3) {
                        z = cursor2.getInt(cursor2.getColumnIndex("dirty")) != 0;
                    } else {
                        z = false;
                    }
                    apai apai = new apai(valueOf, string, string2, string3, string4, valueOf2, valueOf3, i2, a3, a4, a5, a6, z);
                    a2.put(apai.f83997a, apai);
                    Long valueOf4 = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("contact_id")));
                    if (!a.containsKey(valueOf4)) {
                        z2 = z3;
                        a.put(valueOf4, new ArrayList());
                    } else {
                        z2 = z3;
                    }
                    ((List) a.get(valueOf4)).add(apai);
                    z3 = z2;
                }
            }
        } catch (SQLiteException e3) {
            sQLiteException = e3;
            cursor2 = null;
            if (cgjy.m145760g()) {
                f84014e.mo46987e("CP2 Query Exception when fetching raw-contacts.", sQLiteException);
            } else {
                f84014e.mo46980a(sQLiteException, "CP2 Query Exception when fetching raw-contacts.");
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m69949a(String str, bzcv bzcv) {
        bzdh bzdh = ((bzcx) bzcv.f164949b).f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        bxvd bxvd = (bxvd) bzdh.mo74142c(5);
        bxvd.mo73625a((bxvk) bzdh);
        bzdb bzdb = (bzdb) bxvd;
        if (cgij.f186992a.mo6606a().mo83880p()) {
            boolean a = cgkc.f187140a.mo6606a().mo83964a();
            if (bzdb.f164950c) {
                bzdb.mo74035c();
                bzdb.f164950c = false;
            }
            bzdh bzdh2 = (bzdh) bzdb.f164949b;
            bzdh2.f169469a |= 8388608;
            bzdh2.f169489u = a;
        }
        int b = m69954b(str, "com.android.contacts");
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh3 = (bzdh) bzdb.f164949b;
        bzdh3.f169487s = b - 1;
        bzdh3.f169469a |= 2097152;
        if (bzcv.f164950c) {
            bzcv.mo74035c();
            bzcv.f164950c = false;
        }
        bzcx bzcx = (bzcx) bzcv.f164949b;
        bzdh bzdh4 = (bzdh) bzdb.mo74062i();
        bzcx bzcx2 = bzcx.f169429h;
        bzdh4.getClass();
        bzcx.f169436f = bzdh4;
        bzcx.f169431a |= 16;
    }

    /* renamed from: a */
    public static void m69950a(Set set, bzcv bzcv) {
        if (!set.isEmpty()) {
            bxwc bxwc = ((bzcx) bzcv.mo74062i()).f169432b;
            int size = bxwc.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                bzcu bzcu = (bzcu) bxwc.get(i);
                bxvd bxvd = (bxvd) bzcu.mo74142c(5);
                bxvd.mo73625a((bxvk) bzcu);
                bzcs bzcs = (bzcs) bxvd;
                bxwc bxwc2 = bzcu.f169420k;
                int size2 = bxwc2.size();
                int i3 = 0;
                int i4 = 0;
                while (i3 < size2) {
                    int i5 = i4 + 1;
                    bzdq bzdq = (bzdq) bxwc2.get(i3);
                    bxvd bxvd2 = (bxvd) bzdq.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bzdq);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bzdq bzdq2 = (bzdq) bxvd2.f164949b;
                    bzdq bzdq3 = bzdq.f169536s;
                    "".getClass();
                    bzdq2.f169538a |= 128;
                    bzdq2.f169543f = "";
                    if (bzcs.f164950c) {
                        bzcs.mo74035c();
                        bzcs.f164950c = false;
                    }
                    bzcu bzcu2 = (bzcu) bzcs.f164949b;
                    bzdq bzdq4 = (bzdq) bxvd2.mo74062i();
                    bzcu bzcu3 = bzcu.f169408q;
                    bzdq4.getClass();
                    bzcu2.mo74533g();
                    bzcu2.f169420k.set(i4, bzdq4);
                    i3++;
                    i4 = i5;
                }
                bzcv.mo74534a(i2, bzcs);
                i++;
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m69951a(boolean z, boolean z2, bzcv bzcv) {
        bzdh bzdh = ((bzcx) bzcv.f164949b).f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        bxvd bxvd = (bxvd) bzdh.mo74142c(5);
        bxvd.mo73625a((bxvk) bzdh);
        bzdb bzdb = (bzdb) bxvd;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh2 = (bzdh) bzdb.f164949b;
        int i = bzdh2.f169469a | 128;
        bzdh2.f169469a = i;
        bzdh2.f169476h = z;
        bzdh2.f169469a = i | 64;
        bzdh2.f169475g = z2;
        if (bzcv.f164950c) {
            bzcv.mo74035c();
            bzcv.f164950c = false;
        }
        bzcx bzcx = (bzcx) bzcv.f164949b;
        bzdh bzdh3 = (bzdh) bzdb.mo74062i();
        bzcx bzcx2 = bzcx.f169429h;
        bzdh3.getClass();
        bzcx.f169436f = bzdh3;
        bzcx.f169431a |= 16;
    }

    /* renamed from: a */
    private static bzdk[] m69952a(btfe[] btfeArr) {
        bzdk[] bzdkArr = new bzdk[btfeArr.length];
        for (int i = 0; i < btfeArr.length; i++) {
            btfe btfe = btfeArr[i];
            bxvd da = bzdk.f169504n.mo74144da();
            long j = btfe.f148624a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzdk bzdk = (bzdk) da.f164949b;
            int i2 = bzdk.f169506a | 1;
            bzdk.f169506a = i2;
            bzdk.f169507b = j;
            String str = btfe.f148625b;
            str.getClass();
            int i3 = i2 | 2;
            bzdk.f169506a = i3;
            bzdk.f169508c = str;
            String str2 = btfe.f148626c;
            str2.getClass();
            int i4 = i3 | 4;
            bzdk.f169506a = i4;
            bzdk.f169509d = str2;
            String str3 = btfe.f148627d;
            str3.getClass();
            int i5 = i4 | 8;
            bzdk.f169506a = i5;
            bzdk.f169510e = str3;
            String str4 = btfe.f148628e;
            str4.getClass();
            int i6 = i5 | 16;
            bzdk.f169506a = i6;
            bzdk.f169511f = str4;
            boolean z = btfe.f148629f;
            int i7 = i6 | 32;
            bzdk.f169506a = i7;
            bzdk.f169512g = z;
            boolean z2 = btfe.f148630g;
            int i8 = i7 | 64;
            bzdk.f169506a = i8;
            bzdk.f169513h = z2;
            boolean z3 = btfe.f148631h;
            int i9 = i8 | 128;
            bzdk.f169506a = i9;
            bzdk.f169514i = z3;
            String str5 = btfe.f148632i;
            str5.getClass();
            int i10 = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bzdk.f169506a = i10;
            bzdk.f169515j = str5;
            String str6 = btfe.f148633j;
            str6.getClass();
            bzdk.f169506a = i10 | 512;
            bzdk.f169516k = str6;
            if (cgiw.m145589b()) {
                boolean z4 = btfe.f148634k;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzdk bzdk2 = (bzdk) da.f164949b;
                bzdk2.f169506a |= 1024;
                bzdk2.f169517l = z4;
            }
            if (cgiw.m145590c()) {
                String str7 = btfe.f148635l;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzdk bzdk3 = (bzdk) da.f164949b;
                str7.getClass();
                bzdk3.f169506a |= 2048;
                bzdk3.f169518m = str7;
            }
            bzdkArr[i] = (bzdk) da.mo74062i();
        }
        return bzdkArr;
    }

    /* renamed from: a */
    public final bzcv mo47056a(apal apal) {
        btfo btfo;
        bxwc bxwc;
        int i;
        Iterator it;
        apal apal2 = apal;
        aozn b = ((apah) this.f84025p).mo6606a();
        if (b == null) {
            return null;
        }
        int i2 = 1;
        if (cgij.m145555m()) {
            List list = b.f83951c;
            if ((list == null || list.size() == 0) && b.f83950b.isEmpty()) {
                return null;
            }
            new Object[1][0] = Integer.valueOf(b.f83951c.size());
            new Object[1][0] = Integer.valueOf(b.f83950b.size());
            List list2 = b.f83951c;
            Set set = b.f83950b;
            Map map = b.f83952d;
            btfe[] btfeArr = b.f83953e;
            HashMap hashMap = new HashMap();
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                btfi btfi = (btfi) list2.get(i3);
                Long valueOf = Long.valueOf(btfi.f148671n);
                List list3 = (List) hashMap.get(valueOf);
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(valueOf, list3);
                }
                list3.add(btfi);
            }
            HashMap hashMap2 = new HashMap();
            String str = "com.google";
            if (this.f83968c.mo46976a(this.f83966a)) {
                for (Long l : hashMap.keySet()) {
                    List list4 = (List) hashMap.get(l);
                    if (list4 != null) {
                        aoyd aoyd = new aoyd(this.f83966a);
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                hashMap2.put(l, list4);
                                break;
                            }
                            btfi btfi2 = (btfi) it2.next();
                            if (str.equals(btfi2.f148664g)) {
                                if (aoyd.mo46977a(btfi2.f148681x)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        new Object[1][0] = l;
                    }
                }
                hashMap = hashMap2;
            }
            bzcv bzcv = (bzcv) bzcx.f169429h.mo74144da();
            Iterator it3 = hashMap.keySet().iterator();
            while (it3.hasNext()) {
                Long l2 = (Long) it3.next();
                bzcs bzcs = (bzcs) bzcu.f169408q.mo74144da();
                long longValue = l2.longValue();
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                bzcu bzcu = (bzcu) bzcs.f164949b;
                bzcu.f169410a |= i2;
                bzcu.f169411b = longValue;
                btfa btfa = (btfa) map.get(l2);
                if (btfa != null) {
                    if (cgij.m145553k()) {
                        String str2 = ((btfa) map.get(l2)).f148605a;
                        if (bzcs.f164950c) {
                            bzcs.mo74035c();
                            bzcs.f164950c = false;
                        }
                        bzcu bzcu2 = (bzcu) bzcs.f164949b;
                        str2.getClass();
                        bzcu2.f169410a |= 4096;
                        bzcu2.f169421l = str2;
                    }
                    String str3 = btfa.f148606b;
                    if (bzcs.f164950c) {
                        bzcs.mo74035c();
                        bzcs.f164950c = false;
                    }
                    bzcu bzcu3 = (bzcu) bzcs.f164949b;
                    str3.getClass();
                    bzcu3.f169410a |= 4;
                    bzcu3.f169412c = str3;
                }
                List<btfi> list5 = (List) hashMap.get(l2);
                ArrayList arrayList = new ArrayList();
                for (btfi btfi3 : list5) {
                    btfk btfk = btfi3.f148675r;
                    if (btfk != null) {
                        arrayList.add(btfk.f148695a);
                    }
                }
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                ((bzcu) bzcs.f164949b).f169413d = bxvk.m124030de();
                bzcs.mo74529a(arrayList);
                HashMap hashMap3 = new HashMap();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    btfi btfi4 = (btfi) it4.next();
                    Iterator it5 = it3;
                    bxwc bxwc2 = btfi4.f148662e;
                    Map map2 = map;
                    int size2 = bxwc2.size();
                    HashMap hashMap4 = hashMap;
                    int i4 = 0;
                    while (i4 < size2) {
                        bxwc bxwc3 = bxwc2;
                        btff btff = (btff) bxwc2.get(i4);
                        int i5 = size2;
                        Set set2 = (Set) hashMap3.get(btff.f148638a);
                        if (set2 == null) {
                            set2 = new HashSet();
                            it = it4;
                            hashMap3.put(btff.f148638a, set2);
                        } else {
                            it = it4;
                        }
                        btfe[] btfeArr2 = btfeArr;
                        set2.add(Long.valueOf(btfi4.f148670m));
                        if (!hashSet.contains(btff.f148638a)) {
                            arrayList2.add(btff);
                            hashSet.add(btff.f148638a);
                        }
                        i4++;
                        btfeArr = btfeArr2;
                        size2 = i5;
                        bxwc2 = bxwc3;
                        it4 = it;
                    }
                    it3 = it5;
                    map = map2;
                    hashMap = hashMap4;
                    it4 = it4;
                }
                btfe[] btfeArr3 = btfeArr;
                Iterator it6 = it3;
                Map map3 = map;
                HashMap hashMap5 = hashMap;
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                ((bzcu) bzcs.f164949b).f169415f = bxvk.m124030de();
                int size3 = arrayList2.size();
                int i6 = 0;
                while (i6 < size3) {
                    String str4 = str;
                    btfe[] btfeArr4 = btfeArr3;
                    btff btff2 = (btff) arrayList2.get(i6);
                    bzdl bzdl = (bzdl) bzdm.f169519h.mo74144da();
                    String str5 = btff2.f148638a;
                    if (bzdl.f164950c) {
                        bzdl.mo74035c();
                        bzdl.f164950c = false;
                    }
                    bzdm bzdm = (bzdm) bzdl.f164949b;
                    str5.getClass();
                    int i7 = bzdm.f169521a | 1;
                    bzdm.f169521a = i7;
                    bzdm.f169522b = str5;
                    String str6 = btff2.f148639b;
                    str6.getClass();
                    int i8 = i7 | 2;
                    bzdm.f169521a = i8;
                    bzdm.f169523c = str6;
                    int i9 = btff2.f148640c;
                    int i10 = i8 | 4;
                    bzdm.f169521a = i10;
                    ArrayList arrayList3 = arrayList2;
                    bzdm.f169525e = (long) i9;
                    long j = btff2.f148641d;
                    bzdm.f169521a = i10 | 8;
                    bzdm.f169526f = (j / 86400000) * 86400000;
                    bzdl.mo74542a((Iterable) hashMap3.get(bzdm.f169522b));
                    if (cgij.m145551i()) {
                        boolean z = btff2.f148644g;
                        if (bzdl.f164950c) {
                            bzdl.mo74035c();
                            bzdl.f164950c = false;
                        }
                        bzdm bzdm2 = (bzdm) bzdl.f164949b;
                        bzdm2.f169521a |= 32;
                        bzdm2.f169527g = z;
                    }
                    bzdm bzdm3 = (bzdm) bzdl.mo74062i();
                    if (bzcs.f164950c) {
                        bzcs.mo74035c();
                        bzcs.f164950c = false;
                    }
                    bzcu bzcu4 = (bzcu) bzcs.f164949b;
                    bzdm3.getClass();
                    bzcu4.mo74530c();
                    bzcu4.f169415f.add(bzdm3);
                    i6++;
                    btfeArr3 = btfeArr4;
                    str = str4;
                    arrayList2 = arrayList3;
                }
                HashMap hashMap6 = new HashMap();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it7 = list5.iterator();
                while (it7.hasNext()) {
                    btfi btfi5 = (btfi) it7.next();
                    bxwc bxwc4 = btfi5.f148661d;
                    int size4 = bxwc4.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        btfd btfd = (btfd) bxwc4.get(i11);
                        Iterator it8 = it7;
                        Set set3 = (Set) hashMap6.get(btfd.f148615a);
                        if (set3 == null) {
                            set3 = new LinkedHashSet();
                            i = size4;
                            hashMap6.put(btfd.f148615a, set3);
                        } else {
                            i = size4;
                        }
                        bxwc bxwc5 = bxwc4;
                        btfe[] btfeArr5 = btfeArr3;
                        set3.add(Long.valueOf(btfi5.f148670m));
                        if (!hashSet2.contains(btfd.f148615a)) {
                            arrayList4.add(btfd);
                            hashSet2.add(btfd.f148615a);
                        }
                        i11++;
                        btfeArr3 = btfeArr5;
                        it7 = it8;
                        size4 = i;
                        bxwc4 = bxwc5;
                    }
                }
                btfe[] btfeArr6 = btfeArr3;
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                ((bzcu) bzcs.f164949b).f169416g = bxvk.m124030de();
                int size5 = arrayList4.size();
                int i12 = 0;
                while (i12 < size5) {
                    btfd btfd2 = (btfd) arrayList4.get(i12);
                    bzdi bzdi = (bzdi) bzdj.f169495h.mo74144da();
                    String str7 = btfd2.f148615a;
                    if (bzdi.f164950c) {
                        bzdi.mo74035c();
                        bzdi.f164950c = false;
                    }
                    bzdj bzdj = (bzdj) bzdi.f164949b;
                    str7.getClass();
                    int i13 = bzdj.f169497a | 1;
                    bzdj.f169497a = i13;
                    bzdj.f169498b = str7;
                    String str8 = btfd2.f148616b;
                    str8.getClass();
                    int i14 = i13 | 2;
                    bzdj.f169497a = i14;
                    bzdj.f169499c = str8;
                    String str9 = str;
                    long j2 = btfd2.f148617c;
                    int i15 = i14 | 4;
                    bzdj.f169497a = i15;
                    bzdj.f169501e = j2;
                    long j3 = btfd2.f148618d;
                    bzdj.f169497a = i15 | 8;
                    bzdj.f169502f = (j3 / 86400000) * 86400000;
                    bzdi.mo74541a((Iterable) hashMap6.get(bzdj.f169498b));
                    if (cgij.m145551i()) {
                        boolean z2 = btfd2.f148621g;
                        if (bzdi.f164950c) {
                            bzdi.mo74035c();
                            bzdi.f164950c = false;
                        }
                        bzdj bzdj2 = (bzdj) bzdi.f164949b;
                        bzdj2.f169497a |= 32;
                        bzdj2.f169503g = z2;
                    }
                    bzdj bzdj3 = (bzdj) bzdi.mo74062i();
                    if (bzcs.f164950c) {
                        bzcs.mo74035c();
                        bzcs.f164950c = false;
                    }
                    bzcu bzcu5 = (bzcu) bzcs.f164949b;
                    bzdj3.getClass();
                    bzcu5.mo74531e();
                    bzcu5.f169416g.add(bzdj3);
                    i12++;
                    str = str9;
                }
                HashMap hashMap7 = new HashMap();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    btfi btfi6 = (btfi) it9.next();
                    bxwc bxwc6 = btfi6.f148663f;
                    int size6 = bxwc6.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        btfg btfg = (btfg) bxwc6.get(i16);
                        Iterator it10 = it9;
                        Set set4 = (Set) hashMap7.get(btfg.f148647a);
                        if (set4 == null) {
                            set4 = new LinkedHashSet();
                            bxwc = bxwc6;
                            hashMap7.put(btfg.f148647a, set4);
                        } else {
                            bxwc = bxwc6;
                        }
                        int i17 = size6;
                        set4.add(Long.valueOf(btfi6.f148670m));
                        if (!hashSet3.contains(btfg.f148647a)) {
                            arrayList5.add(btfg);
                            hashSet3.add(btfg.f148647a);
                        }
                        i16++;
                        it9 = it10;
                        bxwc6 = bxwc;
                        size6 = i17;
                    }
                }
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                ((bzcu) bzcs.f164949b).f169417h = bxvk.m124030de();
                int size7 = arrayList5.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    btfg btfg2 = (btfg) arrayList5.get(i18);
                    bzdn bzdn = (bzdn) bzdo.f169528f.mo74144da();
                    String str10 = btfg2.f148647a;
                    if (bzdn.f164950c) {
                        bzdn.mo74035c();
                        bzdn.f164950c = false;
                    }
                    bzdo bzdo = (bzdo) bzdn.f164949b;
                    str10.getClass();
                    int i19 = bzdo.f169530a | 1;
                    bzdo.f169530a = i19;
                    bzdo.f169531b = str10;
                    String str11 = btfg2.f148648b;
                    str11.getClass();
                    bzdo.f169530a = i19 | 2;
                    bzdo.f169532c = str11;
                    bzdn.mo74543a((Iterable) hashMap7.get(bzdo.f169531b));
                    bzdo bzdo2 = (bzdo) bzdn.mo74062i();
                    if (bzcs.f164950c) {
                        bzcs.mo74035c();
                        bzcs.f164950c = false;
                    }
                    bzcu bzcu6 = (bzcu) bzcs.f164949b;
                    bzdo2.getClass();
                    bzcu6.mo74532f();
                    bzcu6.f169417h.add(bzdo2);
                }
                if (cgik.f186994a.mo6606a().mo83835a()) {
                    cgik.f186994a.mo6606a().mo83836b();
                }
                HashMap hashMap8 = new HashMap();
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                ((bzcu) bzcs.f164949b).f169420k = bxvk.m124030de();
                for (int i20 = 0; i20 < list5.size(); i20++) {
                    btfi btfi7 = (btfi) list5.get(i20);
                    bxvd da = bzdq.f169536s.mo74144da();
                    long j4 = btfi7.f148670m;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzdq bzdq = (bzdq) da.f164949b;
                    bzdq.f169538a |= 1;
                    bzdq.f169539b = j4;
                    if (!btfi7.f148664g.isEmpty()) {
                        String str12 = btfi7.f148664g;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq2 = (bzdq) da.f164949b;
                        str12.getClass();
                        bzdq2.f169538a |= 8;
                        bzdq2.f169540c = str12;
                        if (cgij.m145550h()) {
                            Boolean bool = (Boolean) hashMap8.get(((bzdq) da.f164949b).f169540c);
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzdq bzdq3 = (bzdq) da.f164949b;
                                bzdq3.f169538a = 32768 | bzdq3.f169538a;
                                bzdq3.f169550m = booleanValue;
                            } else {
                                boolean a = aytv.m84811a(this.f83966a, ((bzdq) da.f164949b).f169540c);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzdq bzdq4 = (bzdq) da.f164949b;
                                bzdq4.f169538a = 32768 | bzdq4.f169538a;
                                bzdq4.f169550m = a;
                                hashMap8.put(bzdq4.f169540c, Boolean.valueOf(a));
                            }
                        }
                    }
                    if (!btfi7.f148681x.isEmpty()) {
                        String str13 = btfi7.f148681x;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq5 = (bzdq) da.f164949b;
                        str13.getClass();
                        bzdq5.f169538a |= 16;
                        bzdq5.f169541d = str13;
                    }
                    if (!btfi7.f148672o.isEmpty() && ((long) btfi7.f148672o.length()) <= cgij.m145546d()) {
                        String str14 = btfi7.f148672o;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq6 = (bzdq) da.f164949b;
                        str14.getClass();
                        bzdq6.f169538a |= 128;
                        bzdq6.f169543f = str14;
                    }
                    if (cgij.m145554l() && (btfo = btfi7.f148660c) != null) {
                        bxvd da2 = bzdr.f169556m.mo74144da();
                        String str15 = btfo.f148720a;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzdr bzdr = (bzdr) da2.f164949b;
                        str15.getClass();
                        int i21 = bzdr.f169558a | 1;
                        bzdr.f169558a = i21;
                        bzdr.f169559b = str15;
                        String str16 = btfo.f148721b;
                        str16.getClass();
                        int i22 = i21 | 2;
                        bzdr.f169558a = i22;
                        bzdr.f169560c = str16;
                        String str17 = btfo.f148723d;
                        str17.getClass();
                        int i23 = i22 | 4;
                        bzdr.f169558a = i23;
                        bzdr.f169561d = str17;
                        String str18 = btfo.f148725f;
                        str18.getClass();
                        int i24 = i23 | 8;
                        bzdr.f169558a = i24;
                        bzdr.f169562e = str18;
                        String str19 = btfo.f148722c;
                        str19.getClass();
                        int i25 = i24 | 16;
                        bzdr.f169558a = i25;
                        bzdr.f169563f = str19;
                        String str20 = btfo.f148726g;
                        str20.getClass();
                        int i26 = i25 | 32;
                        bzdr.f169558a = i26;
                        bzdr.f169564g = str20;
                        String str21 = btfo.f148727h;
                        str21.getClass();
                        int i27 = i26 | 64;
                        bzdr.f169558a = i27;
                        bzdr.f169565h = str21;
                        String str22 = btfo.f148728i;
                        str22.getClass();
                        int i28 = i27 | 128;
                        bzdr.f169558a = i28;
                        bzdr.f169566i = str22;
                        String str23 = btfo.f148729j;
                        str23.getClass();
                        int i29 = i28 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bzdr.f169558a = i29;
                        bzdr.f169567j = str23;
                        int i30 = btfo.f148724e;
                        int i31 = i29 | 512;
                        bzdr.f169558a = i31;
                        bzdr.f169568k = i30;
                        int i32 = btfo.f148730k;
                        bzdr.f169558a = i31 | 1024;
                        bzdr.f169569l = i32;
                        bzdr bzdr2 = (bzdr) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq7 = (bzdq) da.f164949b;
                        bzdr2.getClass();
                        bzdq7.f169547j = bzdr2;
                        bzdq7.f169538a |= 8192;
                    }
                    if (btfi7.f148676s) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq8 = (bzdq) da.f164949b;
                        bzdq8.f169538a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bzdq8.f169549l = true;
                    }
                    long j5 = (long) btfi7.f148665h;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzdq bzdq9 = (bzdq) da.f164949b;
                    int i33 = bzdq9.f169538a | 1024;
                    bzdq9.f169538a = i33;
                    bzdq9.f169545h = j5;
                    long j6 = btfi7.f148666i;
                    bzdq9.f169538a = i33 | 2048;
                    bzdq9.f169546i = (j6 / 86400000) * 86400000;
                    if (!btfi7.f148674q.mo73779j()) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq10 = (bzdq) da.f164949b;
                        bzdq10.f169544g = 3;
                        bzdq10.f169538a |= 512;
                    } else if (!btfi7.f148673p.mo73779j()) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq11 = (bzdq) da.f164949b;
                        bzdq11.f169544g = 2;
                        bzdq11.f169538a |= 512;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq12 = (bzdq) da.f164949b;
                        bzdq12.f169544g = 1;
                        bzdq12.f169538a |= 512;
                    }
                    if (str.equals(btfi7.f148664g) && btfi7.f148655B.isEmpty() && !btfi7.f148669l.isEmpty()) {
                        String str24 = btfi7.f148669l;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq13 = (bzdq) da.f164949b;
                        str24.getClass();
                        bzdq13.f169538a |= 32;
                        bzdq13.f169542e = str24;
                    }
                    if (cgij.m145552j()) {
                        bxvw bxvw = btfi7.f148656C;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdq bzdq14 = (bzdq) da.f164949b;
                        if (!bzdq14.f169548k.mo73666a()) {
                            bzdq14.f169548k = bxvk.m124020a(bzdq14.f169548k);
                        }
                        bxsy.m123078a(bxvw, bzdq14.f169548k);
                    }
                    bzcs.mo74525a(da);
                }
                long j7 = (long) ((btfi) list5.get(0)).f148665h;
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                bzcu bzcu7 = (bzcu) bzcs.f164949b;
                bzcu7.f169410a |= 32;
                bzcu7.f169418i = j7;
                long j8 = ((btfi) list5.get(0)).f148666i;
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                bzcu bzcu8 = (bzcu) bzcs.f164949b;
                bzcu8.f169410a |= 64;
                bzcu8.f169419j = j8;
                bzcv.mo74535a(bzcs);
                btfeArr = btfeArr6;
                it3 = it6;
                map = map3;
                hashMap = hashMap5;
                i2 = 1;
            }
            btfe[] btfeArr7 = btfeArr;
            bzdh a2 = apak.m69965a(this.f83966a);
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((bxvk) a2);
            bzdb bzdb = (bzdb) bxvd;
            if (cgij.m145552j() && btfeArr7 != null) {
                if (bzdb.f164950c) {
                    bzdb.mo74035c();
                    bzdb.f164950c = false;
                }
                bzdh bzdh = bzdh.f169466A;
                ((bzdh) bzdb.f164949b).f169485q = bxvk.m124030de();
                bzdb.mo74540a(Arrays.asList(m69952a(btfeArr7)));
            }
            long j9 = ((bzdh) bzdb.f164949b).f169477i;
            if (bzcv.f164950c) {
                bzcv.mo74035c();
                bzcv.f164950c = false;
            }
            bzcx bzcx = (bzcx) bzcv.f164949b;
            int i34 = bzcx.f169431a | 8;
            bzcx.f169431a = i34;
            bzcx.f169435e = j9;
            long j10 = ((bzdh) bzdb.f164949b).f169478j;
            bzcx.f169431a = i34 | 32;
            bzcx.f169437g = j10;
            bzdh bzdh2 = (bzdh) bzdb.mo74062i();
            bzdh2.getClass();
            bzcx.f169436f = bzdh2;
            bzcx.f169431a |= 16;
            bzcv.mo74536a(set);
            if (apal.f84034e) {
                if (bzcv.f164950c) {
                    bzcv.mo74035c();
                    bzcv.f164950c = false;
                }
                bzcx.m125673a((bzcx) bzcv.f164949b);
                bxwc bxwc7 = ((bzcx) bzcv.mo74062i()).f169432b;
                int size8 = bxwc7.size();
                int i35 = 0;
                int i36 = 0;
                while (i36 < size8) {
                    int i37 = i35 + 1;
                    bzcu bzcu9 = (bzcu) bxwc7.get(i36);
                    bxvd bxvd2 = (bxvd) bzcu9.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bzcu9);
                    bzcs bzcs2 = (bzcs) bxvd2;
                    if (bzcs2.f164950c) {
                        bzcs2.mo74035c();
                        bzcs2.f164950c = false;
                    }
                    bzcu.m125662a((bzcu) bzcs2.f164949b);
                    bzcv.mo74534a(i35, bzcs2);
                    i36++;
                    i35 = i37;
                }
            }
            bzcx bzcx2 = (bzcx) bzcv.mo74062i();
            bxvd bxvd3 = (bxvd) bzcx2.mo74142c(5);
            bxvd3.mo73625a((bxvk) bzcx2);
            return (bzcv) bxvd3;
        } else if (b.f83949a.isEmpty() && b.f83950b.isEmpty()) {
            return null;
        } else {
            new Object[1][0] = Integer.valueOf(b.f83949a.size());
            new Object[1][0] = Integer.valueOf(b.f83950b.size());
            bzcx a3 = mo47057a(b.f83949a, b.f83950b, apal2, b.f83953e);
            bxvd bxvd4 = (bxvd) a3.mo74142c(5);
            bxvd4.mo73625a((bxvk) a3);
            return (bzcv) bxvd4;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, apaf]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        p000.apaj.f84014e.mo46987e("CP2 Query Exception when fetching postal info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0203, code lost:
        p000.apaj.f84014e.mo46980a(r0, "CP2 Query Exception when fetching postal info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0208, code lost:
        if (r10 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020a, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0211, code lost:
        if (p000.cgij.m145553k() == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r0 = r1.f83966a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, p000.apaj.f84016k, null, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0229, code lost:
        if (r0 == null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x022f, code lost:
        if (r0.moveToNext() == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0231, code lost:
        r5 = java.lang.Long.valueOf(r0.getLong(r0.getColumnIndex("contact_id")));
        r10 = r0.getString(r0.getColumnIndex("lookup"));
        r4.put(r5, r10);
        new java.lang.Object[1][0] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0251, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0255, code lost:
        p000.apaj.f84014e.mo46983c("CP2 query failed when fetching lookup key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0264, code lost:
        if (p000.cgjy.m145760g() != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0266, code lost:
        p000.apaj.f84014e.mo46980a(r0, "CP2 query exception when fetching lookup key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026c, code lost:
        p000.apaj.f84014e.mo46987e("CP2 query exception when fetching lookup key.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0278, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027a, code lost:
        r0 = "com.google";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027c, code lost:
        if (r9 != null) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0287, code lost:
        if (r1.f83968c.mo46976a(r1.f83966a) == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0289, code lost:
        r5 = p000.bnkn.m109661a();
        r6 = r26.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0292, code lost:
        if (r10 >= r6) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0294, code lost:
        r11 = (p000.apbc) r2.get(r10);
        r12 = (java.util.List) r9.get(java.lang.Long.valueOf(r11.f84086a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a6, code lost:
        if (r12 != null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a8, code lost:
        new java.lang.Object[1][0] = java.lang.Long.valueOf(r11.f84086a);
        r5.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b8, code lost:
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c0, code lost:
        if (r12.hasNext() == false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c2, code lost:
        r13 = (p000.apai) r12.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ce, code lost:
        if (r0.equals(r13.f84003g) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d8, code lost:
        if (r1.f83968c.mo46977a(r13.f84004h) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02db, code lost:
        r5.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02de, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e1, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e2, code lost:
        r5 = (p000.bzcv) p000.bzcx.f169429h.mo74144da();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ef, code lost:
        if (r6 >= r2.size()) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f1, code lost:
        r10 = (p000.apbc) r2.get(r6);
        r11 = java.lang.Long.valueOf(r10.f84086a);
        r12 = (p000.bzcs) p000.bzcu.f169408q.mo74144da();
        r13 = r11.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030b, code lost:
        if (r12.f164950c == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030d, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0313, code lost:
        r15 = (p000.bzcu) r12.f164949b;
        r3 = r15.f169410a | 1;
        r15.f169410a = r3;
        r15.f169411b = r13;
        r13 = r10.f84091f;
        r3 = r3 | 16;
        r15.f169410a = r3;
        r15.f169414e = r13;
        r13 = r10.f84092g;
        r15.f169410a = r3 | 32;
        r15.f169418i = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0335, code lost:
        if (p000.cgij.m145553k() != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x033c, code lost:
        if (r4.containsKey(r11) == false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033e, code lost:
        r3 = (java.lang.String) r4.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0346, code lost:
        if (r12.f164950c != false) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0349, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034f, code lost:
        r13 = (p000.bzcu) r12.f164949b;
        r3.getClass();
        r13.f169410a |= 4096;
        r13.f169421l = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035e, code lost:
        r13 = (r10.f84093h / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0366, code lost:
        if (r12.f164950c != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0369, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036f, code lost:
        r3 = (p000.bzcu) r12.f164949b;
        r3.f169410a |= 64;
        r3.f169419j = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0381, code lost:
        if (android.text.TextUtils.isEmpty(r10.f84087b) == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0384, code lost:
        r3 = r10.f84087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0386, code lost:
        if (r3 == null) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x038a, code lost:
        if (r12.f164950c != false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038d, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0393, code lost:
        r13 = (p000.bzcu) r12.f164949b;
        r3.getClass();
        r13.f169410a |= 4;
        r13.f169412c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a2, code lost:
        r3 = p000.bnkn.m109663a(java.util.Collections.unmodifiableSet(r10.f84094i));
        p000.bnjd.m109580a((java.lang.Iterable) r3, (p000.bmxz) new p000.apaf());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b6, code lost:
        if (r12.f164950c == false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b8, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03be, code lost:
        ((p000.bzcu) r12.f164949b).f169413d = p000.bxvk.m124030de();
        r12.mo74529a(r3);
        r3 = (java.util.Map) r8.get(r11);
        r13 = m69956b(p000.bngx.m109368a((java.util.Collection) r10.f84088c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03dd, code lost:
        if (r12.f164950c != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e0, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e6, code lost:
        ((p000.bzcu) r12.f164949b).f169415f = p000.bxvk.m124030de();
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03f8, code lost:
        if (r13.hasNext() == false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03fa, code lost:
        r14 = (p000.aozm) r13.next();
        r15 = (p000.bzdl) p000.bzdm.f169519h.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x040c, code lost:
        if (r14.mo47037b() == false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x040e, code lost:
        r26 = r2;
        r2 = r14.f83945a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0412, code lost:
        if (r2 == null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0414, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0418, code lost:
        if (r15.f164950c != false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x041b, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0421, code lost:
        r4 = (p000.bzdm) r15.f164949b;
        r2.getClass();
        r23 = r8;
        r4.f169521a |= 1;
        r4.f169522b = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0435, code lost:
        r26 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0437, code lost:
        r22 = r4;
        r23 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x043f, code lost:
        if (r14.mo47036a() == false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0441, code lost:
        r2 = r14.f83946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0443, code lost:
        if (r2 == null) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0447, code lost:
        if (r15.f164950c != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x044a, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0450, code lost:
        r4 = (p000.bzdm) r15.f164949b;
        r2.getClass();
        r4.f169521a |= 2;
        r4.f169523c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0461, code lost:
        if (r3 == null) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0463, code lost:
        r2 = (p000.apag) r3.get(r14.f83945a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x046b, code lost:
        if (r2 == null) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046d, code lost:
        r8 = r3;
        r3 = r2.f83991b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0476, code lost:
        if (r15.f164950c != false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0479, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x047f, code lost:
        r14 = (p000.bzdm) r15.f164949b;
        r24 = r8;
        r14.f169521a |= 4;
        r14.f169525e = r3;
        r3 = r2.f83992c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0495, code lost:
        if (r15.f164950c != false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0498, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x049e, code lost:
        r8 = (p000.bzdm) r15.f164949b;
        r8.f169521a |= 8;
        r8.f169526f = r3;
        r15.mo74542a(r2.f83990a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04b3, code lost:
        if (p000.cgij.m145551i() == false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b5, code lost:
        r2 = r2.f83993d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b9, code lost:
        if (r15.f164950c != false) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04bc, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04c2, code lost:
        r3 = (p000.bzdm) r15.f164949b;
        r3.f169521a |= 32;
        r3.f169527g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04cf, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d2, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04d4, code lost:
        r12.mo74527a(r15);
        r2 = r26;
        r4 = r22;
        r8 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04e1, code lost:
        r26 = r2;
        r22 = r4;
        r23 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e7, code lost:
        if (r20 == null) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e9, code lost:
        r2 = r20;
        r3 = (java.util.Map) r2.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04f2, code lost:
        r2 = r20;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f6, code lost:
        r4 = m69956b(p000.bngx.m109368a((java.util.Collection) r10.f84089d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0502, code lost:
        if (r12.f164950c != false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0505, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x050b, code lost:
        ((p000.bzcu) r12.f164949b).f169416g = p000.bxvk.m124030de();
        r4 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x051d, code lost:
        if (r4.hasNext() == false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x051f, code lost:
        r8 = (p000.aozm) r4.next();
        r13 = (p000.bzdi) p000.bzdj.f169495h.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0531, code lost:
        if (r8.mo47037b() == false) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0533, code lost:
        r14 = r8.f83945a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0535, code lost:
        if (r14 == null) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0539, code lost:
        if (r13.f164950c != false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x053c, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0542, code lost:
        r15 = (p000.bzdj) r13.f164949b;
        r14.getClass();
        r20 = r2;
        r15.f169497a |= 1;
        r15.f169498b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0556, code lost:
        r20 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x055c, code lost:
        if (r8.mo47036a() == false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x055e, code lost:
        r2 = r8.f83946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0560, code lost:
        if (r2 == null) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0564, code lost:
        if (r13.f164950c != false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0567, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x056d, code lost:
        r14 = (p000.bzdj) r13.f164949b;
        r2.getClass();
        r14.f169497a |= 2;
        r14.f169499c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x057e, code lost:
        if (r3 == null) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0580, code lost:
        r2 = (p000.apag) r3.get(r8.f83945a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0588, code lost:
        if (r2 == null) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x058a, code lost:
        r14 = r2.f83991b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0592, code lost:
        if (r13.f164950c != false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0595, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x059b, code lost:
        r8 = (p000.bzdj) r13.f164949b;
        r24 = r3;
        r8.f169497a |= 4;
        r8.f169501e = r14;
        r14 = r2.f83992c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05b1, code lost:
        if (r13.f164950c != false) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05b4, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05ba, code lost:
        r3 = (p000.bzdj) r13.f164949b;
        r3.f169497a |= 8;
        r3.f169502f = r14;
        r13.mo74541a(r2.f83990a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05cc, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05cf, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d1, code lost:
        r12.mo74526a(r13);
        r2 = r20;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05da, code lost:
        r20 = r2;
        r2 = (java.util.Map) r7.get(r11);
        r3 = m69956b(p000.bngx.m109368a((java.util.Collection) r10.f84090e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05ee, code lost:
        if (r12.f164950c != false) goto L_0x05f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05f1, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f7, code lost:
        ((p000.bzcu) r12.f164949b).f169417h = p000.bxvk.m124030de();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0609, code lost:
        if (r3.hasNext() == false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x060b, code lost:
        r4 = (p000.aozm) r3.next();
        r8 = (p000.bzdn) p000.bzdo.f169528f.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x061d, code lost:
        if (r4.mo47037b() == false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x061f, code lost:
        r10 = r4.f83945a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0621, code lost:
        if (r10 == null) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0625, code lost:
        if (r8.f164950c != false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0628, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x062e, code lost:
        r13 = (p000.bzdo) r8.f164949b;
        r10.getClass();
        r13.f169530a |= 1;
        r13.f169531b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0641, code lost:
        if (r4.mo47036a() == false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0643, code lost:
        r10 = r4.f83946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0645, code lost:
        if (r10 == null) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0649, code lost:
        if (r8.f164950c != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x064c, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0652, code lost:
        r13 = (p000.bzdo) r8.f164949b;
        r10.getClass();
        r13.f169530a |= 2;
        r13.f169532c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0661, code lost:
        if (r2 == null) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0663, code lost:
        r8.mo74543a((java.util.Set) r2.get(r4.f83945a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x066e, code lost:
        r12.mo74528a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0672, code lost:
        if (r9 == null) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0674, code lost:
        r2 = (java.util.List) r9.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x067b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x067d, code lost:
        if (r2 == null) goto L_0x09fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x067f, code lost:
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0686, code lost:
        if (r12.f164950c == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0688, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x068e, code lost:
        ((p000.bzcu) r12.f164949b).f169420k = p000.bxvk.m124030de();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x069d, code lost:
        if (r4 >= r2.size()) goto L_0x09fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x069f, code lost:
        r8 = (p000.apai) r2.get(r4);
        r10 = p000.bzdq.f169536s.mo74144da();
        r13 = r8.f83997a.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06b3, code lost:
        if (r10.f164950c != false) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06b6, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06bc, code lost:
        r11 = (p000.bzdq) r10.f164949b;
        r15 = r11.f169538a | 1;
        r11.f169538a = r15;
        r11.f169539b = r13;
        r13 = r8.f84003g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06cc, code lost:
        if (r13 == null) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06ce, code lost:
        r13.getClass();
        r11.f169538a = r15 | 8;
        r11.f169540c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06db, code lost:
        if (p000.cgij.m145550h() == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06dd, code lost:
        r11 = (java.lang.Boolean) r3.get(((p000.bzdq) r10.f164949b).f169540c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06ec, code lost:
        if (r11 == null) goto L_0x0709;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06ee, code lost:
        r11 = r11.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06f4, code lost:
        if (r10.f164950c != false) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06f7, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06fd, code lost:
        r14 = (p000.bzdq) r10.f164949b;
        r14.f169538a = 32768 | r14.f169538a;
        r14.f169550m = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0709, code lost:
        r11 = p000.aytv.m84811a(r1.f83966a, ((p000.bzdq) r10.f164949b).f169540c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0717, code lost:
        if (r10.f164950c != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x071a, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0720, code lost:
        r14 = (p000.bzdq) r10.f164949b;
        r14.f169538a = 32768 | r14.f169538a;
        r14.f169550m = r11;
        r3.put(r14.f169540c, java.lang.Boolean.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0734, code lost:
        r11 = r8.f84004h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0736, code lost:
        if (r11 == null) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x073a, code lost:
        if (r10.f164950c != false) goto L_0x073d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x073d, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0743, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11.getClass();
        r13.f169538a |= 16;
        r13.f169541d = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0758, code lost:
        if (android.text.TextUtils.isEmpty(r8.f84010n) != false) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x075a, code lost:
        r11 = r8.f84010n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x075c, code lost:
        if (r11 == null) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0760, code lost:
        if (r10.f164950c != false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0763, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0769, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11.getClass();
        r13.f169538a |= 128;
        r13.f169543f = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x077a, code lost:
        if (r8.f84008l == false) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x077e, code lost:
        if (r10.f164950c != false) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0781, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0787, code lost:
        r11 = (p000.bzdq) r10.f164949b;
        r11.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        r11.f169549l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0798, code lost:
        if (p000.cgij.m145554l() == false) goto L_0x07b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x079a, code lost:
        r11 = r8.f84011o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x079c, code lost:
        if (r11 == null) goto L_0x07b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07a0, code lost:
        if (r10.f164950c != false) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07a3, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07a9, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11.getClass();
        r13.f169547j = r11;
        r13.f169538a |= 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07b8, code lost:
        r13 = r8.f84006j.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07c0, code lost:
        if (r10.f164950c != false) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07c3, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07c9, code lost:
        r11 = (p000.bzdq) r10.f164949b;
        r11.f169538a |= 1024;
        r11.f169545h = r13;
        r13 = (r8.f84007k.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07e1, code lost:
        if (r10.f164950c != false) goto L_0x07e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07e4, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07ea, code lost:
        r11 = (p000.bzdq) r10.f164949b;
        r15 = r11.f169538a | 2048;
        r11.f169538a = r15;
        r11.f169546i = r13;
        r13 = r8.f84013q;
        r14 = r13 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07fa, code lost:
        if (r13 == 0) goto L_0x09ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07fc, code lost:
        r11.f169544g = r14;
        r11.f169538a = r15 | 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0808, code lost:
        if (r0.equals(r8.f84003g) == false) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x080c, code lost:
        if (r8.f84005i != null) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x080e, code lost:
        r11 = r8.f83998b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0810, code lost:
        if (r11 == null) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0814, code lost:
        if (r10.f164950c != false) goto L_0x0817;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0817, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x081d, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11.getClass();
        r13.f169538a |= 32;
        r13.f169542e = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0836, code lost:
        if (p000.cgin.f186997a.mo83837b().mo83838a() == false) goto L_0x085d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x083e, code lost:
        if (r0.equals(r8.f84003g) != false) goto L_0x085d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0842, code lost:
        if (r8.f83998b == null) goto L_0x085d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0846, code lost:
        if (r10.f164950c != false) goto L_0x0849;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0849, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x084f, code lost:
        r11 = (p000.bzdq) r10.f164949b;
        r11.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r11.f169551n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0861, code lost:
        if (p000.cgiq.m145573c() == false) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x086d, code lost:
        if (p000.cgit.f187004a.mo83842c().mo83845c() != false) goto L_0x087e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0875, code lost:
        if (r0.equals(r8.f84003g) != false) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x087e, code lost:
        r11 = p000.bzds.f169570g.mo74144da();
        r13 = r8.f83998b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0886, code lost:
        if (r13 == null) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x088a, code lost:
        if (r11.f164950c != false) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x088d, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0893, code lost:
        r14 = (p000.bzds) r11.f164949b;
        r13.getClass();
        r14.f169572a |= 1;
        r14.f169573b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08a7, code lost:
        r13 = r8.f83999c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08a9, code lost:
        if (r13 == null) goto L_0x08c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08ad, code lost:
        if (r11.f164950c != false) goto L_0x08b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08b0, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08b6, code lost:
        r14 = (p000.bzds) r11.f164949b;
        r13.getClass();
        r14.f169572a |= 2;
        r14.f169574c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08ca, code lost:
        r13 = r8.f84000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08cc, code lost:
        if (r13 == null) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x08d0, code lost:
        if (r11.f164950c != false) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x08d3, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x08d9, code lost:
        r14 = (p000.bzds) r11.f164949b;
        r13.getClass();
        r14.f169572a |= 4;
        r14.f169575d = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x08e8, code lost:
        r13 = r8.f84001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x08ea, code lost:
        if (r13 == null) goto L_0x0906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08ee, code lost:
        if (r11.f164950c != false) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x08f1, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08f7, code lost:
        r14 = (p000.bzds) r11.f164949b;
        r13.getClass();
        r14.f169572a |= 8;
        r14.f169576e = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0906, code lost:
        r13 = r8.f84002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0908, code lost:
        if (r13 == null) goto L_0x0924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x090c, code lost:
        if (r11.f164950c != false) goto L_0x090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x090f, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0915, code lost:
        r14 = (p000.bzds) r11.f164949b;
        r13.getClass();
        r14.f169572a |= 16;
        r14.f169577f = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0926, code lost:
        if (r10.f164950c != false) goto L_0x0929;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0929, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x092f, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11 = (p000.bzds) r11.mo74062i();
        r11.getClass();
        r13.f169552o = r11;
        r13.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0949, code lost:
        if (p000.cgit.m145580b() == false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x094b, code lost:
        r11 = r8.f84009m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x094f, code lost:
        if (r10.f164950c != false) goto L_0x0952;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0952, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0958, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r13.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        r13.f169554q = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0974, code lost:
        if (p000.cgit.f187004a.mo83842c().mo83843a() == false) goto L_0x0995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0976, code lost:
        r11 = r8.f84005i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0978, code lost:
        if (r11 == null) goto L_0x0995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x097c, code lost:
        if (r10.f164950c != false) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x097f, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0985, code lost:
        r13 = (p000.bzdq) r10.f164949b;
        r11.getClass();
        r13.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        r13.f169553p = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0999, code lost:
        if (p000.cgjb.m145681b() == false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x099b, code lost:
        r8 = r8.f84012p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x099d, code lost:
        if (r8 != null) goto L_0x09a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09a2, code lost:
        r11 = r8.size();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09a7, code lost:
        if (r13 >= r11) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09a9, code lost:
        r14 = (p000.bzcr) r8.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09b1, code lost:
        if (r10.f164950c != false) goto L_0x09b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09b4, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09ba, code lost:
        r15 = (p000.bzdq) r10.f164949b;
        r14.getClass();
        r24 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09c9, code lost:
        if (r15.f169555r.mo73666a() != false) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09cb, code lost:
        r15.f169555r = p000.bxvk.m124021a(r15.f169555r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09d3, code lost:
        r15.f169555r.add(r14);
        r13 = r13 + 1;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09e2, code lost:
        r12.mo74525a(r10);
        r4 = r4 + 1;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09fa, code lost:
        r5.mo74535a(r12);
        r6 = r6 + 1;
        r2 = r26;
        r4 = r22;
        r8 = r23;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a0a, code lost:
        r0 = p000.apak.m69965a(r1.f83966a);
        r3 = (p000.bxvd) r0.mo74142c(5);
        r3.mo73625a((p000.bxvk) r0);
        r3 = (p000.bzdb) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a20, code lost:
        if (p000.cgij.m145552j() != false) goto L_0x0a23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a23, code lost:
        if (r29 == null) goto L_0x0a47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a27, code lost:
        if (r3.f164950c != false) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a2a, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a30, code lost:
        r4 = p000.bzdh.f169466A;
        ((p000.bzdh) r3.f164949b).f169485q = p000.bxvk.m124030de();
        r3.mo74540a(java.util.Arrays.asList(m69952a(r29)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a47, code lost:
        r6 = ((p000.bzdh) r3.f164949b).f169477i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a4f, code lost:
        if (r5.f164950c != false) goto L_0x0a52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a52, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a58, code lost:
        r0 = (p000.bzcx) r5.f164949b;
        r4 = r0.f169431a | 8;
        r0.f169431a = r4;
        r0.f169435e = r6;
        r6 = ((p000.bzdh) r3.f164949b).f169478j;
        r0.f169431a = r4 | 32;
        r0.f169437g = r6;
        r3 = (p000.bzdh) r3.mo74062i();
        r3.getClass();
        r0.f169436f = r3;
        r0.f169431a |= 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a83, code lost:
        if (r5.f164950c != false) goto L_0x0a86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a86, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a8c, code lost:
        ((p000.bzcx) r5.f164949b).f169434d = p000.bxvk.m124029dd();
        r5.mo74536a(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a9f, code lost:
        if (r28.f84034e == false) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0aa3, code lost:
        if (r5.f164950c != false) goto L_0x0aa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0aa6, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0aac, code lost:
        p000.bzcx.m125673a((p000.bzcx) r5.f164949b);
        r0 = ((p000.bzcx) r5.mo74062i()).f169432b;
        r3 = r0.size();
        r4 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0ac1, code lost:
        if (r12 >= r3) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0ac3, code lost:
        r6 = r4 + 1;
        r7 = (p000.bzcu) r0.get(r12);
        r8 = (p000.bxvd) r7.mo74142c(5);
        r8.mo73625a((p000.bxvk) r7);
        r8 = (p000.bzcs) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0ad8, code lost:
        if (r8.f164950c != false) goto L_0x0adc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0adc, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0ae2, code lost:
        p000.bzcu.m125662a((p000.bzcu) r8.f164949b);
        r5.mo74534a(r4, r8);
        r12 = r12 + 1;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0af6, code lost:
        return (p000.bzcx) r5.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0af7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        if (r11 == null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0af8, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0afa, code lost:
        if (r19 != null) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0afc, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0aff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        r20 = r10;
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        p000.apaj.f84014e.mo46987e("CP2 Query Exception when fetching phone info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
        p000.apaj.f84014e.mo46980a(r0, "CP2 Query Exception when fetching phone info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        if (r11 == null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0156, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
        r12 = new java.lang.String[]{"raw_contact_id", "contact_id", "data1"};
        r15 = p000.bnmt.m109794a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r10 = r1.f83966a.getContentResolver();
        r11 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        r13 = m69945a("contact_id", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0175, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r10 = r10.query(r11, r12, r13, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
        if (r10 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
        if (r10.moveToNext() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
        r0 = java.lang.Long.valueOf(r10.getLong(r10.getColumnIndex("contact_id")));
        r11 = java.lang.Long.valueOf(r10.getLong(r10.getColumnIndex("raw_contact_id")));
        r12 = r10.getString(r10.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
        if (r7.containsKey(r0) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        r7.put(r0, new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b3, code lost:
        r0 = (java.util.Map) r7.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        if (r0 != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c0, code lost:
        if (r0.containsKey(r12) != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        r0.put(r12, new java.util.LinkedHashSet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ca, code lost:
        ((java.util.Set) r0.get(r12)).add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d8, code lost:
        p000.apaj.f84014e.mo46983c("CP2 failed to fetch Postal info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01df, code lost:
        if (r10 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e2, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ec, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ed, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f5, code lost:
        if (p000.cgjy.m145760g() == false) goto L_0x01f7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203 A[Catch:{ all -> 0x0af7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116 A[Catch:{ SQLiteException -> 0x012c, all -> 0x0116 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0afc  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b05  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0143 A[SYNTHETIC, Splitter:B:58:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f A[Catch:{ all -> 0x0b00 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:64:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f7 A[SYNTHETIC, Splitter:B:99:0x01f7] */
    /* renamed from: a */
    public final bzcx mo47057a(List list, Set set, apal apal, btfe[] btfeArr) {
        Map map;
        Cursor cursor;
        long j;
        apag apag;
        ArrayList arrayList = list;
        apal apal2 = apal;
        ArrayList a = bnkn.m109661a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.add(Long.valueOf(((apbc) arrayList.get(i)).f84086a));
        }
        Map a2 = m69948a(a, apal2);
        Map a3 = m69947a(a);
        int i2 = apaa.f83970a;
        String[] strArr = cgij.m145551i() ? f84018m : f84017l;
        HashMap a4 = bnmt.m109794a();
        Cursor cursor2 = null;
        try {
            Map map2 = null;
            HashMap hashMap = a4;
            cursor = this.f83966a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, strArr, m69945a("contact_id", a), null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id")));
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        String string = cursor.getString(cursor.getColumnIndex("data1"));
                        if (!hashMap.containsKey(valueOf)) {
                            hashMap.put(valueOf, new HashMap());
                        }
                        Map map3 = (Map) hashMap.get(valueOf);
                        if (map3 == null) {
                            map2 = a3;
                        } else if (!map3.containsKey(string)) {
                            long j2 = 0;
                            if (!cgij.m145547e()) {
                                j2 = cursor.getLong(cursor.getColumnIndex("times_used"));
                                j = (cursor.getLong(cursor.getColumnIndex("last_time_used")) / 86400000) * 86400000;
                            } else {
                                j = 0;
                            }
                            if (cgij.m145551i()) {
                                map2 = a3;
                                apag = new apag(Long.valueOf(j2), Long.valueOf(j), cursor.getInt(cursor.getColumnIndex("is_super_primary")));
                            } else {
                                map2 = a3;
                                apag = new apag(Long.valueOf(j2), Long.valueOf(j));
                            }
                            map3.put(string, apag);
                        } else {
                            map2 = a3;
                        }
                        ((apag) map3.get(string)).mo47054a(valueOf2);
                        a3 = map2;
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            if (cgjy.m145760g()) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                    }
                }
                map = a3;
            } else {
                map = a3;
                f84014e.mo46983c("CP2 failed to fetch Phone info.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Map map4 = a3;
            cursor = null;
            if (cgjy.m145760g()) {
            }
        } catch (Throwable th3) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47058a(apal apal, bzcx bzcx, String str) {
        apal apal2 = apal;
        bzcx bzcx2 = bzcx;
        String str2 = str;
        bxwc bxwc = bzcx2.f169432b;
        int size = bxwc.size();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            byte[] k = ((bzcu) bxwc.get(i3)).mo73642k();
            if (this.f84021h) {
                this.f84023j.mo47010a();
            }
            boolean a = mo47045a(apal2, k, str2);
            if (!a) {
                i2++;
            } else {
                i++;
            }
            z &= a;
            if (this.f84021h) {
                this.f84023j.mo47011a(this.f83966a, "contacts_logger:log_contact");
            }
        }
        bxvw bxvw = bzcx2.f169434d;
        int size2 = bxvw.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < size2) {
            long longValue = ((Long) bxvw.get(i4)).longValue();
            bzcs bzcs = (bzcs) bzcu.f169408q.mo74144da();
            if (bzcs.f164950c) {
                bzcs.mo74035c();
                bzcs.f164950c = false;
            }
            bzcu bzcu = (bzcu) bzcs.f164949b;
            bxvw bxvw2 = bxvw;
            bzcu.f169410a |= 1;
            bzcu.f169411b = longValue;
            bzcu.m125663b(bzcu);
            byte[] k2 = ((bzcu) bzcs.mo74062i()).mo73642k();
            if (this.f84021h) {
                this.f84023j.mo47010a();
            }
            boolean a2 = mo47045a(apal2, k2, str2);
            if (!a2) {
                i6++;
            } else {
                i5++;
            }
            z &= a2;
            if (this.f84021h) {
                this.f84023j.mo47011a(this.f83966a, "contacts_logger:log_delete");
            }
            i4++;
            bxvw = bxvw2;
        }
        aoyj a3 = aoyj.m69819a();
        bxvd da = bzdx.f169595q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzdx bzdx = (bzdx) da.f164949b;
        bzdx.f169601e = i;
        bzdx.f169602f = i2;
        bzdx.f169603g = i5;
        bzdx.f169604h = i6;
        bzdx bzdx2 = (bzdx) da.mo74062i();
        bxvd da2 = bzel.f169667p.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzdx2.getClass();
        ((bzel) da2.f164949b).f169675g = bzdx2;
        a3.mo46992a(da2);
        bzdh bzdh = bzcx2.f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        byte[] k3 = bzdh.mo73642k();
        if (cgij.m145549g()) {
            this.f84023j.mo47010a();
        }
        boolean a4 = aozz.m69930a(k3, str2, this.f84026q) & z;
        if (this.f84021h) {
            this.f84023j.mo47011a(this.f83966a, "contacts_logger:log_device_info");
        }
        return a4;
    }
}

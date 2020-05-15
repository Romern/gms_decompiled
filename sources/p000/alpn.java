package p000;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: alpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpn {

    /* renamed from: e */
    public static Set f74028e;

    /* renamed from: a */
    public int f74029a = 20;

    /* renamed from: b */
    public int f74030b = 5;

    /* renamed from: c */
    public final andd f74031c;

    /* renamed from: d */
    public boolean f74032d = true;

    /* renamed from: f */
    public final Context f74033f;

    /* renamed from: g */
    public final alpj f74034g;

    /* renamed from: h */
    public int f74035h;

    /* renamed from: i */
    public int f74036i = 2;

    public alpn(Context context) {
        andd andd = new andd(context);
        this.f74033f = context;
        this.f74034g = new alpj();
        this.f74031c = andd;
        amig.m62939a();
        this.f74035h = 0;
    }

    /* renamed from: a */
    public static boolean m61478a(btfi btfi) {
        return !btfi.f148664g.isEmpty() && btfi.f148664g.matches(".*sim.*|.*SIM.*");
    }

    /* renamed from: a */
    public final long mo40629a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Groups.CONTENT_URI).withValue("account_name", str2).withValue("account_type", "com.google").withValue("group_visible", 1).withValue("title", str).build());
        try {
            return Long.parseLong(this.f74033f.getContentResolver().applyBatch("com.android.contacts", arrayList)[0].uri.getLastPathSegment());
        } catch (OperationApplicationException | RemoteException e) {
            Log.e("WriteContactsHelper", "Failed to create new group for contacts to be restored.", e);
            return -1;
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:97:0x0277 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:668:0x0277 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:670:0x0277 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:111:0x02e6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:105:0x02cb */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.InterruptedException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v15, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v15, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v21, resolved type: java.util.HashMap} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x027d, code lost:
        r8 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028f, code lost:
        if (r5.contains(r8) == false) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0291, code lost:
        r12 = r4.getString(r4.getColumnIndex("data1"));
        r13 = r4.getInt(r4.getColumnIndex("data2"));
        r14 = r4.getString(r4.getColumnIndex("data3"));
        r15 = r4.getInt(r4.getColumnIndex("is_primary"));
        r3 = r4.getInt(r4.getColumnIndex("is_super_primary"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c7, code lost:
        if (r1.containsKey(r8) != false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c9, code lost:
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1.put(r8, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d4, code lost:
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d6, code lost:
        r8 = (java.util.List) r1.get(r8);
        r11 = p000.btfg.f148645f.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e2, code lost:
        if (r12 == null) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e4, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e8, code lost:
        if (r11.f164950c != false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02eb, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f2, code lost:
        r12.getClass();
        ((p000.btfg) r11.f164949b).f148647a = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fc, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0300, code lost:
        if (r11.f164950c != false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0303, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0309, code lost:
        r1 = (p000.btfg) r11.f164949b;
        r1.f148649c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030f, code lost:
        if (r14 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0311, code lost:
        r14.getClass();
        r1.f148648b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0317, code lost:
        if (r15 != 1) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0319, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031b, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031c, code lost:
        r1.f148650d = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031e, code lost:
        if (r3 != 1) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0320, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0322, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0323, code lost:
        r1.f148651e = r3;
        r8.add((p000.btfg) r11.mo74062i());
        r11 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0336, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0337, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033a, code lost:
        r20 = r1;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0343, code lost:
        r20 = r1;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0348, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0349, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x034c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034d, code lost:
        r20 = r1;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0351, code lost:
        r1 = r0;
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0353, code lost:
        r20 = r1;
        r19 = r11;
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Postal info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035e, code lost:
        if (r4 != null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0365, code lost:
        r0 = e;
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0367, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0368, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036d, code lost:
        r20 = r1;
        r19 = r11;
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching postal info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037a, code lost:
        if (r4 != null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r1 = r2.mo41738c(r5);
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r4 = r2.mo41733a("vnd.android.cursor.item/relation", p000.andl.f76688g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038e, code lost:
        if (r4 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0394, code lost:
        if (r4.moveToNext() == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0396, code lost:
        r8 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a8, code lost:
        if (r5.contains(r8) == false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03aa, code lost:
        r11 = r4.getString(r4.getColumnIndex("data1"));
        r12 = r4.getInt(r4.getColumnIndex("data2"));
        r13 = r4.getString(r4.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03cc, code lost:
        if (r3.containsKey(r8) != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ce, code lost:
        r3.put(r8, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03d6, code lost:
        r8 = (java.util.ArrayList) r3.get(r8);
        r14 = p000.btfn.f148713d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e2, code lost:
        if (r11 == null) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e6, code lost:
        if (r14.f164950c != false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e9, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f0, code lost:
        r11.getClass();
        ((p000.btfn) r14.f164949b).f148715a = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03fb, code lost:
        if (r14.f164950c != false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fe, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0404, code lost:
        r11 = (p000.btfn) r14.f164949b;
        r11.f148716b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x040a, code lost:
        if (r13 != null) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x040d, code lost:
        r13.getClass();
        r11.f148717c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0412, code lost:
        r8.add((p000.btfn) r14.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x041e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0421, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0422, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0424, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query CP2 to fetch relation info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x042b, code lost:
        if (r4 != null) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0432, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0433, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0437, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0438, code lost:
        r8 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching relation info", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0441, code lost:
        if (r4 != null) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r8 = r2.mo41733a("vnd.android.cursor.item/photo", p000.andl.f76692k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0451, code lost:
        if (r8 == null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0457, code lost:
        if (r8.moveToNext() == false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0459, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x046b, code lost:
        if (r5.contains(r11) == false) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x046d, code lost:
        r12 = r8.getString(r8.getColumnIndex("photo_uri"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x047b, code lost:
        if (android.text.TextUtils.isEmpty(r12) != false) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0481, code lost:
        if (r4.containsKey(r11) != false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0483, code lost:
        r4.put(r11, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x048b, code lost:
        r11 = (java.util.List) r4.get(r11);
        r13 = p000.btfm.f148710b.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0499, code lost:
        if (r13.f164950c != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x049c, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a2, code lost:
        r12.getClass();
        ((p000.btfm) r13.f164949b).f148712a = r12;
        r11.add((p000.btfm) r13.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04b6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ba, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04bc, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Photo info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04c3, code lost:
        if (r8 != null) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04cb, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04d0, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching photo url info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d9, code lost:
        if (r8 != null) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        r8 = r2.mo41733a("vnd.android.cursor.item/note", p000.andl.f76691j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04e4, code lost:
        if (r8 == null) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04ea, code lost:
        if (r8.moveToNext() == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04ec, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04fe, code lost:
        if (r7.containsKey(r11) == false) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0500, code lost:
        ((p000.andk) r7.get(r11)).f76674f = r8.getString(r8.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0513, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0514, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0517, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0518, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x051a, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Note info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0521, code lost:
        if (r8 != null) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0528, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0529, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x052d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x052e, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0537, code lost:
        if (r8 != null) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r2.mo41737b(r7);
        r2.mo41735a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r8 = android.os.Build.VERSION.SDK_INT;
        r8 = r2.mo41733a("vnd.android.cursor.item/name", p000.andl.f76693l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x054a, code lost:
        if (r8 == null) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0550, code lost:
        if (r8.moveToNext() == false) goto L_0x06e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0552, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0564, code lost:
        if (r7.containsKey(r11) == false) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0566, code lost:
        r12 = p000.btfo.f148718l.mo74144da();
        r13 = r8.getString(r8.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0578, code lost:
        if (r12.f164950c != false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x057b, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0581, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148720a = r13;
        r13 = r8.getString(r8.getColumnIndex("data2"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0596, code lost:
        if (r12.f164950c != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0599, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x059f, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148721b = r13;
        r13 = r8.getString(r8.getColumnIndex("data5"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05b4, code lost:
        if (r12.f164950c != false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05b7, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05bd, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148722c = r13;
        r13 = r8.getString(r8.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05d2, code lost:
        if (r12.f164950c != false) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05d5, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05db, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148723d = r13;
        r13 = android.os.Build.VERSION.SDK_INT;
        r13 = java.lang.Integer.valueOf(r8.getInt(r8.getColumnIndex("data10"))).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05fa, code lost:
        if (r12.f164950c != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05fd, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0603, code lost:
        ((p000.btfo) r12.f164949b).f148724e = r13;
        r13 = r8.getString(r8.getColumnIndex("data4"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0615, code lost:
        if (r12.f164950c != false) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0618, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x061e, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148725f = r13;
        r13 = r8.getString(r8.getColumnIndex("data6"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0633, code lost:
        if (r12.f164950c != false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0636, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x063c, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148726g = r13;
        r13 = r8.getString(r8.getColumnIndex("data7"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0651, code lost:
        if (r12.f164950c != false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0654, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x065a, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148727h = r13;
        r13 = r8.getString(r8.getColumnIndex("data8"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x066f, code lost:
        if (r12.f164950c != false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0672, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0678, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148728i = r13;
        r13 = r8.getString(r8.getColumnIndex("data9"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x068d, code lost:
        if (r12.f164950c != false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0690, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0696, code lost:
        r13.getClass();
        ((p000.btfo) r12.f164949b).f148729j = r13;
        r13 = android.os.Build.VERSION.SDK_INT;
        r13 = java.lang.Integer.valueOf(r8.getInt(r8.getColumnIndex("data11"))).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06b5, code lost:
        if (r12.f164950c != false) goto L_0x06b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06b8, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06be, code lost:
        ((p000.btfo) r12.f164949b).f148730k = r13;
        ((p000.andk) r7.get(r11)).f76679k = (p000.btfo) r12.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06d5, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06d9, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06db, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch structured name; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06e2, code lost:
        if (r8 == null) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06e9, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06ee, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06f7, code lost:
        if (r8 != null) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0709, code lost:
        if (((java.lang.Boolean) p000.amfq.f74867a.mo41191a()).booleanValue() != false) goto L_0x070c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:?, code lost:
        r8 = r2.mo41733a("vnd.android.cursor.item/group_membership", p000.andl.f76694m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0714, code lost:
        if (r8 == null) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x071a, code lost:
        if (r8.moveToNext() == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x071c, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x072e, code lost:
        if (r7.containsKey(r11) == false) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0730, code lost:
        ((p000.andk) r7.get(r11)).f76682n.add(java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("data1"))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x074a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x074b, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x074e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x074f, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0751, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch group membership info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0758, code lost:
        if (r8 == null) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x075e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x075f, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0763, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0764, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        android.util.Log.e("ReadContactsHelper", "CP2 threw an exception when fetching group membership info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x076d, code lost:
        if (r8 != null) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        r8 = new p000.btfi[r7.size()];
        r11 = p000.andl.m64075a();
        r5 = r5.iterator();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0783, code lost:
        if (r5.hasNext() == false) goto L_0x0a78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0785, code lost:
        r13 = (java.lang.Long) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x078f, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0791, code lost:
        r14 = (p000.andk) r7.get(r13);
        r15 = (p000.btfh) p000.btfi.f148652E.mo74144da();
        r17 = r7;
        r21 = r8;
        r7 = r13.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07a9, code lost:
        if (r15.f164950c != false) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07ac, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07b2, code lost:
        r13 = (p000.btfi) r15.f164949b;
        r13.f148670m = r7;
        r7 = r14.f76671c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07ba, code lost:
        if (r7 == null) goto L_0x07c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07bc, code lost:
        r7.getClass();
        r13.f148669l = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07c1, code lost:
        r7 = r14.f76670b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07c9, code lost:
        if (r15.f164950c != false) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07cc, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07d2, code lost:
        ((p000.btfi) r15.f164949b).f148671n = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07dc, code lost:
        if (r14.mo41731a() != false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07df, code lost:
        r7 = r14.f76672d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07e3, code lost:
        if (r15.f164950c != false) goto L_0x07e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07e6, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07ec, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148664g = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07fb, code lost:
        if (android.text.TextUtils.isEmpty(r14.f76675g) == false) goto L_0x07fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07fe, code lost:
        r7 = r14.f76675g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0802, code lost:
        if (r15.f164950c != false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0805, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x080b, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148658a = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x081a, code lost:
        if (android.text.TextUtils.isEmpty(r14.f76676h) == false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x081d, code lost:
        r7 = r14.f76676h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0821, code lost:
        if (r15.f164950c != false) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0824, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x082a, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148659b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0839, code lost:
        if (android.text.TextUtils.isEmpty(r14.f76674f) != false) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x083b, code lost:
        r7 = r14.f76674f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x083f, code lost:
        if (r15.f164950c != false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0842, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0848, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148672o = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0851, code lost:
        r7 = r14.f76677i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0853, code lost:
        if (r7 == null) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x085b, code lost:
        if (android.text.TextUtils.isEmpty(r7.f148695a) != false) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x085d, code lost:
        r7 = r14.f76677i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0861, code lost:
        if (r15.f164950c != false) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0864, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x086a, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148675r = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0873, code lost:
        r7 = r14.f76679k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0875, code lost:
        if (r7 == null) goto L_0x088b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0879, code lost:
        if (r15.f164950c != false) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x087c, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0882, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148660c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x088b, code lost:
        r7 = r14.f76678j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x088d, code lost:
        if (r7 == null) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0891, code lost:
        if (r15.f164950c != false) goto L_0x0894;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0894, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x089a, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148678u = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x08a7, code lost:
        if (r14.mo41732b() != false) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x08aa, code lost:
        r7 = r14.f76673e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08ae, code lost:
        if (r15.f164950c != false) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08b1, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x08b7, code lost:
        r7.getClass();
        ((p000.btfi) r15.f164949b).f148681x = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x08c6, code lost:
        if (r14.f76682n.isEmpty() != false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x08c8, code lost:
        r15.mo70756b(p000.bqcr.m112598b(p000.sqc.m35961a((java.lang.Long[]) r14.f76682n.toArray(new java.lang.Long[0]))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08de, code lost:
        r7 = r14.f76681m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x08e5, code lost:
        if (r7 > 0) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x08ea, code lost:
        if (r15.f164950c != false) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08ed, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08f3, code lost:
        ((p000.btfi) r15.f164949b).f148665h = r7;
        r7 = r14.f76680l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08fd, code lost:
        if (r7 <= 1240790401000L) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0905, code lost:
        if (r7 >= java.lang.System.currentTimeMillis()) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0907, code lost:
        r7 = r14.f76680l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x090b, code lost:
        if (r15.f164950c != false) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x090e, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0914, code lost:
        ((p000.btfi) r15.f164949b).f148666i = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x091a, code lost:
        r7 = (p000.andj) r6.get(r14.f76670b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0922, code lost:
        if (r7 != null) goto L_0x0929;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0924, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x092d, code lost:
        if (r7.mo41721b() <= 0) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x092f, code lost:
        r8 = r7.mo41721b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0935, code lost:
        if (r15.f164950c != false) goto L_0x0938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0938, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x093e, code lost:
        ((p000.btfi) r15.f164949b).f148667j = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x094a, code lost:
        if (r7.mo41722c() <= 1240790401000L) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0956, code lost:
        if (r7.mo41722c() >= java.lang.System.currentTimeMillis()) goto L_0x0972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0958, code lost:
        r13 = r6;
        r5 = r7.mo41722c();
        r22 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0962, code lost:
        if (r15.f164950c != false) goto L_0x0965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0965, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x096b, code lost:
        ((p000.btfi) r15.f164949b).f148668k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0972, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0976, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x097a, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x097d, code lost:
        if (r11 == false) goto L_0x0994;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x097f, code lost:
        r5 = r7.mo41727g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0985, code lost:
        if (r15.f164950c != false) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0988, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x098e, code lost:
        ((p000.btfi) r15.f164949b).f148657D = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0994, code lost:
        r5 = r7.mo41723d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x099a, code lost:
        if (r15.f164950c != false) goto L_0x099d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x099d, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x09a3, code lost:
        ((p000.btfi) r15.f164949b).f148676s = r5;
        r5 = r7.mo41724e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x09af, code lost:
        if (r15.f164950c != false) goto L_0x09b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x09b2, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x09b8, code lost:
        ((p000.btfi) r15.f164949b).f148683z = r5;
        r5 = r7.mo41726f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x09c4, code lost:
        if (r15.f164950c != false) goto L_0x09c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x09c7, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x09cd, code lost:
        ((p000.btfi) r15.f164949b).f148654A = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x09d3, code lost:
        r5 = (java.util.List) r9.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x09db, code lost:
        if (r5 != null) goto L_0x09de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x09de, code lost:
        r15.mo70755a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x09e1, code lost:
        r5 = (java.util.List) r10.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x09e9, code lost:
        if (r5 != null) goto L_0x09ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x09ec, code lost:
        r15.mo70758d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x09ef, code lost:
        r6 = r19;
        r5 = (java.util.List) r6.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x09f9, code lost:
        if (r5 != null) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x09fc, code lost:
        r15.mo70761g(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x09ff, code lost:
        r5 = (java.util.List) r1.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a07, code lost:
        if (r5 != null) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0a0a, code lost:
        r15.mo70757c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0a0d, code lost:
        r5 = (java.util.List) r3.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0a15, code lost:
        if (r5 != null) goto L_0x0a18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a18, code lost:
        r15.mo70760f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0a1b, code lost:
        r7 = r20;
        r5 = (java.util.List) r7.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0a25, code lost:
        if (r5 != null) goto L_0x0a28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0a28, code lost:
        r15.mo70759e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0a2b, code lost:
        r5 = (java.util.List) r4.get(r14.f76669a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0a33, code lost:
        if (r5 == null) goto L_0x0a5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0a37, code lost:
        if (r15.f164950c != false) goto L_0x0a3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0a3b, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0a41, code lost:
        r14 = (p000.btfi) r15.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a4b, code lost:
        if (r14.f148682y.mo73666a() != false) goto L_0x0a55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0a4d, code lost:
        r14.f148682y = p000.bxvk.m124021a(r14.f148682y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0a55, code lost:
        p000.bxsy.m123078a(r5, r14.f148682y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0a5a, code lost:
        r21[r12] = (p000.btfi) r15.mo74062i();
        r19 = r6;
        r20 = r7;
        r12 = r12 + 1;
        r6 = r13;
        r7 = r17;
        r8 = r21;
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a77, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0a78, code lost:
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:?, code lost:
        r1 = (p000.btel) p000.btem.f148532c.mo74144da();
        r1.mo70754a(java.util.Arrays.asList(r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0a91, code lost:
        return (p000.btem) r1.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0a92, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0a93, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0a96, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0a97, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0a98, code lost:
        if (r8 != null) goto L_0x0a9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0a9d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0a9e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0a9f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0aa0, code lost:
        if (r8 != null) goto L_0x0aa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0aa2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0aa5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0aa6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0aa7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0aa8, code lost:
        if (r8 != null) goto L_0x0aaa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0aaa, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0aad, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0aae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0aaf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ab0, code lost:
        if (r8 != null) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0ab2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0ab5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0ab6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0ab7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0ab8, code lost:
        if (r4 != null) goto L_0x0aba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0aba, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0abd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0abe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0abf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0ac0, code lost:
        if (r4 != null) goto L_0x0ac2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0ac2, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ac5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0b6e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0b6f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0b73, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0b74, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0243, code lost:
        if (r12 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0259, code lost:
        if (r12 != null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1 = new java.util.HashMap();
        r19 = r2.f76698a.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r20 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        r4 = r19.query(r20, p000.andl.f76690i, null, null, null);
        r19 = r19;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0275, code lost:
        if (r4 == null) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027b, code lost:
        if (r4.moveToNext() == false) goto L_0x0343;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0348 A[Catch:{ SQLiteException -> 0x0365, all -> 0x0348 }, ExcHandler: all (r0v47 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x0365, all -> 0x0348 }]), Splitter:B:97:0x0277] */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0a9a A[SYNTHETIC, Splitter:B:557:0x0a9a] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0aa2 A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x0aaa A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x0ab2 A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x0aba A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0ac2 A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0aca A[Catch:{ all -> 0x0a9e, all -> 0x0b6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0b1a A[SYNTHETIC, Splitter:B:609:0x0b1a] */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0b6a A[SYNTHETIC, Splitter:B:631:0x0b6a] */
    /* renamed from: a */
    public final btem mo40630a() {
        String str;
        String str2;
        InterruptedException interruptedException;
        Cursor cursor;
        Throwable th;
        SQLiteException sQLiteException;
        Cursor cursor2;
        Throwable th2;
        SQLiteException sQLiteException2;
        Cursor cursor3;
        Throwable th3;
        SQLiteException sQLiteException3;
        long j;
        boolean z;
        boolean z2;
        try {
            andl andl = new andl(this.f74033f);
            synchronized (andl) {
                sdo.m34970a(true);
            }
            new andg(andl.f76698a).mo41730a();
            HashMap hashMap = new HashMap();
            try {
                cursor = andl.f76698a.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build(), !andl.m64075a() ? andl.f76683b : andl.f76684c, null, null, null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            long j2 = cursor.getLong(cursor.getColumnIndex("_id"));
                            int i = cursor.getInt(cursor.getColumnIndex("times_contacted"));
                            long j3 = cursor.getLong(cursor.getColumnIndex("last_time_contacted"));
                            int i2 = cursor.getInt(cursor.getColumnIndex("starred"));
                            String string = cursor.getString(cursor.getColumnIndex("custom_ringtone"));
                            int i3 = cursor.getInt(cursor.getColumnIndex("send_to_voicemail"));
                            int i4 = Build.VERSION.SDK_INT;
                            if (cursor.getColumnIndex("contact_last_updated_timestamp") >= 0) {
                                j = cursor.getLong(cursor.getColumnIndex("contact_last_updated_timestamp"));
                            } else {
                                j = 0;
                            }
                            if (i2 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z3 = !TextUtils.isEmpty(string);
                            if (i3 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            hashMap.put(Long.valueOf(j2), new andf(j2, i, j3, z, z3, z2, j));
                        } catch (SQLiteException e) {
                            sQLiteException = e;
                            try {
                                Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException);
                                String valueOf = String.valueOf(sQLiteException);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                                sb.append("Fetching Contact Ids query failed.");
                                sb.append(valueOf);
                                throw new andi(sb.toString());
                            } catch (Throwable th4) {
                                th = th4;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    cursor.close();
                    HashSet hashSet = new HashSet(hashMap.keySet());
                    HashMap hashMap2 = new HashMap();
                    try {
                        cursor2 = andl.f76698a.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, andl.f76685d, null, null, null);
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                try {
                                    Long valueOf2 = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("_id")));
                                    Long valueOf3 = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("contact_id")));
                                    if (hashSet.contains(valueOf3)) {
                                        String string2 = cursor2.getString(cursor2.getColumnIndex("sourceid"));
                                        String string3 = cursor2.getString(cursor2.getColumnIndex("account_type"));
                                        String string4 = cursor2.getString(cursor2.getColumnIndex("account_name"));
                                        cursor2.getString(cursor2.getColumnIndex("data_set"));
                                        andk andk = new andk(valueOf2, valueOf3, string2, string3, string4, cursor2.getInt(cursor2.getColumnIndex("times_contacted")), cursor2.getLong(cursor2.getColumnIndex("last_time_contacted")), cursor2.getString(cursor2.getColumnIndex("display_name")), cursor2.getString(cursor2.getColumnIndex("display_name_alt")));
                                        if (hashMap2.containsKey(valueOf2)) {
                                            Log.e("ReadContactsHelper", "Raw contact id already exists, this should not happen.");
                                        } else {
                                            hashMap2.put(valueOf2, andk);
                                        }
                                    }
                                } catch (SQLiteException e2) {
                                    sQLiteException2 = e2;
                                    try {
                                        Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2);
                                        String valueOf4 = String.valueOf(sQLiteException2);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
                                        sb2.append("Fetching raw contacts query failed.");
                                        sb2.append(valueOf4);
                                        throw new andi(sb2.toString());
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        if (cursor2 != null) {
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    if (cursor2 != null) {
                                    }
                                    throw th2;
                                }
                            }
                            cursor2.close();
                            HashSet hashSet2 = new HashSet(hashMap2.keySet());
                            Map a = andl.mo41734a(hashSet2);
                            Map b = andl.mo41736b(hashSet2);
                            HashMap hashMap3 = new HashMap();
                            try {
                                cursor3 = andl.mo41733a("vnd.android.cursor.item/website", andl.f76686e);
                                if (cursor3 != null) {
                                    while (cursor3.moveToNext()) {
                                        try {
                                            Long valueOf5 = Long.valueOf(cursor3.getLong(cursor3.getColumnIndex("raw_contact_id")));
                                            if (hashSet2.contains(valueOf5)) {
                                                String string5 = cursor3.getString(cursor3.getColumnIndex("data1"));
                                                int i5 = cursor3.getInt(cursor3.getColumnIndex("data2"));
                                                String string6 = cursor3.getString(cursor3.getColumnIndex("data3"));
                                                if (!hashMap3.containsKey(valueOf5)) {
                                                    hashMap3.put(valueOf5, new ArrayList());
                                                }
                                                ArrayList arrayList = (ArrayList) hashMap3.get(valueOf5);
                                                bxvd da = btfp.f148731d.mo74144da();
                                                if (string5 != null) {
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    string5.getClass();
                                                    ((btfp) da.f164949b).f148733a = string5;
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                btfp btfp = (btfp) da.f164949b;
                                                btfp.f148734b = i5;
                                                if (string6 != null) {
                                                    string6.getClass();
                                                    btfp.f148735c = string6;
                                                }
                                                arrayList.add((btfp) da.mo74062i());
                                            }
                                        } catch (SQLiteException e3) {
                                            sQLiteException3 = e3;
                                            try {
                                                Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching website info", sQLiteException3);
                                            } catch (Throwable th8) {
                                                th3 = th8;
                                                if (cursor3 != null) {
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th9) {
                                            th3 = th9;
                                            if (cursor3 != null) {
                                            }
                                            throw th3;
                                        }
                                    }
                                } else {
                                    Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Website info; disabled? Give up.");
                                }
                            } catch (SQLiteException e4) {
                                sQLiteException3 = e4;
                                cursor3 = null;
                                Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching website info", sQLiteException3);
                            } catch (Throwable th10) {
                                th3 = th10;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th3;
                            }
                        } else {
                            Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch RawContacts; disabled? Give up.");
                            throw new andh("Raw contacts query cursor is null");
                        }
                    } catch (SQLiteException e5) {
                        sQLiteException2 = e5;
                        cursor2 = null;
                        Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2);
                        String valueOf42 = String.valueOf(sQLiteException2);
                        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf42).length() + 35);
                        sb22.append("Fetching raw contacts query failed.");
                        sb22.append(valueOf42);
                        throw new andi(sb22.toString());
                    } catch (Throwable th11) {
                        th2 = th11;
                        cursor2 = null;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th2;
                    }
                } else {
                    Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Contact Ids; disabled? Give up.");
                    throw new andh("Contacts query cursor is null");
                }
            } catch (SQLiteException e6) {
                sQLiteException = e6;
                cursor = null;
                Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException);
                String valueOf6 = String.valueOf(sQLiteException);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 34);
                sb3.append("Fetching Contact Ids query failed.");
                sb3.append(valueOf6);
                throw new andi(sb3.toString());
            } catch (Throwable th12) {
                th = th12;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (andh | andi e7) {
            interruptedException = e7;
            str2 = "WriteContactsHelper";
            str = "Failed to read contacts from device.";
        } catch (InterruptedException e8) {
            interruptedException = e8;
            str2 = "WriteContactsHelper";
            str = "Interrupted while reading contacts from device.";
        } catch (Throwable th13) {
            while (true) {
            }
            throw th13;
        }
        Log.e(str2, str, interruptedException);
        return null;
    }

    /* renamed from: a */
    public final void mo40631a(ArrayList arrayList, double d) {
        int i;
        try {
            this.f74033f.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException e) {
            Log.e("WriteContactsHelper", "Contact Insertion failed at operation level.", e);
            this.f74031c.mo41718a(e, d);
            throw e;
        } catch (RemoteException e2) {
            Log.e("WriteContactsHelper", "Contact Insertion failed at remote level.", e2);
            int i2 = Build.VERSION.SDK_INT;
            if ((e2 instanceof TransactionTooLargeException) && (i = this.f74036i) > 0) {
                if (i == 2) {
                    this.f74029a >>= 1;
                    this.f74030b >>= 1;
                } else if (i == 1) {
                    this.f74032d = false;
                }
            }
            this.f74031c.mo41718a(e2, d);
            throw e2;
        }
    }
}

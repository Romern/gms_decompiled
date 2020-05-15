package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: alqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqv extends alqq {

    /* renamed from: f */
    public static final String[] f74132f = {"contact_id", "times_contacted", "last_time_contacted"};

    /* renamed from: h */
    private static final String[] f74133h = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};

    /* renamed from: i */
    private static final String[] f74134i = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: j */
    private static final String[] f74135j = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};

    /* renamed from: k */
    private static final String[] f74136k = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};

    /* renamed from: g */
    public final anda f74137g;

    /* renamed from: l */
    private final anda f74138l;

    public alqv(Context context, alqx alqx) {
        super("CL_C", context, new amsa(context), new anbz(), new alqt(context, alqx));
        amig.m62939a();
        if (((Boolean) amfm.f74863a.mo41191a()).booleanValue()) {
            this.f74138l = andb.m64054a(context, "CL_DM");
            this.f74137g = andb.m64054a(context, "LB_C");
            return;
        }
        this.f74138l = new anda(context, "CL_DM");
        this.f74137g = new anda(context, "LB_C");
    }

    /* renamed from: a */
    public static String m61533a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
        sb.append(str);
        sb.append(" = '");
        sb.append(str2);
        sb.append('\'');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* renamed from: b */
    private final Map m61538b(List list) {
        alqs alqs;
        int i = alpz.f74048a;
        amig.m62939a();
        String[] strArr = ((Boolean) amfs.f74869a.mo41191a()).booleanValue() ? f74136k : f74135j;
        HashMap a = bnmt.getNewHashMap();
        Cursor cursor = null;
        try {
            cursor = this.f74110a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, strArr, m61534a("contact_id", list), null, null);
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
                                long j = cursor.getLong(cursor.getColumnIndex("times_used"));
                                long j2 = (cursor.getLong(cursor.getColumnIndex("last_time_used")) / 86400000) * 86400000;
                                if (((Boolean) amfs.f74869a.mo41191a()).booleanValue()) {
                                    alqs = new alqs(Long.valueOf(j), Long.valueOf(j2), cursor.getInt(cursor.getColumnIndex("is_super_primary")));
                                } else {
                                    alqs = new alqs(Long.valueOf(j), Long.valueOf(j2));
                                }
                                map.put(string, alqs);
                            }
                        }
                        ((alqs) map.get(string)).mo40661a(valueOf2);
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ContactsLogger", "CP2 Query Exception when fetching phone info", e);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ContactsLogger", "CP2 failed to fetch Phone info.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ContactsLogger", "CP2 Query Exception when fetching phone info", e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static final Set m61539c(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final String m61534a(String str, Collection collection) {
        return String.format(str.concat(" IN (%s)"), TextUtils.join(",", collection));
    }

    /* renamed from: a */
    public static String m61535a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(" AND ");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* renamed from: a */
    private final Map m61536a(List list) {
        alqs alqs;
        int i = alpz.f74048a;
        amig.m62939a();
        String[] strArr = ((Boolean) amfs.f74869a.mo41191a()).booleanValue() ? f74134i : f74133h;
        HashMap a = bnmt.getNewHashMap();
        Cursor cursor = null;
        try {
            cursor = this.f74110a.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, strArr, m61534a("contact_id", list), null, null);
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
                                long j = cursor.getLong(cursor.getColumnIndex("times_used"));
                                long j2 = (cursor.getLong(cursor.getColumnIndex("last_time_used")) / 86400000) * 86400000;
                                if (((Boolean) amfs.f74869a.mo41191a()).booleanValue()) {
                                    alqs = new alqs(Long.valueOf(j), Long.valueOf(j2), cursor.getInt(cursor.getColumnIndex("is_super_primary")));
                                } else {
                                    alqs = new alqs(Long.valueOf(j), Long.valueOf(j2));
                                }
                                map.put(string, alqs);
                            }
                        }
                        ((alqs) map.get(string)).mo40661a(valueOf2);
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ContactsLogger", "CP2 Query Exception when fetching email info", e);
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
            } else {
                Log.w("ContactsLogger", "CP2 failed to fetch Email info.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ContactsLogger", "CP2 Query Exception when fetching email info", e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    static final void m61537a(boolean z, boolean z2, bzcv bzcv) {
        bzdh bzdh = ((bzcx) bzcv.f164949b).f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        bxvd bxvd = (bxvd) bzdh.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bzdh);
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

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:73:0x0214 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:430:0x0214 */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.String], assign insn: 0x01ef: INVOKE  (r6v58 ? I:java.lang.String) = ("mimetype"), ("vnd.android.cursor.item/photo") type: STATIC call: alqv.a(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Type inference failed for: r10v98, types: [java.lang.String[]], assign insn: 0x01fc: NEW_ARRAY  (r10v98 ? I:java.lang.String[]) = (2 int) type: java.lang.String[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, alqr]
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
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028b, code lost:
        r7 = (int) p000.cgbe.f186279a.mo6606a().mo83298ab();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0296, code lost:
        if (r7 >= 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0298, code lost:
        r5 = r4.f76609b.mo41680d(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a6, code lost:
        if (r5.hasNext() == false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a8, code lost:
        r7 = (android.accounts.Account) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ae, code lost:
        if (r7 == null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b6, code lost:
        if (p000.anbz.m63963a(r7.name) == false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ba, code lost:
        if (r7 == 0) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02be, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02bf, code lost:
        r4.f76608a = java.lang.Boolean.valueOf(r5);
        r4 = r4.f76608a.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cc, code lost:
        r4 = r7.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d0, code lost:
        if (r4 != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d3, code lost:
        r4 = p000.bnkn.m109661a();
        r5 = r40.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02dc, code lost:
        if (r7 >= r5) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02de, code lost:
        r9 = (p000.alre) r2.get(r7);
        r10 = (java.util.List) r8.get(java.lang.Long.valueOf(r9.f74155a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f0, code lost:
        if (r10 != null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f2, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f6, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fe, code lost:
        if (r10.hasNext() == false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0300, code lost:
        r11 = (p000.alqu) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030e, code lost:
        if ("com.google".equals(r11.f74124c) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0316, code lost:
        if (p000.anbz.m63963a(r11.f74125d) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0319, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031f, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0320, code lost:
        r4 = java.lang.System.currentTimeMillis();
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0333, code lost:
        if (((java.lang.Boolean) p000.amia.f74929a.mo41191a()).booleanValue() == false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0335, code lost:
        r7 = p000.alqn.m61522a(r1.f74110a).getInt("contacts-logger-batch-upload-version", 0);
        r9 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0346, code lost:
        if (r9.f74144d != false) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0348, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034b, code lost:
        r9 = r42;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0350, code lost:
        if (r9.f74144d != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0352, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0355, code lost:
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0365, code lost:
        if (((java.lang.Boolean) p000.amia.f74929a.mo41191a()).booleanValue() == false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0367, code lost:
        r10 = p000.alqn.m61522a(r1.f74110a);
        r12 = r10.getInt("contacts-logger-upload-version-reset-random", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0373, code lost:
        if (r12 != -1) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0375, code lost:
        r12 = new java.util.Random().nextInt(Integer.MAX_VALUE);
        r10.edit().putInt("contacts-logger-upload-version-reset-random", r12).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x038f, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0390, code lost:
        r10 = (p000.bzcv) p000.bzcx.f169429h.mo74144da();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039d, code lost:
        if (r13 >= r2.size()) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x039f, code lost:
        r14 = (p000.alre) r2.get(r13);
        r15 = r12;
        r11 = java.lang.Long.valueOf(r14.f74155a);
        r12 = (p000.bzcs) p000.bzcu.f169408q.mo74144da();
        r20 = r10;
        r9 = r11.longValue();
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03be, code lost:
        if (r12.f164950c == false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03c0, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c6, code lost:
        r2 = (p000.bzcu) r12.f164949b;
        r23 = r15;
        r15 = r2.f169410a | 1;
        r2.f169410a = r15;
        r2.f169411b = r9;
        r9 = r14.f74160f;
        r15 = r15 | 16;
        r2.f169410a = r15;
        r2.f169414e = r9;
        r9 = r14.f74161g;
        r15 = r15 | 32;
        r2.f169410a = r15;
        r2.f169418i = r9;
        r9 = r14.f74162h;
        r2.f169410a = r15 | 64;
        r2.f169419j = (r9 / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03fb, code lost:
        if (android.text.TextUtils.isEmpty(r14.f74156b) == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03fe, code lost:
        r2 = r14.f74156b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0400, code lost:
        if (r2 == null) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0404, code lost:
        if (r12.f164950c != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0407, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x040d, code lost:
        r9 = (p000.bzcu) r12.f164949b;
        r2.getClass();
        r9.f169410a |= 4;
        r9.f169412c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x041e, code lost:
        if (r12.f164950c != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0421, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0427, code lost:
        r2 = (p000.bzcu) r12.f164949b;
        r9 = r2.f169410a | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        r2.f169410a = r9;
        r2.f169422m = r7;
        r9 = r9 | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r2.f169410a = r9;
        r2.f169424o = r4;
        r2.f169425p = r6 - 1;
        r9 = r9 | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        r2.f169410a = r9;
        r2.f169410a = r9 | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        r9 = r23;
        r2.f169423n = r9;
        r2 = p000.bnkn.m109663a(java.util.Collections.unmodifiableSet(r14.f74163i));
        p000.bnjd.m109580a((java.lang.Iterable) r2, (p000.bmxz) new p000.alqr());
        r12.mo74529a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        if (r3 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0465, code lost:
        r2 = (java.util.Map) r3.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x046c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x046e, code lost:
        r10 = m61539c(p000.bngx.m109368a((java.util.Collection) r14.f74157c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x047a, code lost:
        if (r12.f164950c != false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x047d, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0483, code lost:
        r26 = r3;
        ((p000.bzcu) r12.f164949b).f169415f = p000.GeneratedMessageLite.m124030de();
        r3 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0497, code lost:
        if (r3.hasNext() == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0499, code lost:
        r10 = (p000.alqo) r3.next();
        r15 = (p000.bzdl) p000.bzdm.f169519h.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04ab, code lost:
        if (r10.mo40657b() == false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04ad, code lost:
        r27 = r3;
        r3 = r10.f74104a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b1, code lost:
        if (r3 == null) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b3, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b7, code lost:
        if (r15.f164950c != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04ba, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04c0, code lost:
        r4 = (p000.bzdm) r15.f164949b;
        r3.getClass();
        r4.f169521a |= 1;
        r4.f169522b = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d2, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d4, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04da, code lost:
        if (r10.mo40656a() == false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04dc, code lost:
        r3 = r10.f74105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04de, code lost:
        if (r3 == null) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04e2, code lost:
        if (r15.f164950c != false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04e5, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04eb, code lost:
        r4 = (p000.bzdm) r15.f164949b;
        r3.getClass();
        r4.f169521a |= 2;
        r4.f169523c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04fc, code lost:
        if (r2 == null) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04fe, code lost:
        r3 = (p000.alqs) r2.get(r10.f74104a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0506, code lost:
        if (r3 == null) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0508, code lost:
        r4 = r3.f74116b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0510, code lost:
        if (r15.f164950c != false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0513, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0519, code lost:
        r10 = (p000.bzdm) r15.f164949b;
        r32 = r2;
        r10.f169521a |= 4;
        r10.f169525e = r4;
        r4 = r3.f74117c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0531, code lost:
        if (r15.f164950c != false) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0534, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x053a, code lost:
        r2 = (p000.bzdm) r15.f164949b;
        r2.f169521a |= 8;
        r2.f169526f = r4;
        r15.mo74542a(r3.f74115a);
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x055a, code lost:
        if (((java.lang.Boolean) p000.amfs.f74869a.mo41191a()).booleanValue() == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055c, code lost:
        r2 = r3.f74118d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0560, code lost:
        if (r15.f164950c != false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0563, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0569, code lost:
        r3 = (p000.bzdm) r15.f164949b;
        r3.f169521a |= 32;
        r3.f169527g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0576, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0579, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x057b, code lost:
        r12.mo74527a(r15);
        r3 = r27;
        r4 = r30;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0586, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0588, code lost:
        if (r0 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x058a, code lost:
        r2 = (java.util.Map) r0.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0591, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0593, code lost:
        r3 = m61539c(p000.bngx.m109368a((java.util.Collection) r14.f74158d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x059f, code lost:
        if (r12.f164950c != false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05a2, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05a8, code lost:
        ((p000.bzcu) r12.f164949b).f169416g = p000.GeneratedMessageLite.m124030de();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ba, code lost:
        if (r3.hasNext() == false) goto L_0x06ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05bc, code lost:
        r4 = (p000.alqo) r3.next();
        r5 = (p000.bzdi) p000.bzdj.f169495h.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05ce, code lost:
        if (r4.mo40657b() == false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05d0, code lost:
        r10 = r4.f74104a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d2, code lost:
        if (r10 == null) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d6, code lost:
        if (r5.f164950c != false) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05d9, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05df, code lost:
        r15 = (p000.bzdj) r5.f164949b;
        r10.getClass();
        r27 = r0;
        r15.f169497a |= 1;
        r15.f169498b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f3, code lost:
        r27 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f9, code lost:
        if (r4.mo40656a() == false) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05fb, code lost:
        r0 = r4.f74105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05fd, code lost:
        if (r0 == null) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0601, code lost:
        if (r5.f164950c != false) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0604, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x060a, code lost:
        r10 = (p000.bzdj) r5.f164949b;
        r0.getClass();
        r10.f169497a |= 2;
        r10.f169499c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x061b, code lost:
        if (r2 == null) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x061d, code lost:
        r0 = (p000.alqs) r2.get(r4.f74104a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0625, code lost:
        if (r0 == null) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0627, code lost:
        r10 = r2;
        r15 = r3;
        r2 = r0.f74116b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0631, code lost:
        if (r5.f164950c != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0634, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063a, code lost:
        r4 = (p000.bzdj) r5.f164949b;
        r32 = r6;
        r4.f169497a |= 4;
        r4.f169501e = r2;
        r2 = r0.f74117c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0652, code lost:
        if (r5.f164950c != false) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0655, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x065b, code lost:
        r4 = (p000.bzdj) r5.f164949b;
        r4.f169497a |= 8;
        r4.f169502f = r2;
        r5.mo74541a(r0.f74115a);
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x067b, code lost:
        if (((java.lang.Boolean) p000.amfs.f74869a.mo41191a()).booleanValue() == false) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x067d, code lost:
        r0 = r0.f74118d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0681, code lost:
        if (r5.f164950c != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0684, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x068a, code lost:
        r2 = (p000.bzdj) r5.f164949b;
        r2.f169497a |= 32;
        r2.f169503g = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0697, code lost:
        r10 = r2;
        r15 = r3;
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x069c, code lost:
        r10 = r2;
        r15 = r3;
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06a0, code lost:
        r12.mo74526a(r5);
        r2 = r10;
        r3 = r15;
        r0 = r27;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06ab, code lost:
        r27 = r0;
        r32 = r6;
        r2 = r28;
        r0 = (java.util.Map) r2.get(r11);
        r3 = m61539c(p000.bngx.m109368a((java.util.Collection) r14.f74159e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06c3, code lost:
        if (r12.f164950c != false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06c6, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06cc, code lost:
        ((p000.bzcu) r12.f164949b).f169417h = p000.GeneratedMessageLite.m124030de();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06de, code lost:
        if (r3.hasNext() == false) goto L_0x0747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06e0, code lost:
        r4 = (p000.alqo) r3.next();
        r5 = (p000.bzdn) p000.bzdo.f169528f.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06f2, code lost:
        if (r4.mo40657b() == false) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06f4, code lost:
        r6 = r4.f74104a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06f6, code lost:
        if (r6 == null) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06fa, code lost:
        if (r5.f164950c != false) goto L_0x06fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06fd, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0703, code lost:
        r10 = (p000.bzdo) r5.f164949b;
        r6.getClass();
        r10.f169530a |= 1;
        r10.f169531b = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0716, code lost:
        if (r4.mo40656a() == false) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0718, code lost:
        r6 = r4.f74105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x071a, code lost:
        if (r6 == null) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x071e, code lost:
        if (r5.f164950c != false) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0721, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0727, code lost:
        r10 = (p000.bzdo) r5.f164949b;
        r6.getClass();
        r10.f169530a |= 2;
        r10.f169532c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0736, code lost:
        if (r0 == null) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0738, code lost:
        r5.mo74543a((java.util.Set) r0.get(r4.f74104a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0743, code lost:
        r12.mo74528a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0747, code lost:
        r0 = (java.util.List) r8.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (r8 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x074d, code lost:
        if (r0 == null) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x074f, code lost:
        p000.amig.m62939a();
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0759, code lost:
        if (r12.f164950c != false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x075c, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0762, code lost:
        ((p000.bzcu) r12.f164949b).f169420k = p000.GeneratedMessageLite.m124030de();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0771, code lost:
        if (r4 >= r0.size()) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0773, code lost:
        r5 = (p000.alqu) r0.get(r4);
        r6 = p000.bzdq.f169536s.mo74144da();
        r10 = r5.f74122a.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0787, code lost:
        if (r6.f164950c != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x078a, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0790, code lost:
        r14 = (p000.bzdq) r6.f164949b;
        r15 = r14.f169538a | 1;
        r14.f169538a = r15;
        r14.f169539b = r10;
        r10 = r5.f74124c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07a0, code lost:
        if (r10 == null) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07a2, code lost:
        r10.getClass();
        r14.f169538a = r15 | 8;
        r14.f169540c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07bd, code lost:
        if (java.lang.Boolean.valueOf(p000.cgbe.f186279a.mo6606a().mo83467u()).booleanValue() == false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07bf, code lost:
        r10 = (java.lang.Boolean) r3.get(((p000.bzdq) r6.f164949b).f169540c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07cb, code lost:
        if (r10 == null) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07cd, code lost:
        r10 = r10.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07d3, code lost:
        if (r6.f164950c != false) goto L_0x07d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07d6, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07dc, code lost:
        r11 = (p000.bzdq) r6.f164949b;
        r11.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        r11.f169550m = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07ee, code lost:
        r10 = p000.aytv.m84811a(r1.f74110a, ((p000.bzdq) r6.f164949b).f169540c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07fc, code lost:
        if (r6.f164950c != false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07ff, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0805, code lost:
        r11 = (p000.bzdq) r6.f164949b;
        r11.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        r11.f169550m = r10;
        r3.put(r11.f169540c, java.lang.Boolean.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0824, code lost:
        r10 = r5.f74125d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0826, code lost:
        if (r10 == null) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x082a, code lost:
        if (r6.f164950c != false) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x082d, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0833, code lost:
        r11 = (p000.bzdq) r6.f164949b;
        r10.getClass();
        r11.f169538a |= 16;
        r11.f169541d = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0847, code lost:
        if (android.text.TextUtils.isEmpty(null) != false) goto L_0x084b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0849, code lost:
        r10 = r5.f74130i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x084d, code lost:
        if (r5.f74129h == false) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0851, code lost:
        if (r6.f164950c != false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0854, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x085a, code lost:
        r10 = (p000.bzdq) r6.f164949b;
        r10.f169538a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        r10.f169549l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0867, code lost:
        r10 = r5.f74127f.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x086f, code lost:
        if (r6.f164950c != false) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0872, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0878, code lost:
        r14 = (p000.bzdq) r6.f164949b;
        r14.f169538a |= 1024;
        r14.f169545h = r10;
        r10 = (r5.f74128g.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0890, code lost:
        if (r6.f164950c != false) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0893, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0899, code lost:
        r14 = (p000.bzdq) r6.f164949b;
        r15 = r14.f169538a | 2048;
        r14.f169538a = r15;
        r14.f169546i = r10;
        r10 = r5.f74131j;
        r11 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x08a9, code lost:
        if (r10 == 0) goto L_0x08e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x08ab, code lost:
        r14.f169544g = r11;
        r14.f169538a = r15 | 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r7 = r11;
        r15 = "contact_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x08b9, code lost:
        if ("com.google".equals(r5.f74124c) == false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x08bd, code lost:
        if (r5.f74126e != null) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x08bf, code lost:
        r5 = r5.f74123b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x08c1, code lost:
        if (r5 != null) goto L_0x08c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08c6, code lost:
        if (r6.f164950c != false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08c9, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08cf, code lost:
        r10 = (p000.bzdq) r6.f164949b;
        r5.getClass();
        r10.f169538a |= 32;
        r10.f169542e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08de, code lost:
        r12.mo74525a(r6);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08e6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08e7, code lost:
        r10 = r20;
        r10.mo74535a(r12);
        r13 = r13 + 1;
        r28 = r2;
        r12 = r9;
        r2 = r22;
        r3 = r26;
        r0 = r27;
        r4 = r30;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0900, code lost:
        r0 = r1.f74110a;
        r2 = p000.alqw.f74139a;
        r2 = p000.alqw.m61543a(r0, android.provider.ContactsContract.Contacts.CONTENT_URI, p000.alqw.f74140b);
        r3 = p000.alqw.m61543a(r0, android.provider.ContactsContract.RawContacts.CONTENT_URI, p000.alqw.f74139a);
        p000.amig.m62939a();
        r4 = (p000.bzdb) p000.bzdh.f169466A.mo74144da();
        r5 = android.os.Build.MODEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0923, code lost:
        if (r4.f164950c != false) goto L_0x0926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0926, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x092c, code lost:
        r6 = (p000.bzdh) r4.f164949b;
        r5.getClass();
        r6.f169469a |= 1;
        r6.f169470b = r5;
        r5 = android.os.Build.BRAND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x093f, code lost:
        if (r4.f164950c != false) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0942, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0948, code lost:
        r6 = (p000.bzdh) r4.f164949b;
        r5.getClass();
        r6.f169469a |= 2;
        r6.f169471c = r5;
        r5 = android.os.Build.DEVICE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x095b, code lost:
        if (r4.f164950c != false) goto L_0x095e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x095e, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0964, code lost:
        r6 = (p000.bzdh) r4.f164949b;
        r5.getClass();
        r6.f169469a |= 4;
        r6.f169472d = r5;
        r5 = android.os.Build.DISPLAY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0977, code lost:
        if (r4.f164950c != false) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x097a, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0980, code lost:
        r6 = (p000.bzdh) r4.f164949b;
        r5.getClass();
        r6.f169469a |= 8;
        r6.f169473e = r5;
        r5 = android.os.Build.MANUFACTURER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0993, code lost:
        if (r4.f164950c != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0996, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x099c, code lost:
        r6 = (p000.bzdh) r4.f164949b;
        r5.getClass();
        r7 = r6.f169469a | 16;
        r6.f169469a = r7;
        r6.f169474f = r5;
        r5 = r7 | 512;
        r6.f169469a = r5;
        r6.f169477i = (long) r2;
        r6.f169469a = r5 | 1024;
        r6.f169478j = (long) r3;
        p000.bzdh.m125687a(r6);
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x09c2, code lost:
        if (r4.f164950c != false) goto L_0x09c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x09c5, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x09cb, code lost:
        r5 = (p000.bzdh) r4.f164949b;
        r5.f169469a |= 2048;
        r5.f169479k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x09e9, code lost:
        if (java.lang.Boolean.valueOf(p000.cgbe.f186279a.mo6606a().mo83466t()).booleanValue() == false) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09eb, code lost:
        r2 = p000.alqw.m61542a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09f1, code lost:
        if (r4.f164950c == false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x09f3, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x09f9, code lost:
        r5 = (p000.bzdh) r4.f164949b;
        r5.f169469a |= 8192;
        r5.f169481m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a08, code lost:
        if (r4.f164950c != false) goto L_0x0a0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a0b, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a11, code lost:
        r2 = (p000.bzdh) r4.f164949b;
        r2.f169469a |= 8192;
        r2.f169481m = 28.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a1f, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0a23, code lost:
        if (r4.f164950c != false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a26, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a2c, code lost:
        r3 = (p000.bzdh) r4.f164949b;
        r3.f169469a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        r3.f169484p = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a4b, code lost:
        if (java.lang.Boolean.valueOf(p000.cgbe.f186279a.mo6606a().mo83471y()).booleanValue() == false) goto L_0x0aa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0a4d, code lost:
        r0 = new p000.amsa(r0).mo41295a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0a5a, code lost:
        if (r0.mo66813a() == false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a6a, code lost:
        r0 = p000.bmxv.m108566b(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) r0.mo66814b())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r8 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0a6f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0a70, code lost:
        android.util.Log.e("DeviceUsageSettingsHelper", "Invalid Android Id", r0);
        r0 = p000.bmvz.f131120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0a7a, code lost:
        r0 = p000.bmvz.f131120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r8 = p000.bnmt.m109794a();
        r9 = p000.bnmt.m109794a();
        r0 = new java.lang.String[9];
        r0[r6] = "_id";
        r0[1] = r15;
        r0[2] = "account_type";
        r0[3] = "account_name";
        r6 = "sourceid";
        r0[4] = r6;
        r28 = r7;
        r0[5] = "data_set";
        r0[6] = "times_contacted";
        r0[7] = "last_time_contacted";
        r0[8] = "starred";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b3c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0b3d, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b3f, code lost:
        if (r16 != null) goto L_0x0b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b41, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b44, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b45, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0b46, code lost:
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0b48, code lost:
        if (r16 != null) goto L_0x0b4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0b4a, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0b4d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r12 = r1.f74110a.getContentResolver().query(android.provider.ContactsContract.RawContacts.CONTENT_URI, r0, m61534a(r15, r5), null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0116, code lost:
        if (r12 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011c, code lost:
        if (r12.moveToNext() == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011e, code lost:
        r0 = new p000.alqu(java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("_id"))), r12.getString(r12.getColumnIndex(r6)), r12.getString(r12.getColumnIndex("account_type")), r12.getString(r12.getColumnIndex("account_name")), r12.getString(r12.getColumnIndex("data_set")), java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("times_contacted"))), java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("last_time_contacted"))), r12.getInt(r12.getColumnIndex("starred")));
        r9.put(r0.f74122a, r0);
        r3 = java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex(r15)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018c, code lost:
        if (r8.containsKey(r3) != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018e, code lost:
        r22 = r6;
        r8.put(r3, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0199, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x019b, code lost:
        ((java.util.List) r8.get(r3)).add(r0);
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ae, code lost:
        android.util.Log.w("ContactsLogger", "CP2 failed to fetch RawContacts.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b3, code lost:
        if (r12 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b6, code lost:
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01be, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        android.util.Log.e("ContactsLogger", "CP2 Query Exception when fetching raw-contacts.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c5, code lost:
        if (r12 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ce, code lost:
        if (r9.isEmpty() == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d0, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d3, code lost:
        r0 = new java.lang.String[]{"raw_contact_id", "data14", "data15"};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r3 = m61534a("raw_contact_id", r9.keySet());
        r6 = m61533a("mimetype", "vnd.android.cursor.item/photo");
        r3 = r1.f74110a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, r0, m61535a((java.lang.String[]) new java.lang.String[]{r3, r6}), null, null);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0212, code lost:
        if (r3 == null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0218, code lost:
        if (r3.moveToNext() == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021a, code lost:
        r6 = r3.getLong(r3.getColumnIndex("raw_contact_id"));
        r10 = r3.getLong(r3.getColumnIndex("data14"));
        r0 = r3.getBlob(r3.getColumnIndex("data15"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023a, code lost:
        if (r10 == 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023c, code lost:
        r6 = 4;
        ((p000.alqu) r9.get(java.lang.Long.valueOf(r6))).f74131j = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024a, code lost:
        if (r0 == null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024c, code lost:
        r0 = (p000.alqu) r9.get(java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0256, code lost:
        r6 = 3;
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r0.f74131j = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025a, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025f, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        r6 = 3;
        android.util.Log.w("ContactsLogger", "CP2 failed to fetch photo info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0268, code lost:
        r0 = e;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026e, code lost:
        r6 = 3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        android.util.Log.e("ContactsLogger", "CP2 Query Exception when fetching photo info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        if (r3 == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0278, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027b, code lost:
        r0 = m61536a(r5);
        r3 = m61538b(r5);
        r4 = r1.f74112c;
        r5 = r1.f74110a;
        r7 = r4.f76608a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0289, code lost:
        if (r7 != null) goto L_0x02cc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0b41  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0b4a  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0b53  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public final bzcx mo40663a(List list, Set set, alqx alqx) {
        bzcv bzcv;
        bzdb bzdb;
        bmxv bmxv;
        Cursor cursor;
        ArrayList arrayList = list;
        alqx alqx2 = alqx;
        ArrayList a = bnkn.m109661a();
        int size = list.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            a.add(Long.valueOf(((alre) arrayList.get(i)).f74155a));
            i++;
            alqx2 = alqx2;
            c = 0;
        }
        int i2 = alpz.f74048a;
        String[] strArr = new String[3];
        strArr[c] = "raw_contact_id";
        strArr[1] = "contact_id";
        strArr[2] = "data1";
        HashMap a2 = bnmt.getNewHashMap();
        Cursor cursor2 = null;
        Cursor cursor3 = null;
        Cursor cursor4 = null;
        try {
            HashMap hashMap = a2;
            String str = "contact_id";
            cursor = this.f74110a.getContentResolver().query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, strArr, m61534a("contact_id", a), null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex(str)));
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndex("raw_contact_id")));
                        String string = cursor.getString(cursor.getColumnIndex("data1"));
                        if (!hashMap.containsKey(valueOf)) {
                            hashMap.put(valueOf, new HashMap());
                        }
                        Map map = (Map) hashMap.get(valueOf);
                        if (map != null) {
                            if (!map.containsKey(string)) {
                                map.put(string, new LinkedHashSet());
                            }
                        }
                        ((Set) map.get(string)).add(valueOf2);
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            Log.e("ContactsLogger", "CP2 Query Exception when fetching postal info", e);
                        } catch (Throwable th) {
                            th = th;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                }
            } else {
                Log.w("ContactsLogger", "CP2 failed to fetch Postal info.");
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
            Log.e("ContactsLogger", "CP2 Query Exception when fetching postal info", e);
        } catch (Throwable th3) {
        }
        if (bmxv.mo66813a()) {
            long longValue = ((Long) bmxv.mo66814b()).longValue();
            if (bzdb.f164950c) {
                bzdb.mo74035c();
                bzdb.f164950c = false;
            }
            bzdh bzdh = (bzdh) bzdb.f164949b;
            bzdh.f169469a |= 16777216;
            bzdh.f169490v = longValue;
        }
        bzdh bzdh2 = (bzdh) bzdb.mo74062i();
        long j = bzdh2.f169477i;
        if (bzcv.f164950c) {
            bzcv.mo74035c();
            bzcv.f164950c = false;
        }
        bzcx bzcx = (bzcx) bzcv.f164949b;
        int i3 = bzcx.f169431a | 8;
        bzcx.f169431a = i3;
        bzcx.f169435e = j;
        long j2 = bzdh2.f169478j;
        int i4 = i3 | 32;
        bzcx.f169431a = i4;
        bzcx.f169437g = j2;
        bzdh2.getClass();
        bzcx.f169436f = bzdh2;
        bzcx.f169431a = i4 | 16;
        bzcx.f169434d = GeneratedMessageLite.m124029dd();
        bzcv.mo74536a(set);
        if (alqx.f74144d) {
            if (bzcv.f164950c) {
                bzcv.mo74035c();
                bzcv.f164950c = false;
            }
            bzcx.m125673a((bzcx) bzcv.f164949b);
            bxwc bxwc = ((bzcx) bzcv.mo74062i()).f169432b;
            int size2 = bxwc.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size2) {
                int i7 = i6 + 1;
                bzcu bzcu = (bzcu) bxwc.get(i5);
                bxvd bxvd = (bxvd) bzcu.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bzcu);
                bzcs bzcs = (bzcs) bxvd;
                if (bzcs.f164950c) {
                    bzcs.mo74035c();
                    bzcs.f164950c = false;
                }
                bzcu.m125662a((bzcu) bzcs.f164949b);
                bzcv.mo74534a(i6, bzcs);
                i5++;
                i6 = i7;
            }
        }
        return (bzcx) bzcv.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo40664a(alqx alqx, bzcx bzcx, String str) {
        alqx alqx2 = alqx;
        bzcx bzcx2 = bzcx;
        String str2 = str;
        bxwc bxwc = bzcx2.f169432b;
        int size = bxwc.size();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            boolean a = mo40660a(alqx2, ((bzcu) bxwc.get(i3)).serializeToBytes(), str2);
            if (!a) {
                i2++;
            } else {
                i++;
            }
            z &= a;
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
            boolean a2 = mo40660a(alqx2, ((bzcu) bzcs.mo74062i()).serializeToBytes(), str2);
            if (!a2) {
                i6++;
            } else {
                i5++;
            }
            z &= a2;
            i4++;
            bxvw = bxvw2;
        }
        almk a3 = almk.m61263a();
        bxvd da = amku.f75091n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amku amku = (amku) da.f164949b;
        int i7 = amku.f75093a | 16;
        amku.f75093a = i7;
        amku.f75098f = i;
        int i8 = i7 | 32;
        amku.f75093a = i8;
        amku.f75099g = i2;
        int i9 = i8 | 64;
        amku.f75093a = i9;
        amku.f75100h = i5;
        amku.f75093a = i9 | 128;
        amku.f75101i = i6;
        amku amku2 = (amku) da.mo74062i();
        bxvd da2 = amkv.f75106m.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        amkv amkv = (amkv) da2.f164949b;
        amku2.getClass();
        amkv.f75119l = amku2;
        amkv.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        a3.mo40514a((amkv) da2.mo74062i());
        bzdh bzdh = bzcx2.f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        return alqq.m61526a(bzdh.serializeToBytes(), str2, this.f74138l) & z;
    }
}

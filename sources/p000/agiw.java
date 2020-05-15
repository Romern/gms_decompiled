package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: agiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agiw extends agmg implements agdh {

    /* renamed from: a */
    public final Map f65648a = new C1223np();

    /* renamed from: b */
    public final Map f65649b = new C1223np();

    /* renamed from: c */
    public final Map f65650c = new C1223np();

    /* renamed from: d */
    private final Map f65651d = new C1223np();

    /* renamed from: e */
    private final Map f65652e = new C1223np();

    /* renamed from: f */
    private final Map f65653f = new C1223np();

    public agiw(agmn agmn) {
        super(agmn);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxxb, byte[]):bxxb
     arg types: [bxvd, byte[]]
     candidates:
      agmp.a(bxvd, java.lang.String):int
      agmp.a(java.lang.StringBuilder, int):void
      agmp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):boolean
      agmp.a(java.util.List, int):boolean
      agmp.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable
      agmp.a(agni, java.lang.String):java.lang.Object
      agmp.a(java.util.List, java.util.List):java.util.List
      agmp.a(bxvd, java.lang.Object):void
      agmp.a(long, long):boolean
      agmp.a(bxxb, byte[]):bxxb */
    /* renamed from: a */
    private final agne m54328a(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return agne.f66038h;
        }
        try {
            agne agne = (agne) ((bxvd) agmp.m54563a((bxxb) agne.f66038h.mo74144da(), bArr)).mo74062i();
            agib agib = mo35497E().f65572k;
            String str2 = null;
            if ((agne.f66040a & 1) != 0) {
                l = Long.valueOf(agne.f66041b);
            } else {
                l = null;
            }
            if ((agne.f66040a & 2) != 0) {
                str2 = agne.f66042c;
            }
            agib.mo35437a("Parsed config. version, gmp_app_id", l, str2);
            return agne;
        } catch (bxwf e) {
            mo35497E().f65567f.mo35437a("Unable to merge remote config. appId", agid.m54288a(str), e);
            return agne.f66038h;
        } catch (RuntimeException e2) {
            mo35497E().f65567f.mo35437a("Unable to merge remote config. appId", agid.m54288a(str), e2);
            return agne.f66038h;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final agne mo35478b(String str) {
        mo35659q();
        mo35241h();
        sdo.m34977c(str);
        mo35476a(str);
        return (agne) this.f65648a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35480c(String str) {
        mo35241h();
        this.f65650c.put(str, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo35482d(String str) {
        mo35241h();
        agne b = mo35478b(str);
        if (b != null) {
            return b.f66046g;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo35483e(String str) {
        return "1".equals(mo35308a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo35484f(String str) {
        return "1".equals(mo35308a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35481c(String str, String str2) {
        Boolean bool;
        mo35241h();
        mo35476a(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (cfik.m139776b() && mo35538v().mo35314a(aghn.f65498ax) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = (Map) this.f65653f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo35479b(String str, String str2) {
        Boolean bool;
        mo35241h();
        mo35476a(str);
        if (mo35483e(str) && agms.m54596f(str2)) {
            return true;
        }
        if (mo35484f(str) && agms.m54591a(str2)) {
            return true;
        }
        Map map = (Map) this.f65652e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private static final Map m54329a(agne agne) {
        C1223np npVar = new C1223np();
        if (agne != null) {
            bxwc bxwc = agne.f66043d;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                agnf agnf = (agnf) bxwc.get(i);
                npVar.put(agnf.f66049a, agnf.f66050b);
            }
        }
        return npVar;
    }

    /* renamed from: a */
    private final void m54330a(String str, bxvd bxvd) {
        C1223np npVar = new C1223np();
        C1223np npVar2 = new C1223np();
        C1223np npVar3 = new C1223np();
        if (bxvd != null) {
            for (int i = 0; i < ((agne) bxvd.f164949b).f66044e.size(); i++) {
                agnd agnd = (agnd) ((agne) bxvd.f164949b).f66044e.get(i);
                bxvd bxvd2 = (bxvd) agnd.mo74142c(5);
                bxvd2.mo73625a((bxvk) agnd);
                if (!TextUtils.isEmpty(((agnd) bxvd2.f164949b).f66034b)) {
                    String a = agjy.m54404a(((agnd) bxvd2.f164949b).f66034b);
                    if (!TextUtils.isEmpty(a)) {
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        agnd agnd2 = (agnd) bxvd2.f164949b;
                        agnd agnd3 = agnd.f66031f;
                        a.getClass();
                        agnd2.f66033a |= 1;
                        agnd2.f66034b = a;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        agne agne = (agne) bxvd.f164949b;
                        agnd agnd4 = (agnd) bxvd2.mo74062i();
                        agne agne2 = agne.f66038h;
                        agnd4.getClass();
                        if (!agne.f66044e.mo73666a()) {
                            agne.f66044e = bxvk.m124021a(agne.f66044e);
                        }
                        agne.f66044e.set(i, agnd4);
                    }
                    agnd agnd5 = (agnd) bxvd2.f164949b;
                    npVar.put(agnd5.f66034b, Boolean.valueOf(agnd5.f66035c));
                    agnd agnd6 = (agnd) bxvd2.f164949b;
                    npVar2.put(agnd6.f66034b, Boolean.valueOf(agnd6.f66036d));
                    agnd agnd7 = (agnd) bxvd2.f164949b;
                    if ((agnd7.f66033a & 8) != 0) {
                        int i2 = agnd7.f66037e;
                        if (i2 >= 2 && i2 <= 65535) {
                            npVar3.put(agnd7.f66034b, Integer.valueOf(i2));
                        } else {
                            agib agib = mo35497E().f65567f;
                            agnd agnd8 = (agnd) bxvd2.f164949b;
                            agib.mo35437a("Invalid sampling rate. Event name, sample rate", agnd8.f66034b, Integer.valueOf(agnd8.f66037e));
                        }
                    }
                } else {
                    mo35497E().f65567f.mo35435a("EventConfig contained null event name");
                }
            }
        }
        this.f65652e.put(str, npVar);
        this.f65653f.put(str, npVar2);
        this.f65649b.put(str, npVar3);
    }

    /* renamed from: a */
    public final String mo35308a(String str, String str2) {
        mo35241h();
        mo35476a(str);
        Map map = (Map) this.f65651d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r2 != null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* renamed from: a */
    public final void mo35476a(String str) {
        byte[] bArr;
        Cursor cursor;
        SQLiteException e;
        mo35659q();
        mo35241h();
        sdo.m34977c(str);
        if (this.f65648a.get(str) == null) {
            agdl n = mo35656n();
            sdo.m34977c(str);
            n.mo35241h();
            n.mo35659q();
            Cursor cursor2 = null;
            try {
                cursor = n.mo35360e().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        bArr = cursor.getBlob(0);
                        if (cursor.moveToNext()) {
                            n.mo35497E().f65564c.mo35436a("Got multiple records for app config, expected one. appId", agid.m54288a(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (bArr == null) {
                            agne a = m54328a(str, bArr);
                            bxvd bxvd = (bxvd) a.mo74142c(5);
                            bxvd.mo73625a((bxvk) a);
                            m54330a(str, bxvd);
                            this.f65651d.put(str, m54329a((agne) bxvd.mo74062i()));
                            this.f65648a.put(str, (agne) bxvd.mo74062i());
                            this.f65650c.put(str, null);
                            return;
                        }
                        this.f65651d.put(str, null);
                        this.f65652e.put(str, null);
                        this.f65653f.put(str, null);
                        this.f65648a.put(str, null);
                        this.f65650c.put(str, null);
                        this.f65649b.put(str, null);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        n.mo35497E().f65564c.mo35437a("Error querying remote config. appId", agid.m54288a(str), e);
                        if (cursor == null) {
                        }
                        cursor.close();
                        bArr = null;
                        if (bArr == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = null;
                n.mo35497E().f65564c.mo35437a("Error querying remote config. appId", agid.m54288a(str), e);
                if (cursor == null) {
                    bArr = null;
                    if (bArr == null) {
                    }
                }
                cursor.close();
                bArr = null;
                if (bArr == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0482, code lost:
        r12 = r0.f65986c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x048c, code lost:
        if (r12.hasNext() == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0498, code lost:
        if ((((p000.agmz) r12.next()).f66016a & 1) != 0) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x049a, code lost:
        r9.mo35497E().f65567f.mo35437a("Property filter with no ID. Audience definition ignored. appId, audienceId", p000.agid.m54288a(r28), java.lang.Integer.valueOf(r11));
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04b1, code lost:
        r12 = r0.f65987d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04bb, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04c7, code lost:
        if (r12.hasNext() == false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r13 = (p000.agmu) r12.next();
        r9.mo35659q();
        r9.mo35241h();
        p000.sdo.m34977c(r28);
        p000.sdo.m34959a(r13);
        r22 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04e3, code lost:
        if (android.text.TextUtils.isEmpty(r13.f65992c) != false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04e5, code lost:
        r8 = r13.mo73642k();
        r23 = r10;
        r10 = new android.content.ContentValues();
        r10.put("app_id", r2);
        r10.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04fe, code lost:
        if ((r13.f65990a & 1) == 0) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0500, code lost:
        r3 = java.lang.Integer.valueOf(r13.f65991b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0507, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0508, code lost:
        r10.put("filter_id", r3);
        r10.put("event_name", r13.f65992c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0516, code lost:
        if ((r13.f65990a & 64) == 0) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0518, code lost:
        r3 = java.lang.Boolean.valueOf(r13.f65997h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x051f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0520, code lost:
        r10.put("session_scoped", r3);
        r10.put("data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0534, code lost:
        if (r9.mo35360e().insertWithOnConflict("event_filters", null, r10, 5) != -1) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0536, code lost:
        r9.mo35497E().f65564c.mo35436a("Failed to insert event filter (got -1). appId", p000.agid.m54288a(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0545, code lost:
        r3 = r21;
        r8 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x054f, code lost:
        r3 = r21;
        r8 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x056c, code lost:
        r23 = r10;
        r0 = r9.mo35497E().f65567f;
        r6 = p000.agid.m54288a(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0582, code lost:
        if ((r13.f65990a & 1) == 0) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0584, code lost:
        r20 = java.lang.Integer.valueOf(r13.f65991b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x058d, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x058f, code lost:
        r0.mo35438a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r6, r7, java.lang.String.valueOf(r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0599, code lost:
        r22 = r8;
        r23 = r10;
        r0 = r0.f65986c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x05a7, code lost:
        if (r0.hasNext() == false) goto L_0x069f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x05a9, code lost:
        r8 = (p000.agmz) r0.next();
        r9.mo35659q();
        r9.mo35241h();
        p000.sdo.m34977c(r28);
        p000.sdo.m34959a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05c1, code lost:
        if (android.text.TextUtils.isEmpty(r8.f66018c) != false) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05c3, code lost:
        r10 = r8.mo73642k();
        r12 = new android.content.ContentValues();
        r12.put("app_id", r2);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x05dc, code lost:
        if ((r8.f66016a & 1) == 0) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x05de, code lost:
        r13 = java.lang.Integer.valueOf(r8.f66017b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05e5, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05e6, code lost:
        r12.put("filter_id", r13);
        r24 = r0;
        r12.put("property_name", r8.f66018c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x05f6, code lost:
        if ((r8.f66016a & 32) == 0) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05f8, code lost:
        r0 = java.lang.Boolean.valueOf(r8.f66022g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05ff, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0600, code lost:
        r12.put("session_scoped", r0);
        r12.put("data", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0614, code lost:
        if (r9.mo35360e().insertWithOnConflict("property_filters", null, r12, 5) != -1) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0616, code lost:
        r9.mo35497E().f65564c.mo35436a("Failed to insert property filter (got -1). appId", p000.agid.m54288a(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0626, code lost:
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x062a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x062c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r9.mo35497E().f65564c.mo35437a("Error storing property filter. appId", p000.agid.m54288a(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x063e, code lost:
        r13 = null;
        r0 = r9.mo35497E().f65567f;
        r6 = p000.agid.m54288a(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0654, code lost:
        if ((r8.f66016a & 1) == 0) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0656, code lost:
        r13 = java.lang.Integer.valueOf(r8.f66017b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x065f, code lost:
        r0.mo35438a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r6, r7, java.lang.String.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0666, code lost:
        r9.mo35659q();
        r9.mo35241h();
        p000.sdo.m34977c(r28);
        r0 = r9.mo35360e();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r0.delete("event_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0695, code lost:
        r17 = r3;
        r3 = r21;
        r19 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x069f, code lost:
        r3 = r21;
        r19 = r22;
        r10 = r23;
     */
    /* renamed from: a */
    public final boolean mo35477a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        bxvd bxvd;
        String str3;
        String str4;
        boolean z;
        String str5 = str;
        String str6 = "app_id=? and audience_id=?";
        mo35659q();
        mo35241h();
        sdo.m34977c(str);
        agne a = m54328a(str, bArr);
        int i = 5;
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        if (bxvd2 == null) {
            return false;
        }
        m54330a(str5, bxvd2);
        this.f65648a.put(str5, (agne) bxvd2.mo74062i());
        this.f65650c.put(str5, str2);
        this.f65651d.put(str5, m54329a((agne) bxvd2.mo74062i()));
        agdl n = mo35656n();
        ArrayList<agmt> arrayList = new ArrayList(Collections.unmodifiableList(((agne) bxvd2.f164949b).f66045f));
        sdo.m34959a(arrayList);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            agmt agmt = (agmt) arrayList.get(i2);
            bxvd bxvd3 = (bxvd) agmt.mo74142c(i);
            bxvd3.mo73625a((bxvk) agmt);
            if (((agmt) bxvd3.f164949b).f65987d.size() == 0) {
                str3 = str6;
                bxvd = bxvd2;
            } else {
                int i3 = 0;
                while (i3 < ((agmt) bxvd3.f164949b).f65987d.size()) {
                    agmu agmu = (agmu) ((agmt) bxvd3.f164949b).f65987d.get(i3);
                    bxvd bxvd4 = (bxvd) agmu.mo74142c(i);
                    bxvd4.mo73625a((bxvk) agmu);
                    bxvd e = bxvd4.clone();
                    String a2 = agjy.m54404a(((agmu) bxvd4.f164949b).f65992c);
                    if (a2 != null) {
                        if (e.f164950c) {
                            e.mo74035c();
                            e.f164950c = false;
                        }
                        agmu agmu2 = (agmu) e.f164949b;
                        agmu agmu3 = agmu.f65988i;
                        a2.getClass();
                        str4 = str6;
                        agmu2.f65990a |= 2;
                        agmu2.f65992c = a2;
                        z = true;
                    } else {
                        str4 = str6;
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((agmu) bxvd4.f164949b).f65993d.size()) {
                        agmv agmv = (agmv) ((agmu) bxvd4.f164949b).f65993d.get(i4);
                        bxvd bxvd5 = bxvd4;
                        bxvd bxvd6 = bxvd2;
                        String a3 = agks.m54437a(agmv.f66004e, agjz.f65761a, agjz.f65762b);
                        if (a3 != null) {
                            bxvd bxvd7 = (bxvd) agmv.mo74142c(5);
                            bxvd7.mo73625a((bxvk) agmv);
                            if (bxvd7.f164950c) {
                                bxvd7.mo74035c();
                                bxvd7.f164950c = false;
                            }
                            agmv agmv2 = (agmv) bxvd7.f164949b;
                            agmv agmv3 = agmv.f65998f;
                            a3.getClass();
                            agmv2.f66000a |= 8;
                            agmv2.f66004e = a3;
                            agmv agmv4 = (agmv) bxvd7.mo74062i();
                            if (e.f164950c) {
                                e.mo74035c();
                                e.f164950c = false;
                            }
                            agmu agmu4 = (agmu) e.f164949b;
                            agmu agmu5 = agmu.f65988i;
                            agmv4.getClass();
                            if (!agmu4.f65993d.mo73666a()) {
                                agmu4.f65993d = bxvk.m124021a(agmu4.f65993d);
                            }
                            agmu4.f65993d.set(i4, agmv4);
                            z = true;
                        }
                        i4++;
                        bxvd4 = bxvd5;
                        bxvd2 = bxvd6;
                    }
                    bxvd bxvd8 = bxvd2;
                    if (z) {
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agmt agmt2 = (agmt) bxvd3.f164949b;
                        agmu agmu6 = (agmu) e.mo74062i();
                        agmt agmt3 = agmt.f65982e;
                        agmu6.getClass();
                        if (!agmt2.f65987d.mo73666a()) {
                            agmt2.f65987d = bxvk.m124021a(agmt2.f65987d);
                        }
                        agmt2.f65987d.set(i3, agmu6);
                        arrayList.set(i2, (agmt) bxvd3.mo74062i());
                    }
                    i3++;
                    str6 = str4;
                    bxvd2 = bxvd8;
                    i = 5;
                }
                str3 = str6;
                bxvd = bxvd2;
            }
            if (((agmt) bxvd3.f164949b).f65986c.size() != 0) {
                for (int i5 = 0; i5 < ((agmt) bxvd3.f164949b).f65986c.size(); i5++) {
                    agmz agmz = (agmz) ((agmt) bxvd3.f164949b).f65986c.get(i5);
                    String a4 = agks.m54437a(agmz.f66018c, agka.f65765a, agka.f65766b);
                    if (a4 != null) {
                        bxvd bxvd9 = (bxvd) agmz.mo74142c(5);
                        bxvd9.mo73625a((bxvk) agmz);
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        agmz agmz2 = (agmz) bxvd9.f164949b;
                        agmz agmz3 = agmz.f66014h;
                        a4.getClass();
                        agmz2.f66016a |= 2;
                        agmz2.f66018c = a4;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agmt agmt4 = (agmt) bxvd3.f164949b;
                        agmz agmz4 = (agmz) bxvd9.mo74062i();
                        agmt agmt5 = agmt.f65982e;
                        agmz4.getClass();
                        if (!agmt4.f65986c.mo73666a()) {
                            agmt4.f65986c = bxvk.m124021a(agmt4.f65986c);
                        }
                        agmt4.f65986c.set(i5, agmz4);
                        arrayList.set(i2, (agmt) bxvd3.mo74062i());
                    }
                }
            }
            i2++;
            str6 = str3;
            bxvd2 = bxvd;
            i = 5;
        }
        String str7 = str6;
        bxvd bxvd10 = bxvd2;
        n.mo35659q();
        n.mo35241h();
        sdo.m34977c(str);
        sdo.m34959a(arrayList);
        SQLiteDatabase e2 = n.mo35360e();
        e2.beginTransaction();
        try {
            n.mo35659q();
            n.mo35241h();
            sdo.m34977c(str);
            SQLiteDatabase e3 = n.mo35360e();
            e3.delete("property_filters", "app_id=?", new String[]{str5});
            e3.delete("event_filters", "app_id=?", new String[]{str5});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bxvd bxvd11 = bxvd10;
                agmt agmt6 = (agmt) it.next();
                n.mo35659q();
                n.mo35241h();
                sdo.m34977c(str);
                sdo.m34959a(agmt6);
                if ((agmt6.f65984a & 1) != 0) {
                    int i6 = agmt6.f65985b;
                    Iterator it2 = agmt6.f65987d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if ((((agmu) it2.next()).f65990a & 1) == 0) {
                                n.mo35497E().f65567f.mo35437a("Event filter with no ID. Audience definition ignored. appId, audienceId", agid.m54288a(str), Integer.valueOf(i6));
                                bxvd10 = bxvd11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    n.mo35497E().f65567f.mo35436a("Audience with no ID. appId", agid.m54288a(str));
                    bxvd10 = bxvd11;
                }
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                for (agmt agmt7 : arrayList) {
                    bxvd bxvd12 = bxvd10;
                    arrayList2.add((agmt7.f65984a & 1) != 0 ? Integer.valueOf(agmt7.f65985b) : null);
                    bxvd10 = bxvd12;
                }
                sdo.m34977c(str);
                n.mo35659q();
                n.mo35241h();
                SQLiteDatabase e4 = n.mo35360e();
                long a5 = n.mo35334a("select count(1) from audience_filter_values where app_id=?", new String[]{str5});
                int max = Math.max(0, Math.min(2000, n.mo35538v().mo35317b(str5, aghn.f65449E)));
                if (a5 > ((long) max)) {
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i7);
                            if (num == null) {
                                break;
                            }
                            arrayList3.add(Integer.toString(num.intValue()));
                            i7++;
                        } else {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            e4.delete("audience_filter_values", sb3.toString(), new String[]{str5, Integer.toString(max)});
                            break;
                        }
                    }
                }
            } catch (SQLiteException e5) {
                n.mo35497E().f65564c.mo35437a("Database error querying filters. appId", agid.m54288a(str), e5);
            } catch (Throwable th) {
                th = th;
                e2.endTransaction();
                throw th;
            }
            e2.setTransactionSuccessful();
            e2.endTransaction();
            bxvd bxvd13 = bxvd10;
            try {
                if (bxvd13.f164950c) {
                    bxvd13.mo74035c();
                    bxvd13.f164950c = false;
                }
                agne agne = agne.f66038h;
                ((agne) bxvd13.f164949b).f66045f = bxvk.m124030de();
                bArr2 = ((agne) bxvd13.mo74062i()).mo73642k();
            } catch (RuntimeException e6) {
                mo35497E().f65567f.mo35437a("Unable to serialize reduced-size config. Storing full config instead. appId", agid.m54288a(str), e6);
                bArr2 = bArr;
            }
            agdl n2 = mo35656n();
            sdo.m34977c(str);
            n2.mo35241h();
            n2.mo35659q();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            try {
                if (((long) n2.mo35360e().update("apps", contentValues, "app_id = ?", new String[]{str5})) == 0) {
                    n2.mo35497E().f65564c.mo35436a("Failed to update remote config (got 0). appId", agid.m54288a(str));
                }
            } catch (SQLiteException e7) {
                n2.mo35497E().f65564c.mo35437a("Error storing remote config. appId", agid.m54288a(str), e7);
            }
            this.f65648a.put(str5, (agne) bxvd13.mo74062i());
            return true;
        } catch (SQLiteException e8) {
            n.mo35497E().f65564c.mo35437a("Error storing event filter. appId", agid.m54288a(str), e8);
        } catch (Throwable th2) {
            th = th2;
            e2.endTransaction();
            throw th;
        }
    }
}

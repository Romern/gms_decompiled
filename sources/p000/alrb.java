package p000;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: alrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alrb implements Runnable {

    /* renamed from: a */
    private final alqx f74147a;

    /* renamed from: b */
    private final SharedPreferences f74148b;

    /* renamed from: c */
    private final andd f74149c;

    /* renamed from: d */
    private final alqq f74150d;

    public alrb(SharedPreferences sharedPreferences, alqx alqx, alqv alqv, andd andd) {
        this.f74147a = alqx;
        this.f74148b = sharedPreferences;
        this.f74150d = alqv;
        this.f74149c = andd;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:94:0x0293 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:123:0x036d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:219:0x0293 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:223:0x0293 */
    /* JADX WARN: Type inference failed for: r9v13, assign insn: 0x0280: CONST  (r9v13 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v16, assign insn: PHI: (r9v16 ?) = (r9v13 ?), (r9v27 ?) binds: [B:93:0x0291, B:219:0x0293] */
    /* JADX WARN: Type inference failed for: r9v17, assign insn: PHI: (r9v17 ?) = (r9v16 ?), (r9v21 ?) binds: [B:94:0x0293, B:123:0x036d] */
    /* JADX WARN: Type inference failed for: r9v21, types: [bzcv], assign insn: 0x036b: MOVE  (r9v21 ? I:?[OBJECT, ARRAY]) = (r16v3 bzcv) */
    /* JADX WARN: Type inference failed for: r9v27, assign insn: PHI: (r9v27 ?) = (r9v16 ?), (r9v16 ?), (r9v34 ?) binds: [B:221:0x0293, B:222:0x0293, B:223:0x0293] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, bzdq], assign insn: 0x02f6: CHECK_CAST  (r9v34 ? I:bzdq) = (bzdq) (r9v33 GeneratedMessageLite) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alqv.a(boolean, boolean, bzcv):void
     arg types: [boolean, int, bzcv]
     candidates:
      alqv.a(java.util.List, java.util.Set, alqx):bzcx
      alqv.a(alqx, bzcx, java.lang.String):boolean
      alqq.a(byte[], java.lang.String, anda):boolean
      alqq.a(alqx, byte[], java.lang.String):boolean
      alqv.a(boolean, boolean, bzcv):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alqv.a(boolean, boolean, bzcv):void
     arg types: [int, boolean, bzcv]
     candidates:
      alqv.a(java.util.List, java.util.Set, alqx):bzcx
      alqv.a(alqx, bzcx, java.lang.String):boolean
      alqq.a(byte[], java.lang.String, anda):boolean
      alqq.a(alqx, byte[], java.lang.String):boolean
      alqv.a(boolean, boolean, bzcv):void */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x038a, code lost:
        if (r7 == null) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039b, code lost:
        if (r7 != null) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03a0, code lost:
        r17 = r17 & ((p000.alqv) r5).mo40664a(r6, (p000.bzcx) r9.mo74062i(), r13);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03b2 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x049b A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04b4 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void run() {
        boolean z;
        bmvz bmvz;
        boolean z2;
        bzcv bzcv;
        bzcv bzcv2;
        boolean z3;
        boolean z4;
        Set set;
        bmxv bmxv;
        boolean z5;
        try {
            alqq alqq = this.f74150d;
            alqx alqx = this.f74147a;
            alqp b = ((alqt) ((alqv) alqq).f74113d).mo6606a();
            if (b == null) {
                return;
            }
            if (!b.f74108a.isEmpty() || !b.f74109b.isEmpty()) {
                b.f74108a.size();
                b.f74109b.size();
                bzcx a = ((alqv) alqq).mo40663a(b.f74108a, b.f74109b, alqx);
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a);
                bzcv bzcv3 = (bzcv) bxvd;
                if (bzcv3 != null) {
                    bmxv a2 = ((alqv) alqq).f74111b.mo41295a();
                    if (a2.mo66813a()) {
                        Set<String> set2 = alqx.f74142b;
                        String str = alqx.f74141a;
                        if (!set2.isEmpty() || !TextUtils.isEmpty(str)) {
                            amig.m62939a();
                            bmxv b2 = ((amsa) ((alqv) alqq).f74111b).mo41296b();
                            if (b2.mo66813a()) {
                                bmvz = bmxv.m108567c(((rkj) b2.mo66814b()).mo24812f());
                            } else {
                                Log.w("DeviceUsageSettingsHelper", "getSignedInAccountName: Falling back to default value");
                                bmvz = bmvz.f131120a;
                            }
                            boolean z6 = true;
                            boolean z7 = false;
                            for (String str2 : set2) {
                                if (!str2.equals(str)) {
                                    z4 = false;
                                } else if (((Boolean) amhx.f74926a.mo41191a()).booleanValue()) {
                                    z7 = true;
                                    z4 = true;
                                } else {
                                    z7 = true;
                                }
                                amrz amrz = ((alqv) alqq).f74111b;
                                if (a2.mo66813a()) {
                                    try {
                                        bmxv = bmxv.m108566b(aytd.m84776b(str2, (String) a2.mo66814b()));
                                        set = set2;
                                    } catch (Exception e) {
                                        amig.m62939a();
                                        set = set2;
                                        ande.f76660a.mo41719a(((amsa) amrz).f75830b).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                        Log.e("DeviceUsageSettingsHelper", "getSignedInClientInstanceId: Unable to get clientInstanceId");
                                        bmxv = bmvz.f131120a;
                                    }
                                } else {
                                    set = set2;
                                    bmxv = bmvz.f131120a;
                                }
                                if (bmxv.mo66813a()) {
                                    String str3 = (String) bmxv.mo66814b();
                                    if (bzcv3.f164950c) {
                                        bzcv3.mo74035c();
                                        bzcv3.f164950c = false;
                                    }
                                    bzcx bzcx = (bzcx) bzcv3.f164949b;
                                    bzcx bzcx2 = bzcx.f169429h;
                                    str3.getClass();
                                    bzcx.f169431a |= 1;
                                    bzcx.f169433c = str3;
                                    bzdh bzdh = bzcx.f169436f;
                                    if (bzdh == null) {
                                        bzdh = bzdh.f169466A;
                                    }
                                    bxvd bxvd2 = (bxvd) bzdh.mo74142c(5);
                                    bxvd2.mo73625a((GeneratedMessageLite) bzdh);
                                    bzdb bzdb = (bzdb) bxvd2;
                                    if (bmvz.mo66813a()) {
                                        boolean z8 = !str2.equals(bmvz.mo66814b());
                                        if (bzdb.f164950c) {
                                            bzdb.mo74035c();
                                            bzdb.f164950c = false;
                                        }
                                        bzdh bzdh2 = (bzdh) bzdb.f164949b;
                                        bzdh2.f169469a |= 1048576;
                                        bzdh2.f169486r = z8;
                                    } else {
                                        if (bzdb.f164950c) {
                                            bzdb.mo74035c();
                                            bzdb.f164950c = false;
                                        }
                                        bzdh bzdh3 = (bzdh) bzdb.f164949b;
                                        bzdh3.f169469a |= 1048576;
                                        bzdh3.f169486r = true;
                                    }
                                    if (bzcv3.f164950c) {
                                        bzcv3.mo74035c();
                                        bzcv3.f164950c = false;
                                    }
                                    bzcx bzcx3 = (bzcx) bzcv3.f164949b;
                                    bzdh bzdh4 = (bzdh) bzdb.mo74062i();
                                    bzdh4.getClass();
                                    bzcx3.f169436f = bzdh4;
                                    bzcx3.f169431a |= 16;
                                    alqv.m61537a(z4, true, bzcv3);
                                    bzcx bzcx4 = (bzcx) bzcv3.mo74062i();
                                    amig.m62939a();
                                    if (!((Boolean) amhx.f74926a.mo41191a()).booleanValue()) {
                                        z5 = ((alqv) alqq).mo40664a(alqx, bzcx4, str2);
                                    } else {
                                        try {
                                            alqq.m61525a(alqx, bzcx4.serializeToBytes(), str2, ((alqv) alqq).f74137g);
                                            z5 = true;
                                        } catch (IllegalArgumentException e2) {
                                            almk.m61263a().mo40522a("ContactsLogger.contact_list_serialize_failure");
                                            z5 = false;
                                        }
                                    }
                                    z6 &= z5;
                                    set2 = set;
                                } else {
                                    set2 = set;
                                    z6 = false;
                                }
                            }
                            Set set3 = set2;
                            if (!TextUtils.isEmpty(str)) {
                                boolean z9 = z7;
                                alqv.m61537a(true, z9, bzcv3);
                                int i = alpz.f74048a;
                                HashMap hashMap = new HashMap();
                                for (bzcu bzcu : Collections.unmodifiableList(((bzcx) bzcv3.f164949b).f169432b)) {
                                    bxwc bxwc = bzcu.f169420k;
                                    int size = bxwc.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        bzdq bzdq = (bzdq) bxwc.get(i2);
                                        hashMap.put(Long.valueOf(bzdq.f169539b), bzdq);
                                        i2++;
                                        bzcv3 = bzcv3;
                                    }
                                }
                                bzcv bzcv4 = bzcv3;
                                Cursor cursor = null;
                                cursor = null;
                                try {
                                    ? r9 = 1;
                                    cursor = ((alqv) alqq).f74110a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id", "data1"}, alqv.m61535a(alqv.m61534a("raw_contact_id", hashMap.keySet()), alqv.m61533a("mimetype", "vnd.android.cursor.item/note")), null, null);
                                    if (cursor != null) {
                                        while (cursor.moveToNext()) {
                                            try {
                                                long j = cursor.getLong(cursor.getColumnIndex("raw_contact_id"));
                                                int columnIndex = cursor.getColumnIndex("data1");
                                                if (!cursor.isNull(columnIndex)) {
                                                    String string = cursor.getString(columnIndex);
                                                    if (((long) string.length()) <= cgbe.f186279a.mo6606a().mo83244A()) {
                                                        Long valueOf = Long.valueOf(j);
                                                        bzdq bzdq2 = (bzdq) hashMap.get(valueOf);
                                                        bxvd bxvd3 = (bxvd) bzdq2.mo74142c(5);
                                                        bxvd3.mo73625a((GeneratedMessageLite) bzdq2);
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        bzdq bzdq3 = (bzdq) bxvd3.f164949b;
                                                        bzdq bzdq4 = bzdq.f169536s;
                                                        string.getClass();
                                                        bzdq3.f169538a |= 128;
                                                        bzdq3.f169543f = string;
                                                        r9 = (bzdq) bxvd3.mo74062i();
                                                        hashMap.put(valueOf, r9);
                                                    }
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                z2 = z9;
                                                bzcv2 = bzcv4;
                                                try {
                                                    Log.e("ContactsLogger", "CP2 Query Exception when fetching note info", e);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (cursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        int i3 = 0;
                                        for (bzcu bzcu2 : ((bzcx) bzcv4.mo74062i()).f169432b) {
                                            bxvd bxvd4 = (bxvd) bzcu2.mo74142c(5);
                                            bxvd4.mo73625a((GeneratedMessageLite) bzcu2);
                                            bzcs bzcs = (bzcs) bxvd4;
                                            int i4 = 0;
                                            for (bzdq bzdq5 : bzcu2.f169420k) {
                                                int i5 = i4 + 1;
                                                z2 = z9;
                                                try {
                                                    bzdq bzdq6 = (bzdq) hashMap.get(Long.valueOf(bzdq5.f169539b));
                                                    if (bzcs.f164950c) {
                                                        bzcs.mo74035c();
                                                        bzcs.f164950c = false;
                                                    }
                                                    bzcu bzcu3 = (bzcu) bzcs.f164949b;
                                                    bzcu bzcu4 = bzcu.f169408q;
                                                    bzdq6.getClass();
                                                    bzcu3.mo74533g();
                                                    bzcu3.f169420k.set(i4, bzdq6);
                                                    i4 = i5;
                                                    z9 = z2;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    bzcv2 = bzcv4;
                                                    Log.e("ContactsLogger", "CP2 Query Exception when fetching note info", e);
                                                }
                                            }
                                            z2 = z9;
                                            int i6 = i3 + 1;
                                            r9 = bzcv4;
                                            try {
                                                r9.mo74534a(i3, bzcs);
                                                i3 = i6;
                                                bzcv4 = r9;
                                                z9 = z2;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                bzcv2 = r9;
                                                Log.e("ContactsLogger", "CP2 Query Exception when fetching note info", e);
                                            }
                                        }
                                        z3 = z9;
                                        bzcv = bzcv4;
                                    } else {
                                        z3 = z9;
                                        bzcv = bzcv4;
                                        Log.w("ContactsLogger", "CP2 failed to fetch Note info.");
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    z2 = z9;
                                    bzcv2 = bzcv4;
                                    Log.e("ContactsLogger", "CP2 Query Exception when fetching note info", e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } else {
                                z2 = z7;
                            }
                            almk a3 = almk.m61263a();
                            boolean z10 = !TextUtils.isEmpty(str);
                            boolean z11 = !set3.isEmpty();
                            boolean z12 = !z2;
                            int size2 = set3.size();
                            bxvd da = amku.f75091n.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amku amku = (amku) da.f164949b;
                            amku.f75093a |= 2048;
                            amku.f75105m = size2;
                            bxvd da2 = amkv.f75106m.mo74144da();
                            if (!z10 || !z11) {
                                if (!z10 && z11) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amku amku2 = (amku) da.f164949b;
                                    amku2.f75093a |= 8;
                                    amku2.f75097e = true;
                                } else if (z10) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    amku amku3 = (amku) da.f164949b;
                                    amku3.f75093a |= 4;
                                    amku3.f75096d = true;
                                }
                            } else if (!z12) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amku amku4 = (amku) da.f164949b;
                                amku4.f75093a |= 1;
                                amku4.f75094b = true;
                            } else {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amku amku5 = (amku) da.f164949b;
                                amku5.f75093a |= 2;
                                amku5.f75095c = true;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amkv amkv = (amkv) da2.f164949b;
                            amku amku6 = (amku) da.mo74062i();
                            amku6.getClass();
                            amkv.f75119l = amku6;
                            amkv.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            a3.mo40514a((amkv) da2.mo74062i());
                            z = z6;
                            almk a4 = almk.m61263a();
                            bxvd da3 = amkv.f75106m.mo74144da();
                            if (!z) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                amkv amkv2 = (amkv) da3.f164949b;
                                amkv2.f75108a |= 64;
                                amkv2.f75112e = true;
                            } else {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                amkv amkv3 = (amkv) da3.f164949b;
                                amkv3.f75108a |= 128;
                                amkv3.f75113f = true;
                            }
                            a4.mo40514a((amkv) da3.mo74062i());
                            if (!z) {
                                SharedPreferences.Editor edit = this.f74148b.edit();
                                alqx alqx2 = this.f74147a;
                                if (!alqx2.f74144d) {
                                    edit.putLong("contacts-logger-full-upload-timestamp", alqx2.f74143c);
                                    amig.m62939a();
                                    if (((Boolean) amia.f74929a.mo41191a()).booleanValue()) {
                                        edit.putInt("contacts-logger-batch-upload-version", this.f74148b.getInt("contacts-logger-batch-upload-version", 0) + 1);
                                    }
                                    edit.apply();
                                }
                                edit.putLong("contacts-logger-incremental-upload-timestamp", this.f74147a.f74143c).putBoolean("contacts-logger-pending-significant-update", false).apply();
                                return;
                            }
                            return;
                        }
                    }
                    z = false;
                    almk a42 = almk.m61263a();
                    bxvd da32 = amkv.f75106m.mo74144da();
                    if (!z) {
                    }
                    a42.mo40514a((amkv) da32.mo74062i());
                    if (!z) {
                    }
                }
            }
        } catch (Exception e7) {
            almk.m61263a().mo40522a("ContactsLoggerTask.logData_failure");
            amig.m62939a();
            this.f74149c.mo41718a(e7, ((Double) amht.f74922a.mo41191a()).doubleValue());
        }
    }
}

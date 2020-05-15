package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: eez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eez {

    /* renamed from: b */
    public static final Set f14808b;

    /* renamed from: a */
    public final HashMap f14809a;

    static {
        HashSet hashSet = new HashSet();
        f14808b = hashSet;
        hashSet.add(10002);
    }

    protected eez() {
        if (dwq.m9669m().mo9536a("ContextManagerStore") == null) {
            byte[] bArr = new byte[32];
            new dsy().f13972a.nextBytes(bArr);
            dsz m = dwq.m9669m();
            sdo.m34977c("ContextManagerStore");
            if (m.mo9536a("ContextManagerStore") != null) {
                tjr tjr = new tjr(null);
                tkb tkb = new tkb();
                tkb.mo26624b();
                TimeFilterImpl a = tkb.mo26620a();
                tjv tjv = new tjv();
                tjv.mo26613a("ContextManagerStore");
                tjr.mo26597a(4, a, tjv.mo26612a());
                dwq.m9673q().mo10056b(tjr.mo26595a());
                m.f13973a.remove("ContextManagerStore");
            }
            bxvd da = bxht.f163469c.mo74144da();
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxht bxht = (bxht) da.f164949b;
            a2.getClass();
            bxht.f163471a |= 1;
            bxht.f163472b = a2;
            bxht bxht2 = (bxht) da.mo74062i();
            tjo tjo = new tjo(null, 4);
            tjo.mo26590a(bxht2.serializeToBytes());
            tjo.mo26588a(tju.m37104a("ContextManagerStore", null, null));
            dwq.m9673q().mo10051a(tjo.mo26587a());
            m.f13973a.put("ContextManagerStore", bxht2);
        }
        this.f14809a = new HashMap();
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
    private final long m10269a(ContextData contextData, SQLiteDatabase sQLiteDatabase) {
        long j;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", contextData.mo18014d());
        contentValues.put("context_name", Integer.valueOf(contextData.mo18018g()));
        contentValues.put("context_family", Integer.valueOf(contextData.mo18017f()));
        contentValues.put("module_id", contextData.mo18015e().mo26585c());
        contentValues.put("version", Integer.valueOf(contextData.mo18015e().mo26584b()));
        eee.m10221a(contentValues, contextData.mo18022j());
        contentValues.put("proto_blob", contextData.mo18012b());
        eee.m10220a(contentValues, contextData.mo18024l());
        long a = dwq.m9665i().mo20505a();
        contentValues.put("sync_state", (Integer) 0);
        contentValues.put("sync_state_mod_time_millis", Long.valueOf(a));
        byte[] a2 = dwq.m9669m().mo9536a("ContextManagerStore");
        try {
            byte[] b = contextData.mo18012b();
            byte[] doFinal = dsx.m9267a(1, a2).doFinal(b);
            dsx.f13969a++;
            dsx.f13970b += (long) b.length;
            dsx.f13971c += (long) doFinal.length;
            contentValues.put("proto_blob", doFinal);
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eez", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[StoreReadWrite] Could not encrypt context");
        }
        try {
            j = sQLiteDatabase2.insertOrThrow("context", null, contentValues);
        } catch (SQLException e2) {
            new Object[1][0] = Integer.valueOf(contextData.mo18018g());
            j = -1;
        }
        if (j != -1) {
            return j;
        }
        ArrayList a3 = m10271a(sQLiteDatabase, "context", contextData.mo18014d(), "_id", "context_id", "version");
        if (sqw.m36041a((Collection) a3)) {
            return -1;
        }
        if (a3.size() > 1) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("eez", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[StoreReadWrite] More than one row with same id in context table. This is impossible.");
        }
        int b2 = contextData.mo18015e().mo26584b();
        eey eey = (eey) a3.get(0);
        if (eey.f14807b >= b2) {
            return eey.f14806a;
        }
        try {
            return sQLiteDatabase2.insertWithOnConflict("context", null, contentValues, 5);
        } catch (SQLException e3) {
            new Object[1][0] = Integer.valueOf(contextData.mo18018g());
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        if (r2 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        if (r2 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d4, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* renamed from: b */
    public final ArrayList mo10063b(ContextDataFilterImpl contextDataFilterImpl, doh doh) {
        ContextDataFilterImpl contextDataFilterImpl2 = contextDataFilterImpl;
        doh doh2 = doh;
        new Object[1][0] = contextDataFilterImpl2;
        ArrayList arrayList = new ArrayList();
        if (!mo10061a(doh2)) {
            return arrayList;
        }
        String a = eex.m10264a(contextDataFilterImpl);
        String a2 = eex.m10267a(contextDataFilterImpl2, "start_time");
        String a3 = eex.m10266a((tmx) contextDataFilterImpl);
        String[] strArr = {"proto_blob"};
        Cursor cursor = null;
        try {
            eed o = dwq.m9671o();
            dwq.m9681y().mo9332a(doh2);
            cursor = o.f14768a.mo10024a(doh2).getReadableDatabase().query("context", strArr, a, null, null, null, a2, a3);
            while (cursor.moveToNext()) {
                try {
                    byte[] blob = cursor.getBlob(0);
                    if (blob != null) {
                        ContextData contextData = new ContextData(dsx.m9267a(2, dwq.m9669m().mo9536a("ContextManagerStore")).doFinal(blob));
                        try {
                            contextData.mo18013c();
                            arrayList.add(contextData);
                        } catch (IllegalStateException e) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("eez", "b", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("[StoreReadWrite] Could not deserialize stored context.");
                        }
                    } else {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        bnsl2.mo68432a("eez", "b", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("[StoreReadWrite] ContextData proto bytes are null on read for query %s.", a);
                    }
                } catch (SQLException | GeneralSecurityException e2) {
                    e = e2;
                    try {
                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                        bnsl3.mo68437a(e);
                        bnsl3.mo68432a("eez", "b", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("[StoreReadWrite]  %s", e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLException | GeneralSecurityException e3) {
            e = e3;
            bnsl bnsl32 = (bnsl) dss.f13961a.mo68387b();
            bnsl32.mo68437a(e);
            bnsl32.mo68432a("eez", "b", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl32.mo68420a("[StoreReadWrite]  %s", e.getMessage());
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final long m10270a(List list, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m10269a((ContextData) it.next(), sQLiteDatabase) == -1) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (SQLiteException | IllegalStateException e) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("eez", "a", 386, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("[StoreReadWrite]  %s", e.getMessage());
                    }
                    return -1;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            try {
                sQLiteDatabase.endTransaction();
                return 1;
            } catch (SQLiteException | IllegalStateException e2) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("eez", "a", 386, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[StoreReadWrite]  %s", e2.getMessage());
                return 1;
            }
        } catch (SQLException e3) {
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("eez", "a", 380, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("[StoreReadWrite]  %s", e3.getMessage());
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteException | IllegalStateException e4) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                bnsl4.mo68437a(e4);
                bnsl4.mo68432a("eez", "a", 386, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("[StoreReadWrite]  %s", e4.getMessage());
            }
            return -1;
        } catch (Throwable th) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteException | IllegalStateException e5) {
                bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                bnsl5.mo68437a(e5);
                bnsl5.mo68432a("eez", "a", 386, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("[StoreReadWrite]  %s", e5.getMessage());
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
    /* renamed from: a */
    private final ArrayList m10271a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList;
        String[] strArr = {str3, str5};
        Cursor cursor = null;
        try {
            eeq.m10251b();
            eep a = eeq.m10250a();
            a.mo10044a(str4, str2, true);
            Cursor query = sQLiteDatabase.query(str, strArr, a.mo10046b(), null, null, null, null);
            try {
                arrayList = new ArrayList();
                while (query.moveToNext()) {
                    arrayList.add(new eey(query.getLong(0), query.getInt(1)));
                }
                if (query != null) {
                    query.close();
                    return arrayList;
                }
            } catch (SQLException e) {
                e = e;
                cursor = query;
                try {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("eez", "a", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("[StoreReadWrite] %s", e.getMessage());
                    if (cursor != null) {
                    }
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
            }
        } catch (SQLException e2) {
            e = e2;
            arrayList = null;
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("eez", "a", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[StoreReadWrite] %s", e.getMessage());
            if (cursor != null) {
                cursor.close();
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m10272a(doh doh, HashMap hashMap) {
        ArrayList arrayList = (ArrayList) hashMap.get(doh);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        hashMap.put(doh, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public final int mo10057a(ContextDataFilterImpl contextDataFilterImpl, doh doh) {
        mo10061a(doh);
        try {
            return dwq.m9671o().mo10033a(doh).delete("context", eex.m10264a(contextDataFilterImpl), null);
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eez", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[StoreReadWrite]  %s", e.getMessage());
            return 0;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eep.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      eep.a(java.lang.String, java.lang.Object):void
      eep.a(java.lang.String, java.lang.Object[]):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10058a(String str, String str2, String[] strArr, int i, long j, doh doh) {
        sdo.m34974b(ContextData.m22842a(i));
        eeq.m10251b();
        eep a = eeq.m10250a();
        a.mo10045a(str2, (Object[]) strArr);
        String b = a.mo10046b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", Integer.valueOf(i));
        contentValues.put("sync_state_mod_time_millis", Long.valueOf(j));
        try {
            return dwq.m9671o().mo10033a(doh).update(str, contentValues, b, null);
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eez", "a", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[StoreReadWrite]  %s", e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10059a(Collection collection, int i, long j, doh doh) {
        int i2 = 0;
        if (collection != null && !collection.isEmpty()) {
            String[] strArr = new String[collection.size()];
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                strArr[i2] = ((ContextData) it.next()).mo18014d();
                i2++;
            }
            return mo10058a("context", "context_id", strArr, i, j, doh);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("eez", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[StoreReadWrite] Empty context data batch to update syncState to %s", Integer.toString(i));
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final long mo10060a(ContextData contextData, doh doh) {
        boolean z;
        new Object[1][0] = contextData;
        ((ArrayList) m10272a(doh, this.f14809a)).add(contextData);
        List list = (List) this.f14809a.get(doh);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (f14808b.contains(Integer.valueOf(((ContextData) it.next()).mo18018g()))) {
                        z = mo10061a(doh);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return 1;
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eez", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[StoreReadWrite] Cache flush failed when writing to database in insert.");
            return -1;
        }
        if (m10272a(doh, this.f14809a).size() < ((int) cdgp.f180782a.mo6606a().mo77598r())) {
            return 1;
        }
        z = mo10061a(doh);
        if (!z) {
        }
    }

    /* renamed from: a */
    public final boolean mo10061a(doh doh) {
        HashMap hashMap;
        try {
            if (m10270a(m10272a(doh, this.f14809a), dwq.m9671o().mo10033a(doh)) != 1) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("eez", "a", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[StoreReadWrite] Context Cache flush failed for account: %s", doh);
                hashMap = this.f14809a;
                hashMap.remove(doh);
                return false;
            }
            this.f14809a.remove(doh);
            return true;
        } catch (SQLException e) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("eez", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[StoreReadWrite]  %s", e.getMessage());
            hashMap = this.f14809a;
        } catch (Throwable th) {
            this.f14809a.remove(doh);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10062a(String str, doh doh) {
        mo10061a(doh);
        eeq.m10251b();
        eep a = eeq.m10250a();
        a.mo10044a("context_id", str, true);
        try {
            if (dwq.m9671o().mo10033a(doh).delete("context", a.mo10046b(), null) > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eez", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[StoreReadWrite]  %s", e.getMessage());
            return false;
        }
    }
}

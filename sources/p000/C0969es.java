package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: es */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0969es {

    /* renamed from: a */
    public final String f15585a;

    /* renamed from: b */
    public final Map f15586b;

    /* renamed from: c */
    public final Set f15587c;

    /* renamed from: d */
    public final Set f15588d;

    public C0969es(String str, Map map, Set set, Set set2) {
        this.f15585a = str;
        this.f15586b = Collections.unmodifiableMap(map);
        this.f15587c = Collections.unmodifiableSet(set);
        this.f15588d = set2 != null ? Collections.unmodifiableSet(set2) : null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0205, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0209, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0218 A[EDGE_INSN: B:105:0x0218->B:69:0x0218 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f9 A[Catch:{ all -> 0x0205, all -> 0x0222 }] */
    /* renamed from: a */
    public static C0969es m11066a(C0933dj djVar, String str) {
        int i;
        int i2;
        int i3;
        C0933dj djVar2;
        HashSet hashSet;
        boolean z;
        String str2;
        C0968er erVar;
        int i4;
        int i5;
        int i6;
        C0933dj djVar3 = djVar;
        String str3 = str;
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str3);
        String str4 = "`)";
        sb.append(str4);
        Cursor a = djVar3.mo9112a(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (a.getColumnCount() > 0) {
                int columnIndex = a.getColumnIndex("name");
                int columnIndex2 = a.getColumnIndex("type");
                int columnIndex3 = a.getColumnIndex("notnull");
                int columnIndex4 = a.getColumnIndex("pk");
                int columnIndex5 = a.getColumnIndex("dflt_value");
                while (a.moveToNext()) {
                    String string = a.getString(columnIndex);
                    hashMap.put(string, new C0965eo(string, a.getString(columnIndex2), a.getInt(columnIndex3) != 0, a.getInt(columnIndex4), a.getString(columnIndex5), 2));
                }
            }
            a.close();
            HashSet hashSet2 = new HashSet();
            Cursor a2 = djVar3.mo9112a("PRAGMA foreign_key_list(`" + str3 + str4);
            try {
                int columnIndex6 = a2.getColumnIndex("id");
                int columnIndex7 = a2.getColumnIndex("seq");
                int columnIndex8 = a2.getColumnIndex("table");
                int columnIndex9 = a2.getColumnIndex("on_delete");
                int columnIndex10 = a2.getColumnIndex("on_update");
                int columnIndex11 = a2.getColumnIndex("id");
                int columnIndex12 = a2.getColumnIndex("seq");
                int columnIndex13 = a2.getColumnIndex("from");
                int columnIndex14 = a2.getColumnIndex("to");
                int i7 = columnIndex10;
                int count = a2.getCount();
                int i8 = columnIndex9;
                ArrayList<C0967eq> arrayList = new ArrayList();
                int i9 = columnIndex8;
                int i10 = 0;
                while (i10 < count) {
                    a2.moveToPosition(i10);
                    arrayList.add(new C0967eq(a2.getInt(columnIndex11), a2.getInt(columnIndex12), a2.getString(columnIndex13), a2.getString(columnIndex14)));
                    i10++;
                    count = count;
                    columnIndex6 = columnIndex6;
                    columnIndex11 = columnIndex11;
                    columnIndex12 = columnIndex12;
                    columnIndex13 = columnIndex13;
                }
                int i11 = columnIndex6;
                Collections.sort(arrayList);
                int count2 = a2.getCount();
                int i12 = 0;
                while (i12 < count2) {
                    String str5 = str4;
                    a2.moveToPosition(i12);
                    if (a2.getInt(columnIndex7) == 0) {
                        int i13 = i11;
                        int i14 = a2.getInt(i13);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (C0967eq eqVar : arrayList) {
                            int i15 = i3;
                            int i16 = i2;
                            int i17 = i;
                            int i18 = i13;
                            if (eqVar.f15501a == i14) {
                                arrayList2.add(eqVar.f15503c);
                                arrayList3.add(eqVar.f15504d);
                                i = i17;
                                i2 = i16;
                                i3 = i15;
                                i13 = i18;
                            } else {
                                i = i17;
                                i2 = i16;
                                i3 = i15;
                                i13 = i18;
                            }
                        }
                        i6 = i;
                        i5 = i2;
                        hashSet2.add(new C0966ep(a2.getString(i6), a2.getString(i5), a2.getString(i3), arrayList2, arrayList3));
                        i11 = i13;
                        i4 = i3;
                    } else {
                        i4 = i3;
                        i5 = i2;
                        i6 = i;
                    }
                    i12++;
                    djVar3 = djVar;
                    str3 = str;
                    i9 = i6;
                    i8 = i5;
                    i7 = i4;
                    str4 = str5;
                }
                a2.close();
                Cursor a3 = djVar2.mo9112a("PRAGMA index_list(`" + str3 + str4);
                try {
                    int columnIndex15 = a3.getColumnIndex("name");
                    int columnIndex16 = a3.getColumnIndex("origin");
                    int columnIndex17 = a3.getColumnIndex("unique");
                    if (columnIndex15 != -1) {
                        if (columnIndex16 != -1 && columnIndex17 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (true) {
                                if (!a3.moveToNext()) {
                                    a3.close();
                                    hashSet = hashSet3;
                                    break;
                                } else if ("c".equals(a3.getString(columnIndex16))) {
                                    String string2 = a3.getString(columnIndex15);
                                    if (a3.getInt(columnIndex17) == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    a3 = djVar2.mo9112a("PRAGMA index_xinfo(`" + string2 + str4);
                                    int columnIndex18 = a3.getColumnIndex("seqno");
                                    int columnIndex19 = a3.getColumnIndex("cid");
                                    int columnIndex20 = a3.getColumnIndex("name");
                                    int i19 = columnIndex15;
                                    if (columnIndex18 != -1) {
                                        if (columnIndex19 != -1 && columnIndex20 != -1) {
                                            TreeMap treeMap = new TreeMap();
                                            while (a3.moveToNext()) {
                                                if (a3.getInt(columnIndex19) >= 0) {
                                                    String str6 = str4;
                                                    int i20 = columnIndex20;
                                                    treeMap.put(Integer.valueOf(a3.getInt(columnIndex18)), a3.getString(columnIndex20));
                                                    columnIndex20 = i20;
                                                    str4 = str6;
                                                }
                                            }
                                            ArrayList arrayList4 = new ArrayList(treeMap.size());
                                            arrayList4.addAll(treeMap.values());
                                            erVar = new C0968er(string2, z, arrayList4);
                                            str2 = str4;
                                            if (erVar != null) {
                                                break;
                                            }
                                            hashSet3.add(erVar);
                                            djVar2 = djVar;
                                            columnIndex15 = i19;
                                            str4 = str2;
                                        } else {
                                            str2 = str4;
                                        }
                                    } else {
                                        str2 = str4;
                                    }
                                    a3.close();
                                    erVar = null;
                                    if (erVar != null) {
                                    }
                                } else {
                                    djVar2 = djVar;
                                }
                            }
                        }
                    }
                    a3.close();
                    hashSet = null;
                    return new C0969es(str3, hashMap, hashSet2, hashSet);
                } finally {
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (Throwable th2) {
            a.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0969es) {
            C0969es esVar = (C0969es) obj;
            if (this.f15585a.equals(esVar.f15585a)) {
                Map map = this.f15586b;
                if (map == null ? esVar.f15586b != null : !map.equals(esVar.f15586b)) {
                    return false;
                }
                Set set2 = this.f15587c;
                if (set2 == null ? esVar.f15587c != null : !set2.equals(esVar.f15587c)) {
                    return false;
                }
                Set set3 = this.f15588d;
                if (set3 == null || (set = esVar.f15588d) == null) {
                    return true;
                }
                return set3.equals(set);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15585a.hashCode() * 31;
        Map map = this.f15586b;
        int i = 0;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f15587c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f15585a + "', columns=" + this.f15586b + ", foreignKeys=" + this.f15587c + ", indices=" + this.f15588d + '}';
    }
}

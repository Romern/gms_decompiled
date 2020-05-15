package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: dc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0925dc {

    /* renamed from: a */
    public final int f12760a;

    /* renamed from: b */
    public C0940dq f12761b;

    /* renamed from: c */
    public final C0954ed f12762c;

    /* renamed from: d */
    public final String f12763d;

    /* renamed from: e */
    public final String f12764e;

    public C0925dc(C0940dq dqVar, C0954ed edVar, String str, String str2) {
        this.f12760a = edVar.f14714a;
        this.f12761b = dqVar;
        this.f12762c = edVar;
        this.f12763d = str;
        this.f12764e = str2;
    }

    /* renamed from: a */
    public static final void m8130a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                int i = Build.VERSION.SDK_INT;
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo8501a(C0933dj djVar) {
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f12763d;
        djVar.mo9115b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0070 A[EDGE_INSN: B:51:0x0070->B:29:0x0070 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public final void mo8502a(C0933dj djVar, int i, int i2) {
        TreeMap treeMap;
        Set set;
        boolean z;
        C0940dq dqVar = this.f12761b;
        if (dqVar != null) {
            C0952eb ebVar = dqVar.f13799c;
            List<C0961ek> list = null;
            if (i != i2) {
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                while (true) {
                    if (i2 <= i) {
                        if (i3 <= i2) {
                            break;
                        }
                        treeMap = (TreeMap) ebVar.f14582a.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        if (i2 <= i) {
                            set = treeMap.keySet();
                        } else {
                            set = treeMap.descendingKeySet();
                        }
                        Iterator it = set.iterator();
                        while (true) {
                            z = true;
                            boolean z2 = false;
                            if (!it.hasNext()) {
                                z = false;
                                continue;
                                break;
                            }
                            int intValue = ((Integer) it.next()).intValue();
                            if (i2 > i ? intValue <= i2 && intValue > i3 : intValue >= i2 && intValue < i3) {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                arrayList.add((C0961ek) treeMap.get(Integer.valueOf(intValue)));
                                i3 = intValue;
                                continue;
                                break;
                            }
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        if (i3 >= i2) {
                            break;
                        }
                        treeMap = (TreeMap) ebVar.f14582a.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                        }
                    }
                }
            } else {
                list = Collections.emptyList();
            }
            if (list != null) {
                this.f12762c.mo9984e(djVar);
                for (C0961ek ekVar : list) {
                    ekVar.mo10221a(djVar);
                }
                C0955ee d = this.f12762c.mo9983d(djVar);
                if (d.f14760a) {
                    mo8501a(djVar);
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + d.f14761b);
            }
        }
        C0940dq dqVar2 = this.f12761b;
        if (dqVar2 == null || ((i <= i2 || !dqVar2.f13803g) && dqVar2.f13802f)) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f12762c.mo9980a(djVar);
        this.f12762c.mo9981b(djVar);
    }
}

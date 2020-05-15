package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: erm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class erm implements erg {

    /* renamed from: a */
    private final C0953ec f15563a;

    /* renamed from: b */
    private final C0942ds f15564b;

    /* renamed from: c */
    private final C0958eh f15565c;

    /* renamed from: d */
    private final C0958eh f15566d;

    public erm(C0953ec ecVar) {
        this.f15563a = ecVar;
        this.f15564b = new erh(ecVar);
        new eri(ecVar);
        new erj(ecVar);
        this.f15565c = new erk(ecVar);
        this.f15566d = new erl(ecVar);
    }

    /* renamed from: a */
    public final ern mo10437a(String str, String str2, bsxn bsxn, boolean z, String str3) {
        boolean z2;
        epq epq;
        String str4 = str;
        String str5 = str2;
        C0956ef a = C0956ef.m10280a("SELECT * FROM resource_info WHERE accountName LIKE ? AND language LIKE ? AND resourceKey LIKE ? AND darkModeEnabled LIKE ? AND callingAndroidApp LIKE ? ", 5);
        if (str4 == null) {
            a.mo8917a(1);
        } else {
            a.mo8919a(1, str4);
        }
        if (str5 != null) {
            a.mo8919a(2, str5);
        } else {
            a.mo8917a(2);
        }
        byte[] a2 = epp.m10914a(bsxn);
        if (a2 == null) {
            a.mo8917a(3);
        } else {
            a.f14815e[3] = 5;
            a.f14814d[3] = a2;
        }
        a.f14815e[4] = 2;
        a.f14811a[4] = z ? 1 : 0;
        a.mo8919a(5, str3);
        this.f15563a.mo9943e();
        Cursor a3 = this.f15563a.mo9937a(a);
        try {
            int a4 = C0962el.m10613a(a3, "accountName");
            int a5 = C0962el.m10613a(a3, "language");
            int a6 = C0962el.m10613a(a3, "resourceKey");
            int a7 = C0962el.m10613a(a3, "darkModeEnabled");
            int a8 = C0962el.m10613a(a3, "callingAndroidApp");
            int a9 = C0962el.m10613a(a3, "resource");
            int a10 = C0962el.m10613a(a3, "lastUpdatedMs");
            ern ern = null;
            if (a3.moveToFirst()) {
                String string = a3.getString(a4);
                String string2 = a3.getString(a5);
                bsxn a11 = epp.m10912a(a3.getBlob(a6));
                if (a3.getInt(a7) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string3 = a3.getString(a8);
                if (a3.isNull(a9) && a3.isNull(a10)) {
                    epq = null;
                } else {
                    epq = new epq(epp.m10915b(a3.getBlob(a9)), a3.getLong(a10));
                }
                ern = new ern(string, string2, a11, z2, string3, epq);
            }
            return ern;
        } finally {
            a3.close();
            a.mo10064b();
        }
    }

    /* renamed from: b */
    public final void mo10441b() {
        this.f15563a.mo9943e();
        C0939dp b = this.f15566d.mo10124b();
        this.f15563a.mo9944f();
        try {
            b.mo9363b();
            this.f15563a.mo9946h();
        } finally {
            this.f15563a.mo9945g();
            this.f15566d.mo10123a(b);
        }
    }

    /* renamed from: b */
    public final void mo10442b(List list) {
        this.f15563a.mo9943e();
        StringBuilder a = C0964en.m10746a();
        a.append("DELETE FROM resource_info WHERE accountName NOT IN (");
        C0964en.m10747a(a, list.size());
        a.append(")");
        C0939dp a2 = this.f15563a.mo9938a(a.toString());
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            if (str == null) {
                a2.mo8917a(i);
            } else {
                a2.mo8919a(i, str);
            }
            i++;
        }
        this.f15563a.mo9944f();
        try {
            a2.mo9363b();
            this.f15563a.mo9946h();
        } finally {
            this.f15563a.mo9945g();
        }
    }

    /* renamed from: a */
    public final List mo10438a() {
        C0956ef efVar;
        boolean z;
        epq epq;
        C0956ef a = C0956ef.m10280a("SELECT * FROM resource_info", 0);
        this.f15563a.mo9943e();
        Cursor a2 = this.f15563a.mo9937a(a);
        try {
            int a3 = C0962el.m10613a(a2, "accountName");
            int a4 = C0962el.m10613a(a2, "language");
            int a5 = C0962el.m10613a(a2, "resourceKey");
            int a6 = C0962el.m10613a(a2, "darkModeEnabled");
            int a7 = C0962el.m10613a(a2, "callingAndroidApp");
            int a8 = C0962el.m10613a(a2, "resource");
            int a9 = C0962el.m10613a(a2, "lastUpdatedMs");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(a3);
                String string2 = a2.getString(a4);
                bsxn a10 = epp.m10912a(a2.getBlob(a5));
                if (a2.getInt(a6) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string3 = a2.getString(a7);
                if (a2.isNull(a8) && a2.isNull(a9)) {
                    efVar = a;
                    epq = null;
                } else {
                    efVar = a;
                    try {
                        epq = new epq(epp.m10915b(a2.getBlob(a8)), a2.getLong(a9));
                    } catch (Throwable th) {
                        th = th;
                        a2.close();
                        efVar.mo10064b();
                        throw th;
                    }
                }
                arrayList.add(new ern(string, string2, a10, z, string3, epq));
                a = efVar;
            }
            a2.close();
            a.mo10064b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            efVar = a;
            a2.close();
            efVar.mo10064b();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo10439a(long j) {
        this.f15563a.mo9943e();
        C0939dp b = this.f15565c.mo10124b();
        b.mo8918a(1, j);
        this.f15563a.mo9944f();
        try {
            b.mo9363b();
            this.f15563a.mo9946h();
        } finally {
            this.f15563a.mo9945g();
            this.f15565c.mo10123a(b);
        }
    }

    /* renamed from: a */
    public final void mo10440a(List list) {
        this.f15563a.mo9943e();
        this.f15563a.mo9944f();
        try {
            this.f15564b.mo9523a(list);
            this.f15563a.mo9946h();
        } finally {
            this.f15563a.mo9945g();
        }
    }
}

package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyq {

    /* renamed from: a */
    public final vys f50245a;

    /* renamed from: b */
    public final bxvd f50246b;

    /* renamed from: c */
    private final vwf f50247c;

    public vyq(vys vys, vwf vwf) {
        byte[] bArr;
        Cursor query;
        this.f50245a = vys;
        this.f50247c = vwf;
        try {
            SQLiteDatabase readableDatabase = vys.f50248a.getReadableDatabase();
            readableDatabase.beginTransaction();
            try {
                query = readableDatabase.query("t", new String[]{"a"}, null, null, null, null, null);
                if (query.moveToNext()) {
                    bArr = query.getBlob(0);
                    query.close();
                    readableDatabase.endTransaction();
                } else {
                    bArr = new byte[0];
                    query.close();
                    readableDatabase.endTransaction();
                }
                readableDatabase.close();
            } catch (Throwable th) {
                readableDatabase.endTransaction();
                readableDatabase.close();
                throw th;
            }
        } catch (RuntimeException e) {
            vys.f50249b.mo28911a(e);
            bArr = new byte[0];
        }
        bxvd da = vwc.f50113h.mo74144da();
        this.f50246b = da;
        if (bArr != null) {
            try {
                da.mo73635b(bArr, bxus.m123743b());
            } catch (bxwf e2) {
                this.f50247c.mo28911a(e2);
            }
        }
    }

    /* renamed from: a */
    public static vyq m41600a(Context context) {
        return new vyq(new vys(context, "dgp.db"), vwf.m41483a(context));
    }

    /* renamed from: b */
    public final long mo28973b() {
        return ((vwc) this.f50246b.f164949b).f50117c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo28974c() {
        return Math.max(0L, mo28973b() - System.currentTimeMillis()) / 1000;
    }

    /* renamed from: d */
    public final int mo28975d() {
        return ((vwc) this.f50246b.f164949b).f50121g;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo28976e() {
        if (mo28977f() <= 1) {
            return 0;
        }
        long d = cdrh.f181595a.mo6606a().mo78210d();
        return Math.max(Math.min(cdrh.m134735b(), d << ((int) Math.min((long) (mo28977f() - 2), ((long) Long.numberOfLeadingZeros(d)) - 1))) - Math.max(0L, (System.currentTimeMillis() - ((vwc) this.f50246b.f164949b).f50118d) / 1000), 0L);
    }

    /* renamed from: f */
    public final int mo28977f() {
        return ((vwc) this.f50246b.f164949b).f50119e;
    }

    /* renamed from: a */
    public final long mo28970a() {
        return ((vwc) this.f50246b.f164949b).f50116b;
    }

    /* renamed from: a */
    public final void mo28971a(Integer num) {
        if (num != null) {
            bxvd bxvd = this.f50246b;
            int intValue = num.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            vwc vwc = (vwc) bxvd.f164949b;
            vwc vwc2 = vwc.f50113h;
            vwc.f50115a |= 32;
            vwc.f50121g = intValue;
            return;
        }
        bxvd bxvd2 = this.f50246b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        vwc vwc3 = (vwc) bxvd2.f164949b;
        vwc vwc4 = vwc.f50113h;
        vwc3.f50115a &= -33;
        vwc3.f50121g = 0;
    }

    /* renamed from: a */
    public final void mo28972a(Throwable th) {
        bxvd bxvd = this.f50246b;
        vvy b = vwf.m41484b(th);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        vwc vwc = (vwc) bxvd.f164949b;
        vwc vwc2 = vwc.f50113h;
        b.getClass();
        vwc.f50120f = b;
        vwc.f50115a |= 16;
        this.f50245a.mo28979a(((vwc) this.f50246b.mo74062i()).mo73642k());
    }
}

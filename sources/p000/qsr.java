package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: qsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsr extends qsi {

    /* renamed from: b */
    public static final /* synthetic */ int f42053b = 0;

    /* renamed from: c */
    private static final sek f42054c = qqu.m32670a("ListOperation");

    /* renamed from: d */
    private final qrx f42055d;

    /* renamed from: e */
    private final int f42056e;

    /* renamed from: f */
    private final Bundle f42057f;

    public qsr(qrx qrx, Account account, int i, Bundle bundle) {
        super("List", account);
        sdo.m34959a(qrx);
        this.f42055d = qrx;
        this.f42056e = i;
        this.f42057f = bundle;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            this.f42055d.mo24233a(new qsf(status, bngx.m109376e()).mo24248b());
        } catch (IOException e) {
            f42054c.mo25410a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r26.f42055d.mo24233a(new p000.qsf(com.google.android.gms.common.api.Status.f30107a, p000.bngx.m109368a((java.util.Collection) p000.bnfi.m109235a(r0).mo67501a(p000.qsq.f42052a).mo67505b())).mo24248b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01fd, code lost:
        throw new p000.qrp(1025, "Internal error.", r0);
     */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        bngx bngx;
        qrj qrj;
        String str;
        bmxv bmxv;
        List<qtq> list;
        qrj qrj2;
        bmxv bmxv2;
        String str2;
        Cursor rawQuery;
        qvp qvp = (qvp) qvp.f42250b.mo13145b();
        if (qvp.mo24293a(this.f42031a, this.f42056e)) {
            acyr acyr = this.f42031a;
            int i = this.f42056e;
            String string = this.f42057f.getString("where_string", "");
            sdo.m34959a(acyr);
            synchronized (qvp.f42257i) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    qvp.mo24292a(acyr);
                    bmxv c = qvp.f42254f.mo24290c(acyr);
                    if (c.mo66813a()) {
                        try {
                            bsty bsty = (bsty) c.mo66814b();
                            qrj a = qrk.m32721a(i);
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            bmxv a2 = qvp.mo24291a(a, acyr);
                            long elapsedRealtime3 = SystemClock.elapsedRealtime();
                            qvr qvr = qvp.f42255g;
                            bmxv a3 = qtm.m32864a(i);
                            if (a3.mo66813a()) {
                                qvr.mo24296a((qtm) a3.mo66814b(), acyr, i);
                                SQLiteDatabase a4 = qvr.f42262d.f42122b.mo24263a();
                                bmxv = a2;
                                String a5 = ((qtm) a3.mo66814b()).mo24256a();
                                qrj = a;
                                str = "ms]";
                                StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 149);
                                sb.append("SELECT E.* FROM ");
                                sb.append("sync_entities");
                                sb.append(" AS E INNER JOIN ");
                                sb.append(a5);
                                sb.append(" AS E_IDX ON E.id=E_IDX.id AND E.account=E_IDX.account WHERE E_IDX.account=? AND E.is_deleted_locally=0");
                                String sb2 = sb.toString();
                                if (!bmxx.m108577a(string)) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 7 + String.valueOf(string).length());
                                    sb3.append(sb2);
                                    sb3.append(" AND (");
                                    sb3.append(string);
                                    sb3.append(")");
                                    sb2 = sb3.toString();
                                }
                                rawQuery = a4.rawQuery(sb2, new String[]{acyr.f61090d});
                                list = new ArrayList();
                                rawQuery.moveToFirst();
                                while (!rawQuery.isAfterLast()) {
                                    list.add(qtv.m32886a(rawQuery));
                                    rawQuery.moveToNext();
                                }
                                rawQuery.close();
                            } else {
                                bmxv = a2;
                                qrj = a;
                                str = "ms]";
                                list = qvr.f42261c.mo24277b(acyr, i);
                            }
                            long elapsedRealtime4 = SystemClock.elapsedRealtime();
                            ArrayList arrayList = new ArrayList(list.size());
                            int i2 = 0;
                            for (qtq qtq : list) {
                                String str3 = str;
                                long j = elapsedRealtime4;
                                bmxv bmxv3 = bmxv;
                                qrj qrj3 = qrj;
                                try {
                                    arrayList.add(qrj3.mo24227a(qtq, bmxv3));
                                    qrj2 = qrj3;
                                    bmxv2 = bmxv3;
                                    str2 = str3;
                                    elapsedRealtime4 = j;
                                } catch (qrl | qrp e) {
                                    i2++;
                                    qrj2 = qrj3;
                                    bmxv2 = bmxv3;
                                    str2 = str3;
                                    elapsedRealtime4 = j;
                                }
                            }
                            long elapsedRealtime5 = SystemClock.elapsedRealtime();
                            sek sek = qvp.f42249a;
                            sek.mo25412b("Listed " + arrayList.size() + " entries. [entry type: " + i + ", number of invalid entries: " + i2 + ", data initialization latency: " + (elapsedRealtime2 - elapsedRealtime) + "ms, cryptographer retrival latency: " + (elapsedRealtime3 - elapsedRealtime2) + "ms, database query latency: " + (elapsedRealtime4 - elapsedRealtime3) + "ms, data conversion latency: " + (elapsedRealtime5 - elapsedRealtime4) + str, new Object[0]);
                            bngx = bngx.m109368a((Collection) arrayList);
                        } catch (SQLiteException e2) {
                            throw new qrp(769, e2);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        bngx = bngx.m109376e();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } else {
            throw new qrp(1794, String.format(Locale.US, "Data of type %d is not subscribed.", Integer.valueOf(this.f42056e)));
        }
    }
}

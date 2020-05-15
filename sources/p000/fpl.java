package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;

/* renamed from: fpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpl extends AsyncTaskLoader {

    /* renamed from: a */
    private final long f17092a;

    /* renamed from: b */
    private final long f17093b;

    /* renamed from: c */
    private final int f17094c;

    /* renamed from: d */
    private bngx f17095d;

    public fpl(Context context, long j, long j2, int i) {
        super(context);
        this.f17092a = j;
        this.f17093b = j2;
        this.f17094c = i;
    }

    /* renamed from: a */
    public final void deliverResult(bngx bngx) {
        if (!isReset()) {
            this.f17095d = bngx;
            if (isStarted()) {
                super.deliverResult(bngx);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        bngx bngx = this.f17095d;
        if (bngx != null) {
            deliverResult(bngx);
        }
        if (takeContentChanged() || bngx == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            ContentResolver contentResolver = getContext().getContentResolver();
            long j = this.f17092a;
            long j2 = this.f17093b;
            int i3 = this.f17094c;
            int i4 = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                return bngx.m109376e();
            }
            Cursor query = contentResolver.query(NetworkUsageChimeraContentProvider.f30379f, null, null, new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i3)}, null);
            if (query != null) {
                try {
                    i2 = query.getCount();
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                if (i2 != 0) {
                    bngs b = bngx.m109371b(i2);
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("from_datetime_updated_androidN");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("to_datetime_updated_androidN");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("tag_androidN");
                    int columnIndexOrThrow4 = query.getColumnIndexOrThrow("uid_androidN");
                    int columnIndexOrThrow5 = query.getColumnIndexOrThrow("device_state_androidN");
                    int columnIndexOrThrow6 = query.getColumnIndexOrThrow("transport_type_androidN");
                    int columnIndexOrThrow7 = query.getColumnIndexOrThrow("rxbytes_androidN");
                    int columnIndexOrThrow8 = query.getColumnIndexOrThrow("rxpackets_androidN");
                    int columnIndexOrThrow9 = query.getColumnIndexOrThrow("txbytes_androidN");
                    int columnIndexOrThrow10 = query.getColumnIndexOrThrow("txpackets_androidN");
                    while (query.moveToNext()) {
                        smi smi = new smi(query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6));
                        smi.f44754r = query.getLong(columnIndexOrThrow7);
                        smi.f44755s = query.getLong(columnIndexOrThrow8);
                        smi.f44756t = query.getLong(columnIndexOrThrow9);
                        smi.f44757u = query.getLong(columnIndexOrThrow10);
                        smi.f44752p = query.getLong(columnIndexOrThrow);
                        smi.f44753q = query.getLong(columnIndexOrThrow2);
                        b.mo67668c(smi);
                        columnIndexOrThrow3 = columnIndexOrThrow3;
                        columnIndexOrThrow4 = columnIndexOrThrow4;
                    }
                    bngx a = b.mo67664a();
                    query.close();
                    return a;
                }
            }
            bngx e = bngx.m109376e();
            if (query == null) {
                return e;
            }
            query.close();
            return e;
        }
        Cursor query2 = getContext().getContentResolver().query(NetworkUsageChimeraContentProvider.f30378e, null, null, new String[]{String.valueOf(this.f17092a), String.valueOf(this.f17093b), String.valueOf(this.f17094c)}, null);
        if (query2 != null) {
            try {
                i2 = query2.getCount();
            } catch (Throwable th2) {
                if (query2 != null) {
                    query2.close();
                }
                throw th2;
            }
        }
        if (query2 != null) {
            if (i2 != 0) {
                bngs b2 = bngx.m109371b(i2);
                while (query2.moveToNext()) {
                    smc smc = new smc("Na", query2.getInt(2), query2.getInt(3), query2.getInt(4), query2.getInt(1));
                    smc.f44752p = query2.getLong(5);
                    smc.f44753q = query2.getLong(6);
                    smc.f44720c = query2.getLong(7);
                    smc.f44721d = query2.getLong(8);
                    smc.f44722e = query2.getLong(9);
                    smc.f44723f = query2.getLong(10);
                    smc.f44724g = query2.getLong(11);
                    smc.f44725h = query2.getLong(12);
                    smc.f44726i = query2.getLong(13);
                    smc.f44727j = query2.getLong(14);
                    b2.mo67668c(smc);
                }
                bngx a2 = b2.mo67664a();
                query2.close();
                return a2;
            }
        }
        bngx e2 = bngx.m109376e();
        if (query2 == null) {
            return e2;
        }
        query2.close();
        return e2;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.f17095d = null;
    }
}

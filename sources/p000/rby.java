package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: rby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rby extends aaab {

    /* renamed from: a */
    private final rbg f42603a;

    /* renamed from: b */
    private final String f42604b;

    /* renamed from: c */
    private final rdq f42605c;

    /* renamed from: d */
    private final String f42606d;

    public rby(rbg rbg, String str, rdq rdq, String str2) {
        super(40, "GetLogEventParcelablesOperation");
        this.f42603a = rbg;
        this.f42604b = str;
        this.f42605c = rdq;
        this.f42606d = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (ClearcutLoggerChimeraService.m22443a(this.f42606d)) {
            ArrayList arrayList = new ArrayList();
            bnre i = this.f42605c.mo24519b().listIterator();
            while (i.hasNext()) {
                try {
                    arrayList.addAll(((rdp) i.next()).mo24495c(this.f42604b));
                } catch (SQLiteException | IOException e) {
                    String valueOf = String.valueOf(this.f42604b);
                    Log.e("GetLogEventParcelablesOperation", valueOf.length() == 0 ? new String("Unable to query log events for log source ") : "Unable to query log events for log source ".concat(valueOf), e);
                    String valueOf2 = String.valueOf(this.f42604b);
                    throw new aaaj(31005, valueOf2.length() == 0 ? new String("Unable to query log events for log source ") : "Unable to query log events for log source ".concat(valueOf2));
                }
            }
            rtu d = rts.m34440d();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rts.m34439a(d, (LogEventParcelable) arrayList.get(i2));
            }
            DataHolder a = d.mo25163a(0);
            try {
                this.f42603a.mo24344a(a);
                a.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new aaaj(31001, "Debug operation disallowed");
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        DataHolder b = DataHolder.m22539b(status.f30115i);
        try {
            this.f42603a.mo24344a(b);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}

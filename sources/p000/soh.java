package p000;

import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.common.threads.TraceWrappingParcelable;

/* renamed from: soh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class soh implements adzs {

    /* renamed from: a */
    static volatile long f44859a = 0;

    /* renamed from: b */
    public final bmxv f44860b;

    public soh(bmxv bmxv) {
        this.f44860b = bmxv;
    }

    /* renamed from: a */
    static Object m35750a(long j) {
        long j2 = j - snd.f44791a.f44792b;
        if (j2 > f44859a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            f44859a = uptimeMillis;
            if (j2 > uptimeMillis) {
                return snc.m35691a("handler");
            }
        }
        return snc.m35689a();
    }

    /* renamed from: a */
    public final void mo25884a(Message message, long j) {
        TraceWrappingParcelable traceWrappingParcelable;
        blkh.m107294b("TracingHandlerProp");
        Object a = m35750a(j);
        if (message.obj != null) {
            bmxv bmxv = this.f44860b;
            Bundle peekData = message.peekData();
            if (bmxv.mo66813a()) {
                sof sof = (sof) bmxv.mo66814b();
                if (sof.f44856c > 0 && sof.f44854a.compareAndSet(false, true)) {
                    try {
                        int i = sof.f44856c;
                        if (i > 0) {
                            TraceWrappingParcelable[] traceWrappingParcelableArr = sof.f44855b;
                            int i2 = i - 1;
                            sof.f44856c = i2;
                            traceWrappingParcelable = traceWrappingParcelableArr[i2];
                            traceWrappingParcelableArr[i2] = null;
                        } else {
                            sof.f44854a.lazySet(false);
                        }
                    } finally {
                        sof.f44854a.lazySet(false);
                    }
                }
                traceWrappingParcelable = new TraceWrappingParcelable();
            } else {
                traceWrappingParcelable = new TraceWrappingParcelable();
            }
            traceWrappingParcelable.f30390b = a;
            traceWrappingParcelable.f30391c = peekData;
            message.setData(traceWrappingParcelable.f30389a);
            return;
        }
        message.obj = a;
    }

    /* renamed from: a */
    public final void mo25885a(Object obj) {
        if (obj == Boolean.TRUE) {
            blkh.m107287a((bliy) null, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
    }
}

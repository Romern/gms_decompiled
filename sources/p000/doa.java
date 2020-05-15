package p000;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: doa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class doa extends FilterInputStream {

    /* renamed from: a */
    final /* synthetic */ dob f13666a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public doa(dob dob, InputStream inputStream) {
        super(inputStream);
        this.f13666a = dob;
    }

    public final void close() {
        try {
            super.close();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dob dob = this.f13666a;
            int i = dob.f13667g;
            long j = dob.f13673f;
            long uidTxBytes = TrafficStats.getUidTxBytes(dob.f13669b);
            long uidRxBytes = TrafficStats.getUidRxBytes(this.f13666a.f13669b);
            dob dob2 = this.f13666a;
            EventLog.writeEvent(52001, dob2.f13668a, Long.valueOf(dob2.f13672e), Long.valueOf(elapsedRealtime - j), Long.valueOf(uidTxBytes - this.f13666a.f13670c), Long.valueOf(uidRxBytes - this.f13666a.f13671d));
        } catch (Throwable th) {
            Throwable th2 = th;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            dob dob3 = this.f13666a;
            int i2 = dob.f13667g;
            long j2 = dob3.f13673f;
            long uidTxBytes2 = TrafficStats.getUidTxBytes(dob3.f13669b);
            long uidRxBytes2 = TrafficStats.getUidRxBytes(this.f13666a.f13669b);
            dob dob4 = this.f13666a;
            EventLog.writeEvent(52001, dob4.f13668a, Long.valueOf(dob4.f13672e), Long.valueOf(elapsedRealtime2 - j2), Long.valueOf(uidTxBytes2 - this.f13666a.f13670c), Long.valueOf(uidRxBytes2 - this.f13666a.f13671d));
            throw th2;
        }
    }
}

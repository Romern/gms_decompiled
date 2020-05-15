package p000;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: buql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buql extends adzt {

    /* renamed from: a */
    final /* synthetic */ buqm f154710a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buql(buqm buqm, Looper looper) {
        super(looper);
        this.f154710a = buqm;
    }

    /* renamed from: a */
    private final void m120244a(long j, long j2, buqn buqn, String str) {
        buqm buqm = this.f154710a;
        long j3 = buqm.f154711a;
        if (((bnsl) buqm.f154714d.mo68388c()).mo68447l()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            if (elapsedRealtime > j) {
                ((bnsl) this.f154710a.f154714d.mo68388c()).mo68425a("%s %s %s", buqn, str, new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(elapsedRealtime)));
            }
        }
    }

    public final void handleMessage(Message message) {
        buqn buqn = (buqn) message.obj;
        buqm buqm = this.f154710a;
        long j = buqm.f154711a;
        if (!buqm.f154715e) {
            srn srn = this.f154710a.f154714d;
            m120244a(buqm.f154712b, (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L), buqn, "was delayed for");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                buqn.run();
                m120244a(buqm.f154711a, elapsedRealtime, buqn, "ran for");
            } catch (Exception e) {
                bnsl bnsl = (bnsl) this.f154710a.f154714d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("%s crashed.", buqn);
                throw e;
            } catch (Throwable th) {
                m120244a(buqm.f154711a, elapsedRealtime, buqn, "ran for");
                throw th;
            }
        } else {
            ((bnsl) this.f154710a.f154714d.mo68388c()).mo68420a("Runnable %s attempted to run after the EventLoop was destroyed. Ignoring.", buqn);
        }
    }

    /* renamed from: a */
    public final boolean mo72993a(buqn buqn, long j, boolean z) {
        buqm buqm = this.f154710a;
        long j2 = buqm.f154711a;
        if (buqm.f154715e) {
            ((bnsl) this.f154710a.f154714d.mo68388c()).mo68420a("%s not posted since EventLoop is destroyed", buqn);
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        Message obtainMessage = obtainMessage(0, (int) (elapsedRealtime >> 32), (int) elapsedRealtime, buqn);
        boolean sendMessageAtFrontOfQueue = z ? sendMessageAtFrontOfQueue(obtainMessage) : sendMessageDelayed(obtainMessage, j);
        if (!sendMessageAtFrontOfQueue) {
            ((bnsl) this.f154710a.f154714d.mo68388c()).mo68420a("%s not posted since looper is exiting", buqn);
        }
        return sendMessageAtFrontOfQueue;
    }
}

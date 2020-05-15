package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: addo */
final /* synthetic */ class addo implements Handler.Callback {

    /* renamed from: a */
    private final adds f61442a;

    public addo(adds adds) {
        this.f61442a = adds;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r2.mo33368a(new p000.addv(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r5 = r5.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r5 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r2.f61456b.mo50391a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    public final boolean handleMessage(Message message) {
        adds adds = this.f61442a;
        int i = message.arg1;
        synchronized (adds) {
            addu addu = (addu) adds.f61451e.get(i);
            if (addu == null) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Received response for unknown request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                return true;
            }
            adds.f61451e.remove(i);
            adds.mo33364b();
        }
    }
}

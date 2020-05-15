package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: ahxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxe implements ahxh {

    /* renamed from: a */
    private buru f68282a;

    /* renamed from: b */
    private final Map f68283b = new HashMap();

    /* renamed from: a */
    public final void mo37254a(Context context, BluetoothDevice bluetoothDevice) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r8 = r2.f68445c;
        r1 = p000.bxus.m123744c();
        r2 = p000.aiaa.f68501K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r8.mo73764h();
        r2 = (p000.bxvk) r2.mo74142c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3 = p000.bxxm.f165037a.mo74228a(r2);
        r3.mo74220a(r2, p000.bxud.m123454a(r8), r1);
        r3.mo74225d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8.mo73787a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p000.bxvk.m124027b(r2);
        r8 = p000.ahvd.m56709a((p000.aiaa) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (p000.ahvd.m56713a(r8, r6) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r5.f68283b.put(r7, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r5.f68283b.put(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        if ((r7.getCause() instanceof p000.bxwf) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        throw ((p000.bxwf) r7.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if ((r7.getCause() instanceof p000.bxwf) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        throw new p000.bxwf(r7.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        throw ((p000.bxwf) r7.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        java.lang.Thread.currentThread().interrupt();
        r8 = (p000.bnsl) p000.ahsd.f67925a.mo68390d();
        r8.mo68437a(r7);
        r8.mo68405a("FastPair: event stream fail to read device from footprint");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        r8 = (p000.bnsl) p000.ahsd.f67925a.mo68390d();
        r8.mo68437a(r7);
        r8.mo68405a("FastPair: event stream fail to read device from footprint");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:9:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:9:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo37255a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (i == 1) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: The log buffer of bluetooth device is full: %s", bluetoothDevice);
            if (this.f68282a == null) {
                this.f68282a = (buru) ahgz.m55754a(context, buru.class);
            }
            String str = null;
            if (this.f68283b.containsKey(bluetoothDevice)) {
                str = (String) this.f68283b.get(bluetoothDevice);
            } else {
                try {
                    ahyz a = ((ahst) ahgz.m55754a(context, ahst.class)).mo37033a(bluetoothDevice.getAddress());
                    if (a != null) {
                        Iterator it = ((List) this.f68282a.mo73054a().get()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ahza ahza = (ahza) it.next();
                            if (ahza.f68444b.equals(a.f68429c)) {
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (ExecutionException e) {
                } catch (bxwf e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                }
            }
            if (str == null && ahvd.m56713a(str, context)) {
                Intent intent = new Intent("com.google.android.gms.nearby.fastpair.ACTION_LOG_BUFFER_FULL");
                intent.setPackage(str);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: send the log buffer full event stream broadcast to %s", str);
                context.getApplicationContext().sendBroadcast(intent);
            }
        }
    }
}

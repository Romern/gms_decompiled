package p000;

import android.os.SystemClock;
import java.nio.ByteBuffer;

/* renamed from: avxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxr implements Runnable {

    /* renamed from: a */
    public avxv f94061a;

    /* renamed from: b */
    public final long f94062b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    public final Object f94063c = new Object();

    /* renamed from: d */
    public long f94064d;

    /* renamed from: e */
    public int f94065e = 0;

    /* renamed from: f */
    public ByteBuffer f94066f;

    /* renamed from: g */
    final /* synthetic */ avxt f94067g;

    /* renamed from: h */
    private boolean f94068h = true;

    public avxr(avxt avxt, avxv avxv) {
        this.f94067g = avxt;
        this.f94061a = avxv;
    }

    /* renamed from: a */
    public final void mo51705a(boolean z) {
        synchronized (this.f94063c) {
            this.f94068h = z;
            this.f94063c.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r14.f94061a;
        r3 = new p000.avxx(r1.f94095a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if ((r3.f94093e % 2) != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r4 = r3.f94089a;
        r3.f94089a = r3.f94090b;
        r3.f94090b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r3.f94093e = 0;
        r1 = r0.mo51710a(r1);
        r0.mo51712b();
        r3 = new p000.avxu(r1);
        r1 = r0.f94086a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = r0.f94087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r0 == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r5 = r3.f94085a;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r6 >= r5.size()) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r7 = r5.keyAt(r6);
        r8 = r5.valueAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0.f94101a.get(r7) != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r9 = new p000.avyb();
        r10 = r0.f94102b;
        r8 = android.net.Uri.parse(((com.google.android.gms.vision.barcode.Barcode) r8).f109609c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r8.getScheme().equals("https") == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        if (r8.getHost().equals("g.co") == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r8.getScheme().equals("google.magicwand") == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        r11 = new android.content.Intent();
        r11.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.magicwand.MagicWandActivity");
        r11.setData(r8);
        r10.f21074a.startActivity(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        r9.f94099a = new p000.avyd();
        r0.f94101a.append(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r5 = r3.f94085a;
        r6 = new java.util.HashSet();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        if (r7 >= r0.f94101a.size()) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        r8 = r0.f94101a.keyAt(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        if (r5.get(r8) != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0105, code lost:
        r9 = (p000.avyb) r0.f94101a.valueAt(r7);
        r10 = r9.f94100b + 1;
        r9.f94100b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r10 < 3) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        r9 = r9.f94099a;
        r6.add(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        r8 = r9.f94099a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0125, code lost:
        r5 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        if (r5.hasNext() == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012f, code lost:
        r0.f94101a.delete(((java.lang.Integer) r5.next()).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        r3 = r3.f94085a;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0146, code lost:
        if (r5 >= r3.size()) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        r6 = r3.keyAt(r5);
        r3.valueAt(r5);
        r6 = (p000.avyb) r0.f94101a.get(r6);
        r6.f94100b = 0;
        r6 = r6.f94099a;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        r14.f94067g.f94073c.addCallbackBuffer(r2.array());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        throw new java.lang.IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0179, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018e, code lost:
        r14.f94067g.f94073c.addCallbackBuffer(r2.array());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0199, code lost:
        throw r0;
     */
    public final void run() {
        while (true) {
            synchronized (this.f94063c) {
                while (this.f94068h) {
                    if (this.f94066f != null) {
                        avxw avxw = new avxw();
                        ByteBuffer byteBuffer = this.f94066f;
                        rzj rzj = this.f94067g.f94076f;
                        int i = rzj.f43894a;
                        int i2 = rzj.f43895b;
                        if (byteBuffer == null) {
                            throw new IllegalArgumentException("Null image data supplied.");
                        } else if (byteBuffer.capacity() >= i * i2) {
                            avxy avxy = avxw.f94088a;
                            avxy.f94096b = byteBuffer;
                            avxx avxx = avxy.f94095a;
                            avxx.f94089a = i;
                            avxx.f94090b = i2;
                            avxx.f94094f = 17;
                            avxx.f94091c = this.f94065e;
                            avxx.f94092d = this.f94064d;
                            avxw.mo51714a(this.f94067g.f94075e);
                            avxy a = avxw.mo51713a();
                            ByteBuffer byteBuffer2 = this.f94066f;
                            this.f94066f = null;
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        try {
                            this.f94063c.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                }
                return;
            }
        }
    }
}

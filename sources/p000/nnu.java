package p000;

/* renamed from: nnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bpdn f36116a;

    /* renamed from: b */
    final /* synthetic */ bpdo f36117b;

    /* renamed from: c */
    final /* synthetic */ String f36118c;

    /* renamed from: d */
    final /* synthetic */ noj f36119d;

    public nnu(noj noj, bpdn bpdn, bpdo bpdo, String str) {
        this.f36119d = noj;
        this.f36116a = bpdn;
        this.f36117b = bpdo;
        this.f36118c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0.getAccessoryList().length <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r4.f36119d.mo21273a(r4.f36116a, r4.f36117b, r4.f36118c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = (android.hardware.usb.UsbManager) r4.f36119d.f36219f.getSystemService("usb");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0.getAccessoryList() == null) goto L_?;
     */
    public final void run() {
        synchronized (this.f36119d.f36226m) {
            if (!this.f36119d.f36226m.get(15, false)) {
                return;
            }
            if (this.f36119d.f36226m.get(3, false)) {
            }
        }
    }
}

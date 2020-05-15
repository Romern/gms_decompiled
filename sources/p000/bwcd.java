package p000;

/* renamed from: bwcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bwcd {

    /* renamed from: a */
    public final Object f158807a = new Object();

    /* renamed from: b */
    public final byte[] f158808b;

    /* renamed from: c */
    public int f158809c = -1;

    /* renamed from: d */
    public int f158810d;

    /* renamed from: e */
    public boolean f158811e;

    public bwcd(int i) {
        if (i > 0) {
            this.f158808b = new byte[i];
            return;
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("bufferSize ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo73452a() {
        synchronized (this.f158807a) {
            this.f158811e = true;
            this.f158807a.notifyAll();
        }
    }
}

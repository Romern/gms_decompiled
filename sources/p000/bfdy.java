package p000;

/* renamed from: bfdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfeb f113539a;

    /* renamed from: b */
    private final bffc f113540b;

    public bfdy(bfeb bfeb, bffc bffc) {
        this.f113539a = bfeb;
        this.f113540b = bffc;
    }

    public final void run() {
        synchronized (this.f113539a.f113550c) {
            if (this.f113539a.f113552e.contains(this.f113540b)) {
                String valueOf = String.valueOf(this.f113540b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("DataReader ");
                sb.append(valueOf);
                sb.append(" started by postDelayedIfNotQuitted.");
                sb.toString();
                this.f113539a.f113552e.remove(this.f113540b);
                this.f113540b.run();
            }
        }
    }
}

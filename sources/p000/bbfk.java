package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfk implements behk {

    /* renamed from: a */
    public final AtomicLong f102540a = new AtomicLong();

    /* renamed from: b */
    final /* synthetic */ bbfl f102541b;

    /* renamed from: c */
    public final bbke f102542c;

    /* renamed from: d */
    private final String f102543d;

    public bbfk(bbfl bbfl, String str, bbke bbke) {
        this.f102541b = bbfl;
        this.f102543d = str;
        this.f102542c = bbke;
    }

    /* renamed from: a */
    public final void mo56094a() {
        synchronized (bbfl.class) {
            if (this.f102541b.f102547d.containsKey(this.f102543d)) {
                this.f102541b.f102545b.execute(new bbfj(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo56095a(int i) {
        this.f102540a.getAndAdd((long) i);
        Object[] objArr = {"DownloadProgressMonitor", this.f102543d, Integer.valueOf(i), Long.valueOf(this.f102540a.get())};
    }
}

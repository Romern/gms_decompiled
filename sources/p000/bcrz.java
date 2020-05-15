package p000;

/* renamed from: bcrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrz extends bcob {

    /* renamed from: b */
    private volatile transient boolean f104768b;

    /* renamed from: c */
    private volatile transient boolean f104769c;

    public bcrz(bngx bngx) {
        super(bngx);
    }

    /* renamed from: b */
    public final boolean mo57401b() {
        boolean z;
        if (!this.f104769c) {
            synchronized (this) {
                if (!this.f104769c) {
                    bnre i = this.f104602a.listIterator();
                    while (true) {
                        if (i.hasNext()) {
                            if (((bcub) i.next()).mo57406e()) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    this.f104768b = z;
                    this.f104769c = true;
                }
            }
        }
        return this.f104768b;
    }
}

package p000;

/* renamed from: bcsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcsc extends bcod {

    /* renamed from: b */
    private volatile transient boolean f104773b;

    /* renamed from: c */
    private volatile transient boolean f104774c;

    public bcsc(int i, int i2, bngx bngx) {
        super(i, i2, bngx);
    }

    /* renamed from: d */
    public final boolean mo57407d() {
        boolean z;
        if (!this.f104774c) {
            synchronized (this) {
                if (!this.f104774c) {
                    bnre i = this.f104607a.listIterator();
                    while (true) {
                        if (i.hasNext()) {
                            if (((bcuj) i.next()).mo57226b().equals(bcul.UNKNOWN)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    this.f104773b = z;
                    this.f104774c = true;
                }
            }
        }
        return this.f104773b;
    }
}

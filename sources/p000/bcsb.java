package p000;

/* renamed from: bcsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcsb extends bcoc {

    /* renamed from: d */
    private volatile transient boolean f104771d;

    /* renamed from: e */
    private volatile transient boolean f104772e;

    public bcsb(String str, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        super(str, bmxv, bmxv2, bmxv3);
    }

    /* renamed from: e */
    public final boolean mo57406e() {
        if (!this.f104772e) {
            synchronized (this) {
                if (!this.f104772e) {
                    boolean z = false;
                    if (this.f104603a.mo66813a()) {
                        if (!((bcui) this.f104603a.mo66814b()).equals(bcui.UNKNOWN)) {
                        }
                        z = true;
                        this.f104771d = z;
                        this.f104772e = true;
                    }
                    if (this.f104604b.mo66813a()) {
                        bnre i = ((bngx) this.f104604b.mo66814b()).listIterator();
                        while (true) {
                            if (i.hasNext()) {
                                if (((bcue) i.next()).mo57214a().equals(bcug.UNKNOWN)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.f104605c.mo66813a()) {
                        bnre i2 = ((bngx) this.f104605c.mo66814b()).listIterator();
                        while (true) {
                            if (i2.hasNext()) {
                                if (((bcud) i2.next()).mo57407d()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    this.f104771d = z;
                    this.f104772e = true;
                }
            }
        }
        return this.f104771d;
    }
}

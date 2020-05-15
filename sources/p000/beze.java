package p000;

import java.util.NoSuchElementException;

/* renamed from: beze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beze {

    /* renamed from: a */
    final /* synthetic */ bezf f113117a;

    /* renamed from: b */
    private int f113118b;

    /* renamed from: c */
    private int f113119c;

    /* renamed from: d */
    private int f113120d;

    public beze(bezf bezf) {
        this.f113117a = bezf;
        this.f113118b = bezf.mo61268a();
        this.f113119c = bezf.mo61270c() - 1;
        this.f113120d = bezf.mo61271d();
        m96116c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        r7.f113118b++;
        r7.f113119c = r7.f113117a.mo61270c();
        r7.f113120d = r7.f113117a.mo61271d();
     */
    /* renamed from: c */
    private final void m96116c() {
        this.f113119c++;
        while (this.f113118b <= this.f113117a.mo61269b()) {
            while (true) {
                int i = this.f113119c;
                if (i > this.f113120d) {
                    break;
                }
                bezf bezf = this.f113117a;
                int i2 = i - bezf.f113123c;
                int i3 = this.f113118b;
                int i4 = i3 - bezf.f113122b;
                if (bezf.f113121a.mo61287b(i, i3)) {
                    bezf bezf2 = this.f113117a;
                    double d = bezf2.f113124d;
                    if (((double) ((i2 * i2) + (i4 * i4))) <= d * d) {
                        bezi bezi = bezf2.f113121a;
                        bznr a = bezi.mo61274a(bezi.mo61283a(this.f113119c, this.f113118b));
                        if (a == bznr.CLUTTER_OPEN || a == bznr.CLUTTER_TREE) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                this.f113119c++;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo61266a() {
        return this.f113118b <= this.f113117a.mo61269b();
    }

    /* renamed from: b */
    public final int mo61267b() {
        if (mo61266a()) {
            int a = this.f113117a.f113121a.mo61283a(this.f113119c, this.f113118b);
            m96116c();
            return a;
        }
        throw new NoSuchElementException();
    }
}

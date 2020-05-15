package p000;

import java.util.NoSuchElementException;

/* renamed from: bxxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxq extends bxtn {

    /* renamed from: a */
    final bxxs f165047a = new bxxs(this.f165049c);

    /* renamed from: b */
    bxtr f165048b = m124303b();

    /* renamed from: c */
    final /* synthetic */ bxxu f165049c;

    public bxxq(bxxu bxxu) {
        this.f165049c = bxxu;
    }

    /* renamed from: b */
    private final bxtr m124303b() {
        if (this.f165047a.hasNext()) {
            return this.f165047a.next().iterator();
        }
        return null;
    }

    /* renamed from: a */
    public final byte mo73738a() {
        bxtr bxtr = this.f165048b;
        if (bxtr != null) {
            byte a = bxtr.mo73738a();
            if (!this.f165048b.hasNext()) {
                this.f165048b = m124303b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f165048b != null;
    }
}

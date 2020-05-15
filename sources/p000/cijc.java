package p000;

import java.util.NoSuchElementException;

/* renamed from: cijc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijc extends cijb {

    /* renamed from: a */
    int f190425a = this.f190427c;

    /* renamed from: b */
    int f190426b = -1;

    /* renamed from: c */
    final /* synthetic */ int f190427c;

    /* renamed from: d */
    final /* synthetic */ cijd f190428d;

    public cijc(cijd cijd, int i) {
        this.f190428d = cijd;
        this.f190427c = i;
    }

    /* renamed from: a */
    public final long mo86151a() {
        if (hasNext()) {
            cijd cijd = this.f190428d;
            cijj cijj = cijd.f190429a;
            int i = cijd.f190430b;
            int i2 = this.f190425a;
            this.f190425a = i2 + 1;
            this.f190426b = i2;
            return cijj.mo86163a(i + i2);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final long mo86154b() {
        if (hasPrevious()) {
            cijd cijd = this.f190428d;
            cijj cijj = cijd.f190429a;
            int i = cijd.f190430b;
            int i2 = this.f190425a - 1;
            this.f190425a = i2;
            this.f190426b = i2;
            return cijj.mo86163a(i + i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f190425a < this.f190428d.size();
    }

    public final boolean hasPrevious() {
        return this.f190425a > 0;
    }

    public final int nextIndex() {
        return this.f190425a;
    }

    public final int previousIndex() {
        return this.f190425a - 1;
    }

    public final void remove() {
        int i = this.f190426b;
        if (i != -1) {
            this.f190428d.mo86168b(i);
            int i2 = this.f190426b;
            int i3 = this.f190425a;
            if (i2 < i3) {
                this.f190425a = i3 - 1;
            }
            this.f190426b = -1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo86152a(long j) {
        int i = this.f190426b;
        if (i != -1) {
            this.f190428d.mo86169b(i, j);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final void mo86155b(long j) {
        if (this.f190426b != -1) {
            cijd cijd = this.f190428d;
            int i = this.f190425a;
            this.f190425a = i + 1;
            cijd.mo86165a(i, j);
            this.f190426b = -1;
            return;
        }
        throw new IllegalStateException();
    }
}

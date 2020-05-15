package p000;

import java.util.NoSuchElementException;

/* renamed from: cijf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijf extends cijb {

    /* renamed from: a */
    int f190432a = this.f190434c;

    /* renamed from: b */
    int f190433b = -1;

    /* renamed from: c */
    final /* synthetic */ int f190434c;

    /* renamed from: d */
    final /* synthetic */ cijg f190435d;

    public cijf(cijg cijg, int i) {
        this.f190435d = cijg;
        this.f190434c = i;
    }

    /* renamed from: a */
    public final long mo86151a() {
        if (hasNext()) {
            long[] jArr = this.f190435d.f190436a;
            int i = this.f190432a;
            this.f190432a = i + 1;
            this.f190433b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final long mo86154b() {
        if (hasPrevious()) {
            long[] jArr = this.f190435d.f190436a;
            int i = this.f190432a - 1;
            this.f190432a = i;
            this.f190433b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f190432a < this.f190435d.f190437b;
    }

    public final boolean hasPrevious() {
        return this.f190432a > 0;
    }

    public final int nextIndex() {
        return this.f190432a;
    }

    public final int previousIndex() {
        return this.f190432a - 1;
    }

    public final void remove() {
        int i = this.f190433b;
        if (i != -1) {
            this.f190435d.mo86168b(i);
            int i2 = this.f190433b;
            int i3 = this.f190432a;
            if (i2 < i3) {
                this.f190432a = i3 - 1;
            }
            this.f190433b = -1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo86152a(long j) {
        int i = this.f190433b;
        if (i != -1) {
            this.f190435d.mo86169b(i, j);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final void mo86155b(long j) {
        cijg cijg = this.f190435d;
        int i = this.f190432a;
        this.f190432a = i + 1;
        cijg.mo86165a(i, j);
        this.f190433b = -1;
    }
}

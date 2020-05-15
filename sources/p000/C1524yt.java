package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1524yt {

    /* renamed from: a */
    public final C1523ys f27682a = new C1523ys();

    /* renamed from: b */
    public final List f27683b = new ArrayList();

    /* renamed from: c */
    public final abf f27684c;

    public C1524yt(abf abf) {
        this.f27684c = abf;
    }

    /* renamed from: e */
    private final int m20892e(int i) {
        if (i >= 0) {
            int a = this.f27684c.mo146a();
            int i2 = i;
            while (i2 < a) {
                int e = i - (i2 - this.f27682a.mo16579e(i2));
                if (e != 0) {
                    i2 += e;
                } else {
                    while (this.f27682a.mo16577c(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo16581a() {
        return this.f27684c.mo146a() - this.f27683b.size();
    }

    /* renamed from: b */
    public final int mo16586b() {
        return this.f27684c.mo146a();
    }

    /* renamed from: c */
    public final View mo16589c(int i) {
        return this.f27684c.mo149b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo16591d(int i) {
        acm childViewHolderInt;
        int e = m20892e(i);
        this.f27682a.mo16578d(e);
        abf abf = this.f27684c;
        View b = abf.mo149b(e);
        if (!(b == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(b)) == null)) {
            if (!childViewHolderInt.mo334o() || childViewHolderInt.mo320aO()) {
                childViewHolderInt.mo321b(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + abf.f100a.exceptionLabel());
            }
        }
        abf.f100a.detachViewFromParent(e);
    }

    public final String toString() {
        return this.f27682a.toString() + ", hidden list:" + this.f27683b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16582a(int i) {
        int e = m20892e(i);
        View b = this.f27684c.mo149b(e);
        if (b != null) {
            if (this.f27682a.mo16578d(e)) {
                mo16592d(b);
            }
            this.f27684c.mo148a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo16587b(View view) {
        int a = this.f27684c.mo147a(view);
        if (a == -1 || this.f27682a.mo16577c(a)) {
            return -1;
        }
        return a - this.f27682a.mo16579e(a);
    }

    /* renamed from: c */
    public final boolean mo16590c(View view) {
        return this.f27683b.contains(view);
    }

    /* renamed from: a */
    public final void mo16583a(View view) {
        this.f27683b.add(view);
        abf abf = this.f27684c;
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = abf.f100a;
            int i = childViewHolderInt.f216p;
            if (i == -1) {
                childViewHolderInt.f215o = C1280ps.m19917f(childViewHolderInt.f201a);
            } else {
                childViewHolderInt.f215o = i;
            }
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    /* renamed from: b */
    public final View mo16588b(int i) {
        return this.f27684c.mo149b(m20892e(i));
    }

    /* renamed from: d */
    public final void mo16592d(View view) {
        if (this.f27683b.remove(view)) {
            this.f27684c.mo150b(view);
        }
    }

    /* renamed from: a */
    public final void mo16584a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f27684c.mo146a();
        } else {
            i2 = m20892e(i);
        }
        this.f27682a.mo16575a(i2, z);
        if (z) {
            mo16583a(view);
        }
        abf abf = this.f27684c;
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo334o() || childViewHolderInt.mo320aO()) {
                childViewHolderInt.mo329j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + abf.f100a.exceptionLabel());
            }
        }
        abf.f100a.attachViewToParent(view, i2, layoutParams);
    }

    /* renamed from: a */
    public final void mo16585a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f27684c.mo146a();
        } else {
            i2 = m20892e(0);
        }
        this.f27682a.mo16575a(i2, z);
        if (z) {
            mo16583a(view);
        }
        abf abf = this.f27684c;
        abf.f100a.addView(view, i2);
        abf.f100a.dispatchChildAttached(view);
    }
}

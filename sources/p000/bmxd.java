package p000;

import java.io.Serializable;

/* renamed from: bmxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxd extends bmxe implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bmxe f131165a;

    public bmxd(bmxe bmxe) {
        this.f131165a = bmxe;
    }

    /* renamed from: a */
    public final bmxe mo66854a() {
        return this.f131165a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo12637b(Object obj) {
        throw new AssertionError();
    }

    /* renamed from: c */
    public final Object mo66855c(Object obj) {
        return this.f131165a.mo66856d(obj);
    }

    /* renamed from: d */
    public final Object mo66856d(Object obj) {
        return this.f131165a.mo66855c(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmxd) {
            return this.f131165a.equals(((bmxd) obj).f131165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131165a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131165a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12636a(Object obj) {
        throw new AssertionError();
    }
}

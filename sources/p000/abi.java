package p000;

import android.database.Observable;

/* renamed from: abi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abi extends Observable {
    /* renamed from: a */
    public final void mo181a(int i, int i2) {
        mo182a(i, i2, null);
    }

    /* renamed from: b */
    public final void mo184b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((abj) this.mObservers.get(size)).mo188a();
        }
    }

    /* renamed from: c */
    public final void mo186c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((abj) this.mObservers.get(size)).mo192c(i, i2);
        }
    }

    /* renamed from: d */
    public final void mo187d(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((abj) this.mObservers.get(size)).mo193d(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo182a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((abj) this.mObservers.get(size)).mo190a(i, i2, obj);
        }
    }

    /* renamed from: b */
    public final void mo185b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((abj) this.mObservers.get(size)).mo191b(i, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo183a() {
        return !this.mObservers.isEmpty();
    }
}

package p000;

import java.util.Observable;

/* renamed from: aasi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasi extends Observable {
    /* renamed from: a */
    public final synchronized void mo31709a() {
        mo31710b();
        super.deleteObservers();
    }

    /* renamed from: b */
    public final synchronized void mo31710b() {
        super.setChanged();
        super.notifyObservers();
    }
}

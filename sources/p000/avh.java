package p000;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: avh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avh {

    /* renamed from: a */
    public final DataSetObservable f2376a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f2377b;

    /* renamed from: a */
    public abstract int mo2709a();

    /* renamed from: a */
    public int mo2710a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public Object mo2711a(ViewGroup viewGroup, int i) {
        throw null;
    }

    /* renamed from: a */
    public void mo2713a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo2714a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo2715a(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    /* renamed from: a */
    public abstract boolean mo2716a(View view, Object obj);

    /* renamed from: b */
    public Parcelable mo2717b() {
        return null;
    }

    /* renamed from: b */
    public void mo2718b(Object obj) {
    }

    /* renamed from: c */
    public CharSequence mo2719c(int i) {
        return null;
    }

    /* renamed from: d */
    public void mo2721d() {
    }

    /* renamed from: c */
    public void mo2720c() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f2377b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f2376a.notifyChanged();
    }

    /* renamed from: a */
    public final void mo2712a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2377b = dataSetObserver;
        }
    }
}

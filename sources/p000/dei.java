package p000;

import com.google.android.chimera.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: dei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dei implements C1047hg {

    /* renamed from: b */
    private static final WeakHashMap f12974b = new WeakHashMap();

    /* renamed from: a */
    final FragmentManager.OnBackStackChangedListener f12975a;

    public dei(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        this.f12975a = onBackStackChangedListener;
    }

    /* renamed from: a */
    public static dei m8250a(FragmentManager.OnBackStackChangedListener onBackStackChangedListener, boolean z) {
        dei dei;
        WeakReference weakReference = (WeakReference) f12974b.get(onBackStackChangedListener);
        if (weakReference != null) {
            dei = (dei) weakReference.get();
            if (dei == null) {
                f12974b.remove(weakReference);
            }
        } else {
            dei = null;
        }
        if (dei != null || !z) {
            return dei;
        }
        dei dei2 = new dei(onBackStackChangedListener);
        f12974b.put(onBackStackChangedListener, new WeakReference(dei2));
        return dei2;
    }

    /* renamed from: a */
    public final void mo8595a() {
        this.f12975a.onBackStackChanged();
    }
}

package p000;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bkbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkbr extends bkef implements bkiq, bkbl {

    /* renamed from: Dv */
    private bjxv f123959Dv;

    /* renamed from: Dw */
    private final SparseArray f123960Dw = new SparseArray();

    /* renamed from: aF */
    public int f123961aF;

    /* renamed from: aG */
    public ContextThemeWrapper f123962aG;

    /* renamed from: aH */
    public LayoutInflater f123963aH;

    /* renamed from: aI */
    public LogContext f123964aI;

    /* renamed from: a */
    protected static Bundle m105273a(int i, LogContext logContext) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        bundle.putParcelable("parentLogContext", logContext);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo52843a(Bundle bundle, View view) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public final bjxv mo65818aq() {
        if (this.f123959Dv == null) {
            this.f123959Dv = bjxv.m104861c();
        }
        return this.f123959Dv;
    }

    /* renamed from: ar */
    public final Object mo65819ar() {
        Fragment parentFragment = getParentFragment();
        return parentFragment == null ? getActivity() : parentFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52828b(Bundle bundle) {
    }

    /* renamed from: bU */
    public bkip mo52776bU() {
        return null;
    }

    /* renamed from: cm */
    public final bwgw mo51877cm() {
        Activity activity = getActivity();
        if (activity instanceof bkbl) {
            return ((bkbl) activity).mo51877cm();
        }
        for (Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof bkbl) {
                return ((bkbl) parentFragment).mo51877cm();
            }
        }
        return null;
    }

    /* renamed from: k */
    public final bjxv mo65820k(int i) {
        bjxv bjxv = (bjxv) this.f123960Dw.get(i);
        if (bjxv != null) {
            return bjxv;
        }
        bjxv d = bjxv.m104862d();
        this.f123960Dw.put(i, d);
        return d;
    }

    public void onAttach(Activity activity) {
        bjtd bjtd;
        super.onAttach(activity);
        if (mo52776bU() != null) {
            Fragment fragment = this;
            while (true) {
                if (fragment != null) {
                    if (fragment instanceof bjte) {
                        bjtd = ((bjte) fragment).mo51884l();
                        break;
                    }
                    fragment = fragment.getParentFragment();
                } else {
                    bjtd = null;
                    break;
                }
            }
            if (bjtd == null && (activity instanceof bjte)) {
                bjtd = ((bjte) activity).mo51884l();
            }
            mo52776bU().mo66033a(activity, bjtd);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getArguments().getInt("themeResourceId");
        this.f123961aF = i;
        if (i > 0) {
            this.f123962aG = new ContextThemeWrapper(getActivity(), this.f123961aF);
            this.f123964aI = (LogContext) getArguments().getParcelable("parentLogContext");
            if (bundle != null) {
                if (bundle.containsKey("expandableSavedInstance")) {
                    mo52776bU().mo66026a(bundle.getParcelable("expandableSavedInstance"));
                }
                this.f123959Dv = bjxv.m104860b(bundle);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("resettableIdGeneratorBundleMap");
                if (sparseParcelableArray != null) {
                    int size = sparseParcelableArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = sparseParcelableArray.keyAt(i2);
                        this.f123960Dw.put(keyAt, bjxv.m104860b((Bundle) sparseParcelableArray.get(keyAt)));
                    }
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Invalid theme resource id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f123963aH = layoutInflater.cloneInContext(this.f123962aG);
        mo52828b(bundle);
        return mo52843a(bundle, mo51901a(this.f123963aH, viewGroup, bundle));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (mo52776bU() != null) {
            bundle.putParcelable("expandableSavedInstance", mo52776bU().mo66024a());
        }
        bjxv bjxv = this.f123959Dv;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        SparseArray sparseArray = new SparseArray();
        int size = this.f123960Dw.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f123960Dw.keyAt(i);
            Bundle bundle2 = new Bundle();
            ((bjxv) this.f123960Dw.get(keyAt)).mo65615a(bundle2);
            sparseArray.put(keyAt, bundle2);
        }
        bundle.putSparseParcelableArray("resettableIdGeneratorBundleMap", sparseArray);
    }
}

package p000;

import android.os.Bundle;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aesz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aesz {

    /* renamed from: a */
    public int f63756a = 1;

    /* renamed from: b */
    public final Set f63757b = new HashSet();

    /* renamed from: c */
    public final LoaderManager f63758c;

    public aesz(LoaderManager loaderManager, Bundle bundle) {
        if (bundle != null) {
            this.f63756a = bundle.getInt("loader_id_manager_next_id");
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("loader_id_manager_id_set");
            if (integerArrayList != null) {
                this.f63757b.addAll(integerArrayList);
            }
        }
        this.f63758c = loaderManager;
    }

    /* renamed from: a */
    public final LoaderManager.LoaderCallbacks mo34531a(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        this.f63757b.add(Integer.valueOf(i));
        return new aesy(this, loaderCallbacks);
    }

    /* renamed from: a */
    public final void mo34532a(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks, boolean z) {
        if (z) {
            loaderCallbacks = mo34531a(i, loaderCallbacks);
        }
        this.f63758c.restartLoader(i, bundle, loaderCallbacks);
    }

    /* renamed from: a */
    public final void mo34533a(Bundle bundle) {
        bundle.putInt("loader_id_manager_next_id", this.f63756a);
        bundle.putIntegerArrayList("loader_id_manager_id_set", new ArrayList(this.f63757b));
    }

    /* renamed from: a */
    public final boolean mo34534a() {
        return !this.f63757b.isEmpty();
    }
}

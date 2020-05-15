package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: amrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amrn extends Fragment {

    /* renamed from: a */
    private amrv f75814a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        amrv amrv = new amrv();
        this.f75814a = amrv;
        amrv.mo41286a((deu) getActivity());
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        this.f75814a.mo41284a(menuInflater, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return this.f75814a.mo41282a(layoutInflater, viewGroup);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f75814a.mo41285a(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onStart() {
        super.onStart();
        this.f75814a.mo41283a();
    }

    public final void onStop() {
        this.f75814a.mo41288b();
        super.onStop();
    }
}

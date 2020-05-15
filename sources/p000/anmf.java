package p000;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ListFragment;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: anmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anmf extends ListFragment implements anmc {

    /* renamed from: a */
    protected anme f77123a;

    /* renamed from: b */
    private C1341rz f77124b;

    /* renamed from: c */
    private boolean f77125c;

    /* renamed from: a */
    public final void mo41941a(C1341rz rzVar) {
        if (!isResumed()) {
            this.f77125c = true;
            this.f77124b = rzVar;
            return;
        }
        mo41943b(rzVar);
        this.f77125c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41942b() {
        setEmptyText("");
        TextView textView = (TextView) getListView().getEmptyView();
        textView.setTextSize(18.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.plus_empty_text_padding);
        textView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        textView.setGravity(48);
        textView.setAutoLinkMask(15);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: b */
    public abstract void mo41943b(C1341rz rzVar);

    /* renamed from: c */
    public abstract FavaDiagnosticsEntity mo41944c();

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f77123a = (anme) getFragmentManager().findFragmentByTag("apps_util");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.f77123a.onOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        this.f77123a.onPrepareOptionsMenu(menu);
    }

    public final void onResume() {
        super.onResume();
        if (this.f77125c) {
            mo41943b(this.f77124b);
            this.f77124b = null;
            this.f77125c = false;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f77123a.f77113g.add(this);
        mo41930a();
    }

    public final void onStop() {
        super.onStop();
        this.f77123a.f77113g.remove(this);
    }
}

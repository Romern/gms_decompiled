package p000;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: yct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yct extends Fragment implements ycv {

    /* renamed from: d */
    protected ViewOptions f53615d;

    /* renamed from: e */
    protected Boolean f53616e;

    /* renamed from: f */
    protected xic f53617f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo30349a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z);

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflater from = LayoutInflater.from(getActivity());
        ViewGroup viewGroup = (ViewGroup) getView();
        viewGroup.removeAllViewsInLayout();
        mo30349a(from, viewGroup, true);
    }
}

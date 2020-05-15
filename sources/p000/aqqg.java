package p000;

import android.os.Bundle;
import com.google.android.chimera.ListFragment;

/* renamed from: aqqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqg extends ListFragment {

    /* renamed from: a */
    public aqwa f86592a;

    /* renamed from: b */
    private int f86593b;

    /* renamed from: c */
    private String f86594c;

    /* renamed from: d */
    private String f86595d;

    /* renamed from: e */
    private String f86596e;

    /* renamed from: f */
    private aqwm f86597f;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f86593b = arguments.getInt("applicationId");
        this.f86594c = arguments.getString("viewerAccountName");
        this.f86595d = arguments.getString("qualifiedId");
        this.f86596e = arguments.getString("viewerPageId");
        this.f86597f = new aqwm(getLoaderManager(), getActivity(), this.f86593b, this.f86595d, this.f86594c, this.f86596e);
        this.f86592a = new aqwa(getLoaderManager(), getActivity());
    }

    public final void onStart() {
        super.onStart();
        getListView().setDivider(null);
        this.f86597f.mo48200a(1, new aqqf(this));
    }
}

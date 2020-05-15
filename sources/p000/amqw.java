package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: amqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqw extends Fragment {

    /* renamed from: a */
    private amqx f75786a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        amqx amqx = new amqx(false);
        this.f75786a = amqx;
        amqx.mo41264a((deu) getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return this.f75786a.mo41263a(layoutInflater, viewGroup);
    }
}

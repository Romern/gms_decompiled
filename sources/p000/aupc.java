package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aupc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aupc extends dns {
    /* renamed from: a */
    public final RecyclerView mo9316a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView a = super.mo9316a(layoutInflater, viewGroup, bundle);
        a.addItemDecoration(new aupb(getActivity()));
        a.setPadding(0, 0, 0, 0);
        return a;
    }
}

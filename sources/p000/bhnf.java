package p000;

import android.view.View;

/* renamed from: bhnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhnf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f119123a;

    /* renamed from: b */
    final /* synthetic */ bhnh f119124b;

    public bhnf(bhnh bhnh, View.OnClickListener onClickListener) {
        this.f119124b = bhnh;
        this.f119123a = onClickListener;
    }

    public void onClick(View view) {
        this.f119123a.onClick(view);
        this.f119124b.mo64018a(1);
    }
}

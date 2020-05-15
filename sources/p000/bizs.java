package p000;

import android.view.View;

/* renamed from: bizs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bizs implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bizr f122393a;

    /* renamed from: b */
    final /* synthetic */ bizv f122394b;

    public bizs(bizv bizv, bizr bizr) {
        this.f122394b = bizv;
        this.f122393a = bizr;
    }

    public void onClick(View view) {
        bizl bizl = this.f122393a.f122392t;
        if (this.f122394b.f122397e != null && bizl != null && bizl.mo64908bJ()) {
            this.f122394b.f122397e.mo47885a(bizl);
        }
    }
}

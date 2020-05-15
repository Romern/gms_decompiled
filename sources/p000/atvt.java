package p000;

import android.view.View;

/* renamed from: atvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atvt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ atvu f91024a;

    public atvt(atvu atvu) {
        this.f91024a = atvu;
    }

    public void onClick(View view) {
        new atvz().show(this.f91024a.f91026b.getSupportFragmentManager(), (String) null);
    }
}

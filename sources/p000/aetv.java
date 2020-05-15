package p000;

import android.view.View;

/* renamed from: aetv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aetv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f63793a;

    /* renamed from: b */
    final /* synthetic */ aetw f63794b;

    public aetv(aetw aetw, String str) {
        this.f63794b = aetw;
        this.f63793a = str;
    }

    public void onClick(View view) {
        aesv.m52523a(null, this.f63793a, this.f63794b.getString(17039370), null).show(this.f63794b.getFragmentManager(), "dialog_tag_help");
    }
}

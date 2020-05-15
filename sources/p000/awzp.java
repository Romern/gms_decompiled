package p000;

import android.content.Context;
import android.text.Html;
import android.widget.Toast;

/* renamed from: awzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzp extends bkcf {

    /* renamed from: a */
    public final Context f95432a;

    public awzp(bmde bmde, bkgd bkgd) {
        super(bmde, bkgd.f124187b);
        this.f95432a = bkgd.f124189d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkch mo52903a() {
        return awzr.m81794a(this.f123985b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52904b() {
        Toast.makeText(this.f95432a, Html.fromHtml(((bmnr) this.f123985b.f128787f.get(0)).f130159e), 1).show();
    }
}

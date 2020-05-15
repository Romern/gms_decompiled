package p000;

import android.net.Uri;
import android.view.View;

/* renamed from: ewe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ewe extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ Uri f15919b;

    public ewe(Uri uri) {
        this.f15919b = uri;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        view.setLongClickable(false);
        view.setOnClickListener(new ewd(this.f15919b));
    }
}

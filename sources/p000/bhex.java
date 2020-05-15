package p000;

import android.view.View;

/* renamed from: bhex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhex implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhey f118431a;

    public bhex(bhey bhey) {
        this.f118431a = bhey;
    }

    public void onClick(View view) {
        C1446vw vwVar = ((bhev) view).f118418c;
        bhey bhey = this.f118431a;
        if (!bhey.f118449o.mo16228a(vwVar, bhey.f118448n, 0)) {
            vwVar.setChecked(true);
        }
    }
}

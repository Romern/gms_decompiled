package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: sb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1344sb implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C1348sf f26961a;

    /* renamed from: b */
    final /* synthetic */ C1345sc f26962b;

    public C1344sb(C1345sc scVar, C1348sf sfVar) {
        this.f26962b = scVar;
        this.f26961a = sfVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f26962b.f26980r.onClick(this.f26961a.f26997b, i);
        if (!this.f26962b.f26984v) {
            this.f26961a.f26997b.dismiss();
        }
    }
}

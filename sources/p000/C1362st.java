package p000;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: st */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1362st implements C1413uq {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27037a;

    /* renamed from: b */
    private final C1413uq f27038b;

    public C1362st(C1372tc tcVar, C1413uq uqVar) {
        this.f27037a = tcVar;
        this.f27038b = uqVar;
    }

    /* renamed from: a */
    public final void mo15960a(C1414ur urVar) {
        C1418uv uvVar = (C1418uv) this.f27038b;
        uvVar.f27285a.onDestroyActionMode(uvVar.mo16099b(urVar));
        C1372tc tcVar = this.f27037a;
        if (tcVar.f27108m != null) {
            tcVar.f27101f.getDecorView().removeCallbacks(this.f27037a.f27109n);
        }
        C1372tc tcVar2 = this.f27037a;
        if (tcVar2.f27107l != null) {
            tcVar2.mo16002u();
            C1372tc tcVar3 = this.f27037a;
            C1285px m = C1280ps.m19931m(tcVar3.f27107l);
            m.mo15708a(0.0f);
            tcVar3.f27110o = m;
            this.f27037a.f27110o.mo15711a(new C1361ss(this));
        }
        C1372tc tcVar4 = this.f27037a;
        tcVar4.f27106k = null;
        C1280ps.m19937s(tcVar4.f27112q);
    }

    /* renamed from: b */
    public final void mo15963b(C1414ur urVar, Menu menu) {
        C1280ps.m19937s(this.f27037a.f27112q);
        C1418uv uvVar = (C1418uv) this.f27038b;
        uvVar.f27285a.onPrepareActionMode(uvVar.mo16099b(urVar), uvVar.mo16098a(menu));
    }

    /* renamed from: a */
    public final boolean mo15961a(C1414ur urVar, Menu menu) {
        C1418uv uvVar = (C1418uv) this.f27038b;
        return uvVar.f27285a.onCreateActionMode(uvVar.mo16099b(urVar), uvVar.mo16098a(menu));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [ma, android.view.MenuItem], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final boolean mo15962a(C1414ur urVar, MenuItem r5) {
        C1418uv uvVar = (C1418uv) this.f27038b;
        return uvVar.f27285a.onActionItemClicked(uvVar.mo16099b(urVar), new C1453wc(uvVar.f27286b, r5));
    }
}

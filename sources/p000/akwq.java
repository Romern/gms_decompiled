package p000;

import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: akwq */
final /* synthetic */ class akwq implements aubq {

    /* renamed from: a */
    private final akwu f73014a;

    /* renamed from: b */
    private final StateUpdate f73015b;

    public akwq(akwu akwu, StateUpdate stateUpdate) {
        this.f73014a = akwu;
        this.f73015b = stateUpdate;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        akwu akwu = this.f73014a;
        StateUpdate stateUpdate = this.f73015b;
        if (stateUpdate.equals(StateUpdate.f31874d) || stateUpdate.equals(StateUpdate.f31871a)) {
            akwu.f73025f = false;
        }
    }
}

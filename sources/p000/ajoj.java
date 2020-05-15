package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoj */
public final /* synthetic */ class ajoj implements aubw {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71061a;

    public ajoj(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71061a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71061a;
        receiveSurfaceChimeraActivity.f80941m.setText(receiveSurfaceChimeraActivity.getString(C0126R.string.sharing_receive_surface_subtitle, new Object[]{(String) obj}));
    }
}

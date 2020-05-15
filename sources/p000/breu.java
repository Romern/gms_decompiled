package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.mfi.StartEventCallback;
import com.felicanetworks.mfc.mfi.User;

/* renamed from: breu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class breu implements StartEventCallback {

    /* renamed from: a */
    final /* synthetic */ MfiClient f142730a;

    /* renamed from: b */
    final /* synthetic */ brev f142731b;

    public breu(brev brev, MfiClient mfiClient) {
        this.f142731b = brev;
        this.f142730a = mfiClient;
    }

    public final void onError(int i, String str) {
        try {
            this.f142731b.f142733b.f142734a.mo49936a(brez.m113953a(i, str));
            this.f142731b.f142733b.f142737d.mo69480a(3);
        } finally {
            brev brev = this.f142731b;
            brew brew = brev.f142733b;
            brew.f142737d.mo69508b(brev.f142732a, brew.f142738e);
            this.f142731b.f142733b.f142737d.mo69509c();
        }
    }

    public final void onSuccess(User user) {
        try {
            this.f142731b.f142733b.f142734a.mo49937a(this.f142730a, user);
            this.f142731b.f142733b.f142737d.mo69515f(3);
            brev brev = this.f142731b;
            brew brew = brev.f142733b;
            brew.f142737d.mo69481a(brev.f142732a, brew.f142739f);
        } catch (MfiClientException e) {
            this.f142731b.f142733b.f142737d.mo69502a(12, e);
            this.f142731b.f142733b.f142734a.mo49936a(brez.m113953a(e.getType(), e.getMessage()));
            this.f142731b.f142733b.f142737d.mo69480a(4);
            brev brev2 = this.f142731b;
            brew brew2 = brev2.f142733b;
            brew2.f142737d.mo69481a(brev2.f142732a, brew2.f142738e);
        }
    }
}

package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlg */
final /* synthetic */ class ajlg implements Callable {

    /* renamed from: a */
    private final ajmt f70848a;

    /* renamed from: b */
    private final SetAccountParams f70849b;

    public ajlg(ajmt ajmt, SetAccountParams setAccountParams) {
        this.f70848a = ajmt;
        this.f70849b = setAccountParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70848a;
        SetAccountParams setAccountParams = this.f70849b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Account account = setAccountParams.f81122a;
        Charset charset = NearbySharingChimeraService.f80888a;
        return Integer.valueOf(nearbySharingChimeraService.mo44418a(account));
    }
}

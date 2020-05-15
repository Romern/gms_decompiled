package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atri extends aeaa {

    /* renamed from: a */
    final /* synthetic */ TokenizePanChimeraActivity f90707a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public atri(TokenizePanChimeraActivity tokenizePanChimeraActivity, String str) {
        super(str);
        this.f90707a = tokenizePanChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90707a;
        tokenizePanChimeraActivity.f108912i = null;
        tokenizePanChimeraActivity.f108907d = false;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f90707a.f108912i = new Messenger(iBinder);
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90707a;
        tokenizePanChimeraActivity.f108907d = true;
        tokenizePanChimeraActivity.mo59484e();
    }
}

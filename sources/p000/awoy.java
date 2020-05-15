package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awoy extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awou f94790a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awoy(awou awou, String str) {
        super(str);
        this.f94790a = awou;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f94790a.f94784u.mo33957d(this.f94790a.f94784u.obtainMessage(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, 16));
        this.f94790a.f94780q = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        awxo awxo;
        awou awou = this.f94790a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.service.reauth.IReauthService");
            awxo = queryLocalInterface instanceof awxo ? (awxo) queryLocalInterface : new awxm(iBinder);
        } else {
            awxo = null;
        }
        awou.f94780q = awxo;
        this.f94790a.f94784u.mo33957d(this.f94790a.f94784u.obtainMessage(32767, 16));
    }
}

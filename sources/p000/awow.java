package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awow extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awou f94788a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awow(awou awou, String str) {
        super(str);
        this.f94788a = awou;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f94788a.f94784u.mo33957d(this.f94788a.f94784u.obtainMessage(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, 4));
        this.f94788a.f94776m = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        awua awua;
        awou awou = this.f94788a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.service.orchestration.IOrchestrationService");
            awua = queryLocalInterface instanceof awua ? (awua) queryLocalInterface : new awty(iBinder);
        } else {
            awua = null;
        }
        awou.f94776m = awua;
        this.f94788a.f94784u.mo33957d(this.f94788a.f94784u.obtainMessage(32767, 4));
    }
}

package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awov extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awou f94787a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awov(awou awou, String str) {
        super(str);
        this.f94787a = awou;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f94787a.f94784u.mo33957d(this.f94787a.f94784u.obtainMessage(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, 2));
        this.f94787a.f94774k = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        awxa awxa;
        awou awou = this.f94787a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.service.ow.IOwInternalService");
            awxa = queryLocalInterface instanceof awxa ? (awxa) queryLocalInterface : new awwy(iBinder);
        } else {
            awxa = null;
        }
        awou.f94774k = awxa;
        this.f94787a.f94784u.mo33957d(this.f94787a.f94784u.obtainMessage(32767, 2));
    }
}

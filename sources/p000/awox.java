package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awox extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awou f94789a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awox(awou awou, String str) {
        super(str);
        this.f94789a = awou;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f94789a.f94784u.mo33957d(this.f94789a.f94784u.obtainMessage(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, 8));
        this.f94789a.f94778o = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        awrn awrn;
        awou awou = this.f94789a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.service.ib.IIbService");
            awrn = queryLocalInterface instanceof awrn ? (awrn) queryLocalInterface : new awrl(iBinder);
        } else {
            awrn = null;
        }
        awou.f94778o = awrn;
        this.f94789a.f94784u.mo33957d(this.f94789a.f94784u.obtainMessage(32767, 8));
    }
}

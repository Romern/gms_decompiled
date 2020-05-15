package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.CastDevice;

/* renamed from: qbg */
final /* synthetic */ class qbg implements Runnable {

    /* renamed from: a */
    private final qbn f40863a;

    /* renamed from: b */
    private final CastDevice f40864b;

    public qbg(qbn qbn, CastDevice castDevice) {
        this.f40863a = qbn;
        this.f40864b = castDevice;
    }

    public final void run() {
        qbn qbn = this.f40863a;
        CastDevice castDevice = this.f40864b;
        Toast.makeText(qbn.getContext(), qbn.getContext().getResources().getString(C0126R.string.cast_display_notification_ended, castDevice.f29716d), 1).show();
    }
}

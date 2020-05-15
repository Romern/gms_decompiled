package p000;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* renamed from: psr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psr implements pue {

    /* renamed from: a */
    final /* synthetic */ pst f40155a;

    public psr(pst pst) {
        this.f40155a = pst;
    }

    /* renamed from: a */
    public final void mo23351a(long j, int i, Object obj) {
        pub pub;
        if (obj instanceof pub) {
            pub = (pub) obj;
        } else {
            pub = null;
        }
        try {
            pst pst = this.f40155a;
            Status status = new Status(i);
            if (pub != null) {
                JSONObject jSONObject = pub.f40225a;
            }
            if (pub != null) {
                MediaError mediaError = pub.f40226b;
            }
            pst.mo17716a(new psv(status));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }

    /* renamed from: i */
    public final void mo23352i() {
        try {
            this.f40155a.mo17716a(pst.m31165a(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }
}

package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfry extends adzt {

    /* renamed from: a */
    final /* synthetic */ bfsa f115084a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfry(bfsa bfsa, Looper looper) {
        super(looper);
        this.f115084a = bfsa;
    }

    public final void handleMessage(Message message) {
        bfrx bfrx;
        if (this.f115084a.f115095i != null) {
            int i = message.what;
            if (i == 0) {
                this.f115084a.f115095i.mo62150a((ActivityRecognitionResult) message.obj);
            } else if (i == 1) {
                this.f115084a.f115095i.mo62153a((List) message.obj);
            } else if (i == 2) {
                this.f115084a.f115095i.mo62154a((NetworkLocationStatus[]) message.obj);
            } else if (i == 3) {
                this.f115084a.f115095i.mo62159d();
            } else if (i != 4) {
                String valueOf = String.valueOf(message);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Unexpected msg.what in ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (cest.m138205k() && (bfrx = this.f115084a.f115096j) != null) {
                bfrx.mo62193a((ArrayList) message.obj);
            }
        }
    }
}

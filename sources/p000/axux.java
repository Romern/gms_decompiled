package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;

/* renamed from: axux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axux extends axvn {

    /* renamed from: a */
    final /* synthetic */ String f96436a;

    /* renamed from: b */
    final /* synthetic */ ayel f96437b;

    /* renamed from: c */
    final /* synthetic */ axvr f96438c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axux(axvr axvr, String str, ayel ayel) {
        super(axvr);
        this.f96438c = axvr;
        this.f96436a = str;
        this.f96437b = ayel;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelDataRequest(%s, request)", this.f96436a));
        }
        ayek ayek = this.f96437b.f97324b;
        if (ayek == null) {
            ayek = ayek.f97315e;
        }
        boolean z = !ayek.f97319c;
        axvt axvt = this.f96438c.f96497d;
        String str = this.f96436a;
        ayek ayek2 = this.f96437b.f97324b;
        if (ayek2 == null) {
            ayek2 = ayek.f97315e;
        }
        axvx axvx = (axvx) axvt.mo53629a(str, ayek2.f97318b, z);
        if (axvx != null) {
            this.f96486g = axvx;
            ayel ayel = this.f96437b;
            int i = axvx.f96517e;
            if (i == 2 || i == 3) {
                switch (axvx.f96519g) {
                    case 9:
                        ayek ayek3 = ayel.f97324b;
                        if (ayek3 == null) {
                            ayek3 = ayek.f97315e;
                        }
                        if (ayek3.f97320d != axvx.f96521i) {
                            return;
                        }
                        if (ayel.f97325c.mo73744a() <= 65536) {
                            if (axvx.f96525m == null) {
                                axvx.f96525m = ByteBuffer.allocate(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
                            }
                            axvx.f96525m.clear();
                            axvx.f96525m.put(ayel.f97325c.getKey());
                            axvx.f96525m.flip();
                            if (ayel.f97326d) {
                                axvx.f96526n = true;
                            }
                            ParcelFileDescriptor parcelFileDescriptor = axvx.f96523k;
                            if (parcelFileDescriptor != null) {
                                axvx.f96515c.mo53617a(parcelFileDescriptor, ayfi.WRITE);
                            }
                            axvx.mo53640b(10);
                            return;
                        }
                        Log.w("ChannelStateMachine", "Received payload longer than max buffer size");
                        throw new axvw();
                    case 10:
                        ayek ayek4 = ayel.f97324b;
                        if (ayek4 == null) {
                            ayek4 = ayek.f97315e;
                        }
                        if (ayek4.f97320d > axvx.f96521i) {
                            Log.w("ChannelStateMachine", "Received new data packet before ACK of last one.");
                            throw new axvw();
                        }
                        return;
                    case 11:
                        throw new axvw();
                    default:
                        return;
                }
            } else {
                throw new axvw();
            }
        } else {
            Log.w("ChannelManager", "Received data packet for closed channel");
        }
    }
}

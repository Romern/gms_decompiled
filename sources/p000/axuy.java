package p000;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: axuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axuy extends axvn {

    /* renamed from: a */
    final /* synthetic */ String f96439a;

    /* renamed from: b */
    final /* synthetic */ ayej f96440b;

    /* renamed from: c */
    final /* synthetic */ axvr f96441c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axuy(axvr axvr, String str, ayej ayej) {
        super(axvr);
        this.f96441c = axvr;
        this.f96439a = str;
        this.f96440b = ayej;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelDataAckRequest(%s, request)", this.f96439a));
        }
        ayek ayek = this.f96440b.f97313b;
        if (ayek == null) {
            ayek = ayek.f97315e;
        }
        boolean z = !ayek.f97319c;
        axvt axvt = this.f96441c.f96497d;
        String str = this.f96439a;
        ayek ayek2 = this.f96440b.f97313b;
        if (ayek2 == null) {
            ayek2 = ayek.f97315e;
        }
        axvx axvx = (axvx) axvt.mo53629a(str, ayek2.f97318b, z);
        if (axvx == null) {
            Log.w("ChannelManager", "Received data packet for closed channel");
            return;
        }
        this.f96486g = axvx;
        try {
            ayej ayej = this.f96440b;
            int i = axvx.f96517e;
            if (i != 2) {
                if (i != 3) {
                    throw new axvw();
                }
            }
            ayek ayek3 = ayej.f97313b;
            if (ayek3 == null) {
                ayek3 = ayek.f97315e;
            }
            if (ayek3.f97320d > axvx.f96522j) {
                throw new axvw();
            } else if (axvx.f96518f == 7) {
                ayek ayek4 = ayej.f97313b;
                if (ayek4 == null) {
                    ayek4 = ayek.f97315e;
                }
                if (ayek4.f97320d == axvx.f96522j) {
                    axyi axyi = axvx.f96532t;
                    if (axyi != null && axyi.mo53764a()) {
                        axvx.f96522j++;
                        if (!ayej.f97314c) {
                            ByteBuffer byteBuffer = axvx.f96527o;
                            if (byteBuffer != null) {
                                byteBuffer.clear();
                            }
                            axvx.f96515c.mo53617a(axvx.f96524l, ayfi.READ);
                            axvx.mo53643c(6);
                        } else if (axvx.f96517e == 3) {
                            if (axvx.f96524l != null) {
                                axvx.mo53636a(3, axvx.f96528p);
                            }
                            axvx.mo53648f(axvx.f96528p);
                            throw axvx.mo53642c(3, axvx.f96528p);
                        } else {
                            if (axvx.f96524l != null) {
                                Log.i("ChannelStateMachine", "Remote node closed input stream before all data was sent");
                                axvx.mo53636a(0, 0);
                                axvx.f96524l = null;
                            }
                            axvx.mo53643c(8);
                        }
                    }
                    axvx.f96532t = null;
                }
            }
        } catch (axvv e) {
            mo53612a(e.f96511a);
        }
    }
}

package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: vxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vxj implements Runnable, rlz, rof {

    /* renamed from: d */
    private static vxj f50191d;

    /* renamed from: a */
    public final LinkedBlockingQueue f50192a = new LinkedBlockingQueue();

    /* renamed from: b */
    public int f50193b = 0;

    /* renamed from: c */
    public final Handler f50194c;

    /* renamed from: e */
    private final sbm f50195e;

    private vxj(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        this.f50194c = new adzt(handlerThread.getLooper());
        this.f50195e = new vxd(context, this.f50194c.getLooper(), this, this);
    }

    /* renamed from: a */
    static synchronized vxj m41528a(Context context) {
        vxj vxj;
        synchronized (vxj.class) {
            if (f50191d == null) {
                f50191d = new vxj(context);
            }
            vxj = f50191d;
        }
        return vxj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139 A[SYNTHETIC, Splitter:B:69:0x0139] */
    /* renamed from: b */
    private final void m41530b() {
        vxi vxi;
        vyg vyg;
        Parcelable parcelable;
        Throwable th;
        Throwable th2;
        File a;
        Throwable th3;
        Throwable th4;
        FileChannel channel;
        Throwable th5;
        boolean z;
        while (true) {
            vxe vxe = (vxe) this.f50192a.poll();
            if (vxe == null) {
                mo28930a();
                return;
            } else if (!vxe.f50181f) {
                vxu vxu = vxe.f50180e;
                vxu.mo28934a(3, vxw.FINE);
                try {
                    vxp a2 = ((vxs) this.f50195e.mo25289B()).mo28941a();
                    vxu.mo28934a(4, vxw.FINE);
                    vxe.f50179d.f31252a.putInt("openHandles", this.f50193b);
                    DroidGuardInitReply a3 = a2.mo28937a(vxe.f50178c, vxe.f50179d);
                    if (a3 == null) {
                        a2.mo28939a(vxe.f50178c);
                    }
                    vxu.mo28934a(5, vxw.FINE);
                    if (a3 != null) {
                        Context context = this.f50195e.f43948r;
                        vyv vyv = new vyv(context);
                        if (!cdrn.m134752b()) {
                            vyg = new vyg(context);
                        } else {
                            vyg = new vyu();
                        }
                        vyf vyf = new vyf(new vyz(context, vyv, vyg, null, vxu), vxu);
                        if (!(a3.f31253a == null || (parcelable = a3.f31254b) == null)) {
                            String string = ((Bundle) parcelable).getString("h");
                            if (string != null) {
                                vyy vyy = new vyy(string);
                                ParcelFileDescriptor parcelFileDescriptor = a3.f31253a;
                                try {
                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                                    try {
                                        vyz vyz = vyf.f50226a;
                                        synchronized (vyz.f50262a) {
                                            try {
                                                z = true;
                                                if (vyz.f50262a.mo28957a(vyy) == null && vyz.f50264c.mo28981a(vyy) == null) {
                                                    z = false;
                                                }
                                            } catch (vxy e) {
                                            }
                                        }
                                        if (z) {
                                            Class a4 = vyz.mo28987a(vyy, new byte[0]);
                                            vyz.f50265d.mo28934a(9, vxw.FINE);
                                            vza vza = new vza(a4, vyz.f50263b, parcelable);
                                            vyf.f50227b.mo28934a(10, vxw.FINE);
                                            vza.mo28989a();
                                            vyf.f50227b.mo28934a(11, vxw.FINE);
                                            vza.mo28991b();
                                            vyf.f50227b.mo28934a(12, vxw.FINE);
                                            autoCloseInputStream.close();
                                            if (parcelFileDescriptor != null) {
                                                parcelFileDescriptor.close();
                                            }
                                        }
                                        a = vyv.m41612a(vyz.f50263b);
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(a);
                                            try {
                                                FileChannel channel2 = autoCloseInputStream.getChannel();
                                                try {
                                                    channel = fileOutputStream.getChannel();
                                                    channel.transferFrom(channel2, 0, channel2.size());
                                                    vyz.f50264c.mo28982a(vyy, vyx.m41621a(a));
                                                    if (channel != null) {
                                                        channel.close();
                                                    }
                                                    if (channel2 != null) {
                                                        channel2.close();
                                                    }
                                                    fileOutputStream.close();
                                                    a.delete();
                                                    vyz.f50265d.mo28934a(6, vxw.FINE);
                                                    Class a42 = vyz.mo28987a(vyy, new byte[0]);
                                                    vyz.f50265d.mo28934a(9, vxw.FINE);
                                                    vza vza2 = new vza(a42, vyz.f50263b, parcelable);
                                                    vyf.f50227b.mo28934a(10, vxw.FINE);
                                                    vza2.mo28989a();
                                                    vyf.f50227b.mo28934a(11, vxw.FINE);
                                                    vza2.mo28991b();
                                                    vyf.f50227b.mo28934a(12, vxw.FINE);
                                                    autoCloseInputStream.close();
                                                    if (parcelFileDescriptor != null) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th4 = th6;
                                                    if (channel2 == null) {
                                                        break;
                                                    }
                                                    channel2.close();
                                                    break;
                                                    throw th4;
                                                }
                                            } catch (Throwable th7) {
                                                th3 = th7;
                                                fileOutputStream.close();
                                                throw th3;
                                            }
                                        } catch (Exception e2) {
                                            throw new vzb("VM couldn't be stored", e2);
                                        } catch (Throwable th8) {
                                            bqye.m113761a(th3, th8);
                                            break;
                                        }
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        autoCloseInputStream.close();
                                        throw th2;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    if (parcelFileDescriptor == null) {
                                        break;
                                    }
                                    parcelFileDescriptor.close();
                                    break;
                                    throw th;
                                }
                            } else {
                                throw new vyw(new byte[0], "Missing key");
                            }
                        }
                    }
                    vxi = new vxi(this, a2, (long) vxe.f50179d.mo18376a(), vxu);
                } catch (Exception e3) {
                    String valueOf = String.valueOf(e3.toString());
                    vxi = new vxi(this, valueOf.length() == 0 ? new String("Initialization failed: ") : "Initialization failed: ".concat(valueOf), vxu);
                } catch (Throwable th11) {
                    bqye.m113761a(th, th11);
                    break;
                }
                vxe.f50180e.mo28934a(13, vxw.COARSE);
                vxe.mo28925c(vxi);
            }
        }
        throw th;
        throw th5;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        sdo.m34964a(this.f50194c);
        m41530b();
    }

    public final void run() {
        sdo.m34964a(this.f50194c);
        if (this.f50195e.mo25301p()) {
            m41530b();
        } else if (!this.f50195e.mo25302q() && this.f50192a.size() > 0) {
            this.f50195e.mo25308x();
        }
    }

    /* renamed from: a */
    private final void m41529a(String str) {
        while (true) {
            vxe vxe = (vxe) this.f50192a.poll();
            if (vxe != null) {
                vxe.mo28925c(new vxi(this, str, vxe.f50180e));
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo28930a() {
        if (this.f50192a.isEmpty() && this.f50193b == 0 && this.f50195e.mo25301p()) {
            this.f50195e.mo14032j();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        sdo.m34964a(this.f50194c);
        StringBuilder sb = new StringBuilder(25);
        sb.append("Disconnected: ");
        sb.append(i);
        m41529a(sb.toString());
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        sdo.m34964a(this.f50194c);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Connection failed: ");
        sb.append(valueOf);
        m41529a(sb.toString());
    }

    /* renamed from: a */
    public final void mo28931a(Runnable runnable) {
        if (Looper.myLooper() == this.f50194c.getLooper()) {
            runnable.run();
        } else {
            this.f50194c.post(runnable);
        }
    }
}

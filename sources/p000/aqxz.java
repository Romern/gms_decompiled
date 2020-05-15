package p000;

import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aqxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqxz {

    /* renamed from: a */
    public final Logger f87060a;

    /* renamed from: b */
    public final Handler f87061b;

    /* renamed from: c */
    protected final aqxy f87062c;

    /* renamed from: d */
    private final AtomicBoolean f87063d = new AtomicBoolean(false);

    /* renamed from: e */
    private boolean f87064e = false;

    /* renamed from: f */
    private arhh f87065f;

    public aqxz(Logger Logger, Handler handler, aqxy aqxy) {
        this.f87060a = Logger;
        this.f87061b = handler;
        this.f87062c = aqxy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract aqzo mo48227a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48228a(int i) {
        this.f87060a.logVerbose("Packet mode enabled", new Object[0]);
        this.f87064e = true;
        if (this.f87065f == null) {
            this.f87065f = new arhh(new aqxx(this), i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48229a(MessagePayload messagePayload);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public BootstrapCompletionResult mo48231b() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo48232b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48235c() {
        this.f87062c.mo48224a(mo48231b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo48237d() {
        aqzo a = mo48227a();
        if (a != null) {
            this.f87060a.logVerbose("Disconnecting DeviceMessageSender.", new Object[0]);
            a.mo48304a();
            return;
        }
        this.f87060a.mo25412b("DeviceMessageSender has already been disconnected.", new Object[0]);
    }

    /* renamed from: e */
    public void mo48239e() {
        this.f87064e = false;
        this.f87065f = null;
    }

    /* renamed from: b */
    public final void mo48233b(MessagePayload messagePayload) {
        arhh arhh;
        aqzo a = mo48227a();
        if (a == null) {
            this.f87060a.mo25418e("Tried to send message while DeviceMessageSender is null.", new Object[0]);
            mo48232b(10563);
            this.f87062c.mo48223a(10563);
            return;
        }
        if (cgqf.m146561b()) {
            this.f87060a.mo25412b("Sending %s", messagePayload.mo59103c());
        }
        try {
            byte[] g = messagePayload.mo59188g();
            if (!this.f87064e || (arhh = this.f87065f) == null) {
                a.mo48305a(g);
                return;
            }
            List<byte[]> a2 = arhh.mo48538a(g);
            this.f87060a.logVerbose("Encoded message of %d bytes", Integer.valueOf(g.length));
            for (byte[] bArr : a2) {
                a.mo48305a(bArr);
            }
        } catch (IOException e) {
            this.f87060a.mo25417e("Error sending MessagePayload.", e, new Object[0]);
            mo48232b(10563);
            this.f87062c.mo48223a(10563);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48236c(int i) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59093a(i);
        mo48233b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48230a(byte[] bArr) {
        arhh arhh;
        Logger Logger = this.f87060a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Received ");
        sb.append(length);
        sb.append(" bytes of data.");
        Logger.logVerbose(sb.toString(), new Object[0]);
        if (!this.f87064e || (arhh = this.f87065f) == null) {
            mo48234b(bArr);
            return;
        }
        arhh.mo48539b(bArr);
        this.f87060a.logVerbose("processed data as a packet", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48238d(int i) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59093a(3);
        DeviceStatus deviceStatus = new DeviceStatus();
        deviceStatus.mo59090a(i);
        messagePayload.mo59098a(deviceStatus);
        mo48233b(messagePayload);
    }

    /* renamed from: b */
    public final void mo48234b(byte[] bArr) {
        try {
            MessagePayload a = arqa.m73288a(bArr);
            if (a == null) {
                mo48232b(10555);
                this.f87062c.mo48223a(10555);
            } else if (arhe.m72761a(a.f107976c)) {
                int i = a.f107976c;
                if ((i == 2 || i == 4) && !this.f87063d.getAndSet(true)) {
                    mo48235c();
                } else if (i == 1) {
                    mo48232b(10564);
                    this.f87062c.mo48223a(10564);
                } else if (i == 3) {
                    DeviceStatus deviceStatus = a.f107985l;
                    mo48232b(10575);
                    if (deviceStatus == null) {
                        this.f87062c.mo48223a(10575);
                    } else {
                        this.f87062c.mo48223a(deviceStatus.f107968a);
                    }
                }
            } else {
                mo48229a(a);
            }
        } catch (asbx e) {
            mo48232b(10589);
            this.f87062c.mo48223a(10589);
        }
    }
}

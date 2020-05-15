package p000;

import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubMessage;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: buhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhj extends ContextHubManager.Callback {

    /* renamed from: a */
    public final AtomicInteger f153849a = new AtomicInteger();

    /* renamed from: b */
    public final ThreadPoolExecutor f153850b;

    /* renamed from: c */
    public final ThreadPoolExecutor f153851c;

    /* renamed from: d */
    protected final ThreadPoolExecutor f153852d;

    /* renamed from: e */
    public final buhq f153853e = new buhq();

    /* renamed from: f */
    final buhw f153854f = new buhw();

    /* renamed from: g */
    public final int f153855g;

    /* renamed from: h */
    public final ContextHubManager f153856h;

    /* renamed from: i */
    final buhi f153857i;

    /* renamed from: j */
    public final String f153858j;

    /* renamed from: k */
    public final Object f153859k = new Object();

    /* renamed from: l */
    public volatile buhy f153860l;

    /* renamed from: m */
    public volatile buib f153861m;

    public buhj(int i, ContextHubManager contextHubManager, buhi buhi, String str) {
        if (i > 0) {
            this.f153855g = i;
            this.f153856h = contextHubManager;
            this.f153857i = buhi;
            this.f153858j = str;
            this.f153850b = new soc(1, 9);
            this.f153851c = new soc(1, 9);
            this.f153852d = new soc(1, 9);
            return;
        }
        throw new IllegalArgumentException("'maxFragmentLengthBytes' must be a non-zero positive number");
    }

    public final void onMessageReceipt(int i, int i2, ContextHubMessage contextHubMessage) {
        int msgType = contextHubMessage.getMsgType();
        byte[] data = contextHubMessage.getData();
        synchronized (this.f153853e) {
            this.f153853e.mo26010a(msgType, i2);
        }
        if (i2 == -1) {
            contextHubMessage.getVersion();
            this.f153852d.execute(new buhh(this, i, msgType, data));
        } else if (msgType != 1025) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Dropping message due to unknown messageType=");
            sb.append(msgType);
            sb.toString();
        } else if (data != null && data.length > 0) {
            this.f153852d.execute(new buhg(this, i, i2, data));
        }
    }
}

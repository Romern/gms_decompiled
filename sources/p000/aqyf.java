package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: aqyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqyf implements ascg, arhs {

    /* renamed from: a */
    public static final asco f87072a = ascp.m73787a("D2D", "BaseDirectTransferController");

    /* renamed from: b */
    public final ExecutorService f87073b = snp.m35702a(9);

    /* renamed from: c */
    public arhq f87074c;

    /* renamed from: d */
    public arhp f87075d = arhp.f87735a;

    /* renamed from: e */
    public boolean f87076e = false;

    /* renamed from: f */
    protected final Handler f87077f;

    /* renamed from: g */
    public arhh f87078g;

    /* renamed from: h */
    private final Executor f87079h;

    /* renamed from: i */
    private final bqfp f87080i;

    /* renamed from: j */
    private final bqfp f87081j = new aqyc(this);

    /* renamed from: k */
    private final Runnable f87082k = new aqyd(this);

    public aqyf(Handler handler) {
        this.f87077f = handler;
        this.f87079h = new sty(handler);
        this.f87080i = new aqya(this);
    }

    /* renamed from: a */
    static ResultReceiver m72244a(Bundle bundle, String str) {
        bundle.setClassLoader(ProxyResultReceiver.class.getClassLoader());
        return (ResultReceiver) bundle.getParcelable(str);
    }

    /* renamed from: d */
    private final bqgg m72245d(byte[] bArr) {
        arhh arhh;
        asck e = mo48258e();
        if (!this.f87076e || (arhh = this.f87078g) == null) {
            return e.mo49042a(bArr);
        }
        List<byte[]> a = arhh.mo48538a(bArr);
        f87072a.mo25409a("Split message of %d bytes into %d packets", Integer.valueOf(bArr.length), Integer.valueOf(a.size()));
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr2 : a) {
            arrayList.add(e.mo49042a(bArr2));
        }
        return bqga.m112774a((Iterable) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48244a(int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48247a(MessagePayload messagePayload);

    /* renamed from: b */
    public final void mo48250b() {
        this.f87074c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo48254c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48255c(int i) {
        this.f87076e = true;
        if (this.f87078g == null) {
            this.f87078g = new arhh(new aqye(this), i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo48257d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract asck mo48258e();

    /* renamed from: a */
    public void mo48242a() {
        mo48250b();
        this.f87076e = false;
        this.f87078g = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48251b(int i) {
        int i2;
        if (i == 10564) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        DeviceStatus deviceStatus = new DeviceStatus();
        deviceStatus.mo59090a(i);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59093a(i2);
        messagePayload.mo59098a(deviceStatus);
        mo48252b(messagePayload);
    }

    /* renamed from: c */
    public final void mo48256c(byte[] bArr) {
        boolean z;
        byte[] bArr2;
        arhq arhq = this.f87074c;
        if (arhq != null) {
            if (bArr.length != 0) {
                MessagePayload messagePayload = new MessagePayload();
                try {
                    messagePayload.mo59187e(bArr);
                    z = messagePayload.f107975b > 0;
                } catch (asbx e) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!arhq.f87740e && z && (arhq.f87737b.f87744d & 1) != 0) {
                f87072a.mo25416d("A bootstrap message was sent during the encryption phase. As unencrypted communications are supported, we are aborting the encryption process.", new Object[0]);
                mo48250b();
                mo48257d();
            } else {
                Future future = arhq.f87739d;
                arhp arhp = null;
                if (future != null) {
                    future.cancel(true);
                    arhq.f87739d = null;
                }
                try {
                    arhr arhr = arhq.f87737b;
                    if (arhr.f87745e >= 0) {
                        arhu arhu = arhr.f87746f;
                        if (arhu != null) {
                            if (arhu.f87753f != null) {
                                if (arhu.f87751d == 11) {
                                    if (Arrays.equals(bArr, arhu.f87749b)) {
                                        arhp = new arht(arhu.f87753f);
                                    } else {
                                        String arrays = Arrays.toString(arhu.f87749b);
                                        String arrays2 = Arrays.toString(bArr);
                                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 88 + String.valueOf(arrays2).length());
                                        sb.append("Unexpected message during final step of Ukey2HandshakeHandler. Expected: ");
                                        sb.append(arrays);
                                        sb.append(" but recieved: ");
                                        sb.append(arrays2);
                                        String sb2 = sb.toString();
                                        arhu.f87748a.mo25418e(sb2, new Object[0]);
                                        throw new SecurityException(sb2);
                                    }
                                }
                            }
                            if (arhu.f87752e.mo74497d() == 1) {
                                arhu.f87752e.mo74492a(bArr);
                                if (arhu.f87752e.mo74497d() == 1) {
                                    bArr2 = arhu.f87752e.mo74493a();
                                    if (arhu.f87752e.mo74497d() == 1) {
                                        arhu.f87750c.mo48249a(bArr2);
                                    }
                                } else {
                                    bArr2 = null;
                                }
                                arhu.f87752e.mo74494a(4);
                                arhu.f87752e.mo74495b();
                                arhu.f87753f = arhu.f87752e.mo74496c();
                                if (bArr2 != null) {
                                    arhu.f87750c.mo48249a(bArr2);
                                }
                                if (arhu.f87751d == 12) {
                                    arhu.f87750c.mo48249a(arhu.f87749b);
                                    arhp = new arht(arhu.f87753f);
                                }
                            }
                        } else {
                            throw new byrq("Unexpected message");
                        }
                    } else if (bArr.length == 1) {
                        int highestOneBit = Integer.highestOneBit(bArr[0] & arhr.f87744d);
                        arhr.f87745e = highestOneBit;
                        if (arhr.f87743c == 11) {
                            arhr.f87742b.mo48249a(new byte[]{(byte) highestOneBit});
                        }
                        int i = arhr.f87745e;
                        if (i == 1) {
                            arhr.f87741a.mo25409a("Negotiated no encryption", new Object[0]);
                            arhp = arhp.f87735a;
                        } else if (i == 8) {
                            arhr.f87741a.mo25409a("Negotiated and starting Ukey2 encryption", new Object[0]);
                            arhr.f87746f = new arhu(arhr.f87742b, arhr.f87743c);
                            arhu arhu2 = arhr.f87746f;
                            if (arhu2.f87751d == 11) {
                                arhu2.f87752e = byse.m125241a(bysc.P256_SHA512);
                                arhu2.f87750c.mo48249a(arhu2.f87752e.mo74493a());
                            } else {
                                arhu2.f87752e = byse.m125248b(bysc.P256_SHA512);
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(35);
                            sb3.append("Unknown encryption type ");
                            sb3.append(i);
                            throw new byrq(sb3.toString());
                        }
                    } else {
                        throw new byrq("Expected first encryption message to be one byte in length");
                    }
                } catch (byrq | bysb e2) {
                    arhq.f87740e = true;
                    bqfp bqfp = arhq.f87738c;
                    if (bqfp != null) {
                        bqfp.mo6481a(e2);
                    }
                }
                if (arhp != null) {
                    arhq.f87740e = true;
                    bqfp bqfp2 = arhq.f87738c;
                    if (bqfp2 != null) {
                        bqfp2.mo6480a(arhp);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        try {
            try {
                MessagePayload a = arqa.m73288a(this.f87075d.mo48553b(bArr));
                if (a == null) {
                    f87072a.mo25418e("MessagePayload is null", new Object[0]);
                    mo48244a(10555, "MessagePayload is null");
                    return;
                }
                if (cgqf.m146561b()) {
                    f87072a.mo25409a("Received %s", a.mo59103c());
                } else {
                    asco asco = f87072a;
                    String valueOf = String.valueOf(a);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb4.append("Received data! ");
                    sb4.append(valueOf);
                    asco.mo25409a(sb4.toString(), new Object[0]);
                }
                if (arhe.m72761a(a.f107976c)) {
                    int i2 = a.f107976c;
                    if (i2 == 2) {
                        mo48254c();
                    } else if (i2 == 1) {
                        mo48244a(10564, "Bootstrap canceled");
                    } else if (i2 != 3) {
                        asco asco2 = f87072a;
                        StringBuilder sb5 = new StringBuilder(45);
                        sb5.append("Unknown state from remote device: ");
                        sb5.append(i2);
                        asco2.mo25418e(sb5.toString(), new Object[0]);
                        mo48244a(10575, "Unknown remote device error");
                    } else {
                        mo48244a(10575, "Remote device error");
                    }
                } else {
                    mo48247a(a);
                }
            } catch (asbx e3) {
                mo48244a(10589, e3.toString());
            }
        } catch (SecurityException e4) {
            mo48244a(10587, e4.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48243a(int i) {
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59093a(i);
        mo48252b(messagePayload);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48245a(arhq arhq, boolean z) {
        this.f87074c = arhq;
        arhq.f87738c = this.f87081j;
        arhq.f87740e = false;
        arhr arhr = arhq.f87737b;
        if (arhr.f87743c == 12) {
            arhr.f87742b.mo48249a(new byte[]{arhr.f87744d});
        }
        if (z) {
            Runnable runnable = this.f87082k;
            long q = cgqs.f187523a.mo6606a().mo84331q();
            arhq.f87739d = arhq.f87736a.schedule(runnable, (long) ((int) q), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48252b(MessagePayload messagePayload) {
        if (cgqf.m146561b()) {
            f87072a.mo25412b("Sending %s", messagePayload.mo59103c());
        }
        mo48249a(messagePayload.mo59188g());
    }

    /* renamed from: b */
    public void mo48253b(byte[] bArr) {
        this.f87077f.post(new aqyb(this, bArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48246a(bqfp bqfp, MessagePayload... messagePayloadArr) {
        ArrayList arrayList = new ArrayList();
        int length = messagePayloadArr.length;
        int i = 0;
        while (i < length) {
            MessagePayload messagePayload = messagePayloadArr[i];
            if (cgqf.m146561b()) {
                f87072a.mo25412b("Sending %s", messagePayload.mo59103c());
            }
            try {
                arrayList.add(m72245d(this.f87075d.mo48552a(messagePayload.mo59188g())));
                i++;
            } catch (SecurityException e) {
                f87072a.mo25417e("Error encrypting MessagePayload.", e, new Object[0]);
                mo48244a(10588, "Error encrypting MessagePayload.");
                return;
            }
        }
        bqga.m112781a(bqga.m112774a((Iterable) arrayList), bqfp, this.f87079h);
    }

    /* renamed from: a */
    public final void mo48248a(String str) {
        f87072a.mo25409a("pipe read error %s", str);
        String valueOf = String.valueOf(str);
        mo48244a(10576, valueOf.length() == 0 ? new String("Error thrown in the reading pipe: ") : "Error thrown in the reading pipe: ".concat(valueOf));
    }

    /* renamed from: a */
    public void mo48249a(byte[] bArr) {
        try {
            bqga.m112781a(m72245d(this.f87075d.mo48552a(bArr)), this.f87080i, this.f87079h);
        } catch (SecurityException e) {
            f87072a.mo25417e("Error encrypting MessagePayload.", e, new Object[0]);
            mo48244a(10588, "Error encrypting MessagePayload.");
        }
    }
}

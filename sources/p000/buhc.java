package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppInstanceInfo;
import android.hardware.location.NanoAppState;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: buhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhc extends buha implements bugo, bugr {

    /* renamed from: a */
    public final long f153823a;

    /* renamed from: b */
    public final int f153824b;

    /* renamed from: c */
    public final ContextHubManager f153825c;

    /* renamed from: d */
    public final bugn f153826d;

    /* renamed from: e */
    public final Object f153827e = new Object();

    /* renamed from: f */
    public volatile boolean f153828f;

    /* renamed from: g */
    public volatile NanoAppInstanceInfo f153829g;

    /* renamed from: h */
    private final bgbq f153830h;

    public buhc(long j, int i, ContextHubManager contextHubManager, bugn bugn, bgbq bgbq, Handler handler) {
        super(handler);
        if (contextHubManager != null) {
            this.f153823a = j;
            this.f153824b = i;
            this.f153825c = contextHubManager;
            this.f153826d = bugn;
            this.f153830h = bgbq;
            return;
        }
        throw new IllegalArgumentException("'contextHubManager' cannot be null.");
    }

    /* renamed from: a */
    public final long mo72639a() {
        return this.f153823a;
    }

    /* renamed from: b */
    public final int mo72644b() {
        return this.f153824b;
    }

    /* renamed from: c */
    public final int mo72647c() {
        Integer num;
        buhb buhb = (buhb) this.f153826d;
        int i = -1;
        if (buhb.f153816n) {
            buhm buhm = buhb.f153812j;
            ContextHubInfo contextHubInfo = buhb.f153808f;
            bmxy.m108581a(contextHubInfo);
            bmxy.m108581a(this);
            List b = buhm.mo72679b(contextHubInfo);
            Integer num2 = null;
            if (b != null) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NanoAppState nanoAppState = (NanoAppState) it.next();
                    if (nanoAppState.getNanoAppId() == this.f153823a) {
                        num2 = Integer.valueOf((int) nanoAppState.getNanoAppVersion());
                        break;
                    }
                }
                if (num2 == null) {
                    String hexString = Long.toHexString(this.f153823a);
                    int id = contextHubInfo.getId();
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 47);
                    sb.append("Nanoapp (0x");
                    sb.append(hexString);
                    sb.append(") not loaded on hub (id=");
                    sb.append(id);
                    sb.append(")");
                    sb.toString();
                }
            }
            if (num2 == null) {
                String valueOf = String.valueOf(Long.toHexString(this.f153823a));
                if (valueOf.length() == 0) {
                    new String("Cannot fetch version for AppId=0x");
                } else {
                    "Cannot fetch version for AppId=0x".concat(valueOf);
                }
            }
            if (num2 != null) {
                i = num2.intValue();
            }
            num = Integer.valueOf(i);
        } else {
            if (!this.f153828f) {
                synchronized (this.f153827e) {
                    if (!this.f153828f) {
                        this.f153829g = this.f153825c.getNanoAppInstanceInfo(this.f153824b);
                        this.f153828f = true;
                    }
                }
            }
            NanoAppInstanceInfo nanoAppInstanceInfo = this.f153829g;
            if (nanoAppInstanceInfo == null) {
                Locale locale = Locale.US;
                Object[] objArr = {Long.valueOf(this.f153823a), Integer.valueOf(this.f153824b)};
                num = -1;
            } else {
                num = Integer.valueOf(nanoAppInstanceInfo.getAppVersion());
            }
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final bugu mo72640a(int i, int i2, bxxc bxxc) {
        return mo72641a(i, i2, bxxc != null ? bxxc.serializeToBytes() : null);
    }

    /* renamed from: b */
    public final void mo72645b(bugo bugo) {
        mo72654d(bugo);
    }

    /* renamed from: a */
    public final bugu mo72641a(int i, int i2, byte[] bArr) {
        byte[] bArr2;
        bgbq bgbq = this.f153830h;
        if (bgbq != null && cezb.m138453b()) {
            bgbq.mo62621a(this, i, 2);
        }
        buhb buhb = (buhb) this.f153826d;
        if (buhb.f153816n) {
            buhm buhm = buhb.f153812j;
            ContextHubInfo contextHubInfo = buhb.f153808f;
            bmxy.m108581a(contextHubInfo);
            bmxy.m108581a(this);
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = new byte[0];
            }
            ContextHubClient contextHubClient = (ContextHubClient) buhm.f153869c.get(Integer.valueOf(contextHubInfo.getId()));
            if (contextHubClient != null) {
                buhz buhz = new buhz(contextHubClient, contextHubInfo, this, buhm.f153871e.getAndIncrement(), i, i2, bArr2);
                buhm.f153870d.execute(buhz);
                return buhz;
            }
            String valueOf = String.valueOf(contextHubInfo);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid hub: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        buhj buhj = buhb.f153811i;
        int i3 = buhb.f153809g;
        int i4 = this.f153824b;
        if (bArr != null && bArr.length > 2044) {
            throw new IllegalArgumentException("Invalid message length, it must be in the range (0,2044 ]");
        }
        buhl buhl = new buhl(buhj, buhj.f153858j, i3, i4, i, i2, bArr);
        buhj.f153850b.execute(buhl);
        return buhl;
    }

    /* renamed from: b */
    public final void mo72646b(bugo bugo, Handler handler) {
        mo72651a(32, bugo, handler);
    }

    public buhc(long j, ContextHubManager contextHubManager, bugn bugn, bgbq bgbq, Handler handler) {
        super(handler);
        if (contextHubManager == null) {
            throw new IllegalArgumentException("'contextHubManager' cannot be null.");
        } else if (bugn != null) {
            this.f153823a = j;
            this.f153824b = -1;
            this.f153825c = contextHubManager;
            this.f153826d = bugn;
            this.f153830h = bgbq;
        } else {
            throw new IllegalArgumentException("'contextHub' cannot be null.");
        }
    }

    public buhc(NanoAppInstanceInfo nanoAppInstanceInfo, ContextHubManager contextHubManager, bugn bugn, bgbq bgbq, Handler handler) {
        super(handler);
        if (contextHubManager != null) {
            long appId = nanoAppInstanceInfo.getAppId();
            int handle = nanoAppInstanceInfo.getHandle();
            this.f153823a = appId;
            this.f153824b = handle;
            this.f153825c = contextHubManager;
            this.f153826d = bugn;
            this.f153829g = nanoAppInstanceInfo;
            this.f153830h = bgbq;
            this.f153828f = true;
            return;
        }
        throw new IllegalArgumentException("'contextHubManager' cannot be null.");
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        mo72649a(buhd.f153831a, bugn, bugr, buhd);
    }

    /* renamed from: a */
    public final void mo72642a(bugo bugo) {
        mo72652c(bugo);
    }

    /* renamed from: a */
    public final void mo72632a(bugo bugo, Handler handler) {
        mo72653c(bugo, handler);
    }
}

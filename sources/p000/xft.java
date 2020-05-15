package p000;

import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* renamed from: xft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xft {

    /* renamed from: a */
    private static final Logger f52143a = new Logger(new String[]{"SecurityKey"}, (short[]) null);

    /* renamed from: d */
    public static final ByteString f52144d = ByteString.m123261a(new byte[]{100, 70, 71, 47, -33, 110, -19, 123, -13, -61, 55, 32, -14, 54, 103, 108, 54, -31, -76, 94, -66, 4, -123, -37, -119, -93, -51, -3, -46, 75, -42, -97});

    /* renamed from: e */
    static final ByteString f52145e;

    /* renamed from: f */
    protected final xjb f52146f;

    /* renamed from: g */
    protected final xws f52147g;

    /* renamed from: h */
    protected final xwj f52148h;

    static {
        byte[] bArr = new byte[32];
        new Random().nextBytes(bArr);
        f52145e = ByteString.m123261a(bArr);
    }

    protected xft(xwj xwj, xjb xjb, xws xws) {
        bmxy.m108581a(xjb);
        this.f52146f = xjb;
        bmxy.m108581a(xws);
        this.f52147g = xws;
        this.f52148h = xwj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29692a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ProtocolVersion mo29693a(ByteString bxtx);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RegisterResponseData mo29705a(xlg xlg, xle xle, ProtocolVersion protocolVersion, bmxv bmxv) {
        return mo29710b(xlg, xle, protocolVersion, bmxv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RegisterResponseData mo29709b() {
        f52143a.mo25414c("Security key already registered", new Object[0]);
        this.f52147g.mo30184a(this.f52148h, new Exception("Security key already registered"));
        throw xfv.m42834a(27264);
    }

    @Deprecated
    /* renamed from: a */
    public final ResponseData mo29706a(xfo xfo) {
        short s;
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        if (xfo.f52132d - 1 != 0) {
            return mo29708a((xfp) xfo);
        }
        xfm xfm = (xfm) xfo;
        ByteString a = xfm.mo29694a();
        ProtocolVersion a2 = mo29693a(a);
        ArrayList arrayList = new ArrayList(xfm.f52130b.size());
        List list = xfm.f52130b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new xfr(((RegisteredKey) list.get(i)).f31934a, a, f52145e, bmxv.m108566b("")));
        }
        try {
            mo29711b(a2, arrayList);
            s = -28672;
        } catch (xfv e) {
            f52143a.mo25414c("Received status 0x%x when signing.", Short.valueOf(e.f52149a));
            s = e.f52149a;
        }
        if (s == -28672 || s == 27013) {
            return mo29709b();
        }
        if (s == 27264) {
            bmxv f = bnjd.m109599f(xfm.f52129a, new xfs(a2));
            if (f.mo66813a()) {
                xlg xlg = new xlg(mo29692a());
                ByteString bxtx = ((xfq) f.mo66814b()).f52136c;
                boolean equals = f52144d.equals(a);
                return mo29705a(xlg, xlg.mo29904a(a.getKey(), bxtx.getKey(), equals), a2, ((xfq) f.mo66814b()).f52137d);
            }
            f52143a.mo25416d("No register request matching security key version %s.", a2);
            xfv a3 = xfv.m42834a(27264);
            this.f52147g.mo30184a(this.f52148h, a3);
            throw a3;
        }
        throw xfv.m42834a(s);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r1.write(r8.mo29900a());
        r7 = r1.toByteArray();
        p000.xft.f52143a.mo25414c("Received enrollment data: %s.", p000.boan.f132472f.mo68794a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (r9 == com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r10.mo66813a() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0078, code lost:
        r10 = new com.google.android.gms.fido.u2f.api.common.RegisterResponseData(r7, r9, (java.lang.String) r10.mo66814b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        p000.xft.f52143a.mo25417e("Failed to close the output.", r7, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        throw p000.xfv.m42834a(27264);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r8 = new com.google.android.gms.fido.u2f.api.common.RegisterResponseData(r7, com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        p000.xft.f52143a.mo25417e("Failed to close the output.", r7, new java.lang.Object[0]);
     */
    /* renamed from: b */
    public final RegisterResponseData mo29710b(xlg xlg, xle xle, ProtocolVersion protocolVersion, bmxv bmxv) {
        RegisterResponseData registerResponseData;
        RegisterResponseData registerResponseData2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                this.f52147g.mo30203a(this.f52148h, xle);
                xlf xlf = (xlf) this.f52146f.mo29827a(xle).get();
                this.f52147g.mo30204a(this.f52148h, xlf);
                short s = xlf.f52655a;
                if (s == -28672) {
                    break;
                } else if ((s & -256) == 24832) {
                    f52143a.mo25414c("Got incomplete response, asking for the next response", new Object[0]);
                    byteArrayOutputStream.write(xlf.mo29900a());
                    xle = xle.m43131a((byte) 0, (byte) -64, xlg.f52660d);
                    xle.mo29897b(xlg.f52659c);
                } else {
                    throw xfv.m42834a(s);
                }
            } catch (IOException | InterruptedException | ExecutionException e) {
                xfv a = xfv.m42835a(28416, e);
                this.f52147g.mo30184a(this.f52148h, a);
                throw a;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    f52143a.mo25417e("Failed to close the output.", e2, new Object[0]);
                }
                throw th;
            }
        }
        return registerResponseData;
        return registerResponseData2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SignResponseData mo29711b(ProtocolVersion protocolVersion, List list) {
        xle xle;
        for (int i = 0; i < list.size(); i++) {
            xfr xfr = (xfr) list.get(i);
            KeyHandle keyHandle = xfr.f52138a;
            ProtocolVersion protocolVersion2 = keyHandle.f31912c;
            if (protocolVersion2.equals(ProtocolVersion.UNKNOWN) || protocolVersion.equals(ProtocolVersion.UNKNOWN) || protocolVersion2.equals(protocolVersion)) {
                try {
                    byte[] k = xfr.f52140c.getKey();
                    if (protocolVersion.ordinal() != 1) {
                        xlg xlg = new xlg(mo29692a());
                        byte[] k2 = xfr.f52139b.getKey();
                        byte[] bArr = keyHandle.f31911b;
                        xle = xle.m43131a((byte) 0, (byte) 2, xlg.f52660d);
                        xle.mo29894a((byte) 3);
                        xle.mo29895a(k);
                        xle.mo29895a(k2);
                        int length = bArr.length;
                        if (xle.f52651f == null) {
                            xle.f52651f = boav.m111024b();
                        }
                        xle.f52650e = true;
                        xle.f52651f.writeByte(length);
                        xle.mo29895a(bArr);
                        xle.mo29897b(xlg.f52659c);
                    } else {
                        xlg xlg2 = new xlg(mo29692a());
                        byte[] k3 = xfr.f52139b.getKey();
                        byte[] bArr2 = keyHandle.f31911b;
                        xle = xle.m43131a((byte) 0, (byte) 2, xlg2.f52660d);
                        xle.mo29894a((byte) 3);
                        xle.mo29895a(k);
                        xle.mo29895a(k3);
                        xle.mo29895a(bArr2);
                        xle.mo29897b(xlg2.f52659c);
                    }
                    this.f52147g.mo30203a(this.f52148h, xle);
                    xlf xlf = (xlf) this.f52146f.mo29827a(xle).get();
                    this.f52147g.mo30204a(this.f52148h, xlf);
                    short s = xlf.f52655a;
                    if (s == -28672) {
                        byte[] a = xlf.mo29900a();
                        f52143a.mo25414c("Received response data: %s.", boan.f132472f.mo68794a(a));
                        if (xfr.f52141d.mo66813a()) {
                            return new SignResponseData(keyHandle.f31911b, (String) xfr.f52141d.mo66814b(), a, xfr.f52139b.getKey());
                        }
                        throw xfv.m42834a(27264);
                    } else if (s == 26368) {
                        f52143a.mo25416d("Wrong len error at key handle %d", Integer.valueOf(i));
                    } else if (s == 27264) {
                        f52143a.mo25416d("Wrong data error at key handle %d", Integer.valueOf(i));
                    } else {
                        throw xfv.m42834a(s);
                    }
                } catch (InterruptedException | ExecutionException e) {
                    f52143a.mo25417e("Signing failed!", e, new Object[0]);
                    xfv a2 = xfv.m42834a(28416);
                    this.f52147g.mo30184a(this.f52148h, a2);
                    throw a2;
                }
            } else {
                f52143a.mo25414c(String.format(Locale.US, "Ignoring key handle %d with version %s, mismatch with security key version %s", Integer.valueOf(i), keyHandle.f31912c, protocolVersion), new Object[0]);
            }
        }
        throw xfv.m42834a(27264);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SignResponseData mo29707a(ProtocolVersion protocolVersion, List list) {
        return mo29711b(protocolVersion, list);
    }

    /* renamed from: a */
    public final SignResponseData mo29708a(xfp xfp) {
        return mo29707a(mo29693a(xfp.mo29694a()), xfp.f52133a);
    }
}

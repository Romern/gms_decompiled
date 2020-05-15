package p000;

import android.util.MutableBoolean;
import android.util.Pair;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class xec {

    /* renamed from: f */
    public static final sek f52053f = new sek(new String[]{"RequestHandler"}, (short[]) null);

    /* renamed from: c */
    public final xwj f52054c;

    /* renamed from: d */
    public final xdx f52055d;

    /* renamed from: e */
    public final xeh f52056e;

    public xec(xwj xwj, xeh xeh, xdx xdx) {
        this.f52054c = xwj;
        this.f52056e = xeh;
        this.f52055d = xdx;
    }

    /* renamed from: a */
    public static final wzu m42753a(xkb xkb) {
        xka xka = xka.ANDROID_KEYSTORE;
        int ordinal = xkb.mo29856b().ordinal();
        if (ordinal == 0) {
            return wzu.KEY_TYPE_KEYSTORE;
        }
        if (ordinal == 1) {
            return wzu.KEY_TYPE_SOFTWARE;
        }
        if (ordinal == 2) {
            return wzu.KEY_TYPE_STRONGBOX;
        }
        String valueOf = String.valueOf(xkb.mo29856b());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Invalid key type: ");
        sb.append(valueOf);
        throw new xma(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016f, code lost:
        r5.mo29677a(new p000.xma("Database error", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017b, code lost:
        r5.mo29677a(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016e A[ExcHandler: xdk (r0v6 'e' xdk A[CUSTOM_DECLARE]), Splitter:B:5:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019a  */
    /* renamed from: a */
    public final Pair mo29679a(String str, xkb xkb, byte[] bArr, xwn xwn) {
        xjx xjx;
        String str2 = str;
        xkb xkb2 = xkb;
        byte[] bArr2 = bArr;
        xwn xwn2 = xwn;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        xeb xeb = r6;
        MutableBoolean mutableBoolean2 = mutableBoolean;
        xeb xeb2 = new xeb(this, mutableBoolean, xwn, xkb, str, countDownLatch, atomicReference);
        xdx xdx = this.f52055d;
        xwj xwj = this.f52054c;
        xeh xeh = this.f52056e;
        sek sek = xdx.f52034d;
        String valueOf = String.valueOf(str);
        sek.mo25412b(valueOf.length() == 0 ? new String("Sign with appId ") : "Sign with appId ".concat(valueOf), new Object[0]);
        bmxy.m108582a(str2, "appId cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "appId cannot be empty");
        bmxy.m108582a(xkb2, "Key cannot be null");
        bmxy.m108582a(bArr2, "data cannot be null");
        xeb xeb3 = xeb;
        bmxy.m108582a(xeb3, "signatureCallback cannot be null");
        bmxy.m108582a(xeh, "userVerifier cannot be null");
        bmxy.m108582a(xwn2, "eventLogger cannot be null");
        try {
            Signature signature = null;
            byte[] bArr3 = null;
            if (!xdx.mo29674a(xkb2, str2)) {
                try {
                    if (xkb.mo29857c().length != 32) {
                        xjx = xjz.m43074a(str, xkb);
                    } else {
                        xjx = xjy.m43070a(xkb);
                    }
                    if (xjx.getClass() == xjz.class) {
                        bArr3 = xdx.f52035a.mo29657b(xjx);
                    }
                    if (!xdx.f52037c.containsKey(xjx.mo29847a())) {
                        byte b = xjx.mo29847a().f52489d;
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("Cannot sign with unsupported credential type: ");
                        sb.append((int) b);
                        xeb3.mo29677a(new xma(sb.toString()));
                    }
                    PublicKey b2 = ((xdm) xdx.f52037c.get(xjx.mo29847a())).mo29652b(xjx, bArr3);
                    if (xjx.getClass() == xjz.class) {
                        bmxy.m108581a(str);
                        bmxy.m108581a(b2);
                        if (!MessageDigest.isEqual(xkb2.f52490a, xkb.m43079a(xkb.mo29856b().f52489d, xkb.mo29855a(), str2, b2))) {
                            xeb3.mo29677a(new xma("Invalid keyHandle"));
                        }
                    }
                    xeh.mo29666a(xwj, bmvz.f131120a, new xds(xdx, xeb3, xjx, bArr2), xwn2);
                } catch (xdk e) {
                    xeb3.mo29677a(new xma("Credential not found", e));
                } catch (xma e2) {
                    xeb3.mo29677a(e2);
                }
                countDownLatch.await();
                Pair pair = (Pair) atomicReference.get();
                if (!mutableBoolean2.value) {
                    throw new xma("User verification failed");
                } else if (pair.first != null) {
                    return pair;
                } else {
                    throw new xma("Signature is null");
                }
            } else {
                xjy a = xjy.m43070a(xkb);
                if (xde.m42698d(a.mo29848b())) {
                    signature = ((xdm) xdx.f52037c.get(xka.ANDROID_KEYSTORE)).mo29653c(a, null);
                }
                xeh.mo29666a(xwj, bmxv.m108567c(signature), new xdv(xeb3, signature, xkb2, bArr2), xwn2);
                countDownLatch.await();
                Pair pair2 = (Pair) atomicReference.get();
                if (!mutableBoolean2.value) {
                }
            }
        } catch (adbe e3) {
            xeb3.mo29677a(new xma(e3));
        } catch (xma e4) {
            xeb3.mo29677a(e4);
        } catch (xdk e5) {
        }
    }
}

package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aagw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagw extends aahl {

    /* renamed from: a */
    private static final long f28097a = TimeUnit.SECONDS.toMillis(300);

    /* renamed from: c */
    private static final byte[] f28098c = new byte[0];

    /* renamed from: d */
    private RequestQueue f28099d = null;

    /* renamed from: a */
    private final aaik m21244a(aaij aaij) {
        RequestFuture newFuture = RequestFuture.newFuture();
        sia sia = new sia(1, ceax.f182191a.mo6606a().mo78709d(), aaij.mo73642k(), aaik.f28187d, newFuture, newFuture, null, null, false, new HashMap(), 12288, -1);
        if (this.f28099d == null) {
            this.f28099d = rpr.m34216b().getRequestQueue();
        }
        this.f28099d.add(sia);
        try {
            return (aaik) newFuture.get(f28097a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            new Object[1][0] = e.toString();
            return null;
        }
    }

    /* renamed from: a */
    private static final boolean m21245a(aaik aaik) {
        return aaik != null && !aaik.f28191c.mo73779j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x018d  */
    /* renamed from: a */
    public final int mo16868a(Context context, aaip aaip) {
        String str;
        byte[] bArr;
        HashMap hashMap;
        aaik aaik;
        Status status = Status.f30107a;
        bxvd da = aaij.f28182d.mo74144da();
        if ((aaip.f28211a & 2) != 0) {
            bxtx bxtx = aaip.f28213c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaij aaij = (aaij) da.f164949b;
            bxtx.getClass();
            aaij.f28184a |= 1;
            aaij.f28185b = bxtx;
        }
        aagv aagv = new aagv();
        aaij aaij2 = (aaij) da.f164949b;
        aago aago = null;
        if ((aaij2.f28184a & 1) != 0) {
            byte[] k = aaij2.f28185b.mo73780k();
            MessageDigest b = spn.m35868b("SHA-256");
            if (b != null) {
                String encodeToString = Base64.encodeToString(b.digest(k), 2);
                hashMap = new HashMap();
                hashMap.put("AdAttestationContentBinding", encodeToString);
            } else {
                hashMap = null;
            }
            if (hashMap == null) {
                status = Status.f30109c;
                bArr = null;
                str = null;
            } else {
                String a = vvp.m41461a(context, "ad_attest", hashMap);
                if (TextUtils.isEmpty(a)) {
                    status = Status.f30109c;
                    bArr = null;
                    str = null;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aaij aaij3 = (aaij) da.f164949b;
                    a.getClass();
                    aaij3.f28184a |= 2;
                    aaij3.f28186c = a;
                    aaij aaij4 = (aaij) da.mo74062i();
                    int i = 0;
                    while (true) {
                        if (i >= 5) {
                            aaik = null;
                            break;
                        }
                        aaik = m21244a(aaij4);
                        if (m21245a(aaik) || aaik == null || !aaik.f28189a) {
                            break;
                        }
                        if (i < 4) {
                            try {
                                Thread.sleep(10000);
                            } catch (InterruptedException e) {
                            }
                        }
                        i++;
                    }
                    if (m21245a(aaik)) {
                        bArr = aaik.f28191c.mo73780k();
                        str = aaik.f28190b;
                    } else {
                        aagv.f28096c = f28098c;
                        status = Status.f30109c;
                        bArr = null;
                        str = null;
                    }
                }
            }
        } else {
            status = Status.f30109c;
            bArr = null;
            str = null;
        }
        aagv.f28094a = status;
        aagv.f28096c = bArr;
        aagv.f28095b = str;
        bxvd da2 = aail.f28193f.mo74144da();
        long longValue = aagu.m21241a().longValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aail aail = (aail) da2.f164949b;
        int i2 = aail.f28195a | 1;
        aail.f28195a = i2;
        aail.f28196b = longValue;
        aail.f28197c = 2;
        aail.f28195a = i2 | 2;
        if (!aagv.f28094a.equals(Status.f30107a)) {
            bxtx a2 = bxtx.m123261a(new byte[]{122});
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aail aail2 = (aail) da2.f164949b;
            a2.getClass();
            aail2.f28195a |= 8;
            aail2.f28199e = a2;
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aail aail3 = (aail) da2.f164949b;
            aail3.f28197c = 1;
            aail3.f28195a |= 2;
            bxtx a3 = bxtx.m123261a(aagv.f28096c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aail aail4 = (aail) da2.f164949b;
            a3.getClass();
            int i3 = aail4.f28195a | 8;
            aail4.f28195a = i3;
            aail4.f28199e = a3;
            String str2 = aagv.f28095b;
            str2.getClass();
            aail4.f28195a = i3 | 4;
            aail4.f28198d = str2;
        }
        aail aail5 = (aail) da2.mo74062i();
        try {
            aago = aago.m21234a(context);
            try {
                aago.f28088b.mo16840a(aail5);
            } catch (aagp e2) {
            } catch (Throwable th) {
                th = th;
                if (aago != null) {
                    aago.mo16867a();
                }
                throw th;
            }
            if (aago != null) {
                aago.mo16867a();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            if (aago != null) {
            }
            throw th;
        }
    }
}

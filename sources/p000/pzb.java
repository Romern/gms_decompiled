package p000;

import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.cast.CastDevice;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: pzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzb extends qal {

    /* renamed from: a */
    final /* synthetic */ pzd f40704a;

    /* renamed from: b */
    private final String f40705b;

    /* renamed from: h */
    private pky f40706h;

    /* renamed from: i */
    private CastDevice f40707i;

    /* renamed from: j */
    private final boolean f40708j;

    /* renamed from: k */
    private int f40709k;

    /* renamed from: l */
    private pit f40710l;

    /* renamed from: m */
    private final int f40711m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pzb(pzd pzd, String str, int i, CastDevice castDevice, pky pky, pit pit, boolean z, String str2) {
        super(pzd.f40724i, String.format("%s_%s", str2, "session"), pzd.f40717b, pzd.f40721f, pzd.f40722g);
        this.f40704a = pzd;
        this.f40705b = str;
        this.f40711m = i;
        this.f40707i = castDevice;
        this.f40706h = pky;
        this.f40710l = pit;
        this.f40708j = z;
    }

    /* renamed from: b */
    private final void m31701b() {
        Intent intent = new Intent("com.google.android.gms.cast.session.ACTION_CAST_NEARBY_ABORTED");
        intent.setPackage("com.google.android.gms");
        pzd pzd = this.f40704a;
        String str = pzd.f40716a;
        pzd.f40724i.sendBroadcast(intent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
    /* renamed from: a */
    public final bxxc mo23073a() {
        bltw bltw;
        bxvd da;
        byte[] a;
        String str;
        pzd pzd = this.f40704a;
        String str2 = pzd.f40716a;
        String str3 = null;
        if (qay.m31790c(pzd.f40724i)) {
            bltw = qay.m31778a(this.f40704a.f40723h.getScanResults(), this.f40704a.f40727l);
        } else {
            bltw = null;
        }
        if (bltw != null) {
            da = bluc.f127779g.mo74144da();
            String str4 = this.f40705b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bluc bluc = (bluc) da.f164949b;
            str4.getClass();
            int i = bluc.f127781a | 2;
            bluc.f127781a = i;
            bluc.f127783c = str4;
            int i2 = this.f40711m;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bluc.f127784d = i3;
                int i4 = i | 4;
                bluc.f127781a = i4;
                bltw.getClass();
                bluc.f127782b = bltw;
                bluc.f127781a = i4 | 1;
                String str5 = this.f40705b;
                if (!pzd.f40719d) {
                    this.f40798d.mo23861b("Droidguard disabled");
                } else {
                    try {
                        MessageDigest b = spn.m35868b("SHA-1");
                        if (b != null) {
                            StringBuilder sb = new StringBuilder();
                            for (blub blub : bltw.f127755a) {
                                sb.append(String.format(Locale.ROOT, "%s:%d:%d|", blub.f127776b, Integer.valueOf(blub.f127777c), Integer.valueOf(blub.f127778d)));
                            }
                            str = Base64.encodeToString(b.digest(sb.toString().getBytes("UTF-8")), 1);
                        } else {
                            this.f40798d.mo23677d("Unable to get instance of sha1.", new Object[0]);
                            str = null;
                        }
                    } catch (UnsupportedEncodingException e) {
                        try {
                            this.f40798d.mo23676c(e, "can't base64 encode environment scan digest.", new Object[0]);
                            str = null;
                        } catch (RuntimeException e2) {
                            e = e2;
                        }
                    }
                    if (str != null) {
                        if (!str.isEmpty()) {
                            this.f40798d.mo23670a("wifi scan digest = %s", str);
                            HashMap hashMap = new HashMap();
                            hashMap.put("PIN", str5);
                            hashMap.put("EnvironmentScan", str);
                            str3 = vvp.m41461a(this.f40704a.f40724i, "opencast_createsession", hashMap);
                            try {
                                this.f40798d.mo23856a("dr blob length = %d", Integer.valueOf(str3.length()));
                            } catch (RuntimeException e3) {
                                e = e3;
                            }
                        }
                    }
                    this.f40798d.mo23675c("Unable to create hash of the environmentScan", new Object[0]);
                }
                if (str3 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bluc bluc2 = (bluc) da.f164949b;
                    str3.getClass();
                    bluc2.f127781a |= 16;
                    bluc2.f127786f = str3;
                }
                a = pij.m30443a(this.f40704a.f40724i).mo23174a();
                if (a != null) {
                    ByteString a2 = ByteString.m123261a(a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bluc bluc3 = (bluc) da.f164949b;
                    a2.getClass();
                    bluc3.f127781a |= 8;
                    bluc3.f127785e = a2;
                }
                return da.mo74062i();
            }
            throw null;
        }
        this.f40798d.mo23861b("No CastNearby device found.");
        return null;
        this.f40798d.mo23675c("Droidguard runtime exception: ", e);
        if (str3 != null) {
        }
        a = pij.m30443a(this.f40704a.f40724i).mo23174a();
        if (a != null) {
        }
        return da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23074a(int i) {
        this.f40798d.mo23677d("Failed to create session %d", Integer.valueOf(i));
        this.f40798d.mo23857a("Testing for retry, mAllowPairingDialogOnFailure=%b, mConnectionAttemptCount=%d", Boolean.valueOf(this.f40708j), Integer.valueOf(this.f40709k));
        if (this.f40708j) {
            int i2 = this.f40709k;
            this.f40709k = i2 + 1;
            if (i2 < pzd.f40718c) {
                this.f40798d.mo23675c("retrying", new Object[0]);
                this.f40704a.mo23815a(this.f40707i, this.f40706h, this.f40710l, ((qal) this).f40797c);
                this.f40707i = null;
                this.f40706h = null;
                this.f40710l = null;
                return;
            }
        }
        this.f40710l.mo23223a(2503);
        m31701b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23075a(byte[] bArr) {
        try {
            this.f40798d.mo23861b("onSuccessResponse");
            blud blud = (blud) GeneratedMessageLite.m124016a(blud.f127787c, bArr, bxus.m123744c());
            if ((blud.f127789a & 1) != 0) {
                bltz bltz = blud.f127790b;
                if (bltz == null) {
                    bltz = bltz.f127762e;
                }
                this.f40798d.mo23673b("response.Session server=%s,port=%d,token=%s", bltz.f127765b, Integer.valueOf(bltz.f127766c), bltz.f127764a);
                this.f40706h.mo23304a(bltz.f127764a, bltz.f127767d.getKey());
                InetAddress byName = InetAddress.getByName(bltz.f127765b);
                if (byName == null) {
                    this.f40798d.mo23677d("Unable to get the address for %s", bltz.f127765b);
                    this.f40710l.mo23223a(2502);
                    m31701b();
                    return;
                }
                pit pit = this.f40710l;
                String str = this.f40705b;
                pit.f39253a.f39316e.mo23861b("Successful cast nearby session initiated");
                pit.f39253a.f39275D = str;
                this.f40798d.mo23861b("connecting socket now");
                ((pkk) this.f40706h).mo23303a(this.f40707i.f29716d, byName, bltz.f127766c);
                return;
            }
            this.f40798d.mo23677d("response does not contain a session token.", new Object[0]);
            this.f40710l.mo23223a(2502);
            m31701b();
        } catch (IOException e) {
            this.f40798d.mo23677d("Unable to parse CreateSession response data", new Object[0]);
            this.f40710l.mo23223a(2502);
            m31701b();
        }
    }
}

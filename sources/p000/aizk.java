package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;

/* renamed from: aizk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aizk implements ajgo {

    /* renamed from: a */
    private final aiyy f70148a;

    /* renamed from: b */
    private final bzbu f70149b;

    /* renamed from: c */
    private final ajat f70150c;

    /* renamed from: d */
    private final Context f70151d;

    /* renamed from: e */
    private ahfv f70152e;

    /* renamed from: f */
    private boolean f70153f;

    public aizk(Context context, aiyy aiyy, bzbu bzbu) {
        this.f70151d = context;
        this.f70150c = (ajat) ahgz.m55754a(context, ajat.class);
        boolean z = true;
        if (!(bzbu == bzbu.AUDIO_AUDIBLE_DTMF || bzbu == bzbu.AUDIO_ULTRASOUND_PASSBAND)) {
            z = false;
        }
        sdo.m34974b(z);
        this.f70148a = aiyy;
        this.f70149b = bzbu;
    }

    /* renamed from: a */
    public final boolean mo38214a() {
        bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = this.f70149b.ordinal();
        if (ordinal == 1) {
            return this.f70150c.mo38421g();
        }
        if (ordinal != 8) {
            return false;
        }
        return this.f70150c.mo38423i();
    }

    /* renamed from: b */
    public final void mo38216b() {
        if (this.f70153f) {
            srn srn = ahfq.f67120a;
            ahfv ahfv = this.f70152e;
            if (ahfv != null) {
                ahfv.mo36407a();
            }
            ajgs.m58685a(this.f70149b);
            aizj a = this.f70148a.mo38323a("AudioTokenBeacon: ");
            String str = a.f70135a;
            a.f70141g = null;
            int i = a.f70137c;
            if (i == 1) {
                a.f70137c = 3;
                i = 3;
            } else if (i == 2) {
                a.f70137c = 0;
                i = 0;
            }
            a.mo38330a(i);
            this.f70148a.mo38324b("AudioTokenBeacon: ");
            this.f70152e = null;
            this.f70153f = false;
        }
    }

    public final String toString() {
        return String.format("%s beacon (token=%s)", ajgs.m58685a(this.f70149b), this.f70152e.mo36407a());
    }

    /* renamed from: a */
    public final boolean mo38215a(ajgm ajgm) {
        return ajgm.f70586a.equals(this.f70152e);
    }

    /* renamed from: b */
    public final void mo38217b(ajgm ajgm) {
        TokenBroadcaster$Params tokenBroadcaster$Params;
        ahfv ahfv = ajgm.f70586a;
        if (ahfv.f67128a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("aizk", "b", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Audio: null tokenId");
        } else if (!mo38214a()) {
            throw new ajgn();
        } else if (!this.f70153f || !ahfv.equals(this.f70152e)) {
            srn srn = ahfq.f67120a;
            ahfv.mo36407a();
            ajgs.m58685a(this.f70149b);
            int i = 1;
            this.f70153f = true;
            this.f70152e = ahfv;
            aizj a = this.f70148a.mo38323a("AudioTokenBeacon: ");
            bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = this.f70149b.ordinal();
            if (ordinal == 1) {
                Encoding a2 = aizf.m58269a(this.f70151d, ahfv.f67128a.length);
                byte[] bArr = ahfv.f67128a;
                byxv byxv = this.f70150c.f70278f.f168923f;
                if (byxv == null) {
                    byxv = byxv.f168807p;
                }
                tokenBroadcaster$Params = new TokenBroadcaster$Params(bArr, byxv.f168810b, new Encoding[]{a2});
            } else if (ordinal != 8) {
                byte[] bArr2 = ahfv.f67128a;
                gdq gdq = new gdq();
                gdq.mo11698b(bArr2.length);
                gdq.mo11697a(1);
                tokenBroadcaster$Params = new TokenBroadcaster$Params(bArr2, -1, new Encoding[]{gdq.mo11696a()}, -1);
            } else {
                Encoding b = aizf.m58270b(this.f70151d, ahfv.f67128a.length);
                tokenBroadcaster$Params = new TokenBroadcaster$Params(ahfv.f67128a, -1, new Encoding[]{b});
            }
            String str = a.f70135a;
            a.f70141g = tokenBroadcaster$Params;
            int i2 = a.f70137c;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    i = i2;
                    a.mo38330a(i);
                } else if (a.f70138d && a.f70136b == 1) {
                    a.f70137c = 1;
                    a.mo38330a(i);
                }
            }
            a.f70137c = 2;
            i = 2;
            a.mo38330a(i);
        }
    }
}

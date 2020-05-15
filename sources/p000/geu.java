package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: geu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class geu extends buqb {
    public geu(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo11749a(int i) {
        mo11751a("", i, null, null);
    }

    /* renamed from: a */
    public final void mo11750a(int i, Encoding encoding) {
        mo11751a("", i, encoding, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      geu.a(int, com.google.android.gms.audiomodem.Encoding):void
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo11751a(String str, int i, Encoding encoding, byte[] bArr) {
        bxvd da = byvn.f168463e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvn byvn = (byvn) da.f164949b;
        byvn.f168466b = i - 1;
        byvn.f168465a |= 1;
        if (encoding != null) {
            bxvd da2 = byvo.f168469c.mo74144da();
            int i2 = encoding.f9882a;
            if (i2 == 0) {
                bzbu bzbu = bzbu.AUDIO_ULTRASOUND_PASSBAND;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byvo byvo = (byvo) da2.f164949b;
                byvo.f168472b = bzbu.f169275k;
                byvo.f168471a |= 1;
            } else if (i2 != 1) {
                bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byvo byvo2 = (byvo) da2.f164949b;
                byvo2.f168472b = bzbu2.f169275k;
                byvo2.f168471a |= 1;
            } else {
                bzbu bzbu3 = bzbu.AUDIO_AUDIBLE_DTMF;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byvo byvo3 = (byvo) da2.f164949b;
                byvo3.f168472b = bzbu3.f169275k;
                byvo3.f168471a |= 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvn byvn2 = (byvn) da.f164949b;
            byvo byvo4 = (byvo) da2.mo74062i();
            byvo4.getClass();
            byvn2.f168467c = byvo4;
            byvn2.f168465a |= 2;
        }
        if (bArr != null) {
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvn byvn3 = (byvn) da.f164949b;
            encodeToString.getClass();
            byvn3.f168465a |= 4;
            byvn3.f168468d = encodeToString;
        }
        srn srn = gdv.f17985a;
        byvn byvn4 = (byvn) da.mo74062i();
        int a = bzah.m125578a(byvn4.f168466b);
        if (a == 0) {
            a = 1;
        }
        String valueOf = String.valueOf(Integer.toString(a - 1));
        byvo byvo5 = byvn4.f168467c;
        if (byvo5 == null) {
            byvo5 = byvo.f168469c;
        }
        bzbu a2 = bzbu.m125627a(byvo5.f168472b);
        if (a2 == null) {
            a2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        }
        String valueOf2 = String.valueOf(a2);
        String str2 = byvn4.f168468d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("LoggedAudioModem{type=");
        sb.append(valueOf);
        sb.append(", medium=");
        sb.append(valueOf2);
        sb.append(", token=");
        sb.append(str2);
        sb.append("}");
        sb.toString();
        byvn byvn5 = (byvn) da.mo74062i();
        byvm a3 = buqb.m120220a(str, (String) null, 8);
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byvm byvm = (byvm) bxvd.f164949b;
        byvm byvm2 = byvm.f168451k;
        byvn5.getClass();
        byvm.f168462j = byvn5;
        byvm.f168453a |= 1024;
        mo72974a((byvm) bxvd.mo74062i(), true);
    }

    /* renamed from: a */
    public final void mo11752a(String str, int i, gek gek) {
        mo11751a(str, i, gek.f18047b, null);
    }

    /* renamed from: a */
    public final void mo11753a(String str, int i, geo geo) {
        mo11751a(str, i, geo.f18060b, geo.f18062d);
    }
}

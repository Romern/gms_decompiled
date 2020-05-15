package p000;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: nxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxp implements nxk {

    /* renamed from: a */
    public static final bnsn f36882a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public volatile Handler f36883b;

    /* renamed from: c */
    public final nxr f36884c;

    /* renamed from: d */
    public final nji f36885d;

    /* renamed from: e */
    private final AudioManager f36886e;

    /* renamed from: f */
    private AudioFocusRequest f36887f;

    /* renamed from: g */
    private final Object f36888g = new Object();

    /* renamed from: h */
    private final nxl f36889h = new nxl(this);

    public nxp(AudioManager audioManager, nji nji) {
        this.f36886e = audioManager;
        this.f36885d = nji;
        this.f36884c = new nxr(this.f36889h);
    }

    /* renamed from: a */
    public final void mo21796a() {
        synchronized (this.f36888g) {
            AudioFocusRequest audioFocusRequest = this.f36887f;
            if (audioFocusRequest != null) {
                this.f36886e.abandonAudioFocusRequest(audioFocusRequest);
                this.f36887f = null;
            }
        }
    }

    /* renamed from: b */
    public final int mo21802b(int i) {
        int requestAudioFocus;
        AudioFocusRequest build = new AudioFocusRequest.Builder(i).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(nxm.f36879a).build();
        synchronized (this.f36888g) {
            this.f36887f = build;
            requestAudioFocus = this.f36886e.requestAudioFocus(build);
        }
        return requestAudioFocus;
    }

    /* renamed from: c */
    public final void mo21803c() {
        bnsi d = f36882a.mo68390d();
        d.mo68432a("nxp", "c", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("requestInitialAndroidFocus");
        if (!ccpg.f179680a.mo6606a().mo76581c()) {
            int b = mo21802b(1);
            if (b == 0) {
                bnsi b2 = f36882a.mo68387b();
                b2.mo68432a("nxp", "c", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
            } else if (b == 1) {
                this.f36885d.mo20883a();
            } else if (b != 2) {
                bnsi b3 = f36882a.mo68387b();
                b3.mo68432a("nxp", "c", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68409a("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", b);
            }
        }
        bmxy.m108581a(this.f36883b);
        this.f36884c.f36894c = this.f36883b;
    }

    /* renamed from: d */
    public final void mo21804d() {
        int a = this.f36884c.mo21806a();
        bnsi d = f36882a.mo68390d();
        d.mo68432a("nxp", "d", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Most exclusive focus grant: %d", a);
        if (a != 0) {
            nji nji = this.f36885d;
            nji.f35800a.mo20885a(a);
            njj njj = nji.f35800a;
            String valueOf = String.valueOf(nxs.m28138a(a));
            if (valueOf.length() != 0) {
                "onExternalAppGainAudioFocus ".concat(valueOf);
            } else {
                new String("onExternalAppGainAudioFocus ");
            }
            njj.mo20893d();
            return;
        }
        this.f36885d.mo20883a();
    }

    /* renamed from: a */
    public final void mo21797a(int i) {
        int b = mo21802b(i);
        if (b == 0) {
            bnsi b2 = f36882a.mo68387b();
            b2.mo68432a("nxp", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
        } else if (b != 1 && b != 2) {
            bnsi b3 = f36882a.mo68387b();
            b3.mo68432a("nxp", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b3.mo68409a("Unrecognized focus hint in requestAndroidAudioFocus: %d", i);
        }
    }

    /* renamed from: b */
    public final boolean mo21798b() {
        return this.f36884c.mo21806a() != 0;
    }
}

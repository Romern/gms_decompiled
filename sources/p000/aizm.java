package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aizm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizm implements ajgr {

    /* renamed from: a */
    public final bzbu f70155a;

    /* renamed from: b */
    public ajgp f70156b;

    /* renamed from: c */
    public boolean f70157c;

    /* renamed from: d */
    public final Set f70158d = new HashSet();

    /* renamed from: e */
    private final aiyy f70159e;

    /* renamed from: f */
    private final Context f70160f;

    /* renamed from: g */
    private boolean f70161g;

    /* renamed from: h */
    private final ajat f70162h;

    /* renamed from: i */
    private final aizl f70163i = new aizl(this);

    public aizm(Context context, aiyy aiyy, bzbu bzbu) {
        boolean z = true;
        if (!(bzbu == bzbu.AUDIO_AUDIBLE_DTMF || bzbu == bzbu.AUDIO_ULTRASOUND_PASSBAND)) {
            z = false;
        }
        sdo.m34974b(z);
        this.f70162h = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70159e = aiyy;
        this.f70155a = bzbu;
        this.f70160f = context;
    }

    /* renamed from: d */
    private final boolean m58284d() {
        return this.f70160f.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    /* renamed from: a */
    public final void mo38219a(ajgp ajgp, byyo byyo) {
        TokenReceiver$Params tokenReceiver$Params;
        if (!mo38220a()) {
            throw new ajgq();
        } else if (!this.f70157c) {
            this.f70156b = ajgp;
            int checkPermission = this.f70160f.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", this.f70160f.getPackageName());
            boolean equals = "HOTWORD".equals(cfnp.m140680c());
            int i = 1;
            if ((!m58284d() || checkPermission != 0 || !equals) && !this.f70161g) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.f70161g = true;
            }
            srn srn = ahfq.f67120a;
            ajgs.m58685a(this.f70155a);
            this.f70158d.clear();
            this.f70157c = true;
            aizj a = this.f70159e.mo38323a("AudioTokenListener: ");
            bzbu bzbu = this.f70155a;
            bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = bzbu.ordinal();
            if (ordinal == 1) {
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{aizf.m58269a(this.f70160f, byyo.f168982b)});
            } else if (ordinal != 8) {
                int i2 = byyo.f168982b;
                gdq gdq = new gdq();
                gdq.mo11698b(i2);
                gdq.mo11697a(1);
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{gdq.mo11696a()});
            } else {
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{aizf.m58270b(this.f70160f, byyo.f168982b)});
            }
            aizl aizl = this.f70163i;
            String str = a.f70135a;
            a.f70136b = 1;
            a.f70140f = tokenReceiver$Params;
            a.f70142h = aizl;
            int i3 = a.f70137c;
            if (i3 == 0) {
                a.f70137c = 3;
                i = 3;
            } else if (i3 == 2 && a.f70138d) {
                a.f70137c = 1;
            } else {
                i = i3;
            }
            a.mo38330a(i);
        } else {
            srn srn2 = ahfq.f67120a;
        }
    }

    /* renamed from: b */
    public final void mo38221b() {
        if (this.f70157c) {
            srn srn = ahfq.f67120a;
            ajgs.m58685a(this.f70155a);
            this.f70158d.clear();
            aizj a = this.f70159e.mo38323a("AudioTokenListener: ");
            String str = a.f70135a;
            a.f70136b = 0;
            a.f70140f = null;
            int i = a.f70137c;
            if (i != 0) {
                if (i == 1) {
                    a.f70137c = 2;
                    i = 2;
                } else if (i != 2) {
                    a.f70137c = 0;
                    i = 0;
                }
            }
            a.mo38330a(i);
            aizl aizl = a.f70142h;
            if (aizl != null) {
                ajgs.m58685a(aizl.f70154a.f70155a);
                aizl.f70154a.mo38332c();
                aizl.f70154a.f70157c = false;
            }
            this.f70159e.mo38324b("AudioTokenListener: ");
            this.f70157c = false;
            mo38332c();
        }
    }

    /* renamed from: c */
    public final void mo38332c() {
        try {
            this.f70161g = false;
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo38220a() {
        if (!m58284d()) {
            return false;
        }
        bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = this.f70155a.ordinal();
        if (ordinal == 1) {
            return this.f70162h.mo38420f();
        }
        if (ordinal != 8) {
            return false;
        }
        return this.f70162h.mo38422h();
    }
}

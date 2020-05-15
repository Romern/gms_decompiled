package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Set;

/* renamed from: dyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dyb extends dyg {

    /* renamed from: b */
    public static final dxr f14381b = new dxr(new dya(), "AudioStateProducer", new int[]{24}, null, true);

    /* renamed from: k */
    private static final Set f14382k = sqw.m36040a("android.intent.action.HEADSET_PLUG", "android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED");

    /* renamed from: l */
    private bxft f14383l;

    public dyb(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14381b, str, dqb);
        mo9851a(24);
    }

    /* renamed from: a */
    private final void m9781a(bxft bxft, long j) {
        this.f14383l = bxft;
        tip tip = new tip(7, 24, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxft.f163185i, this.f14383l);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : f14382k) {
            intentFilter.addAction(str);
        }
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bxft mo9844a(Intent intent) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        bxft bxft;
        AudioManager audioManager = (AudioManager) this.f14388d.getSystemService("audio");
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        int i5 = 3;
        if (intent != null && "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            if ((intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 1 || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 3) && (bxft = this.f14383l) != null) {
                return bxft;
            }
            if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2) {
                z = false;
            } else {
                z = true;
            }
            isBluetoothScoOn |= !z;
            if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 0) {
                isBluetoothScoOn = false;
            }
        }
        bxvd da = bxft.f163184h.mo74144da();
        if (!audioManager.isWiredHeadsetOn()) {
            i = 3;
        } else {
            i = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxft bxft2 = (bxft) da.f164949b;
        bxft2.f163188b = i - 1;
        int i6 = 1 | bxft2.f163187a;
        bxft2.f163187a = i6;
        if (!isBluetoothScoOn) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        bxft2.f163189c = i2 - 1;
        bxft2.f163187a = i6 | 2;
        if (!audioManager.isBluetoothScoOn()) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxft bxft3 = (bxft) da.f164949b;
        bxft3.f163190d = i3 - 1;
        bxft3.f163187a |= 4;
        if (!audioManager.isMicrophoneMute()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxft bxft4 = (bxft) da.f164949b;
        bxft4.f163191e = i4 - 1;
        bxft4.f163187a |= 8;
        int i7 = !audioManager.isMusicActive() ? 3 : 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxft bxft5 = (bxft) da.f164949b;
        bxft5.f163192f = i7 - 1;
        bxft5.f163187a |= 16;
        if (audioManager.isSpeakerphoneOn()) {
            i5 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxft bxft6 = (bxft) da.f164949b;
        bxft6.f163193g = i5 - 1;
        bxft6.f163187a |= 32;
        return (bxft) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m9781a(mo9844a((Intent) null), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14383l = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if (f14382k.contains(intent.getAction())) {
            bxft a = mo9844a(intent);
            if (!mo9861g()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dyb", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[AudioStateProducer] No ongoing data. Inserting new context.");
                m9781a(a, dwq.m9665i().mo20505a());
                return;
            }
            bxft bxft = this.f14383l;
            int a2 = bxfm.m122661a(a.f163188b);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = bxfm.m122661a(bxft.f163188b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a2 == a3) {
                int a4 = bxfs.m122667a(a.f163193g);
                if (a4 == 0) {
                    a4 = 1;
                }
                int a5 = bxfs.m122667a(bxft.f163193g);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a4 == a5) {
                    int a6 = bxfq.m122665a(a.f163192f);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    int a7 = bxfq.m122665a(bxft.f163192f);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    if (a6 == a7) {
                        int a8 = bxfo.m122663a(a.f163191e);
                        if (a8 == 0) {
                            a8 = 1;
                        }
                        int a9 = bxfo.m122663a(bxft.f163191e);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        if (a8 == a9) {
                            int a10 = bxfi.m122657a(a.f163189c);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            int a11 = bxfi.m122657a(bxft.f163189c);
                            if (a11 == 0) {
                                a11 = 1;
                            }
                            if (a10 == a11) {
                                int a12 = bxfk.m122659a(a.f163190d);
                                if (a12 == 0) {
                                    a12 = 1;
                                }
                                int a13 = bxfk.m122659a(bxft.f163190d);
                                if (a13 != 0) {
                                    i = a13;
                                }
                                if (a12 == i) {
                                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                    bnsl2.mo68432a("dyb", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68405a("[AudioStateProducer] No state change for audio state context");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            long a14 = dwq.m9665i().mo20505a();
            mo9846a(a14);
            m9781a(a, a14 + 1);
        }
    }
}

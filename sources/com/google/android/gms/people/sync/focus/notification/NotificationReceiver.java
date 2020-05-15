package com.google.android.gms.people.sync.focus.notification;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NotificationReceiver extends aacn {

    /* renamed from: a */
    public amxg f82055a;

    /* renamed from: b */
    private final alsj f82056b;

    public NotificationReceiver(alsj alsj, amxg amxg) {
        super("people");
        this.f82056b = alsj;
        this.f82055a = amxg;
    }

    /* renamed from: a */
    private static void m68207a(amxb amxb, int i) {
        int i2;
        if (cfyk.m143814f()) {
            almk.m61263a();
            String str = amxb.f76243a;
            String str2 = amxb.f76244b;
            bxvd da = amnf.f75449e.mo74144da();
            int i3 = amxb.f76245c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnf amnf = (amnf) da.f164949b;
            amnf.f75451a |= 1;
            amnf.f75452b = i3;
            bxvd da2 = amne.f75442f.mo74144da();
            if (amxb.f76246d == amke.UNKNOWN_STAGE) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amne amne = (amne) da2.f164949b;
            amne.f75445b = i2 - 1;
            int i4 = amne.f75444a | 1;
            amne.f75444a = i4;
            amne.f75446c = amxb.f76246d.f75063h;
            int i5 = i4 | 2;
            amne.f75444a = i5;
            int i6 = amxb.f76247e;
            int i7 = i6 - 1;
            if (i6 != 0) {
                amne.f75447d = i7;
                int i8 = i5 | 4;
                amne.f75444a = i8;
                amne.f75448e = i - 1;
                amne.f75444a = i8 | 8;
                amne amne2 = (amne) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amnf amnf2 = (amnf) da.f164949b;
                amne2.getClass();
                amnf2.mo41221a();
                amnf2.f75454d.add(amne2);
                amnf amnf3 = (amnf) da.mo74062i();
                ammr ammr = (ammr) amnu.f75540w.mo74144da();
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu = (amnu) ammr.f164949b;
                int i9 = amnu.f75542a | 8;
                amnu.f75542a = i9;
                amnu.f75546e = 80;
                if (str != null) {
                    str.getClass();
                    amnu.f75542a = i9 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    amnu.f75560s = str;
                }
                ammx ammx = (ammx) amnk.f75488o.mo74144da();
                if (ammx.f164950c) {
                    ammx.mo74035c();
                    ammx.f164950c = false;
                }
                amnk amnk = (amnk) ammx.f164949b;
                amnf3.getClass();
                amnk.mo41222a();
                amnk.f75502m.add(amnf3);
                amnk amnk2 = (amnk) ammx.mo74062i();
                bxvd da3 = amnm.f75511h.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                amnm amnm = (amnm) da3.f164949b;
                amnk2.getClass();
                amnm.f75518f = amnk2;
                amnm.f75514b |= 2;
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu2 = (amnu) ammr.f164949b;
                amnm amnm2 = (amnm) da3.mo74062i();
                amnm2.getClass();
                amnu2.f75555n = amnm2;
                amnu2.f75542a |= 2048;
                bxvd da4 = amoh.f75593x.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                amoh amoh = (amoh) da4.f164949b;
                amnu amnu3 = (amnu) ammr.mo74062i();
                amnu3.getClass();
                amoh.f75598d = amnu3;
                amoh.f75595a |= 4;
                alml.m61288a(str2, da4);
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Intent c;
        String action = intent.getAction();
        if (action != null) {
            amxb d = this.f82055a.mo41521d();
            if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN")) {
                this.f82056b.mo40709m(d.f76244b);
                if (cfyk.m143814f()) {
                    m68207a(d, 8);
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP")) {
                this.f82056b.mo40709m(d.f76244b);
                if (cfyk.f186101a.mo6606a().mo83109m()) {
                    m68207a(d, 8);
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN")) {
                Intent c2 = this.f82055a.mo41513c();
                if (c2 != null) {
                    context.startActivity(c2.setFlags(268435456));
                    if (cfyk.f186101a.mo6606a().mo83113q()) {
                        m68207a(d, 7);
                    }
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP") && (c = this.f82055a.mo41513c()) != null) {
                context.startActivity(c.setFlags(268435456));
                if (cfyk.f186101a.mo6606a().mo83114r()) {
                    m68207a(d, 7);
                }
            }
        } else {
            Log.e("FSA2_NotificationReceiver", "Should not receive null intent.");
        }
    }
}

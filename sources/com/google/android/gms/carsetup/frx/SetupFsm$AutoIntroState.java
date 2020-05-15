package com.google.android.gms.carsetup.frx;

import android.app.KeyguardManager;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Vibrator;

@oxx(mo22769a = {@oxw(mo22764a = "EVENT_ERROR", mo22765b = SetupFsm$ErrorState.class, mo22766c = SetupFsm$AutoIntroState.class), @oxw(mo22764a = "EVENT_CAR_DISCONNECTED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AutoIntroState.class), @oxw(mo22764a = "EVENT_OK_STATE_SKIPPED", mo22765b = SetupFsm$AuthorizingCarConnectionState.class, mo22766c = SetupFsm$AutoIntroState.class), @oxw(mo22764a = "EVENT_INTRO_DECLINED", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AutoIntroState.class), @oxw(mo22764a = "EVENT_INTRO_ACKNOWLEDGED", mo22765b = SetupFsm$AuthorizingCarConnectionState.class, mo22766c = SetupFsm$AutoIntroState.class), @oxw(mo22764a = "EVENT_INTRO_LOCK_TIMEOUT", mo22765b = SetupFsm$SetupFailedState.class, mo22766c = SetupFsm$AutoIntroState.class)})
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupFsm$AutoIntroState extends oxv {

    /* renamed from: a */
    private final pbu f29654a = new oxf(this);

    /* renamed from: d */
    private Handler f29655d;

    /* renamed from: a */
    public final int mo17457a() {
        return 39;
    }

    /* renamed from: b */
    public final boolean mo17459b(String str, Object obj) {
        if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            this.f38587c.mo22754a("EVENT_CAR_DISCONNECTED");
            return true;
        }
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            bnsn bnsn = oxj.f38565a;
            ((oxk) this.f38587c.f38582k).mo22681k();
        }
        if (!"EVENT_INTRO_ACKNOWLEDGED".equals(str) && !"EVENT_INTRO_DECLINED".equals(str) && !"EVENT_INTRO_LOCK_TIMEOUT".equals(str) && !"EVENT_OK_STATE_SKIPPED".equals(str) && !"EVENT_ERROR".equals(str) && !"EVENT_CAR_DISCONNECTED".equals(str) && !"EVENT_INTRO_CANCEL_TIMER".equals(str)) {
            return true;
        }
        Handler handler = this.f29655d;
        if (handler != null) {
            bnsn bnsn2 = oxj.f38565a;
            handler.removeCallbacksAndMessages(null);
            this.f29655d = null;
        }
        return "EVENT_INTRO_CANCEL_TIMER".equals(str);
    }

    /* renamed from: a */
    public final void mo17458a(String str, Object obj) {
        Class cls;
        oxk oxk = (oxk) this.f38587c.f38582k;
        if (oxk.mo22687q()) {
            this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
            return;
        }
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) this.f38586b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        pbx p = oxk.mo22686p();
        if (inKeyguardRestrictedInputMode || !oxk.mo22672b() || !p.mo22893a()) {
            if (inKeyguardRestrictedInputMode) {
                bnsn bnsn = oxj.f38565a;
                adzt adzt = new adzt();
                this.f29655d = adzt;
                adzt.postDelayed(new oxg(this), 30000);
                Vibrator vibrator = (Vibrator) this.f38586b.getSystemService("vibrator");
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
                }
            }
            new pbv(this.f38586b, this.f29654a).mo22891a(!inKeyguardRestrictedInputMode ? bpeb.FRX_INTRO_FRAGMENT : bpeb.FRX_LOCK_SCREEN);
            if (!inKeyguardRestrictedInputMode || !ccuo.f179996a.mo6606a().mo76848b()) {
                cls = oxb.class;
            } else {
                cls = oxc.class;
            }
            bnsn bnsn2 = oxj.f38565a;
            cls.getSimpleName();
            this.f38587c.mo22751a(cls);
            return;
        }
        this.f38587c.mo22754a("EVENT_OK_STATE_SKIPPED");
    }
}

package com.google.android.location.settings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.location.ActivityTransitionResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingConditionChimeraProvider extends bhaw implements bevv {

    /* renamed from: b */
    private bevw f150920b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo63497a() {
        return "com.google.android.location.settings.DrivingConditionProvider";
    }

    /* renamed from: b */
    public final String mo63500b() {
        return "driving";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bhav mo63502c() {
        return new bhav(false, (int) ceyg.m138422c());
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        if (!ceuz.m138278c()) {
            return null;
        }
        return onBind;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        bevw bevw = this.f150920b;
        if (!(bevw == null || intent == null || intent.getAction() == null || !ActivityTransitionResult.m66829a(intent))) {
            int i3 = -1;
            if (cesk.m138182e()) {
                i3 = intent.getIntExtra("AR_AUDIO_FUSION_RESULT", -1);
            }
            int a = bevw.f112771c.mo61187a(ActivityTransitionResult.m66830b(intent), i3);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 1) {
                bevw.f112770b.mo61185a(true);
            } else if (i4 == 2) {
                bevw.f112770b.mo61185a(false);
            }
        }
        return 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bewq.a(boolean, int):void
     arg types: [int, int]
     candidates:
      bewq.a(java.lang.String, java.lang.String):btyc
      bewq.a(boolean, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63498a(int i) {
        if (this.f150920b == null) {
            this.f150920b = new bevw(this, this);
        }
        if (ceyg.m138421b()) {
            bewq.m95998a(this).mo61206a(true, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bewq.a(boolean, int):void
     arg types: [int, int]
     candidates:
      bewq.a(java.lang.String, java.lang.String):btyc
      bewq.a(boolean, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63501b(int i) {
        bevw bevw = this.f150920b;
        if (bevw != null) {
            Context context = bevw.f112769a;
            aucb b = aefo.m51797a(context).mo24729b(PendingIntent.getService(context, 0, bevu.m95969a(context), 0));
            b.mo50373a(new bevs());
            b.mo50372a(new bevt());
            this.f150920b = null;
        }
        if (ceyg.m138421b()) {
            bewq.m95998a(this).mo61206a(false, i);
        }
    }

    /* renamed from: a */
    public final void mo61185a(boolean z) {
        mo63499a(z, getString(C0126R.string.dnd_state_driving));
        if (!ceuz.m138278c()) {
            mo63503d();
        }
    }
}

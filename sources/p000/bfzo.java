package p000;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import java.util.Calendar;

/* renamed from: bfzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzo extends bfzc implements bgnt {

    /* renamed from: d */
    final /* synthetic */ bfzt f115781d;

    /* renamed from: e */
    private final Calendar f115782e = Calendar.getInstance();

    /* renamed from: f */
    private boolean f115783f = false;

    /* renamed from: g */
    private boolean f115784g = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzo(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115781d = bfzt;
    }

    /* renamed from: m */
    private final boolean m98317m() {
        boolean z;
        this.f115782e.setTimeInMillis(System.currentTimeMillis());
        int i = this.f115782e.get(11);
        if (i < 7 || i >= 23) {
            z = true;
        } else {
            z = false;
        }
        boolean c = this.f115763b.f115746d.f116305g.mo62740c();
        bfyy bfyy = this.f115763b;
        boolean z2 = bfxc.f115575a;
        boolean z3 = !(SystemClock.elapsedRealtime() - bfyy.f115750h.f116319b <= 3600000);
        boolean z4 = bfxc.f115575a;
        boolean z5 = z && c && z3;
        if (this.f115783f == z5) {
            return false;
        }
        this.f115783f = z5;
        boolean z6 = bfxc.f115575a;
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfxb.a(int, boolean, int):void
     arg types: [int, int, int]
     candidates:
      bfxb.a(int, int, bfwf):void
      bfxb.a(int, android.location.Location, int):void
      bfxb.a(int, boolean, java.lang.String):void
      bfxb.a(int, boolean, int):void */
    /* renamed from: E */
    public final void mo61097E() {
        synchronized (this.f115781d.f115806k) {
            bfxa.f115569a.mo62414a(1811416624, false, 4);
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "sendSignificantMotion");
            }
            this.f115781d.mo62553d(15);
        }
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.STILL_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo62473b() {
        if (this.f115763b.mo62460a()) {
            return 300;
        }
        if (this.f115763b.mo62463b(100000.0d)) {
            return -1;
        }
        if (this.f115763b.mo62463b(300.0d) || this.f115783f || this.f115784g) {
            return 300;
        }
        return 180;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo62474c() {
        if ((this.f115781d.f115820y || this.f115784g) && mo62475d() == -1) {
            return -1;
        }
        if (this.f115763b.mo62460a()) {
            return 60;
        }
        if (!this.f115763b.mo62463b(3333.3333333333335d)) {
            return (this.f115763b.mo62463b(300.0d) || this.f115783f || this.f115784g) ? 900 : 360;
        }
        return 1800;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo62475d() {
        int i = this.f115763b.f115744b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "StillActivityState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final double mo62479h() {
        return 1.5d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfzc.a(int, boolean, boolean):void
     arg types: [int, int, int]
     candidates:
      bfze.a(java.lang.String, com.google.android.gms.location.GeofencingRequest, java.util.List):boolean
      bfzc.a(int, boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo62494j() {
        bxvd bxvd = this.f115781d.f115791D;
        if (bxvd != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmn bpmn = (bpmn) bxvd.f164949b;
            bpmn bpmn2 = bpmn.f138303g;
            bpmn.f138305a |= 4;
            bpmn.f138308d = false;
        }
        bfww bfww = this.f115781d.f115812q;
        if (bfww != null) {
            bfww.mo62404a(false);
        }
        if (this.f115781d.f115789B.mo62446a()) {
            mo62480a(30, false, true);
        }
        return true;
    }

    /* renamed from: k */
    public final void mo62503k() {
        super.mo62503k();
        this.f115783f = false;
        this.f115784g = false;
    }

    /* renamed from: l */
    public final void mo62504l() {
        this.f115783f = false;
        this.f115784g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62483a(Intent intent) {
        super.mo62483a(intent);
        if (!m98317m()) {
            return false;
        }
        mo62492d(false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo62486a(bfyl bfyl) {
        if (!this.f115783f && !this.f115784g) {
            return super.mo62486a(bfyl);
        }
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            bfxc.m98132a("GeofencerStateMachine", "Use last location to update newly added Geofences.");
        }
        return mo62487a(bfyl, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62489b(bfzl bfzl) {
        if (m98317m()) {
            mo62490b(this.f115783f);
        }
        if (this.f115783f || this.f115784g) {
            if (!cexh.m138383b()) {
                bfxa.f115569a.mo62416a(new bfwy(-317571983, bfzl.f115776b, "Location dropped in deep still mode"));
            } else {
                bfxa.f115569a.mo62412a(-620788458, bfzl.f115776b, 7);
            }
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "Location dropped because in deep still mode.");
            }
        } else {
            mo62481a(bfzl);
        }
        if ((!this.f115781d.f115820y && !this.f115784g) || mo62475d() != -1) {
            mo62492d(false);
            return true;
        }
        int b = mo62473b();
        this.f115763b.mo62457a(0, false, mo62476e(), b, mo62477f(), false);
        bfzt bfzt = this.f115781d;
        bfww bfww = bfzt.f115812q;
        if (bfww == null) {
            return true;
        }
        bfww.mo62399a(((bfze) bfzt.mo62550c()).mo62472a(), 0, b);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfxb.a(int, boolean, int):void
     arg types: [int, int, int]
     candidates:
      bfxb.a(int, int, bfwf):void
      bfxb.a(int, android.location.Location, int):void
      bfxb.a(int, boolean, java.lang.String):void
      bfxb.a(int, boolean, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62490b(boolean z) {
        this.f115784g = z;
        bgnu bgnu = this.f115781d.f115821z;
        if (((bgod) bgnu).f116902d) {
            if (!z) {
                if (bgnu.mo63026b()) {
                    this.f115781d.f115821z.mo63027c();
                    bxvd bxvd = this.f115781d.f115791D;
                    if (bxvd != null) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpmn bpmn = (bpmn) bxvd.f164949b;
                        bpmn bpmn2 = bpmn.f138303g;
                        bpmn.f138305a |= 4;
                        bpmn.f138308d = false;
                    }
                    bfxa.f115569a.mo62414a(1647503932, false, 3);
                }
            } else if (!bgnu.mo63026b()) {
                this.f115781d.f115821z.mo63025a(this);
                bxvd bxvd2 = this.f115781d.f115791D;
                if (bxvd2 != null) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bpmn bpmn3 = (bpmn) bxvd2.f164949b;
                    bpmn bpmn4 = bpmn.f138303g;
                    bpmn3.f138305a |= 4;
                    bpmn3.f138308d = true;
                }
                bfxa.f115569a.mo62414a(-1083843362, true, 3);
            }
            bfww bfww = this.f115781d.f115812q;
            if (bfww != null) {
                bfww.mo62404a(z);
            }
        }
        return false;
    }
}

package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.cast.JGCastService;
import java.io.PrintWriter;

/* renamed from: apha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apha {

    /* renamed from: a */
    public boolean f84368a;

    /* renamed from: b */
    private boolean f84369b;

    /* renamed from: c */
    private boolean f84370c;

    /* renamed from: d */
    private final Intent f84371d = new Intent("com.google.android.gms.gcm.TRIGGER_IDLE");

    /* renamed from: e */
    private bmxv f84372e = bmvz.f131120a;

    /* renamed from: a */
    public final synchronized void mo47208a(PrintWriter printWriter) {
        printWriter.println("\nIdleness tracker states:");
        boolean z = this.f84368a;
        StringBuilder sb = new StringBuilder(16);
        sb.append("isScreenOn:");
        sb.append(z);
        printWriter.println(sb.toString());
        boolean z2 = this.f84370c;
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append("isDockIdle:");
        sb2.append(z2);
        printWriter.println(sb2.toString());
        boolean z3 = this.f84369b;
        StringBuilder sb3 = new StringBuilder(17);
        sb3.append("device idle:");
        sb3.append(z3);
        printWriter.println(sb3.toString());
    }

    /* renamed from: a */
    public final synchronized boolean mo47211a() {
        return this.f84369b;
    }

    /* renamed from: b */
    public final synchronized void mo47212b() {
        if (!this.f84369b) {
            if (this.f84368a) {
                if (!this.f84370c) {
                }
            }
            this.f84369b = true;
            apht.m70315a().f84404d.mo16948b(7);
        }
    }

    /* renamed from: a */
    public final synchronized void mo47209a(skc skc, String str) {
        if (!str.equals("android.intent.action.DOCK_ACTIVE")) {
            this.f84368a = true;
            this.f84370c = false;
        } else {
            this.f84370c = false;
        }
        if (this.f84372e.mo66813a()) {
            skc.mo25668a((PendingIntent) this.f84372e.mo66814b());
            this.f84372e = bmvz.f131120a;
        }
        if (this.f84369b) {
            this.f84369b = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo47210a(skc skc, String str, Context context) {
        if (str.equals("android.intent.action.DOCK_IDLE")) {
            this.f84370c = true;
        } else {
            this.f84368a = false;
            this.f84370c = false;
        }
        if (!this.f84372e.mo66813a()) {
            this.f84372e = bmxv.m108566b(PendingIntent.getBroadcast(context, 0, this.f84371d, JGCastService.FLAG_PRIVATE_DISPLAY));
            skc.mo25675a("GCM", 3, cdnj.f181319a.mo6606a().mo77978A() + SystemClock.elapsedRealtime(), (PendingIntent) this.f84372e.mo66814b(), "com.google.android.gms");
        }
    }
}

package p000;

import android.content.Context;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import java.io.IOException;

/* renamed from: aknq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aknq extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f72313a;

    /* renamed from: b */
    final /* synthetic */ String f72314b;

    /* renamed from: c */
    final /* synthetic */ GunsBrowserChimeraActivity f72315c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aknq(GunsBrowserChimeraActivity gunsBrowserChimeraActivity, Context context, String str) {
        super(9);
        this.f72315c = gunsBrowserChimeraActivity;
        this.f72313a = context;
        this.f72314b = str;
    }

    public final void run() {
        String str;
        try {
            str = addi.m50206a(this.f72313a).mo33343a(this.f72314b, "GCM");
        } catch (IOException e) {
            bnsl bnsl = (bnsl) GunsBrowserChimeraActivity.f81201a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to get IIDToken for project: %s", this.f72314b);
            str = "";
        }
        srn srn = GunsBrowserChimeraActivity.f81201a;
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72315c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setIIDToken('");
        sb.append(str);
        sb.append("');");
        gunsBrowserChimeraActivity.mo44697c(sb.toString());
    }
}

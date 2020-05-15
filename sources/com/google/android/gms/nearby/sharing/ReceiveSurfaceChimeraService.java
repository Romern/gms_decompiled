package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.nearby.sharing.experiments.Precondition$1;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReceiveSurfaceChimeraService extends Service {

    /* renamed from: a */
    private ajty f80957a;

    /* renamed from: b */
    private final Context f80958b = new C1416ut(this, 2132018138);

    /* renamed from: c */
    private ajna f80959c;

    /* renamed from: d */
    private ajxe[] f80960d;

    /* renamed from: e */
    private ajpa f80961e;

    /* renamed from: f */
    private ajpb f80962f;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f80960d = new ajxe[]{new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82315aX(), 2, 3), new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82313aV(), 1, 3), new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82317aZ(), 0, 3), new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82316aY(), 2, 2), new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82314aW(), 1, 2), new ajxb(getApplicationContext(), cfov.f185185a.mo6606a().mo82353ba(), 0, 2)};
        if (ModuleInitializer.m67468a(this)) {
            this.f80959c = ajna.m58860a(this.f80958b);
            if (this.f80957a == null) {
                this.f80957a = ahcb.m55442c(this);
            }
            this.f80961e = new ajpa(this.f80959c);
            this.f80962f = new ajpb(this.f80959c);
            this.f80957a.mo38901a(this.f80961e, 0);
            ajty ajty = this.f80957a;
            ajpb ajpb = this.f80962f;
            ajty.mo38902a(ajpb, ajpb, 0);
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceService created");
    }

    public final void onDestroy() {
        ajxe[] ajxeArr = this.f80960d;
        int length = ajxeArr.length;
        for (int i = 0; i < 6; i++) {
            ajxeArr[i].mo39064c();
        }
        if (ModuleInitializer.m67468a(this)) {
            this.f80959c.mo38816b();
            this.f80957a.mo38900a((ajud) this.f80961e);
            this.f80957a.mo38906b(this.f80962f);
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceService destroyed");
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ajxe[] ajxeArr = this.f80960d;
        int length = ajxeArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < 6; i3++) {
            ajxe ajxe = ajxeArr[i3];
            if (!ajxe.f71498b) {
                ajxe.mo39064c();
            } else if (!ajxe.f71500d) {
                ajxf[] ajxfArr = ajxe.f71499c;
                for (int i4 = 0; i4 < 2; i4++) {
                    ajxf ajxf = ajxfArr[i4];
                    ajxf.f71503b = new Precondition$1("nearby", new ajxd(ajxe));
                    ajxf.f71502a.registerReceiver(ajxf.f71503b, ajxf.mo39063b());
                }
                ajxe.f71500d = true;
                srn srn = ajvp.f71371a;
                ajxe.mo39066e();
                z = true;
            } else {
                srn srn2 = ajvp.f71371a;
                z = true;
            }
        }
        if (!z && !ModuleInitializer.m67468a(this)) {
            stopSelf();
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceService started");
        return 1;
    }
}

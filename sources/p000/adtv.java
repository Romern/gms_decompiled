package p000;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: adtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtv extends aduh {

    /* renamed from: d */
    public final qws f62728d;

    /* renamed from: e */
    public String f62729e;

    /* renamed from: f */
    public int f62730f;

    public adtv(Application application, ModuleManager.ModuleInfo moduleInfo) {
        super(application, moduleInfo);
        this.f62728d = new qws(application, "KIDS_SUPERVISION", null);
    }

    /* renamed from: a */
    public final Intent mo33820a(Intent intent) {
        Intent putExtra = new Intent("com.google.android.gms.kids.CONTINUE_FROM_SETTINGS").setComponent(new ComponentName(this.f26825a, "com.google.android.gms.kids.KidSetupActivity")).putExtra("session_id", this.f62729e);
        bizc.m103024a(intent, putExtra);
        if (!putExtra.hasExtra("theme")) {
            putExtra.putExtra("theme", "glif_v3_light");
        }
        return putExtra;
    }

    /* renamed from: a */
    public final void mo33821a(int i) {
        qwo a = this.f62728d.mo24333a(btum.f150505c);
        a.f42320d = "KIDS_SUPERVISION";
        a.mo24328b(i - 1);
        a.mo24327b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33822a(btur btur) {
        qws qws = this.f62728d;
        bxvd da = btum.f150505c.mo74144da();
        bxvd da2 = btuk.f150497e.mo74144da();
        int i = this.f62730f;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btuk btuk = (btuk) da2.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            btuk.f150500b = i2;
            btuk.f150499a |= 1;
            bxvd da3 = btui.f150491c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btui btui = (btui) da3.f164949b;
            btui.f150494b = btur.f150618aY;
            btui.f150493a |= 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btuk btuk2 = (btuk) da2.f164949b;
            btui btui2 = (btui) da3.mo74062i();
            btui2.getClass();
            btuk2.f150502d = btui2;
            btuk2.f150499a |= 4;
            String str = this.f62729e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btuk btuk3 = (btuk) da2.f164949b;
            str.getClass();
            btuk3.f150499a |= 2;
            btuk3.f150501c = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btum btum = (btum) da.f164949b;
            btuk btuk4 = (btuk) da2.mo74062i();
            btuk4.getClass();
            btum.f150508b = btuk4;
            btum.f150507a = 2;
            qwo a = qws.mo24333a(da.mo74062i());
            a.f42320d = "KIDS_SUPERVISION";
            a.mo24328b((int) ErrorInfo.TYPE_FSC_HTTP_ERROR);
            a.mo24327b();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33823a() {
        return Settings.Global.getFloat(this.f26825a.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }
}

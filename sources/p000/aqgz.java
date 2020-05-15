package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aqgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqgz extends rrd implements aqkh, aqkj {

    /* renamed from: b */
    public aqkk f86095b;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo47882c();

    /* renamed from: d */
    public boolean mo47883d() {
        throw null;
    }

    /* renamed from: e */
    public final bxvd mo47884e() {
        return this.f86095b.f86285g;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f86095b = new aqkk(this, this, this, new aqkl(this));
        String c = mo47882c();
        bxvd bxvd = this.f86095b.f86286h;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        c.getClass();
        boco.f132583a |= 1;
        boco.f132584b = c;
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this).getCurrentModule();
            aqkk aqkk = this.f86095b;
            int i = currentModule.moduleVersion;
            bxvd bxvd2 = aqkk.f86286h;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            boco boco3 = (boco) bxvd2.f164949b;
            boco3.f132583a |= 8;
            boco3.f132587e = i;
            aqkk aqkk2 = this.f86095b;
            String str = currentModule.moduleId;
            bxvd bxvd3 = aqkk2.f86286h;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            boco boco4 = (boco) bxvd3.f164949b;
            str.getClass();
            boco4.f132583a |= 16;
            boco4.f132588f = str;
        } catch (IllegalStateException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f86095b.f86281c.mo47933f().putLong("MetricsHelper.last_resume_time", SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f86095b.mo47934a();
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (isFinishing()) {
            this.f86095b.mo47934a();
            aqkk aqkk = this.f86095b;
            if (!aqkk.f86284f) {
                aqkk.f86284f = true;
                bxvd bxvd = aqkk.f86285g;
                bxvd bxvd2 = aqkk.f86286h;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boct boct = (boct) bxvd.f164949b;
                boco boco = (boco) bxvd2.mo74062i();
                boct boct2 = boct.f132600I;
                boco.getClass();
                boct.f132623n = boco;
                boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                if (aqkk.f86282d.mo47883d()) {
                    avtz.m79338b(aqkk.f86280b).mo24673E().mo50363a(new aqki(aqkk));
                } else {
                    aucu.m76778a((Object) null);
                }
            } else {
                aucu.m76778a((Object) null);
            }
        }
        super.onStop();
    }
}

package p000;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.util.concurrent.TimeUnit;

/* renamed from: toy */
final /* synthetic */ class toy implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final tph f46427a;

    /* renamed from: b */
    private final tpf f46428b;

    /* renamed from: c */
    private final tps f46429c;

    public toy(tph tph, tpf tpf, tps tps) {
        this.f46427a = tph;
        this.f46428b = tpf;
        this.f46429c = tps;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    public final void onClick(DialogInterface dialogInterface, int i) {
        bmxv bmxv;
        tph tph = this.f46427a;
        tpf tpf = this.f46428b;
        tps tps = this.f46429c;
        String a = ((tpe) tpf.getItem(i)).mo26701a();
        try {
            byte[] a2 = spo.getPackageCertificateHash(tph.f46441b, a, "SHA-512");
            if (a2 != null) {
                bmxv = bmxv.m108566b(String.format("android://%s@%s/", Base64.encodeToString(a2, 10), a));
                if (!bmxv.mo66813a()) {
                    String str = (String) bmxv.mo66814b();
                    tpp tpp = tps.f46462a;
                    trs trs = tpp.f46456a.f46573a;
                    bxvd da = qun.f42164n.mo74144da();
                    long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qun qun = (qun) da.f164949b;
                    int i2 = qun.f42166a | 1024;
                    qun.f42166a = i2;
                    qun.f42174i = micros;
                    int i3 = i2 | 2048;
                    qun.f42166a = i3;
                    qun.f42175j = true;
                    str.getClass();
                    int i4 = i3 | 4;
                    qun.f42166a = i4;
                    qun.f42168c = str;
                    str.getClass();
                    qun.f42166a = 2 | i4;
                    qun.f42167b = str;
                    qun qun2 = (qun) da.mo74062i();
                    C0034at atVar = new C0034at();
                    atVar.mo2450b(tql.m37366d());
                    if (cdqa.m134650c()) {
                        aucb a3 = trs.f46556b.mo26696a(qun2);
                        a3.mo50373a(new tra(trs, qun2, atVar));
                        a3.mo50372a(new trb(atVar));
                    } else {
                        aucb a4 = trs.f46556b.mo26696a(qun2);
                        a4.mo50373a(new trc(trs, qun2, atVar));
                        a4.mo50372a(new tre(atVar));
                    }
                    atVar.mo2445a(tpp.f46457b, new tpo(tpp));
                    return;
                }
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        bmxv = bmvz.f131120a;
        if (!bmxv.mo66813a()) {
        }
    }
}

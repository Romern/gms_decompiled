package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: acrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrg extends acra {

    /* renamed from: b */
    public final apne f60598b;

    /* renamed from: c */
    public final abym f60599c;

    /* renamed from: d */
    final Runnable f60600d = new acrf(this);

    /* renamed from: e */
    private final acxo f60601e;

    /* renamed from: f */
    private final acao f60602f;

    /* renamed from: g */
    private final UsageInfo[] f60603g;

    /* renamed from: h */
    private final String f60604h;

    public acrg(ftl ftl, apne apne, acao acao, acxo acxo, abym abym, UsageInfo[] usageInfoArr, String str) {
        super(ftl, "ReportUsage");
        this.f60601e = acxo;
        this.f60598b = apne;
        this.f60599c = abym;
        this.f60602f = acao;
        this.f60603g = usageInfoArr;
        this.f60604h = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        String valueOf = String.valueOf(this.f60604h);
        absg.m48184a(valueOf.length() == 0 ? new String("Recording usage report from ") : "Recording usage report from ".concat(valueOf));
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f60601e.mo33213a(this.f60603g, this.f60604h, currentTimeMillis, acxm.m49954a(context, currentTimeMillis), this.f60600d);
        bqbh a2 = acrj.m49738a(context, this.f60604h, this.f60603g, rfz.m33557a(context));
        absg.m48185a("UserActionNotificationResult: %d", Integer.valueOf(a2.mo3214a()));
        if (!a) {
            i = 8;
        } else {
            i = 0;
        }
        try {
            this.f60570a.mo11304a(new Status(i, null, null));
        } catch (RemoteException e) {
            absg.m48200c(e, "Client died during reportUsage", new Object[0]);
        }
        boolean booleanValue = ((Boolean) abzt.f58994n.mo58455c()).booleanValue();
        boolean a3 = this.f60602f.mo32593a(this.f60602f.mo32592a());
        if (booleanValue && a3) {
            abym abym = this.f60599c;
            bxvd da = bpyr.f139920d.mo74144da();
            String str = this.f60604h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyr bpyr = (bpyr) da.f164949b;
            str.getClass();
            bpyr.f139922a |= 1;
            bpyr.f139923b = str;
            bpyr.f139924c = a2.mo3214a();
            bpyr.f139922a |= 2;
            bpyr bpyr2 = (bpyr) da.mo74062i();
            long o = cema.f182934a.mo6606a().mo79313o();
            if (abym.mo32452a(o)) {
                bxvd da2 = bpxb.f139606R.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpxb bpxb = (bpxb) da2.f164949b;
                int i2 = bpxb.f139625a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                bpxb.f139625a = i2;
                bpxb.f139643s = o;
                bpyr2.getClass();
                bpxb.f139631g = bpyr2;
                bpxb.f139625a = i2 | 16;
                abym.mo32450a("astats", da2);
            }
        }
    }
}

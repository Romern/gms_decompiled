package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import java.util.ArrayList;

/* renamed from: lbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lbm implements lch {

    /* renamed from: a */
    public static final srn f25735a = srn.m36124a();

    /* renamed from: b */
    protected final Context f25736b;

    /* renamed from: c */
    protected final kpk f25737c;

    /* renamed from: d */
    protected final kbe f25738d;

    /* renamed from: e */
    protected final lhi f25739e;

    public lbm(Context context, kpk kpk, kbe kbe, lhi lhi) {
        this.f25736b = context;
        this.f25737c = kpk;
        this.f25738d = kbe;
        this.f25739e = lhi;
    }

    /* renamed from: a */
    private static final FillField m18898a(ImmutableDetectionHistory immutableDetectionHistory) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kpb.NEW_USERNAME);
        arrayList.add(kpb.USERNAME);
        if (ccjp.m130129b()) {
            arrayList.add(kpb.EMAIL_ADDRESS);
        }
        if (ccjp.m130131d()) {
            arrayList.add(kpb.PHONE_NUMBER);
            arrayList.add(kpb.PHONE_NATIONAL);
        }
        int i = Build.VERSION.SDK_INT;
        return immutableDetectionHistory.mo14999a(lrb.m19567a(), (kpb[]) arrayList.toArray(new kpb[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bqgg mo14963a(lcf lcf, FillField fillField, FillField fillField2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14964b(String str) {
        lhi lhi = this.f25739e;
        if (!ccip.m129865e() || ((long) (lhi.mo15080a(str) + 1)) >= ccip.m129864d()) {
            return ssw.m36269a() ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: a */
    static lau m18899a(MetricsContext metricsContext, FillForm fillForm, boolean z) {
        bxvd da = lau.f25613i.mo74144da();
        bxvd da2 = kzz.f25505d.mo74144da();
        int a = metricsContext.mo7953a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kzz) da2.f164949b).f25507a = a;
        kzx b = metricsContext.mo7956b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        b.getClass();
        ((kzz) da2.f164949b).f25508b = b;
        lbh c = metricsContext.mo7957c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c.getClass();
        ((kzz) da2.f164949b).f25509c = c;
        kzz kzz = (kzz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzz.getClass();
        ((lau) da.f164949b).f25618d = kzz;
        lbf a2 = kwv.m18703a(fillForm);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((lau) da.f164949b).f25619e = a2;
        laz laz = laz.CREDENTIAL;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lau) da.f164949b).f25620f = laz.mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lau lau = (lau) da.f164949b;
        lau.f25617c = z;
        lau.f25621g = lat.m18861a(4);
        return (lau) da.mo74062i();
    }

    /* renamed from: a */
    static final /* synthetic */ void m18900a(Exception exc) {
        bnsl bnsl = (bnsl) f25735a.mo68388c();
        bnsl.mo68432a("lbm", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Task to disable Yolo save dialog failed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo14961a(String str) {
        if (this.f25739e.mo15080a(str) >= lhi.f26105c - 1) {
            return ssw.m36269a() ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: a */
    public final bqgg mo14962a(lcf lcf) {
        FillField fillField;
        FillField fillField2;
        FillForm fillForm = lcf.f25778b;
        FillField fillField3 = fillForm.mo7949a(kpb.NEW_USERNAME) ? (FillField) fillForm.mo7950b(kpb.NEW_USERNAME).get(0) : fillForm.mo7949a(kpb.USERNAME) ? (FillField) fillForm.mo7950b(kpb.USERNAME).get(0) : null;
        int i = Build.VERSION.SDK_INT;
        if (fillField3 == null && (!ccjp.m130130c() || (fillField3 = lcf.f25779c.mo14999a(lrb.m19567a(), kpb.NEW_USERNAME, kpb.USERNAME)) == null)) {
            FillForm fillForm2 = lcf.f25778b;
            int i2 = Build.VERSION.SDK_INT;
            if (fillForm2.mo7949a(kpb.EMAIL_ADDRESS)) {
                fillField3 = (FillField) fillForm2.mo7950b(kpb.EMAIL_ADDRESS).get(0);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                if (fillForm2.mo7949a(kpb.PHONE_NUMBER)) {
                    fillField3 = (FillField) fillForm2.mo7948a(kpb.PHONE_NUMBER).get(0);
                } else {
                    fillField3 = fillForm2.mo7949a(kpb.PHONE_NATIONAL) ? (FillField) fillForm2.mo7948a(kpb.PHONE_NATIONAL).get(0) : null;
                }
            }
        }
        if (fillField3 == null && ccjp.m130130c()) {
            fillField3 = m18898a(lcf.f25779c);
        }
        FillForm fillForm3 = lcf.f25778b;
        if (fillForm3.mo7949a(kpb.NEW_PASSWORD)) {
            fillField = (FillField) fillForm3.mo7950b(kpb.NEW_PASSWORD).get(0);
        } else {
            fillField = fillForm3.mo7949a(kpb.PASSWORD) ? (FillField) fillForm3.mo7950b(kpb.PASSWORD).get(0) : null;
        }
        if (fillField != null || !ccjp.m130130c() || !cciw.f179109a.mo6606a().mo76090w()) {
            fillField2 = fillField;
        } else {
            ImmutableDetectionHistory immutableDetectionHistory = lcf.f25779c;
            int i4 = Build.VERSION.SDK_INT;
            fillField2 = m18898a(immutableDetectionHistory) == null ? immutableDetectionHistory.mo14999a(lrb.m19567a(), kpb.NEW_PASSWORD, kpb.PASSWORD) : null;
        }
        if (fillField3 == null && fillField2 == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        bqgg c = this.f25738d.mo14346c();
        bqgg bqgg = lcf.f25780d;
        return bqga.m112783b(c, bqgg).mo69214a(new lbk(this, bqgg, c, lcf, fillField2, mo14963a(lcf, fillField3, fillField2)), bqfb.INSTANCE);
    }
}

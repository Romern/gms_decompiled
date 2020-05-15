package p000;

import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;

/* renamed from: lkj */
final /* synthetic */ class lkj implements bmxj {

    /* renamed from: a */
    private final lkp f26252a;

    /* renamed from: b */
    private final bngx f26253b;

    /* renamed from: c */
    private final kct f26254c;

    public lkj(lkp lkp, bngx bngx, kct kct) {
        this.f26252a = lkp;
        this.f26253b = bngx;
        this.f26254c = kct;
    }

    public final Object apply(Object obj) {
        String str;
        RemoteViews remoteViews;
        String str2;
        String str3;
        lkp lkp = this.f26252a;
        bngx bngx = this.f26253b;
        kct kct = this.f26254c;
        kpb kpb = (kpb) obj;
        if (kpb != kpb.USERNAME && kpb != kpb.PASSWORD) {
            return kqm.m18348a(bnoj.f131912b, bnoj.f131912b);
        }
        FillField fillField = (FillField) bngx.get(0);
        Credential credential = (Credential) kct.mo14368a();
        if (cciw.f179109a.mo6606a().mo76084q()) {
            if (kpb != kpb.USERNAME) {
                str = credential.f11609b.f23889a;
                str3 = bmzh.m108674a("•", str.length());
            } else {
                str = credential.f11608a;
                str3 = str;
            }
            remoteViews = lbj.m18887a(lkp.f26262b, str3, (CharSequence) null, (kcz) null);
        } else {
            if (kpb != kpb.USERNAME) {
                str2 = credential.f11609b.f23889a;
            } else {
                str2 = credential.f11608a;
            }
            remoteViews = new RemoteViews("android", 17367043);
        }
        kby a = kbz.m17615a();
        a.mo14355a(fillField.f11631a, AutofillValue.forText(str), remoteViews, bmvz.f131120a);
        kbz a2 = a.mo14352a();
        if (a2 != null) {
            return kqm.m18348a(bnhe.m109408a(kct, a2), bnhe.m109408a(kct, bnic.m109489a(fillField)));
        }
        ((bnsl) lkp.f26261a.mo68387b()).mo68405a("Failed to created dataset.");
        return kqm.m18348a(bnoj.f131912b, bnoj.f131912b);
    }
}

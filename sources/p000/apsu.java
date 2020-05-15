package p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: apsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsu extends acpn {

    /* renamed from: a */
    private final Context f84833a;

    /* renamed from: b */
    private final acrl f84834b;

    /* renamed from: c */
    private final abzo f84835c;

    /* renamed from: d */
    private final abyx f84836d;

    /* renamed from: e */
    private final acao f84837e;

    /* renamed from: f */
    private final acqb f84838f;

    public apsu(Context context, acrl acrl, abzo abzo, abyx abyx, acao acao, acqb acqb) {
        super(bqbd.UPDATE_APP_PARAMS, acrz.m49787b(context));
        this.f84833a = context;
        this.f84834b = acrl;
        this.f84835c = abzo;
        this.f84836d = abyx;
        this.f84837e = acao;
        this.f84838f = acqb;
    }

    /* renamed from: a */
    public static aebj m70924a(boolean z) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        aebi.f63099k = "update-app-params";
        aebi.mo34029b(z);
        aebi.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
        aebi.mo34004a(cemj.f182986a.mo6606a().mo79356i(), cemj.f182986a.mo6606a().mo79355h());
        return aebi.mo33974b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        List<absr> a;
        acqn acqn;
        absg.m48184a("UpdateAppParamsTask started");
        String a2 = this.f84837e.mo32592a();
        boolean a3 = this.f84836d.f58772a.mo32490a();
        boolean a4 = this.f84837e.mo32593a(a2);
        if (!a3 && !a4) {
            this.f84834b.mo33019a(acqn.f60505c);
            absg.m48184a("UpdateAppParamsTask is disabled");
            return null;
        }
        synchronized (this.f84835c.mo32525a()) {
            a = this.f84835c.mo32527a(null, null, true);
        }
        HashMap hashMap = new HashMap(a.size());
        for (absr absr : a) {
            if (!hashMap.containsKey(absr.f58140e) && (abzm.m48658f(absr) || abzm.m48657e(absr))) {
                String str = absr.f58140e;
                hashMap.put(str, this.f84834b.mo33043n(str));
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            bxvd da = acqp.f60515e.mo74144da();
            String str2 = (String) entry.getKey();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            acqp acqp = (acqp) da.f164949b;
            str2.getClass();
            acqp.f60517a |= 1;
            acqp.f60518b = str2;
            C1240of ofVar = (C1240of) entry.getValue();
            if (ofVar != null) {
                Object obj = ofVar.f26798a;
                if (obj != null) {
                    int intValue = ((Integer) obj).intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    acqp acqp2 = (acqp) da.f164949b;
                    acqp2.f60517a = 2 | acqp2.f60517a;
                    acqp2.f60519c = intValue;
                }
                Object obj2 = ofVar.f26799b;
                if (obj2 != null) {
                    String str3 = (String) obj2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    acqp acqp3 = (acqp) da.f164949b;
                    str3.getClass();
                    acqp3.f60517a |= 4;
                    acqp3.f60520d = str3;
                }
            }
            arrayList.add((acqp) da.mo74062i());
        }
        acqb acqb = this.f84838f;
        if (a2 != null) {
            bxvd da2 = acqr.f60528c.mo74144da();
            bxvd da3 = acqq.f60521f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            acqq acqq = (acqq) da3.f164949b;
            acqq.f60523a |= 1;
            acqq.f60524b = true;
            if (!acqq.f60525c.mo73666a()) {
                acqq.f60525c = bxvk.m124021a(acqq.f60525c);
            }
            bxsy.m123078a(arrayList, acqq.f60525c);
            int b = (int) celr.f182913a.mo6606a().mo79282b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            acqq acqq2 = (acqq) da3.f164949b;
            acqq2.f60523a |= 2;
            acqq2.f60526d = b;
            boolean b2 = celr.m137191b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            acqq acqq3 = (acqq) da3.f164949b;
            acqq3.f60523a |= 4;
            acqq3.f60527e = b2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            acqr acqr = (acqr) da2.f164949b;
            acqq acqq4 = (acqq) da3.mo74062i();
            acqq4.getClass();
            acqr.f60531b = acqq4;
            acqr.f60530a |= 2;
            acqr acqr2 = (acqr) da2.mo74062i();
            bxvd da4 = acqo.f60510c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            acqo acqo = (acqo) da4.f164949b;
            acqr2.getClass();
            acqo.f60513b = acqr2;
            acqo.f60512a |= 2;
            acqo acqo2 = (acqo) da4.mo74062i();
            Context context = ((acqa) acqb).f60460a;
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            ClientContext clientContext = new ClientContext(myUid, a2, a2, packageName, packageName);
            clientContext.mo17806d((String) abzt.f59004x.mo58455c());
            acqs a5 = new acpy(clientContext, new acpz(context)).mo33010a(acqo2);
            if (a5 != null) {
                acqn = a5.f60534a;
                if (acqn == null) {
                    acqn = acqn.f60505c;
                }
            } else {
                acqn = null;
            }
        } else {
            acqn = null;
        }
        if (acqn == null) {
            absg.m48205e("Getting app params failed");
            aeat.m51532a(this.f84833a).mo33984a(m70924a(true));
        } else {
            if (celr.m137191b()) {
                int i = 5;
                bxvd bxvd = (bxvd) acqn.mo74142c(5);
                bxvd.mo73625a((bxvk) acqn);
                int i2 = 0;
                while (i2 < ((acqn) bxvd.f164949b).f60507a.size()) {
                    if (bxvd.mo73932A(i2).f60503f.size() != 0) {
                        if (!this.f84833a.getPackageName().equals(bxvd.mo73932A(i2).f60498a)) {
                            absg.m48206e("Invalid app name %s. Documents must be under gmscore package.", bxvd.mo73932A(i2).f60498a);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            acqm A = bxvd.mo73932A(i2);
                            bxvd bxvd2 = (bxvd) A.mo74142c(i);
                            bxvd2.mo73625a((bxvk) A);
                            int i3 = 0;
                            while (i3 < ((acqm) bxvd2.f164949b).f60503f.size()) {
                                acql acql = (acql) ((acqm) bxvd2.f164949b).f60503f.get(i3);
                                bxvd bxvd3 = (bxvd) acql.mo74142c(i);
                                bxvd3.mo73625a((bxvk) acql);
                                caef caef = ((acql) bxvd3.f164949b).f60494b;
                                if (caef == null) {
                                    caef = caef.f172809f;
                                }
                                bxvd bxvd4 = (bxvd) caef.mo74142c(i);
                                bxvd4.mo73625a((bxvk) caef);
                                caee caee = (caee) bxvd4;
                                caeb caeb = ((caef) caee.f164949b).f172815e;
                                if (caeb == null) {
                                    caeb = caeb.f172791g;
                                }
                                bxvd bxvd5 = (bxvd) caeb.mo74142c(i);
                                bxvd5.mo73625a((bxvk) caeb);
                                if (bxvd5.f164950c) {
                                    bxvd5.mo74035c();
                                    bxvd5.f164950c = false;
                                }
                                caeb caeb2 = (caeb) bxvd5.f164949b;
                                a2.getClass();
                                caeb2.f172793a |= 4;
                                caeb2.f172796d = a2;
                                if (caee.f164950c) {
                                    caee.mo74035c();
                                    caee.f164950c = false;
                                }
                                caef caef2 = (caef) caee.f164949b;
                                caeb caeb3 = (caeb) bxvd5.mo74062i();
                                caeb3.getClass();
                                caef2.f172815e = caeb3;
                                caef2.f172811a |= 4;
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                acql acql2 = (acql) bxvd3.f164949b;
                                caef caef3 = (caef) caee.mo74062i();
                                acql acql3 = acql.f60491d;
                                caef3.getClass();
                                acql2.f60494b = caef3;
                                acql2.f60493a |= 1;
                                int a6 = acqk.m49703a(((acql) bxvd3.f164949b).f60495c);
                                if (a6 != 0 && a6 == 2) {
                                    arrayList2.add(abyd.m48527a((caef) caee.mo74062i()));
                                } else {
                                    int a7 = acqk.m49703a(((acql) bxvd3.f164949b).f60495c);
                                    if (a7 != 0 && a7 == 3) {
                                        arrayList3.add(((caef) caee.f164949b).f172813c);
                                    }
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                acqm acqm = (acqm) bxvd2.f164949b;
                                acql acql4 = (acql) bxvd3.mo74062i();
                                acqm acqm2 = acqm.f60496g;
                                acql4.getClass();
                                if (!acqm.f60503f.mo73666a()) {
                                    acqm.f60503f = bxvk.m124021a(acqm.f60503f);
                                }
                                acqm.f60503f.set(i3, acql4);
                                i3++;
                                i = 5;
                            }
                            if (!arrayList2.isEmpty()) {
                                brhj.m114016a(this.f84833a).mo32869a((brhy[]) arrayList2.toArray(new brhy[arrayList2.size()]));
                            }
                            if (!arrayList3.isEmpty()) {
                                brhj.m114016a(this.f84833a).mo32870a((String[]) arrayList3.toArray(new String[arrayList3.size()]));
                            }
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            acqn acqn2 = (acqn) bxvd.f164949b;
                            acqm acqm3 = (acqm) bxvd2.mo74062i();
                            acqn acqn3 = acqn.f60505c;
                            acqm3.getClass();
                            if (!acqn2.f60507a.mo73666a()) {
                                acqn2.f60507a = bxvk.m124021a(acqn2.f60507a);
                            }
                            acqn2.f60507a.set(i2, acqm3);
                        }
                    }
                    i2++;
                    i = 5;
                }
                acqn = (acqn) bxvd.mo74062i();
            }
            this.f84834b.mo33019a(acqn);
        }
        absg.m48184a("UpdateAppParamsTask finished");
        return null;
    }
}

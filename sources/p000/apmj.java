package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: apmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apmj extends aplq {

    /* renamed from: a */
    public final abrv f84726a;

    public apmj(abrv abrv, abyy abyy) {
        super(bqbd.CLEAR_USAGE_REPORT_DATA, 1, 4, abrv.f58066b, null, abyy);
        this.f84726a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abrv abrv = this.f84726a;
        acpl acpl = abrv.f58067c;
        abva abva = new abva(abrv, true, false);
        acpl.mo32995d(abva);
        abva.mo32295h();
        acpl acpl2 = this.f84726a.f58067c;
        apmi apmi = new apmi(this, bqbd.CLEAR_USAGE_REPORT_DATA_INTERNAL, acrz.m49787b(this.f84726a.f58066b));
        acpl2.mo32995d(apmi);
        return !((Boolean) apmi.mo32295h()).booleanValue() ? Status.f30109c : Status.f30107a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return status;
    }
}

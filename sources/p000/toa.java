package p000;

import android.view.View;

/* renamed from: toa */
final /* synthetic */ class toa implements View.OnClickListener {

    /* renamed from: a */
    private final tof f46372a;

    /* renamed from: b */
    private final bskf f46373b;

    public toa(tof tof, bskf bskf) {
        this.f46372a = tof;
        this.f46373b = bskf;
    }

    public void onClick(View view) {
        tof tof = this.f46372a;
        bskf bskf = this.f46373b;
        tnx tnx = tof.f46394e;
        bytz b = tof.f46393d.mo70637b();
        tsc tsc = (tsc) adcj.m50162a(tnx.f46366b.getActivity(), tsi.m37432a(tnx.f46366b.getActivity(), tnx.f46366b.getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsc.class);
        tsc.f46577e = b;
        tsc.f46576d = bskf;
        tsl.m37443a(tnx.f46366b.getActivity()).mo26765a(5);
        tnx.f46367c.mo26715a(47019);
    }
}

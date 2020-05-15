package p000;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;

/* renamed from: bjlw */
final /* synthetic */ class bjlw implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final bjlx f122951a;

    public bjlw(bjlx bjlx) {
        this.f122951a = bjlx;
    }

    public final void onShow(DialogInterface dialogInterface) {
        View a;
        boolean z;
        bjlx bjlx = this.f122951a;
        long j = bjlx.getArguments().getLong("uiReference");
        bxvd da = bpss.f139006d.mo74144da();
        bxvd da2 = bpsq.f138998c.mo74144da();
        boolean z2 = false;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpsq bpsq = (bpsq) da2.f164949b;
        bpsq.f139000a |= 1;
        bpsq.f139001b = j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpss bpss = (bpss) da.f164949b;
        bpsq bpsq2 = (bpsq) da2.mo74062i();
        bpsq2.getClass();
        bpss.f139011c = bpsq2;
        bpss.f139009a |= 2;
        azah azah = bjlx.f122953d;
        aywj a2 = azah.f98831a.mo54505a(azaj.m85134a(azah.f98832b), bjlx.f122952c);
        a2.mo54480a(aywm.m84989a(bpst.f139012a, (bpss) da.mo74062i()));
        a2.mo54478a();
        aywp a3 = ayww.m85000a(azaj.m85134a(bjlx));
        bmxy.m108582a(a3, "Dialog root must be instrumented.");
        Fragment parentFragment = bjlx.getParentFragment();
        while (true) {
            if (parentFragment == null) {
                a = ayww.m84999a(bjlx.getActivity().getContainerActivity());
                break;
            }
            View view = parentFragment.getView();
            if (view != null) {
                a = view;
                break;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        aywp a4 = ayww.m85000a(a);
        if (a4 != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Parent fragment/activity must be instrumented");
        bmxy.m108589a(a3.f98637b instanceof ayww, "Cannot reparent synthetic nodes.");
        bmxy.m108589a(!a3.mo54486c(), "Node is already impressed.");
        ayww ayww = (ayww) a4.f98637b;
        if (ayww.f98663e == null) {
            ayww.f98663e = new ArrayList();
        }
        ayxi ayxi = a3.f98637b;
        bmxy.m108588a(ayww.f98663e.add(a3));
        aywp aywp = ayww.f98660b;
        bmxy.m108581a(aywp);
        ayww ayww2 = (ayww) ayxi;
        if (ayww2.f98662d == null) {
            z2 = true;
        }
        bmxy.m108601b(z2, "Already has a parent override, swapping prohibited");
        bmxy.m108601b(!ayww2.f98666h, "Isolated trees cannot have parents.");
        if (ayww2.f98664f) {
            bmxy.m108589a(((ayww) aywp.f98637b).f98665g, "Attached view node cannot be a child of a detached node.");
            ayww2.mo54495e();
        }
        ayww2.f98662d = aywp;
        if (ayww.f98664f) {
            ayxi.mo54494d();
        }
    }
}

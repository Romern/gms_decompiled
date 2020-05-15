package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;

/* renamed from: agvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvx extends acm implements agyr {

    /* renamed from: A */
    private final Handler f66683A = new adzt();

    /* renamed from: s */
    public final TextView f66684s;

    /* renamed from: t */
    public final ImageView f66685t;

    /* renamed from: u */
    public final Context f66686u;

    /* renamed from: v */
    public final agtw f66687v = agtw.m55116b();

    /* renamed from: w */
    public MdpCarrierPlanIdResponse f66688w;

    /* renamed from: x */
    public boolean f66689x = true;

    /* renamed from: y */
    public boolean f66690y;

    /* renamed from: z */
    private final TextView f66691z;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public agvx(View view) {
        super(view);
        this.f66686u = view.getContext();
        this.f66684s = (TextView) view.findViewById(C0126R.C0129id.carrier_text);
        this.f66685t = (ImageView) view.findViewById(C0126R.C0129id.carrier_logo);
        this.f66691z = (TextView) view.findViewById(C0126R.C0129id.expired_time);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C0126R.C0129id.progressbar);
    }

    /* renamed from: x */
    private final void m55194x() {
        this.f66691z.setVisibility(8);
        this.f66684s.setPadding(0, Math.round(agxf.m55214a(10.0f, this.f66686u)), 0, 0);
    }

    /* renamed from: a */
    public final void mo36147a(Bitmap bitmap, String str) {
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            this.f66683A.post(new agvw(this, bitmap, str));
        }
    }

    /* renamed from: v */
    public final void mo36150v() {
        this.f66683A.post(new agvv(this));
    }

    /* renamed from: w */
    public final void mo36151w() {
        agtw agtw = this.f66687v;
        if (agtw != null && agtw.f66529a != null) {
            synchronized (agtw.f66532d) {
                agtw.f66534f = true;
                if (agtw.f66533e) {
                    agtw.f66530b.setVisibility(8);
                    agtw.f66531c.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36148a(MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        MdpDataPlanStatus mdpDataPlanStatus;
        if (mdpDataPlanStatusResponse == null) {
            m55194x();
        } else if (cfmd.m140089i()) {
            this.f66691z.setText(agze.m55329a(this.f66686u, mdpDataPlanStatusResponse.mo44037a(), bxzt.m124580a(System.currentTimeMillis())));
            this.f66691z.setVisibility(0);
        } else {
            MdpDataPlanStatus[] mdpDataPlanStatusArr = mdpDataPlanStatusResponse.f80187b;
            if (mdpDataPlanStatusArr == null || mdpDataPlanStatusArr.length == 0 || (mdpDataPlanStatus = mdpDataPlanStatusArr[0]) == null) {
                m55194x();
            } else if (!this.f66690y || TextUtils.isEmpty(mdpDataPlanStatus.f80164c) || !agvn.m55185a(mdpDataPlanStatus.f80164c, this.f66686u, this.f66691z, C0126R.string.expiration_time_days_left_in_cycle)) {
                m55194x();
            } else {
                this.f66691z.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo36149a(String str) {
        if (TextUtils.isEmpty(str)) {
            mo36150v();
        }
        Bitmap bitmap = null;
        try {
            agps a = agpk.m54726a().mo35823a(Long.valueOf(this.f66688w.f80155e), str);
            if (a != null) {
                bitmap = a.mo35890d();
            }
        } catch (SQLiteException e) {
            new agzb(this.f66686u).mo36211a("Unexpected exception in reading logo from cache ", e);
        }
        if (bitmap == null) {
            new agys(this, str).start();
        } else {
            mo36147a(bitmap, str);
        }
    }
}

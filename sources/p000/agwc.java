package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import java.text.ParseException;

/* renamed from: agwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agwc extends agvo {

    /* renamed from: u */
    public static final srn f66698u = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: s */
    MdpDataPlanStatus f66699s;

    /* renamed from: t */
    public final Context f66700t;

    public agwc(View view) {
        super(view);
        this.f66700t = view.getContext();
    }

    /* renamed from: a */
    public void mo36134a(MdpDataPlanStatus mdpDataPlanStatus) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0140  */
    /* renamed from: a */
    public final void mo36156a(String str, String str2, Context context) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        MdpDataPlanStatus mdpDataPlanStatus = this.f66699s;
        long j = mdpDataPlanStatus.f80166e;
        if (!(j == 0 || j == Long.MAX_VALUE || j == Long.MIN_VALUE)) {
            long j2 = mdpDataPlanStatus.f80177p;
            if (j2 != Long.MIN_VALUE) {
                long j3 = j - j2;
                if (!agqg.m54838E().booleanValue()) {
                    agze.m55334a(sb, context.getString(C0126R.string.remaining_data, agvi.m55173a(context, j3), agvi.m55173a(context, j)));
                    z = true;
                } else if (!TextUtils.isEmpty(this.f66699s.f80173l)) {
                    agze.m55334a(sb, context.getString(C0126R.string.refresh_period_desc, this.f66699s.f80173l));
                    z = true;
                } else {
                    z = true;
                }
                if (cfnm.f184575a.mo6606a().mo81680m()) {
                    String str3 = this.f66699s.f80164c;
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            agze.m55334a(sb, context.getString(C0126R.string.expiration_timestamp, agze.m55331a(str3, context)));
                        } catch (ParseException e) {
                            e.getMessage();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f66699s.f80179r)) {
                    agze.m55334a(sb, this.f66699s.f80179r);
                }
                if (z) {
                    int i = this.f66699s.f80169h;
                    if (i == 1) {
                        agze.m55334a(sb, context.getString(C0126R.string.overusage_desc, agvi.m55173a(context, j), context.getString(C0126R.string.overusage_policy_throttled)));
                    } else if (i == 3) {
                        agze.m55334a(sb, context.getString(C0126R.string.overusage_desc, agvi.m55173a(context, j), context.getString(C0126R.string.overusage_policy_pay_as_you_go)));
                    }
                }
                if (sb.toString().isEmpty() && !TextUtils.isEmpty(str2)) {
                    agze.m55334a(sb, context.getString(C0126R.string.generic_desc, str2));
                }
                if (!cfnm.m140639j()) {
                    int i2 = Build.VERSION.SDK_INT;
                    AlertDialog create = new AlertDialog.Builder(context, C0126R.style.MdpDialogDefault).setTitle(str).setMessage(sb.toString()).setPositiveButton((int) C0126R.string.dialog_got_it, agvy.f66692a).create();
                    create.setOnShowListener(new agvz(create, context));
                    create.show();
                    return;
                }
                AlertDialog create2 = new AlertDialog.Builder(context).setTitle(str).setMessage(sb.toString()).setPositiveButton((int) C0126R.string.dialog_got_it, agwa.f66695a).create();
                create2.setOnShowListener(new agwb(create2, context));
                create2.show();
                return;
            }
        }
        z = false;
        if (cfnm.f184575a.mo6606a().mo81680m()) {
        }
        if (!TextUtils.isEmpty(this.f66699s.f80179r)) {
        }
        if (z) {
        }
        agze.m55334a(sb, context.getString(C0126R.string.generic_desc, str2));
        if (!cfnm.m140639j()) {
        }
    }
}

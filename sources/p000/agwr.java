package p000;

import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import java.text.ParseException;

/* renamed from: agwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwr extends agwc {

    /* renamed from: A */
    private final TextView f66737A;

    /* renamed from: B */
    private final TextView f66738B;

    /* renamed from: C */
    private final ImageView f66739C;

    /* renamed from: D */
    private final ImageView f66740D;

    /* renamed from: E */
    private final TextView f66741E;

    /* renamed from: F */
    private final FrameLayout f66742F;

    /* renamed from: G */
    private final ProgressBar f66743G;

    /* renamed from: v */
    public final TextView f66744v;

    /* renamed from: w */
    public Display f66745w = null;

    /* renamed from: x */
    public boolean f66746x;

    /* renamed from: y */
    public String f66747y = null;

    /* renamed from: z */
    private final TextView f66748z;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public agwr(View view) {
        super(view);
        this.f66744v = (TextView) view.findViewById(C0126R.C0129id.dataplan_name);
        this.f66748z = (TextView) view.findViewById(C0126R.C0129id.data_usage);
        this.f66737A = (TextView) view.findViewById(C0126R.C0129id.quota_bytes);
        this.f66738B = (TextView) view.findViewById(C0126R.C0129id.zero_bytes_textview);
        this.f66743G = (ProgressBar) view.findViewById(C0126R.C0129id.progressbar);
        this.f66742F = (FrameLayout) view.findViewById(C0126R.C0129id.progressbar_frame_layout);
        this.f66740D = (ImageView) view.findViewById(C0126R.C0129id.progress_indicator);
        this.f66739C = (ImageView) view.findViewById(C0126R.C0129id.dataplan_icon);
        this.f66741E = (TextView) view.findViewById(C0126R.C0129id.expired_time);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0306, code lost:
        if (p000.agze.m55341c(r0) < 0) goto L_0x030c;
     */
    /* renamed from: a */
    public final void mo36134a(MdpDataPlanStatus mdpDataPlanStatus) {
        float f;
        boolean z;
        long j;
        long j2;
        MdpDataPlanStatus mdpDataPlanStatus2 = mdpDataPlanStatus;
        this.f66699s = mdpDataPlanStatus2;
        this.f66744v.setText(agvn.m55182a(mdpDataPlanStatus2, ((agwc) this).f66700t));
        String str = mdpDataPlanStatus2.f80164c;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str)) {
            if (this.f66746x) {
                this.f66741E.setVisibility(0);
                agvn.m55184a(str, ((agwc) this).f66700t, this.f66741E);
                TextView textView = this.f66741E;
                String valueOf = String.valueOf(((agwc) this).f66700t.getString(C0126R.string.dataplan_viewholder_description_break, textView.getText()));
                textView.setText(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
            } else {
                this.f66741E.setVisibility(8);
            }
        }
        String str2 = mdpDataPlanStatus2.f80165d;
        if (!TextUtils.isEmpty(str2)) {
            try {
                int[] a = agsc.m55044a(str2);
                if (a != null) {
                    if (a.length > 0) {
                        this.f66739C.setImageResource(agvn.m55179a(a[0], this.f66699s.f80181t));
                    }
                }
            } catch (IllegalArgumentException e) {
                bnsl a2 = agwc.f66698u.mo26019b(agyt.m55307c());
                a2.mo68437a(e);
                a2.mo68420a("Data plan status returns invalid category string %s, won't show in UI", str2);
            }
        } else {
            agwc.f66698u.mo26019b(agyt.m55307c()).mo68405a("Data plan status returns empty category string, won't show type in UI");
        }
        long j3 = mdpDataPlanStatus2.f80166e;
        if (j3 != Long.MAX_VALUE) {
            MdpFlexTimeWindow[] mdpFlexTimeWindowArr = mdpDataPlanStatus2.f80168g;
            if (j3 == 0 && mdpFlexTimeWindowArr != null && mdpFlexTimeWindowArr.length > 0 && mdpFlexTimeWindowArr[0].f80197d == 100) {
                agvn.m55183a(this.f201a);
            } else {
                long j4 = mdpDataPlanStatus2.f80177p;
                String str3 = "";
                if (j4 == Long.MIN_VALUE) {
                    z = false;
                } else if (j4 <= 100000000000000L) {
                    String a3 = agvi.m55173a(((agwc) this).f66700t, j4);
                    long j5 = this.f66699s.f80177p;
                    if (j5 >= 0) {
                        this.f66748z.setText(((agwc) this).f66700t.getString(C0126R.string.dataplan_viewholder_description_data_left, a3));
                    } else {
                        this.f66748z.setTextAppearance(((agwc) this).f66700t, 16974319);
                        this.f66748z.setTextColor(((agwc) this).f66700t.getResources().getColor(C0126R.color.google_yellow_900));
                        this.f66748z.setText(((agwc) this).f66700t.getString(C0126R.string.dataplan_viewholder_description_data_overused, agvi.m55173a(((agwc) this).f66700t, -j5)));
                    }
                    str3 = ((agwc) this).f66700t.getString(C0126R.string.remaining_bytes_left, a3);
                    z = true;
                } else {
                    z = false;
                }
                if (j3 != Long.MIN_VALUE && j3 > 0 && j3 <= 100000000000000L) {
                    String a4 = agvi.m55173a(((agwc) this).f66700t, j3);
                    this.f66737A.setText(a4);
                    str3 = ((agwc) this).f66700t.getString(C0126R.string.usage_summary_of_quota, str3, a4);
                    if (z) {
                        if (j4 > j3) {
                            j4 = j3;
                        }
                        this.f66742F.setVisibility(0);
                        this.f66737A.setVisibility(0);
                        this.f66738B.setVisibility(0);
                        if (j4 < 0) {
                            j = j3 - j4;
                            int i = Build.VERSION.SDK_INT;
                            this.f66743G.setProgressBackgroundTintList(ColorStateList.valueOf(C1133kh.m17843b(((agwc) this).f66700t, C0126R.color.google_yellow_900)));
                            this.f66743G.setProgressBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
                            Point point = new Point();
                            this.f66745w.getSize(point);
                            this.f66743G.measure(View.MeasureSpec.makeMeasureSpec(point.x - Math.round(agxf.m55214a(96.0f, ((agwc) this).f66700t)), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(0, 0));
                            float measuredWidth = ((((float) this.f66743G.getMeasuredWidth()) * ((float) j4)) / ((float) j)) + ((float) Math.round(agxf.m55214a(0.0f, ((agwc) this).f66700t)));
                            this.f66737A.setTranslationX(measuredWidth);
                            this.f66748z.setTextAppearance(((agwc) this).f66700t, 16974319);
                            this.f66748z.setTextColor(((agwc) this).f66700t.getResources().getColor(C0126R.color.google_yellow_900));
                            this.f66740D.setVisibility(0);
                            this.f66740D.setTranslationX(measuredWidth);
                            j2 = j3;
                        } else {
                            this.f66740D.setVisibility(8);
                            int i2 = Build.VERSION.SDK_INT;
                            this.f66743G.setProgressBackgroundTintList(ColorStateList.valueOf(C1133kh.m17843b(((agwc) this).f66700t, C0126R.color.google_grey_300)));
                            this.f66743G.setProgressBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
                            j2 = j3 - j4;
                            j = j3;
                        }
                        if (j >= 2147483647L) {
                            this.f66743G.setMax(1000000000);
                            ProgressBar progressBar = this.f66743G;
                            double d = (double) j2;
                            double d2 = (double) j;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            progressBar.setProgress((int) ((d / d2) * 1.0E9d));
                        } else {
                            this.f66743G.setMax((int) j);
                            this.f66743G.setProgress((int) j2);
                        }
                        this.f66748z.setText(((agwc) this).f66700t.getString(C0126R.string.dataplan_viewholder_description_data_used, agvi.m55173a(((agwc) this).f66700t, j3 - j4)));
                    }
                }
                if (!TextUtils.isEmpty(mdpDataPlanStatus2.f80172k)) {
                    str3 = mdpDataPlanStatus2.f80172k;
                }
                if (!str3.isEmpty() && !TextUtils.isEmpty(this.f66699s.f80172k)) {
                    this.f66748z.setText(this.f66699s.f80172k);
                }
                this.f201a.setOnClickListener(new agwq(this));
            }
        } else {
            agvn.m55183a(this.f201a);
        }
        if (TextUtils.isEmpty(this.f66748z.getText()) && TextUtils.isEmpty(this.f66741E.getText())) {
            this.f66748z.setVisibility(8);
            this.f66741E.setVisibility(8);
            int round = Math.round(agxf.m55214a(10.0f, ((agwc) this).f66700t));
            this.f66744v.setPadding(0, round, 0, round);
        }
        boolean z3 = mdpDataPlanStatus2.f80181t;
        try {
            if (cfnm.m140632c()) {
                String str4 = mdpDataPlanStatus2.f80164c;
                if (str4 != null) {
                }
            }
        } catch (ParseException e2) {
        }
        z2 = z3;
        this.f66744v.setEnabled(z2);
        this.f66748z.setEnabled(z2);
        this.f66737A.setEnabled(z2);
        this.f66738B.setEnabled(z2);
        this.f66739C.setEnabled(z2);
        this.f66741E.setEnabled(z2);
        this.f66743G.setEnabled(z2);
        int i3 = Build.VERSION.SDK_INT;
        if (!z2) {
            this.f66743G.setProgressTintList(ColorStateList.valueOf(C1133kh.m17843b(((agwc) this).f66700t, C0126R.color.material_grey_black_1000)));
            this.f66743G.setProgressBackgroundTintList(ColorStateList.valueOf(C1133kh.m17843b(((agwc) this).f66700t, C0126R.color.google_grey_300)));
        }
        ImageView imageView = this.f66739C;
        if (!z2) {
            f = 0.38f;
        } else {
            f = 1.0f;
        }
        imageView.setAlpha(f);
        this.f66743G.setAlpha(f);
    }
}

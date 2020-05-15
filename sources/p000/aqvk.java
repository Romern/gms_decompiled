package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.smart_profile.header.view.HeaderView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvk implements aqvr, aqqr, aqrp, aqql {

    /* renamed from: g */
    private static final bnhe f86914g;

    /* renamed from: h */
    private static final bnhe f86915h;

    /* renamed from: a */
    public final Activity f86916a;

    /* renamed from: b */
    public final tim f86917b;

    /* renamed from: c */
    public final String f86918c;

    /* renamed from: d */
    public String f86919d;

    /* renamed from: e */
    public ArrayList f86920e;

    /* renamed from: f */
    public ArrayList f86921f;

    /* renamed from: i */
    private final boolean f86922i;

    /* renamed from: j */
    private final HeaderView f86923j;

    /* renamed from: k */
    private boolean f86924k;

    /* renamed from: l */
    private String f86925l;

    static {
        Integer valueOf = Integer.valueOf((int) C0126R.C0129id.quick_actions_hangout);
        Integer valueOf2 = Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_hangout_vd_theme_24);
        Integer valueOf3 = Integer.valueOf((int) C0126R.C0129id.quick_actions_call);
        Integer valueOf4 = Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_call_vd_theme_24);
        Integer valueOf5 = Integer.valueOf((int) C0126R.C0129id.quick_actions_email);
        Integer valueOf6 = Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_email_vd_theme_24);
        Integer valueOf7 = Integer.valueOf((int) C0126R.C0129id.quick_actions_schedule);
        f86914g = bnhe.m109411a(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_event_vd_theme_24));
        f86915h = bnhe.m109411a(valueOf, Integer.valueOf((int) C0126R.C0127drawable.quantum_gm_ic_videocam_vd_theme_24), valueOf3, Integer.valueOf((int) C0126R.C0127drawable.quantum_gm_ic_call_vd_theme_24), valueOf5, Integer.valueOf((int) C0126R.C0127drawable.quantum_gm_ic_email_vd_theme_24), valueOf7, Integer.valueOf((int) C0126R.C0127drawable.quantum_gm_ic_event_vd_theme_24));
    }

    public aqvk(Activity activity, HeaderView headerView, String str, tim tim, boolean z) {
        this.f86916a = activity;
        this.f86923j = headerView;
        this.f86918c = str;
        this.f86917b = tim;
        this.f86922i = z;
        this.f86925l = "";
        if (cgnz.m146325b()) {
            bnrd a = f86915h.keySet().iterator();
            while (a.hasNext()) {
                int intValue = ((Integer) a.next()).intValue();
                m72161a(intValue, C1391tv.m20459b(headerView.getContext(), ((Integer) f86915h.get(Integer.valueOf(intValue))).intValue()));
            }
            return;
        }
        bnrd a2 = f86914g.keySet().iterator();
        while (a2.hasNext()) {
            int intValue2 = ((Integer) a2.next()).intValue();
            m72161a(intValue2, C1391tv.m20459b(headerView.getContext(), ((Integer) f86914g.get(Integer.valueOf(intValue2))).intValue()));
            m72160a(intValue2, C1133kh.m17843b(activity, 17170443));
        }
    }

    /* renamed from: a */
    private final void m72159a(int i) {
        Button button = (Button) this.f86923j.findViewById(i);
        button.setEnabled(false);
        if (!cgnz.m146325b()) {
            button.setAlpha(0.5f);
        } else if (cgnt.m146316b()) {
            int a = thh.m36965a(button.getContext(), C0126R.attr.quickActionDisabledButtonColor);
            button.setTextColor(a);
            m72160a(i, a);
        } else {
            m72160a(i, C1133kh.m17843b(button.getContext(), C0126R.color.google_grey400));
        }
    }

    /* renamed from: b */
    private final void m72163b(int i, int i2) {
        View findViewById = this.f86923j.findViewById(i);
        if (findViewById.isEnabled()) {
            C1280ps.m19906b(findViewById, 1);
            findViewById.setContentDescription(this.f86916a.getString(i2, new Object[]{this.f86925l}));
            return;
        }
        C1280ps.m19906b(findViewById, 2);
    }

    /* renamed from: a */
    private final void m72160a(int i, int i2) {
        Button button = (Button) this.f86923j.findViewById(i);
        if (this.f86923j.getResources().getConfiguration().orientation == 2) {
            tey.m36888a(C1334rs.m20108b(button)[0], i2);
        } else {
            tey.m36888a(button.getCompoundDrawables()[1], i2);
        }
    }

    public aqvk(Activity activity, HeaderView headerView, String str, tim tim, boolean z, boolean z2) {
        this(activity, headerView, str, tim, z);
        if (cgnz.m146325b() && cgnh.m146281c() && z2) {
            headerView.findViewById(C0126R.C0129id.quick_actions_hangout).setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m72161a(int i, Drawable drawable) {
        Button button = (Button) this.f86923j.findViewById(i);
        if (this.f86923j.getResources().getConfiguration().orientation == 2) {
            C1334rs.m20107b(button, drawable, null, null, null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: a */
    private final void m72162a(int i, View.OnClickListener onClickListener) {
        Button button = (Button) this.f86923j.findViewById(i);
        button.setEnabled(true);
        button.setOnClickListener(onClickListener);
        if (cgnz.m146325b()) {
            if (cgmy.f187331a.mo6606a().mo84135f()) {
                int i2 = Build.VERSION.SDK_INT;
                m72160a(i, thh.m36966b(button.getContext()));
            } else {
                m72160a(i, thh.m36966b(button.getContext()));
            }
            if (cgnt.m146316b()) {
                int i3 = Build.VERSION.SDK_INT;
                button.setTextColor(thh.m36966b(button.getContext()));
                return;
            }
            return;
        }
        button.setAlpha(1.0f);
    }

    /* renamed from: a */
    public final void mo48046a(aqqs aqqs) {
        if (aqqs.mo48081a()) {
            this.f86925l = aqqs.f86614a;
        } else {
            this.f86925l = aqqs.mo48083c() ? aqqs.f86616c : "";
        }
        m72163b(C0126R.C0129id.quick_actions_hangout, C0126R.string.quick_actions_hangout_content_description);
        m72163b(C0126R.C0129id.quick_actions_email, C0126R.string.profile_communicate_email_with_address);
        m72163b(C0126R.C0129id.quick_actions_call, C0126R.string.profile_communicate_call);
        m72163b(C0126R.C0129id.quick_actions_schedule, C0126R.string.quick_actions_schedule_content_description);
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        if (aqqw.mo48087c()) {
            bzij bzij = aqqw.f86628d;
            boolean z = true;
            if (!bzij.f170193e) {
                String str = bzij.f170197i;
                this.f86919d = str;
                if (!this.f86922i || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f86918c)) {
                    m72159a((int) C0126R.C0129id.quick_actions_hangout);
                } else {
                    if (!cgnz.m146325b() || !cgmy.f187331a.mo6606a().mo84131b()) {
                        z = false;
                    }
                    Intent a = aqqk.m71970a(this.f86916a, this.f86919d, this.f86918c, z);
                    if (a == null || a.resolveActivity(this.f86916a.getPackageManager()) == null) {
                        m72159a((int) C0126R.C0129id.quick_actions_hangout);
                    } else {
                        m72162a((int) C0126R.C0129id.quick_actions_hangout, new aqvg(this, a, z));
                    }
                }
            } else {
                this.f86924k = true;
                m72159a((int) C0126R.C0129id.quick_actions_hangout);
                m72159a((int) C0126R.C0129id.quick_actions_email);
                m72159a((int) C0126R.C0129id.quick_actions_call);
                m72159a((int) C0126R.C0129id.quick_actions_schedule);
                return;
            }
        }
        m72163b(C0126R.C0129id.quick_actions_hangout, C0126R.string.quick_actions_hangout_content_description);
    }

    /* renamed from: a */
    public final void mo48048a(List list, List list2, List list3) {
        if (!this.f86924k) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = 1;
                if (i >= size) {
                    break;
                }
                bzhq bzhq = (bzhq) list.get(i);
                Bundle bundle = new Bundle();
                if (cgnz.m146325b()) {
                    bundle.putString("extraValue", bzhq.f170104b);
                    bundle.putString("extraFormattedType", bzhq.f170105c);
                    Context context = this.f86923j.getContext();
                    int a = bzhp.m125803a(bzhq.f170106d);
                    if (a != 0) {
                        i2 = a;
                    }
                    bundle.putString("extraSourceContext", tfm.m36910a(context, i2));
                } else {
                    bundle.putString("extraValue", bzhq.f170104b);
                    bundle.putString("extraFormattedType", bzhq.f170105c);
                }
                arrayList.add(bundle);
                i++;
            }
            this.f86920e = arrayList;
            if (!arrayList.isEmpty()) {
                Intent data = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:"));
                if (data.resolveActivity(this.f86916a.getPackageManager()) != null) {
                    m72162a((int) C0126R.C0129id.quick_actions_email, new aqvh(this, data));
                } else {
                    m72159a((int) C0126R.C0129id.quick_actions_email);
                }
                Intent data2 = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
                if (data2.resolveActivity(this.f86916a.getPackageManager()) != null) {
                    m72162a((int) C0126R.C0129id.quick_actions_schedule, new aqvi(this, data2));
                } else {
                    m72159a((int) C0126R.C0129id.quick_actions_schedule);
                }
            } else {
                m72159a((int) C0126R.C0129id.quick_actions_email);
                m72159a((int) C0126R.C0129id.quick_actions_schedule);
            }
            m72163b(C0126R.C0129id.quick_actions_email, C0126R.string.profile_communicate_email_with_address);
            m72163b(C0126R.C0129id.quick_actions_schedule, C0126R.string.quick_actions_schedule_content_description);
            ArrayList arrayList2 = new ArrayList();
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bzhr bzhr = (bzhr) list2.get(i3);
                Bundle bundle2 = new Bundle();
                if (cgnz.m146325b()) {
                    bundle2.putString("extraValue", bzhr.f170110b);
                    bundle2.putString("extraFormattedType", bzhr.f170111c);
                    Context context2 = this.f86923j.getContext();
                    int a2 = bzhp.m125803a(bzhr.f170112d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    bundle2.putString("extraSourceContext", tfm.m36910a(context2, a2));
                } else {
                    bundle2.putString("extraValue", bzhr.f170110b);
                    bundle2.putString("extraFormattedType", bzhr.f170111c);
                }
                arrayList2.add(bundle2);
            }
            this.f86921f = arrayList2;
            Intent intent = new Intent("android.intent.action.DIAL");
            if (arrayList2.isEmpty() || intent.resolveActivity(this.f86916a.getPackageManager()) == null) {
                m72159a((int) C0126R.C0129id.quick_actions_call);
            } else {
                m72162a((int) C0126R.C0129id.quick_actions_call, new aqvj(this, intent));
            }
            m72163b(C0126R.C0129id.quick_actions_call, C0126R.string.profile_communicate_call);
        }
    }

    /* renamed from: a */
    public final void mo48049a(boolean z) {
        if (cgnz.m146325b() && cgnb.f187343a.mo6606a().mo84145e() && z) {
            m72159a((int) C0126R.C0129id.quick_actions_hangout);
        }
    }
}

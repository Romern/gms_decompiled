package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: aqvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvf implements aqqr, aqpp, aqvr, aqql {

    /* renamed from: a */
    public final HeaderView f86900a;

    /* renamed from: b */
    private final tim f86901b;

    /* renamed from: c */
    private boolean f86902c;

    /* renamed from: d */
    private boolean f86903d;

    /* renamed from: e */
    private String f86904e;

    public aqvf(HeaderView headerView, tim tim) {
        this.f86900a = headerView;
        this.f86901b = tim;
        tim.mo26569b(tio.SMART_PROFILE_HEADER, new tio[0]);
    }

    /* renamed from: a */
    private final void m72154a() {
        if (TextUtils.isEmpty(this.f86904e)) {
            return;
        }
        if (this.f86902c) {
            HeaderView headerView = this.f86900a;
            String str = this.f86904e;
            headerView.mo59018a(headerView.getContext().getString(C0126R.string.header_self_view_display_name, str));
            this.f86901b.mo26569b(tio.YOU_LABEL, tio.SMART_PROFILE_HEADER);
            return;
        }
        this.f86900a.mo59018a(this.f86904e);
    }

    /* renamed from: a */
    public final void mo48036a(Bitmap bitmap) {
        if (!this.f86903d) {
            Bitmap a = rzl.m34706a(bitmap);
            HeaderView headerView = this.f86900a;
            headerView.f107759a.setImageDrawable(new BitmapDrawable(headerView.getResources(), a));
            if (!headerView.f107768j) {
                tey.m36893a(headerView.f107759a);
                tey.m36895b(headerView.f107760b);
            }
            headerView.f107768j = true;
        }
    }

    /* renamed from: a */
    public final void mo48046a(aqqs aqqs) {
        if (aqqs.mo48081a()) {
            this.f86904e = aqqs.f86614a;
            m72154a();
        } else if (aqqs.mo48083c()) {
            this.f86904e = aqqs.f86616c;
            m72154a();
        }
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        boolean z;
        if (aqqw.mo48087c()) {
            bzij bzij = aqqw.f86628d;
            int i = 0;
            if (bzij.f170193e) {
                this.f86903d = true;
                HeaderView headerView = this.f86900a;
                tey.m36893a(headerView.f107762d.findViewById(C0126R.C0129id.profile_header_blocked_avatar_icon));
                if (headerView.f107768j) {
                    tey.m36895b(headerView.f107759a);
                    headerView.f107768j = false;
                } else {
                    tey.m36895b(headerView.f107760b);
                }
                this.f86900a.mo59022d();
            } else if (cgnz.m146325b()) {
                HeaderView headerView2 = this.f86900a;
                String str = bzij.f170194f;
                String str2 = bzij.f170195g;
                String str3 = bzij.f170196h;
                if (!TextUtils.isEmpty(str)) {
                    ((TextView) headerView2.f107762d.findViewById(C0126R.C0129id.job_title)).setText(str);
                    tey.m36893a(headerView2.findViewById(C0126R.C0129id.job_title));
                }
                if (!TextUtils.isEmpty(str2)) {
                    ((TextView) headerView2.f107762d.findViewById(C0126R.C0129id.department)).setText(str2);
                    tey.m36893a(headerView2.findViewById(C0126R.C0129id.department));
                }
                if (!TextUtils.isEmpty(str3)) {
                    ((TextView) headerView2.f107762d.findViewById(C0126R.C0129id.organization)).setText(str3);
                    tey.m36893a(headerView2.findViewById(C0126R.C0129id.organization));
                }
                bnre i2 = (headerView2.f107764f ? bngx.m109358a(Integer.valueOf((int) C0126R.C0129id.job_title), Integer.valueOf((int) C0126R.C0129id.department), Integer.valueOf((int) C0126R.C0129id.organization)) : bngx.m109357a(Integer.valueOf((int) C0126R.C0129id.department), Integer.valueOf((int) C0126R.C0129id.organization))).listIterator();
                while (true) {
                    if (!i2.hasNext()) {
                        break;
                    }
                    TextView textView = (TextView) headerView2.f107762d.findViewById(((Integer) i2.next()).intValue());
                    if (textView.getVisibility() == 0) {
                        Drawable[] b = C1334rs.m20108b(textView);
                        C1334rs.m20105a(textView, null, b[1], b[2], b[3]);
                        break;
                    }
                }
            } else {
                HeaderView headerView3 = this.f86900a;
                String str4 = bzij.f170194f;
                String str5 = bzij.f170195g;
                String str6 = bzij.f170196h;
                String str7 = bzij.f170191c;
                if (!TextUtils.isEmpty(str4)) {
                    headerView3.mo59017a(C0126R.C0129id.job_title, str4);
                    z = true;
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(str5)) {
                    headerView3.mo59017a(C0126R.C0129id.department, str5);
                    z = true;
                }
                if (!TextUtils.isEmpty(str6)) {
                    headerView3.mo59017a(C0126R.C0129id.organization, str6);
                    z = true;
                }
                if (!TextUtils.isEmpty(str7)) {
                    headerView3.mo59017a(C0126R.C0129id.domain_name, str7);
                    z = true;
                }
                int[] iArr = headerView3.f107764f ? new int[]{C0126R.C0129id.job_title, C0126R.C0129id.department, C0126R.C0129id.organization, C0126R.C0129id.domain_name} : new int[]{C0126R.C0129id.department, C0126R.C0129id.organization, C0126R.C0129id.domain_name};
                int length = iArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    TextView textView2 = (TextView) headerView3.f107762d.findViewById(iArr[i]);
                    if (textView2.getVisibility() == 0) {
                        Drawable[] b2 = C1334rs.m20108b(textView2);
                        C1334rs.m20105a(textView2, null, b2[1], b2[2], b2[3]);
                        break;
                    }
                    i++;
                }
                if (z) {
                    tey.m36893a(headerView3.findViewById(C0126R.C0129id.about_container));
                }
            }
            if (!bzij.f170191c.isEmpty()) {
                HeaderView headerView4 = this.f86900a;
                headerView4.f107769k = true;
                int i3 = Build.VERSION.SDK_INT;
                tey.m36893a((ImageView) headerView4.findViewById(C0126R.C0129id.domain_icon));
            }
        }
    }

    /* renamed from: a */
    public final void mo48049a(boolean z) {
        this.f86902c = z;
        m72154a();
    }
}

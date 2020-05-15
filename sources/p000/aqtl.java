package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: aqtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqtl implements aqtc, aquo {

    /* renamed from: a */
    private final bzjt f86771a;

    /* renamed from: b */
    private final Context f86772b;

    /* renamed from: c */
    private final aquk f86773c;

    /* renamed from: d */
    private final aqup f86774d;

    /* renamed from: e */
    private final tim f86775e;

    public aqtl(Context context, BaseCardView baseCardView, bzjt bzjt, tim tim, Bundle bundle) {
        boolean z;
        boolean z2;
        String str;
        this.f86772b = context;
        this.f86771a = bzjt;
        this.f86775e = tim;
        this.f86773c = new aquk(context, C1391tv.m20459b(context, C0126R.C0127drawable.group_divider));
        if (bzjt.f170348b.size() == 0 && bzjt.f170347a.size() == 0) {
            this.f86774d = null;
            baseCardView.setVisibility(8);
            return;
        }
        if (this.f86771a.f170347a.size() != 0) {
            Context context2 = this.f86772b;
            aquk aquk = new aquk(context2, C0126R.string.profile_organizations_employment_header, 1, C1391tv.m20459b(context2, C0126R.C0127drawable.entry_divider));
            bxwc bxwc = this.f86771a.f170347a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bzjs bzjs = (bzjs) bxwc.get(i);
                if (bzjs.f170338c.isEmpty() || bzjs.f170336a.isEmpty()) {
                    str = !bzjs.f170338c.isEmpty() ? bzjs.f170338c : bzjs.f170336a;
                } else {
                    str = this.f86772b.getString(C0126R.string.profile_employment_current_details, bzjs.f170338c, bzjs.f170336a);
                }
                aquk.mo48158a(m72071a(str, m72073a(bzjs)));
            }
            this.f86773c.mo48158a(aquk);
        }
        if (this.f86771a.f170348b.size() != 0) {
            Context context3 = this.f86772b;
            aquk aquk2 = new aquk(context3, C0126R.string.profile_organizations_education_header, 1, C1391tv.m20459b(context3, C0126R.C0127drawable.entry_divider));
            bxwc bxwc2 = this.f86771a.f170348b;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bzjs bzjs2 = (bzjs) bxwc2.get(i2);
                StringBuilder sb = new StringBuilder();
                if (!bzjs2.f170336a.isEmpty()) {
                    sb.append(bzjs2.f170336a);
                }
                if (!bzjs2.f170338c.isEmpty()) {
                    sb.append(" • ");
                    sb.append(bzjs2.f170338c);
                }
                if (!bzjs2.f170337b.isEmpty()) {
                    sb.append(", ");
                    sb.append(bzjs2.f170337b);
                }
                aquk2.mo48158a(m72071a(sb.toString(), m72073a(bzjs2)));
            }
            this.f86773c.mo48158a(aquk2);
        }
        if (bundle == null || !bundle.getBoolean("organizationsCardController")) {
            z = false;
        } else {
            z = true;
        }
        aquk aquk3 = this.f86773c;
        if (bzjt.f170347a.size() > 1 || bzjt.f170348b.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f86774d = new aqup(baseCardView, aquk3, this, z2, z);
    }

    /* renamed from: a */
    private final aquq m72071a(String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f86772b).inflate((int) C0126R.C0128layout.organizations_entry, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(C0126R.C0129id.text)).setText(str);
        if (!TextUtils.isEmpty(str2)) {
            ((TextView) viewGroup.findViewById(C0126R.C0129id.subtext)).setText(str2);
        } else {
            viewGroup.findViewById(C0126R.C0129id.subtext).setVisibility(8);
        }
        aquq aquq = new aquq(viewGroup);
        aquq.mo48164a(str);
        return aquq;
    }

    /* renamed from: b */
    public final void mo48140b() {
        this.f86775e.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_ORGANIZATIONS_CARD);
    }

    /* renamed from: a */
    private static final String m72072a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(tew.f45804a);
        return simpleDateFormat.format(new Date(j));
    }

    /* renamed from: a */
    private final String m72073a(bzjs bzjs) {
        if (bzjs.f170343h) {
            long j = bzjs.f170339d;
            if (j == 0) {
                return this.f86772b.getString(C0126R.string.organizations_present);
            }
            return this.f86772b.getString(C0126R.string.organizations_start_to_present, m72072a(j));
        }
        long j2 = bzjs.f170339d;
        if (j2 == 0 || bzjs.f170341f == 0) {
            long j3 = bzjs.f170341f;
            if (j3 != 0) {
                return m72072a(j3);
            }
            return null;
        }
        return this.f86772b.getString(C0126R.string.organizations_start_to_end, m72072a(j2), m72072a(bzjs.f170341f));
    }

    /* renamed from: a */
    public final void mo48139a() {
        this.f86775e.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_ORGANIZATIONS_CARD);
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        aqup aqup = this.f86774d;
        if (aqup != null) {
            bundle.putBoolean("organizationsCardController", aqup.f86846b);
        }
    }
}

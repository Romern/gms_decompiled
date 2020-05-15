package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.SubscriptionPlan;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* renamed from: agyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyo {

    /* renamed from: c */
    private static final srn f66870c = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final SubscriptionManager f66871a;

    /* renamed from: b */
    private final Context f66872b;

    public agyo() {
        rpr b = rpr.m34216b();
        int i = Build.VERSION.SDK_INT;
        this.f66872b = b;
        this.f66871a = SubscriptionManager.from(b);
    }

    /* renamed from: a */
    private static final SubscriptionPlan m55263a(MdpDataPlanStatus mdpDataPlanStatus) {
        SubscriptionPlan.Builder builder;
        int i = 1;
        try {
            builder = SubscriptionPlan.Builder.createNonrecurring(ZonedDateTime.of(1993, 4, 22, 21, 40, 0, 0, ZoneId.systemDefault()), agze.m55342d(mdpDataPlanStatus.f80164c));
        } catch (ParseException e) {
            ((bnsl) f66870c.mo68388c()).mo68420a("Expiration time %s wrong format. Platform plan changes to default recurring type", mdpDataPlanStatus.f80164c);
            builder = SubscriptionPlan.Builder.createRecurringMonthly(ZonedDateTime.now(ZoneId.systemDefault()).withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0).withNano(0));
        }
        builder.setTitle(mdpDataPlanStatus.f80163b);
        builder.setSummary(mdpDataPlanStatus.f80179r);
        try {
            long j = mdpDataPlanStatus.f80166e;
            if (j == Long.MIN_VALUE) {
                j = -1;
            } else if (j == Long.MAX_VALUE) {
                j = Long.MAX_VALUE;
            }
            int i2 = mdpDataPlanStatus.f80169h;
            if (i2 == 1) {
                i = 2;
            } else if (i2 == 2) {
                i = 0;
            } else if (i2 != 3) {
                i = -1;
            }
            builder.setDataLimit(j, i);
        } catch (IllegalArgumentException e2) {
            bnsl bnsl = (bnsl) f66870c.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68416a("QuotaBytes <%d> or policy <%d> cannot be converted SubscriptionPlan.", mdpDataPlanStatus.f80166e, mdpDataPlanStatus.f80169h);
        }
        try {
            if (!m55265a(mdpDataPlanStatus.f80166e) || !m55265a(mdpDataPlanStatus.f80177p)) {
                builder.setDataUsage(1, mdpDataPlanStatus.f80176o);
            } else {
                builder.setDataUsage(mdpDataPlanStatus.f80166e - mdpDataPlanStatus.f80177p, mdpDataPlanStatus.f80176o);
            }
        } catch (IllegalArgumentException e3) {
            ((bnsl) f66870c.mo68388c()).mo68405a("Data usage or time is negative in subscription plan");
        }
        return builder.build();
    }

    /* renamed from: a */
    private static final boolean m55265a(long j) {
        return (j == Long.MIN_VALUE || j == Long.MAX_VALUE) ? false : true;
    }

    /* renamed from: a */
    private final boolean m55264a() {
        if (this.f66872b.getPackageName().equals("com.google.android.gms")) {
            return agqg.m54841H().booleanValue();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo36192a(MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        int i;
        ArrayList arrayList;
        int i2 = Build.VERSION.SDK_INT;
        if (m55264a()) {
            int i3 = Build.VERSION.SDK_INT;
            if (this.f66871a != null) {
                try {
                    i = SubscriptionManager.getDefaultDataSubscriptionId();
                } catch (SecurityException e) {
                    bnsl bnsl = (bnsl) f66870c.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Failed to get default data subscription ID");
                    i = -1;
                }
            } else {
                i = -1;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (m55264a()) {
                MdpDataPlanStatus[] mdpDataPlanStatusArr = mdpDataPlanStatusResponse.f80187b;
                if (mdpDataPlanStatusArr == null) {
                    arrayList = new ArrayList();
                } else {
                    int length = mdpDataPlanStatusArr.length;
                    ArrayList arrayList2 = new ArrayList(length);
                    for (MdpDataPlanStatus mdpDataPlanStatus : mdpDataPlanStatusArr) {
                        SubscriptionPlan a = m55263a(mdpDataPlanStatus);
                        if (a != null) {
                            arrayList2.add(a);
                        } else {
                            ((bnsl) f66870c.mo68388c()).mo68420a("Carrier's plan cannot be written to the platform. Plan: {%s}", mdpDataPlanStatus);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (i != -1 && !arrayList.isEmpty()) {
                    try {
                        this.f66871a.setSubscriptionPlans(i, arrayList);
                    } catch (SecurityException e2) {
                        bnsl bnsl2 = (bnsl) f66870c.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68405a("Failed to update Android Settings data usage");
                    }
                }
            }
        }
    }
}

package p000;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.locationsharing.common.p052ui.DisableableFrameLayout;
import com.google.android.gms.locationsharing.settings.LocationShareView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aevn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevn extends abh {

    /* renamed from: a */
    public final LocationSharingSettings f63903a;

    /* renamed from: d */
    protected final Context f63904d;

    /* renamed from: e */
    public boolean f63905e = true;

    /* renamed from: f */
    public final Handler f63906f = new adzt();

    /* renamed from: g */
    private final aevj f63907g;

    /* renamed from: h */
    private final aevj f63908h;

    /* renamed from: i */
    private final aevl f63909i;

    /* renamed from: j */
    private View.OnClickListener f63910j;

    /* renamed from: k */
    private final Runnable f63911k = new aevk(this);

    public aevn(Context context, LocationSharingSettings locationSharingSettings, aeux aeux, aevl aevl) {
        this.f63903a = locationSharingSettings;
        this.f63904d = context;
        this.f63909i = aevl;
        String string = context.getString(C0126R.string.location_sharing_people_title);
        String string2 = context.getString(C0126R.string.location_sharing_settings_general_title_extended);
        String string3 = context.getString(C0126R.string.location_sharing_shared_links_title);
        String string4 = context.getString(C0126R.string.location_sharing_shared_links_description);
        if (locationSharingSettings != null) {
            this.f63907g = m52599a(string, string2, locationSharingSettings.f79632b, aeux);
            this.f63908h = m52599a(string3, string4, locationSharingSettings.f79633c, aeux);
        } else {
            this.f63907g = null;
            this.f63908h = null;
        }
        m52602f();
        mo34612c();
    }

    /* renamed from: a */
    protected static final aevj m52599a(String str, String str2, List list, aeux aeux) {
        return new aevj(str, str2, list, aeux);
    }

    /* renamed from: c */
    private final Pair m52600c(LocationShare locationShare) {
        int i;
        if (this.f63910j != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (locationShare.mo43760f()) {
            return Pair.create(this.f63903a.f79633c, Integer.valueOf(i + this.f63907g.mo161a()));
        }
        return Pair.create(this.f63903a.f79632b, Integer.valueOf(i));
    }

    /* renamed from: f */
    private final aevm m52601f(int i) {
        if (this.f63910j != null && i == 0) {
            return aevm.LH_HEADER;
        }
        if (i == mo161a() - 1) {
            return aevm.FOOTER;
        }
        Pair g = m52603g(i);
        return ((aevj) g.first).mo34602f(((Integer) g.second).intValue());
    }

    /* renamed from: g */
    private final Pair m52603g(int i) {
        if (this.f63910j != null) {
            i--;
        }
        int a = this.f63907g.mo161a();
        if (a == 0) {
            return Pair.create(this.f63908h, Integer.valueOf(i));
        }
        if (i > a - 1) {
            return Pair.create(this.f63908h, Integer.valueOf(i - a));
        }
        return Pair.create(this.f63907g, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo34609b(LocationShare locationShare) {
        locationShare.mo43754a(1);
        Pair c = m52600c(locationShare);
        List list = (List) c.first;
        int intValue = ((Integer) c.second).intValue();
        int indexOf = list.indexOf(locationShare);
        if (indexOf == -1) {
            int a = this.f63903a.mo43765a(locationShare);
            if (list.size() == 1) {
                mo177c(intValue, 3);
                m52602f();
                return;
            }
            mo159N(intValue + a + 1);
            return;
        }
        list.remove(indexOf);
        int a2 = this.f63903a.mo43765a(locationShare) + intValue + 1;
        mo173b(intValue + indexOf + 1, a2);
        mo158M(a2);
    }

    /* renamed from: d */
    public final void mo34613d() {
        Handler handler = this.f63906f;
        if (handler != null) {
            handler.removeCallbacks(this.f63911k);
        }
    }

    /* renamed from: e */
    public final void mo34614e() {
        int i;
        if (this.f63903a != null) {
            if (this.f63910j == null) {
                i = 0;
            } else {
                i = 1;
            }
            ArrayList arrayList = new ArrayList();
            List list = this.f63903a.f79632b;
            for (int i2 = 0; i2 < list.size(); i2++) {
                SharingCondition sharingCondition = ((LocationShare) list.get(i2)).f79628b;
                if (sharingCondition.mo43781c() == 2) {
                    if (sharingCondition.mo43780b() < 0) {
                        arrayList.add((LocationShare) list.get(i2));
                    } else {
                        mo165a(i2 + 1 + i, Boolean.valueOf(this.f63905e));
                    }
                }
            }
            int a = i + this.f63907g.mo161a();
            List list2 = this.f63903a.f79633c;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                SharingCondition sharingCondition2 = ((LocationShare) list2.get(i3)).f79628b;
                if (sharingCondition2.mo43781c() == 2) {
                    if (sharingCondition2.mo43780b() < 0) {
                        arrayList.add((LocationShare) list2.get(i3));
                    } else {
                        mo165a(i3 + 1 + a, Boolean.valueOf(this.f63905e));
                    }
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                mo34607a((LocationShare) arrayList.get(i4));
            }
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        if (this.f63903a == null) {
            return 0;
        }
        int a = this.f63907g.mo161a() + this.f63908h.mo161a();
        return this.f63910j != null ? a + 1 : a;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return m52601f(i).ordinal();
    }

    /* renamed from: f */
    private final void m52602f() {
        LocationSharingSettings locationSharingSettings;
        aevl aevl = this.f63909i;
        if (aevl != null && (locationSharingSettings = this.f63903a) != null) {
            aevl.mo34604c(locationSharingSettings.mo43766a().isEmpty());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f63904d).inflate(aevm.values()[i].f63902f, (ViewGroup) null);
        DisableableFrameLayout disableableFrameLayout = new DisableableFrameLayout(this.f63904d);
        disableableFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        disableableFrameLayout.addView(inflate);
        aeut aeut = new aeut(inflate, disableableFrameLayout);
        aeut.mo34585b(true);
        return aeut;
    }

    /* renamed from: c */
    public final void mo34612c() {
        mo34613d();
        mo34614e();
        long currentTimeMillis = System.currentTimeMillis();
        long a = aeya.m52671a(TimeUnit.MINUTES.toMillis(1) + currentTimeMillis) - currentTimeMillis;
        Handler handler = this.f63906f;
        if (handler != null) {
            handler.postDelayed(this.f63911k, a);
        }
    }

    /* renamed from: b */
    public final void mo34610b(LocationShare locationShare, boolean z) {
        if (locationShare.mo43761g() != z) {
            Pair c = m52600c(locationShare);
            List list = (List) c.first;
            int intValue = ((Integer) c.second).intValue();
            int indexOf = list.indexOf(locationShare);
            ((LocationShare) list.get(indexOf)).mo43754a(!z ? 4 : 1);
            mo158M(intValue + indexOf + 1);
        }
    }

    /* renamed from: b */
    public final void mo34611b(boolean z) {
        if (z != this.f63905e) {
            this.f63905e = z;
            this.f63907g.f63890a = z;
            this.f63908h.f63890a = z;
            mo164a(0, mo161a(), Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo169a(acm acm, int i, List list) {
        aeut aeut = (aeut) acm;
        if (list == null || list.isEmpty()) {
            mo168a(aeut, i);
            return;
        }
        aeut.mo34585b(((Boolean) list.get(0)).booleanValue());
        if (m52601f(i) == aevm.LOCATION_SHARE) {
            ((LocationShareView) aeut.f63869s).mo43803a();
        }
    }

    /* renamed from: a */
    public final void mo168a(aeut aeut, int i) {
        if (this.f63910j != null && i == 0) {
            aeut.f201a.findViewById(C0126R.C0129id.history_button).setOnClickListener(this.f63910j);
        } else if (i != mo161a() - 1) {
            Pair g = m52603g(i);
            ((aevj) g.first).mo168a(aeut, ((Integer) g.second).intValue());
        } else {
            aexz.m52670a((TextView) aeut.f63869s.findViewById(C0126R.C0129id.footer_text));
        }
    }

    /* renamed from: a */
    public final void mo34606a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = this.f63910j;
        if (onClickListener2 == null && onClickListener != null) {
            mo159N(0);
        } else if (onClickListener2 != null && onClickListener == null) {
            mo160O(0);
        } else if (onClickListener != null) {
            mo158M(0);
        }
        this.f63910j = onClickListener;
    }

    /* renamed from: a */
    public final void mo34607a(LocationShare locationShare) {
        Pair c = m52600c(locationShare);
        List list = (List) c.first;
        int intValue = ((Integer) c.second).intValue();
        int indexOf = list.indexOf(locationShare);
        list.remove(locationShare);
        if (list.isEmpty()) {
            if (intValue != 0) {
                mo178d(intValue - 1, 3);
            } else {
                mo178d(0, 3);
            }
            m52602f();
            return;
        }
        mo160O(intValue + indexOf + 1);
    }

    /* renamed from: a */
    public final void mo34608a(LocationShare locationShare, boolean z) {
        int i;
        Pair c = m52600c(locationShare);
        List list = (List) c.first;
        int intValue = ((Integer) c.second).intValue();
        if (list.indexOf(locationShare) == -1) {
            if (!z) {
                i = 3;
            } else {
                i = 1;
            }
            locationShare.mo43754a(i);
            int a = this.f63903a.mo43765a(locationShare);
            if (list.size() == 1) {
                mo177c(intValue, 3);
                m52602f();
                return;
            }
            mo159N(intValue + a + 1);
            return;
        }
        mo34610b(locationShare, z);
    }
}

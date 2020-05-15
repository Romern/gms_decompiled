package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.settings.LocationShareView;
import java.util.List;

/* renamed from: aevj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevj extends abh {

    /* renamed from: a */
    public boolean f63890a = true;

    /* renamed from: d */
    private final String f63891d;

    /* renamed from: e */
    private final String f63892e;

    /* renamed from: f */
    private final List f63893f;

    /* renamed from: g */
    private final aeux f63894g;

    public aevj(String str, String str2, List list, aeux aeux) {
        this.f63891d = str;
        this.f63892e = str2;
        this.f63893f = list;
        this.f63894g = aeux;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f63893f;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f63893f.size() + 2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final aevm mo34602f(int i) {
        int size = this.f63893f.size();
        if (i == 0) {
            return aevm.HEADER;
        }
        if (i != size + 1) {
            return aevm.LOCATION_SHARE;
        }
        return aevm.DIVIDER;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return mo34602f(i).ordinal();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo169a(acm acm, int i, List list) {
        aeut aeut = (aeut) acm;
        if (list == null || list.isEmpty()) {
            mo168a(aeut, i);
            return;
        }
        aeut.mo34585b(((Boolean) list.get(0)).booleanValue());
        if (mo34602f(i) == aevm.LOCATION_SHARE) {
            ((LocationShareView) aeut.f63869s).mo43803a();
        }
    }

    /* renamed from: a */
    public final void mo168a(aeut aeut, int i) {
        int i2;
        aeut.mo34585b(this.f63890a);
        aevm f = mo34602f(i);
        aevm aevm = aevm.LH_HEADER;
        int ordinal = f.ordinal();
        if (ordinal == 1) {
            View view = aeut.f63869s;
            ((TextView) view.findViewById(C0126R.C0129id.title)).setText(this.f63891d);
            ((TextView) view.findViewById(C0126R.C0129id.description)).setText(this.f63892e);
        } else if (ordinal == 2) {
            LocationShare locationShare = (LocationShare) this.f63893f.get(i - 1);
            LocationShareView locationShareView = (LocationShareView) aeut.f63869s;
            locationShareView.f79705f = this.f63894g;
            locationShareView.f79702c.setText(aeya.m52674a(locationShareView.getContext(), locationShare.f79628b));
            locationShareView.f79702c.setVisibility(0);
            locationShareView.f79704e.setVisibility(0);
            LocationShare locationShare2 = locationShareView.f79700a;
            locationShareView.f79700a = locationShare;
            if (locationShare2 == null || !locationShare2.equals(locationShare)) {
                if (!locationShareView.f79700a.mo43760f()) {
                    locationShareView.f79701b.setText(locationShareView.f79700a.mo43757d());
                } else if (locationShareView.f79700a.f79627a.mo43773b() == aetf.SHARE_APP) {
                    locationShareView.f79701b.setText(locationShareView.getResources().getString(C0126R.string.location_sharing_app_link_name, locationShareView.f79700a.mo43757d()));
                } else if (locationShareView.f79700a.f79627a.mo43773b() == aetf.CONTACT) {
                    locationShareView.f79701b.setText(locationShareView.getResources().getString(C0126R.string.location_sharing_contact_link_name, locationShareView.f79700a.mo43757d()));
                } else {
                    locationShareView.f79701b.setText(locationShareView.f79700a.mo43757d());
                }
                if (locationShareView.f79700a.mo43756c()) {
                    locationShareView.mo43804a(0);
                    locationShareView.f79703d.setBackgroundResource(0);
                    locationShareView.f79703d.setImageBitmap(aeti.m52533a(locationShareView.getContext()));
                    aeuw aeuw = locationShareView.f79706g;
                    if (aeuw != null) {
                        aeuw.cancel(true);
                    }
                    locationShareView.f79706g = new aeuw(locationShareView, locationShareView.getContext());
                    aeuw aeuw2 = locationShareView.f79706g;
                    String[] strArr = new String[1];
                    AudienceMember audienceMember = locationShareView.f79700a.f79627a.f79638a;
                    strArr[0] = audienceMember != null ? audienceMember.f30297g : null;
                    aeuw2.execute(strArr);
                } else if (locationShareView.f79700a.mo43760f()) {
                    if (locationShareView.f79700a.f79627a.mo43773b() == aetf.SHARE_APP) {
                        locationShareView.f79701b.setText(locationShareView.getResources().getString(C0126R.string.location_sharing_app_link_name, locationShareView.f79700a.mo43757d()));
                    } else if (locationShareView.f79700a.f79627a.mo43773b() == aetf.CONTACT) {
                        locationShareView.f79701b.setText(locationShareView.getResources().getString(C0126R.string.location_sharing_contact_link_name, locationShareView.f79700a.mo43757d()));
                    }
                    locationShareView.f79703d.setImageResource(C0126R.C0127drawable.quantum_ic_link_grey600_24);
                    locationShareView.f79703d.setBackgroundResource(C0126R.C0127drawable.location_sharing_link_background);
                    locationShareView.mo43804a(locationShareView.f79703d.getResources().getDimensionPixelSize(C0126R.dimen.location_sharing_appinvite_avatar_circle_padding));
                }
            }
            locationShareView.f79704e.setOnClickListener(new aeuu(locationShareView));
            if (!locationShareView.f79700a.mo43760f()) {
                i2 = C0126R.string.location_sharing_remove_share_description;
            } else {
                i2 = C0126R.string.location_sharing_remove_link_share_description;
            }
            locationShareView.f79704e.setContentDescription(locationShareView.getResources().getString(i2, locationShare.mo43757d()));
            locationShareView.setOnClickListener(new aeuv(locationShareView));
            if (cfaz.f183554a.mo6606a().mo80785h()) {
                locationShareView.setOnClickListener(null);
                locationShareView.setBackgroundDrawable(null);
            }
            if (locationShare.f79630d) {
                locationShareView.setOnClickListener(null);
                locationShareView.setBackgroundDrawable(null);
                if (locationShareView.f79705f == null) {
                    locationShareView.f79704e.setVisibility(8);
                } else {
                    locationShareView.f79704e.setImageResource(C0126R.C0127drawable.quantum_ic_help_outline_grey600_24);
                }
                if (locationShare.f79628b.mo43781c() != 1) {
                    locationShareView.f79702c.setVisibility(0);
                } else {
                    locationShareView.f79702c.setVisibility(8);
                }
            }
            aeut.mo34585b(locationShare.mo43761g());
        }
    }
}

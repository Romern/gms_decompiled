package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrg extends Fragment implements rjz, rka {

    /* renamed from: a */
    public rkb f77490a;

    /* renamed from: b */
    public ArrayList f77491b;

    /* renamed from: c */
    public ArrayList f77492c;

    /* renamed from: d */
    public boolean f77493d;

    /* renamed from: e */
    public boolean f77494e;

    /* renamed from: f */
    public Status f77495f;

    /* renamed from: g */
    public ArrayList f77496g;

    /* renamed from: h */
    public ArrayList f77497h;

    /* renamed from: i */
    private final anul f77498i = anuy.f77749a;

    /* renamed from: j */
    private String f77499j;

    /* renamed from: k */
    private String f77500k;

    /* renamed from: l */
    private String f77501l;

    /* renamed from: m */
    private String f77502m;

    /* renamed from: n */
    private String f77503n;

    /* renamed from: o */
    private final rkl f77504o = new anre(this);

    /* renamed from: a */
    private static final ArrayList m65044a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(((AudienceMember) arrayList.get(i)).f30294d);
        }
        return arrayList2;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f77493d) {
            this.f77493d = false;
            mo42152a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anrf)) {
            throw new IllegalStateException("Activity must implement UpdateCirclesFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.f77499j = arguments.getString("accountName");
        this.f77500k = arguments.getString("plusPageId");
        this.f77501l = arguments.getString("updatePersonId");
        this.f77491b = arguments.getParcelableArrayList("circleIdsToAdd");
        this.f77492c = arguments.getParcelableArrayList("circleIdsToRemove");
        this.f77502m = arguments.getString("callingPackageName");
        String string = arguments.getString("clientApplicationId");
        this.f77503n = string;
        if (this.f77490a == null) {
            int i = 0;
            if (!TextUtils.isEmpty(string)) {
                try {
                    i = Integer.parseInt(this.f77503n);
                } catch (NumberFormatException e) {
                }
            }
            rkb a = this.f77498i.mo42293a(getActivity().getApplicationContext(), i, this.f77502m);
            this.f77490a = a;
            a.mo24790a((rjz) this);
            this.f77490a.mo24791a((rka) this);
        }
        this.f77490a.mo24801e();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f77490a.mo24803g();
    }

    /* renamed from: b */
    public final void mo42153b() {
        anrf anrf = (anrf) getActivity();
        if (anrf != null) {
            anrf.mo42151a(this.f77495f, this.f77496g, this.f77497h);
        }
    }

    /* renamed from: a */
    public static ArrayList m65045a(ArrayList arrayList, List list) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        if (list != null) {
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) arrayList.get(i);
                if (list.contains(audienceMember.f30294d)) {
                    arrayList2.add(audienceMember);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo42152a() {
        this.f77494e = true;
        rjo rjo = allr.f73629a;
        amcp.m62616a(this.f77490a, this.f77499j, this.f77500k, this.f77501l, m65044a(this.f77491b), m65044a(this.f77492c), anlt.f77089a).mo9458a(this.f77504o);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f77493d || this.f77494e) {
            this.f77493d = true;
            this.f77490a.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f77495f = Status.f30109c;
        mo42153b();
    }
}

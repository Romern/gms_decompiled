package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: foo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foo extends Fragment {

    /* renamed from: d */
    private static boolean f17019d = false;

    /* renamed from: e */
    private static boolean f17020e = false;

    /* renamed from: a */
    public int f17021a;

    /* renamed from: b */
    public fpe f17022b;

    /* renamed from: c */
    boolean f17023c = false;

    /* renamed from: a */
    private final void m12088a(int i, Intent intent, int i2) {
        m12089a(i, intent, i2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo11069b() {
        if (!f17019d) {
            boolean z = true;
            f17019d = true;
            adyd a = adyd.m51363a(getActivity());
            int i = Build.VERSION.SDK_INT;
            if (a.mo33917a("com.google", getActivity().getPackageName()).length <= 0) {
                z = false;
            }
            f17020e = z;
        }
        return f17020e;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            this.f17023c = true;
        }
        this.f17021a = getArguments().getInt("ARG_NETWORK_TYPE");
        fpe fpe = new fpe(getActivity(), this.f17021a);
        this.f17022b = fpe;
        fpe.mo170a(true);
        mo11068a();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            getLoaderManager().initLoader(0, null, this.f17022b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.common_fragment_network_usage_view, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.content_recycler_view);
        fpe fpe = this.f17022b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setAdapter(fpe);
        return inflate;
    }

    /* renamed from: a */
    private final void m12089a(int i, Intent intent, int i2, int[] iArr) {
        int i3;
        if (this.f17022b != null) {
            fpc fpc = new fpc(getActivity(), i, this.f17021a, this.f17023c);
            if (intent == null || getActivity().getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == null) {
                fpc.f17067e = false;
            } else {
                fpc.f17065c = intent;
                fpc.f17067e = true;
            }
            if (iArr != null && (r8 = iArr.length) > 0) {
                for (int i4 : iArr) {
                    if (shq.m35308b(i4)) {
                        fpc.f17069g.add(Integer.valueOf(i4 & 268435200));
                    } else {
                        fpc.f17070h.add(Integer.valueOf(i4));
                    }
                }
            }
            fpc.f17066d = fpc.f17063a.getText(i2);
            fpe fpe = this.f17022b;
            Object obj = fpe.f17072a.get(Integer.valueOf(fpc.mo11089a()));
            fpe.f17072a.put(Integer.valueOf(fpc.mo11089a()), fpc);
            int a = fpc.mo11089a();
            C1245ok okVar = fpe.f17073d;
            Integer valueOf = Integer.valueOf(a);
            okVar.put(valueOf, valueOf);
            List list = fpc.f17069g;
            for (int i5 = 0; i5 < list.size(); i5++) {
                fpe.f17073d.put((Integer) list.get(i5), Integer.valueOf(a));
            }
            List list2 = fpc.f17070h;
            for (int i6 = 0; i6 < list2.size(); i6++) {
                fpe.f17073d.put((Integer) list2.get(i6), Integer.valueOf(a));
            }
            if (obj == null) {
                fpe.f17074e.add(Integer.valueOf(fpc.mo11089a()));
                i3 = fpe.f17074e.size() - 1;
            } else {
                i3 = fpe.f17074e.indexOf(Integer.valueOf(a));
            }
            if (fpe.mo11096e(a, i3)) {
                return;
            }
            if (obj != null) {
                fpe.mo158M(i3);
            } else {
                fpe.mo159N(i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo11068a() {
        m12088a(0, null, C0126R.string.common_miscellaneous_title);
        if (mo11069b()) {
            m12088a(9216, null, C0126R.string.common_plus_settings_title);
        }
        if (mo11069b()) {
            m12088a(3584, null, C0126R.string.common_games_settings_title);
        }
        if (mo11069b()) {
            m12088a(3328, null, C0126R.string.common_fitness_settings_title);
        }
        m12089a(1536, new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS"), C0126R.string.common_location_settings_title, new int[]{10240});
        if (mo11069b()) {
            m12088a(2816, fpv.m12148a(getActivity()), C0126R.string.core_data_management_title);
        }
        m12088a(2304, null, C0126R.string.common_cast_nearby_title);
        if (mo11069b()) {
            m12089a(5376, null, C0126R.string.common_contacts_title, new int[]{289669121, 289669122, 289669123, 289669124, 306446337, 306446338, 306446339, 306446340, 558104577, 558104578, 558104579, 558104580, 574881793, 574881794, 574881795, 574881796, 826540033, 826540034, 826540035, 826540036, 843317249, 843317250, 843317251, 843317252, 273154049, 273154050, 273154051, 541589505, 541589506, 541589507, 810024961, 810024962, 810024963, 1970300020});
        }
        m12089a(1033, null, C0126R.string.common_ota_title, new int[]{1970300020});
        m12088a(1792, null, C0126R.string.common_android_wear_title);
        m12088a(9728, spn.m35893h("com.google.android.gms.nearby.settings.NearbySettingsActivity"), C0126R.string.common_nearby_title);
    }
}
